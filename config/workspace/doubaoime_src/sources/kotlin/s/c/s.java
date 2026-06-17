package kotlin.s.c;

import kotlin.reflect.h;

/* loaded from: classes2.dex */
public abstract class s extends u implements kotlin.reflect.h {
    public s(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.s.c.AbstractC0783c
    protected kotlin.reflect.b computeReflected() {
        A.g(this);
        return this;
    }

    @Override // kotlin.reflect.h
    public h.a e() {
        return ((kotlin.reflect.h) getReflected()).e();
    }

    @Override // kotlin.s.b.l
    public Object invoke(Object obj) {
        return ((t) this).e().call(obj);
    }
}
