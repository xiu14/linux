package com.bytedance.common.utility.h;

import com.bytedance.common.utility.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class c implements Runnable {
    private static ExecutorService b = com.bytedance.common.utility.h.a.c();

    /* renamed from: c, reason: collision with root package name */
    private static ExecutorService f4181c = com.bytedance.common.utility.h.a.c();

    /* renamed from: d, reason: collision with root package name */
    protected static final AtomicInteger f4182d = new AtomicInteger();
    private final boolean a = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder M = e.a.a.a.a.M("thread count: ");
            M.append(c.f4182d.incrementAndGet());
            Logger.d("ThreadPlus", M.toString());
            try {
                c.this.run();
            } catch (Exception e2) {
                Logger.w("ThreadPlus", "Thread crashed!", e2);
            }
            StringBuilder M2 = e.a.a.a.a.M("thread count: ");
            M2.append(c.f4182d.decrementAndGet());
            Logger.d("ThreadPlus", M2.toString());
        }
    }

    public c() {
    }

    public static void b(Runnable runnable) {
        b.submit(runnable);
    }

    public void a() {
        Runnable aVar = Logger.debug() ? new a() : this;
        if (this.a) {
            f4181c.submit(aVar);
        } else {
            b.submit(aVar);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        throw null;
    }

    public c(String str) {
    }
}
