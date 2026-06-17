package com.obric.common.upgrade.util;

import android.util.Log;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class c {
    private static boolean a;

    public static final void a(String str) {
        l.f(str, "msg");
        if (a) {
            Log.d("OAppUpgrade", str);
        }
    }

    public static final void b(String str) {
        l.f(str, "msg");
        if (a) {
            Log.e("OAppUpgrade", str);
        }
    }

    public static final void c(String str) {
        l.f(str, "msg");
        if (a) {
            Log.i("OAppUpgrade", str);
        }
    }

    public static final void d(boolean z) {
        a = z;
    }
}
