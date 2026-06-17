package com.bytedance.common.wschannel.server;

import com.bytedance.common.wschannel.server.WsChannelService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class k implements Runnable {
    final /* synthetic */ l a;

    k(l lVar) {
        this.a = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        BlockingQueue blockingQueue;
        try {
            Thread.currentThread().setName("MessageDispatcher");
            while (true) {
                Thread.currentThread();
                if (Thread.interrupted()) {
                    break;
                }
                atomicBoolean2 = l.j;
                atomicBoolean2.getAndSet(true);
                blockingQueue = this.a.f4336f;
                try {
                    l.k(this.a, (WsChannelService.b) blockingQueue.take());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        atomicBoolean = l.j;
        atomicBoolean.getAndSet(false);
    }
}
