require("dotenv").config();

const express = require("express");
const { Readable } = require("node:stream");

const config = require("./config");
const { AListClient } = require("./alist-client");
const {
  buildCrumbs,
  ensurePathInsideRoot,
  formatBytes,
  getDisplayName,
  getExtension,
  getParentPath,
  isVideoFile,
  joinPath,
  parseProviderHeaders,
  sortLibraryItems
} = require("./utils");

const app = express();
const client = new AListClient(config);
const configuredRoots = config.alistRootPaths.map((rootPath) => ({
  path: rootPath,
  name: rootPath === "/" ? "全部视频" : rootPath.split("/").filter(Boolean).pop() || "全部视频"
}));

app.disable("x-powered-by");
app.use(express.static(config.staticDir, { extensions: ["html"] }));

function mapLibraryItem(entry, currentPath) {
  const fullPath = joinPath(currentPath, entry.name);
  const extension = entry.is_dir ? "" : getExtension(entry.name);

  return {
    name: entry.name,
    path: fullPath,
    isDir: entry.is_dir,
    modified: entry.modified || "",
    size: entry.size || 0,
    sizeText: formatBytes(entry.size || 0),
    extension,
    playable: !entry.is_dir && isVideoFile(entry.name),
    thumbnailUrl: entry.thumb ? `/api/thumbnail?src=${encodeURIComponent(entry.thumb)}` : "",
    fallbackLabel: extension ? extension.toUpperCase() : "VIDEO"
  };
}

function copyUpstreamHeaders(source, target) {
  const allowedHeaders = [
    "accept-ranges",
    "cache-control",
    "content-length",
    "content-range",
    "content-type",
    "etag",
    "expires",
    "last-modified"
  ];

  for (const headerName of allowedHeaders) {
    const value = source.headers.get(headerName);
    if (value) {
      target.setHeader(headerName, value);
    }
  }
}

async function buildLibraryResponse(requestPath) {
  const resolvedPath = String(requestPath || config.alistRootPath);
  const matchedRoot = config.alistRootPaths.find((rootPath) => {
    try {
      ensurePathInsideRoot(resolvedPath, rootPath);
      return true;
    } catch {
      return false;
    }
  });

  if (!matchedRoot) {
    const error = new Error("Requested path is outside the configured roots");
    error.statusCode = 400;
    throw error;
  }

  const safePath = ensurePathInsideRoot(resolvedPath, matchedRoot);
  const directory = await client.list(safePath);
  const items = sortLibraryItems(
    (directory.content || [])
      .filter((entry) => entry.is_dir || isVideoFile(entry.name))
      .map((entry) => mapLibraryItem(entry, safePath))
  );

  return {
    title: safePath === matchedRoot
      ? configuredRoots.find((root) => root.path === matchedRoot)?.name || getDisplayName(safePath, matchedRoot)
      : getDisplayName(safePath, matchedRoot),
    currentRoot: matchedRoot,
    currentPath: safePath,
    parentPath: getParentPath(safePath, matchedRoot),
    breadcrumbs: buildCrumbs(safePath, matchedRoot),
    roots: configuredRoots,
    items
  };
}

async function resolvePlayableTarget(requestPath) {
  const matchedRoot = config.alistRootPaths.find((rootPath) => {
    try {
      ensurePathInsideRoot(requestPath, rootPath);
      return true;
    } catch {
      return false;
    }
  });

  if (!matchedRoot) {
    const error = new Error("Requested path is outside the configured roots");
    error.statusCode = 400;
    throw error;
  }

  const safePath = ensurePathInsideRoot(requestPath, matchedRoot);
  const metadata = await client.get(safePath);

  if (metadata.is_dir) {
    const error = new Error("Requested path is a directory, not a video file.");
    error.statusCode = 400;
    throw error;
  }

  const providerHeaders = parseProviderHeaders(metadata.header);

  return {
    safePath,
    metadata,
    providerHeaders,
    targetUrl: client.resolveUrl(metadata.raw_url)
  };
}

