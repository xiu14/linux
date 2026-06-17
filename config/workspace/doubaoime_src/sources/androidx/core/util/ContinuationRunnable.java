package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final kotlin.r.d<o> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationRunnable(kotlin.r.d<? super o> dVar) {
        super(false);
        l.f(dVar, "continuation");
        this.continuation = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(o.a);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ContinuationRunnable(ran = ");
        M.append(get());
        M.append(')');
        return M.toString();
    }
}
