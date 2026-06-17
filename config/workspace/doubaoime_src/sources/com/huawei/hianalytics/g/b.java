package com.huawei.hianalytics.g;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class b {
    private static c a = new c();

    public static void a(Context context, int i, String str) {
        a.a(context, i, str);
        a.a(str, "\n============================================================================\n====== HiAnalytics-2.1.4.308\n============================================================================");
    }

    public static void a(String str, String str2) {
        a.a(3, str, str2);
    }

    public static void a(String str, String str2, Object... objArr) {
        if (!a() || str2 == null) {
            return;
        }
        a(str, String.format(str2, objArr));
    }

    public static boolean a() {
        return a.a(3);
    }

    public static void b(String str, String str2) {
        a.a(4, str, str2);
    }

    public static void b(String str, String str2, Object... objArr) {
        if (!b() || str2 == null) {
            return;
        }
        b(str, String.format(str2, objArr));
    }

    public static boolean b() {
        return a.a(4);
    }

    public static void c(String str, String str2) {
        a.a(5, str, str2);
    }

    public static void c(String str, String str2, Object... objArr) {
        if (!c() || str2 == null) {
            return;
        }
        c("HiAnalytics_" + str, String.format(str2, objArr));
    }

    public static boolean c() {
        return a.a(5);
    }

    public static void d(String str, String str2) {
        a.a(6, str, str2);
    }
}
