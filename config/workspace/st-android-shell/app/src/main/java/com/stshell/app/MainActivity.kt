package com.stshell.app

import android.Manifest
import android.annotation.SuppressLint
import android.app.DownloadManager
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Color
import android.net.Uri
import android.net.http.SslError
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Base64
import android.util.Log
import android.view.ViewGroup
import android.webkit.ConsoleMessage
import android.webkit.CookieManager
import android.webkit.HttpAuthHandler
import android.webkit.JavascriptInterface
import android.webkit.RenderProcessGoneDetail
import android.webkit.SslErrorHandler
import android.webkit.URLUtil
import android.webkit.ValueCallback
import android.webkit.WebChromeClient
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature
import com.stshell.app.bridge.StBridge
import com.stshell.app.status.CompositeStatusPresenter
import com.stshell.app.status.FluidCloudStatusPresenter
import com.stshell.app.status.GenerationStatusController
import com.stshell.app.status.GenerationStatusEvent
import com.stshell.app.status.NotificationStatusPresenter
import java.io.ByteArrayInputStream
import java.io.File
import java.io.FileOutputStream
import java.net.HttpURLConnection
import java.util.concurrent.atomic.AtomicReference
import org.json.JSONObject
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    private lateinit var generationStatusController: GenerationStatusController
    private val credentialsStore by lazy { SiteCredentialsStore(this) }
    private val foregroundPillHandler = Handler(Looper.getMainLooper())
    private var pendingFileChooserCallback: ValueCallback<Array<Uri>>? = null
    private var foregroundPillState by mutableStateOf<ForegroundPillState?>(null)
    private var foregroundPillGenerationKey = 0L
    private var hiddenForegroundPillGenerationKey = 0L

    private val notificationPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission(),
    ) { granted ->
        if (!granted) {
            Toast.makeText(this, "通知权限未开启，流体云/状态通知可能无法显示", Toast.LENGTH_SHORT).show()
        }
    }

    private val fileChooserLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult(),
    ) { result ->
        val callback = pendingFileChooserCallback ?: return@registerForActivityResult
        pendingFileChooserCallback = null
        callback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(result.resultCode, result.data))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (BuildConfig.DEBUG) {
            WebView.setWebContentsDebuggingEnabled(true)
        }

        generationStatusController = GenerationStatusController(
            presenter = CompositeStatusPresenter(
                listOf(
                    NotificationStatusPresenter(this),
                    FluidCloudStatusPresenter(),
                ),
            ),
        )

        ensureNotificationPermission()

        setContent {
            TavernTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    StWebViewScreen(
                        url = AppSettings.getServerUrl(this),
                        credentialsStore = credentialsStore,
                        onShowFileChooser = ::openFileChooser,
                        onDownloadRequested = ::handleDownload,
                        onNativeEvent = ::handleNativeEvent,
                        foregroundPillState = foregroundPillState,
                        onForegroundPillHidden = ::hideForegroundPillForCurrentGeneration,
                    )
                }
            }
        }
    }

    private fun handleNativeEvent(name: String, payloadJson: String?) {
        if (name == "js_error") {
            Log.w("STShell", "JS error: $payloadJson")
            return
        }
        recordBridgeStatus(name, payloadJson)
        if (name == "st_bridge_ready" || name == "generation_ended" || name == "generation_stopped") {
            Log.d("STShell", "Bridge event: $name")
        }
        val event = try {
            GenerationStatusEvent.from(name, payloadJson)
        } catch (error: Throwable) {
            Log.e("STShell", "Failed to parse bridge event", error)
            null
        } ?: return

        generationStatusController.handle(event)
        updateForegroundPill(event)
    }

    private fun recordBridgeStatus(name: String, payloadJson: String?) {
        val payload = runCatching {
            payloadJson?.takeIf { it.isNotBlank() }?.let(::JSONObject)
        }.getOrNull()
        val source = payload?.optString("source").orEmpty()
        val bridge = payload?.optString("bridge").orEmpty()
        val version = payload?.optString("version")?.takeIf { it.isNotBlank() }
        val isNativeBridge = source == TAVERN_NATIVE_BRIDGE_ID || bridge == TAVERN_NATIVE_BRIDGE_ID

        AppSettings.recordBridgeEvent(
            context = this,
            eventName = name,
            isNativeBridge = isNativeBridge,
            version = version,
        )
    }

    private fun updateForegroundPill(event: GenerationStatusEvent) {
        when (event) {
            is GenerationStatusEvent.Pending -> {
                foregroundPillGenerationKey = event.at
                hiddenForegroundPillGenerationKey = 0L
                showForegroundPill("准备中", event.characterName)
            }

            is GenerationStatusEvent.Started -> {
                ensureForegroundPillGeneration(event.at)
                showForegroundPill("在想了", event.characterName)
            }

            is GenerationStatusEvent.ContentStarted -> {
                ensureForegroundPillGeneration(event.at)
                showForegroundPill("在写了", event.characterName)
            }

            is GenerationStatusEvent.Ended -> {
                ensureForegroundPillGeneration(event.at)
                showForegroundPill("已完成", event.characterName, autoDismissMs = 3_000L)
            }

            is GenerationStatusEvent.Stopped -> {
                ensureForegroundPillGeneration(event.at)
                showForegroundPill("已中断", event.characterName, autoDismissMs = 3_000L)
            }

            is GenerationStatusEvent.BridgeReady,
            is GenerationStatusEvent.Streaming,
            -> Unit
        }
    }

    private fun ensureForegroundPillGeneration(fallbackKey: Long) {
        if (foregroundPillGenerationKey == 0L) {
            foregroundPillGenerationKey = fallbackKey
        }
    }

    private fun showForegroundPill(
        title: String,
        characterName: String?,
        autoDismissMs: Long? = null,
    ) {
        foregroundPillHandler.removeCallbacksAndMessages(FOREGROUND_PILL_TOKEN)
        if (hiddenForegroundPillGenerationKey == foregroundPillGenerationKey) return

        val key = foregroundPillGenerationKey
        foregroundPillState = ForegroundPillState(
            generationKey = key,
            title = title,
            subtitle = characterName,
        )

        autoDismissMs?.let { delayMs ->
            foregroundPillHandler.postDelayed(
                {
                    if (foregroundPillState?.generationKey == key) {
                        foregroundPillState = null
                    }
                },
                FOREGROUND_PILL_TOKEN,
                delayMs,
            )
        }
    }

    private fun hideForegroundPillForCurrentGeneration() {
        hiddenForegroundPillGenerationKey = foregroundPillState?.generationKey ?: foregroundPillGenerationKey
        foregroundPillHandler.removeCallbacksAndMessages(FOREGROUND_PILL_TOKEN)
        foregroundPillState = null
    }

    private fun ensureNotificationPermission() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) return
        if (
            ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.POST_NOTIFICATIONS,
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            return
        }

        notificationPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
    }

    private fun openFileChooser(
        filePathCallback: ValueCallback<Array<Uri>>,
        fileChooserParams: WebChromeClient.FileChooserParams,
    ): Boolean {
        pendingFileChooserCallback?.onReceiveValue(null)
        pendingFileChooserCallback = filePathCallback

        val intent = runCatching {
            fileChooserParams.createIntent()
        }.getOrElse {
            Intent(Intent.ACTION_OPEN_DOCUMENT).apply {
                addCategory(Intent.CATEGORY_OPENABLE)
                type = "*/*"
                putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true)
            }
        }

        return runCatching {
            fileChooserLauncher.launch(intent)
            true
        }.getOrElse { error ->
            pendingFileChooserCallback = null
            filePathCallback.onReceiveValue(null)
            Toast.makeText(this, "无法打开文件选择器: ${error.message}", Toast.LENGTH_SHORT).show()
            false
        }
    }

    private fun handleDownload(
        webView: WebView?,
        url: String,
        userAgent: String?,
        contentDisposition: String?,
        mimeType: String?,
        contentLength: Long,
    ) {
        val safeMimeType = mimeType?.takeIf { it.isNotBlank() } ?: "application/octet-stream"
        val fileName = sanitizeFileName(URLUtil.guessFileName(url, contentDisposition, safeMimeType))

        when {
            url.startsWith("blob:", ignoreCase = true) -> {
                webView?.downloadBlobUrl(url, fileName, safeMimeType)
                toast("正在保存到 Download...")
            }

            url.startsWith("data:", ignoreCase = true) -> {
                DownloadBridge(this).saveDataUrl(fileName, safeMimeType, url)
            }

            else -> {
                enqueueDownload(url, userAgent, contentDisposition, safeMimeType, fileName, contentLength)
            }
        }
    }

    private fun enqueueDownload(
        url: String,
        userAgent: String?,
        contentDisposition: String?,
        mimeType: String,
        fileName: String,
        contentLength: Long,
    ) {
        val request = DownloadManager.Request(Uri.parse(url))
            .setTitle(fileName)
            .setDescription("正在下载到 Download")
            .setMimeType(mimeType)
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName)
            .setAllowedOverMetered(true)
            .setAllowedOverRoaming(true)

        if (!userAgent.isNullOrBlank()) {
            request.addRequestHeader("User-Agent", userAgent)
        }
        if (!contentDisposition.isNullOrBlank()) {
            request.addRequestHeader("Content-Disposition", contentDisposition)
        }
        CookieManager.getInstance().getCookie(url)?.takeIf { it.isNotBlank() }?.let {
            request.addRequestHeader("Cookie", it)
        }
        Uri.parse(url).host?.let { host ->
            credentialsStore.get(host)?.let { credentials ->
                val token = Base64.encodeToString(
                    "${credentials.username}:${credentials.password}".toByteArray(Charsets.UTF_8),
                    Base64.NO_WRAP,
                )
                request.addRequestHeader("Authorization", "Basic $token")
            }
        }
        if (contentLength > 0) {
            request.addRequestHeader("Content-Length", contentLength.toString())
        }

        runCatching {
            val manager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
            manager.enqueue(request)
            toast("已开始下载到 Download/$fileName")
        }.onFailure { error ->
            toast("下载失败: ${error.message}")
        }
    }

    private fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

