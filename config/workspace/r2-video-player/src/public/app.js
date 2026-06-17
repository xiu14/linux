const state = {
  appConfig: null,
  library: null,
  currentVideoPath: "",
  loading: false,
  thumbnailPromises: new Map(),
  thumbnailUrls: new Map()
};

const elements = {
  appTitle: document.querySelector("#appTitle"),
  breadcrumbs: document.querySelector("#breadcrumbs"),
  emptyState: document.querySelector("#emptyState"),
  folderTitle: document.querySelector("#folderTitle"),
  fullscreenButton: document.querySelector("#fullscreenButton"),
  libraryList: document.querySelector("#libraryList"),
  overlayBackwardButton: document.querySelector("#overlayBackwardButton"),
  overlayControls: document.querySelector("#overlayControls"),
  overlayForwardButton: document.querySelector("#overlayForwardButton"),
  overlayNextButton: document.querySelector("#overlayNextButton"),
  playPauseButton: document.querySelector("#playPauseButton"),
  refreshButton: document.querySelector("#refreshButton"),
  rootTabs: document.querySelector("#rootTabs"),
  statusText: document.querySelector("#statusText"),
  upButton: document.querySelector("#upButton"),
  videoDetail: document.querySelector("#videoDetail"),
  videoPlayer: document.querySelector("#videoPlayer"),
  videoWrap: document.querySelector("#videoWrap"),
  videoTitle: document.querySelector("#videoTitle"),
  itemTemplate: document.querySelector("#itemTemplate")
};

function safeText(value, fallback = "") {
  return value || fallback;
}

async function fetchJson(url) {
  const response = await fetch(url);
  const payload = await response.json().catch(() => ({}));

  if (!response.ok) {
    throw new Error(payload.error || "请求失败");
  }

  return payload;
}

function setStatus(message, isError = false) {
  elements.statusText.textContent = message;
  elements.statusText.style.color = isError ? "var(--danger)" : "";
}

function updateVideoUi(item) {
  if (!item) {
    elements.videoPlayer.removeAttribute("src");
    elements.videoPlayer.load();
    elements.videoTitle.textContent = "未选择视频";
    elements.videoDetail.textContent = "支持手机播放、滑动进度和全屏。";
    elements.emptyState.classList.remove("hidden");
    elements.overlayControls.classList.add("hidden");
    syncActionButtons();
    return;
  }

  const params = new URLSearchParams({ path: item.path });
  elements.videoPlayer.src = `/api/video?${params.toString()}`;
  elements.videoTitle.textContent = item.name;
  elements.videoDetail.textContent = [item.sizeText, item.modified].filter(Boolean).join(" · ") || "准备播放";
  elements.emptyState.classList.add("hidden");
  elements.overlayControls.classList.remove("hidden");
  syncActionButtons();
  updatePlayPauseButton();
  elements.videoPlayer.play().catch(() => {});
}

function playItem(item) {
  if (!item || item.isDir) {
    return;
  }

  state.currentVideoPath = item.path;
  updateVideoUi(item);
  renderLibrary();
}

function renderBreadcrumbs() {
  elements.breadcrumbs.replaceChildren();

  for (const crumb of state.library?.breadcrumbs || []) {
    const button = document.createElement("button");
    button.type = "button";
    button.textContent = crumb.name;
    button.className = crumb.path === state.library.currentPath ? "current" : "";
    button.addEventListener("click", () => loadLibrary(crumb.path));
    elements.breadcrumbs.append(button);
  }
}

function renderRootTabs() {
  elements.rootTabs.replaceChildren();

  for (const root of state.appConfig?.roots || []) {
    const button = document.createElement("button");
    button.type = "button";
    button.textContent = root.name;
    button.className = root.path === state.library?.currentRoot ? "active" : "";
    button.addEventListener("click", () => loadLibrary(root.path));
    elements.rootTabs.append(button);
  }
}

