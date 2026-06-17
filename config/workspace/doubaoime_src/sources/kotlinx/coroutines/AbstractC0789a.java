package kotlinx.coroutines;

import kotlinx.coroutines.InterfaceC0817m0;

/* renamed from: kotlinx.coroutines.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0789a<T> extends r0 implements InterfaceC0817m0, kotlin.r.d<T>, G {
    private final kotlin.r.f b;

    public AbstractC0789a(kotlin.r.f fVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            a0((InterfaceC0817m0) fVar.get(InterfaceC0817m0.a.a));
        }
        this.b = fVar.plus(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.r0
    public String F() {
        return getClass().getSimpleName() + " was cancelled";
    }

    @Override // kotlinx.coroutines.r0
    public final void Z(Throwable th) {
        com.prolificinteractive.materialcalendarview.r.T(this.b, th);
    }

    @Override // kotlinx.coroutines.r0, kotlinx.coroutines.InterfaceC0817m0
    public boolean a() {
        return super.a();
    }

    @Override // kotlinx.coroutines.r0
    public String d0() {
        return super.d0();
    }

    @Override // kotlin.r.d
    public final kotlin.r.f getContext() {
        return this.b;
    }

    @Override // kotlinx.coroutines.G
    public kotlin.r.f getCoroutineContext() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.r0
    protected final void h0(Object obj) {
        if (!(obj instanceof C0824u)) {
            r0(obj);
        } else {
            C0824u c0824u = (C0824u) obj;
            q0(c0824u.a, c0824u.a());
        }
    }

    protected void p0(Object obj) {
        A(obj);
    }

    protected void q0(Throwable th, boolean z) {
    }

    protected void r0(T t) {
    }

    @Override // kotlin.r.d
    public final void resumeWith(Object obj) {
        Object c0 = c0(com.prolificinteractive.materialcalendarview.r.l0(obj, null));
        if (c0 == s0.b) {
            return;
        }
        p0(c0);
    }
}