private data class HttpAuthRequestState(
    val host: String,
    val realm: String?,
    val handler: HttpAuthHandler,
)

private data class PageState(
    val isLoading: Boolean = true,
    val lastUrl: String = "",
    val errorMessage: String? = null,
    val progress: Int = 0,
)

private data class ForegroundPillState(
    val generationKey: Long,
    val title: String,
    val subtitle: String?,
)

private data class SslRequestState(
    val url: String,
    val errorDescription: String,
    val handler: SslErrorHandler,
)

private val FOREGROUND_PILL_TOKEN = Any()
private val IMAGE_EXTENSIONS = setOf(".jpg", ".jpeg", ".png", ".webp", ".gif", ".avif", ".svg", ".bmp", ".ico")
private const val IMAGE_PROXY_CONNECT_TIMEOUT_MS = 8_000
private const val IMAGE_PROXY_READ_TIMEOUT_MS = 15_000
private const val TAVERN_NATIVE_BRIDGE_ID = "third-party/tavern-native-bridge"

private fun WebView.loadUrlWithHttpAuth(url: String, credentials: SiteCredentials?) {
    if (credentials == null) {
        loadUrl(url)
        return
    }

    val token = Base64.encodeToString(
        "${credentials.username}:${credentials.password}".toByteArray(Charsets.UTF_8),
        Base64.NO_WRAP,
    )
    loadUrl(url, mapOf("Authorization" to "Basic $token"))
}

private fun createSkippedOnlineFontResponse(url: Uri): WebResourceResponse? {
    val mimeType = when (url.host?.lowercase()) {
        "fonts.googleapis.com" -> "text/css"
        "fonts.gstatic.com" -> "font/woff2"
        else -> return null
    }
    return WebResourceResponse(
        mimeType,
        if (mimeType == "text/css") "UTF-8" else null,
        200,
        "OK",
        mapOf(
            "Access-Control-Allow-Origin" to "*",
            "Cache-Control" to "max-age=86400",
        ),
        ByteArrayInputStream(ByteArray(0)),
    )
}

private fun createProxiedImageResponse(
    context: Context,
    requestUrl: Uri,
    requestHeaders: Map<String, String>,
    currentPageUrl: String?,
): WebResourceResponse? {
    if (!AppSettings.isImageProxyEnabled(context)) return null
    if (!requestUrl.isHttpUrl()) return null
    if (!requestUrl.looksLikeImageRequest(requestHeaders)) return null

    val requestHost = requestUrl.host?.normalizedHost().orEmpty()
    val proxyUrl = runCatching { AppSettings.getImageProxyUrl(context) }.getOrNull() ?: return null
    val excludedHosts = buildImageProxyExcludedHosts(context, proxyUrl, currentPageUrl)

    if (requestHost.isBlank()) return null
    if (requestHost.isLocalOrPrivateHost()) return null
    if (excludedHosts.any { requestHost.matchesHostRule(it) }) return null
    if (requestHost == "fonts.googleapis.com" || requestHost == "fonts.gstatic.com") return null

    val proxiedUrl = Uri.parse(proxyUrl)
        .buildUpon()
        .appendQueryParameter("url", requestUrl.toString())
        .build()
        .toString()

    return runCatching {
        val connection = java.net.URL(proxiedUrl).openConnection() as HttpURLConnection
        connection.instanceFollowRedirects = true
        connection.connectTimeout = IMAGE_PROXY_CONNECT_TIMEOUT_MS
        connection.readTimeout = IMAGE_PROXY_READ_TIMEOUT_MS
        connection.requestMethod = "GET"
        connection.setRequestProperty("Accept", requestHeaders.findHeader("Accept") ?: "image/avif,image/webp,image/*,*/*")
        connection.setRequestProperty("User-Agent", requestHeaders.findHeader("User-Agent") ?: "Mozilla/5.0 Tavern/1.0")

        val statusCode = connection.responseCode
        if (statusCode !in 200..299) {
            connection.disconnect()
            Log.w("TavernWebView", "[ImageProxy] upstream status=$statusCode url=$requestUrl")
            return null
        }

        val contentTypeHeader = connection.contentType.orEmpty()
        val mimeType = contentTypeHeader.substringBefore(';').trim().ifBlank { "image/*" }
        if (!mimeType.startsWith("image/") && mimeType != "image/svg+xml") {
            connection.disconnect()
            Log.w("TavernWebView", "[ImageProxy] non-image type=$mimeType url=$requestUrl")
            return null
        }

        val headers = mapOf(
            "Access-Control-Allow-Origin" to "*",
            "Cache-Control" to "public, max-age=86400",
        )
        Log.d("TavernWebView", "[ImageProxy] proxied $requestUrl")
        WebResourceResponse(
            mimeType,
            null,
            statusCode,
            connection.responseMessage ?: "OK",
            headers,
            connection.inputStream,
        )
    }.onFailure { error ->
        Log.w("TavernWebView", "[ImageProxy] failed url=$requestUrl", error)
    }.getOrNull()
}

