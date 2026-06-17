package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.InterfaceC0817m0;

/* renamed from: kotlinx.coroutines.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0814l<T> extends Q<T> implements InterfaceC0812k<T>, kotlin.r.h.a.d {

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10294g = AtomicIntegerFieldUpdater.newUpdater(C0814l.class, "_decision");
    private static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C0814l.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.r.d<T> f10295d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.r.f f10296e;

    /* renamed from: f, reason: collision with root package name */
    private U f10297f;

    /* JADX WARN: Multi-variable type inference failed */
    public C0814l(kotlin.r.d<? super T> dVar, int i) {
        super(i);
        this.f10295d = dVar;
        this.f10296e = dVar.getContext();
        this._decision = 0;
        this._state = C0791b.a;
    }

    private final void A(kotlin.s.b.l<? super Throwable, kotlin.o> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final void C() {
        Throwable q;
        kotlin.r.d<T> dVar = this.f10295d;
        kotlinx.coroutines.N0.h hVar = dVar instanceof kotlinx.coroutines.N0.h ? (kotlinx.coroutines.N0.h) dVar : null;
        if (hVar == null || (q = hVar.q(this)) == null) {
            return;
        }
        q();
        p(q);
    }

    private final void F(Object obj, int i, kotlin.s.b.l<? super Throwable, kotlin.o> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof y0)) {
                if (obj2 instanceof C0818n) {
                    C0818n c0818n = (C0818n) obj2;
                    if (c0818n.c()) {
                        if (lVar != null) {
                            o(lVar, c0818n.a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(e.a.a.a.a.r("Already resumed, but proposed with update ", obj));
            }
        } while (!h.compareAndSet(this, obj2, H((y0) obj2, obj, i, lVar, null)));
        r();
        s(i);
    }

    private final Object H(y0 y0Var, Object obj, int i, kotlin.s.b.l<? super Throwable, kotlin.o> lVar, Object obj2) {
        if (obj instanceof C0824u) {
            return obj;
        }
        if (!C0795d.k(i) && obj2 == null) {
            return obj;
        }
        if (lVar != null || (((y0Var instanceof AbstractC0808i) && !(y0Var instanceof AbstractC0797e)) || obj2 != null)) {
            return new C0823t(obj, y0Var instanceof AbstractC0808i ? (AbstractC0808i) y0Var : null, lVar, obj2, null, 16);
        }
        return obj;
    }

    private final kotlinx.coroutines.N0.x J(Object obj, Object obj2, kotlin.s.b.l<? super Throwable, kotlin.o> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof y0)) {
                if ((obj3 instanceof C0823t) && obj2 != null && ((C0823t) obj3).f10337d == obj2) {
                    return C0816m.a;
                }
                return null;
            }
        } while (!h.compareAndSet(this, obj3, H((y0) obj3, obj, this.f10198c, lVar, obj2)));
        r();
        return C0816m.a;
    }

    private final void l(kotlin.s.b.l<? super Throwable, kotlin.o> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            com.prolificinteractive.materialcalendarview.r.T(this.f10296e, new C0827x("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final void r() {
        if (z()) {
            return;
        }
        q();
    }

    private final void s(int i) {
        boolean z;
        while (true) {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                z = false;
            } else if (f10294g.compareAndSet(this, 0, 2)) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        kotlin.r.d<T> c2 = c();
        boolean z2 = i == 4;
        if (z2 || !(c2 instanceof kotlinx.coroutines.N0.h) || C0795d.k(i) != C0795d.k(this.f10198c)) {
            C0795d.o(this, c2, z2);
            return;
        }
        D d2 = ((kotlinx.coroutines.N0.h) c2).f10159d;
        kotlin.r.f context = c2.getContext();
        if (d2.isDispatchNeeded(context)) {
            d2.dispatch(context, this);
            return;
        }
        F0 f0 = F0.a;
        Y a = F0.a();
        if (a.f0()) {
            a.a0(this);
            return;
        }
        a.e0(true);
        try {
            C0795d.o(this, c(), true);
            do {
            } while (a.n0());
        } finally {
            try {
            } finally {
            }
        }
    }

    private final U y() {
        kotlin.r.f fVar = this.f10296e;
        InterfaceC0817m0.a aVar = InterfaceC0817m0.H;
        InterfaceC0817m0 interfaceC0817m0 = (InterfaceC0817m0) fVar.get(InterfaceC0817m0.a.a);
        if (interfaceC0817m0 == null) {
            return null;
        }
        U U = com.prolificinteractive.materialcalendarview.r.U(interfaceC0817m0, true, false, new C0819o(this), 2, null);
        this.f10297f = U;
        return U;
    }

    private final boolean z() {
        return (this.f10198c == 2) && ((kotlinx.coroutines.N0.h) this.f10295d).m();
    }

    public final void B(Throwable th) {
        if (!z() ? false : ((kotlinx.coroutines.N0.h) this.f10295d).o(th)) {
            return;
        }
        p(th);
        r();
    }

    public final boolean D() {
        Object obj = this._state;
        if ((obj instanceof C0823t) && ((C0823t) obj).f10337d != null) {
            q();
            return false;
        }
        this._decision = 0;
        this._state = C0791b.a;
        return true;
    }

    public void E(T t, kotlin.s.b.l<? super Throwable, kotlin.o> lVar) {
        F(t, this.f10198c, lVar);
    }

    @Override // kotlinx.coroutines.Q
    public void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof y0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof C0824u) {
                return;
            }
            if (obj2 instanceof C0823t) {
                C0823t c0823t = (C0823t) obj2;
                if (!(!(c0823t.f10338e != null))) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (h.compareAndSet(this, obj2, C0823t.a(c0823t, null, null, null, null, th, 15))) {
                    AbstractC0808i abstractC0808i = c0823t.b;
                    if (abstractC0808i != null) {
                        m(abstractC0808i, th);
                    }
                    kotlin.s.b.l<Throwable, kotlin.o> lVar = c0823t.f10336c;
                    if (lVar != null) {
                        o(lVar, th);
                        return;
                    }
                    return;
                }
            } else if (h.compareAndSet(this, obj2, new C0823t(obj2, null, null, null, th, 14))) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC0812k
    public Object b(T t, Object obj) {
        return J(t, null, null);
    }

    @Override // kotlinx.coroutines.Q
    public final kotlin.r.d<T> c() {
        return this.f10295d;
    }

    @Override // kotlinx.coroutines.Q
    public Throwable d(Object obj) {
        Throwable d2 = super.d(obj);
        if (d2 != null) {
            return d2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.Q
    public <T> T e(Object obj) {
        return obj instanceof C0823t ? (T) ((C0823t) obj).a : obj;
    }

    @Override // kotlinx.coroutines.InterfaceC0812k
    public void f(kotlin.s.b.l<? super Throwable, kotlin.o> lVar) {
        AbstractC0808i c0811j0 = lVar instanceof AbstractC0808i ? (AbstractC0808i) lVar : new C0811j0(lVar);
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C0791b)) {
                if (obj instanceof AbstractC0808i) {
                    A(lVar, obj);
                    throw null;
                }
                boolean z = obj instanceof C0824u;
                if (z) {
                    C0824u c0824u = (C0824u) obj;
                    if (!c0824u.b()) {
                        A(lVar, obj);
                        throw null;
                    }
                    if (obj instanceof C0818n) {
                        if (!z) {
                            c0824u = null;
                        }
                        l(lVar, c0824u != null ? c0824u.a : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof C0823t) {
                    C0823t c0823t = (C0823t) obj;
                    if (c0823t.b != null) {
                        A(lVar, obj);
                        throw null;
                    }
                    if (c0811j0 instanceof AbstractC0797e) {
                        return;
                    }
                    Throwable th = c0823t.f10338e;
                    if (th != null) {
                        l(lVar, th);
                        return;
                    } else {
                        if (h.compareAndSet(this, obj, C0823t.a(c0823t, null, c0811j0, null, null, null, 29))) {
                            return;
                        }
                    }
                } else {
                    if (c0811j0 instanceof AbstractC0797e) {
                        return;
                    }
                    if (h.compareAndSet(this, obj, new C0823t(obj, c0811j0, null, null, null, 28))) {
                        return;
                    }
                }
            } else if (h.compareAndSet(this, obj, c0811j0)) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC0812k
    public Object g(Throwable th) {
        return J(new C0824u(th, false, 2), null, null);
    }

    @Override // kotlin.r.h.a.d
    public kotlin.r.h.a.d getCallerFrame() {
        kotlin.r.d<T> dVar = this.f10295d;
        if (dVar instanceof kotlin.r.h.a.d) {
            return (kotlin.r.h.a.d) dVar;
        }
        return null;
    }

    @Override // kotlin.r.d
    public kotlin.r.f getContext() {
        return this.f10296e;
    }

    @Override // kotlinx.coroutines.InterfaceC0812k
    public Object i(T t, Object obj, kotlin.s.b.l<? super Throwable, kotlin.o> lVar) {
        return J(t, null, lVar);
    }

    @Override // kotlinx.coroutines.InterfaceC0812k
    public void j(D d2, T t) {
        kotlin.r.d<T> dVar = this.f10295d;
        kotlinx.coroutines.N0.h hVar = dVar instanceof kotlinx.coroutines.N0.h ? (kotlinx.coroutines.N0.h) dVar : null;
        F(t, (hVar != null ? hVar.f10159d : null) == d2 ? 4 : this.f10198c, null);
    }

    @Override // kotlinx.coroutines.Q
    public Object k() {
        return this._state;
    }

    public final void m(AbstractC0808i abstractC0808i, Throwable th) {
        try {
            abstractC0808i.a(th);
        } catch (Throwable th2) {
            com.prolificinteractive.materialcalendarview.r.T(this.f10296e, new C0827x("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.InterfaceC0812k
    public boolean n() {
        return !(this._state instanceof y0);
    }

    public final void o(kotlin.s.b.l<? super Throwable, kotlin.o> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            com.prolificinteractive.materialcalendarview.r.T(this.f10296e, new C0827x("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public boolean p(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof y0)) {
                return false;
            }
            z = obj instanceof AbstractC0808i;
        } while (!h.compareAndSet(this, obj, new C0818n(this, th, z)));
        AbstractC0808i abstractC0808i = z ? (AbstractC0808i) obj : null;
        if (abstractC0808i != null) {
            m(abstractC0808i, th);
        }
        r();
        s(this.f10198c);
        return true;
    }

    public final void q() {
        U u = this.f10297f;
        if (u == null) {
            return;
        }
        u.b();
        this.f10297f = x0.a;
    }

    @Override // kotlin.r.d
    public void resumeWith(Object obj) {
        Throwable b = kotlin.h.b(obj);
        if (b != null) {
            obj = new C0824u(b, false, 2);
        }
        F(obj, this.f10198c, null);
    }

    @Override // kotlinx.coroutines.InterfaceC0812k
    public void t(Object obj) {
        s(this.f10198c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CancellableContinuation");
        sb.append('(');
        sb.append(I.c(this.f10295d));
        sb.append("){");
        Object obj = this._state;
        sb.append(obj instanceof y0 ? "Active" : obj instanceof C0818n ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(I.b(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r4.f10297f != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r0 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        r0 = r4._state;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if ((r0 instanceof kotlinx.coroutines.C0824u) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        throw ((kotlinx.coroutines.C0824u) r0).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (kotlinx.coroutines.C0795d.k(r4.f10198c) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        r1 = r4.f10296e;
        r2 = kotlinx.coroutines.InterfaceC0817m0.H;
        r1 = (kotlinx.coroutines.InterfaceC0817m0) r1.get(kotlinx.coroutines.InterfaceC0817m0.a.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r1 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r1.a() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r1 = r1.r();
        a(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        return e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r2 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u() {
        /*
            r4 = this;
            boolean r0 = r4.z()
        L4:
            int r1 = r4._decision
            r2 = 0
            if (r1 == 0) goto L19
            r3 = 2
            if (r1 != r3) goto Ld
            goto L23
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L19:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.C0814l.f10294g
            r3 = 1
            boolean r1 = r1.compareAndSet(r4, r2, r3)
            if (r1 == 0) goto L4
            r2 = r3
        L23:
            if (r2 == 0) goto L34
            kotlinx.coroutines.U r1 = r4.f10297f
            if (r1 != 0) goto L2c
            r4.y()
        L2c:
            if (r0 == 0) goto L31
            r4.C()
        L31:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            return r0
        L34:
            if (r0 == 0) goto L39
            r4.C()
        L39:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.C0824u
            if (r1 == 0) goto L44
            kotlinx.coroutines.u r0 = (kotlinx.coroutines.C0824u) r0
            java.lang.Throwable r0 = r0.a
            throw r0
        L44:
            int r1 = r4.f10198c
            boolean r1 = kotlinx.coroutines.C0795d.k(r1)
            if (r1 == 0) goto L68
            kotlin.r.f r1 = r4.f10296e
            kotlinx.coroutines.m0$a r2 = kotlinx.coroutines.InterfaceC0817m0.H
            kotlinx.coroutines.m0$a r2 = kotlinx.coroutines.InterfaceC0817m0.a.a
            kotlin.r.f$b r1 = r1.get(r2)
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC0817m0) r1
            if (r1 == 0) goto L68
            boolean r2 = r1.a()
            if (r2 != 0) goto L68
            java.util.concurrent.CancellationException r1 = r1.r()
            r4.a(r0, r1)
            throw r1
        L68:
            java.lang.Object r0 = r4.e(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C0814l.u():java.lang.Object");
    }

    public void v() {
        U y = y();
        if (y != null && (!(this._state instanceof y0))) {
            y.b();
            this.f10297f = x0.a;
        }
    }
}
