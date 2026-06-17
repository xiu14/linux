package com.bytedance.apm.y;

import android.util.Log;

/* loaded from: classes.dex */
public class e {
    public static void a(String str, String str2, Object... objArr) {
        if (objArr.length != 0) {
            str2 = String.format(str2, objArr);
        }
        Log.e(str, str2);
    }

    public static void b(String str, String str2, Object... objArr) {
        if (objArr.length != 0) {
            str2 = String.format(str2, objArr);
        }
        Log.i(str, str2);
    }

    public static void c(String str, String str2, Object... objArr) {
        if (objArr.length != 0) {
            str2 = String.format(str2, objArr);
        }
        Log.w(str, str2);
    }
}
