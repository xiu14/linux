package com.ss.ugc.effectplatform;

import java.util.concurrent.ExecutorService;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class c implements d.a.b.c.b {
    private final ExecutorService a;

    static final class a implements Runnable {
        final /* synthetic */ Runnable a;

        a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Runnable runnable = this.a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public c(ExecutorService executorService) {
        l.g(executorService, "iExecutor");
        this.a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.a.execute(new a(runnable));
    }
}
