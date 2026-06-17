package com.bytedance.apm.D;

/* loaded from: classes.dex */
public class c {
    private static b a = new a();

    public static boolean a(String str) {
        return a.b(str);
    }

    public static boolean b(String str) {
        return a.d(str);
    }

    public static boolean c(String str, String str2) {
        return a.a(str, str2);
    }

    public static boolean d(String str) {
        return a.c(str);
    }

    public static boolean e(String str) {
        return a.getServiceSwitch(str);
    }

    public static void f(b bVar) {
        a = bVar;
    }
}
