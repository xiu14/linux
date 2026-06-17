package com.xiuzai.r2player

import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.activity.compose.BackHandler
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.OptIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.media3.common.MediaItem
import androidx.media3.common.util.UnstableApi
import androidx.media3.datasource.DefaultDataSource
import androidx.media3.datasource.DefaultHttpDataSource
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory
import androidx.media3.ui.PlayerView
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.abs
import kotlin.math.roundToInt

class MainActivity : ComponentActivity() {
    private val settingsRevision = mutableIntStateOf(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        setContent {
            R2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    R2PlayerApp(
                        revision = settingsRevision.intValue,
                        window = window,
                        onOpenSettings = {
                            startActivity(Intent(this, SettingsActivity::class.java))
                        },
                    )
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        settingsRevision.intValue += 1
    }
}

@Composable
private fun R2PlayerApp(
    revision: Int,
    window: Window,
    onOpenSettings: () -> Unit,
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val config = remember(revision) { AppSettings.load(context) }
    val repository = remember(config) { AListRepository(config) }
    val thumbnailStore = remember(repository) { ThumbnailStore(context, repository) }
    val player = remember {
        ExoPlayer.Builder(context).build().apply {
            playWhenReady = true
        }
    }

    var library by remember(repository) { mutableStateOf<LibraryState?>(null) }
    var currentEntry by remember(repository) { mutableStateOf<LibraryEntry?>(null) }
    var playableTarget by remember(repository) { mutableStateOf<PlayableTarget?>(null) }
    var isLoading by remember(repository) { mutableStateOf(false) }
    var isFullscreen by remember { mutableStateOf(false) }
    var statusText by remember(repository) { mutableStateOf("正在加载视频列表...") }

    fun loadLibrary(path: String = config.rootPaths.firstOrNull() ?: "/") {
        scope.launch {
            isLoading = true
            statusText = "正在加载视频列表..."
            runCatching { repository.list(path) }
                .onSuccess { nextLibrary ->
                    library = nextLibrary
                    val nextVideo = nextLibrary.entries.firstOrNull { !it.isDirectory }
                    if (currentEntry == null || nextLibrary.entries.none { it.path == currentEntry?.path }) {
                        currentEntry = nextVideo
                        playableTarget = null
                    }
                    statusText = "已加载 ${nextLibrary.entries.size} 项"
                }
                .onFailure { error ->
                    statusText = error.message ?: "加载失败"
                }
            isLoading = false
        }
    }

    fun play(entry: LibraryEntry) {
        if (entry.isDirectory) {
            loadLibrary(entry.path)
            return
        }
        scope.launch {
            currentEntry = entry
            statusText = "正在准备播放..."
            runCatching { repository.resolvePlayable(entry) }
                .onSuccess { target ->
                    playableTarget = target
                    statusText = entry.name
                }
                .onFailure { error ->
                    statusText = error.message ?: "无法播放"
                }
        }
    }

    LaunchedEffect(repository) {
        loadLibrary()
    }

    DisposableEffect(player) {
        onDispose { player.release() }
    }

    LaunchedEffect(playableTarget?.url, playableTarget?.headers) {
        val target = playableTarget
        if (target == null) {
            player.stop()
            player.clearMediaItems()
            return@LaunchedEffect
        }

        val httpFactory = DefaultHttpDataSource.Factory()
            .setAllowCrossProtocolRedirects(true)
            .setDefaultRequestProperties(target.headers)
        val dataSourceFactory = DefaultDataSource.Factory(context, httpFactory)
        val mediaSource = DefaultMediaSourceFactory(dataSourceFactory)
            .createMediaSource(MediaItem.fromUri(target.url))
        player.setMediaSource(mediaSource)
        player.prepare()
        player.play()
    }

    BackHandler(enabled = isFullscreen) {
        isFullscreen = false
    }

    FullscreenSystemUi(window = window, isFullscreen = isFullscreen)

    if (isFullscreen) {
        VideoPanel(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black),
            player = player,
            target = playableTarget,
            fallbackTitle = currentEntry?.name ?: "请选择视频",
            window = window,
            isFullscreen = true,
            onToggleFullscreen = { isFullscreen = false },
            onNext = {
                val entries = library?.entries?.filter { !it.isDirectory }.orEmpty()
                val currentIndex = entries.indexOfFirst { it.path == currentEntry?.path }
                if (currentIndex >= 0 && currentIndex < entries.lastIndex) play(entries[currentIndex + 1])
            },
        )
        return
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(horizontal = 12.dp, vertical = 10.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        HeaderBar(
            title = config.appTitle,
            statusText = statusText,
            isLoading = isLoading,
            onRefresh = { loadLibrary(library?.currentPath ?: config.rootPaths.firstOrNull() ?: "/") },
            onOpenSettings = onOpenSettings,
        )

        VideoPanel(
            modifier = Modifier.fillMaxWidth(),
            player = player,
            target = playableTarget,
            fallbackTitle = currentEntry?.name ?: "请选择视频",
            window = window,
            isFullscreen = false,
            onToggleFullscreen = { isFullscreen = true },
            onNext = {
                val entries = library?.entries?.filter { !it.isDirectory }.orEmpty()
                val currentIndex = entries.indexOfFirst { it.path == currentEntry?.path }
                if (currentIndex >= 0 && currentIndex < entries.lastIndex) play(entries[currentIndex + 1])
            },
        )

        library?.let { state ->
            LibraryBrowser(
                library = state,
                selectedPath = currentEntry?.path,
                thumbnailStore = thumbnailStore,
                onOpenPath = ::loadLibrary,
                onEntryClick = ::play,
            )
        } ?: Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            CircularProgressIndicator()
        }
    }
}