function renderLibrary() {
  elements.libraryList.replaceChildren();
  elements.folderTitle.textContent = state.library?.title || "全部视频";
  elements.upButton.disabled = !state.library?.parentPath;
  renderRootTabs();
  renderBreadcrumbs();

  const items = state.library?.items || [];

  if (!items.length) {
    const empty = document.createElement("p");
    empty.className = "status-text";
    empty.textContent = "这个目录里还没有视频文件。";
    elements.libraryList.append(empty);
    return;
  }

  for (const item of items) {
    const node = elements.itemTemplate.content.firstElementChild.cloneNode(true);
    const image = node.querySelector(".thumb-image");
    const fallback = node.querySelector(".thumb-fallback");
    const name = node.querySelector(".item-name");
    const subtitle = node.querySelector(".item-subtitle");
    const tag = node.querySelector(".item-tag");

    name.textContent = item.name;
    tag.textContent = item.isDir ? "目录" : item.extension?.toUpperCase() || "VIDEO";
    subtitle.textContent = item.isDir
      ? "打开目录"
      : [item.sizeText, item.modified].filter(Boolean).join(" · ") || "点击播放";

    fallback.textContent = item.isDir ? "DIR" : item.fallbackLabel;

    if (item.thumbnailUrl) {
      image.src = item.thumbnailUrl;
      image.alt = `${item.name} 缩略图`;
      image.addEventListener("error", () => image.classList.add("is-empty"), { once: true });
      image.addEventListener("load", () => image.classList.remove("is-empty"), { once: true });
    } else if (!item.isDir) {
      image.classList.add("is-empty");
      image.alt = `${item.name} 缩略图`;
      loadVideoThumbnail(item, image);
    } else {
      image.classList.add("is-empty");
    }

    if (!item.isDir && item.path === state.currentVideoPath) {
      node.classList.add("active");
    }

    node.addEventListener("click", () => {
      if (item.isDir) {
        loadLibrary(item.path);
        return;
      }

      playItem(item);
    });

    elements.libraryList.append(node);
  }
}

function findCurrentVideo() {
  return (state.library?.items || []).find((item) => !item.isDir && item.path === state.currentVideoPath) || null;
}

function getPlayableItems() {
  return (state.library?.items || []).filter((item) => !item.isDir);
}

function getCurrentVideoIndex() {
  return getPlayableItems().findIndex((item) => item.path === state.currentVideoPath);
}

function syncActionButtons() {
  const hasCurrentVideo = Boolean(findCurrentVideo());
  const currentIndex = getCurrentVideoIndex();
  const playableItems = getPlayableItems();
  const canGoNext = hasCurrentVideo && currentIndex >= 0 && currentIndex < playableItems.length - 1;

  elements.playPauseButton.disabled = !hasCurrentVideo;
  elements.overlayBackwardButton.disabled = !hasCurrentVideo;
  elements.overlayForwardButton.disabled = !hasCurrentVideo;
  elements.overlayNextButton.disabled = !canGoNext;
}

function updatePlayPauseButton() {
  const hasCurrentVideo = Boolean(findCurrentVideo());

  if (!hasCurrentVideo) {
    elements.playPauseButton.textContent = "暂停";
    elements.playPauseButton.disabled = true;
    return;
  }

  elements.playPauseButton.disabled = false;
  elements.playPauseButton.textContent = elements.videoPlayer.paused ? "继续播放" : "暂停";
}

function playNextVideo() {
  const playableItems = getPlayableItems();
  const currentIndex = getCurrentVideoIndex();

  if (currentIndex < 0 || currentIndex >= playableItems.length - 1) {
    syncActionButtons();
    return;
  }

  playItem(playableItems[currentIndex + 1]);
}

async function toggleFullscreen() {
  if (document.fullscreenElement === elements.videoWrap) {
    if (document.exitFullscreen) {
      await document.exitFullscreen();
    }
    return;
  }

  if (elements.videoWrap.requestFullscreen) {
    await elements.videoWrap.requestFullscreen();
    return;
  }

  if (elements.videoPlayer.webkitEnterFullscreen) {
    elements.videoPlayer.webkitEnterFullscreen();
  }
}

function updateFullscreenButtonLabel() {
  elements.fullscreenButton.textContent = document.fullscreenElement === elements.videoWrap
    ? "退出全屏"
    : "全屏";
}

function togglePlayPause() {
  if (!findCurrentVideo()) {
    return;
  }

  if (elements.videoPlayer.paused) {
    elements.videoPlayer.play().catch(() => {});
    return;
  }

  elements.videoPlayer.pause();
}