private fun buildImageProxyExcludedHosts(
    context: Context,
    proxyUrl: String,
    currentPageUrl: String?,
): Set<String> {
    val automaticHosts = listOfNotNull(
        runCatching { AppSettings.hostOf(AppSettings.getServerUrl(context)) }.getOrNull(),
        runCatching { Uri.parse(currentPageUrl).host }.getOrNull(),
        runCatching { Uri.parse(proxyUrl).host }.getOrNull(),
    )
    val manualHosts = AppSettings.getImageProxyExcludedHosts(context)
        .split(',', '\n', '\r', '\t', ' ')
    return (automaticHosts + manualHosts)
        .mapNotNull { it.toHostRuleOrNull() }
        .toSet()
}

private fun String.toHostRuleOrNull(): String? {
    val trimmed = trim()
    if (trimmed.isBlank()) return null
    val host = runCatching {
        val value = if (trimmed.contains("://")) trimmed else "https://$trimmed"
        Uri.parse(value).host
    }.getOrNull() ?: trimmed
    return host.normalizedHost().ifBlank { null }
}

private fun String.normalizedHost(): String {
    return trim()
        .trim('[', ']')
        .lowercase()
        .removeSuffix(".")
}

private fun String.matchesHostRule(rule: String): Boolean {
    val host = normalizedHost()
    val normalizedRule = rule.normalizedHost()
    if (host.isBlank() || normalizedRule.isBlank()) return false
    return host == normalizedRule ||
        normalizedRule.startsWith(".") && host.endsWith(normalizedRule) ||
        host.endsWith(".$normalizedRule")
}

private fun String.isLocalOrPrivateHost(): Boolean {
    val host = normalizedHost()
    if (host == "localhost" || host.endsWith(".localhost") || host.endsWith(".local")) return true
    if (host == "::1") return true

    val parts = host.split('.').mapNotNull { it.toIntOrNull() }
    if (parts.size != 4 || parts.any { it !in 0..255 }) return false
    return parts[0] == 10 ||
        parts[0] == 127 ||
        parts[0] == 169 && parts[1] == 254 ||
        parts[0] == 172 && parts[1] in 16..31 ||
        parts[0] == 192 && parts[1] == 168
}

private fun Uri.isHttpUrl(): Boolean {
    return scheme.equals("http", ignoreCase = true) || scheme.equals("https", ignoreCase = true)
}

private fun Uri.looksLikeImageRequest(headers: Map<String, String>): Boolean {
    val accept = headers.findHeader("Accept").orEmpty()
    if (accept.contains("image/", ignoreCase = true)) return true

    val path = path.orEmpty().lowercase()
    return IMAGE_EXTENSIONS.any { path.endsWith(it) }
}

private fun Map<String, String>.findHeader(name: String): String? {
    return entries.firstOrNull { it.key.equals(name, ignoreCase = true) }?.value
}

private fun WebView.scrollChatToLatestFromNative() {
    evaluateJavascript(
        """
            (function () {
              if (window.__stNativeScrollChatToLatest) {
                window.__stNativeScrollChatToLatest();
                return;
              }
              var chat = document.querySelector('#chat');
              if (!chat) return;
              var lastMessage = document.querySelector('#chat .mes:last-child');
              if (lastMessage && lastMessage.scrollIntoView) {
                lastMessage.scrollIntoView({ block: 'end', inline: 'nearest', behavior: 'auto' });
              }
              chat.scrollTop = chat.scrollHeight;
            })();
        """.trimIndent(),
        null,
    )
}

