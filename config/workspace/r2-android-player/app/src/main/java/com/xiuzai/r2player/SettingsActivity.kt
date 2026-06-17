package com.xiuzai.r2player

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
            R2Theme {
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
    val initial = remember { AppSettings.load(context) }
    var appTitle by rememberSaveable { mutableStateOf(initial.appTitle) }
    var alistBaseUrl by rememberSaveable { mutableStateOf(initial.alistBaseUrl) }
    var alistToken by rememberSaveable { mutableStateOf(initial.alistToken) }
    var alistUsername by rememberSaveable { mutableStateOf(initial.alistUsername) }
    var alistPassword by rememberSaveable { mutableStateOf(initial.alistPassword) }
    var rootPaths by rememberSaveable { mutableStateOf(initial.rootPaths.joinToString(",")) }
    var showSecrets by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
    ) {
        Text("R2 Player 设置", style = MaterialTheme.typography.headlineSmall)
        Text(
            "这里的配置保存在本机。Token 留空时会使用账号密码登录 AList。",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )

        OutlinedTextField(
            value = appTitle,
            onValueChange = { appTitle = it },
            label = { Text("标题") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
        )

        OutlinedTextField(
            value = alistBaseUrl,
            onValueChange = { alistBaseUrl = it },
            label = { Text("AList 地址") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Uri),
            modifier = Modifier.fillMaxWidth(),
        )

        OutlinedTextField(
            value = rootPaths,
            onValueChange = { rootPaths = it },
            label = { Text("根目录，多个用英文逗号分隔") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text("显示 Token/密码")
            Switch(checked = showSecrets, onCheckedChange = { showSecrets = it })
        }

        OutlinedTextField(
            value = alistToken,
            onValueChange = { alistToken = it },
            label = { Text("AList Token") },
            visualTransformation = if (showSecrets) VisualTransformation.None else PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
        )

        OutlinedTextField(
            value = alistUsername,
            onValueChange = { alistUsername = it },
            label = { Text("AList 用户名") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
        )

        OutlinedTextField(
            value = alistPassword,
            onValueChange = { alistPassword = it },
            label = { Text("AList 密码") },
            singleLine = true,
            visualTransformation = if (showSecrets) VisualTransformation.None else PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
        )

        Button(
            onClick = {
                val next = R2Config(
                    appTitle = appTitle.ifBlank { "R2 Player" },
                    alistBaseUrl = AppSettings.normalizeBaseUrl(alistBaseUrl),
                    alistToken = alistToken,
                    alistUsername = alistUsername,
                    alistPassword = alistPassword,
                    rootPaths = AppSettings.parseRootPaths(rootPaths),
                )
                AppSettings.save(context, next)
                Toast.makeText(context, "设置已保存", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text("保存")
        }

        Button(
            onClick = onClose,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text("完成")
        }
    }
}
