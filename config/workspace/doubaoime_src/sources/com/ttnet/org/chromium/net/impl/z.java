package com.ttnet.org.chromium.net.impl;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class z implements Executor {
    private final Executor a;

    private static final class a implements Runnable {
        private final Runnable a;
        private Thread b;

        /* renamed from: c, reason: collision with root package name */
        private com.ttnet.org.chromium.net.n f8755c;

        a(Runnable runnable, Thread thread, x xVar) {
            this.a = runnable;
            this.b = thread;
        }

        static /* synthetic */ Thread b(a aVar, Thread thread) {
            aVar.b = null;
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Thread.currentThread() == this.b) {
                this.f8755c = new com.ttnet.org.chromium.net.n();
            } else {
                this.a.run();
            }
        }
    }

    public z(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        a aVar = new a(runnable, Thread.currentThread(), null);
        this.a.execute(aVar);
        if (aVar.f8755c != null) {
            throw aVar.f8755c;
        }
        a.b(aVar, null);
    }
}
