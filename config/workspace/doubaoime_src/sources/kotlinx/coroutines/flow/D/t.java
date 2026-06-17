package kotlinx.coroutines.flow.D;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.w;

/* loaded from: classes2.dex */
public final class t<T> implements kotlinx.coroutines.flow.g<T> {
    private final w<T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public t(w<? super T> wVar) {
        this.a = wVar;
    }

    @Override // kotlinx.coroutines.flow.g
    public Object emit(T t, kotlin.r.d<? super kotlin.o> dVar) {
        Object o = this.a.o(t, dVar);
        return o == CoroutineSingletons.COROUTINE_SUSPENDED ? o : kotlin.o.a;
    }
}
