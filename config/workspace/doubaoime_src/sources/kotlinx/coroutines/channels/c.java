package kotlinx.coroutines.channels;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0814l;
import kotlinx.coroutines.C0816m;
import kotlinx.coroutines.I;
import kotlinx.coroutines.N0.D;
import kotlinx.coroutines.N0.m;

/* loaded from: classes2.dex */
public abstract class c<E> implements w<E> {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10222c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");
    protected final kotlin.s.b.l<E, kotlin.o> a;
    private final kotlinx.coroutines.N0.k b = new kotlinx.coroutines.N0.k();
    private volatile /* synthetic */ Object onCloseHandler = null;

    public static final class a<E> extends v {

        /* renamed from: d, reason: collision with root package name */
        public final E f10223d;

        public a(E e2) {
            this.f10223d = e2;
        }

        @Override // kotlinx.coroutines.channels.v
        public void A(i<?> iVar) {
        }

        @Override // kotlinx.coroutines.channels.v
        public kotlinx.coroutines.N0.x B(m.b bVar) {
            return C0816m.a;
        }

        @Override // kotlinx.coroutines.N0.m
        public String toString() {
            StringBuilder M = e.a.a.a.a.M("SendBuffered@");
            M.append(I.b(this));
            M.append('(');
            M.append(this.f10223d);
            M.append(')');
            return M.toString();
        }

        @Override // kotlinx.coroutines.channels.v
        public void y() {
        }

        @Override // kotlinx.coroutines.channels.v
        public Object z() {
            return this.f10223d;
        }
    }

