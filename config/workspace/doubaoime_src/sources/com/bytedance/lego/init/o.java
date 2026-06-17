package com.bytedance.lego.init;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.s.c.A;

/* loaded from: classes.dex */
public final class o {
    static final /* synthetic */ kotlin.reflect.i[] a;
    private static final kotlin.e b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f5322c;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<ThreadPoolExecutor> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public ThreadPoolExecutor invoke() {
            return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), n.a);
        }
    }

    static {
        kotlin.s.c.t tVar = new kotlin.s.c.t(A.b(o.class), "threadPoolExecutor", "getThreadPoolExecutor$initscheduler_release()Ljava/util/concurrent/ThreadPoolExecutor;");
        A.g(tVar);
        a = new kotlin.reflect.i[]{tVar};
        f5322c = new o();
        b = kotlin.a.c(a.a);
    }

    private o() {
    }

    public final ThreadPoolExecutor a() {
        kotlin.e eVar = b;
        kotlin.reflect.i iVar = a[0];
        return (ThreadPoolExecutor) eVar.getValue();
    }
}