@SuppressLint("SetJavaScriptEnabled")
@Composable
private fun StWebViewScreen(
    url: String,
    credentialsStore: SiteCredentialsStore,
    onShowFileChooser: (ValueCallback<Array<Uri>>, WebChromeClient.FileChooserParams) -> Boolean,
    onDownloadRequested: (WebView?, String, String?, String?, String?, Long) -> Unit,
    onNativeEvent: (String, String?) -> Unit,
    foregroundPillState: ForegroundPillState?,
    onForegroundPillHidden: () -> Unit,
) {
    val context = LocalContext.current
    val initialHost = remember(url) { Uri.parse(url).host.orEmpty() }
    var webView by remember { mutableStateOf<WebView?>(null) }
    var authRequest by remember { mutableStateOf<HttpAuthRequestState?>(null) }
    var sslRequest by remember { mutableStateOf<SslRequestState?>(null) }
    var authUsername by rememberSaveable { mutableStateOf("") }
    var authPassword by rememberSaveable { mutableStateOf("") }
    var pageState by remember { mutableStateOf(PageState(lastUrl = url)) }
    val currentPageUrl = remember(url) { AtomicReference(url) }

    DisposableEffect(Unit) {
        onDispose {
            webView?.stopLoading()
            webView?.destroy()
            webView = null
        }
    }

    BackHandler(enabled = webView?.canGoBack() == true) {
        webView?.goBack()
    }

    LaunchedEffect(pageState.isLoading, pageState.lastUrl) {
        if (!pageState.isLoading) return@LaunchedEffect
        delay(15000)
        if (pageState.isLoading) {
            pageState = pageState.copy(
                isLoading = false,
                errorMessage = "连接超时。站点可能没有响应，或 WebView 没通过 TLS/鉴权阶段。",
            )
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .imePadding(),
    ) {
        AndroidView(
            factory = { viewContext ->
                WebView(viewContext).apply {
                    webView = this
                    layoutParams = ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT,
                    )
                    setBackgroundColor(Color.BLACK)
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        setRendererPriorityPolicy(WebView.RENDERER_PRIORITY_IMPORTANT, false)
                    }

                    settings.apply {
                        javaScriptEnabled = true
                        domStorageEnabled = true
                        databaseEnabled = true
                        allowFileAccess = true
                        allowContentAccess = true
                        mediaPlaybackRequiresUserGesture = false
                        mixedContentMode = WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE
                        builtInZoomControls = false
                        displayZoomControls = false
                        useWideViewPort = true
                        loadWithOverviewMode = true
                        userAgentString =
                            "Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36"

                        // 不再开启 setOffscreenPreRaster：长聊天 + 复杂状态栏会撑爆 GPU 纹理 budget，
                        // 反而触发 renderer 被杀，导致页面出现黑色 tile。

                        if (
                            Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU &&
                            WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)
                        ) {
                            WebSettingsCompat.setAlgorithmicDarkeningAllowed(
                                this,
                                false,
                            )
                        }
                    }

                    CookieManager.getInstance().setAcceptCookie(true)
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this, true)

                    addJavascriptInterface(StBridge(onNativeEvent), "AndroidBridge")
                    addJavascriptInterface(DownloadBridge(viewContext), "TavernDownloadBridge")

                    setDownloadListener { downloadUrl, userAgent, contentDisposition, mimeType, contentLength ->
                        onDownloadRequested(
                            this,
                            downloadUrl,
                            userAgent,
                            contentDisposition,
                            mimeType,
                            contentLength,
                        )
                    }

                    webChromeClient = object : WebChromeClient() {
                        override fun onProgressChanged(view: WebView?, newProgress: Int) {
                            pageState = pageState.copy(progress = newProgress)
                        }

                        override fun onConsoleMessage(consoleMessage: ConsoleMessage?): Boolean {
                            consoleMessage ?: return false
                            val tag = "TavernWebView"
                            val msg = "${consoleMessage.message()} (${consoleMessage.sourceId()}:${consoleMessage.lineNumber()})"
                            when (consoleMessage.messageLevel()) {
                                ConsoleMessage.MessageLevel.ERROR -> Log.e(tag, msg)
                                ConsoleMessage.MessageLevel.WARNING -> Log.w(tag, msg)
                                else -> Unit
                            }
                            return false
                        }

                        override fun onShowFileChooser(
                            webView: WebView?,
                            filePathCallback: ValueCallback<Array<Uri>>,
                            fileChooserParams: FileChooserParams,
                        ): Boolean {
                            return onShowFileChooser(filePathCallback, fileChooserParams)
                        }
                    }

                    webViewClient = object : WebViewClient() {
                        override fun shouldInterceptRequest(
                            view: WebView?,
                            request: WebResourceRequest?,
                        ): WebResourceResponse? {
                            val requestUrl = request?.url ?: return super.shouldInterceptRequest(view, request)
                            if (AppSettings.isSkipOnlineFontsEnabled(viewContext)) {
                                createSkippedOnlineFontResponse(requestUrl)?.let { response ->
                                    Log.d("TavernWebView", "[FontSkip] blocked $requestUrl")
                                    return response
                                }
                            }
                            if (request?.method.equals("GET", ignoreCase = true) && request?.isForMainFrame != true) {
                                runCatching {
                                    createProxiedImageResponse(
                                        viewContext,
                                        requestUrl,
                                        request.requestHeaders.orEmpty(),
                                        currentPageUrl.get(),
                                    )
                                }.onFailure { error ->
                                    Log.w("TavernWebView", "[ImageProxy] intercept failed url=$requestUrl", error)
                                }.getOrNull()?.let { return it }
                            }
                            return super.shouldInterceptRequest(view, request)
                        }

                        override fun onPageStarted(view: WebView?, loadedUrl: String?, favicon: Bitmap?) {
                            loadedUrl?.let { currentPageUrl.set(it) }
                            pageState = pageState.copy(
                                isLoading = true,
                                lastUrl = loadedUrl ?: pageState.lastUrl,
                                errorMessage = null,
                                progress = 0,
                            )
                        }

                        override fun onPageFinished(view: WebView?, loadedUrl: String?) {
                            loadedUrl?.let { currentPageUrl.set(it) }
                            pageState = pageState.copy(
                                isLoading = false,
                                lastUrl = loadedUrl ?: pageState.lastUrl,
                                progress = 100,
                            )
                            injectNativeHelper()
                            installDownloadHooks()
                            attachSillyTavernGenerationHooks()
                        }

                        override fun onReceivedHttpAuthRequest(
                            view: WebView?,
                            handler: HttpAuthHandler,
                            host: String,
                            realm: String?,
                        ) {
                            credentialsStore.get(host, realm)?.let { credentials ->
                                handler.proceed(credentials.username, credentials.password)
                                return
                            }

                            authUsername = ""
                            authPassword = ""
                            authRequest = HttpAuthRequestState(host, realm, handler)
                        }

                        override fun onReceivedError(
                            view: WebView?,
                            request: WebResourceRequest?,
                            error: WebResourceError?,
                        ) {
                            if (request?.isForMainFrame != true) return
                            pageState = pageState.copy(
                                isLoading = false,
                                lastUrl = request.url.toString(),
                                errorMessage = buildString {
                                    append("页面加载失败")
                                    error?.description?.toString()?.takeIf { it.isNotBlank() }?.let {
                                        append(": ")
                                        append(it)
                                    }
                                },
                                progress = 0,
                            )
                        }

                        override fun onReceivedHttpError(
                            view: WebView?,
                            request: WebResourceRequest?,
                            errorResponse: WebResourceResponse?,
                        ) {
                            if (request?.isForMainFrame != true) return
                            if (errorResponse?.statusCode == 401) return
                            pageState = pageState.copy(
                                isLoading = false,
                                lastUrl = request.url.toString(),
                                errorMessage = "服务器返回 HTTP ${errorResponse?.statusCode ?: "?"}",
                                progress = 0,
                            )
                        }

                        override fun onReceivedSslError(
                            view: WebView?,
                            handler: SslErrorHandler,
                            error: SslError,
                        ) {
                            sslRequest = SslRequestState(
                                url = error.url,
                                errorDescription = describeSslError(error),
                                handler = handler,
                            )
                            pageState = pageState.copy(
                                isLoading = false,
                                lastUrl = error.url,
                                errorMessage = "SSL/TLS 校验失败",
                                progress = 0,
                            )
                        }

                        override fun onRenderProcessGone(
                            view: WebView?,
                            detail: RenderProcessGoneDetail?,
                        ): Boolean {
                            val didCrash = detail?.didCrash() == true
                            val priority = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                detail?.rendererPriorityAtExit()
                            } else {
                                null
                            }
                            Log.e(
                                "TavernWebView",
                                "Renderer gone: didCrash=$didCrash priorityAtExit=$priority url=${view?.url}",
                            )

                            val ctx = view?.context?.applicationContext
                            if (ctx != null) {
                                Toast.makeText(
                                    ctx,
                                    if (didCrash) "WebView 渲染崩溃，正在重载…" else "WebView 渲染被系统回收，正在重载…",
                                    Toast.LENGTH_SHORT,
                                ).show()
                            }

                            // 返回 true：告诉系统我们已处理，应用不要崩。
                            // 调用方需要重新触发 navigation 才能让 WebView 恢复可用。
                            val target = view ?: return true
                            val recoveryUrl = target.url ?: pageState.lastUrl.ifBlank { url }
                            pageState = pageState.copy(
                                isLoading = true,
                                errorMessage = null,
                                progress = 0,
                            )
                            target.post {
                                runCatching { target.reload() }.onFailure {
                                    runCatching { target.loadUrl(recoveryUrl) }
                                }
                            }
                            return true
                        }
                    }

                    val credentials = credentialsStore.get(initialHost, null)
                    loadUrlWithHttpAuth(url, credentials)
                }
            },
            update = { _ -> },
            modifier = Modifier.fillMaxSize(),
        )

        foregroundPillState?.let { state ->
            ForegroundStatusPill(
                state = state,
                onClick = { webView?.scrollChatToLatestFromNative() },
                onLongClick = onForegroundPillHidden,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 0.dp),
            )
        }

        if (pageState.isLoading) {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background.copy(alpha = 0.96f),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding()
                        .padding(24.dp),
                    verticalArrangement = Arrangement.Center,
                ) {
                    CircularProgressIndicator()
                    Spacer(modifier = Modifier.height(16.dp))
                    Text("正在连接 SillyTavern...")
                    Spacer(modifier = Modifier.height(8.dp))
                    LinearProgressIndicator(
                        progress = { pageState.progress / 100f },
                        modifier = Modifier.fillMaxWidth(),
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(pageState.lastUrl.ifBlank { url }, style = MaterialTheme.typography.bodySmall)
                }
            }
        }

        pageState.errorMessage?.let { message ->
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background.copy(alpha = 0.98f),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding()
                        .padding(24.dp),
                    verticalArrangement = Arrangement.Center,
                ) {
                    Text("页面没有成功打开", style = MaterialTheme.typography.headlineSmall)
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(message, style = MaterialTheme.typography.bodyLarge)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(pageState.lastUrl.ifBlank { url }, style = MaterialTheme.typography.bodySmall)
                    Spacer(modifier = Modifier.height(20.dp))
                    Button(
                        onClick = {
                            pageState = pageState.copy(isLoading = true, errorMessage = null)
                            val credentials = credentialsStore.get(initialHost, null)
                            webView?.loadUrlWithHttpAuth(url, credentials)
                        },
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Text("重新加载")
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Button(
                        onClick = {
                            val target = pageState.lastUrl.ifBlank { url }
                            context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(target)))
                        },
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Text("用系统浏览器打开")
                    }
                }
            }
        }
    }

    authRequest?.let { request ->
        AlertDialog(
            onDismissRequest = {
                request.handler.cancel()
                authRequest = null
            },
            title = { Text("登录到 ${request.host}") },
            text = {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                ) {
                    Text(
                        text = request.realm?.takeIf { it.isNotBlank() } ?: "这个站点需要用户名和密码。",
                        style = MaterialTheme.typography.bodyMedium,
                    )
                    OutlinedTextField(
                        value = authUsername,
                        onValueChange = { authUsername = it },
                        label = { Text("用户名") },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                    )
                    OutlinedTextField(
                        value = authPassword,
                        onValueChange = { authPassword = it },
                        label = { Text("密码") },
                        singleLine = true,
                        visualTransformation = PasswordVisualTransformation(),
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        val credentials = SiteCredentials(authUsername, authPassword)
                        credentialsStore.put(request.host, request.realm, credentials)
                        request.handler.proceed(credentials.username, credentials.password)
                        webView?.loadUrlWithHttpAuth(pageState.lastUrl.ifBlank { url }, credentials)
                        Toast.makeText(context, "已保存站点登录信息", Toast.LENGTH_SHORT).show()
                        authRequest = null
                    },
                    enabled = authUsername.isNotBlank() && authPassword.isNotBlank(),
                ) {
                    Text("登录")
                }
            },
            dismissButton = {
                Button(
                    onClick = {
                        request.handler.cancel()
                        authRequest = null
                    },
                ) {
                    Text("取消")
                }
            },
        )
    }

    sslRequest?.let { request ->
        AlertDialog(
            onDismissRequest = {
                request.handler.cancel()
                sslRequest = null
            },
            title = { Text("TLS 校验失败") },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(request.errorDescription)
                    Text(request.url, style = MaterialTheme.typography.bodySmall)
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        pageState = pageState.copy(isLoading = true, errorMessage = null)
                        request.handler.proceed()
                        sslRequest = null
                    },
                ) {
                    Text("继续访问")
                }
            },
            dismissButton = {
                Button(
                    onClick = {
                        request.handler.cancel()
                        sslRequest = null
                    },
                ) {
                    Text("取消")
                }
            },
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun ForegroundStatusPill(
    state: ForegroundPillState,
    onClick: () -> Unit,
    onLongClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Surface(
        modifier = modifier
            .widthIn(max = 280.dp)
            .combinedClickable(
                onClick = onClick,
                onLongClick = onLongClick,
            ),
        shape = RoundedCornerShape(999.dp),
        color = androidx.compose.ui.graphics.Color(0xFF9EA4AA).copy(alpha = 0.92f),
        tonalElevation = 6.dp,
        shadowElevation = 8.dp,
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(6.dp),
        ) {
            Text(
                text = "Tavern · ${state.title}",
                style = MaterialTheme.typography.labelLarge,
                color = androidx.compose.ui.graphics.Color.White,
            )
            state.subtitle?.takeIf { it.isNotBlank() }?.let { subtitle ->
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.labelSmall,
                    color = androidx.compose.ui.graphics.Color.White.copy(alpha = 0.72f),
                    maxLines = 1,
                )
            }
        }
    }
}

