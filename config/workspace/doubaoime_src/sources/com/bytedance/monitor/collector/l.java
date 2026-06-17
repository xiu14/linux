package com.bytedance.monitor.collector;

import android.system.Os;
import android.system.OsConstants;

/* loaded from: classes.dex */
public class l {
    private static long a = -1;
    private static long b = -1;

    public static long a() {
        if (b == -1) {
            long j = a;
            if (j <= 0) {
                j = Os.sysconf(OsConstants._SC_CLK_TCK);
                if (j <= 0) {
                    j = 100;
                }
                a = j;
            }
            b = 1000 / j;
        }
        return b;
    }
}
