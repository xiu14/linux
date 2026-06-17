package kotlin.r.h.a;

import kotlin.r.f;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public abstract class c extends a {
    private final kotlin.r.f _context;
    private transient kotlin.r.d<Object> intercepted;

    public c(kotlin.r.d<Object> dVar, kotlin.r.f fVar) {
        super(dVar);
        this._context = fVar;
    }

    @Override // kotlin.r.d
    public kotlin.r.f getContext() {
        kotlin.r.f fVar = this._context;
        l.c(fVar);
        return fVar;
    }

    public final kotlin.r.d<Object> intercepted() {
        kotlin.r.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            kotlin.r.e eVar = (kotlin.r.e) getContext().get(kotlin.r.e.F);
            if (eVar == null || (dVar = eVar.interceptContinuation(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // kotlin.r.h.a.a
    protected void releaseIntercepted() {
        kotlin.r.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            f.b bVar = getContext().get(kotlin.r.e.F);
            l.c(bVar);
            ((kotlin.r.e) bVar).releaseInterceptedContinuation(dVar);
        }
        this.intercepted = b.a;
    }

    public c(kotlin.r.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
