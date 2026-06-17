package com.obric.common.upgrade.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class f {
    public static final f a = null;
    private static final ExecutorService b;

    static {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
        l.e(newFixedThreadPool, "newFixedThreadPool(3)");
        b = newFixedThreadPool;
    }

    public static final void a(Runnable runnable) {
        l.f(runnable, "task");
        b.execute(runnable);
    }
}
