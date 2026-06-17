package com.bytedance.applog.p;

import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class a {
    public static final int a;
    public static final int b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3863c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3864d;

    /* renamed from: e, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f3865e;

    /* renamed from: f, reason: collision with root package name */
    private static final d f3866f;

    /* renamed from: g, reason: collision with root package name */
    private static final RejectedExecutionHandler f3867g;
    private static final com.bytedance.applog.util.a<com.bytedance.applog.p.b> h;
    private static final com.bytedance.applog.util.a<com.bytedance.applog.p.b> i;

    /* renamed from: com.bytedance.applog.p.a$a, reason: collision with other inner class name */
    static class RejectedExecutionHandlerC0150a implements RejectedExecutionHandler {
        RejectedExecutionHandlerC0150a() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Executors.newCachedThreadPool().execute(runnable);
        }
    }

    static class b extends com.bytedance.applog.util.a<com.bytedance.applog.p.b> {
        b() {
        }

        @Override // com.bytedance.applog.util.a
        protected com.bytedance.applog.p.b a(Object[] objArr) {
            com.bytedance.applog.p.b bVar = new com.bytedance.applog.p.b(a.f3863c, a.f3864d, 30L, TimeUnit.SECONDS, a.f3865e, a.f3866f, a.f3867g);
            bVar.allowCoreThreadTimeOut(true);
            return bVar;
        }
    }

    static class c extends com.bytedance.applog.util.a<com.bytedance.applog.p.b> {
        c() {
        }

        @Override // com.bytedance.applog.util.a
        protected com.bytedance.applog.p.b a(Object[] objArr) {
            com.bytedance.applog.p.b bVar = new com.bytedance.applog.p.b(1, a.f3864d, 1L, TimeUnit.SECONDS, a.f3865e, a.f3866f, a.f3867g);
            bVar.allowCoreThreadTimeOut(true);
            return bVar;
        }
    }

    private static class d implements ThreadFactory {

        /* renamed from: d, reason: collision with root package name */
        private static final AtomicInteger f3868d = new AtomicInteger(1);
        private final ThreadGroup a;
        private final AtomicInteger b = new AtomicInteger(1);

        /* renamed from: c, reason: collision with root package name */
        private final String f3869c;

        d(String str) {
            SecurityManager securityManager = System.getSecurityManager();
            this.a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            StringBuilder S = e.a.a.a.a.S(str, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            S.append(f3868d.getAndIncrement());
            S.append("-Thread-");
            this.f3869c = S.toString();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.a, runnable, this.f3869c + this.b.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        a = availableProcessors;
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        b = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 6)) * 2;
        f3863c = max;
        f3864d = (max * 2) + 1;
        f3865e = new LinkedBlockingQueue();
        f3866f = new d("AppLogDefaultExecutors");
        f3867g = new RejectedExecutionHandlerC0150a();
        h = new b();
        i = new c();
    }

    public static ExecutorService d() {
        return h.b(new Object[0]);
    }

    public static ExecutorService e() {
        return i.b(new Object[0]);
    }
}
