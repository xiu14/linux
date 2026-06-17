package kotlinx.coroutines.flow.D;

import kotlin.r.f;

/* loaded from: classes2.dex */
public final class l implements kotlin.r.f {
    public final Throwable a;
    private final /* synthetic */ kotlin.r.f b;

    public l(Throwable th, kotlin.r.f fVar) {
        this.a = th;
        this.b = fVar;
    }

    @Override // kotlin.r.f
    public <R> R fold(R r, kotlin.s.b.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) this.b.fold(r, pVar);
    }

    @Override // kotlin.r.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) this.b.get(cVar);
    }

    @Override // kotlin.r.f
    public kotlin.r.f minusKey(f.c<?> cVar) {
        return this.b.minusKey(cVar);
    }

    @Override // kotlin.r.f
    public kotlin.r.f plus(kotlin.r.f fVar) {
        return this.b.plus(fVar);
    }
}
