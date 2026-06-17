package com.bytedance.common.push;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class d {
    static {
        new Handler(Looper.getMainLooper());
    }

    public static void a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b(runnable);
        } else {
            runnable.run();
        }
    }

    public static Future<?> b(Runnable runnable) {
        return com.bytedance.common.utility.h.a.b().submit(runnable);
    }
}
