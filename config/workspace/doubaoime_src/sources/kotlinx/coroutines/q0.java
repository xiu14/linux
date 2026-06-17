package kotlinx.coroutines;

/* loaded from: classes2.dex */
public abstract class q0 extends AbstractC0826w implements U, InterfaceC0807h0 {

    /* renamed from: d, reason: collision with root package name */
    public r0 f10302d;

    @Override // kotlinx.coroutines.InterfaceC0807h0
    public boolean a() {
        return true;
    }

    @Override // kotlinx.coroutines.U
    public void b() {
        z().j0(this);
    }

    @Override // kotlinx.coroutines.InterfaceC0807h0
    public w0 g() {
        return null;
    }

    @Override // kotlinx.coroutines.N0.m
    public String toString() {
        return getClass().getSimpleName() + '@' + I.b(this) + "[job@" + I.b(z()) + ']';
    }

    public final r0 z() {
        r0 r0Var = this.f10302d;
        if (r0Var != null) {
            return r0Var;
        }
        kotlin.s.c.l.l("job");
        throw null;
    }
}
