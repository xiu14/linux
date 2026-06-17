package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.N0.C0788d;

/* renamed from: kotlinx.coroutines.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0798e0 extends AbstractC0796d0 implements N {
    private final Executor a;

    public C0798e0(Executor executor) {
        this.a = executor;
        C0788d.a(executor);
    }

    private final ScheduledFuture<?> U(ScheduledExecutorService scheduledExecutorService, Runnable runnable, kotlin.r.f fVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            C0795d.d(fVar, cancellationException);
            return null;
        }
    }

    @Override // kotlinx.coroutines.N
    public U A(long j, Runnable runnable, kotlin.r.f fVar) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> U = scheduledExecutorService != null ? U(scheduledExecutorService, runnable, fVar, j) : null;
        return U != null ? new T(U) : J.f10154g.A(j, runnable, fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = this.a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.D
    public void dispatch(kotlin.r.f fVar, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            C0795d.d(fVar, cancellationException);
            S.b().dispatch(fVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0798e0) && ((C0798e0) obj).a == this.a;
    }

    public int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // kotlinx.coroutines.N
    public void o(long j, InterfaceC0812k<? super kotlin.o> interfaceC0812k) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> U = scheduledExecutorService != null ? U(scheduledExecutorService, new B0(this, interfaceC0812k), interfaceC0812k.getContext(), j) : null;
        if (U != null) {
            interfaceC0812k.f(new C0806h(U));
        } else {
            J.f10154g.o(j, interfaceC0812k);
        }
    }

    @Override // kotlinx.coroutines.D
    public String toString() {
        return this.a.toString();
    }
}
