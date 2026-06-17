package kotlinx.coroutines.channels;

import kotlinx.coroutines.InterfaceC0812k;
import kotlinx.coroutines.N0.D;

/* loaded from: classes2.dex */
public final class y<E> extends x<E> {

    /* renamed from: f, reason: collision with root package name */
    public final kotlin.s.b.l<E, kotlin.o> f10237f;

    /* JADX WARN: Multi-variable type inference failed */
    public y(E e2, InterfaceC0812k<? super kotlin.o> interfaceC0812k, kotlin.s.b.l<? super E, kotlin.o> lVar) {
        super(e2, interfaceC0812k);
        this.f10237f = lVar;
    }

    @Override // kotlinx.coroutines.channels.v
    public void C() {
        kotlin.s.b.l<E, kotlin.o> lVar = this.f10237f;
        E z = z();
        kotlin.r.f context = this.f10236e.getContext();
        D b = kotlinx.coroutines.N0.r.b(lVar, z, null);
        if (b != null) {
            com.prolificinteractive.materialcalendarview.r.T(context, b);
        }
    }

    @Override // kotlinx.coroutines.N0.m
    public boolean v() {
        if (!super.v()) {
            return false;
        }
        C();
        return true;
    }
}