private class DownloadBridge(
    private val context: Context,
) {
    private val mainHandler = Handler(Looper.getMainLooper())

    @JavascriptInterface
    fun saveBase64(fileName: String?, mimeType: String?, base64: String?) {
        if (base64.isNullOrBlank()) {
            toast("下载失败: 空文件")
            return
        }

        runCatching {
            val bytes = Base64.decode(base64, Base64.DEFAULT)
            saveBytesToDownloads(
                context = context,
                fileName = sanitizeFileName(fileName?.takeIf { it.isNotBlank() } ?: "tavern-download.bin"),
                mimeType = mimeType?.takeIf { it.isNotBlank() } ?: "application/octet-stream",
                bytes = bytes,
            )
        }.onSuccess { name ->
            toast("已保存到 Download/$name")
        }.onFailure { error ->
            toast("保存失败: ${error.message}")
        }
    }

    fun saveDataUrl(fileName: String, mimeType: String, dataUrl: String) {
        runCatching {
            val commaIndex = dataUrl.indexOf(',')
            require(commaIndex >= 0) { "无效的 data URL" }
            val meta = dataUrl.substring(5, commaIndex)
            val payload = dataUrl.substring(commaIndex + 1)
            val finalMime = meta.substringBefore(";").takeIf { it.contains("/") } ?: mimeType
            val bytes = if (meta.contains(";base64", ignoreCase = true)) {
                Base64.decode(payload, Base64.DEFAULT)
            } else {
                Uri.decode(payload).toByteArray(Charsets.UTF_8)
            }
            saveBytesToDownloads(context, sanitizeFileName(fileName), finalMime, bytes)
        }.onSuccess { name ->
            toast("已保存到 Download/$name")
        }.onFailure { error ->
            toast("保存失败: ${error.message}")
        }
    }

    private fun toast(message: String) {
        mainHandler.post {
            Toast.makeText(context.applicationContext, message, Toast.LENGTH_SHORT).show()
        }
    }
}

