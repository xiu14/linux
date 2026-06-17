package com.huawei.e.a.a.b.g;

import android.content.Context;
import android.util.Log;

/* loaded from: classes2.dex */
public class b {
    private static Context a;

    private static String a(String str) {
        return e.a.a.a.a.s("SecurityComp10201304: ", str);
    }

    public static void b(String str, String str2, Throwable th) {
        Log.e(a(str), str2, th);
    }

    public static void c(String str, String str2) {
        Log.e(a(str), str2);
    }

    public static void d(String str, String str2) {
        Log.i(a(str), str2);
    }

    public static void e(String str, String str2) {
        Log.w(a(str), str2);
    }

    public static Context f() {
        return a;
    }

    public static void g(Context context) {
        if (context == null || a != null) {
            return;
        }
        a = context.getApplicationContext();
    }
}
