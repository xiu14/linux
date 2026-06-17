package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.AbstractC0796d0;
import kotlinx.coroutines.D;
import kotlinx.coroutines.N0.r;

/* loaded from: classes2.dex */
public final class a extends AbstractC0796d0 implements Executor {
    public static final a a = new a();
    private static final D b;

    static {
        l lVar = l.a;
        int c2 = r.c();
        b = lVar.limitedParallelism(r.h("kotlinx.coroutines.io.parallelism", 64 < c2 ? c2 : 64, 0, 0, 12, null));
    }

    private a() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // kotlinx.coroutines.D
    public void dispatch(kotlin.r.f fVar, Runnable runnable) {
        b.dispatch(fVar, runnable);
    }

    @Override // kotlinx.coroutines.D
    public void dispatchYield(kotlin.r.f fVar, Runnable runnable) {
        b.dispatchYield(fVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        b.dispatch(kotlin.r.g.a, runnable);
    }

    @Override // kotlinx.coroutines.D
    public D limitedParallelism(int i) {
        return l.a.limitedParallelism(i);
    }

    @Override // kotlinx.coroutines.D
    public String toString() {
        return "Dispatchers.IO";
    }
}
