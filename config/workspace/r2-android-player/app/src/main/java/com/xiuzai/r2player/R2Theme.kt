package com.xiuzai.r2player

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val R2DarkColorScheme = darkColorScheme(
    primary = Color(0xFF6EA8FF),
    onPrimary = Color(0xFF0B1220),
    secondary = Color(0xFF8FB8D8),
    onSecondary = Color(0xFF0E1621),
    background = Color(0xFF05070A),
    onBackground = Color(0xFFE7EDF5),
    surface = Color(0xFF0C1016),
    onSurface = Color(0xFFE7EDF5),
    surfaceVariant = Color(0xFF141B24),
    onSurfaceVariant = Color(0xFFB7C2CF),
    outline = Color(0xFF314152),
)

@Composable
fun R2Theme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = R2DarkColorScheme,
        content = content,
    )
}
