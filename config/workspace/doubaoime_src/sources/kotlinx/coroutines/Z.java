package kotlinx.coroutines;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public abstract class Z extends AbstractC0790a0 implements N {

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10203e = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_queue");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10204f = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    private final class a extends c {

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC0812k<kotlin.o> f10205c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j, InterfaceC0812k<? super kotlin.o> interfaceC0812k) {
            super(j);
            this.f10205c = interfaceC0812k;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10205c.j(Z.this, kotlin.o.a);
        }

        @Override // kotlinx.coroutines.Z.c
        public String toString() {
            return super.toString() + this.f10205c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends c {

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f10207c;

        public b(long j, Runnable runnable) {
            super(j);
            this.f10207c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10207c.run();
        }

        @Override // kotlinx.coroutines.Z.c
        public String toString() {
            return super.toString() + this.f10207c;
        }
    }

    public static abstract class c implements Runnable, Comparable<c>, U, kotlinx.coroutines.N0.B {
        private volatile Object _heap;
        public long a;
        private int b = -1;

        public c(long j) {
            this.a = j;
        }

        @Override // kotlinx.coroutines.N0.B
        public void a(kotlinx.coroutines.N0.A<?> a) {
            kotlinx.coroutines.N0.x xVar;
            Object obj = this._heap;
            xVar = C0792b0.a;
            if (!(obj != xVar)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = a;
        }

        @Override // kotlinx.coroutines.U
        public final synchronized void b() {
            kotlinx.coroutines.N0.x xVar;
            kotlinx.coroutines.N0.x xVar2;
            Object obj = this._heap;
            xVar = C0792b0.a;
            if (obj == xVar) {
                return;
            }
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                synchronized (dVar) {
                    if (c() != null) {
                        dVar.d(e());
                    }
                }
            }
            xVar2 = C0792b0.a;
            this._heap = xVar2;
        }

        @Override // kotlinx.coroutines.N0.B
        public kotlinx.coroutines.N0.A<?> c() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.N0.A) {
                return (kotlinx.coroutines.N0.A) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        public int compareTo(c cVar) {
            long j = this.a - cVar.a;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.N0.B
        public void d(int i) {
            this.b = i;
        }

        @Override // kotlinx.coroutines.N0.B
        public int e() {
            return this.b;
        }

        public final synchronized int g(long j, d dVar, Z z) {
            kotlinx.coroutines.N0.x xVar;
            Object obj = this._heap;
            xVar = C0792b0.a;
            if (obj == xVar) {
                return 2;
            }
            synchronized (dVar) {
                c b = dVar.b();
                if (Z.q0(z)) {
                    return 1;
                }
                if (b == null) {
                    dVar.b = j;
                } else {
                    long j2 = b.a;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - dVar.b > 0) {
                        dVar.b = j;
                    }
                }
                long j3 = this.a;
                long j4 = dVar.b;
                if (j3 - j4 < 0) {
                    this.a = j4;
                }
                dVar.a(this);
                return 0;
            }
        }

        public String toString() {
            return e.a.a.a.a.E(e.a.a.a.a.M("Delayed[nanos="), this.a, ']');
        }
    }

    public static final class d extends kotlinx.coroutines.N0.A<c> {
        public long b;

        public d(long j) {
            this.b = j;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static final boolean q0(Z z) {
        return z._isCompleted;
    }

    private final boolean s0(Runnable runnable) {
        kotlinx.coroutines.N0.x xVar;
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (f10203e.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.N0.o) {
                kotlinx.coroutines.N0.o oVar = (kotlinx.coroutines.N0.o) obj;
                int a2 = oVar.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    f10203e.compareAndSet(this, obj, oVar.e());
                } else if (a2 == 2) {
                    return false;
                }
            } else {
                xVar = C0792b0.b;
                if (obj == xVar) {
                    return false;
                }
                kotlinx.coroutines.N0.o oVar2 = new kotlinx.coroutines.N0.o(8, true);
                oVar2.a((Runnable) obj);
                oVar2.a(runnable);
                if (f10203e.compareAndSet(this, obj, oVar2)) {
                    return true;
                }
            }
        }
    }

    public U A(long j, Runnable runnable, kotlin.r.f fVar) {
        return K.a().A(j, runnable, fVar);
    }

    @Override // kotlinx.coroutines.D
    public final void dispatch(kotlin.r.f fVar, Runnable runnable) {
        r0(runnable);
    }

    @Override // kotlinx.coroutines.Y
    public long l0() {
        c b2;
        kotlinx.coroutines.N0.x xVar;
        kotlinx.coroutines.N0.x xVar2;
        c d2;
        if (n0()) {
            return 0L;
        }
        d dVar = (d) this._delayed;
        Runnable runnable = null;
        if (dVar != null && !dVar.c()) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    c b3 = dVar.b();
                    if (b3 == null) {
                        d2 = null;
                    } else {
                        c cVar = b3;
                        d2 = ((nanoTime - cVar.a) > 0L ? 1 : ((nanoTime - cVar.a) == 0L ? 0 : -1)) >= 0 ? s0(cVar) : false ? dVar.d(0) : null;
                    }
                }
            } while (d2 != null);
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof kotlinx.coroutines.N0.o)) {
                xVar2 = C0792b0.b;
                if (obj == xVar2) {
                    break;
                }
                if (f10203e.compareAndSet(this, obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                kotlinx.coroutines.N0.o oVar = (kotlinx.coroutines.N0.o) obj;
                Object f2 = oVar.f();
                if (f2 != kotlinx.coroutines.N0.o.h) {
                    runnable = (Runnable) f2;
                    break;
                }
                f10203e.compareAndSet(this, obj, oVar.e());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        if (super.c0() == 0) {
            return 0L;
        }
        Object obj2 = this._queue;
        if (obj2 != null) {
            if (!(obj2 instanceof kotlinx.coroutines.N0.o)) {
                xVar = C0792b0.b;
                if (obj2 != xVar) {
                    return 0L;
                }
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }
            if (!((kotlinx.coroutines.N0.o) obj2).d()) {
                return 0L;
            }
        }
        d dVar2 = (d) this._delayed;
        if (dVar2 != null) {
            synchronized (dVar2) {
                b2 = dVar2.b();
            }
            c cVar2 = b2;
            if (cVar2 != null) {
                return kotlin.w.h.b(cVar2.a - System.nanoTime(), 0L);
            }
        }
        return LocationRequestCompat.PASSIVE_INTERVAL;
    }

    @Override // kotlinx.coroutines.N
    public void o(long j, InterfaceC0812k<? super kotlin.o> interfaceC0812k) {
        long c2 = C0792b0.c(j);
        if (c2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(c2 + nanoTime, interfaceC0812k);
            v0(nanoTime, aVar);
            interfaceC0812k.f(new V(aVar));
        }
    }

    public void r0(Runnable runnable) {
        if (!s0(runnable)) {
            J.f10154g.r0(runnable);
            return;
        }
        Thread o0 = o0();
        if (Thread.currentThread() != o0) {
            LockSupport.unpark(o0);
        }
    }

    @Override // kotlinx.coroutines.Y
    public void shutdown() {
        kotlinx.coroutines.N0.x xVar;
        c e2;
        kotlinx.coroutines.N0.x xVar2;
        F0 f0 = F0.a;
        F0.b();
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10203e;
                xVar = C0792b0.b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, xVar)) {
                    break;
                }
            } else {
                if (obj instanceof kotlinx.coroutines.N0.o) {
                    ((kotlinx.coroutines.N0.o) obj).b();
                    break;
                }
                xVar2 = C0792b0.b;
                if (obj == xVar2) {
                    break;
                }
                kotlinx.coroutines.N0.o oVar = new kotlinx.coroutines.N0.o(8, true);
                oVar.a((Runnable) obj);
                if (f10203e.compareAndSet(this, obj, oVar)) {
                    break;
                }
            }
        }
        while (l0() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar == null || (e2 = dVar.e()) == null) {
                return;
            } else {
                p0(nanoTime, e2);
            }
        }
    }

    protected boolean t0() {
        kotlinx.coroutines.N0.x xVar;
        if (!j0()) {
            return false;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.c()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.N0.o) {
                return ((kotlinx.coroutines.N0.o) obj).d();
            }
            xVar = C0792b0.b;
            if (obj != xVar) {
                return false;
            }
        }
        return true;
    }

    protected final void u0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void v0(long j, c cVar) {
        int g2;
        Thread o0;
        c b2;
        c cVar2 = null;
        if (this._isCompleted != 0) {
            g2 = 1;
        } else {
            d dVar = (d) this._delayed;
            if (dVar == null) {
                f10204f.compareAndSet(this, null, new d(j));
                Object obj = this._delayed;
                kotlin.s.c.l.c(obj);
                dVar = (d) obj;
            }
            g2 = cVar.g(j, dVar, this);
        }
        if (g2 != 0) {
            if (g2 == 1) {
                p0(j, cVar);
                return;
            } else {
                if (g2 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        d dVar2 = (d) this._delayed;
        if (dVar2 != null) {
            synchronized (dVar2) {
                b2 = dVar2.b();
            }
            cVar2 = b2;
        }
        if (!(cVar2 == cVar) || Thread.currentThread() == (o0 = o0())) {
            return;
        }
        LockSupport.unpark(o0);
    }
}
