package com.bytedance.crash.npth_repair.nativeCrash;

import androidx.annotation.Keep;
import com.bytedance.crash.npth_repair.NpthRepair;
import com.bytedance.crash.npth_repair.a.a;

/* loaded from: classes.dex */
public class ScudoVmaLeakFixer {
    private static boolean a;
    private static int b;

    public static synchronized int a() {
        synchronized (ScudoVmaLeakFixer.class) {
            if (!NpthRepair.b()) {
                a.a("ScudoVmaLeakFixer", "not init yet, please make sure invoke NpthRepair.init first");
                return -1;
            }
            if (a) {
                a.a("ScudoVmaLeakFixer", "has fixed");
                return -2;
            }
            a = true;
            try {
                b = nFixScudoVmaLeak();
            } catch (Throwable unused) {
                b = -4;
            }
            return b;
        }
    }

    @Keep
    private static native int nFixScudoVmaLeak();
}
