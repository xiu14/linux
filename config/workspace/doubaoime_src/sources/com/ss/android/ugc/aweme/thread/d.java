package com.ss.android.ugc.aweme.thread;

import android.os.SystemClock;
import android.util.Log;
import com.ss.android.ugc.aweme.thread.g;
import com.ss.android.ugc.aweme.thread.k;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
class d implements k.b {
    private static final int a;
    private static AtomicInteger b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8383c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8384d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f8385e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8386f;

    /* renamed from: g, reason: collision with root package name */
    private static ExecutorService f8387g;
    private static ExecutorService h;
    private static long i;
    private static long j;
    private static final long k;
    private static RejectedExecutionHandler l;
    private static RejectedExecutionHandler m;
    public static final /* synthetic */ int n = 0;

    static class a implements RejectedExecutionHandler {
        a() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            g gVar;
            Log.d("ThreadPool-NewInstanceFactory", String.format("sIORejectHandler: runnable=%s, executor=%s", runnable, threadPoolExecutor));
            d.f8387g.execute(runnable);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - d.i < d.k) {
                long unused = d.i = elapsedRealtime;
                return;
            }
            long unused2 = d.i = elapsedRealtime;
            gVar = g.a.a;
            Objects.requireNonNull(gVar);
            Objects.requireNonNull(h.c());
        }
    }

    static class b implements RejectedExecutionHandler {
        b() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            g gVar;
            Log.d("ThreadPool-NewInstanceFactory", String.format("sDefaultRejectHandler: runnable=%s, executor=%s", runnable, threadPoolExecutor));
            d.h.execute(runnable);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - d.j < d.k) {
                Objects.requireNonNull(h.b());
                long unused = d.j = elapsedRealtime;
            } else {
                long unused2 = d.j = elapsedRealtime;
                gVar = g.a.a;
                Objects.requireNonNull(gVar);
                Objects.requireNonNull(h.c());
            }
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        a = availableProcessors;
        b = new AtomicInteger(0);
        int i2 = availableProcessors + 1;
        f8383c = i2;
        int max = Math.max(2, Math.min(availableProcessors - 1, 6)) * 2;
        f8384d = max;
        int max2 = Math.max(2, Math.min(availableProcessors - 1, 4));
        f8385e = max2;
        f8386f = (max2 * 2) + 1;
        f8387g = k(max, ThreadPoolType.IO, "tp-reject");
        h = k(i2, ThreadPoolType.DEFAULT, "tp-default-reject");
        k = TimeUnit.SECONDS.toMillis(3L);
        l = new a();
        m = new b();
    }

    d() {
    }

    private ExecutorService j() {
        return new com.ss.android.ugc.aweme.thread.a(ThreadPoolType.IO, 0, 128, 30L, TimeUnit.SECONDS, new SynchronousQueue(), new e(0, "tp-io", false), l);
    }

    private static ExecutorService k(int i2, ThreadPoolType threadPoolType, String str) {
        com.ss.android.ugc.aweme.thread.a aVar = new com.ss.android.ugc.aweme.thread.a(threadPoolType, i2, i2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e(0, str, false));
        aVar.allowCoreThreadTimeOut(true);
        return aVar;
    }

    public ExecutorService i(j jVar) {
        Log.d("ThreadPool-NewInstanceFactory", String.format("create: taskType=%s", jVar.a));
        int ordinal = jVar.a.ordinal();
        if (ordinal == 0) {
            return j();
        }
        if (ordinal == 1) {
            com.ss.android.ugc.aweme.thread.a aVar = new com.ss.android.ugc.aweme.thread.a(ThreadPoolType.DEFAULT, f8385e, f8386f, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new e(0, "tp-default", false), m);
            aVar.allowCoreThreadTimeOut(true);
            return aVar;
        }
        if (ordinal == 2) {
            return new com.ss.android.ugc.aweme.thread.a(ThreadPoolType.BACKGROUND, 0, 3, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new e(10, "tp-background", true), m);
        }
        if (ordinal == 3) {
            String str = jVar.b;
            if (str == null) {
                str = "tp-scheduled";
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(jVar.f8402c, new e(0, str, false));
            long j2 = jVar.f8405f;
            if (j2 < 0) {
                j2 = 15;
            }
            scheduledThreadPoolExecutor.setKeepAliveTime(j2, TimeUnit.SECONDS);
            scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
            return scheduledThreadPoolExecutor;
        }
        if (ordinal == 4) {
            String str2 = jVar.b;
            if (str2 == null) {
                str2 = "tp-serial";
            }
            e eVar = new e(0, str2, false);
            ThreadPoolType threadPoolType = ThreadPoolType.SERIAL;
            long j3 = jVar.f8405f;
            if (j3 < 0) {
                j3 = 30;
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            BlockingQueue blockingQueue = jVar.f8403d;
            if (blockingQueue == null) {
                blockingQueue = new LinkedBlockingQueue();
            }
            BlockingQueue blockingQueue2 = blockingQueue;
            RejectedExecutionHandler rejectedExecutionHandler = jVar.f8404e;
            if (rejectedExecutionHandler == null) {
                rejectedExecutionHandler = new ThreadPoolExecutor.AbortPolicy();
            }
            com.ss.android.ugc.aweme.thread.a aVar2 = new com.ss.android.ugc.aweme.thread.a(threadPoolType, 1, 1, j3, timeUnit, blockingQueue2, eVar, rejectedExecutionHandler);
            aVar2.allowCoreThreadTimeOut(true);
            return aVar2;
        }
        if (ordinal != 5) {
            return j();
        }
        String str3 = jVar.b;
        if (str3 == null) {
            str3 = "tp-fixed";
        }
        e eVar2 = new e(0, str3, false);
        ThreadPoolType threadPoolType2 = ThreadPoolType.FIXED;
        int i2 = jVar.f8402c;
        long j4 = jVar.f8405f;
        if (j4 < 0) {
            j4 = 30;
        }
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        BlockingQueue blockingQueue3 = jVar.f8403d;
        if (blockingQueue3 == null) {
            blockingQueue3 = new LinkedBlockingQueue();
        }
        BlockingQueue blockingQueue4 = blockingQueue3;
        RejectedExecutionHandler rejectedExecutionHandler2 = jVar.f8404e;
        if (rejectedExecutionHandler2 == null) {
            rejectedExecutionHandler2 = new ThreadPoolExecutor.AbortPolicy();
        }
        com.ss.android.ugc.aweme.thread.a aVar3 = new com.ss.android.ugc.aweme.thread.a(threadPoolType2, i2, i2, j4, timeUnit2, blockingQueue4, eVar2, rejectedExecutionHandler2);
        aVar3.allowCoreThreadTimeOut(true);
        return aVar3;
    }
}