@Composable
private fun HeaderBar(
    title: String,
    statusText: String,
    isLoading: Boolean,
    onRefresh: () -> Unit,
    onOpenSettings: () -> Unit,
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            Text(
                text = statusText,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
        if (isLoading) {
            CircularProgressIndicator(modifier = Modifier.size(28.dp), strokeWidth = 3.dp)
        }
        OutlinedButton(onClick = onRefresh) {
            Text("刷新")
        }
        OutlinedButton(onClick = onOpenSettings) {
            Text("设置")
        }
    }
}

@OptIn(UnstableApi::class)
@Composable
private fun VideoPanel(
    modifier: Modifier = Modifier,
    player: ExoPlayer,
    target: PlayableTarget?,
    fallbackTitle: String,
    window: Window,
    isFullscreen: Boolean,
    onToggleFullscreen: () -> Unit,
    onNext: () -> Unit,
) {
    var overlayText by remember { mutableStateOf("双击暂停 / 左右快进 / 上下亮度音量") }
    var overlayVisible by remember { mutableStateOf(true) }
    var fullscreenControlsVisible by remember { mutableStateOf(false) }
    var currentPosition by remember { mutableLongStateOf(0L) }
    var duration by remember { mutableLongStateOf(0L) }

    LaunchedEffect(target?.entry?.path) {
        if (target == null) return@LaunchedEffect
        overlayText = target.entry.name
        overlayVisible = true
        fullscreenControlsVisible = isFullscreen
        delay(1800)
        overlayVisible = false
    }

    LaunchedEffect(isFullscreen) {
        fullscreenControlsVisible = isFullscreen
    }

    LaunchedEffect(overlayVisible, overlayText) {
        if (overlayVisible) {
            delay(1600)
            overlayVisible = false
        }
    }

    LaunchedEffect(player, target?.url) {
        while (true) {
            currentPosition = player.currentPosition.coerceAtLeast(0L)
            duration = player.duration.takeIf { it > 0 } ?: 0L
            delay(500)
        }
    }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .then(
                    if (isFullscreen) {
                        Modifier
                            .fillMaxHeight()
                            .clip(RoundedCornerShape(0.dp))
                    } else {
                        Modifier
                            .aspectRatio(16f / 9f)
                            .clip(RoundedCornerShape(8.dp))
                    },
                )
                .background(Color.Black),
        ) {
            AndroidView(
                modifier = Modifier.fillMaxSize(),
                factory = { viewContext ->
                    PlayerView(viewContext).apply {
                        useController = true
                        this.player = player
                    }
                },
                update = { it.player = player },
            )

            PlayerGestureLayer(
                player = player,
                window = window,
                onSingleTap = {
                    if (isFullscreen) {
                        fullscreenControlsVisible = !fullscreenControlsVisible
                    } else {
                        overlayText = "双击暂停 / 左右快进 / 上下亮度音量"
                        overlayVisible = true
                    }
                },
                onOverlay = { message ->
                    overlayText = message
                    overlayVisible = true
                },
            )

            if (target == null) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xAA000000)),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = fallbackTitle,
                        color = Color.White,
                        style = MaterialTheme.typography.titleMedium,
                    )
                }
            }

            if (overlayVisible) {
                Box(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xCC111827))
                        .padding(horizontal = 16.dp, vertical = 10.dp),
                ) {
                    Text(overlayText, color = Color.White, maxLines = 2)
                }
            }

            if (!isFullscreen || fullscreenControlsVisible) {
                Button(
                    onClick = onToggleFullscreen,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(12.dp),
                ) {
                    Text(if (isFullscreen) "退出全屏" else "全屏")
                }
            }

            if (isFullscreen && fullscreenControlsVisible) {
                FullscreenControls(
                    player = player,
                    currentPosition = currentPosition,
                    duration = duration,
                    onSeek = { position ->
                        player.seekTo(position)
                        currentPosition = position
                    },
                    onNext = onNext,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth()
                        .padding(14.dp),
                )
            }
        }

        if (isFullscreen) {
            return@Column
        }

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(
                onClick = {
                    if (player.isPlaying) player.pause() else player.play()
                    overlayText = if (player.isPlaying) "播放" else "暂停"
                    overlayVisible = true
                },
                modifier = Modifier.weight(1f),
            ) {
                Text("播放/暂停")
            }
            Button(onClick = onNext, modifier = Modifier.weight(1f)) {
                Text("下一个")
            }
        }
    }
}

