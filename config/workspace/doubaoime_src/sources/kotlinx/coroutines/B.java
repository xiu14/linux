package kotlinx.coroutines;

import kotlin.r.f;

/* loaded from: classes2.dex */
final class B extends kotlin.s.c.m implements kotlin.s.b.p<Boolean, f.b, Boolean> {
    public static final B a = new B();

    B() {
        super(2);
    }

    @Override // kotlin.s.b.p
    public Boolean invoke(Boolean bool, f.b bVar) {
        return Boolean.valueOf(bool.booleanValue() || (bVar instanceof InterfaceC0828y));
    }
}
