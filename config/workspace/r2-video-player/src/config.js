const path = require("node:path");

function trimTrailingSlash(value) {
  return value.replace(/\/+$/, "");
}

function normalizeRootPath(value) {
  if (!value || value === "/") {
    return "/";
  }

  const normalized = value.startsWith("/") ? value : `/${value}`;
  return normalized.replace(/\/+$/, "");
}

function parseRootPaths(value, fallbackValue) {
  const rawList = (value || "")
    .split(",")
    .map((item) => normalizeRootPath(item.trim()))
    .filter(Boolean);

  if (rawList.length > 0) {
    return [...new Set(rawList)];
  }

  return [normalizeRootPath(fallbackValue || "/")];
}

const port = Number.parseInt(process.env.PORT || "3210", 10);
const alistRootPaths = parseRootPaths(process.env.ALIST_ROOT_PATHS, process.env.ALIST_ROOT_PATH);

module.exports = {
  appTitle: process.env.APP_TITLE || "秀仔视频库",
  port: Number.isNaN(port) ? 3210 : port,
  alistBaseUrl: trimTrailingSlash(process.env.ALIST_BASE_URL || ""),
  alistToken: process.env.ALIST_TOKEN || "",
  alistUsername: process.env.ALIST_USERNAME || "",
  alistPassword: process.env.ALIST_PASSWORD || "",
  alistRootPath: alistRootPaths[0],
  alistRootPaths,
  streamMode: process.env.STREAM_MODE === "redirect" ? "redirect" : "proxy",
  staticDir: path.join(__dirname, "public")
};
