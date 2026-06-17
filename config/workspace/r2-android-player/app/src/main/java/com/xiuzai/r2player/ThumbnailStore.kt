package com.xiuzai.r2player

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.media.MediaMetadataRetriever
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.File
import java.security.MessageDigest
import java.util.concurrent.TimeUnit

class ThumbnailStore(
    context: Context,
    private val repository: AListRepository,
    private val client: OkHttpClient = defaultClient,
) {
    private val cacheDir = File(context.cacheDir, "video-thumbnails").apply { mkdirs() }

    suspend fun load(entry: LibraryEntry): Bitmap? = withContext(Dispatchers.IO) {
        val cacheFile = File(cacheDir, "${sha256(entry.path)}.jpg")
        if (cacheFile.exists()) {
            BitmapFactory.decodeFile(cacheFile.absolutePath)?.let { return@withContext it }
        }

        val bitmap = entry.thumbnailUrl
            ?.let { fetchImage(it, repository.authorizationHeaderFor(it)) }
            ?: captureVideoFrame(entry)

        if (bitmap != null) {
            cacheFile.outputStream().use { out ->
                bitmap.compress(Bitmap.CompressFormat.JPEG, 84, out)
            }
        }

        bitmap
    }

    private fun fetchImage(url: String, headers: Map<String, String>): Bitmap? {
        val request = Request.Builder().url(url).apply {
            headers.forEach { (name, value) -> header(name, value) }
        }.build()

        return runCatching {
            client.newCall(request).execute().use { response ->
                if (!response.isSuccessful) return null
                val bytes = response.body?.bytes() ?: return null
                BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
            }
        }.getOrNull()
    }

    private suspend fun captureVideoFrame(entry: LibraryEntry): Bitmap? {
        val target = runCatching { repository.resolvePlayable(entry) }.getOrNull() ?: return null
        return runCatching {
            val retriever = MediaMetadataRetriever()
            try {
                retriever.setDataSource(target.url, target.headers)
                val durationMs = retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION)
                    ?.toLongOrNull()
                    ?: 0L
                val frameAtUs = when {
                    durationMs <= 0L -> 0L
                    durationMs < 10_000L -> 1_000_000L
                    else -> (durationMs * 100L).coerceAtMost(10_000_000L)
                }
                retriever.getFrameAtTime(frameAtUs, MediaMetadataRetriever.OPTION_CLOSEST_SYNC)
            } finally {
                retriever.release()
            }
        }.getOrNull()
    }

    private fun sha256(value: String): String {
        val digest = MessageDigest.getInstance("SHA-256").digest(value.toByteArray())
        return digest.joinToString("") { "%02x".format(it) }
    }

    companion object {
        private val defaultClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
            .followRedirects(true)
            .build()
    }
}
