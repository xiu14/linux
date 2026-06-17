package kotlinx.coroutines.N0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.I;

/* loaded from: classes2.dex */
public class m {
    static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next");
    static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10166c = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    public static abstract class a extends AbstractC0787c<m> {
        public final m b;

        /* renamed from: c, reason: collision with root package name */
        public m f10167c;

        public a(m mVar) {
            this.b = mVar;
        }

        @Override // kotlinx.coroutines.N0.AbstractC0787c
        public void b(m mVar, Object obj) {
            m mVar2 = mVar;
            boolean z = obj == null;
            m mVar3 = z ? this.b : this.f10167c;
            if (mVar3 != null && m.a.compareAndSet(mVar2, this, mVar3) && z) {
                m mVar4 = this.b;
                m mVar5 = this.f10167c;
                kotlin.s.c.l.c(mVar5);
                mVar4.o(mVar5);
            }
        }
    }

    public static final class b extends s {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (kotlinx.coroutines.N0.m.a.compareAndSet(r2, r1, ((kotlinx.coroutines.N0.t) r3).a) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlinx.coroutines.N0.m n(kotlinx.coroutines.N0.s r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r7 = r6._prev
            kotlinx.coroutines.N0.m r7 = (kotlinx.coroutines.N0.m) r7
            r0 = 0
            r1 = r7
        L6:
            r2 = r0
        L7:
            java.lang.Object r3 = r1._next
            if (r3 != r6) goto L18
            if (r7 != r1) goto Le
            return r1
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.N0.m.b
            boolean r7 = r0.compareAndSet(r6, r7, r1)
            if (r7 != 0) goto L17
            goto L0
        L17:
            return r1
        L18:
            boolean r4 = r6.u()
            if (r4 == 0) goto L1f
            return r0
        L1f:
            if (r3 != 0) goto L22
            return r1
        L22:
            boolean r4 = r3 instanceof kotlinx.coroutines.N0.s
            if (r4 == 0) goto L2c
            kotlinx.coroutines.N0.s r3 = (kotlinx.coroutines.N0.s) r3
            r3.a(r1)
            goto L0
        L2c:
            boolean r4 = r3 instanceof kotlinx.coroutines.N0.t
            if (r4 == 0) goto L46
            if (r2 == 0) goto L41
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.N0.m.a
            kotlinx.coroutines.N0.t r3 = (kotlinx.coroutines.N0.t) r3
            kotlinx.coroutines.N0.m r3 = r3.a
            boolean r1 = r4.compareAndSet(r2, r1, r3)
            if (r1 != 0) goto L3f
            goto L0
        L3f:
            r1 = r2
            goto L6
        L41:
            java.lang.Object r1 = r1._prev
            kotlinx.coroutines.N0.m r1 = (kotlinx.coroutines.N0.m) r1
            goto L7
        L46:
            r2 = r3
            kotlinx.coroutines.N0.m r2 = (kotlinx.coroutines.N0.m) r2
            r5 = r2
            r2 = r1
            r1 = r5
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.N0.m.n(kotlinx.coroutines.N0.s):kotlinx.coroutines.N0.m");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(m mVar) {
        m mVar2;
        do {
            mVar2 = (m) mVar._prev;
            if (p() != mVar) {
                return;
            }
        } while (!b.compareAndSet(mVar, mVar2, this));
        if (u()) {
            mVar.n(null);
        }
    }

    public final boolean l(m mVar, m mVar2) {
        b.lazySet(mVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        atomicReferenceFieldUpdater.lazySet(mVar, mVar2);
        if (!atomicReferenceFieldUpdater.compareAndSet(this, mVar2, mVar)) {
            return false;
        }
        mVar.o(mVar2);
        return true;
    }

    public final boolean m(m mVar) {
        b.lazySet(mVar, this);
        a.lazySet(mVar, this);
        while (p() == this) {
            if (a.compareAndSet(this, this, mVar)) {
                mVar.o(this);
                return true;
            }
        }
        return false;
    }

    public final Object p() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof s)) {
                return obj;
            }
            ((s) obj).a(this);
        }
    }

    public final m q() {
        m mVar;
        Object p = p();
        t tVar = p instanceof t ? (t) p : null;
        return (tVar == null || (mVar = tVar.a) == null) ? (m) p : mVar;
    }

    public final m r() {
        m n = n(null);
        if (n == null) {
            Object obj = this._prev;
            while (true) {
                n = (m) obj;
                if (!n.u()) {
                    break;
                }
                obj = n._prev;
            }
        }
        return n;
    }

    public final void s() {
        ((t) p()).a.t();
    }

    public final void t() {
        m mVar = this;
        while (true) {
            Object p = mVar.p();
            if (!(p instanceof t)) {
                mVar.n(null);
                return;
            }
            mVar = ((t) p).a;
        }
    }

    public String toString() {
        return new kotlin.s.c.r(this) { // from class: kotlinx.coroutines.N0.m.c
            @Override // kotlin.reflect.g
            public Object get() {
                return I.a(this.receiver);
            }
        } + '@' + I.b(this);
    }

    public boolean u() {
        return p() instanceof t;
    }

    public boolean v() {
        return w() == null;
    }

    public final m w() {
        Object p;
        m mVar;
        t tVar;
        do {
            p = p();
            if (p instanceof t) {
                return ((t) p).a;
            }
            if (p == this) {
                return (m) p;
            }
            mVar = (m) p;
            tVar = (t) mVar._removedRef;
            if (tVar == null) {
                tVar = new t(mVar);
                f10166c.lazySet(mVar, tVar);
            }
        } while (!a.compareAndSet(this, p, tVar));
        mVar.n(null);
        return null;
    }

    public final int x(m mVar, m mVar2, a aVar) {
        b.lazySet(mVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        atomicReferenceFieldUpdater.lazySet(mVar, mVar2);
        aVar.f10167c = mVar2;
        if (atomicReferenceFieldUpdater.compareAndSet(this, mVar2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
