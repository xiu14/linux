package com.facebook.common.time;

import android.os.SystemClock;

@e.c.c.d.c
/* loaded from: classes2.dex */
public class RealtimeSinceBootClock implements b {
    private static final RealtimeSinceBootClock a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @e.c.c.d.c
    public static RealtimeSinceBootClock get() {
        return a;
    }

    @Override // com.facebook.common.time.b
    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
