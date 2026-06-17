package com.bytedance.crash.upload;

import com.bytedance.crash.jni.NativeBridge;

/* loaded from: classes.dex */
public final class f implements Runnable {
    private static long a;

    class a implements Runnable {
        a(f fVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.crash.upload.a.a();
        }
    }

    public static void a(long j) {
        a = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.bytedance.android.input.k.b.a.W("LaunchScanner run");
            if (!com.bytedance.crash.util.d.b()) {
                com.bytedance.android.input.k.b.a.W("LaunchScanner, network is unavailable");
                com.bytedance.crash.runtime.b.f(new f(), 1000L);
                return;
            }
            com.bytedance.android.input.k.b.a.W("net available");
            com.bytedance.crash.monitor.a e2 = com.bytedance.crash.monitor.l.e();
            if (e2 != null) {
                com.bytedance.crash.Z.d.c();
                com.bytedance.android.input.k.b.a.W("upload crash");
                com.bytedance.crash.crash.c.g(e2, a);
                com.bytedance.crash.L.j.s(e2, a);
                com.bytedance.crash.Z.d.i();
                l.d().i();
                com.bytedance.crash.K.a.f(e2);
            }
            NativeBridge.J();
            long j = a;
            if (j > 0) {
                com.bytedance.crash.runtime.b.f(new a(this), j);
            }
        } catch (Throwable th) {
            com.bytedance.crash.Q.b.f("NPTH_ANR_ERROR_LaunchScanner", th);
            com.bytedance.android.input.k.b.a.F(th);
        }
    }
}
