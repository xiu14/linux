package kotlinx.coroutines.P0;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0814l;
import kotlinx.coroutines.C0816m;
import kotlinx.coroutines.InterfaceC0812k;
import kotlinx.coroutines.N0.AbstractC0787c;
import kotlinx.coroutines.N0.k;
import kotlinx.coroutines.N0.s;
import kotlinx.coroutines.N0.x;
import kotlinx.coroutines.U;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<java.lang.Object, kotlinx.coroutines.P0.c>] */
/* loaded from: classes2.dex */
public final class d implements kotlinx.coroutines.P0.c {
    static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    private final class a extends b {

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC0812k<o> f10181f;

        /* renamed from: kotlinx.coroutines.P0.d$a$a, reason: collision with other inner class name */
        static final class C0474a extends m implements l<Throwable, o> {
            final /* synthetic */ d a;
            final /* synthetic */ a b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0474a(d dVar, a aVar) {
                super(1);
                this.a = dVar;
                this.b = aVar;
            }

            @Override // kotlin.s.b.l
            public o invoke(Throwable th) {
                this.a.c(this.b.f10184d);
                return o.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, InterfaceC0812k<? super o> interfaceC0812k) {
            super(d.this, obj);
            this.f10181f = interfaceC0812k;
        }

        @Override // kotlinx.coroutines.P0.d.b
        public boolean A() {
            return z() && this.f10181f.i(o.a, null, new C0474a(d.this, this)) != null;
        }

        @Override // kotlinx.coroutines.N0.m
        public String toString() {
            StringBuilder M = e.a.a.a.a.M("LockCont[");
            M.append(this.f10184d);
            M.append(", ");
            M.append(this.f10181f);
            M.append("] for ");
            M.append(d.this);
            return M.toString();
        }

        @Override // kotlinx.coroutines.P0.d.b
        public void y() {
            this.f10181f.t(C0816m.a);
        }
    }

    private abstract class b extends kotlinx.coroutines.N0.m implements U {

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f10183e = AtomicIntegerFieldUpdater.newUpdater(b.class, "isTaken");

        /* renamed from: d, reason: collision with root package name */
        public final Object f10184d;
        private volatile /* synthetic */ int isTaken = 0;

        public b(d dVar, Object obj) {
            this.f10184d = obj;
        }

        public abstract boolean A();

        @Override // kotlinx.coroutines.U
        public final void b() {
            v();
        }

        public abstract void y();

        public final boolean z() {
            return f10183e.compareAndSet(this, 0, 1);
        }
    }

    private static final class c extends k {
        public volatile Object owner;

        public c(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.N0.m
        public String toString() {
            StringBuilder M = e.a.a.a.a.M("LockedQueue[");
            M.append(this.owner);
            M.append(']');
            return M.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.P0.d$d, reason: collision with other inner class name */
    private static final class C0475d extends AbstractC0787c<d> {
        public final c b;

        public C0475d(c cVar) {
            this.b = cVar;
        }

        @Override // kotlinx.coroutines.N0.AbstractC0787c
        public void b(d dVar, Object obj) {
            d.a.compareAndSet(dVar, this, obj == null ? f.f10187e : this.b);
        }

        @Override // kotlinx.coroutines.N0.AbstractC0787c
        public Object c(d dVar) {
            x xVar;
            c cVar = this.b;
            if (cVar.p() == cVar) {
                return null;
            }
            xVar = f.a;
            return xVar;
        }
    }

    public d(boolean z) {
        this._state = z ? f.f10186d : f.f10187e;
    }

    @Override // kotlinx.coroutines.P0.c
    public boolean a(Object obj) {
        x xVar;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.P0.b) {
                Object obj3 = ((kotlinx.coroutines.P0.b) obj2).a;
                xVar = f.f10185c;
                if (obj3 != xVar) {
                    return false;
                }
                if (a.compareAndSet(this, obj2, obj == null ? f.f10186d : new kotlinx.coroutines.P0.b(obj))) {
                    return true;
                }
            } else {
                if (obj2 instanceof c) {
                    if (((c) obj2).owner != obj) {
                        return false;
                    }
                    throw new IllegalStateException(e.a.a.a.a.q("Already locked by ", obj).toString());
                }
                if (!(obj2 instanceof s)) {
                    throw new IllegalStateException(e.a.a.a.a.r("Illegal state ", obj2));
                }
                ((s) obj2).a(this);
            }
        }
    }

    @Override // kotlinx.coroutines.P0.c
    public Object b(Object obj, kotlin.r.d<? super o> dVar) {
        x xVar;
        if (a(obj)) {
            return o.a;
        }
        C0814l h = C0795d.h(kotlin.coroutines.intrinsics.a.d(dVar));
        a aVar = new a(obj, h);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.P0.b) {
                kotlinx.coroutines.P0.b bVar = (kotlinx.coroutines.P0.b) obj2;
                Object obj3 = bVar.a;
                xVar = f.f10185c;
                if (obj3 != xVar) {
                    a.compareAndSet(this, obj2, new c(bVar.a));
                } else {
                    if (a.compareAndSet(this, obj2, obj == null ? f.f10186d : new kotlinx.coroutines.P0.b(obj))) {
                        h.E(o.a, new e(this, obj));
                        break;
                    }
                }
            } else if (obj2 instanceof c) {
                c cVar = (c) obj2;
                if (!(cVar.owner != obj)) {
                    throw new IllegalStateException(e.a.a.a.a.q("Already locked by ", obj).toString());
                }
                while (!cVar.r().l(aVar, cVar)) {
                }
                if (this._state == obj2 || !aVar.z()) {
                    break;
                }
                aVar = new a(obj, h);
            } else {
                if (!(obj2 instanceof s)) {
                    throw new IllegalStateException(e.a.a.a.a.r("Illegal state ", obj2));
                }
                ((s) obj2).a(this);
            }
        }
        C0795d.n(h, aVar);
        Object u = h.u();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (u == coroutineSingletons) {
            kotlin.s.c.l.f(dVar, TypedValues.AttributesType.S_FRAME);
        }
        if (u != coroutineSingletons) {
            u = o.a;
        }
        return u == coroutineSingletons ? u : o.a;
    }

