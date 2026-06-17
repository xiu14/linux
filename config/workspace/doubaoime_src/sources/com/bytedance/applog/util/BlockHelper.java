package com.bytedance.applog.util;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class BlockHelper {
    private static long a = 100;
    private static volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static volatile long f3896c = -1;

    public static void beginBlock() {
        b = true;
        f3896c = SystemClock.elapsedRealtime();
    }

    public static void endBlock() {
        b = false;
        f3896c = -1L;
    }

    public static long getBlockInterval() {
        return a;
    }

    public static void setBlockInterval(long j) {
        a = Math.max(j, 1L);
    }

    public static void tryBlock() {
        while (b) {
            if (b) {
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - f3896c) < com.heytap.mcssdk.constant.a.q) {
                        Thread.sleep(a);
                    } else {
                        endBlock();
                    }
                } catch (InterruptedException e2) {
                    com.bytedance.applog.w.k.z().i("BlockHelper: block interrupted!", e2, new Object[0]);
                }
            }
        }
    }
}
