package com.bytedance.apm.F;

import com.bytedance.apm.g;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class d {
    private volatile ExecutorService a = Executors.newFixedThreadPool(1, new c(this));

    private static class a {
        static final d a = new d(null);
    }

    d(c cVar) {
    }

    public static d a() {
        if (g.D()) {
            return a.a;
        }
        return null;
    }

    public void b(Runnable runnable) {
        this.a.submit(runnable);
    }
}
