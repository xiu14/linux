package com.facebook.common.time;

import android.os.SystemClock;

@e.c.c.d.c
/* loaded from: classes2.dex */
public class AwakeTimeSinceBootClock implements b {

    @e.c.c.d.c
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @e.c.c.d.c
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // com.facebook.common.time.b
    @e.c.c.d.c
    public long now() {
        return SystemClock.uptimeMillis();
    }

    @e.c.c.d.c
    public long nowNanos() {
        return System.nanoTime();
    }
}