private fun WebView.downloadBlobUrl(
    blobUrl: String,
    fileName: String,
    mimeType: String,
) {
    val script = """
        (function () {
          var targetUrl = ${JSONObject.quote(blobUrl)};
          var targetName = ${JSONObject.quote(fileName)};
          var targetMime = ${JSONObject.quote(mimeType)};

          try {
            var cachedName = window.__tavernBlobFileNameStore && window.__tavernBlobFileNameStore[targetUrl];
            if (cachedName) targetName = cachedName;
          } catch (error) {
            console.warn('[Tavern] blob filename lookup failed', error);
          }

          function saveBlob(blob) {
            if (!blob || typeof blob.size !== 'number' || blob.size <= 0) {
              window.TavernDownloadBridge.saveBase64(targetName, targetMime, '');
              return;
            }
            if (blob.type) targetMime = blob.type;
            try {
              var reader = new FileReader();
              reader.onloadend = function () {
                var result = String(reader.result || '');
                var commaIndex = result.indexOf(',');
                var base64 = commaIndex >= 0 ? result.slice(commaIndex + 1) : result;
                window.TavernDownloadBridge.saveBase64(
                  targetName,
                  targetMime,
                  base64
                );
              };
              reader.onerror = function () {
                window.TavernDownloadBridge.saveBase64(targetName, targetMime, '');
              };
              reader.readAsDataURL(blob);
            } catch (error) {
              console.error('[Tavern] read blob failed', error);
              window.TavernDownloadBridge.saveBase64(targetName, targetMime, '');
            }
          }

          try {
            var cached = window.__tavernBlobUrlStore && window.__tavernBlobUrlStore[targetUrl];
            if (cached) {
              saveBlob(cached);
              return;
            }
          } catch (error) {
            console.warn('[Tavern] blob cache lookup failed', error);
          }

          fetch(targetUrl)
            .then(function (response) { return response.blob(); })
            .then(saveBlob)
            .catch(function (error) {
              console.error('[Tavern] blob download failed', error);
              window.TavernDownloadBridge.saveBase64(targetName, targetMime, '');
            });
        })();
    """.trimIndent()
    evaluateJavascript(script, null)
}

private fun WebView.installDownloadHooks() {
    val script = """
        (function () {
          if (window.__tavernDownloadHooksInstalled) return;
          window.__tavernDownloadHooksInstalled = true;
          window.__tavernBlobUrlStore = window.__tavernBlobUrlStore || {};
          window.__tavernBlobUrlOrder = window.__tavernBlobUrlOrder || [];
          window.__tavernBlobFileNameStore = window.__tavernBlobFileNameStore || {};

          var originalCreateObjectURL = URL.createObjectURL.bind(URL);
          var originalRevokeObjectURL = URL.revokeObjectURL.bind(URL);
          var originalAnchorClick = HTMLAnchorElement.prototype.click;

          function rememberDownloadName(anchor) {
            try {
              if (!anchor) return;
              var href = anchor.href || anchor.getAttribute('href') || '';
              var name = anchor.download || anchor.getAttribute('download') || '';
              if (!href || !name) return;
              if (href.indexOf('blob:') !== 0 && href.indexOf('data:') !== 0) return;
              window.__tavernBlobFileNameStore[href] = name;
            } catch (error) {
              console.warn('[Tavern] remember download name failed', error);
            }
          }

          HTMLAnchorElement.prototype.click = function () {
            rememberDownloadName(this);
            return originalAnchorClick.apply(this, arguments);
          };

          document.addEventListener('click', function (event) {
            var anchor = event.target && event.target.closest && event.target.closest('a[download]');
            rememberDownloadName(anchor);
          }, true);

          URL.createObjectURL = function (object) {
            var url = originalCreateObjectURL(object);
            try {
              if (object instanceof Blob) {
                window.__tavernBlobUrlStore[url] = object;
                window.__tavernBlobUrlOrder.push(url);
                while (window.__tavernBlobUrlOrder.length > 20) {
                  var oldUrl = window.__tavernBlobUrlOrder.shift();
                  delete window.__tavernBlobUrlStore[oldUrl];
                }
              }
            } catch (error) {
              console.warn('[Tavern] cache blob URL failed', error);
            }
            return url;
          };

          URL.revokeObjectURL = function (url) {
            // Keep cached Blob objects briefly so Android DownloadListener can still read them.
            setTimeout(function () {
              try {
                delete window.__tavernBlobUrlStore[url];
                delete window.__tavernBlobFileNameStore[url];
                var index = window.__tavernBlobUrlOrder.indexOf(url);
                if (index >= 0) window.__tavernBlobUrlOrder.splice(index, 1);
              } catch (error) {}
            }, 30000);
            return originalRevokeObjectURL(url);
          };
        })();
    """.trimIndent()
    evaluateJavascript(script, null)
}

private fun saveBytesToDownloads(
    context: Context,
    fileName: String,
    mimeType: String,
    bytes: ByteArray,
): String {
    val safeName = sanitizeFileName(fileName)
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        val resolver = context.contentResolver
        val values = ContentValues().apply {
            put(MediaStore.MediaColumns.DISPLAY_NAME, safeName)
            put(MediaStore.MediaColumns.MIME_TYPE, mimeType)
            put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DOWNLOADS)
            put(MediaStore.MediaColumns.IS_PENDING, 1)
        }
        val uri = resolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, values)
            ?: error("无法创建下载文件")
        resolver.openOutputStream(uri)?.use { output ->
            output.write(bytes)
        } ?: error("无法写入下载文件")
        values.clear()
        values.put(MediaStore.MediaColumns.IS_PENDING, 0)
        resolver.update(uri, values, null, null)
        return safeName
    }

    val downloads = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
    if (!downloads.exists()) downloads.mkdirs()
    FileOutputStream(File(downloads, safeName)).use { output ->
        output.write(bytes)
    }
    return safeName
}

