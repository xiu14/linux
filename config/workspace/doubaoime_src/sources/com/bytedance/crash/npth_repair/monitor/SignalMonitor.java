package com.bytedance.crash.npth_repair.monitor;

import android.os.Build;
import androidx.annotation.Keep;
import com.bytedance.crash.npth_repair.NpthRepair;
import com.bytedance.crash.npth_repair.a.b;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class SignalMonitor {

    /* renamed from: c, reason: collision with root package name */
    private static SignalMonitor f4649c;
    private b a;
    private int b = 1110;

    private SignalMonitor() {
    }

    public static SignalMonitor b() {
        if (f4649c == null) {
            synchronized (SignalMonitor.class) {
                if (f4649c == null) {
                    f4649c = new SignalMonitor();
                }
            }
        }
        return f4649c;
    }

    @Keep
    private native int nDumpSignalMonitor(String str);

    @Keep
    private native int nStartSignalMonitorWithSigType(int[] iArr);

    @Keep
    private native void nStopSignalMonitor();

    public synchronized int a(String str) {
        int i = this.b;
        if (i != 1111 && i != 1113) {
            return -1;
        }
        this.b = 1114;
        return nDumpSignalMonitor(str);
    }

    public synchronized int c(b bVar) {
        int i = this.b;
        if (i != 1110 && i != 1113) {
            return -2;
        }
        if (!NpthRepair.b()) {
            return -1;
        }
        this.a = bVar;
        int i2 = -6;
        if (bVar == null || (bVar.a(Build.VERSION.SDK_INT) && bVar.b(Build.BRAND))) {
            int[] iArr = null;
            if (bVar != null) {
                try {
                    JSONArray d2 = bVar.d("sigTypes");
                    if (d2 != null && d2.length() > 0) {
                        iArr = new int[d2.length()];
                        for (int i3 = 0; i3 < d2.length(); i3++) {
                            iArr[i3] = d2.optInt(i3);
                        }
                    }
                } catch (Throwable unused) {
                    i2 = -4;
                }
            }
            i2 = nStartSignalMonitorWithSigType(iArr);
        }
        if (i2 == 0) {
            this.b = 1111;
        } else {
            this.b = 1112;
        }
        return i2;
    }
}
