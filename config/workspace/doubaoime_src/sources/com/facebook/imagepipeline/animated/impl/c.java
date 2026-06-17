package com.facebook.imagepipeline.animated.impl;

import com.facebook.imagepipeline.image.d;
import e.c.c.d.h;
import e.c.c.d.i;
import e.c.h.f.j;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class c {
    private final com.facebook.cache.common.b a;
    private final j<com.facebook.cache.common.b, d> b;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashSet<com.facebook.cache.common.b> f6451d = new LinkedHashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private final j.c<com.facebook.cache.common.b> f6450c = new a();

    class a implements j.c<com.facebook.cache.common.b> {
        a() {
        }

        @Override // e.c.h.f.j.c
        public void a(com.facebook.cache.common.b bVar, boolean z) {
            c.this.g(bVar, z);
        }
    }

    class b implements i<com.facebook.cache.common.b> {
        final /* synthetic */ int a;

        b(int i) {
            this.a = i;
        }

        @Override // e.c.c.d.i
        public boolean apply(com.facebook.cache.common.b bVar) {
            return new C0326c(c.this.a, this.a).equals(bVar);
        }
    }

    /* renamed from: com.facebook.imagepipeline.animated.impl.c$c, reason: collision with other inner class name */
    static class C0326c implements com.facebook.cache.common.b {
        private final com.facebook.cache.common.b a;
        private final int b;

        public C0326c(com.facebook.cache.common.b bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        @Override // com.facebook.cache.common.b
        public String b() {
            return null;
        }

        @Override // com.facebook.cache.common.b
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0326c)) {
                return false;
            }
            C0326c c0326c = (C0326c) obj;
            return this.b == c0326c.b && this.a.equals(c0326c.a);
        }

        @Override // com.facebook.cache.common.b
        public int hashCode() {
            return (this.a.hashCode() * 1013) + this.b;
        }

        @Override // com.facebook.cache.common.b
        public String toString() {
            h.b k = h.k(this);
            k.b("imageCacheKey", this.a);
            k.a("frameIndex", this.b);
            return k.toString();
        }
    }

    public c(com.facebook.cache.common.b bVar, j<com.facebook.cache.common.b, d> jVar) {
        this.a = bVar;
        this.b = jVar;
    }

    public e.c.c.g.a<d> b(int i, e.c.c.g.a<d> aVar) {
        return this.b.d(new C0326c(this.a, i), aVar, this.f6450c);
    }

    public void c(int i) {
        if (i == -1) {
            return;
        }
        this.b.q(new b(i));
    }

    public boolean d(int i) {
        return this.b.f(new C0326c(this.a, i));
    }

    public e.c.c.g.a<d> e(int i) {
        return this.b.get(new C0326c(this.a, i));
    }

    public e.c.c.g.a<d> f() {
        com.facebook.cache.common.b bVar;
        e.c.c.g.a<d> r;
        do {
            synchronized (this) {
                Iterator<com.facebook.cache.common.b> it2 = this.f6451d.iterator();
                if (it2.hasNext()) {
                    bVar = it2.next();
                    it2.remove();
                } else {
                    bVar = null;
                }
            }
            if (bVar == null) {
                return null;
            }
            r = this.b.r(bVar);
        } while (r == null);
        return r;
    }

    public synchronized void g(com.facebook.cache.common.b bVar, boolean z) {
        if (z) {
            this.f6451d.add(bVar);
        } else {
            this.f6451d.remove(bVar);
        }
    }
}
