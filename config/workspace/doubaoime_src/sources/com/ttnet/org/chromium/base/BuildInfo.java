package com.ttnet.org.chromium.base;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes2.dex */
public class BuildInfo {
    public String a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public String f8546c;

    /* renamed from: d, reason: collision with root package name */
    public long f8547d;

    /* renamed from: e, reason: collision with root package name */
    public String f8548e;

    /* renamed from: f, reason: collision with root package name */
    public String f8549f;

    /* renamed from: g, reason: collision with root package name */
    public String f8550g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;

    private static class a {
        private static BuildInfo a = new BuildInfo();
    }

    @VisibleForTesting
    BuildInfo() {
        this.a = "";
        this.f8546c = "";
        this.f8548e = "";
        this.f8549f = "";
        this.f8550g = "";
        this.h = "";
        this.i = "";
        try {
            Context b = c.b();
            String packageName = b.getPackageName();
            PackageManager packageManager = b.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
            this.b = longVersionCode;
            this.f8546c = packageName;
            this.f8547d = longVersionCode;
            this.f8548e = a(packageInfo.versionName);
            b.getApplicationInfo();
            this.a = a(packageManager.getApplicationLabel(packageInfo.applicationInfo));
            this.f8549f = a(packageManager.getInstallerPackageName(this.f8546c));
            this.i = "Not Enabled";
            this.f8550g = TextUtils.join(", ", Build.SUPPORTED_ABIS);
            String str = Build.FINGERPRINT;
            this.h = str.substring(0, Math.min(str.length(), 128));
            UiModeManager uiModeManager = (UiModeManager) b.getSystemService("uimode");
            this.j = uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
            this.k = b.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
        } catch (Exception e2) {
            d.a("BuildInfo", "NameNotFoundException: " + e2, new Object[0]);
        }
    }

    private static String a(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0101  */
    @com.ttnet.org.chromium.base.annotations.CalledByNative
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String[] getAll() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.BuildInfo.getAll():java.lang.String[]");
    }
}
