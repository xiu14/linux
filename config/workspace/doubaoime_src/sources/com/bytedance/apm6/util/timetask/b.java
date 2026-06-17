package com.bytedance.apm6.util.timetask;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    private static Map<AsyncTaskManagerType, b> f3725d = new HashMap();
    private ScheduledThreadPoolExecutor a;
    private ConcurrentHashMap<com.bytedance.apm6.util.timetask.a, ScheduledFuture> b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<com.bytedance.apm6.util.timetask.a, Runnable> f3726c = new ConcurrentHashMap<>();

    /* renamed from: com.bytedance.apm6.util.timetask.b$b, reason: collision with other inner class name */
    private class RunnableC0142b implements Runnable {
        private com.bytedance.apm6.util.timetask.a a;

        RunnableC0142b(b bVar, com.bytedance.apm6.util.timetask.a aVar, a aVar2) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.run();
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("thread ");
                M.append(Thread.currentThread().getName());
                M.append(" exception");
                e.b.b.n.g.b.c("APM-AsyncTask", M.toString(), th);
            }
        }
    }

    private b(String str) {
        this.a = new ScheduledThreadPoolExecutor(1, new c(str));
    }

    public static synchronized b a(AsyncTaskManagerType asyncTaskManagerType) {
        b bVar;
        synchronized (b.class) {
            if (asyncTaskManagerType == null) {
                throw new IllegalArgumentException("AsyncTaskManagerType must be not null!");
            }
            bVar = f3725d.get(asyncTaskManagerType);
            if (bVar == null) {
                bVar = new b(asyncTaskManagerType.name());
                f3725d.put(asyncTaskManagerType, bVar);
            }
        }
        return bVar;
    }

    public void b(com.bytedance.apm6.util.timetask.a aVar) {
        try {
            Runnable remove = this.f3726c.remove(aVar);
            if (remove != null) {
                this.a.remove(remove);
            }
            ScheduledFuture remove2 = this.b.remove(aVar);
            if (remove2 != null) {
                remove2.cancel(true);
            }
        } catch (Throwable th) {
            e.b.b.n.g.b.c("APM-AsyncTask", "removeTask failed", th);
        }
    }

    public void c(com.bytedance.apm6.util.timetask.a aVar) {
        if (aVar == null) {
            return;
        }
        try {
            RunnableC0142b runnableC0142b = new RunnableC0142b(this, aVar, null);
            ScheduledFuture<?> scheduleWithFixedDelay = aVar.c() ? this.a.scheduleWithFixedDelay(runnableC0142b, aVar.a(), aVar.b(), TimeUnit.MILLISECONDS) : this.a.schedule(runnableC0142b, aVar.a(), TimeUnit.MILLISECONDS);
            this.f3726c.put(aVar, runnableC0142b);
            this.b.put(aVar, scheduleWithFixedDelay);
        } catch (Throwable th) {
            e.b.b.n.g.b.c("APM-AsyncTask", "sendTask failed.", th);
        }
    }
}
