# Tavern Android Shell

Tavern is an Android WebView shell for SillyTavern.

## Current Usable APK

Use this APK for manual installation:

```text
Tavern-debug-v1.0.apk
```

The Gradle build output is:

```text
app/build/outputs/apk/debug/app-debug.apk
```

Both files should be the same after a successful build. The root-level
`Tavern-debug-v1.0.apk` is copied from the Gradle output to avoid confusing it
with older `app-debug.apk` files.

## Signing

This project uses a fixed debug keystore:

```text
tavern-debug.jks
```

Signing identity:

```text
Alias: tavern-debug
Store password: tavern_debug_2026
Key password: tavern_debug_2026
SHA-256: C1:BF:40:FF:6C:13:65:3D:FA:3B:68:2D:54:9D:23:50:19:BD:75:FA:94:CB:4D:69:AF:3B:F0:58:74:C8:2F:D8
```

Do not delete or replace `tavern-debug.jks`. If the key changes, Android will
report a signature conflict when installing over the existing Tavern app.

## Package Info

```text
Application ID: com.stshell.app
App name: Tavern
Version name: 1.0
Version code: 10
```

## Build

```bash
./gradlew assembleDebug
cp app/build/outputs/apk/debug/app-debug.apk Tavern-debug-v1.0.apk
```

Optional signing check:

```bash
apksigner verify --print-certs Tavern-debug-v1.0.apk
```

## Installation Notes

- Install `Tavern-debug-v1.0.apk`, not any stale root-level `app-debug.apk`.
- If Android says the signature conflicts, an older `com.stshell.app` signed
  with a different key is still installed somewhere.
- Check all users/work profiles on the phone if uninstalling from the launcher
  is not enough.
- ADB check:

```bash
adb shell pm list packages --user all | grep com.stshell.app
```

## Performance Notes

- Do not permanently bridge all `console.log/info/debug` messages to Android
  Logcat. That made SillyTavern startup jump from about 10 seconds to nearly
  2 minutes when many extensions were active.
- Keep normal logging to `ERROR` and `WARNING` only.
- Bridge event logging is intentionally quiet. The shell records key bridge
  status internally and only logs important lifecycle events instead of every
  streaming heartbeat.
- The Tavern Helper iframe diagnostics function exists in the code, but should
  not be injected by default. Use it only for temporary debugging.

## Feature Notes

- Google online fonts can be skipped to avoid slow or blocked font loading.
- External images can be proxied through the configured Worker.
- Image proxy automatically excludes the current ST host, current page host,
  Worker host, localhost, and private LAN addresses.
- Extra image proxy exclusions can be configured in Tavern settings.
- SillyTavern 1.18+ generation monitoring has been moved to a real
  SillyTavern extension instead of relying only on code injected by the Android
  WebView shell. This is the preferred path because the extension runs inside
  SillyTavern's own extension lifecycle and can use ST context/events directly.
  The Android shell still keeps the old injected hook as a delayed fallback if
  the extension is not installed or does not load.
- Local extension source is in the ST workspace:
  `/config/workspace/st开发区/st/public/scripts/extensions/third-party/tavern-native-bridge`.
  The important files are `manifest.json`, `index.js`, and `README.md`.
- Install the extension on the real SillyTavern server at:
  `public/scripts/extensions/third-party/tavern-native-bridge`.
- A packaged copy is available in this Android shell project:
  `tavern-native-bridge-extension.tar.gz`. Extract it into the SillyTavern
  server's `public/scripts/extensions/third-party/` directory so the final
  server path becomes
  `public/scripts/extensions/third-party/tavern-native-bridge`.
- Tavern settings show the current Bridge status after SillyTavern has loaded:
  extension mode, fallback hook mode, or not connected yet. If it shows "not
  connected" immediately after app launch, open SillyTavern once and let the
  bridge emit `st_bridge_ready`.
- To verify that the extension path is active, open SillyTavern in Tavern and
  then open Tavern settings. Bridge status should show extension mode and
  version `0.1.0`. If it shows fallback hook mode, the APK is working but the
  SillyTavern extension is not being used.
- The bridge extension currently emits `st_bridge_ready`,
  `generation_pending`, `generation_started`, `generation_streaming`,
  `generation_content_started`, `generation_ended`, and
  `generation_stopped`.
- The Android shell records the bridge mode/version/last event so we can verify
  whether generation status is coming from the SillyTavern extension or from
  the old injected fallback hook.
