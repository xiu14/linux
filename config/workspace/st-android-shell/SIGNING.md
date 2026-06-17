# Tavern APK Signing

This project uses `tavern-debug.jks` as a fixed debug signing key.

Keep this file with the project when moving to another machine. If it is deleted
or replaced, Android will treat the new APK as a different signature and it will
not be able to reinstall over the existing Tavern app.

Debug signing config:

- Keystore: `tavern-debug.jks`
- Alias: `tavern-debug`
- Store password: `tavern_debug_2026`
- Key password: `tavern_debug_2026`
- SHA-256: `C1:BF:40:FF:6C:13:65:3D:FA:3B:68:2D:54:9D:23:50:19:BD:75:FA:94:CB:4D:69:AF:3B:F0:58:74:C8:2F:D8`

The installed package name is `com.stshell.app`, and the app label is `Tavern`.

Current usable APK:

- `Tavern-debug-v1.0.apk`
- `app/build/outputs/apk/debug/app-debug.apk`

Prefer installing `Tavern-debug-v1.0.apk`. It is copied from the Gradle output
after each successful build to avoid confusing it with stale `app-debug.apk`
files.

If Android reports a signature conflict, an older `com.stshell.app` signed with
a different key is still installed on the device, possibly under another user
or work profile.
