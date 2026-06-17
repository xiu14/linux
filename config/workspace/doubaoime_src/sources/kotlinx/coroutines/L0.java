package kotlinx.coroutines;

import kotlin.r.f;

/* loaded from: classes2.dex */
final class L0 implements f.b, f.c<L0> {
    public static final L0 a = new L0();

    private L0() {
    }

    @Override // kotlin.r.f
    public <R> R fold(R r, kotlin.s.b.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) com.prolificinteractive.materialcalendarview.r.L(this, r, pVar);
    }

    @Override // kotlin.r.f.b, kotlin.r.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) com.prolificinteractive.materialcalendarview.r.M(this, cVar);
    }

    @Override // kotlin.r.f.b
    public f.c<?> getKey() {
        return this;
    }

    @Override // kotlin.r.f
    public kotlin.r.f minusKey(f.c<?> cVar) {
        return com.prolificinteractive.materialcalendarview.r.Z(this, cVar);
    }

    @Override // kotlin.r.f
    public kotlin.r.f plus(kotlin.r.f fVar) {
        return com.prolificinteractive.materialcalendarview.r.d0(this, fVar);
    }
}
