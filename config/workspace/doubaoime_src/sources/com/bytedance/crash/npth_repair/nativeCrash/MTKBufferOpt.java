package com.bytedance.crash.npth_repair.nativeCrash;

import androidx.annotation.Keep;
import com.bytedance.crash.npth_repair.NpthRepair;

/* loaded from: classes.dex */
public class MTKBufferOpt {
    protected static boolean a;
    protected static int b;

    public static synchronized int a(int i) {
        synchronized (MTKBufferOpt.class) {
            if (!NpthRepair.b()) {
                return -1;
            }
            if (a) {
                return -2;
            }
            a = true;
            try {
                b = nOptMTKBuffer(i);
            } catch (Throwable unused) {
                b = -4;
            }
            return b;
        }
    }

    @Keep
    private static native int nOptMTKBuffer(int i);
}