    public static final class b extends m.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f10224d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlinx.coroutines.N0.m mVar, c cVar) {
            super(mVar);
            this.f10224d = cVar;
        }

        @Override // kotlinx.coroutines.N0.AbstractC0787c
        public Object c(kotlinx.coroutines.N0.m mVar) {
            if (this.f10224d.n()) {
                return null;
            }
            return kotlinx.coroutines.N0.l.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(kotlin.s.b.l<? super E, kotlin.o> lVar) {
        this.a = lVar;
    }

    public static final void a(c cVar, kotlin.r.d dVar, Object obj, i iVar) {
        D b2;
        cVar.j(iVar);
        Throwable th = iVar.f10230d;
        if (th == null) {
            th = new k("Channel was closed");
        }
        kotlin.s.b.l<E, kotlin.o> lVar = cVar.a;
        if (lVar == null || (b2 = kotlinx.coroutines.N0.r.b(lVar, obj, null)) == null) {
            ((C0814l) dVar).resumeWith(com.prolificinteractive.materialcalendarview.r.J(th));
        } else {
            kotlin.a.a(b2, th);
            ((C0814l) dVar).resumeWith(com.prolificinteractive.materialcalendarview.r.J(b2));
        }
    }

    private final void j(i<?> iVar) {
        Object obj = null;
        while (true) {
            kotlinx.coroutines.N0.m r = iVar.r();
            r rVar = r instanceof r ? (r) r : null;
            if (rVar == null) {
                break;
            } else if (rVar.v()) {
                obj = com.prolificinteractive.materialcalendarview.r.e0(obj, rVar);
            } else {
                rVar.s();
            }
        }
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((r) arrayList.get(size)).z(iVar);
                }
            } else {
                ((r) obj).z(iVar);
            }
        }
        r();
    }

    protected Object b(v vVar) {
        boolean z;
        kotlinx.coroutines.N0.m r;
        if (l()) {
            kotlinx.coroutines.N0.m mVar = this.b;
            do {
                r = mVar.r();
                if (r instanceof t) {
                    return r;
                }
            } while (!r.l(vVar, mVar));
            return null;
        }
        kotlinx.coroutines.N0.m mVar2 = this.b;
        b bVar = new b(vVar, this);
        while (true) {
            kotlinx.coroutines.N0.m r2 = mVar2.r();
            if (!(r2 instanceof t)) {
                int x = r2.x(vVar, mVar2, bVar);
                z = true;
                if (x != 1) {
                    if (x == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return r2;
            }
        }
        if (z) {
            return null;
        }
        return kotlinx.coroutines.channels.b.f10220e;
    }

    protected String f() {
        return "";
    }

    protected final i<?> g() {
        kotlinx.coroutines.N0.m q = this.b.q();
        i<?> iVar = q instanceof i ? (i) q : null;
        if (iVar == null) {
            return null;
        }
        j(iVar);
        return iVar;
    }

    protected final i<?> h() {
        kotlinx.coroutines.N0.m r = this.b.r();
        i<?> iVar = r instanceof i ? (i) r : null;
        if (iVar == null) {
            return null;
        }
        j(iVar);
        return iVar;
    }

    protected final kotlinx.coroutines.N0.k i() {
        return this.b;
    }

    @Override // kotlinx.coroutines.channels.w
    public boolean k(Throwable th) {
        boolean z;
        Object obj;
        kotlinx.coroutines.N0.x xVar;
        i<?> iVar = new i<>(th);
        kotlinx.coroutines.N0.m mVar = this.b;
        while (true) {
            kotlinx.coroutines.N0.m r = mVar.r();
            if (!(!(r instanceof i))) {
                z = false;
                break;
            }
            if (r.l(iVar, mVar)) {
                z = true;
                break;
            }
        }
        if (!z) {
            iVar = (i) this.b.r();
        }
        j(iVar);
        if (z && (obj = this.onCloseHandler) != null && obj != (xVar = kotlinx.coroutines.channels.b.f10221f) && f10222c.compareAndSet(this, obj, xVar)) {
            kotlin.s.c.D.c(obj, 1);
            ((kotlin.s.b.l) obj).invoke(th);
        }
        return z;
    }

    protected abstract boolean l();

    @Override // kotlinx.coroutines.channels.w
    public void m(kotlin.s.b.l<? super Throwable, kotlin.o> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10222c;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
            Object obj = this.onCloseHandler;
            if (obj != kotlinx.coroutines.channels.b.f10221f) {
                throw new IllegalStateException(e.a.a.a.a.q("Another handler was already registered: ", obj));
            }
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        i<?> h = h();
        if (h == null || !atomicReferenceFieldUpdater.compareAndSet(this, lVar, kotlinx.coroutines.channels.b.f10221f)) {
            return;
        }
        lVar.invoke(h.f10230d);
    }

    protected abstract boolean n();

    @Override // kotlinx.coroutines.channels.w
    public final Object o(E e2, kotlin.r.d<? super kotlin.o> dVar) {
        if (p(e2) == kotlinx.coroutines.channels.b.b) {
            return kotlin.o.a;
        }
        C0814l h = C0795d.h(kotlin.coroutines.intrinsics.a.d(dVar));
        while (true) {
            if (!(this.b.q() instanceof t) && n()) {
                v xVar = this.a == null ? new x(e2, h) : new y(e2, h, this.a);
                Object b2 = b(xVar);
                if (b2 == null) {
                    C0795d.n(h, xVar);
                    break;
                }
                if (b2 instanceof i) {
                    a(this, h, e2, (i) b2);
                    break;
                }
                if (b2 != kotlinx.coroutines.channels.b.f10220e && !(b2 instanceof r)) {
                    throw new IllegalStateException(e.a.a.a.a.r("enqueueSend returned ", b2));
                }
            }
            Object p = p(e2);
            if (p == kotlinx.coroutines.channels.b.b) {
                h.resumeWith(kotlin.o.a);
                break;
            }
            if (p != kotlinx.coroutines.channels.b.f10218c) {
                if (!(p instanceof i)) {
                    throw new IllegalStateException(e.a.a.a.a.r("offerInternal returned ", p));
                }
                a(this, h, e2, (i) p);
            }
        }
        Object u = h.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (u == coroutineSingletons) {
            kotlin.s.c.l.f(dVar, TypedValues.AttributesType.S_FRAME);
        }
        if (u != coroutineSingletons) {
            u = kotlin.o.a;
        }
        return u == coroutineSingletons ? u : kotlin.o.a;
    }

    protected Object p(E e2) {
        t<E> t;
        do {
            t = t();
            if (t == null) {
                return kotlinx.coroutines.channels.b.f10218c;
            }
        } while (t.i(e2, null) == null);
        t.h(e2);
        return t.c();
    }

    @Override // kotlinx.coroutines.channels.w
    public final boolean q() {
        return h() != null;
    }

    protected void r() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final t<?> s(E e2) {
        kotlinx.coroutines.N0.m r;
        kotlinx.coroutines.N0.k kVar = this.b;
        a aVar = new a(e2);
        do {
            r = kVar.r();
            if (r instanceof t) {
                return (t) r;
            }
        } while (!r.l(aVar, kVar));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.N0.m] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    protected t<E> t() {
        ?? r1;
        kotlinx.coroutines.N0.m w;
        kotlinx.coroutines.N0.k kVar = this.b;
        while (true) {
            r1 = (kotlinx.coroutines.N0.m) kVar.p();
            if (r1 != kVar && (r1 instanceof t)) {
                if (((((t) r1) instanceof i) && !r1.u()) || (w = r1.w()) == null) {
                    break;
                }
                w.t();
            }
        }
        r1 = 0;
        return (t) r1;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(I.b(this));
        sb.append('{');
        kotlinx.coroutines.N0.m q = this.b.q();
        if (q == this.b) {
            str2 = "EmptyQueue";
        } else {
            if (q instanceof i) {
                str = q.toString();
            } else if (q instanceof r) {
                str = "ReceiveQueued";
            } else if (q instanceof v) {
                str = "SendQueued";
            } else {
                str = "UNEXPECTED:" + q;
            }
            kotlinx.coroutines.N0.m r = this.b.r();
            if (r != q) {
                StringBuilder S = e.a.a.a.a.S(str, ",queueSize=");
                kotlinx.coroutines.N0.k kVar = this.b;
                int i = 0;
                for (kotlinx.coroutines.N0.m mVar = (kotlinx.coroutines.N0.m) kVar.p(); !kotlin.s.c.l.a(mVar, kVar); mVar = mVar.q()) {
                    if (mVar instanceof kotlinx.coroutines.N0.m) {
                        i++;
                    }
                }
                S.append(i);
                str2 = S.toString();
                if (r instanceof i) {
                    str2 = str2 + ",closedForSend=" + r;
                }
            } else {
                str2 = str;
            }
        }
        sb.append(str2);
        sb.append('}');
        sb.append(f());
        return sb.toString();
    }

    protected final v u() {
        kotlinx.coroutines.N0.m mVar;
        kotlinx.coroutines.N0.m w;
        kotlinx.coroutines.N0.k kVar = this.b;
        while (true) {
            mVar = (kotlinx.coroutines.N0.m) kVar.p();
            if (mVar != kVar && (mVar instanceof v)) {
                if (((((v) mVar) instanceof i) && !mVar.u()) || (w = mVar.w()) == null) {
                    break;
                }
                w.t();
            }
        }
        mVar = null;
        return (v) mVar;
    }
}