    @Override // kotlinx.coroutines.P0.c
    public void c(Object obj) {
        kotlinx.coroutines.P0.b bVar;
        x xVar;
        kotlinx.coroutines.N0.m mVar;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.P0.b) {
                if (obj == null) {
                    Object obj3 = ((kotlinx.coroutines.P0.b) obj2).a;
                    xVar = f.f10185c;
                    if (!(obj3 != xVar)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    kotlinx.coroutines.P0.b bVar2 = (kotlinx.coroutines.P0.b) obj2;
                    if (!(bVar2.a == obj)) {
                        StringBuilder M = e.a.a.a.a.M("Mutex is locked by ");
                        M.append(bVar2.a);
                        M.append(" but expected ");
                        M.append(obj);
                        throw new IllegalStateException(M.toString().toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                bVar = f.f10187e;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar)) {
                    return;
                }
            } else if (obj2 instanceof s) {
                ((s) obj2).a(this);
            } else {
                if (!(obj2 instanceof c)) {
                    throw new IllegalStateException(e.a.a.a.a.r("Illegal state ", obj2));
                }
                if (obj != null) {
                    c cVar = (c) obj2;
                    if (!(cVar.owner == obj)) {
                        StringBuilder M2 = e.a.a.a.a.M("Mutex is locked by ");
                        M2.append(cVar.owner);
                        M2.append(" but expected ");
                        M2.append(obj);
                        throw new IllegalStateException(M2.toString().toString());
                    }
                }
                c cVar2 = (c) obj2;
                while (true) {
                    mVar = (kotlinx.coroutines.N0.m) cVar2.p();
                    if (mVar == cVar2) {
                        mVar = null;
                        break;
                    } else if (mVar.v()) {
                        break;
                    } else {
                        mVar.s();
                    }
                }
                if (mVar == null) {
                    C0475d c0475d = new C0475d(cVar2);
                    if (a.compareAndSet(this, obj2, c0475d) && c0475d.a(this) == null) {
                        return;
                    }
                } else {
                    b bVar3 = (b) mVar;
                    if (bVar3.A()) {
                        Object obj4 = bVar3.f10184d;
                        if (obj4 == null) {
                            obj4 = f.b;
                        }
                        cVar2.owner = obj4;
                        bVar3.y();
                        return;
                    }
                }
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.P0.b) {
                StringBuilder M = e.a.a.a.a.M("Mutex[");
                M.append(((kotlinx.coroutines.P0.b) obj).a);
                M.append(']');
                return M.toString();
            }
            if (!(obj instanceof s)) {
                if (!(obj instanceof c)) {
                    throw new IllegalStateException(e.a.a.a.a.r("Illegal state ", obj));
                }
                StringBuilder M2 = e.a.a.a.a.M("Mutex[");
                M2.append(((c) obj).owner);
                M2.append(']');
                return M2.toString();
            }
            ((s) obj).a(this);
        }
    }
}