@Composable
private fun FullscreenSystemUi(
    window: Window,
    isFullscreen: Boolean,
) {
    DisposableEffect(window, isFullscreen) {
        val controller = WindowInsetsControllerCompat(window, window.decorView)
        if (isFullscreen) {
            WindowCompat.setDecorFitsSystemWindows(window, false)
            controller.systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            controller.hide(WindowInsetsCompat.Type.systemBars())
        } else {
            controller.show(WindowInsetsCompat.Type.systemBars())
            WindowCompat.setDecorFitsSystemWindows(window, true)
        }

        onDispose {
            controller.show(WindowInsetsCompat.Type.systemBars())
            WindowCompat.setDecorFitsSystemWindows(window, true)
        }
    }
}

@Composable
private fun FullscreenControls(
    player: ExoPlayer,
    currentPosition: Long,
    duration: Long,
    onSeek: (Long) -> Unit,
    onNext: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xCC05070A))
            .padding(horizontal = 14.dp, vertical = 12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = formatTime(currentPosition),
                color = Color.White,
                style = MaterialTheme.typography.bodySmall,
            )
            Slider(
                value = currentPosition.coerceIn(0L, duration.coerceAtLeast(0L)).toFloat(),
                onValueChange = { onSeek(it.toLong()) },
                valueRange = 0f..duration.coerceAtLeast(1L).toFloat(),
                enabled = duration > 0L,
                modifier = Modifier.weight(1f),
            )
            Text(
                text = if (duration > 0L) formatTime(duration) else "--:--",
                color = Color.White,
                style = MaterialTheme.typography.bodySmall,
            )
        }

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(
                onClick = {
                    if (player.isPlaying) player.pause() else player.play()
                },
                modifier = Modifier.weight(1f),
            ) {
                Text("播放/暂停")
            }
            Button(onClick = onNext, modifier = Modifier.weight(1f)) {
                Text("下一个")
            }
        }
    }
}

