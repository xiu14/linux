package com.huawei.hianalytics.a;

import com.huawei.hianalytics.e.e;

/* loaded from: classes2.dex */
public abstract class c {
    public static String a(String str, String str2) {
        com.huawei.hianalytics.e.c k = k(str, str2);
        return k != null ? k.k() : "";
    }

    public static void a(String str, String str2, String str3) {
        com.huawei.hianalytics.e.c k = k(str2, str3);
        if (k != null) {
            k.g(str);
        }
    }

    public static String b(String str, String str2) {
        com.huawei.hianalytics.e.c k = k(str, str2);
        return k != null ? k.f() : "";
    }

    public static String c(String str, String str2) {
        com.huawei.hianalytics.e.c k = k(str, str2);
        return k != null ? k.g() : "";
    }

    public static String d(String str, String str2) {
        com.huawei.hianalytics.e.c k = k(str, str2);
        return k != null ? k.h() : "";
    }

    public static String e(String str, String str2) {
        com.huawei.hianalytics.e.c k = k(str, str2);
        return k != null ? k.i() : "";
    }

    public static String f(String str, String str2) {
        com.huawei.hianalytics.e.c k = k(str, str2);
        return k != null ? k.j() : "";
    }

    public static int g(String str, String str2) {
        com.huawei.hianalytics.e.c k = k(str, str2);
        if (k != null) {
            return k.b();
        }
        return 7;
    }

    public static int h(String str, String str2) {
        com.huawei.hianalytics.e.c k = k(str, str2);
        if (k != null) {
            return k.c();
        }
        return 10;
    }

    public static boolean i(String str, String str2) {
        com.huawei.hianalytics.e.c k = k(str, str2);
        if (k != null) {
            return k.l();
        }
        return true;
    }

    public static String j(String str, String str2) {
        com.huawei.hianalytics.e.c k = k(str, str2);
        return k != null ? k.m() : "";
    }

    private static com.huawei.hianalytics.e.c k(String str, String str2) {
        e a = com.huawei.hianalytics.e.a.a().a(str);
        if (a != null) {
            return a.a(str2);
        }
        return null;
    }
}
