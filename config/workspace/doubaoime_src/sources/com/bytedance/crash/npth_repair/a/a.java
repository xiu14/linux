package com.bytedance.crash.npth_repair.a;

import android.util.Log;

/* loaded from: classes.dex */
public class a {
    private static boolean a = false;

    public static void a(String str, Object obj) {
        if (a) {
            Log.i("NpthRepair", str + " " + obj);
        }
    }

    public static void b(boolean z) {
        a = z;
    }
}
