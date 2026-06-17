package com.bumptech.glide.load.engine.D;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a implements ExecutorService {
    private static final long b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    private static volatile int f1613c;
    private final ExecutorService a;

    public static final class b {
        private final boolean a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private int f1614c;

        /* renamed from: d, reason: collision with root package name */
        @NonNull
        private ThreadFactory f1615d = new c(null);

        /* renamed from: e, reason: collision with root package name */
        private String f1616e;

        b(boolean z) {
            this.a = z;
        }

        public a a() {
            if (!TextUtils.isEmpty(this.f1616e)) {
                return new a(new ThreadPoolExecutor(this.b, this.f1614c, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f1615d, this.f1616e, e.b, this.a)));
            }
            StringBuilder M = e.a.a.a.a.M("Name must be non-null and non-empty, but given: ");
            M.append(this.f1616e);
            throw new IllegalArgumentException(M.toString());
        }

        public b b(String str) {
            this.f1616e = str;
            return this;
        }

        public b c(@IntRange(from = 1) int i) {
            this.b = i;
            this.f1614c = i;
            return this;
        }
    }

    private static final class c implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.D.a$c$a, reason: collision with other inner class name */
        class C0024a extends Thread {
            C0024a(c cVar, Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        c(C0023a c0023a) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new C0024a(this, runnable);
        }
    }

    private static final class d implements ThreadFactory {
        private final ThreadFactory a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        final e f1617c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f1618d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicInteger f1619e = new AtomicInteger();

        /* renamed from: com.bumptech.glide.load.engine.D.a$d$a, reason: collision with other inner class name */
        class RunnableC0025a implements Runnable {
            final /* synthetic */ Runnable a;

            RunnableC0025a(Runnable runnable) {
                this.a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f1618d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.a.run();
                } catch (Throwable th) {
                    d.this.f1617c.a(th);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z) {
            this.a = threadFactory;
            this.b = str;
            this.f1617c = eVar;
            this.f1618d = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread newThread = this.a.newThread(new RunnableC0025a(runnable));
            StringBuilder M = e.a.a.a.a.M("glide-");
            M.append(this.b);
            M.append("-thread-");
            M.append(this.f1619e.getAndIncrement());
            newThread.setName(M.toString());
            return newThread;
        }
    }

    public interface e {
        public static final e a;
        public static final e b;

        /* renamed from: com.bumptech.glide.load.engine.D.a$e$a, reason: collision with other inner class name */
        class C0026a implements e {
            C0026a() {
            }

            @Override // com.bumptech.glide.load.engine.D.a.e
            public void a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C0026a c0026a = new C0026a();
            a = c0026a;
            b = c0026a;
        }

        void a(Throwable th);
    }

    @VisibleForTesting
    a(ExecutorService executorService) {
        this.a = executorService;
    }

    public static int a() {
        if (f1613c == 0) {
            f1613c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f1613c;
    }

    public static a b() {
        int i = a() >= 4 ? 2 : 1;
        b bVar = new b(true);
        bVar.c(i);
        bVar.b("animation");
        return bVar.a();
    }

    public static a c() {
        b bVar = new b(true);
        bVar.c(1);
        bVar.b("disk-cache");
        return bVar.a();
    }

    public static a d() {
        b bVar = new b(false);
        bVar.c(a());
        bVar.b("source");
        return bVar.a();
    }

    public static a e() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(null), "source-unlimited", e.b, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.a.submit(runnable);
    }

    public String toString() {
        return this.a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.a.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.a.submit(callable);
    }
}
