package com.bytedance.monitor.util.thread;

import com.bytedance.monitor.util.thread.a;
import java.util.Locale;

/* loaded from: classes.dex */
public class c {
    public static d a() {
        int i = a.i;
        return a.d.a;
    }

    public static void b(f fVar, String str, String str2) {
        if (fVar == null || !fVar.a()) {
            return;
        }
        fVar.b(str, String.format(Locale.CHINA, "[callerThread: %s] \n %s", Thread.currentThread().getName(), str2));
    }

    public static e c(String str, Runnable runnable) {
        return new b(str, AsyncTaskType.IO, runnable);
    }

    public static e d(String str, Runnable runnable) {
        return new b(str, AsyncTaskType.LIGHT_WEIGHT, runnable);
    }
}
