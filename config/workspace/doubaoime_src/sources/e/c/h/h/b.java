package e.c.h.h;

import com.facebook.datasource.AbstractDataSource;
import com.facebook.imagepipeline.producers.AbstractC0722b;
import com.facebook.imagepipeline.producers.U;
import com.facebook.imagepipeline.producers.V;
import com.facebook.imagepipeline.producers.b0;
import e.c.h.l.e;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* loaded from: classes2.dex */
public abstract class b<T> extends AbstractDataSource<T> {
    private final b0 h;
    private final e i;

    protected b(U<T> u, b0 b0Var, e eVar) {
        e.c.h.m.b.b();
        this.h = b0Var;
        this.i = eVar;
        j(b0Var.getExtras());
        e.c.h.m.b.b();
        eVar.b(b0Var);
        e.c.h.m.b.b();
        e.c.h.m.b.b();
        u.b(new a(this), b0Var);
        e.c.h.m.b.b();
        e.c.h.m.b.b();
    }

    static void q(b bVar, Throwable th) {
        if (bVar.l(th, bVar.h.getExtras())) {
            bVar.i.h(bVar.h, th);
        }
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.d
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (b()) {
            return true;
        }
        this.i.i(this.h);
        this.h.t();
        return true;
    }

    protected void s(T t, int i, V v) {
        boolean e2 = AbstractC0722b.e(i);
        if (n(t, e2, v.getExtras())) {
            if (e2) {
                this.i.f(this.h);
                return;
            }
            Object obj = this.i;
            if (obj instanceof e.c.h.l.b) {
                ((e.c.h.l.b) obj).l(this.h.d(), this.h.getId(), this.h.i());
            }
        }
    }
}