@Composable
private fun PlayerGestureLayer(
    player: ExoPlayer,
    window: Window,
    onSingleTap: () -> Unit,
    onOverlay: (String) -> Unit,
) {
    val context = LocalContext.current
    val audioManager = remember {
        context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
    }
    var size by remember { mutableStateOf(IntSize.Zero) }
    var startOffset by remember { mutableStateOf(Offset.Zero) }
    var dragX by remember { mutableStateOf(0f) }
    var dragY by remember { mutableStateOf(0f) }
    var mode by remember { mutableStateOf<GestureMode?>(null) }
    var initialPosition by remember { mutableLongStateOf(0L) }
    var previewPosition by remember { mutableLongStateOf(0L) }
    var initialBrightness by remember { mutableStateOf(0.55f) }
    var initialVolume by remember { mutableIntStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .pointerInput(player) {
                detectTapGestures(
                    onTap = { onSingleTap() },
                    onDoubleTap = {
                        if (player.isPlaying) {
                            player.pause()
                            onOverlay("暂停")
                        } else {
                            player.play()
                            onOverlay("播放")
                        }
                    },
                )
            }
            .pointerInput(player, size) {
                detectDragGestures(
                    onDragStart = { offset ->
                        startOffset = offset
                        dragX = 0f
                        dragY = 0f
                        mode = null
                        initialPosition = player.currentPosition.coerceAtLeast(0L)
                        previewPosition = initialPosition
                        initialBrightness = currentBrightness(window)
                        initialVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC)
                    },
                    onDrag = { change, dragAmount ->
                        change.consume()
                        dragX += dragAmount.x
                        dragY += dragAmount.y
                        if (mode == null && abs(dragX) + abs(dragY) > 18f) {
                            mode = if (abs(dragX) >= abs(dragY)) {
                                GestureMode.Seek
                            } else if (startOffset.x < size.width / 2f) {
                                GestureMode.Brightness
                            } else {
                                GestureMode.Volume
                            }
                        }
                        when (mode) {
                            GestureMode.Seek -> {
                                val duration = player.duration.takeIf { it > 0 } ?: 30 * 60 * 1000L
                                val delta = (dragX / size.width.coerceAtLeast(1) * 90_000L).toLong()
                                previewPosition = (initialPosition + delta).coerceIn(0L, duration)
                                onOverlay("${formatTime(previewPosition)} / ${formatTime(duration)}")
                            }
                            GestureMode.Brightness -> {
                                val next = (initialBrightness - dragY / size.height.coerceAtLeast(1))
                                    .coerceIn(0.02f, 1f)
                                setBrightness(window, next)
                                onOverlay("亮度 ${(next * 100).roundToInt()}%")
                            }
                            GestureMode.Volume -> {
                                val max = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
                                    .coerceAtLeast(1)
                                val next = (initialVolume - dragY / size.height.coerceAtLeast(1) * max)
                                    .roundToInt()
                                    .coerceIn(0, max)
                                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, next, 0)
                                onOverlay("音量 ${(next * 100f / max).roundToInt()}%")
                            }
                            null -> Unit
                        }
                    },
                    onDragEnd = {
                        if (mode == GestureMode.Seek) {
                            player.seekTo(previewPosition)
                            onOverlay("跳到 ${formatTime(previewPosition)}")
                        }
                    },
                    onDragCancel = {
                        mode = null
                    },
                )
            }
            .then(
                Modifier.onSizeChanged { size = it },
            ),
    )
}

