package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
final class v<T> extends AbstractC0801a<T> {
    private final kotlin.s.b.p<g<? super T>, kotlin.r.d<? super kotlin.o>, Object> a;

    /* JADX WARN: Multi-variable type inference failed */
    public v(kotlin.s.b.p<? super g<? super T>, ? super kotlin.r.d<? super kotlin.o>, ? extends Object> pVar) {
        this.a = pVar;
    }

    @Override // kotlinx.coroutines.flow.AbstractC0801a
    public Object d(g<? super T> gVar, kotlin.r.d<? super kotlin.o> dVar) {
        Object invoke = this.a.invoke(gVar, dVar);
        return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : kotlin.o.a;
    }
}
