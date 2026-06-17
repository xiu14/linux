package com.bytedance.bdinstall;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class L implements Runnable {
    final /* synthetic */ K a;

    L(K k) {
        this.a = k;
    }

    @Override // java.lang.Runnable
    public void run() {
        AtomicBoolean atomicBoolean;
        C0641v c0641v;
        atomicBoolean = this.a.f3946f;
        if (atomicBoolean.compareAndSet(false, true)) {
            K k = this.a;
            Q q = k.a;
            c0641v = this.a.f3945e;
            k.j(new C0623c(q, c0641v));
        }
    }
}
