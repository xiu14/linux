package com.bytedance.retrofit2;

import android.util.Log;

/* loaded from: classes2.dex */
public class J {
    static int a = 4;

    public static void a(String str, String str2) {
        if (str2 != null && a <= 3) {
            Log.d(str, str2);
        }
    }

    public static void b(int i) {
        a = i;
    }
}
