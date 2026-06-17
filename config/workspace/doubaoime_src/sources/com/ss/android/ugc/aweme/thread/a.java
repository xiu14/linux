package com.ss.android.ugc.aweme.thread;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class a extends ThreadPoolExecutor {
    private static volatile Field b;
    private ThreadPoolType a;

    a(ThreadPoolType threadPoolType, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        this.a = threadPoolType;
    }

    private void a() {
        try {
            if (b == null) {
                synchronized (a.class) {
                    if (b == null) {
                        b = Thread.class.getDeclaredField("threadLocals");
                        b.setAccessible(true);
                    }
                }
            }
            b.set(Thread.currentThread(), null);
            Log.d("ThreadPool-Executor", "cleanThreadLocals: ");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        try {
            if (Looper.myLooper() != null) {
                a();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (h.b().a().contains(this.a)) {
            super.execute(new b(runnable, this));
        } else {
            super.execute(runnable);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if (h.d(this)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return h.d(this) ? Collections.emptyList() : super.shutdownNow();
    }

    a(ThreadPoolType threadPoolType, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.a = threadPoolType;
    }
}
