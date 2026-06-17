package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes2.dex */
class e<T> extends kotlinx.coroutines.flow.D.f<T> {

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.s.b.p<kotlinx.coroutines.channels.q<? super T>, kotlin.r.d<? super kotlin.o>, Object> f10270d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(kotlin.s.b.p<? super kotlinx.coroutines.channels.q<? super T>, ? super kotlin.r.d<? super kotlin.o>, ? extends Object> pVar, kotlin.r.f fVar, int i, BufferOverflow bufferOverflow) {
        super(fVar, i, bufferOverflow);
        this.f10270d = pVar;
    }

    @Override // kotlinx.coroutines.flow.D.f
    protected Object e(kotlinx.coroutines.channels.q<? super T> qVar, kotlin.r.d<? super kotlin.o> dVar) {
        Object invoke = this.f10270d.invoke(qVar, dVar);
        return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : kotlin.o.a;
    }

    @Override // kotlinx.coroutines.flow.D.f
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("block[");
        M.append(this.f10270d);
        M.append("] -> ");
        M.append(super.toString());
        return M.toString();
    }
}
