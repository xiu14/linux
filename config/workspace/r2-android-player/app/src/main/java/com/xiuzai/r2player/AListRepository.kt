package com.xiuzai.r2player

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import java.net.URI
import java.util.concurrent.TimeUnit

class AListRepository(
    private val config: R2Config,
    private val client: OkHttpClient = defaultClient,
) {
    private var tokenCache: String? = null
    private var tokenFetchedAt: Long = 0L
    private val directoryCache = mutableMapOf<String, Pair<Long, List<LibraryEntry>>>()
    private val fileCache = mutableMapOf<String, Pair<Long, PlayableTarget>>()

    val roots: List<PathRoot> = config.rootPaths.map { PathRoot(rootName(it), normalizePath(it)) }

    suspend fun list(path: String): LibraryState = withContext(Dispatchers.IO) {
        ensureConfigured()
        val root = roots.firstOrNull { isInsideRoot(path, it.path) }?.path
            ?: throw IllegalArgumentException("路径不在配置的根目录中")
        val safePath = normalizePath(path)
        val entries = loadDirectory(safePath)
        LibraryState(
            rootPath = root,
            currentPath = safePath,
            title = displayName(safePath, root),
            parentPath = parentPath(safePath, root),
            breadcrumbs = breadcrumbs(safePath, root),
            roots = roots,
            entries = entries,
        )
    }

    suspend fun resolvePlayable(entry: LibraryEntry): PlayableTarget = withContext(Dispatchers.IO) {
        fileCache[entry.path]?.takeIf { isFresh(it.first) }?.second ?: run {
            val payload = request(
                endpoint = "/api/fs/get",
                body = JSONObject()
                    .put("path", entry.path)
                    .put("password", "")
                    .put("page", 1)
                    .put("per_page", 0)
                    .put("refresh", false),
            )
            val data = payload.getJSONObject("data")
            if (data.optBoolean("is_dir")) {
                throw IllegalArgumentException("这是目录，不是视频文件")
            }
            val target = PlayableTarget(
                entry = entry,
                url = resolveUrl(data.optString("raw_url")),
                headers = parseHeaders(data.opt("header")),
            )
            fileCache[entry.path] = System.currentTimeMillis() to target
            target
        }
    }

    fun resolveUrl(url: String): String {
        if (url.isBlank()) return url
        return runCatching { URI(config.alistBaseUrl).resolve(url).toString() }.getOrDefault(url)
    }

    suspend fun authorizationHeaderFor(url: String): Map<String, String> = withContext(Dispatchers.IO) {
        val sameOrigin = runCatching {
            val base = URI(config.alistBaseUrl)
            val target = URI(resolveUrl(url))
            base.scheme == target.scheme && base.host == target.host && base.port == target.port
        }.getOrDefault(false)
        if (sameOrigin) mapOf("Authorization" to getToken()) else emptyMap()
    }

    private suspend fun loadDirectory(path: String): List<LibraryEntry> {
        directoryCache[path]?.takeIf { isFresh(it.first) }?.second?.let { return it }
        val payload = request(
            endpoint = "/api/fs/list",
            body = JSONObject()
                .put("path", path)
                .put("password", "")
                .put("page", 1)
                .put("per_page", 0)
                .put("refresh", false),
        )
        val content = payload.getJSONObject("data").optJSONArray("content")
        val entries = buildList {
            if (content == null) return@buildList
            for (index in 0 until content.length()) {
                val item = content.getJSONObject(index)
                val entry = LibraryEntry(
                    name = item.optString("name"),
                    path = joinPath(path, item.optString("name")),
                    isDirectory = item.optBoolean("is_dir"),
                    size = item.optLong("size"),
                    modified = item.optString("modified"),
                    thumbnailUrl = item.optString("thumb").takeIf { it.isNotBlank() }?.let(::resolveUrl),
                )
                if (entry.isDirectory || entry.playable) add(entry)
            }
        }.sortedWith(
            compareByDescending<LibraryEntry> { it.isDirectory }
                .thenBy(String.CASE_INSENSITIVE_ORDER) { it.name },
        )
        directoryCache[path] = System.currentTimeMillis() to entries
        return entries
    }

    private suspend fun request(
        endpoint: String,
        body: JSONObject? = null,
        withAuth: Boolean = true,
    ): JSONObject {
        val requestBuilder = Request.Builder()
            .url("${config.alistBaseUrl}$endpoint")
            .header("Accept", "application/json")

        if (withAuth) {
            requestBuilder.header("Authorization", getToken())
        }

        if (body != null) {
            requestBuilder.post(body.toString().toRequestBody(jsonMediaType))
        }

        client.newCall(requestBuilder.build()).execute().use { response ->
            val text = response.body?.string().orEmpty()
            val payload = runCatching { JSONObject(text) }.getOrElse { JSONObject() }
            val code = payload.optInt("code", if (response.isSuccessful) 200 else response.code)
            if (!response.isSuccessful || code >= 400) {
                val message = payload.optString("message")
                    .takeIf { it.isNotBlank() }
                    ?: "AList 请求失败: ${response.code}"
                throw IllegalStateException(message)
            }
            return payload
        }
    }

    private suspend fun getToken(): String {
        if (config.alistToken.isNotBlank()) return config.alistToken

        val cached = tokenCache
        if (!cached.isNullOrBlank() && System.currentTimeMillis() - tokenFetchedAt < tokenTtlMs) {
            return cached
        }

        if (config.alistUsername.isBlank() || config.alistPassword.isBlank()) {
            throw IllegalStateException("缺少 AList Token 或账号密码")
        }

        val payload = request(
            endpoint = "/api/auth/login",
            body = JSONObject()
                .put("username", config.alistUsername)
                .put("password", config.alistPassword),
            withAuth = false,
        )
        val token = payload.getJSONObject("data").getString("token")
        tokenCache = token
        tokenFetchedAt = System.currentTimeMillis()
        return token
    }

    private fun ensureConfigured() {
        if (config.alistBaseUrl.isBlank()) {
            throw IllegalStateException("还没有配置 AList 地址")
        }
    }

    private fun isFresh(timestamp: Long): Boolean = System.currentTimeMillis() - timestamp < cacheTtlMs

    private fun parseHeaders(value: Any?): Map<String, String> {
        if (value == null) return emptyMap()
        val json = when (value) {
            is JSONObject -> value
            is String -> runCatching { JSONObject(value) }.getOrNull()
            else -> null
        } ?: return emptyMap()

        return buildMap {
            val keys = json.keys()
            while (keys.hasNext()) {
                val key = keys.next()
                val headerValue = json.optString(key)
                if (key.isNotBlank() && headerValue.isNotBlank()) put(key, headerValue)
            }
        }
    }

    companion object {
        private const val cacheTtlMs = 30 * 60 * 1000L
        private const val tokenTtlMs = 47 * 60 * 60 * 1000L
        private val jsonMediaType = "application/json; charset=utf-8".toMediaType()
        private val defaultClient = OkHttpClient.Builder()
            .connectTimeout(20, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .followRedirects(true)
            .build()
    }
}
