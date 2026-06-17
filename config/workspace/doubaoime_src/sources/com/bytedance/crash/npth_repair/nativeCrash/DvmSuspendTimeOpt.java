package com.bytedance.crash.npth_repair.nativeCrash;

import android.util.Log;
import androidx.annotation.Keep;
import com.bytedance.crash.npth_repair.NpthRepair;

/* loaded from: classes.dex */
public class DvmSuspendTimeOpt {
    protected static boolean a;
    protected static int b;

    public static synchronized int a() {
        synchronized (DvmSuspendTimeOpt.class) {
            if (!NpthRepair.b()) {
                Log.d("DvmSuspendTimeOpt", "not init yet, please make sure invoke NpthRepair.init first");
                return -1;
            }
            if (a) {
                Log.d("DvmSuspendTimeOpt", "has fixed");
                return -2;
            }
            a = true;
            try {
                b = nSuspendTimeOpt();
            } catch (Throwable th) {
                th.printStackTrace();
                b = -4;
            }
            return b;
        }
    }

    @Keep
    private static native int nSuspendTimeOpt();
}
