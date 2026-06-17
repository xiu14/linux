package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.ttnet.org.chromium.net.impl.CronetLogger;

/* renamed from: com.ttnet.org.chromium.net.impl.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0765e {
    private static final CronetLogger a = new C();

    private C0765e() {
    }

    public static CronetLogger a(Context context, CronetLogger.CronetSource cronetSource) {
        boolean z;
        Class cls;
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle != null) {
            z = bundle.getBoolean("com.ttnet.org.chromium.net.CronetMetricsOptIn");
            if (z) {
            }
            return a;
        }
        z = false;
        if (z || Build.VERSION.SDK_INT < 30) {
            return a;
        }
        try {
            cls = C0765e.class.getClassLoader().loadClass("com.google.net.cronet.telemetry.CronetLoggerImpl").asSubclass(CronetLogger.class);
        } catch (ClassNotFoundException unused2) {
            cls = null;
        }
        if (cls == null) {
            return a;
        }
        try {
            return (CronetLogger) cls.getConstructor(Integer.TYPE).newInstance(1);
        } catch (Exception unused3) {
            return a;
        }
    }

    public static CronetLogger b() {
        return a;
    }
}
