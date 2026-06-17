package com.ttnet.org.chromium.base;

import android.os.StrictMode;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class h implements Closeable {
    private final StrictMode.ThreadPolicy a;
    private final StrictMode.VmPolicy b;

    private h(StrictMode.ThreadPolicy threadPolicy) {
        this.a = threadPolicy;
        this.b = null;
    }

    public static h a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        return new h(vmPolicy);
    }

    public static h d() {
        return new h(StrictMode.allowThreadDiskReads());
    }

    public static h h() {
        return new h(StrictMode.allowThreadDiskWrites());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        StrictMode.ThreadPolicy threadPolicy = this.a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    private h(StrictMode.VmPolicy vmPolicy) {
        this.a = null;
        this.b = vmPolicy;
    }
}
