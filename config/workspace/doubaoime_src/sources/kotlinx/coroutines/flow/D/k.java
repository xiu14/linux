package kotlinx.coroutines.flow.D;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes2.dex */
public final class k<T> extends j<T, T> {
    public k(kotlinx.coroutines.flow.f fVar, kotlin.r.f fVar2, int i, BufferOverflow bufferOverflow, int i2) {
        super(fVar, (i2 & 2) != 0 ? kotlin.r.g.a : fVar2, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : null);
    }

    @Override // kotlinx.coroutines.flow.D.f
    protected f<T> f(kotlin.r.f fVar, int i, BufferOverflow bufferOverflow) {
        return new k(this.f10258d, fVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.D.j
    protected Object h(kotlinx.coroutines.flow.g<? super T> gVar, kotlin.r.d<? super kotlin.o> dVar) {
        Object a = this.f10258d.a(gVar, dVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : kotlin.o.a;
    }

    public k(kotlinx.coroutines.flow.f<? extends T> fVar, kotlin.r.f fVar2, int i, BufferOverflow bufferOverflow) {
        super(fVar, fVar2, i, bufferOverflow);
    }
}
