package com.xiuzai.r2player

data class LibraryEntry(
    val name: String,
    val path: String,
    val isDirectory: Boolean,
    val size: Long,
    val modified: String,
    val thumbnailUrl: String?,
    val rawUrl: String? = null,
    val headers: Map<String, String> = emptyMap(),
) {
    val extension: String = name.substringAfterLast('.', "").lowercase()
    val playable: Boolean = !isDirectory && extension in videoExtensions
    val displaySize: String = formatBytes(size)
}

data class LibraryState(
    val rootPath: String,
    val currentPath: String,
    val title: String,
    val parentPath: String?,
    val breadcrumbs: List<PathCrumb>,
    val roots: List<PathRoot>,
    val entries: List<LibraryEntry>,
)

data class PathCrumb(
    val name: String,
    val path: String,
)

data class PathRoot(
    val name: String,
    val path: String,
)

data class PlayableTarget(
    val entry: LibraryEntry,
    val url: String,
    val headers: Map<String, String>,
)

private val videoExtensions = setOf(
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
    "wmv",
)

fun normalizePath(value: String): String = AppSettings.normalizePath(value)

fun joinPath(basePath: String, name: String): String {
    val base = normalizePath(basePath)
    return if (base == "/") "/$name" else "$base/$name"
}

fun parentPath(path: String, rootPath: String): String? {
    val normalized = normalizePath(path)
    val root = normalizePath(rootPath)
    if (normalized == root) return null
    val parent = normalized.split("/")
        .filter { it.isNotBlank() }
        .dropLast(1)
        .joinToString(prefix = "/", separator = "/")
        .ifBlank { "/" }
    return if (isInsideRoot(parent, root)) parent else root
}

fun isInsideRoot(targetPath: String, rootPath: String): Boolean {
    val target = normalizePath(targetPath)
    val root = normalizePath(rootPath)
    return root == "/" || target == root || target.startsWith("$root/")
}

fun displayName(path: String, rootPath: String): String {
    val normalized = normalizePath(path)
    val root = normalizePath(rootPath)
    if (normalized == root) return rootName(root)
    val relative = if (root == "/") normalized.trimStart('/') else normalized.removePrefix("$root/")
    return relative.ifBlank { rootName(root) }
}

fun rootName(path: String): String {
    val normalized = normalizePath(path)
    return if (normalized == "/") "全部视频" else normalized.substringAfterLast("/")
}

fun breadcrumbs(path: String, rootPath: String): List<PathCrumb> {
    val normalized = normalizePath(path)
    val root = normalizePath(rootPath)
    val result = mutableListOf(PathCrumb(rootName(root), root))
    if (normalized == root) return result

    val relative = if (root == "/") normalized.trimStart('/') else normalized.removePrefix("$root/")
    var running = if (root == "/") "" else root
    relative.split("/")
        .filter { it.isNotBlank() }
        .forEach { segment ->
            running = "$running/$segment".replace(Regex("/+"), "/")
            result += PathCrumb(segment, running.ifBlank { "/" })
        }
    return result
}

fun formatBytes(bytes: Long): String {
    if (bytes <= 0) return ""
    val units = listOf("B", "KB", "MB", "GB", "TB")
    var size = bytes.toDouble()
    var index = 0
    while (size >= 1024 && index < units.lastIndex) {
        size /= 1024
        index += 1
    }
    val rounded = if (size >= 10 || index == 0) "%.0f".format(size) else "%.1f".format(size)
    return "$rounded ${units[index]}"
}
