package e.c.h.h;

import com.facebook.imagepipeline.producers.U;
import com.facebook.imagepipeline.producers.V;
import com.facebook.imagepipeline.producers.b0;
import e.c.h.l.e;

/* loaded from: classes2.dex */
public class c<T> extends b<e.c.c.g.a<T>> {
    private c(U<e.c.c.g.a<T>> u, b0 b0Var, e eVar) {
        super(u, b0Var, eVar);
    }

    public static <T> com.facebook.datasource.d<e.c.c.g.a<T>> t(U<e.c.c.g.a<T>> u, b0 b0Var, e eVar) {
        e.c.h.m.b.b();
        c cVar = new c(u, b0Var, eVar);
        e.c.h.m.b.b();
        return cVar;
    }

    @Override // com.facebook.datasource.AbstractDataSource
    protected void f(Object obj) {
        e.c.c.g.a aVar = (e.c.c.g.a) obj;
        int i = e.c.c.g.a.h;
        if (aVar != null) {
            aVar.close();
        }
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.d
    public Object getResult() {
        return e.c.c.g.a.h((e.c.c.g.a) super.getResult());
    }

    @Override // e.c.h.h.b
    protected void s(Object obj, int i, V v) {
        super.s(e.c.c.g.a.h((e.c.c.g.a) obj), i, v);
    }
}
