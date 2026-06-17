package kotlinx.coroutines.flow;

import kotlinx.coroutines.InterfaceC0817m0;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes2.dex */
final class u<T> implements x<T>, InterfaceC0803c<T>, kotlinx.coroutines.flow.D.m<T> {
    private final /* synthetic */ x<T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public u(x<? extends T> xVar, InterfaceC0817m0 interfaceC0817m0) {
        this.a = xVar;
    }

    @Override // kotlinx.coroutines.flow.w, kotlinx.coroutines.flow.f
    public Object a(g<? super T> gVar, kotlin.r.d<?> dVar) {
        return this.a.a(gVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.D.m
    public f<T> b(kotlin.r.f fVar, int i, BufferOverflow bufferOverflow) {
        return z.d(this, fVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.x
    public T getValue() {
        return this.a.getValue();
    }
}
