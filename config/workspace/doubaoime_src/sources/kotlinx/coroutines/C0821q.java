package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0821q extends o0 implements InterfaceC0820p {

    /* renamed from: e, reason: collision with root package name */
    public final r f10301e;

    public C0821q(r rVar) {
        this.f10301e = rVar;
    }

    @Override // kotlinx.coroutines.InterfaceC0820p
    public boolean f(Throwable th) {
        return z().J(th);
    }

    @Override // kotlinx.coroutines.InterfaceC0820p
    public InterfaceC0817m0 getParent() {
        return z();
    }

    @Override // kotlin.s.b.l
    public /* bridge */ /* synthetic */ kotlin.o invoke(Throwable th) {
        y(th);
        return kotlin.o.a;
    }

    @Override // kotlinx.coroutines.AbstractC0826w
    public void y(Throwable th) {
        this.f10301e.s(z());
    }
}
