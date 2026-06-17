package e.c.c.g;

import e.c.c.d.h;
import e.c.c.g.a;

/* loaded from: classes2.dex */
public class b<T> extends a<T> {
    private b(e<T> eVar, a.c cVar, Throwable th) {
        super(eVar, cVar, th);
    }

    @Override // e.c.c.g.a
    /* renamed from: a */
    public a<T> clone() {
        h.f(w());
        return new b(this.b, this.f9757c, this.f9758d);
    }

    @Override // e.c.c.g.a
    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.a) {
                    return;
                }
                this.f9757c.a(this.b, this.f9758d);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    b(T t, d<T> dVar, a.c cVar, Throwable th) {
        super(t, dVar, cVar, th);
    }
}
