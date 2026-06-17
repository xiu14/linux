package kotlinx.coroutines;

import kotlin.r.f;

/* loaded from: classes2.dex */
final class C extends kotlin.s.c.m implements kotlin.s.b.l<f.b, D> {
    public static final C a = new C();

    C() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public D invoke(f.b bVar) {
        f.b bVar2 = bVar;
        if (bVar2 instanceof D) {
            return (D) bVar2;
        }
        return null;
    }
}