private fun WebView.injectNativeHelper() {
    val script = """
        (function () {
          if (!window.STNative) {
            window.STNative = {
              postEvent: function (name, payload) {
                try {
                  const json = payload == null ? null : JSON.stringify(payload);
                  window.AndroidBridge?.postEvent(String(name), json);
                } catch (error) {
                  console.error("[STNative] postEvent failed", error);
                }
              }
            };
          }

          if (window.__stNativeErrorHooksInstalled) return;
          window.__stNativeErrorHooksInstalled = true;

          window.addEventListener("error", function (event) {
            try {
              var payload = {
                kind: "window_error",
                message: (event && event.message) ? String(event.message) : "",
                source: (event && event.filename) ? String(event.filename) : "",
                line: (event && event.lineno != null) ? Number(event.lineno) : null,
                column: (event && event.colno != null) ? Number(event.colno) : null,
                stack: (event && event.error && event.error.stack)
                  ? String(event.error.stack).slice(0, 4000)
                  : "",
                href: location.href,
                at: Date.now()
              };
              window.STNative.postEvent("js_error", payload);
            } catch (e) { /* swallow to avoid recursive errors */ }
          }, true);

          window.addEventListener("unhandledrejection", function (event) {
            try {
              var reason = event && event.reason;
              var message = "";
              var stack = "";
              if (reason && typeof reason === "object") {
                message = String(reason.message || reason);
                stack = String(reason.stack || "").slice(0, 4000);
              } else {
                message = String(reason);
              }
              window.STNative.postEvent("js_error", {
                kind: "unhandled_rejection",
                message: message,
                stack: stack,
                href: location.href,
                at: Date.now()
              });
            } catch (e) { /* swallow */ }
          });
        })();
    """.trimIndent()
    evaluateJavascript(script, null)
}

private fun WebView.installTavernHelperDiagnostics() {
    val script = """
        (function () {
          if (window.__tavernHelperDiagnosticsInstalled) return;
          window.__tavernHelperDiagnosticsInstalled = true;

          var trackedFrames = new WeakSet();
          var maxReportedResources = 16;

          function round(value) {
            return Math.round(Number(value || 0) * 10) / 10;
          }

          function frameMode(frame) {
            try {
              if (frame.hasAttribute('srcdoc')) return 'srcdoc';
              if (String(frame.src || '').indexOf('blob:') === 0) return 'blob';
              return String(frame.src || 'unknown').slice(0, 80);
            } catch (error) {
              return 'unreadable';
            }
          }

          function shortResourceName(name) {
            try {
              var parsed = new URL(String(name), location.href);
              return parsed.host + parsed.pathname;
            } catch (error) {
              return String(name || '').slice(0, 120);
            }
          }

          function reportLoadedFrame(frame, id, startedAt) {
            var total = round(performance.now() - startedAt);
            try {
              var framePerformance = frame.contentWindow && frame.contentWindow.performance;
              if (!framePerformance) {
                console.info('[THDiag] iframe ended id=' + id + ' total=' + total + 'ms performance=unavailable');
                return;
              }

              var navigation = framePerformance.getEntriesByType('navigation')[0];
              var resources = Array.prototype.slice.call(framePerformance.getEntriesByType('resource') || []);
              resources.sort(function (left, right) {
                return Number(right.duration || 0) - Number(left.duration || 0);
              });

              var navInfo = navigation
                ? ' nav=' + round(navigation.duration) + 'ms dom=' +
                    round(navigation.domContentLoadedEventEnd) + 'ms load=' +
                    round(navigation.loadEventEnd) + 'ms'
                : '';
              console.info(
                '[THDiag] iframe ended id=' + id + ' mode=' + frameMode(frame) +
                ' total=' + total + 'ms resources=' + resources.length + navInfo
              );

              resources.slice(0, maxReportedResources).forEach(function (resource, index) {
                console.info(
                  '[THDiag] resource #' + (index + 1) + ' id=' + id +
                  ' duration=' + round(resource.duration) + 'ms start=' +
                  round(resource.startTime) + 'ms type=' +
                  String(resource.initiatorType || '') + ' name=' +
                  shortResourceName(resource.name)
                );
              });
            } catch (error) {
              console.warn(
                '[THDiag] iframe ended id=' + id + ' total=' + total +
                'ms resource-read-failed=' + String(error && error.message || error)
              );
            }
          }

          function watchFrame(frame) {
            if (!frame || trackedFrames.has(frame)) return;
            var id = String(frame.id || '');
            if (id.indexOf('TH-message--') !== 0) return;
            trackedFrames.add(frame);

            var startedAt = performance.now();
            console.info('[THDiag] iframe observed id=' + id + ' mode=' + frameMode(frame));
            frame.addEventListener('load', function () {
              reportLoadedFrame(frame, id, startedAt);
            }, { once: true });
          }

          function scan(root) {
            if (!root) return;
            if (root.tagName === 'IFRAME') watchFrame(root);
            if (root.querySelectorAll) {
              root.querySelectorAll('iframe[id^="TH-message--"]').forEach(watchFrame);
            }
          }

          scan(document);
          new MutationObserver(function (mutations) {
            mutations.forEach(function (mutation) {
              mutation.addedNodes.forEach(scan);
            });
          }).observe(document.documentElement || document, { childList: true, subtree: true });

          console.info('[THDiag] installed');
        })();
    """.trimIndent()
    evaluateJavascript(script, null)
}

