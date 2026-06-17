package com.heytap.mcssdk.utils;

import android.util.Log;

/* loaded from: classes2.dex */
public class e {
    public static final String a = "mcssdk---";
    private static String b = "MCS";

    /* renamed from: c, reason: collision with root package name */
    private static boolean f6925c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f6926d = false;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f6927e = true;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f6928f = true;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f6929g = true;
    private static String h = "-->";
    private static boolean i = true;

    public static String a() {
        return b;
    }

    public static void a(Exception exc) {
        if (!f6929g || exc == null) {
            return;
        }
        Log.e(a, exc.getMessage());
    }

    public static void a(String str) {
        if (f6925c && i) {
            Log.v(a, b + h + str);
        }
    }

    public static void a(String str, String str2) {
        if (f6925c && i) {
            Log.v(str, b + h + str2);
        }
    }

    public static void a(String str, Throwable th) {
        if (f6929g) {
            Log.e(str, th.toString());
        }
    }

    public static void a(boolean z) {
        f6925c = z;
    }

    public static void b(String str) {
        if (f6927e && i) {
            Log.d(a, b + h + str);
        }
    }

    public static void b(String str, String str2) {
        if (f6927e && i) {
            Log.d(str, b + h + str2);
        }
    }

    public static void b(boolean z) {
        f6927e = z;
    }

    public static boolean b() {
        return f6925c;
    }

    public static void c(String str) {
        if (f6926d && i) {
            Log.i(a, b + h + str);
        }
    }

    public static void c(String str, String str2) {
        if (f6926d && i) {
            Log.i(str, b + h + str2);
        }
    }

    public static void c(boolean z) {
        f6926d = z;
    }

    public static boolean c() {
        return f6927e;
    }

    public static void d(String str) {
        if (f6928f && i) {
            Log.w(a, b + h + str);
        }
    }

    public static void d(String str, String str2) {
        if (f6928f && i) {
            Log.w(str, b + h + str2);
        }
    }

    public static void d(boolean z) {
        f6928f = z;
    }

    public static boolean d() {
        return f6926d;
    }

    public static void e(String str) {
        if (f6929g && i) {
            Log.e(a, b + h + str);
        }
    }

    public static void e(String str, String str2) {
        if (f6929g && i) {
            Log.e(str, b + h + str2);
        }
    }

    public static void e(boolean z) {
        f6929g = z;
    }

    public static boolean e() {
        return f6928f;
    }

    public static void f(String str) {
        b = str;
    }

    public static void f(boolean z) {
        i = z;
        boolean z2 = z;
        f6925c = z2;
        f6927e = z2;
        f6926d = z2;
        f6928f = z2;
        f6929g = z2;
    }

    public static boolean f() {
        return f6929g;
    }

    public static void g(String str) {
        h = str;
    }

    public static boolean g() {
        return i;
    }

    public static String h() {
        return h;
    }
}