function createThumbnailCapture(path) {
  const video = document.createElement("video");
  video.preload = "auto";
  video.muted = true;
  video.playsInline = true;
  video.src = `/api/video?${new URLSearchParams({ path }).toString()}`;

  return new Promise((resolve, reject) => {
    const cleanup = () => {
      video.pause();
      video.removeAttribute("src");
      video.load();
    };

    const fail = () => {
      cleanup();
      reject(new Error("thumbnail generation failed"));
    };

    const drawFrame = () => {
      if (!video.videoWidth || !video.videoHeight) {
        fail();
        return;
      }

      const canvas = document.createElement("canvas");
      canvas.width = video.videoWidth;
      canvas.height = video.videoHeight;
      const context = canvas.getContext("2d");

      if (!context) {
        fail();
        return;
      }

      context.drawImage(video, 0, 0, canvas.width, canvas.height);
      const dataUrl = canvas.toDataURL("image/jpeg", 0.82);
      cleanup();
      resolve(dataUrl);
    };

    let hasSeeked = false;

    video.addEventListener("loadeddata", () => {
      const seekTarget = Number.isFinite(video.duration) && video.duration > 1
        ? Math.min(1, Math.max(video.duration / 10, 0.15))
        : 0;

      if (seekTarget <= 0) {
        drawFrame();
        return;
      }

      hasSeeked = true;
      video.currentTime = seekTarget;
    }, { once: true });

    video.addEventListener("seeked", () => {
      drawFrame();
    }, { once: true });

    video.addEventListener("error", fail, { once: true });
    window.setTimeout(() => {
      if (!hasSeeked && video.readyState < 2) {
        fail();
      }
    }, 8000);
  });
}

async function loadVideoThumbnail(item, imageElement) {
  if (state.thumbnailUrls.has(item.path)) {
    imageElement.src = state.thumbnailUrls.get(item.path);
    imageElement.classList.remove("is-empty");
    return;
  }

  if (!state.thumbnailPromises.has(item.path)) {
    state.thumbnailPromises.set(item.path, createThumbnailCapture(item.path)
      .then((dataUrl) => {
        state.thumbnailUrls.set(item.path, dataUrl);
        return dataUrl;
      })
      .finally(() => {
        state.thumbnailPromises.delete(item.path);
      }));
  }

  try {
    const dataUrl = await state.thumbnailPromises.get(item.path);
    imageElement.src = dataUrl;
    imageElement.classList.remove("is-empty");
  } catch {
    imageElement.classList.add("is-empty");
  }
}

async function loadLibrary(path) {
  state.loading = true;
  setStatus("正在加载列表...");

  try {
    const params = new URLSearchParams({ path });
    state.library = await fetchJson(`/api/library?${params.toString()}`);

    const firstVideo = (state.library.items || []).find((item) => !item.isDir) || null;
    if (!findCurrentVideo() && firstVideo) {
      state.currentVideoPath = firstVideo.path;
    }

    renderLibrary();

    const currentVideo = findCurrentVideo();
    if (currentVideo) {
      updateVideoUi(currentVideo);
    } else if (!(state.library.items || []).some((item) => !item.isDir)) {
      updateVideoUi(null);
    }

    setStatus(`已加载 ${state.library.items.length} 项`);
  } catch (error) {
    setStatus(error.message || "加载失败", true);
  } finally {
    state.loading = false;
  }
}

async function bootstrap() {
  try {
    state.appConfig = await fetchJson("/api/config");
    document.title = state.appConfig.title;
    elements.appTitle.textContent = state.appConfig.title;
    await loadLibrary(state.appConfig.rootPath);
  } catch (error) {
    setStatus(error.message || "初始化失败", true);
  }
}

function seekBy(seconds) {
  if (!elements.videoPlayer.duration || Number.isNaN(elements.videoPlayer.currentTime)) {
    return;
  }

  const nextTime = Math.min(
    Math.max(elements.videoPlayer.currentTime + seconds, 0),
    elements.videoPlayer.duration
  );
  elements.videoPlayer.currentTime = nextTime;
}

elements.playPauseButton.addEventListener("click", togglePlayPause);
elements.overlayBackwardButton.addEventListener("click", () => seekBy(-10));
elements.overlayForwardButton.addEventListener("click", () => seekBy(10));
elements.overlayNextButton.addEventListener("click", playNextVideo);
elements.fullscreenButton.addEventListener("click", () => {
  toggleFullscreen().catch(() => {});
});
elements.refreshButton.addEventListener("click", () => {
  loadLibrary(state.library?.currentPath || state.appConfig?.rootPath || "/");
});
elements.upButton.addEventListener("click", () => {
  if (state.library?.parentPath) {
    loadLibrary(state.library.parentPath);
  }
});
document.addEventListener("fullscreenchange", updateFullscreenButtonLabel);
elements.videoPlayer.addEventListener("ended", playNextVideo);
elements.videoPlayer.addEventListener("play", updatePlayPauseButton);
elements.videoPlayer.addEventListener("pause", updatePlayPauseButton);
elements.videoPlayer.addEventListener("loadedmetadata", updatePlayPauseButton);

bootstrap();
