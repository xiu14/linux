package kotlinx.coroutines.channels;

import kotlinx.coroutines.C0816m;
import kotlinx.coroutines.I;
import kotlinx.coroutines.InterfaceC0812k;
import kotlinx.coroutines.N0.m;

/* loaded from: classes2.dex */
public class x<E> extends v {

    /* renamed from: d, reason: collision with root package name */
    private final E f10235d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0812k<kotlin.o> f10236e;

    /* JADX WARN: Multi-variable type inference failed */
    public x(E e2, InterfaceC0812k<? super kotlin.o> interfaceC0812k) {
        this.f10235d = e2;
        this.f10236e = interfaceC0812k;
    }

    @Override // kotlinx.coroutines.channels.v
    public void A(i<?> iVar) {
        InterfaceC0812k<kotlin.o> interfaceC0812k = this.f10236e;
        Throwable th = iVar.f10230d;
        if (th == null) {
            th = new k("Channel was closed");
        }
        interfaceC0812k.resumeWith(com.prolificinteractive.materialcalendarview.r.J(th));
    }

    @Override // kotlinx.coroutines.channels.v
    public kotlinx.coroutines.N0.x B(m.b bVar) {
        if (this.f10236e.b(kotlin.o.a, null) == null) {
            return null;
        }
        return C0816m.a;
    }

    @Override // kotlinx.coroutines.N0.m
    public String toString() {
        return getClass().getSimpleName() + '@' + I.b(this) + '(' + this.f10235d + ')';
    }

    @Override // kotlinx.coroutines.channels.v
    public void y() {
        this.f10236e.t(C0816m.a);
    }

    @Override // kotlinx.coroutines.channels.v
    public E z() {
        return this.f10235d;
    }
}
