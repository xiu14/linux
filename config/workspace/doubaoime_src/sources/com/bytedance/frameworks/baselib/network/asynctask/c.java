package com.bytedance.frameworks.baselib.network.asynctask;

import com.bytedance.common.utility.Logger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f5014e = "c";

    /* renamed from: f, reason: collision with root package name */
    private static final ConcurrentHashMap<NetworkAsyncTaskType, c> f5015f = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<com.bytedance.frameworks.baselib.network.asynctask.b, ScheduledFuture> a = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<com.bytedance.frameworks.baselib.network.asynctask.b, Runnable> b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final NetworkAsyncTaskType f5016c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f5017d;

    private static class b implements Runnable {
        private final com.bytedance.frameworks.baselib.network.asynctask.b a;

        b(com.bytedance.frameworks.baselib.network.asynctask.b bVar, a aVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.a.run();
                if (Logger.debug()) {
                    Logger.d(c.f5014e, "Task execute time: " + (System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (Throwable th) {
                try {
                    Logger.e(c.f5014e, "thread " + Thread.currentThread().getName() + " exception", th);
                    if (this.a.isLoop()) {
                    }
                } finally {
                    if (!this.a.isLoop()) {
                        c.d(this.a.getTaskType()).c().remove(this.a);
                        c.d(this.a.getTaskType()).b().remove(this.a);
                    }
                }
            }
        }
    }

    private c(NetworkAsyncTaskType networkAsyncTaskType) {
        this.f5016c = networkAsyncTaskType;
        this.f5017d = new ScheduledThreadPoolExecutor(1, new d(networkAsyncTaskType.name()));
    }

    public static c d(NetworkAsyncTaskType networkAsyncTaskType) {
        if (networkAsyncTaskType == null) {
            throw new IllegalArgumentException("unsupported async task type");
        }
        ConcurrentHashMap<NetworkAsyncTaskType, c> concurrentHashMap = f5015f;
        if (concurrentHashMap.get(networkAsyncTaskType) == null) {
            synchronized (c.class) {
                if (concurrentHashMap.get(networkAsyncTaskType) == null) {
                    concurrentHashMap.put(networkAsyncTaskType, new c(networkAsyncTaskType));
                }
            }
        }
        return concurrentHashMap.get(networkAsyncTaskType);
    }

    public ConcurrentHashMap<?, ?> b() {
        return this.a;
    }

    public ConcurrentHashMap<?, ?> c() {
        return this.b;
    }

    public void e(com.bytedance.frameworks.baselib.network.asynctask.b bVar) {
        if (bVar == null) {
            return;
        }
        bVar.setTaskType(this.f5016c);
        try {
            b bVar2 = new b(bVar, null);
            ScheduledFuture<?> scheduleWithFixedDelay = bVar.isLoop() ? this.f5017d.scheduleWithFixedDelay(bVar2, bVar.getInitialDelay(), bVar.getLoopInterval(), bVar.getTimeUnit()) : this.f5017d.schedule(bVar2, bVar.getInitialDelay(), bVar.getTimeUnit());
            this.b.put(bVar, bVar2);
            this.a.put(bVar, scheduleWithFixedDelay);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void f(com.bytedance.frameworks.baselib.network.asynctask.b bVar) {
        try {
            Runnable remove = this.b.remove(bVar);
            if (remove != null) {
                this.f5017d.remove(remove);
            }
            ScheduledFuture remove2 = this.a.remove(bVar);
            if (remove2 != null) {
                remove2.cancel(true);
            }
        } catch (Throwable th) {
            Logger.e(f5014e, "removeTask failed", th);
        }
    }
}
