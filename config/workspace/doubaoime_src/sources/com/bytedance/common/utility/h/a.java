package com.bytedance.common.utility.h;

import android.os.Process;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class a {
    private static ExecutorService a;
    private static ExecutorService b;

    /* renamed from: c, reason: collision with root package name */
    private static ExecutorService f4172c;

    /* renamed from: d, reason: collision with root package name */
    private static ScheduledExecutorService f4173d;

    /* renamed from: e, reason: collision with root package name */
    private static ExecutorService f4174e;

    /* renamed from: f, reason: collision with root package name */
    private static ExecutorService f4175f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f4176g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    private static final c m;
    private static final c n;
    private static final c o;
    private static final c p;
    private static final c q;
    private static final b r;
    private static final BlockingQueue<Runnable> s;
    private static final BlockingQueue<Runnable> t;
    private static final BlockingQueue<Runnable> u;
    private static final RejectedExecutionHandler v;

    /* renamed from: com.bytedance.common.utility.h.a$a, reason: collision with other inner class name */
    static class RejectedExecutionHandlerC0175a implements RejectedExecutionHandler {
        RejectedExecutionHandlerC0175a() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Executors.newCachedThreadPool().execute(runnable);
        }
    }

    private static class b implements ThreadFactory {

        /* renamed from: d, reason: collision with root package name */
        private static final AtomicInteger f4177d = new AtomicInteger(1);
        private final ThreadGroup a;
        private final AtomicInteger b = new AtomicInteger(1);

        /* renamed from: c, reason: collision with root package name */
        private final String f4178c;

        /* renamed from: com.bytedance.common.utility.h.a$b$a, reason: collision with other inner class name */
        class C0176a extends Thread {
            C0176a(b bVar, ThreadGroup threadGroup, Runnable runnable, String str, long j) {
                super(threadGroup, runnable, str, j);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                super.run();
            }
        }

        b(String str) {
            SecurityManager securityManager = System.getSecurityManager();
            this.a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            StringBuilder S = e.a.a.a.a.S(str, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            S.append(f4177d.getAndIncrement());
            S.append("-Thread-");
            this.f4178c = S.toString();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            C0176a c0176a = new C0176a(this, this.a, runnable, this.f4178c + this.b.getAndIncrement(), 0L);
            if (c0176a.isDaemon()) {
                c0176a.setDaemon(false);
            }
            return c0176a;
        }
    }

    private static class c implements ThreadFactory {

        /* renamed from: d, reason: collision with root package name */
        private static final AtomicInteger f4179d = new AtomicInteger(1);
        private final ThreadGroup a;
        private final AtomicInteger b = new AtomicInteger(1);

        /* renamed from: c, reason: collision with root package name */
        private final String f4180c;

        c(String str) {
            SecurityManager securityManager = System.getSecurityManager();
            this.a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            StringBuilder S = e.a.a.a.a.S(str, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            S.append(f4179d.getAndIncrement());
            S.append("-Thread-");
            this.f4180c = S.toString();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.a, runnable, this.f4180c + this.b.getAndIncrement(), 0L);
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
        f4176g = availableProcessors;
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        h = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 6)) * 2;
        i = max;
        int i2 = (max * 2) + 1;
        j = i2;
        int max2 = Math.max(2, Math.min(availableProcessors - 1, 3));
        k = max2;
        int i3 = (availableProcessors * 2) + 1;
        l = i3;
        c cVar = new c("TTDefaultExecutors");
        m = cVar;
        c cVar2 = new c("TTCpuExecutors");
        n = cVar2;
        c cVar3 = new c("TTScheduledExecutors");
        o = cVar3;
        c cVar4 = new c("TTDownLoadExecutors");
        p = cVar4;
        c cVar5 = new c("TTSerialExecutors");
        q = cVar5;
        b bVar = new b("TTBackgroundExecutors");
        r = bVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        s = linkedBlockingQueue;
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        t = linkedBlockingQueue2;
        LinkedBlockingQueue linkedBlockingQueue3 = new LinkedBlockingQueue();
        u = linkedBlockingQueue3;
        RejectedExecutionHandlerC0175a rejectedExecutionHandlerC0175a = new RejectedExecutionHandlerC0175a();
        v = rejectedExecutionHandlerC0175a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        com.bytedance.common.utility.h.b bVar2 = new com.bytedance.common.utility.h.b(max, i2, 30L, timeUnit, linkedBlockingQueue, cVar, rejectedExecutionHandlerC0175a);
        a = bVar2;
        bVar2.allowCoreThreadTimeOut(true);
        com.bytedance.common.utility.h.b bVar3 = new com.bytedance.common.utility.h.b(max2, i3, 30L, timeUnit, linkedBlockingQueue2, cVar2, rejectedExecutionHandlerC0175a);
        b = bVar3;
        bVar3.allowCoreThreadTimeOut(true);
        f4173d = Executors.newScheduledThreadPool(3, cVar3);
        com.bytedance.common.utility.h.b bVar4 = new com.bytedance.common.utility.h.b(2, 2, 30L, timeUnit, linkedBlockingQueue3, cVar4, rejectedExecutionHandlerC0175a);
        f4172c = bVar4;
        bVar4.allowCoreThreadTimeOut(true);
        com.bytedance.common.utility.h.b bVar5 = new com.bytedance.common.utility.h.b(1, 1, 30L, timeUnit, new LinkedBlockingQueue(), cVar5);
        f4174e = bVar5;
        bVar5.allowCoreThreadTimeOut(true);
        com.bytedance.common.utility.h.b bVar6 = new com.bytedance.common.utility.h.b(0, 3, 30L, timeUnit, new LinkedBlockingQueue(), bVar);
        f4175f = bVar6;
        bVar6.allowCoreThreadTimeOut(true);
    }

    public static ExecutorService a() {
        return b;
    }

    public static ExecutorService b() {
        return f4172c;
    }

    public static ExecutorService c() {
        return a;
    }

    public static ScheduledExecutorService d() {
        return f4173d;
    }
}
