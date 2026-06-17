package com.bytedance.lighten.loader;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class g extends e.c.c.b.c {
    public g(Executor executor, int i) {
        super("FixSizeSerialExecutor", 1, executor, new f(i));
    }

    @Override // e.c.c.b.c, java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
