package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes2.dex */
public final class z {
    private static final kotlinx.coroutines.N0.x a = new kotlinx.coroutines.N0.x("NONE");
    private static final kotlinx.coroutines.N0.x b = new kotlinx.coroutines.N0.x("PENDING");

    public static final <T> t<T> a(T t) {
        if (t == null) {
            t = (T) kotlinx.coroutines.flow.D.p.a;
        }
        return new y(t);
    }

    public static final <T> f<T> d(x<? extends T> xVar, kotlin.r.f fVar, int i, BufferOverflow bufferOverflow) {
        return (((i >= 0 && i < 2) || i == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) ? xVar : ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? xVar : new kotlinx.coroutines.flow.D.k(xVar, fVar, i, bufferOverflow);
    }
}