@Composable
private fun LibraryBrowser(
    library: LibraryState,
    selectedPath: String?,
    thumbnailStore: ThumbnailStore,
    onOpenPath: (String) -> Unit,
    onEntryClick: (LibraryEntry) -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            library.roots.forEach { root ->
                OutlinedButton(
                    onClick = { onOpenPath(root.path) },
                    enabled = root.path != library.rootPath,
                ) {
                    Text(root.name, maxLines = 1)
                }
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            OutlinedButton(
                onClick = { library.parentPath?.let(onOpenPath) },
                enabled = library.parentPath != null,
            ) {
                Text("上级")
            }
            Text(
                text = library.breadcrumbs.joinToString(" / ") { it.name },
                modifier = Modifier.weight(1f),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(bottom = 18.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(library.entries, key = { it.path }) { entry ->
                LibraryRow(
                    entry = entry,
                    selected = selectedPath == entry.path,
                    thumbnailStore = thumbnailStore,
                    onClick = { onEntryClick(entry) },
                )
            }
        }
    }
}

@Composable
private fun LibraryRow(
    entry: LibraryEntry,
    selected: Boolean,
    thumbnailStore: ThumbnailStore,
    onClick: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(if (selected) Color(0xFF123A36) else MaterialTheme.colorScheme.surfaceVariant)
            .border(
                width = 1.dp,
                color = if (selected) Color(0xFF4FD1C5) else Color.Transparent,
                shape = RoundedCornerShape(8.dp),
            )
            .clickable(onClick = onClick)
            .padding(8.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        ThumbnailBox(entry = entry, thumbnailStore = thumbnailStore)
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = entry.name,
                fontWeight = FontWeight.SemiBold,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
            )
            val detail = if (entry.isDirectory) {
                "目录"
            } else {
                listOf(entry.displaySize, entry.modified).filter { it.isNotBlank() }.joinToString(" · ")
            }
            Text(
                text = detail.ifBlank { entry.extension.uppercase().ifBlank { "VIDEO" } },
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                style = MaterialTheme.typography.bodySmall,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

@Composable
private fun ThumbnailBox(
    entry: LibraryEntry,
    thumbnailStore: ThumbnailStore,
) {
    var bitmap by remember(entry.path) { mutableStateOf<android.graphics.Bitmap?>(null) }
    var failed by remember(entry.path) { mutableStateOf(false) }

    LaunchedEffect(entry.path) {
        bitmap = null
        failed = false
        if (!entry.isDirectory) {
            bitmap = thumbnailStore.load(entry)
            failed = bitmap == null
        }
    }

    Box(
        modifier = Modifier
            .size(width = 112.dp, height = 63.dp)
            .clip(RoundedCornerShape(6.dp))
            .background(Color(0xFF111827)),
        contentAlignment = Alignment.Center,
    ) {
        val image = bitmap
        if (image != null) {
            Image(
                bitmap = image.asImageBitmap(),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
            )
        } else {
            Text(
                text = if (entry.isDirectory) "DIR" else if (failed) entry.extension.uppercase().ifBlank { "VIDEO" } else "...",
                color = Color.White,
                style = MaterialTheme.typography.labelLarge,
            )
        }
    }
}

private enum class GestureMode {
    Seek,
    Brightness,
    Volume,
}

private fun currentBrightness(window: Window): Float {
    val value = window.attributes.screenBrightness
    return if (value in 0f..1f) value else 0.55f
}

private fun setBrightness(window: Window, value: Float) {
    val attributes = window.attributes
    attributes.screenBrightness = value
    window.attributes = attributes
}

private fun formatTime(millis: Long): String {
    val totalSeconds = (millis / 1000).coerceAtLeast(0)
    val hours = totalSeconds / 3600
    val minutes = (totalSeconds % 3600) / 60
    val seconds = totalSeconds % 60
    return if (hours > 0) {
        "%d:%02d:%02d".format(hours, minutes, seconds)
    } else {
        "%02d:%02d".format(minutes, seconds)
    }
}
