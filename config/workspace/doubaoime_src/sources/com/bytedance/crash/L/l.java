package com.bytedance.crash.L;

import android.os.Looper;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.jni.NativeBridge;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
class l implements Runnable {
    final /* synthetic */ m a;

    class a implements Runnable {
        a(l lVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (m.class) {
                try {
                    Thread thread = Looper.getMainLooper().getThread();
                    Field declaredField = Thread.class.getDeclaredField("nativePeer");
                    declaredField.setAccessible(true);
                    int nAnrNativeProfilerJvmStart = NativeBridge.nAnrNativeProfilerJvmStart(declaredField.getLong(thread));
                    int t = NativeBridge.t();
                    int q = NativeBridge.q();
                    com.bytedance.crash.monitor.a e2 = com.bytedance.crash.monitor.l.e();
                    if (e2 != null) {
                        e2.a("jvm_monitor_state", String.valueOf(t));
                        e2.a("apex_version", String.valueOf(q));
                    }
                    com.bytedance.android.input.k.b.a.p("setMonitorJvm " + nAnrNativeProfilerJvmStart + ", " + t);
                } catch (Throwable unused) {
                }
            }
        }
    }

    l(m mVar) {
        this.a = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.bytedance.crash.monitor.b.f()) {
            return;
        }
        this.a.a = NativeBridge.nAnrNativeProfilerStart();
        com.bytedance.crash.runtime.b.f(new a(this), WsConstants.EXIT_DELAY_TIME);
    }
}
