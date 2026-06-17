package com.facebook.datasource;

import e.c.c.d.j;
import java.util.Objects;

/* loaded from: classes2.dex */
public class e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    static class a<T> implements j<d<T>> {
        final /* synthetic */ Throwable a;

        a(Throwable th) {
            this.a = th;
        }

        @Override // e.c.c.d.j
        public Object get() {
            return e.c(this.a);
        }
    }

    public static <T> j<d<T>> a(Throwable th) {
        return new a(th);
    }

    public static <T> d<T> b(T t) {
        h p = h.p();
        Objects.requireNonNull(t);
        p.n(t, true, null);
        return p;
    }

    public static <T> d<T> c(Throwable th) {
        h p = h.p();
        p.k(th);
        return p;
    }
}