function buildPlaceholderSvg(label) {
  const text = String(label || "VIDEO").slice(0, 12);
  return `<?xml version="1.0" encoding="UTF-8"?>
<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 480 270">
  <defs>
    <linearGradient id="g" x1="0%" y1="0%" x2="100%" y2="100%">
      <stop offset="0%" stop-color="#0f172a"/>
      <stop offset="100%" stop-color="#2563eb"/>
    </linearGradient>
  </defs>
  <rect width="480" height="270" fill="url(#g)"/>
  <circle cx="392" cy="78" r="56" fill="rgba(255,255,255,0.12)"/>
  <circle cx="122" cy="224" r="92" fill="rgba(255,255,255,0.08)"/>
  <path d="M214 101l84 34-84 34z" fill="#ffffff" opacity="0.92"/>
  <text x="34" y="226" fill="#ffffff" font-family="Arial, sans-serif" font-size="42" font-weight="700">${text}</text>
</svg>`;
}

app.get("/api/config", (req, res) => {
  res.json({
    title: config.appTitle,
    rootPath: config.alistRootPath,
    roots: configuredRoots,
    streamMode: config.streamMode
  });
});

app.get("/api/library", async (req, res, next) => {
  try {
    const library = await buildLibraryResponse(String(req.query.path || config.alistRootPath));
    res.json(library);
  } catch (error) {
    next(error);
  }
});

app.get("/api/thumbnail", async (req, res, next) => {
  const src = String(req.query.src || "");

  if (!src) {
    res.type("image/svg+xml").send(buildPlaceholderSvg("VIDEO"));
    return;
  }

  try {
    const requestHeaders = {};
    const resolvedUrl = client.resolveUrl(src);
    const alistOrigin = new URL(config.alistBaseUrl).origin;

    if (new URL(resolvedUrl).origin === alistOrigin) {
      requestHeaders.Authorization = await client.getToken();
    }

    const upstream = await fetch(resolvedUrl, { headers: requestHeaders });

    if (!upstream.ok) {
      throw new Error(`Thumbnail request failed with status ${upstream.status}`);
    }

    copyUpstreamHeaders(upstream, res);
    res.status(upstream.status);
    Readable.fromWeb(upstream.body).pipe(res);
  } catch (error) {
    res.type("image/svg+xml").send(buildPlaceholderSvg("VIDEO"));
  }
});

app.get("/api/video", async (req, res, next) => {
  try {
    const requestedPath = String(req.query.path || "");
    const { targetUrl, providerHeaders } = await resolvePlayableTarget(requestedPath);

    if (config.streamMode === "redirect") {
      res.redirect(targetUrl);
      return;
    }

    const headers = {
      ...providerHeaders
    };

    if (req.headers.range) {
      headers.Range = req.headers.range;
    }

    if (req.headers["user-agent"]) {
      headers["User-Agent"] = req.headers["user-agent"];
    }

    const upstream = await fetch(targetUrl, {
      headers,
      redirect: "follow"
    });

    if (!upstream.ok && upstream.status !== 206) {
      const error = new Error(`Video upstream failed with status ${upstream.status}`);
      error.statusCode = upstream.status;
      throw error;
    }

    copyUpstreamHeaders(upstream, res);
    res.status(upstream.status);

    if (!upstream.body) {
      res.end();
      return;
    }

    Readable.fromWeb(upstream.body).pipe(res);
  } catch (error) {
    next(error);
  }
});

app.get("*", (req, res) => {
  res.sendFile(`${config.staticDir}/index.html`);
});

app.use((error, req, res, next) => {
  const statusCode = error.statusCode && Number.isInteger(error.statusCode)
    ? error.statusCode
    : 500;

  const message = statusCode >= 500
    ? error.message || "Server error"
    : error.message || "Request failed";

  if (statusCode >= 500) {
    console.error(error);
  }

  res.status(statusCode).json({
    error: message
  });
});

app.listen(config.port, () => {
  console.log(`r2-video-player listening on http://0.0.0.0:${config.port}`);
});
