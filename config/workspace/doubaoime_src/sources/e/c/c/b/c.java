package e.c.c.b;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class c extends AbstractExecutorService {
    private static final Class<?> h = c.class;
    private final String a;
    private final Executor b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f9747c;

    /* renamed from: d, reason: collision with root package name */
    private final BlockingQueue<Runnable> f9748d;

    /* renamed from: e, reason: collision with root package name */
    private final b f9749e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f9750f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicInteger f9751g;

    private class b implements Runnable {
        b(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) c.this.f9748d.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    e.c.c.e.a.n(c.h, "%s: Worker has nothing to run", c.this.a);
                }
                int decrementAndGet = c.this.f9750f.decrementAndGet();
                if (c.this.f9748d.isEmpty()) {
                    e.c.c.e.a.o(c.h, "%s: worker finished; %d workers left", c.this.a, Integer.valueOf(decrementAndGet));
                } else {
                    c.this.f();
                }
            } catch (Throwable th) {
                int decrementAndGet2 = c.this.f9750f.decrementAndGet();
                if (c.this.f9748d.isEmpty()) {
                    e.c.c.e.a.o(c.h, "%s: worker finished; %d workers left", c.this.a, Integer.valueOf(decrementAndGet2));
                } else {
                    c.this.f();
                }
                throw th;
            }
        }
    }

    public c(String str, int i, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i <= 0) {
            throw new IllegalArgumentException("max concurrency must be > 0");
        }
        this.a = str;
        this.b = executor;
        this.f9747c = i;
        this.f9748d = blockingQueue;
        this.f9749e = new b(null);
        this.f9750f = new AtomicInteger(0);
        this.f9751g = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        int i = this.f9750f.get();
        while (i < this.f9747c) {
            int i2 = i + 1;
            if (this.f9750f.compareAndSet(i, i2)) {
                e.c.c.e.a.p(h, "%s: starting worker %d of %d", this.a, Integer.valueOf(i2), Integer.valueOf(this.f9747c));
                this.b.execute(this.f9749e);
                return;
            } else {
                e.c.c.e.a.n(h, "%s: race in startWorkerIfNeeded; retrying", this.a);
                i = this.f9750f.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Objects.requireNonNull(runnable, "runnable parameter is null");
        if (!this.f9748d.offer(runnable)) {
            throw new RejectedExecutionException(this.a + " queue is full, size=" + this.f9748d.size());
        }
        int size = this.f9748d.size();
        int i = this.f9751g.get();
        if (size > i && this.f9751g.compareAndSet(i, size)) {
            e.c.c.e.a.o(h, "%s: max pending work in queue = %d", this.a, Integer.valueOf(size));
        }
        f();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
