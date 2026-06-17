package com.bumptech.glide.load.engine;

import com.bumptech.glide.Priority;
import com.bumptech.glide.g;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.j.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class h<Transcode> {
    private final List<o.a<?>> a = new ArrayList();
    private final List<com.bumptech.glide.load.d> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.e f1639c;

    /* renamed from: d, reason: collision with root package name */
    private Object f1640d;

    /* renamed from: e, reason: collision with root package name */
    private int f1641e;

    /* renamed from: f, reason: collision with root package name */
    private int f1642f;

    /* renamed from: g, reason: collision with root package name */
    private Class<?> f1643g;
    private DecodeJob.d h;
    private com.bumptech.glide.load.f i;
    private Map<Class<?>, com.bumptech.glide.load.i<?>> j;
    private Class<Transcode> k;
    private boolean l;
    private boolean m;
    private com.bumptech.glide.load.d n;
    private Priority o;
    private j p;
    private boolean q;
    private boolean r;

    h() {
    }

    void a() {
        this.f1639c = null;
        this.f1640d = null;
        this.n = null;
        this.f1643g = null;
        this.k = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.p = null;
        this.a.clear();
        this.l = false;
        this.b.clear();
        this.m = false;
    }

    com.bumptech.glide.load.engine.B.b b() {
        return this.f1639c.b();
    }

    List<com.bumptech.glide.load.d> c() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            List<o.a<?>> g2 = g();
            int size = g2.size();
            for (int i = 0; i < size; i++) {
                o.a<?> aVar = g2.get(i);
                if (!this.b.contains(aVar.a)) {
                    this.b.add(aVar.a);
                }
                for (int i2 = 0; i2 < aVar.b.size(); i2++) {
                    if (!this.b.contains(aVar.b.get(i2))) {
                        this.b.add(aVar.b.get(i2));
                    }
                }
            }
        }
        return this.b;
    }

    com.bumptech.glide.load.engine.C.a d() {
        return ((k.c) this.h).a();
    }

    j e() {
        return this.p;
    }

    int f() {
        return this.f1642f;
    }

    List<o.a<?>> g() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            List h = this.f1639c.i().h(this.f1640d);
            int size = h.size();
            for (int i = 0; i < size; i++) {
                o.a<?> b = ((com.bumptech.glide.load.j.o) h.get(i)).b(this.f1640d, this.f1641e, this.f1642f, this.i);
                if (b != null) {
                    this.a.add(b);
                }
            }
        }
        return this.a;
    }

    <Data> t<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f1639c.i().g(cls, this.f1643g, this.k);
    }

    Class<?> i() {
        return this.f1640d.getClass();
    }

    List<com.bumptech.glide.load.j.o<File, ?>> j(File file) throws g.c {
        return this.f1639c.i().h(file);
    }

    com.bumptech.glide.load.f k() {
        return this.i;
    }

    Priority l() {
        return this.o;
    }

    List<Class<?>> m() {
        return this.f1639c.i().i(this.f1640d.getClass(), this.f1643g, this.k);
    }

    <Z> com.bumptech.glide.load.h<Z> n(v<Z> vVar) {
        return this.f1639c.i().j(vVar);
    }

    <T> com.bumptech.glide.load.data.e<T> o(T t) {
        return this.f1639c.i().k(t);
    }

    com.bumptech.glide.load.d p() {
        return this.n;
    }

    <X> com.bumptech.glide.load.a<X> q(X x) throws g.e {
        return this.f1639c.i().l(x);
    }

    Class<?> r() {
        return this.k;
    }

    <Z> com.bumptech.glide.load.i<Z> s(Class<Z> cls) {
        com.bumptech.glide.load.i<Z> iVar = (com.bumptech.glide.load.i) this.j.get(cls);
        if (iVar == null) {
            Iterator<Map.Entry<Class<?>, com.bumptech.glide.load.i<?>>> it2 = this.j.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, com.bumptech.glide.load.i<?>> next = it2.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    iVar = (com.bumptech.glide.load.i) next.getValue();
                    break;
                }
            }
        }
        if (iVar != null) {
            return iVar;
        }
        if (!this.j.isEmpty() || !this.q) {
            return com.bumptech.glide.load.k.c.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f1641e;
    }

    boolean u(Class<?> cls) {
        return this.f1639c.i().g(cls, this.f1643g, this.k) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> void v(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.d dVar, int i, int i2, j jVar, Class<?> cls, Class<R> cls2, Priority priority, com.bumptech.glide.load.f fVar, Map<Class<?>, com.bumptech.glide.load.i<?>> map, boolean z, boolean z2, DecodeJob.d dVar2) {
        this.f1639c = eVar;
        this.f1640d = obj;
        this.n = dVar;
        this.f1641e = i;
        this.f1642f = i2;
        this.p = jVar;
        this.f1643g = cls;
        this.h = dVar2;
        this.k = cls2;
        this.o = priority;
        this.i = fVar;
        this.j = map;
        this.q = z;
        this.r = z2;
    }

    boolean w(v<?> vVar) {
        return this.f1639c.i().m(vVar);
    }

    boolean x() {
        return this.r;
    }
}
