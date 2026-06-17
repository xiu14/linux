package com.facebook.datasource;

import e.c.c.d.h;
import e.c.c.d.j;
import java.util.List;

/* loaded from: classes2.dex */
public class g<T> implements j<d<T>> {
    private final List<j<d<T>>> a;

    public class b extends AbstractDataSource<T> {
        private int h = 0;
        private d<T> i = null;
        private d<T> j = null;

        private class a implements f<T> {
            a(a aVar) {
            }

            @Override // com.facebook.datasource.f
            public void a(d<T> dVar) {
            }

            @Override // com.facebook.datasource.f
            public void b(d<T> dVar) {
                b.p(b.this, dVar);
            }

            @Override // com.facebook.datasource.f
            public void c(d<T> dVar) {
                if (dVar.a()) {
                    b.q(b.this, dVar);
                } else if (((AbstractDataSource) dVar).b()) {
                    b.p(b.this, dVar);
                }
            }

            @Override // com.facebook.datasource.f
            public void d(d<T> dVar) {
                b.this.m(Math.max(b.this.getProgress(), ((AbstractDataSource) dVar).getProgress()));
            }
        }

        public b() {
            if (u()) {
                return;
            }
            l(new RuntimeException("No data source supplier or supplier returned null."), null);
        }

        static void p(b bVar, d dVar) {
            boolean z;
            synchronized (bVar) {
                if (!bVar.h() && dVar == bVar.i) {
                    bVar.i = null;
                    z = true;
                }
                z = false;
            }
            if (z) {
                if (dVar != bVar.t() && dVar != null) {
                    dVar.close();
                }
                if (dVar.c() instanceof OutOfMemoryError) {
                    bVar.k(dVar.c());
                }
                if (bVar.u()) {
                    return;
                }
                bVar.l(dVar.c(), dVar.getExtras());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        static void q(com.facebook.datasource.g.b r3, com.facebook.datasource.d r4) {
            /*
                java.util.Objects.requireNonNull(r3)
                boolean r0 = r4.b()
                monitor-enter(r3)
                com.facebook.datasource.d<T> r1 = r3.i     // Catch: java.lang.Throwable -> L35
                r2 = 0
                if (r4 != r1) goto L22
                com.facebook.datasource.d<T> r1 = r3.j     // Catch: java.lang.Throwable -> L35
                if (r4 != r1) goto L12
                goto L22
            L12:
                if (r1 == 0) goto L19
                if (r0 == 0) goto L17
                goto L19
            L17:
                r1 = r2
                goto L1b
            L19:
                r3.j = r4     // Catch: java.lang.Throwable -> L35
            L1b:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
                if (r1 == 0) goto L23
                r1.close()
                goto L23
            L22:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            L23:
                com.facebook.datasource.d r0 = r3.t()
                if (r4 != r0) goto L34
                boolean r0 = r4.b()
                java.util.Map r4 = r4.getExtras()
                r3.n(r2, r0, r4)
            L34:
                return
            L35:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.g.b.q(com.facebook.datasource.g$b, com.facebook.datasource.d):void");
        }

        private void r(d<T> dVar) {
            if (dVar != null) {
                dVar.close();
            }
        }

        private synchronized d<T> t() {
            return this.j;
        }

        private boolean u() {
            j jVar;
            boolean z;
            synchronized (this) {
                if (h() || this.h >= g.this.a.size()) {
                    jVar = null;
                } else {
                    List list = g.this.a;
                    int i = this.h;
                    this.h = i + 1;
                    jVar = (j) list.get(i);
                }
            }
            d<T> dVar = jVar != null ? (d) jVar.get() : null;
            synchronized (this) {
                if (h()) {
                    z = false;
                } else {
                    this.i = dVar;
                    z = true;
                }
            }
            if (z && dVar != null) {
                dVar.e(new a(null), e.c.c.b.b.a());
                return true;
            }
            if (dVar != null) {
                dVar.close();
            }
            return false;
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.d
        public synchronized boolean a() {
            boolean z;
            d<T> t = t();
            if (t != null) {
                z = t.a();
            }
            return z;
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.d
        public boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                d<T> dVar = this.i;
                this.i = null;
                d<T> dVar2 = this.j;
                this.j = null;
                r(dVar2);
                r(dVar);
                return true;
            }
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.d
        public synchronized T getResult() {
            d<T> t;
            t = t();
            return t != null ? t.getResult() : null;
        }

        public j<d<T>> s() {
            if (h() || this.h > g.this.a.size()) {
                return null;
            }
            return (j) g.this.a.get(this.h - 1);
        }
    }

    private g(List<j<d<T>>> list) {
        e.c.c.d.h.b(!list.isEmpty(), "List of suppliers is empty!");
        this.a = list;
    }

    public static <T> g<T> b(List<j<d<T>>> list) {
        return new g<>(list);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return e.c.c.d.h.h(this.a, ((g) obj).a);
        }
        return false;
    }

    @Override // e.c.c.d.j
    public Object get() {
        return new b();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        h.b k = e.c.c.d.h.k(this);
        k.b("list", this.a);
        return k.toString();
    }
}
