package com.ttnet.org.chromium.base;

import android.util.Log;

/* loaded from: classes2.dex */
public class e {
    static int a = 4;

    public static void a(String str, String str2) {
        if (str2 != null && a <= 3) {
            Log.d(str, str2);
        }
    }

    public static boolean b() {
        return a <= 3;
    }

    public static void c(int i) {
        a = i;
    }
}
