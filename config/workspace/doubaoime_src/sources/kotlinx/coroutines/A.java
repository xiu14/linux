package kotlinx.coroutines;

import kotlin.r.f;

/* loaded from: classes2.dex */
final class A extends kotlin.s.c.m implements kotlin.s.b.p<kotlin.r.f, f.b, kotlin.r.f> {
    final /* synthetic */ kotlin.s.c.z<kotlin.r.f> a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(kotlin.s.c.z<kotlin.r.f> zVar, boolean z) {
        super(2);
        this.a = zVar;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.r.f] */
    @Override // kotlin.s.b.p
    public kotlin.r.f invoke(kotlin.r.f fVar, f.b bVar) {
        kotlin.r.f fVar2 = fVar;
        f.b bVar2 = bVar;
        if (!(bVar2 instanceof InterfaceC0828y)) {
            return fVar2.plus(bVar2);
        }
        f.b bVar3 = this.a.a.get(bVar2.getKey());
        if (bVar3 != null) {
            kotlin.s.c.z<kotlin.r.f> zVar = this.a;
            zVar.a = zVar.a.minusKey(bVar2.getKey());
            return fVar2.plus(((InterfaceC0828y) bVar2).l(bVar3));
        }
        InterfaceC0828y interfaceC0828y = (InterfaceC0828y) bVar2;
        if (this.b) {
            interfaceC0828y = interfaceC0828y.D();
        }
        return fVar2.plus(interfaceC0828y);
    }
}
