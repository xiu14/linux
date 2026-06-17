package kotlinx.coroutines.channels;

/* loaded from: classes2.dex */
final class p<E> extends f<E> implements q<E> {
    public p(kotlin.r.f fVar, e<E> eVar) {
        super(fVar, eVar, true, true);
    }

    @Override // kotlinx.coroutines.AbstractC0789a, kotlinx.coroutines.r0, kotlinx.coroutines.InterfaceC0817m0
    public boolean a() {
        return super.a();
    }

    @Override // kotlinx.coroutines.channels.q
    public w getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.AbstractC0789a
    protected void q0(Throwable th, boolean z) {
        if (s0().k(th) || z) {
            return;
        }
        com.prolificinteractive.materialcalendarview.r.T(getContext(), th);
    }

    @Override // kotlinx.coroutines.AbstractC0789a
    public void r0(kotlin.o oVar) {
        com.prolificinteractive.materialcalendarview.r.D(s0(), null, 1, null);
    }
}
