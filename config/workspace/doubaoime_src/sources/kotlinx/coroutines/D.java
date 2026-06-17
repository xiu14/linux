package kotlinx.coroutines;

import kotlin.r.f;

/* loaded from: classes2.dex */
public abstract class D extends kotlin.r.a implements kotlin.r.e {
    public static final a Key = new a(null);

    public static final class a extends kotlin.r.b<kotlin.r.e, D> {
        public a(kotlin.s.c.g gVar) {
            super(kotlin.r.e.F, C.a);
        }
    }

    public D() {
        super(kotlin.r.e.F);
    }

    public abstract void dispatch(kotlin.r.f fVar, Runnable runnable);

    public void dispatchYield(kotlin.r.f fVar, Runnable runnable) {
        dispatch(fVar, runnable);
    }

    @Override // kotlin.r.a, kotlin.r.f.b, kotlin.r.f
    public <E extends f.b> E get(f.c<E> cVar) {
        kotlin.s.c.l.f(cVar, "key");
        if (!(cVar instanceof kotlin.r.b)) {
            if (kotlin.r.e.F != cVar) {
                return null;
            }
            kotlin.s.c.l.d(this, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return this;
        }
        kotlin.r.b bVar = (kotlin.r.b) cVar;
        if (!bVar.a(getKey())) {
            return null;
        }
        E e2 = (E) bVar.b(this);
        if (e2 instanceof f.b) {
            return e2;
        }
        return null;
    }

    @Override // kotlin.r.e
    public final <T> kotlin.r.d<T> interceptContinuation(kotlin.r.d<? super T> dVar) {
        return new kotlinx.coroutines.N0.h(this, dVar);
    }

    public boolean isDispatchNeeded(kotlin.r.f fVar) {
        return true;
    }

    public D limitedParallelism(int i) {
        com.prolificinteractive.materialcalendarview.r.B(i);
        return new kotlinx.coroutines.N0.j(this, i);
    }

    @Override // kotlin.r.a, kotlin.r.f
    public kotlin.r.f minusKey(f.c<?> cVar) {
        kotlin.s.c.l.f(cVar, "key");
        if (cVar instanceof kotlin.r.b) {
            kotlin.r.b bVar = (kotlin.r.b) cVar;
            if (bVar.a(getKey()) && bVar.b(this) != null) {
                return kotlin.r.g.a;
            }
        } else if (kotlin.r.e.F == cVar) {
            return kotlin.r.g.a;
        }
        return this;
    }

    public final D plus(D d2) {
        return d2;
    }

    @Override // kotlin.r.e
    public final void releaseInterceptedContinuation(kotlin.r.d<?> dVar) {
        ((kotlinx.coroutines.N0.h) dVar).p();
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + I.b(this);
    }
}
