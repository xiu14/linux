# Project Identity: Tavern Android Shell

This directory is only for the SillyTavern Android WebView shell.

- App name: Tavern
- Android applicationId: `com.stshell.app`
- Kotlin package root: `com.stshell.app`
- Primary purpose: open SillyTavern in WebView and provide native Android bridge features.
- Native features here include Basic Auth, file upload/download, WakeLock, and ColorOS/Android live update notifications.

Do not add R2 Player, AList, ExoPlayer, or media library browser code to this project.
Those belong in `/config/workspace/r2-android-player`.
