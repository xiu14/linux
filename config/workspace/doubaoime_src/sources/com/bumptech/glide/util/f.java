package com.bumptech.glide.util;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class f {
    private static final double a = 1.0d / Math.pow(10.0d, 6.0d);
    public static final /* synthetic */ int b = 0;

    public static double a(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * a;
    }
}
