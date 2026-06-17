package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class o<T> implements f<T> {
    final /* synthetic */ f a;

    public o(f fVar) {
        this.a = fVar;
    }

    @Override // kotlinx.coroutines.flow.f
    public Object a(g<? super T> gVar, kotlin.r.d<? super kotlin.o> dVar) {
        Object a = this.a.a(new p(gVar), dVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : kotlin.o.a;
    }
}
