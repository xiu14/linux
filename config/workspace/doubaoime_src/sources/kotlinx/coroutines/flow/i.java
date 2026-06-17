package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class i<T> implements f<T> {
    final /* synthetic */ Object a;

    public i(Object obj) {
        this.a = obj;
    }

    @Override // kotlinx.coroutines.flow.f
    public Object a(g<? super T> gVar, kotlin.r.d<? super kotlin.o> dVar) {
        Object emit = gVar.emit((Object) this.a, dVar);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : kotlin.o.a;
    }
}
