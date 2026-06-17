package com.bytedance.crash.L;

import com.bytedance.crash.D;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.jni.NativeBridge;

/* loaded from: classes.dex */
class o implements Runnable {

    class a implements Runnable {
        a(o oVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeBridge.O(Header.f());
            NativeBridge.Q(D.a());
            NativeBridge.g();
        }
    }

    o(p pVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        new Thread(new a(this), "NPTH-AnrMonitor").start();
    }
}
