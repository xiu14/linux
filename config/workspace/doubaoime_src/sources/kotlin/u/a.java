package kotlin.u;

import kotlin.reflect.i;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public abstract class a<V> implements b<Object, V> {
    private V a;

    public a(V v) {
        this.a = v;
    }

    @Override // kotlin.u.b
    public void a(Object obj, i<?> iVar, V v) {
        l.f(iVar, "property");
        V v2 = this.a;
        l.f(iVar, "property");
        this.a = v;
        b(iVar, v2, v);
    }

    protected abstract void b(i<?> iVar, V v, V v2);
}
