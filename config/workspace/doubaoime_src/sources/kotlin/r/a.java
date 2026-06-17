package kotlin.r;

import com.prolificinteractive.materialcalendarview.r;
import kotlin.r.f;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public abstract class a implements f.b {
    private final f.c<?> key;

    public a(f.c<?> cVar) {
        l.f(cVar, "key");
        this.key = cVar;
    }

    @Override // kotlin.r.f
    public <R> R fold(R r, p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) r.L(this, r, pVar);
    }

    @Override // kotlin.r.f.b, kotlin.r.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) r.M(this, cVar);
    }

    @Override // kotlin.r.f.b
    public f.c<?> getKey() {
        return this.key;
    }

    @Override // kotlin.r.f
    public f minusKey(f.c<?> cVar) {
        return r.Z(this, cVar);
    }

    @Override // kotlin.r.f
    public f plus(f fVar) {
        return r.d0(this, fVar);
    }
}
