package com.stshell.app

import android.content.Context
import android.net.Uri

object AppSettings {
    private const val SETTINGS_PREFS = "tavern_settings"
    private const val KEY_SERVER_URL = "server_url"
    private const val KEY_WAKE_LOCK_ENABLED = "wake_lock_enabled"
    private const val KEY_COMPLETION_SOUND_ENABLED = "completion_sound_enabled"
    private const val KEY_COMPLETION_MEDIA_SOUND_ENABLED = "completion_media_sound_enabled"
    private const val KEY_CONTENT_START_VIBRATION_ENABLED = "content_start_vibration_enabled"
    private const val KEY_SKIP_ONLINE_FONTS_ENABLED = "skip_online_fonts_enabled"
    private const val KEY_IMAGE_PROXY_ENABLED = "image_proxy_enabled"
    private const val KEY_IMAGE_PROXY_URL = "image_proxy_url"
    private const val KEY_IMAGE_PROXY_EXCLUDED_HOSTS = "image_proxy_excluded_hosts"
    private const val KEY_BRIDGE_MODE = "bridge_mode"
    private const val KEY_BRIDGE_VERSION = "bridge_version"
    private const val KEY_BRIDGE_LAST_EVENT = "bridge_last_event"
    private const val KEY_BRIDGE_LAST_EVENT_AT = "bridge_last_event_at"
    private const val BRIDGE_MODE_UNKNOWN = "unknown"
    private const val DEFAULT_IMAGE_PROXY_URL = "https://pic.biatch.party/"

    fun getServerUrl(context: Context): String {
        val stored = context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .getString(KEY_SERVER_URL, null)
        return normalizeUrl(stored ?: BuildConfig.ST_BASE_URL)
    }

