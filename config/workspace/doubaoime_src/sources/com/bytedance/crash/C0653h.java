package com.bytedance.crash;

import android.os.Build;

/* renamed from: com.bytedance.crash.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653h {
    private static boolean a = false;
    private static boolean b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f4625c;

    public static boolean a() {
        return a;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30 && f4625c;
    }

    public static boolean c() {
        return b;
    }

    public static void d(boolean z) {
        f4625c = z;
    }

    public static void e(boolean z) {
        a = z;
    }

    public static void f(boolean z) {
        b = z;
    }
}
