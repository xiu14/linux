package com.bytedance.feedbackerlib.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class k {
    private static final Handler a = new Handler(Looper.getMainLooper());
    private static ExecutorService b;

    public static void a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }

    public static void b(Runnable runnable, Context context) {
        if (context == null) {
            a(runnable);
            return;
        }
        String a2 = h.a(context);
        if (a2 == null || !a2.endsWith(":feedbacker")) {
            a(runnable);
        } else {
            runnable.run();
        }
    }

    public static void c(Runnable runnable) {
        e();
        b.execute(runnable);
    }

    public static ExecutorService d() {
        e();
        return b;
    }

    private static void e() {
        if (b == null) {
            synchronized (k.class) {
                if (b == null) {
                    b = Executors.newFixedThreadPool(8);
                }
            }
        }
    }
}
