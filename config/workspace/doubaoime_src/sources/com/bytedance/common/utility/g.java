package com.bytedance.common.utility;

import android.content.Context;
import android.util.DisplayMetrics;

@Deprecated
/* loaded from: classes.dex */
public final class g {
    private static String a = "";
    private static int b = -1;

    public static int a(Context context) {
        if (b == -1 && context != null) {
            b = context.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        }
        return b;
    }

    public static String b(Context context) {
        if (com.bytedance.android.input.k.b.a.Y(a) && context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i = displayMetrics == null ? 0 : displayMetrics.widthPixels;
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            int i2 = displayMetrics2 != null ? displayMetrics2.heightPixels : 0;
            if (i > 0 && i2 > 0) {
                a = i + "*" + i2;
            }
        }
        return a;
    }
}
