package com.xiuzai.r2player

import android.content.Context

object AppSettings {
    private const val PREFS = "r2_player_settings"
    private const val KEY_APP_TITLE = "app_title"
    private const val KEY_ALIST_BASE_URL = "alist_base_url"
    private const val KEY_ALIST_TOKEN = "alist_token"
    private const val KEY_ALIST_USERNAME = "alist_username"
    private const val KEY_ALIST_PASSWORD = "alist_password"
    private const val KEY_ALIST_ROOT_PATHS = "alist_root_paths"

    fun load(context: Context): R2Config {
        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        return R2Config(
            appTitle = prefs.getString(KEY_APP_TITLE, null)?.takeIf { it.isNotBlank() }
                ?: BuildConfig.R2_APP_TITLE,
            alistBaseUrl = normalizeBaseUrl(
                prefs.getString(KEY_ALIST_BASE_URL, null)?.takeIf { it.isNotBlank() }
                    ?: BuildConfig.ALIST_BASE_URL,
            ),
            alistToken = prefs.getString(KEY_ALIST_TOKEN, null) ?: BuildConfig.ALIST_TOKEN,
            alistUsername = prefs.getString(KEY_ALIST_USERNAME, null) ?: BuildConfig.ALIST_USERNAME,
            alistPassword = prefs.getString(KEY_ALIST_PASSWORD, null) ?: BuildConfig.ALIST_PASSWORD,
            rootPaths = parseRootPaths(
                prefs.getString(KEY_ALIST_ROOT_PATHS, null)?.takeIf { it.isNotBlank() }
                    ?: BuildConfig.ALIST_ROOT_PATHS,
            ),
        )
    }

    fun save(context: Context, config: R2Config) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_APP_TITLE, config.appTitle)
            .putString(KEY_ALIST_BASE_URL, normalizeBaseUrl(config.alistBaseUrl))
            .putString(KEY_ALIST_TOKEN, config.alistToken)
            .putString(KEY_ALIST_USERNAME, config.alistUsername)
            .putString(KEY_ALIST_PASSWORD, config.alistPassword)
            .putString(KEY_ALIST_ROOT_PATHS, config.rootPaths.joinToString(","))
            .apply()
    }

    fun isWakeLockEnabled(context: Context): Boolean = true

    fun normalizeBaseUrl(value: String): String {
        val trimmed = value.trim().trimEnd('/')
        if (trimmed.isBlank()) return ""
        return if (trimmed.contains("://")) trimmed else "https://$trimmed"
    }

    fun parseRootPaths(value: String): List<String> {
        val roots = value.split(",")
            .map { normalizePath(it) }
            .filter { it.isNotBlank() }
            .distinct()
        return roots.ifEmpty { listOf("/") }
    }

    fun normalizePath(value: String): String {
        val trimmed = value.trim()
        if (trimmed.isBlank() || trimmed == "/") return "/"
        return "/${trimmed.trim('/')}"
    }
}

data class R2Config(
    val appTitle: String,
    val alistBaseUrl: String,
    val alistToken: String,
    val alistUsername: String,
    val alistPassword: String,
    val rootPaths: List<String>,
)
