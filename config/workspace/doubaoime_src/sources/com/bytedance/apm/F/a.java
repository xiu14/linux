package com.bytedance.apm.F;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;

/* loaded from: classes.dex */
public class a {
    private static volatile Handler a;

    static {
        new HashSet();
        a = new Handler(Looper.getMainLooper());
    }

    public static Handler a() {
        return a;
    }
}
