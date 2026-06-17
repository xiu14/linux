package e.c.h.g;

import e.c.c.g.a;
import java.io.Closeable;

/* loaded from: classes2.dex */
public class b {
    private final a.c a;

    public b(e.c.h.i.a aVar) {
        this.a = new a(this, aVar);
    }

    public <U extends Closeable> e.c.c.g.a<U> a(U u) {
        return e.c.c.g.a.A(u, this.a);
    }

    public <T> e.c.c.g.a<T> b(T t, e.c.c.g.d<T> dVar) {
        return e.c.c.g.a.G(t, dVar, this.a);
    }
}
