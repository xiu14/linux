package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.r.f;
import kotlinx.coroutines.InterfaceC0817m0;
import kotlinx.coroutines.N0.m;

/* loaded from: classes2.dex */
public class r0 implements InterfaceC0817m0, r, z0 {
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(r0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    private static final class a extends q0 {

        /* renamed from: e, reason: collision with root package name */
        private final r0 f10303e;

        /* renamed from: f, reason: collision with root package name */
        private final b f10304f;

        /* renamed from: g, reason: collision with root package name */
        private final C0821q f10305g;
        private final Object h;

        public a(r0 r0Var, b bVar, C0821q c0821q, Object obj) {
            this.f10303e = r0Var;
            this.f10304f = bVar;
            this.f10305g = c0821q;
            this.h = obj;
        }

        @Override // kotlin.s.b.l
        public /* bridge */ /* synthetic */ kotlin.o invoke(Throwable th) {
            y(th);
            return kotlin.o.a;
        }

        @Override // kotlinx.coroutines.AbstractC0826w
        public void y(Throwable th) {
            r0.v(this.f10303e, this.f10304f, this.f10305g, this.h);
        }
    }

    private static final class b implements InterfaceC0807h0 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;
        private final w0 a;

        public b(w0 w0Var, boolean z, Throwable th) {
            this.a = w0Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        @Override // kotlinx.coroutines.InterfaceC0807h0
        public boolean a() {
            return ((Throwable) this._rootCause) == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
                return;
            }
            if (th == th2) {
                return;
            }
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                this._exceptionsHolder = th;
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(e.a.a.a.a.r("State is ", obj));
                }
                ((ArrayList) obj).add(th);
            } else {
                if (th == obj) {
                    return;
                }
                ArrayList<Throwable> c2 = c();
                c2.add(obj);
                c2.add(th);
                this._exceptionsHolder = c2;
            }
        }

        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        public final boolean e() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean f() {
            return this._isCompleting;
        }

        @Override // kotlinx.coroutines.InterfaceC0807h0
        public w0 g() {
            return this.a;
        }

        public final boolean h() {
            kotlinx.coroutines.N0.x xVar;
            Object obj = this._exceptionsHolder;
            xVar = s0.f10310e;
            return obj == xVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final List<Throwable> i(Throwable th) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.N0.x xVar;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = c();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> c2 = c();
                c2.add(obj);
                arrayList = c2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(e.a.a.a.a.r("State is ", obj));
                }
                arrayList = (ArrayList) obj;
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !kotlin.s.c.l.a(th, th2)) {
                arrayList.add(th);
            }
            xVar = s0.f10310e;
            this._exceptionsHolder = xVar;
            return arrayList;
        }

        public final void j(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
        public String toString() {
            StringBuilder M = e.a.a.a.a.M("Finishing[cancelling=");
            M.append(e());
            M.append(", completing=");
            M.append((boolean) this._isCompleting);
            M.append(", rootCause=");
            M.append((Throwable) this._rootCause);
            M.append(", exceptions=");
            M.append(this._exceptionsHolder);
            M.append(", list=");
            M.append(this.a);
            M.append(']');
            return M.toString();
        }
    }

    public static final class c extends m.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r0 f10306d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f10307e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlinx.coroutines.N0.m mVar, r0 r0Var, Object obj) {
            super(mVar);
            this.f10306d = r0Var;
            this.f10307e = obj;
        }

        @Override // kotlinx.coroutines.N0.AbstractC0787c
        public Object c(kotlinx.coroutines.N0.m mVar) {
            if (this.f10306d.X() == this.f10307e) {
                return null;
            }
            return kotlinx.coroutines.N0.l.a();
        }
    }

    public r0(boolean z) {
        this._state = z ? s0.f10312g : s0.f10311f;
        this._parentHandle = null;
    }

    private final boolean E(Throwable th) {
        if (b0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC0820p interfaceC0820p = (InterfaceC0820p) this._parentHandle;
        return (interfaceC0820p == null || interfaceC0820p == x0.a) ? z : interfaceC0820p.f(th) || z;
    }

    private final void K(InterfaceC0807h0 interfaceC0807h0, Object obj) {
        InterfaceC0820p interfaceC0820p = (InterfaceC0820p) this._parentHandle;
        if (interfaceC0820p != null) {
            interfaceC0820p.b();
            this._parentHandle = x0.a;
        }
        C0827x c0827x = null;
        C0824u c0824u = obj instanceof C0824u ? (C0824u) obj : null;
        Throwable th = c0824u != null ? c0824u.a : null;
        if (interfaceC0807h0 instanceof q0) {
            try {
                ((q0) interfaceC0807h0).y(th);
                return;
            } catch (Throwable th2) {
                Z(new C0827x("Exception in completion handler " + interfaceC0807h0 + " for " + this, th2));
                return;
            }
        }
        w0 g2 = interfaceC0807h0.g();
        if (g2 != null) {
            for (kotlinx.coroutines.N0.m mVar = (kotlinx.coroutines.N0.m) g2.p(); !kotlin.s.c.l.a(mVar, g2); mVar = mVar.q()) {
                if (mVar instanceof q0) {
                    q0 q0Var = (q0) mVar;
                    try {
                        q0Var.y(th);
                    } catch (Throwable th3) {
                        if (c0827x != null) {
                            kotlin.a.a(c0827x, th3);
                        } else {
                            c0827x = new C0827x("Exception in completion handler " + q0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0827x != null) {
                Z(c0827x);
            }
        }
    }

    private final Throwable L(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new n0(F(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((z0) obj).P();
    }

    private final Object O(b bVar, Object obj) {
        boolean e2;
        Throwable R;
        boolean z;
        C0824u c0824u = obj instanceof C0824u ? (C0824u) obj : null;
        Throwable th = c0824u != null ? c0824u.a : null;
        synchronized (bVar) {
            e2 = bVar.e();
            List<Throwable> i = bVar.i(th);
            R = R(bVar, i);
            z = true;
            if (R != null && i.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i.size()));
                for (Throwable th2 : i) {
                    if (th2 != R && th2 != R && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        kotlin.a.a(R, th2);
                    }
                }
            }
        }
        if (R != null && R != th) {
            obj = new C0824u(R, false, 2);
        }
        if (R != null) {
            if (!E(R) && !Y(R)) {
                z = false;
            }
            if (z) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((C0824u) obj).b();
            }
        }
        if (!e2) {
            g0();
        }
        h0(obj);
        a.compareAndSet(this, bVar, obj instanceof InterfaceC0807h0 ? new C0809i0((InterfaceC0807h0) obj) : obj);
        K(bVar, obj);
        return obj;
    }

    private final Throwable R(b bVar, List<? extends Throwable> list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (bVar.e()) {
                return new n0(F(), null, this);
            }
            return null;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof G0) {
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof G0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final w0 V(InterfaceC0807h0 interfaceC0807h0) {
        w0 g2 = interfaceC0807h0.g();
        if (g2 != null) {
            return g2;
        }
        if (interfaceC0807h0 instanceof X) {
            return new w0();
        }
        if (!(interfaceC0807h0 instanceof q0)) {
            throw new IllegalStateException(("State should have list: " + interfaceC0807h0).toString());
        }
        q0 q0Var = (q0) interfaceC0807h0;
        q0Var.m(new w0());
        a.compareAndSet(this, q0Var, q0Var.q());
        return null;
    }

    private final C0821q e0(kotlinx.coroutines.N0.m mVar) {
        while (mVar.u()) {
            mVar = mVar.r();
        }
        while (true) {
            mVar = mVar.q();
            if (!mVar.u()) {
                if (mVar instanceof C0821q) {
                    return (C0821q) mVar;
                }
                if (mVar instanceof w0) {
                    return null;
                }
            }
        }
    }

    private final void f0(w0 w0Var, Throwable th) {
        g0();
        C0827x c0827x = null;
        for (kotlinx.coroutines.N0.m mVar = (kotlinx.coroutines.N0.m) w0Var.p(); !kotlin.s.c.l.a(mVar, w0Var); mVar = mVar.q()) {
            if (mVar instanceof o0) {
                q0 q0Var = (q0) mVar;
                try {
                    q0Var.y(th);
                } catch (Throwable th2) {
                    if (c0827x != null) {
                        kotlin.a.a(c0827x, th2);
                    } else {
                        c0827x = new C0827x("Exception in completion handler " + q0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (c0827x != null) {
            Z(c0827x);
        }
        E(th);
    }

    private final String k0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof InterfaceC0807h0 ? ((InterfaceC0807h0) obj).a() ? "Active" : "New" : obj instanceof C0824u ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.e() ? "Cancelling" : bVar.f() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException m0(r0 r0Var, Throwable th, String str, int i, Object obj) {
        int i2 = i & 1;
        return r0Var.l0(th, null);
    }

    private final Object n0(Object obj, Object obj2) {
        kotlinx.coroutines.N0.x xVar;
        kotlinx.coroutines.N0.x xVar2;
        kotlinx.coroutines.N0.x xVar3;
        kotlinx.coroutines.N0.x xVar4;
        kotlinx.coroutines.N0.x xVar5;
        if (!(obj instanceof InterfaceC0807h0)) {
            xVar5 = s0.a;
            return xVar5;
        }
        boolean z = true;
        if (((obj instanceof X) || (obj instanceof q0)) && !(obj instanceof C0821q) && !(obj2 instanceof C0824u)) {
            InterfaceC0807h0 interfaceC0807h0 = (InterfaceC0807h0) obj;
            if (a.compareAndSet(this, interfaceC0807h0, obj2 instanceof InterfaceC0807h0 ? new C0809i0((InterfaceC0807h0) obj2) : obj2)) {
                g0();
                h0(obj2);
                K(interfaceC0807h0, obj2);
            } else {
                z = false;
            }
            if (z) {
                return obj2;
            }
            xVar = s0.f10308c;
            return xVar;
        }
        InterfaceC0807h0 interfaceC0807h02 = (InterfaceC0807h0) obj;
        w0 V = V(interfaceC0807h02);
        if (V == null) {
            xVar4 = s0.f10308c;
            return xVar4;
        }
        C0821q c0821q = null;
        b bVar = interfaceC0807h02 instanceof b ? (b) interfaceC0807h02 : null;
        if (bVar == null) {
            bVar = new b(V, false, null);
        }
        synchronized (bVar) {
            if (bVar.f()) {
                xVar3 = s0.a;
                return xVar3;
            }
            bVar.j(true);
            if (bVar != interfaceC0807h02 && !a.compareAndSet(this, interfaceC0807h02, bVar)) {
                xVar2 = s0.f10308c;
                return xVar2;
            }
            boolean e2 = bVar.e();
            C0824u c0824u = obj2 instanceof C0824u ? (C0824u) obj2 : null;
            if (c0824u != null) {
                bVar.b(c0824u.a);
            }
            Throwable d2 = bVar.d();
            if (!Boolean.valueOf(true ^ e2).booleanValue()) {
                d2 = null;
            }
            if (d2 != null) {
                f0(V, d2);
            }
            C0821q c0821q2 = interfaceC0807h02 instanceof C0821q ? (C0821q) interfaceC0807h02 : null;
            if (c0821q2 == null) {
                w0 g2 = interfaceC0807h02.g();
                if (g2 != null) {
                    c0821q = e0(g2);
                }
            } else {
                c0821q = c0821q2;
            }
            return (c0821q == null || !o0(bVar, c0821q, obj2)) ? O(bVar, obj2) : s0.b;
        }
    }

    private final boolean o0(b bVar, C0821q c0821q, Object obj) {
        while (com.prolificinteractive.materialcalendarview.r.U(c0821q.f10301e, false, false, new a(this, bVar, c0821q, obj), 1, null) == x0.a) {
            c0821q = e0(c0821q);
            if (c0821q == null) {
                return false;
            }
        }
        return true;
    }

    public static final void v(r0 r0Var, b bVar, C0821q c0821q, Object obj) {
        C0821q e0 = r0Var.e0(c0821q);
        if (e0 == null || !r0Var.o0(bVar, e0, obj)) {
            r0Var.A(r0Var.O(bVar, obj));
        }
    }

    private final boolean y(Object obj, w0 w0Var, q0 q0Var) {
        int x;
        c cVar = new c(q0Var, this, obj);
        do {
            x = w0Var.r().x(q0Var, w0Var, cVar);
            if (x == 1) {
                return true;
            }
        } while (x != 2);
        return false;
    }

    protected void A(Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f3, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.r0.B(java.lang.Object):boolean");
    }

    public void C(Throwable th) {
        B(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String F() {
        return "Job was cancelled";
    }

    public boolean J(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return B(th) && T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.z0
    public CancellationException P() {
        CancellationException cancellationException;
        Object X = X();
        if (X instanceof b) {
            cancellationException = ((b) X).d();
        } else if (X instanceof C0824u) {
            cancellationException = ((C0824u) X).a;
        } else {
            if (X instanceof InterfaceC0807h0) {
                throw new IllegalStateException(e.a.a.a.a.r("Cannot be cancelling child in this state: ", X));
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        StringBuilder M = e.a.a.a.a.M("Parent job is ");
        M.append(k0(X));
        return new n0(M.toString(), cancellationException, this);
    }

    @Override // kotlinx.coroutines.InterfaceC0817m0
    public final InterfaceC0820p S(r rVar) {
        return (InterfaceC0820p) com.prolificinteractive.materialcalendarview.r.U(this, true, false, new C0821q(rVar), 2, null);
    }

    public boolean T() {
        return true;
    }

    public boolean U() {
        return false;
    }

    public final InterfaceC0820p W() {
        return (InterfaceC0820p) this._parentHandle;
    }

    public final Object X() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.N0.s)) {
                return obj;
            }
            ((kotlinx.coroutines.N0.s) obj).a(this);
        }
    }

    protected boolean Y(Throwable th) {
        return false;
    }

    public void Z(Throwable th) {
        throw th;
    }

    @Override // kotlinx.coroutines.InterfaceC0817m0
    public boolean a() {
        Object X = X();
        return (X instanceof InterfaceC0807h0) && ((InterfaceC0807h0) X).a();
    }

    protected final void a0(InterfaceC0817m0 interfaceC0817m0) {
        if (interfaceC0817m0 == null) {
            this._parentHandle = x0.a;
            return;
        }
        interfaceC0817m0.start();
        InterfaceC0820p S = interfaceC0817m0.S(this);
        this._parentHandle = S;
        if (!(X() instanceof InterfaceC0807h0)) {
            S.b();
            this._parentHandle = x0.a;
        }
    }

    protected boolean b0() {
        return false;
    }

    public final Object c0(Object obj) {
        Object n0;
        kotlinx.coroutines.N0.x xVar;
        kotlinx.coroutines.N0.x xVar2;
        do {
            n0 = n0(X(), obj);
            xVar = s0.a;
            if (n0 == xVar) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0824u c0824u = obj instanceof C0824u ? (C0824u) obj : null;
                throw new IllegalStateException(str, c0824u != null ? c0824u.a : null);
            }
            xVar2 = s0.f10308c;
        } while (n0 == xVar2);
        return n0;
    }

    @Override // kotlinx.coroutines.InterfaceC0817m0, kotlinx.coroutines.channels.s
    public void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new n0(F(), null, this);
        }
        C(cancellationException);
    }

    public String d0() {
        return getClass().getSimpleName();
    }

    @Override // kotlin.r.f
    public <R> R fold(R r, kotlin.s.b.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) com.prolificinteractive.materialcalendarview.r.L(this, r, pVar);
    }

    protected void g0() {
    }

    @Override // kotlin.r.f.b, kotlin.r.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) com.prolificinteractive.materialcalendarview.r.M(this, cVar);
    }

    @Override // kotlin.r.f.b
    public final f.c<?> getKey() {
        return InterfaceC0817m0.a.a;
    }

    protected void h0(Object obj) {
    }

    protected void i0() {
    }

    @Override // kotlinx.coroutines.InterfaceC0817m0
    public final boolean isCancelled() {
        Object X = X();
        return (X instanceof C0824u) || ((X instanceof b) && ((b) X).e());
    }

    public final void j0(q0 q0Var) {
        Object X;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        X x;
        do {
            X = X();
            if (!(X instanceof q0)) {
                if (!(X instanceof InterfaceC0807h0) || ((InterfaceC0807h0) X).g() == null) {
                    return;
                }
                q0Var.v();
                return;
            }
            if (X != q0Var) {
                return;
            }
            atomicReferenceFieldUpdater = a;
            x = s0.f10312g;
        } while (!atomicReferenceFieldUpdater.compareAndSet(this, X, x));
    }

    protected final CancellationException l0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = F();
            }
            cancellationException = new n0(str, th, this);
        }
        return cancellationException;
    }

    @Override // kotlin.r.f
    public kotlin.r.f minusKey(f.c<?> cVar) {
        return com.prolificinteractive.materialcalendarview.r.Z(this, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlinx.coroutines.g0] */
    @Override // kotlinx.coroutines.InterfaceC0817m0
    public final U p(boolean z, boolean z2, kotlin.s.b.l<? super Throwable, kotlin.o> lVar) {
        q0 q0Var;
        Throwable th;
        if (z) {
            q0Var = lVar instanceof o0 ? (o0) lVar : null;
            if (q0Var == null) {
                q0Var = new C0813k0(lVar);
            }
        } else {
            q0Var = lVar instanceof q0 ? (q0) lVar : null;
            if (q0Var == null) {
                q0Var = new C0815l0(lVar);
            }
        }
        q0Var.f10302d = this;
        while (true) {
            Object X = X();
            if (X instanceof X) {
                X x = (X) X;
                if (!x.a()) {
                    w0 w0Var = new w0();
                    if (!x.a()) {
                        w0Var = new C0805g0(w0Var);
                    }
                    a.compareAndSet(this, x, w0Var);
                } else if (a.compareAndSet(this, X, q0Var)) {
                    return q0Var;
                }
            } else {
                if (!(X instanceof InterfaceC0807h0)) {
                    if (z2) {
                        C0824u c0824u = X instanceof C0824u ? (C0824u) X : null;
                        lVar.invoke(c0824u != null ? c0824u.a : null);
                    }
                    return x0.a;
                }
                w0 g2 = ((InterfaceC0807h0) X).g();
                if (g2 == null) {
                    Objects.requireNonNull(X, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    q0 q0Var2 = (q0) X;
                    q0Var2.m(new w0());
                    a.compareAndSet(this, q0Var2, q0Var2.q());
                } else {
                    U u = x0.a;
                    if (z && (X instanceof b)) {
                        synchronized (X) {
                            th = ((b) X).d();
                            if (th == null || ((lVar instanceof C0821q) && !((b) X).f())) {
                                if (y(X, g2, q0Var)) {
                                    if (th == null) {
                                        return q0Var;
                                    }
                                    u = q0Var;
                                }
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z2) {
                            lVar.invoke(th);
                        }
                        return u;
                    }
                    if (y(X, g2, q0Var)) {
                        return q0Var;
                    }
                }
            }
        }
    }

    @Override // kotlin.r.f
    public kotlin.r.f plus(kotlin.r.f fVar) {
        return com.prolificinteractive.materialcalendarview.r.d0(this, fVar);
    }

    @Override // kotlinx.coroutines.InterfaceC0817m0
    public final CancellationException r() {
        Object X = X();
        if (X instanceof b) {
            Throwable d2 = ((b) X).d();
            if (d2 != null) {
                return l0(d2, getClass().getSimpleName() + " is cancelling");
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (X instanceof InterfaceC0807h0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (X instanceof C0824u) {
            return m0(this, ((C0824u) X).a, null, 1, null);
        }
        return new n0(getClass().getSimpleName() + " has completed normally", null, this);
    }

    @Override // kotlinx.coroutines.r
    public final void s(z0 z0Var) {
        B(z0Var);
    }

    @Override // kotlinx.coroutines.InterfaceC0817m0
    public final boolean start() {
        char c2;
        X x;
        do {
            Object X = X();
            c2 = 65535;
            if (X instanceof X) {
                if (!((X) X).a()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                    x = s0.f10312g;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, X, x)) {
                        i0();
                        c2 = 1;
                    }
                }
                c2 = 0;
            } else {
                if (X instanceof C0805g0) {
                    if (a.compareAndSet(this, X, ((C0805g0) X).g())) {
                        i0();
                        c2 = 1;
                    }
                }
                c2 = 0;
            }
            if (c2 == 0) {
                return false;
            }
        } while (c2 != 1);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(d0() + '{' + k0(X()) + '}');
        sb.append('@');
        sb.append(I.b(this));
        return sb.toString();
    }

    @Override // kotlinx.coroutines.InterfaceC0817m0
    public final U z(kotlin.s.b.l<? super Throwable, kotlin.o> lVar) {
        return p(false, true, lVar);
    }
}
