package e.c.c.b;

import android.os.Handler;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class e extends AbstractExecutorService implements ScheduledExecutorService {
    private final Handler a;

    public e(Handler handler) {
        this.a = handler;
    }

    public boolean a() {
        return Thread.currentThread() == this.a.getLooper().getThread();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.a.post(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new f(this.a, runnable, obj);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        f fVar = new f(this.a, runnable, null);
        this.a.postDelayed(fVar, timeUnit.toMillis(j));
        return fVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        Objects.requireNonNull(runnable);
        f fVar = new f(this.a, runnable, null);
        execute(fVar);
        return fVar;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected RunnableFuture newTaskFor(Callable callable) {
        return new f(this.a, callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        f fVar = new f(this.a, callable);
        this.a.postDelayed(fVar, timeUnit.toMillis(j));
        return fVar;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        Objects.requireNonNull(runnable);
        f fVar = new f(this.a, runnable, obj);
        execute(fVar);
        return fVar;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        Objects.requireNonNull(callable);
        f fVar = new f(this.a, callable);
        execute(fVar);
        return fVar;
    }
}
