package com.bytedance.crash.npth_repair;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.bytedance.crash.npth_repair.a.a;

/* loaded from: classes.dex */
public class NpthRepair {
    public static Context a = null;
    private static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f4646c = false;

    /* renamed from: d, reason: collision with root package name */
    private static int f4647d = -1;

    public static synchronized int a(@NonNull Context context, boolean z) {
        synchronized (NpthRepair.class) {
            if (f4646c) {
                if (z) {
                    Log.d("NpthRepair", "already do init");
                }
                return f4647d;
            }
            a.b(z);
            f4646c = true;
            a = context;
            if (!b) {
                try {
                    e.b.h.a.a("npth_repair", context);
                    b = true;
                } catch (Throwable unused) {
                    Log.d("NpthRepair", "load so fail");
                }
            }
            if (b) {
                try {
                    a.b(z);
                    if (b) {
                        nSetDebuggable(z);
                    }
                    f4647d = nInit(Build.VERSION.SDK_INT, z);
                } catch (Throwable unused2) {
                    f4647d = -3;
                }
            } else {
                f4647d = -5;
            }
            return f4647d;
        }
    }

    public static boolean b() {
        return f4647d == 0;
    }

    @Keep
    private static native boolean nGetDebuggable();

    @Keep
    private static native int nInit(int i, boolean z);

    @Keep
    private static native void nSetDebuggable(boolean z);
}
