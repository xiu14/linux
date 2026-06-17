package com.stshell.app

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

class SettingsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TavernTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    SettingsScreen(onClose = ::finish)
                }
            }
        }
    }
}

@Composable
private fun SettingsScreen(onClose: () -> Unit) {
    val context = LocalContext.current
    val credentialsStore = remember { SiteCredentialsStore(context) }
    var serverUrl by rememberSaveable { mutableStateOf(AppSettings.getServerUrl(context)) }
    var username by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var wakeLockEnabled by rememberSaveable { mutableStateOf(AppSettings.isWakeLockEnabled(context)) }
    var completionSoundEnabled by rememberSaveable { mutableStateOf(AppSettings.isCompletionSoundEnabled(context)) }
    var completionMediaSoundEnabled by rememberSaveable {
        mutableStateOf(AppSettings.isCompletionMediaSoundEnabled(context))
    }
    var contentStartVibrationEnabled by rememberSaveable {
        mutableStateOf(AppSettings.isContentStartVibrationEnabled(context))
    }
    var skipOnlineFontsEnabled by rememberSaveable {
        mutableStateOf(AppSettings.isSkipOnlineFontsEnabled(context))
    }
    var imageProxyEnabled by rememberSaveable {
        mutableStateOf(AppSettings.isImageProxyEnabled(context))
    }
    var imageProxyUrl by rememberSaveable {
        mutableStateOf(AppSettings.getImageProxyUrl(context))
    }
    var imageProxyExcludedHosts by rememberSaveable {
        mutableStateOf(AppSettings.getImageProxyExcludedHosts(context))
    }
    val bridgeStatus = remember { AppSettings.getBridgeStatus(context) }
    var showPassword by rememberSaveable { mutableStateOf(false) }
    val host = remember(serverUrl) { runCatching { AppSettings.hostOf(serverUrl) }.getOrDefault("") }

    LaunchedEffect(host) {
        val credentials = credentialsStore.get(host)
        username = credentials?.username.orEmpty()
        password = credentials?.password.orEmpty()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
    ) {
        Text("Tavern 设置", style = MaterialTheme.typography.headlineSmall)
        Text(
            "修改后重新打开 Tavern 主入口会使用新的服务器地址。",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )

        OutlinedTextField(
            value = serverUrl,
            onValueChange = { serverUrl = it },
            label = { Text("服务器地址") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Uri),
            modifier = Modifier.fillMaxWidth(),
        )

        Text(
            text = if (host.isBlank()) "当前站点: 无法识别" else "当前站点: $host",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )

        BridgeStatusCard(bridgeStatus)

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("站点用户名") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("站点密码") },
            singleLine = true,
            visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text("显示密码")
            Switch(checked = showPassword, onCheckedChange = { showPassword = it })
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text("生成期间 WakeLock")
                Text(
                    "保持 CPU 醒着，降低后台流式断连概率。",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
            Switch(checked = wakeLockEnabled, onCheckedChange = { wakeLockEnabled = it })
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text("消息完成提示音")
                Text(
                    "AI 回复生成完成时播放系统默认通知音。",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
            Switch(checked = completionSoundEnabled, onCheckedChange = { completionSoundEnabled = it })
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text("强提醒音（媒体音量）")
                Text(
                    "开启后完成音走媒体音量，静音模式下也可能响起。",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
            Switch(
                checked = completionMediaSoundEnabled,
                onCheckedChange = { completionMediaSoundEnabled = it },
                enabled = completionSoundEnabled,
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text("正文开始轻震")
                Text(
                    "检测到 <content>、流体云切到“在写了”时短震一下。",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
            Switch(
                checked = contentStartVibrationEnabled,
                onCheckedChange = { contentStartVibrationEnabled = it },
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text("跳过 Google 在线字体")
                Text(
                    "避免角色卡等待无法连接的字体资源；页面将使用备用字体。",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
            Switch(
                checked = skipOnlineFontsEnabled,
                onCheckedChange = { skipOnlineFontsEnabled = it },
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text("外链图片代理")
                Text(
                    "通过 Worker 加速角色卡里的第三方图床图片。",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
            Switch(
                checked = imageProxyEnabled,
                onCheckedChange = { imageProxyEnabled = it },
            )
        }

        OutlinedTextField(
            value = imageProxyUrl,
            onValueChange = { imageProxyUrl = it },
            label = { Text("图片代理 Worker 地址") },
            singleLine = true,
            enabled = imageProxyEnabled,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Uri),
            modifier = Modifier.fillMaxWidth(),
        )

        OutlinedTextField(
            value = imageProxyExcludedHosts,
            onValueChange = { imageProxyExcludedHosts = it },
            label = { Text("图片代理排除域名/IP") },
            enabled = imageProxyEnabled,
            minLines = 2,
            supportingText = {
                Text("当前 ST 域名、当前页面域名、localhost 和内网地址会自动排除；这里可额外填写自有资源域名或 VPS IP。")
            },
            modifier = Modifier.fillMaxWidth(),
        )

        Spacer(modifier = Modifier.height(6.dp))

        Button(
            onClick = {
                val normalized = AppSettings.normalizeUrl(serverUrl)
                val normalizedHost = AppSettings.hostOf(normalized)
                AppSettings.setServerUrl(context, normalized)
                AppSettings.setWakeLockEnabled(context, wakeLockEnabled)
                AppSettings.setCompletionSoundEnabled(context, completionSoundEnabled)
                AppSettings.setCompletionMediaSoundEnabled(
                    context,
                    completionSoundEnabled && completionMediaSoundEnabled,
                )
                AppSettings.setContentStartVibrationEnabled(context, contentStartVibrationEnabled)
                AppSettings.setSkipOnlineFontsEnabled(context, skipOnlineFontsEnabled)
                AppSettings.setImageProxyEnabled(context, imageProxyEnabled)
                AppSettings.setImageProxyUrl(context, imageProxyUrl)
                AppSettings.setImageProxyExcludedHosts(context, imageProxyExcludedHosts)
                if (normalizedHost.isNotBlank() && username.isNotBlank() && password.isNotBlank()) {
                    credentialsStore.put(normalizedHost, credentials = SiteCredentials(username, password))
                }
                serverUrl = normalized
                imageProxyUrl = AppSettings.getImageProxyUrl(context)
                imageProxyExcludedHosts = AppSettings.getImageProxyExcludedHosts(context)
                Toast.makeText(context, "设置已保存", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text("保存设置")
        }

        Button(
            onClick = {
                val targetHost = AppSettings.hostOf(serverUrl)
                if (targetHost.isNotBlank()) credentialsStore.clearHost(targetHost)
                username = ""
                password = ""
                Toast.makeText(context, "已清除当前站点登录信息", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text("清除站点登录信息")
        }

        Button(
            onClick = onClose,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text("完成")
        }
    }
}

@Composable
private fun BridgeStatusCard(status: BridgeStatus) {
    val modeText = when (status.mode) {
        BridgeStatus.MODE_EXTENSION -> "扩展模式"
        BridgeStatus.MODE_FALLBACK -> "旧 Hook 兜底"
        else -> "未连接"
    }
    val lastEventText = status.lastEvent.ifBlank { "暂无" }
    val versionText = status.version.ifBlank { "未知" }
    val lastAtText = if (status.lastEventAt > 0) {
        android.text.format.DateFormat.format("MM-dd HH:mm:ss", status.lastEventAt).toString()
    } else {
        "暂无"
    }

    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        tonalElevation = 2.dp,
        color = MaterialTheme.colorScheme.surfaceVariant,
    ) {
        Column(
            modifier = Modifier.padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Text("Bridge 状态: $modeText", style = MaterialTheme.typography.titleSmall)
            Text(
                "版本: $versionText",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
            Text(
                "最近事件: $lastEventText / $lastAtText",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
    }
}
