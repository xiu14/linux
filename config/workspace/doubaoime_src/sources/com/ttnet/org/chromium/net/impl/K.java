package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class K {
    private static final Object a = new Object();
    private static int b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8719c = 0;

    public static String a(Context context) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        synchronized (a) {
            if (b == 0) {
                try {
                    b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            i = b;
        }
        sb.append(i);
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append("; Build/");
            sb.append(str2);
        }
        sb.append(";");
        sb.append(" Cronet/");
        sb.append("TTNetVersion:8e1e9010 2026-04-20 QuicVersion:21ac1950 2025-11-18");
        sb.append(')');
        return sb.toString();
    }
}
