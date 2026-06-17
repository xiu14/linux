package com.bytedance.lego.init;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class s implements Runnable {
    final /* synthetic */ w a;
    final /* synthetic */ CountDownLatch b;

    s(w wVar, CountDownLatch countDownLatch) {
        this.a = wVar;
        this.b = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r.p.g(this.a.I());
        this.b.countDown();
    }
}
