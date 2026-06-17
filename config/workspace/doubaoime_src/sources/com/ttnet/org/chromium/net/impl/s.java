package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.impl.C0772l;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
class s implements y {
    final /* synthetic */ C0772l.f a;

    s(C0772l.f fVar) {
        this.a = fVar;
    }

    @Override // com.ttnet.org.chromium.net.impl.y
    public void run() throws Exception {
        AtomicInteger atomicInteger;
        atomicInteger = this.a.f8751d.f8748f;
        if (atomicInteger.compareAndSet(1, 4)) {
            C0772l.f fVar = this.a;
            Q q = fVar.a;
            C0772l c0772l = fVar.f8751d;
            q.e(c0772l, c0772l.n, "");
        }
    }
}