    fun setServerUrl(context: Context, value: String) {
        context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_SERVER_URL, normalizeUrl(value))
            .apply()
    }

    fun isWakeLockEnabled(context: Context): Boolean {
        return context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .getBoolean(KEY_WAKE_LOCK_ENABLED, true)
    }

    fun setWakeLockEnabled(context: Context, enabled: Boolean) {
        context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .edit()
            .putBoolean(KEY_WAKE_LOCK_ENABLED, enabled)
            .apply()
    }

    fun isCompletionSoundEnabled(context: Context): Boolean {
        return context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .getBoolean(KEY_COMPLETION_SOUND_ENABLED, true)
    }

    fun setCompletionSoundEnabled(context: Context, enabled: Boolean) {
        context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .edit()
            .putBoolean(KEY_COMPLETION_SOUND_ENABLED, enabled)
            .apply()
    }

    fun isCompletionMediaSoundEnabled(context: Context): Boolean {
        return context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .getBoolean(KEY_COMPLETION_MEDIA_SOUND_ENABLED, false)
    }

    fun setCompletionMediaSoundEnabled(context: Context, enabled: Boolean) {
        context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .edit()
            .putBoolean(KEY_COMPLETION_MEDIA_SOUND_ENABLED, enabled)
            .apply()
    }

    fun isContentStartVibrationEnabled(context: Context): Boolean {
        return context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .getBoolean(KEY_CONTENT_START_VIBRATION_ENABLED, true)
    }

    fun setContentStartVibrationEnabled(context: Context, enabled: Boolean) {
        context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .edit()
            .putBoolean(KEY_CONTENT_START_VIBRATION_ENABLED, enabled)
            .apply()
    }

    fun isSkipOnlineFontsEnabled(context: Context): Boolean {
        return context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .getBoolean(KEY_SKIP_ONLINE_FONTS_ENABLED, true)
    }

    fun setSkipOnlineFontsEnabled(context: Context, enabled: Boolean) {
        context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .edit()
            .putBoolean(KEY_SKIP_ONLINE_FONTS_ENABLED, enabled)
            .apply()
    }

    fun isImageProxyEnabled(context: Context): Boolean {
        return context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .getBoolean(KEY_IMAGE_PROXY_ENABLED, true)
    }

    fun setImageProxyEnabled(context: Context, enabled: Boolean) {
        context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .edit()
            .putBoolean(KEY_IMAGE_PROXY_ENABLED, enabled)
            .apply()
    }

    fun getImageProxyUrl(context: Context): String {
        val stored = context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .getString(KEY_IMAGE_PROXY_URL, null)
        return normalizeUrl(stored?.takeIf { it.isNotBlank() } ?: DEFAULT_IMAGE_PROXY_URL)
    }

    fun setImageProxyUrl(context: Context, value: String) {
        context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_IMAGE_PROXY_URL, normalizeUrl(value))
            .apply()
    }

    fun getImageProxyExcludedHosts(context: Context): String {
        return context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .getString(KEY_IMAGE_PROXY_EXCLUDED_HOSTS, "")
            .orEmpty()
    }

    fun setImageProxyExcludedHosts(context: Context, value: String) {
        context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_IMAGE_PROXY_EXCLUDED_HOSTS, value.trim())
            .apply()
    }

    fun getBridgeStatus(context: Context): BridgeStatus {
        val prefs = context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
        return BridgeStatus(
            mode = prefs.getString(KEY_BRIDGE_MODE, BRIDGE_MODE_UNKNOWN).orEmpty(),
            version = prefs.getString(KEY_BRIDGE_VERSION, "").orEmpty(),
            lastEvent = prefs.getString(KEY_BRIDGE_LAST_EVENT, "").orEmpty(),
            lastEventAt = prefs.getLong(KEY_BRIDGE_LAST_EVENT_AT, 0L),
        )
    }

    fun recordBridgeEvent(
        context: Context,
        eventName: String,
        isNativeBridge: Boolean,
        version: String? = null,
    ) {
        context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_BRIDGE_MODE, if (isNativeBridge) BridgeStatus.MODE_EXTENSION else BridgeStatus.MODE_FALLBACK)
            .putString(KEY_BRIDGE_LAST_EVENT, eventName)
            .putLong(KEY_BRIDGE_LAST_EVENT_AT, System.currentTimeMillis())
            .apply {
                if (!version.isNullOrBlank()) putString(KEY_BRIDGE_VERSION, version)
            }
            .apply()
    }

    fun normalizeUrl(value: String): String {
        val trimmed = value.trim()
        val withScheme = if (trimmed.contains("://")) trimmed else "https://$trimmed"
        return if (withScheme.endsWith("/")) withScheme else "$withScheme/"
    }

    fun hostOf(url: String): String {
        return Uri.parse(normalizeUrl(url)).host.orEmpty()
    }
}

data class BridgeStatus(
    val mode: String,
    val version: String,
    val lastEvent: String,
    val lastEventAt: Long,
) {
    companion object {
        const val MODE_EXTENSION = "extension"
        const val MODE_FALLBACK = "fallback"
    }
}

data class SiteCredentials(
    val username: String,
    val password: String,
)

class SiteCredentialsStore(context: Context) {
    private val prefs = context.getSharedPreferences("st_http_auth", Context.MODE_PRIVATE)

    fun get(host: String, realm: String? = null): SiteCredentials? {
        val username = prefs.getString(makeKey(host, realm, "username"), null)
            ?: prefs.getString(makeKey(host, null, "username"), null)
        val password = prefs.getString(makeKey(host, realm, "password"), null)
            ?: prefs.getString(makeKey(host, null, "password"), null)
        if (username.isNullOrBlank() || password.isNullOrBlank()) return null
        return SiteCredentials(username, password)
    }

    fun put(host: String, realm: String? = null, credentials: SiteCredentials) {
        prefs.edit()
            .putString(makeKey(host, realm, "username"), credentials.username)
            .putString(makeKey(host, realm, "password"), credentials.password)
            .apply()
    }

    fun clearHost(host: String) {
        val prefix = "${host.trim()}|"
        val keys = prefs.all.keys.filter { it.startsWith(prefix) }
        if (keys.isEmpty()) return

        prefs.edit().apply {
            keys.forEach(::remove)
        }.apply()
    }

    private fun makeKey(host: String, realm: String?, field: String): String {
        return "${host.trim()}|${realm.orEmpty().trim()}|$field"
    }
}
