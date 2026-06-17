package e.b.k.a;

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
    private static ExecutorService a;
    private static final int b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f9579c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f9580d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f9581e;

    /* renamed from: f, reason: collision with root package name */
    private static final b f9582f;

    /* renamed from: g, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f9583g;
    private static final RejectedExecutionHandler h;

    /* renamed from: e.b.k.a.a$a, reason: collision with other inner class name */
    static class RejectedExecutionHandlerC0440a implements RejectedExecutionHandler {
        RejectedExecutionHandlerC0440a() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Executors.newCachedThreadPool().execute(runnable);
        }
    }

    private static class b implements ThreadFactory {

        /* renamed from: d, reason: collision with root package name */
        private static final AtomicInteger f9584d = new AtomicInteger(1);
        private final ThreadGroup a;
        private final AtomicInteger b = new AtomicInteger(1);

        /* renamed from: c, reason: collision with root package name */
        private final String f9585c;

        b(String str) {
            SecurityManager securityManager = System.getSecurityManager();
            this.a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            StringBuilder S = e.a.a.a.a.S(str, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            S.append(f9584d.getAndIncrement());
            S.append("-Thread-");
            this.f9585c = S.toString();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.a, runnable, this.f9585c + this.b.getAndIncrement(), 0L);
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
        b = availableProcessors;
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        f9579c = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 6)) * 2;
        f9580d = max;
        int i = (max * 2) + 1;
        f9581e = i;
        b bVar = new b("TTDefaultExecutors");
        f9582f = bVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        f9583g = linkedBlockingQueue;
        RejectedExecutionHandlerC0440a rejectedExecutionHandlerC0440a = new RejectedExecutionHandlerC0440a();
        h = rejectedExecutionHandlerC0440a;
        e.b.k.a.b bVar2 = new e.b.k.a.b(max, i, 30L, TimeUnit.SECONDS, linkedBlockingQueue, bVar, rejectedExecutionHandlerC0440a);
        a = bVar2;
        bVar2.allowCoreThreadTimeOut(true);
    }

    public static ExecutorService a() {
        return a;
    }
}
