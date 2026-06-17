package androidx.core.util;

import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.s.c.l;

@RequiresApi(24)
/* loaded from: classes.dex */
final class ContinuationConsumer<T> extends AtomicBoolean implements java.util.function.Consumer<T> {
    private final kotlin.r.d<T> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationConsumer(kotlin.r.d<? super T> dVar) {
        super(false);
        l.f(dVar, "continuation");
        this.continuation = dVar;
    }

    @Override // java.util.function.Consumer
    public void accept(T t) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(t);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ContinuationConsumer(resultAccepted = ");
        M.append(get());
        M.append(')');
        return M.toString();
    }
}
