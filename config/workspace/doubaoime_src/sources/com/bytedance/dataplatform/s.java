package com.bytedance.dataplatform;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class s {
    static ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();

    public static Future a(Runnable runnable) {
        return a.submit(runnable);
    }
}
