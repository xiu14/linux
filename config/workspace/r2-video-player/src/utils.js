const VIDEO_EXTENSIONS = new Set([
  "mp4",
  "m4v",
  "webm",
  "mov",
  "mkv",
  "avi",
  "ts",
  "m2ts",
  "m3u8",
  "flv",
  "wmv"
]);

function joinPath(basePath, name) {
  if (!name) {
    return basePath || "/";
  }

  if (!basePath || basePath === "/") {
    return `/${name}`.replace(/\/+/g, "/");
  }

  return `${basePath}/${name}`.replace(/\/+/g, "/");
}

function normalizeAbsolutePath(inputPath = "/") {
  if (!inputPath || inputPath === "/") {
    return "/";
  }

  const cleaned = inputPath.startsWith("/") ? inputPath : `/${inputPath}`;
  return cleaned.replace(/\/+/g, "/").replace(/\/$/, "") || "/";
}

function isPathInsideRoot(targetPath, rootPath) {
  const normalizedTarget = normalizeAbsolutePath(targetPath);
  const normalizedRoot = normalizeAbsolutePath(rootPath);

  if (normalizedRoot === "/") {
    return true;
  }

  return normalizedTarget === normalizedRoot || normalizedTarget.startsWith(`${normalizedRoot}/`);
}

function ensurePathInsideRoot(targetPath, rootPath) {
  const normalized = normalizeAbsolutePath(targetPath);

  if (!isPathInsideRoot(normalized, rootPath)) {
    const error = new Error("Requested path is outside the configured root");
    error.statusCode = 400;
    throw error;
  }

  return normalized;
}

function getParentPath(targetPath, rootPath) {
  const normalizedTarget = normalizeAbsolutePath(targetPath);
  const normalizedRoot = normalizeAbsolutePath(rootPath);

  if (normalizedTarget === normalizedRoot) {
    return null;
  }

  const segments = normalizedTarget.split("/").filter(Boolean);
  segments.pop();

  const parent = `/${segments.join("/")}` || "/";
  return isPathInsideRoot(parent, normalizedRoot) ? parent : normalizedRoot;
}

function getDisplayName(fullPath, rootPath) {
  const normalizedPath = normalizeAbsolutePath(fullPath);
  const normalizedRoot = normalizeAbsolutePath(rootPath);

  if (normalizedPath === normalizedRoot) {
    return "全部视频";
  }

  const relative = normalizedRoot === "/"
    ? normalizedPath.slice(1)
    : normalizedPath.slice(normalizedRoot.length + 1);

  return relative || "全部视频";
}

function getExtension(name = "") {
  const parts = name.toLowerCase().split(".");
  return parts.length > 1 ? parts.pop() : "";
}

function isVideoFile(name = "") {
  return VIDEO_EXTENSIONS.has(getExtension(name));
}

function formatBytes(bytes) {
  if (!Number.isFinite(bytes) || bytes <= 0) {
    return "";
  }

  const units = ["B", "KB", "MB", "GB", "TB"];
  let size = bytes;
  let unitIndex = 0;

  while (size >= 1024 && unitIndex < units.length - 1) {
    size /= 1024;
    unitIndex += 1;
  }

  const rounded = size >= 10 || unitIndex === 0 ? Math.round(size) : size.toFixed(1);
  return `${rounded} ${units[unitIndex]}`;
}

function sortLibraryItems(items) {
  return [...items].sort((left, right) => {
    if (left.isDir !== right.isDir) {
      return left.isDir ? -1 : 1;
    }

    return left.name.localeCompare(right.name, "zh-Hans-CN", {
      numeric: true,
      sensitivity: "base"
    });
  });
}

function parseProviderHeaders(value) {
  if (!value) {
    return {};
  }

  if (typeof value === "object" && !Array.isArray(value)) {
    return value;
  }

  try {
    const parsed = JSON.parse(value);
    return parsed && typeof parsed === "object" ? parsed : {};
  } catch {
    return {};
  }
}

function buildCrumbs(currentPath, rootPath) {
  const normalizedCurrent = normalizeAbsolutePath(currentPath);
  const normalizedRoot = normalizeAbsolutePath(rootPath);
  const crumbs = [{ name: "全部视频", path: normalizedRoot }];

  if (normalizedCurrent === normalizedRoot) {
    return crumbs;
  }

  const relative = normalizedRoot === "/"
    ? normalizedCurrent.slice(1)
    : normalizedCurrent.slice(normalizedRoot.length + 1);

  const segments = relative.split("/").filter(Boolean);
  let runningPath = normalizedRoot === "/" ? "" : normalizedRoot;

  for (const segment of segments) {
    runningPath = `${runningPath}/${segment}`.replace(/\/+/g, "/");
    crumbs.push({ name: segment, path: runningPath || "/" });
  }

  return crumbs;
}

module.exports = {
  buildCrumbs,
  ensurePathInsideRoot,
  formatBytes,
  getDisplayName,
  getExtension,
  getParentPath,
  isPathInsideRoot,
  isVideoFile,
  joinPath,
  normalizeAbsolutePath,
  parseProviderHeaders,
  sortLibraryItems
};
