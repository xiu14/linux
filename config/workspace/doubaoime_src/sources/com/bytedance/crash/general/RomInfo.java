package com.bytedance.crash.general;

import androidx.annotation.Keep;
import java.io.Serializable;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public class RomInfo implements Serializable {
    private static final String FILE_NAME = "rom.inf";
    public static final String KEY_OS_TYPE = "os";
    private static final String KEY_ROM_HARMONY_OS = "is_hm_os";
    private static final String KEY_ROM_INCREMENTAL = "rom";
    public static final String KEY_ROM_KERNEL_VERSION = "kernel_version";
    public static final String KEY_ROM_OS_API = "os_api";
    public static final String KEY_ROM_OS_VERSION = "os_version";
    private static final String KEY_ROM_VERSION = "rom_version";
    private static final long serialVersionUID = 1;
    private boolean mIsHarmonyOs;
    private String mKernelVersion;
    private int mOsApiLevel;
    private String mOsVersion;
    private String mRandomDeviceId;
    private String mRomIncremental;
    private String mRomVersion;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) == false) goto L30;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.bytedance.crash.general.RomInfo get(@androidx.annotation.NonNull java.io.File r4) {
        /*
            java.lang.String r0 = "unknown"
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "rom.inf"
            r1.<init>(r4, r2)
            java.lang.String r4 = com.bytedance.crash.general.c.c()
            java.lang.Object r2 = com.bytedance.crash.util.a.n(r1)     // Catch: java.lang.Exception -> L14
            com.bytedance.crash.general.RomInfo r2 = (com.bytedance.crash.general.RomInfo) r2     // Catch: java.lang.Exception -> L14
            goto L15
        L14:
            r2 = 0
        L15:
            if (r2 == 0) goto L23
            java.lang.String r3 = r2.mRomVersion
            java.lang.String r3 = java.lang.String.valueOf(r3)
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L73
        L23:
            com.bytedance.crash.general.RomInfo r2 = new com.bytedance.crash.general.RomInfo
            r2.<init>()
            r2.mRomVersion = r4
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            java.lang.String r3 = "."
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L35
            goto L3b
        L35:
            java.lang.String r3 = ".0"
            java.lang.String r4 = e.a.a.a.a.s(r4, r3)
        L3b:
            r2.mOsVersion = r4
            java.lang.String r4 = "ohos.utils.system.SystemCapability"
            java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L44
            r4 = 1
            goto L45
        L44:
            r4 = 0
        L45:
            r2.mIsHarmonyOs = r4
            java.lang.String r4 = "os.version"
            java.lang.String r4 = java.lang.System.getProperty(r4)     // Catch: java.lang.Throwable -> L4e
            goto L4f
        L4e:
            r4 = r0
        L4f:
            r2.mKernelVersion = r4
            java.lang.String r4 = android.os.Build.VERSION.INCREMENTAL
            if (r4 != 0) goto L56
            goto L57
        L56:
            r0 = r4
        L57:
            r2.mRomIncremental = r0
            int r4 = android.os.Build.VERSION.SDK_INT
            r2.mOsApiLevel = r4
            java.util.UUID r4 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L6c
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L6c
            goto L6e
        L6c:
            java.lang.String r4 = "0000-1111-2222-3333-4444"
        L6e:
            r2.mRandomDeviceId = r4
            com.bytedance.crash.util.a.w(r1, r2)
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.general.RomInfo.get(java.io.File):com.bytedance.crash.general.RomInfo");
    }

    String getRandomDeviceId() {
        return this.mRandomDeviceId;
    }

    void putTo(JSONObject jSONObject) {
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_OS_TYPE, "Android");
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_ROM_OS_VERSION, this.mOsVersion);
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_ROM_OS_API, Integer.valueOf(this.mOsApiLevel));
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_ROM_HARMONY_OS, Boolean.valueOf(this.mIsHarmonyOs));
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_ROM_KERNEL_VERSION, this.mKernelVersion);
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_ROM_INCREMENTAL, this.mRomIncremental);
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_ROM_VERSION, this.mRomVersion);
    }
}
