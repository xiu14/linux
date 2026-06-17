package kotlinx.coroutines.N0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.N0.f;

/* loaded from: classes2.dex */
public abstract class f<N extends f<N>> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_next");
    private static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_prev");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ Object _prev;

    public f(N n) {
        this._prev = n;
    }

    public static final Object a(f fVar) {
        return fVar._next;
    }

    public final void b() {
        b.lazySet(this, null);
    }

    public final N c() {
        x xVar;
        Object obj = this._next;
        xVar = e.a;
        if (obj == xVar) {
            return null;
        }
        return (N) obj;
    }

    public abstract boolean d();

    public final boolean e() {
        return c() == null;
    }

    public final void f() {
        while (true) {
            f fVar = (f) this._prev;
            while (fVar != null && fVar.d()) {
                fVar = (f) fVar._prev;
            }
            f c2 = c();
            kotlin.s.c.l.c(c2);
            while (c2.d()) {
                c2 = c2.c();
                kotlin.s.c.l.c(c2);
            }
            c2._prev = fVar;
            if (fVar != null) {
                fVar._next = c2;
            }
            if (!c2.d() && (fVar == null || !fVar.d())) {
                return;
            }
        }
    }

    public final boolean g(N n) {
        return a.compareAndSet(this, null, n);
    }
}
