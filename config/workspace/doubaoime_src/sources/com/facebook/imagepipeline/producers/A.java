package com.facebook.imagepipeline.producers;

import java.util.Map;

/* loaded from: classes2.dex */
public class A implements e.c.h.l.e, X {
    private final Y a;
    private final X b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.h.l.f f6524c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.h.l.e f6525d;

    public A(e.c.h.l.f fVar, e.c.h.l.e eVar) {
        this.a = fVar;
        this.b = eVar;
        this.f6524c = fVar;
        this.f6525d = eVar;
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void a(V v, String str, String str2) {
        Y y = this.a;
        if (y != null) {
            y.h(v.getId(), str, str2);
        }
        X x = this.b;
        if (x != null) {
            x.a(v, str, str2);
        }
    }

    @Override // e.c.h.l.e
    public void b(V v) {
        e.c.h.l.f fVar = this.f6524c;
        if (fVar != null) {
            fVar.a(v.d(), v.b(), v.getId(), v.i());
        }
        e.c.h.l.e eVar = this.f6525d;
        if (eVar != null) {
            eVar.b(v);
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void c(V v, String str, boolean z) {
        Y y = this.a;
        if (y != null) {
            y.e(v.getId(), str, z);
        }
        X x = this.b;
        if (x != null) {
            x.c(v, str, z);
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void d(V v, String str, Map map) {
        Y y = this.a;
        if (y != null) {
            y.d(v.getId(), str, map);
        }
        X x = this.b;
        if (x != null) {
            x.d(v, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void e(V v, String str) {
        Y y = this.a;
        if (y != null) {
            y.b(v.getId(), str);
        }
        X x = this.b;
        if (x != null) {
            x.e(v, str);
        }
    }

    @Override // e.c.h.l.e
    public void f(V v) {
        e.c.h.l.f fVar = this.f6524c;
        if (fVar != null) {
            fVar.c(v.d(), v.getId(), v.i());
        }
        e.c.h.l.e eVar = this.f6525d;
        if (eVar != null) {
            eVar.f(v);
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    public boolean g(V v, String str) {
        X x;
        Y y = this.a;
        boolean f2 = y != null ? y.f(v.getId()) : false;
        return (f2 || (x = this.b) == null) ? f2 : x.g(v, str);
    }

    @Override // e.c.h.l.e
    public void h(V v, Throwable th) {
        e.c.h.l.f fVar = this.f6524c;
        if (fVar != null) {
            fVar.g(v.d(), v.getId(), th, v.i());
        }
        e.c.h.l.e eVar = this.f6525d;
        if (eVar != null) {
            eVar.h(v, th);
        }
    }

    @Override // e.c.h.l.e
    public void i(V v) {
        e.c.h.l.f fVar = this.f6524c;
        if (fVar != null) {
            fVar.k(v.getId());
        }
        e.c.h.l.e eVar = this.f6525d;
        if (eVar != null) {
            eVar.i(v);
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void j(V v, String str, Map map) {
        Y y = this.a;
        if (y != null) {
            y.i(v.getId(), str, map);
        }
        X x = this.b;
        if (x != null) {
            x.j(v, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void k(V v, String str, Throwable th, Map map) {
        Y y = this.a;
        if (y != null) {
            y.j(v.getId(), str, th, map);
        }
        X x = this.b;
        if (x != null) {
            x.k(v, str, th, map);
        }
    }
}
