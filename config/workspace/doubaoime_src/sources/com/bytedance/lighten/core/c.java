package com.bytedance.lighten.core;

import android.content.Context;

/* loaded from: classes.dex */
public class c {
    private static Context a;

    public static Context a() {
        return a;
    }

    public static void b(Context context) {
        a = context.getApplicationContext();
    }
}
