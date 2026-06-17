package com.bytedance.crash.L;

import com.bytedance.crash.L.c;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class d implements Runnable {
    final /* synthetic */ c.b a;

    d(c.b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        AtomicInteger atomicInteger;
        atomicInteger = this.a.f4406f;
        atomicInteger.decrementAndGet();
        this.a.g();
    }
}