private fun WebView.attachSillyTavernGenerationHooks() {
    val script = """
        (function () {
          if (window.__stNativeGenerationHookInstalled) return;
          if (window.__tavernNativeBridgeExtensionReady) return;
          if (window.__stNativeGenerationHookInstallScheduled) return;
          window.__stNativeGenerationHookInstallScheduled = true;

          setTimeout(function () {
          if (window.__stNativeGenerationHookInstalled) return;
          if (window.__tavernNativeBridgeExtensionReady) return;
          window.__stNativeGenerationHookInstalled = true;

          function emit(name, payload) {
            try {
              payload = payload || {};
              if (!payload.characterName) payload.characterName = getCharacterName();
              const json = payload == null ? null : JSON.stringify(payload);
              window.AndroidBridge?.postEvent(String(name), json);
            } catch (error) {
              console.error("[STNative] emit failed", error);
            }
          }

          function getCharacterName() {
            try {
              var context = window.SillyTavern && window.SillyTavern.getContext && window.SillyTavern.getContext();
              var id = context && context.characterId;
              var character = context && context.characters && context.characters[id];
              return (character && (character.name || character.avatar)) || '';
            } catch (error) {
              return '';
            }
          }

          function hasPendingInput() {
            try {
              var input = document.querySelector('#send_textarea');
              var value = input && String(input.value || '').trim();
              return !!(value && value.charAt(0) !== "/");
            } catch (error) {
              return false;
            }
          }

          function emitPending(source) {
            try {
              var now = Date.now();
              if (window.__stNativeLastPendingAt && now - window.__stNativeLastPendingAt < 1200) return;
              if (!hasPendingInput()) return;
              window.__stNativeLastPendingAt = now;
              emit("generation_pending", {
                source: source || "unknown",
                at: now,
                href: location.href
              });
            } catch (error) {
              console.error("[STNative] pending emit failed", error);
            }
          }

          function installPendingHooks() {
            if (window.__stNativePendingHooksInstalled) return;
            window.__stNativePendingHooksInstalled = true;

            function onSendButtonIntent(event) {
              var target = event.target && event.target.closest && event.target.closest('#send_but');
              if (target) emitPending('send_button_' + event.type);
            }

            document.addEventListener('touchstart', onSendButtonIntent, { capture: true, passive: true });
            document.addEventListener('pointerdown', onSendButtonIntent, { capture: true, passive: true });
            document.addEventListener('mousedown', onSendButtonIntent, true);
            document.addEventListener('click', onSendButtonIntent, true);

          }

          function scrollChatToLatest() {
            try {
              var chat = document.querySelector('#chat');
              if (!chat) return;

              var lastMessage = document.querySelector('#chat .mes:last-child');
              if (lastMessage && typeof lastMessage.scrollIntoView === 'function') {
                lastMessage.scrollIntoView({ block: 'end', inline: 'nearest', behavior: 'auto' });
              }

              chat.scrollTop = chat.scrollHeight;
            } catch (error) {
              console.warn("[STNative] scroll to latest failed", error);
            }
          }

          window.__stNativeScrollChatToLatest = scrollChatToLatest;

          function scheduleScrollChatToLatest(reason) {
            try {
              clearTimeout(window.__stNativeScrollLatestTimer);
              window.__stNativeScrollLatestReason = reason || "unknown";
              window.__stNativeScrollLatestTimer = setTimeout(function () {
                requestAnimationFrame(scrollChatToLatest);
                setTimeout(scrollChatToLatest, 80);
                setTimeout(scrollChatToLatest, 250);
                setTimeout(scrollChatToLatest, 650);
              }, 80);
            } catch (error) {
              console.warn("[STNative] schedule scroll failed", error);
            }
          }

          function installChatScrollHooks(context) {
            if (window.__stNativeChatScrollHooksInstalled) return;
            window.__stNativeChatScrollHooksInstalled = true;

            context.eventSource.on(context.event_types.CHAT_CHANGED, function () {
              scheduleScrollChatToLatest("chat_changed");
            });
          }

          function attachHooks() {
            try {
              installPendingHooks();

              const context = window.SillyTavern?.getContext?.();
              if (!context?.eventSource || !context?.event_types) {
                return false;
              }

              installChatScrollHooks(context);

              if (window.__stNativeGenerationListenersAttached) {
                return true;
              }

              window.__stNativeGenerationListenersAttached = true;
              let lastStreamingTs = 0;
              let isGenerating = false;
              let hasContentStarted = false;
              let generationStartedAt = 0;
              let preContentBuffer = "";

              function markContentStarted(text, reason) {
                if (hasContentStarted) return;
                hasContentStarted = true;
                emit("generation_content_started", {
                  reason: reason || "content",
                  length: String(text || "").length,
                  at: Date.now(),
                  href: location.href
                });
              }

              function updatePreContentState(text) {
                var value = String(text || "").trim();
                if (!value) return;
                preContentBuffer = (preContentBuffer + value.toLowerCase()).slice(-8000);
              }

              function hasContentTag() {
                return /<\s*content\b[^>]*>/i.test(preContentBuffer);
              }

              context.eventSource.on(context.event_types.GENERATION_STARTED, function (type, params, dryRun) {
                if (dryRun) return;
                isGenerating = true;
                hasContentStarted = false;
                generationStartedAt = Date.now();
                preContentBuffer = "";
                emit("generation_started", {
                  type: type || "normal",
                  params: params || null,
                  at: generationStartedAt,
                  href: location.href
                });
              });

              context.eventSource.on(context.event_types.STREAM_TOKEN_RECEIVED, function (text) {
                if (!isGenerating) return;
                const now = Date.now();
                const value = String(text || "");

                if (!hasContentStarted) {
                  updatePreContentState(value);
                  if (hasContentTag()) {
                    markContentStarted(value, "content_tag");
                  }
                }

                if (!hasContentStarted) return;
                if (now - lastStreamingTs < 1200) return;
                lastStreamingTs = now;
                emit("generation_streaming", {
                  length: value.length,
                  at: now
                });
              });

              context.eventSource.on(context.event_types.GENERATION_ENDED, function (messageId) {
                isGenerating = false;
                hasContentStarted = false;
                generationStartedAt = 0;
                emit("generation_ended", {
                  messageId: messageId,
                  at: Date.now(),
                  href: location.href
                });
              });

              context.eventSource.on(context.event_types.GENERATION_STOPPED, function () {
                isGenerating = false;
                hasContentStarted = false;
                generationStartedAt = 0;
                emit("generation_stopped", {
                  at: Date.now(),
                  href: location.href
                });
              });

              emit("st_bridge_ready", {
                source: "native_hook_fallback",
                bridge: "native_hook_fallback",
                at: Date.now(),
                href: location.href
              });

              return true;
            } catch (error) {
              console.error("[STNative] attachHooks failed", error);
              return false;
            }
          }

          if (attachHooks()) return;

          installPendingHooks();

          let attempts = 0;
          const timer = setInterval(function () {
            attempts += 1;
            if (attachHooks() || attempts >= 60) {
              clearInterval(timer);
            }
          }, 1000);
          }, 20000);
        })();
    """.trimIndent()
    evaluateJavascript(script, null)
}

private fun sanitizeFileName(value: String): String {
    val sanitized = value
        .substringAfterLast('/')
        .substringAfterLast('\\')
        .replace(Regex("""[\\/:*?"<>|]"""), "_")
        .trim()
    return sanitized.ifBlank { "tavern-download.bin" }
}

private fun describeSslError(error: SslError): String {
    return when (error.primaryError) {
        SslError.SSL_DATE_INVALID -> "证书日期无效"
        SslError.SSL_EXPIRED -> "证书已过期"
        SslError.SSL_IDMISMATCH -> "证书域名不匹配"
        SslError.SSL_INVALID -> "证书无效"
        SslError.SSL_NOTYETVALID -> "证书尚未生效"
        SslError.SSL_UNTRUSTED -> "证书不受信任"
        else -> "未知 TLS 错误"
    }
}
