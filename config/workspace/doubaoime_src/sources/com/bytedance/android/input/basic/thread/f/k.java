package com.bytedance.android.input.basic.thread.f;

import android.os.Process;
import android.os.SystemClock;
import com.bytedance.android.input.basic.thread.ImeThreadPoolType;
import com.prolificinteractive.materialcalendarview.r;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class k {
    public static final k a = new k();
    private static final int b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f2141c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f2142d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f2143e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f2144f;

    /* renamed from: g, reason: collision with root package name */
    private static final long f2145g;
    private static final AtomicInteger h;
    private static final kotlin.e i;
    private static final kotlin.e j;
    private static final AtomicLong k;
    private static final AtomicLong l;
    private static final RejectedExecutionHandler m;
    private static final RejectedExecutionHandler n;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<ExecutorService> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public ExecutorService invoke() {
            return k.a(k.a, k.f2141c, ImeThreadPoolType.CPU, "tp-cpu-reject");
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.a<ExecutorService> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public ExecutorService invoke() {
            return k.a(k.a, k.f2142d, ImeThreadPoolType.IO, "tp-reject");
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        b = availableProcessors;
        f2141c = availableProcessors + 1;
        f2142d = Math.max(2, Math.min(availableProcessors - 1, 6)) * 2;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        f2143e = max;
        f2144f = (max * 2) + 1;
        f2145g = TimeUnit.SECONDS.toMillis(3L);
        h = new AtomicInteger(0);
        i = kotlin.a.c(b.a);
        j = kotlin.a.c(a.a);
        k = new AtomicLong(0L);
        l = new AtomicLong(0L);
        m = new RejectedExecutionHandler() { // from class: com.bytedance.android.input.basic.thread.f.c
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                k.f(runnable, threadPoolExecutor);
            }
        };
        n = new RejectedExecutionHandler() { // from class: com.bytedance.android.input.basic.thread.f.b
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                k.e(runnable, threadPoolExecutor);
            }
        };
    }

    private k() {
    }

    public static final ExecutorService a(k kVar, int i2, ImeThreadPoolType imeThreadPoolType, String str) {
        i iVar = new i(imeThreadPoolType, i2, i2, l.a.h(), TimeUnit.SECONDS, new LinkedBlockingQueue(), new e(0, str, false), null);
        iVar.allowCoreThreadTimeOut(true);
        return iVar;
    }

    public static void e(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        l lVar = l.a;
        lVar.m("ThreadPool-Factory", "cpuRejectHandler: runnable=" + runnable + ", executor=" + threadPoolExecutor);
        ((ExecutorService) j.getValue()).execute(runnable);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - l.getAndSet(elapsedRealtime) >= f2145g || lVar.f().a()) {
            n nVar = n.a;
            kotlin.s.c.l.e(runnable, "runnable");
            kotlin.s.c.l.e(threadPoolExecutor, "executor");
            nVar.h(runnable, threadPoolExecutor);
        }
    }

    public static void f(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        l.a.m("ThreadPool-Factory", "ioRejectHandler: runnable=" + runnable + ", executor=" + threadPoolExecutor);
        ((ExecutorService) i.getValue()).execute(runnable);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - k.getAndSet(elapsedRealtime) >= f2145g) {
            n nVar = n.a;
            kotlin.s.c.l.e(runnable, "runnable");
            kotlin.s.c.l.e(threadPoolExecutor, "executor");
            nVar.h(runnable, threadPoolExecutor);
        }
    }

    public static Thread g(final int i2, String str, boolean z, final Runnable runnable) {
        kotlin.s.c.l.f(str, "$baseName");
        Thread thread = new Thread(new Runnable() { // from class: com.bytedance.android.input.basic.thread.f.d
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                try {
                    Process.setThreadPriority(i2);
                } catch (Throwable th) {
                    r.J(th);
                }
                runnable2.run();
            }
        });
        thread.setName(str + '-' + h.incrementAndGet());
        thread.setDaemon(z);
        return thread;
    }

    public final ExecutorService d(com.bytedance.android.input.basic.thread.e eVar) {
        kotlin.s.c.l.f(eVar, "options");
        l lVar = l.a;
        StringBuilder M = e.a.a.a.a.M("create: type=");
        M.append(eVar.f());
        lVar.m("ThreadPool-Factory", M.toString());
        int ordinal = eVar.f().ordinal();
        if (ordinal == 0) {
            int c2 = eVar.c();
            return new i(ImeThreadPoolType.IO, 0, 1 <= c2 && c2 < 129 ? eVar.c() : 128, lVar.h(), TimeUnit.SECONDS, new SynchronousQueue(), new e(0, "tp-io", false), m);
        }
        if (ordinal == 1) {
            i iVar = new i(ImeThreadPoolType.CPU, f2143e, f2144f, lVar.h(), TimeUnit.SECONDS, new LinkedBlockingQueue(128), new e(0, "tp-cpu", false), n);
            iVar.allowCoreThreadTimeOut(true);
            return iVar;
        }
        if (ordinal == 2) {
            return new i(ImeThreadPoolType.BACKGROUND, 0, 3, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new e(10, "tp-background", true), n);
        }
        if (ordinal != 3) {
            throw new kotlin.f();
        }
        ThreadFactory a2 = eVar.a();
        if (a2 == null) {
            String e2 = eVar.e();
            if (e2 == null) {
                e2 = "tp-scheduled";
            }
            a2 = new e(0, e2, false);
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(eVar.d(), a2);
        scheduledThreadPoolExecutor.setKeepAliveTime(eVar.b() >= 0 ? eVar.b() : lVar.j(), TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }
}
