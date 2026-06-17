package com.facebook.drawee.controller;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.ReturnsOwnership;
import e.c.c.d.h;
import e.c.c.d.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class AbstractDraweeControllerBuilder<BUILDER extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements e.c.e.e.d {
    private static final e<Object> o = new a();
    private static final NullPointerException p = new NullPointerException("No image request was specified!");
    private static final AtomicLong q = new AtomicLong();
    protected final Context a;
    private final Set<e> b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<e.c.f.b.a.b> f6335c;
    private Set<e> i;
    private boolean l;
    boolean n = true;

    /* renamed from: d, reason: collision with root package name */
    private Object f6336d = null;

    /* renamed from: e, reason: collision with root package name */
    private REQUEST f6337e = null;

    /* renamed from: f, reason: collision with root package name */
    private REQUEST[] f6338f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6339g = true;
    private e<? super INFO> h = null;
    private boolean j = false;
    private boolean k = false;
    private e.c.e.e.a m = null;

    public enum CacheLevel {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    static class a extends c<Object> {
        a() {
        }

        @Override // com.facebook.drawee.controller.c, com.facebook.drawee.controller.e
        public void b(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }

        @Override // com.facebook.drawee.controller.c
        public void k(String str, Object obj, Animatable animatable) {
            if (animatable == null || animatable.isRunning()) {
                return;
            }
            animatable.start();
        }
    }

    public abstract class b<D> implements j<com.facebook.datasource.d<IMAGE>> {
        public b(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder) {
        }

        public abstract REQUEST a();
    }

    protected AbstractDraweeControllerBuilder(Context context, Set<e> set, Set<e.c.f.b.a.b> set2) {
        this.a = context;
        this.b = set;
        this.f6335c = set2;
    }

    protected static String b() {
        return String.valueOf(q.getAndIncrement());
    }

    public com.facebook.drawee.controller.a a() {
        h.g(this.f6338f == null || this.f6337e == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        h.g(true, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
        if (this.f6337e == null) {
            REQUEST[] requestArr = this.f6338f;
        }
        e.c.h.m.b.b();
        com.facebook.drawee.controller.a j = j();
        j.Y(this.l);
        j.S(null);
        j.W(this.f6337e);
        j.U(this.f6338f);
        j.X(null);
        if (this.j) {
            j.w().d(this.j);
            if (j.o() == null) {
                j.V(new e.c.e.d.a(this.a));
            }
        }
        Set<e> set = this.b;
        if (set != null) {
            Iterator<e> it2 = set.iterator();
            while (it2.hasNext()) {
                j.e(it2.next());
            }
        }
        Set<e.c.f.b.a.b> set2 = this.f6335c;
        if (set2 != null) {
            Iterator<e.c.f.b.a.b> it3 = set2.iterator();
            while (it3.hasNext()) {
                j.f6344g.e(it3.next());
            }
        }
        e<? super INFO> eVar = this.h;
        if (eVar != null) {
            j.e(eVar);
        }
        Set<e> set3 = this.i;
        if (set3 != null && set3.size() != 0) {
            Iterator<e> it4 = this.i.iterator();
            while (it4.hasNext()) {
                j.e(it4.next());
            }
        }
        e<INFO> j2 = j.j();
        if (j2 != null && (j2 instanceof c)) {
            ((c) j2).h((ImageRequest) this.f6337e, System.currentTimeMillis());
        }
        if (this.k) {
            j.e(o);
        }
        e.c.h.m.b.b();
        return j;
    }

    public Object c() {
        return this.f6336d;
    }

    protected abstract com.facebook.datasource.d<IMAGE> d(e.c.e.e.a aVar, String str, REQUEST request, Object obj, CacheLevel cacheLevel);

    protected j<com.facebook.datasource.d<IMAGE>> e(e.c.e.e.a aVar, String str, REQUEST request) {
        return new com.facebook.drawee.controller.b(this, request, aVar, str, this.f6336d, CacheLevel.FULL_FETCH);
    }

    public REQUEST[] f() {
        return this.f6338f;
    }

    public REQUEST g() {
        return this.f6337e;
    }

    public REQUEST h() {
        return null;
    }

    public e.c.e.e.a i() {
        return this.m;
    }

    @ReturnsOwnership
    protected abstract com.facebook.drawee.controller.a j();

    protected j<com.facebook.datasource.d<IMAGE>> k(e.c.e.e.a aVar, String str) {
        j<com.facebook.datasource.d<IMAGE>> jVar;
        REQUEST request = this.f6337e;
        if (request != null) {
            jVar = e(aVar, str, request);
        } else {
            REQUEST[] requestArr = this.f6338f;
            if (requestArr != null) {
                boolean z = this.f6339g;
                ArrayList arrayList = new ArrayList(requestArr.length * 2);
                if (z) {
                    for (REQUEST request2 : requestArr) {
                        arrayList.add(new com.facebook.drawee.controller.b(this, request2, aVar, str, this.f6336d, CacheLevel.BITMAP_MEMORY_CACHE));
                    }
                }
                for (REQUEST request3 : requestArr) {
                    arrayList.add(e(aVar, str, request3));
                }
                jVar = com.facebook.datasource.g.b(arrayList);
            } else {
                jVar = null;
            }
        }
        return jVar == null ? com.facebook.datasource.e.a(p) : jVar;
    }

    public BUILDER l(boolean z) {
        this.k = z;
        return this;
    }

    public BUILDER m(Object obj) {
        this.f6336d = obj;
        return this;
    }

    public BUILDER n(e<? super INFO> eVar) {
        this.h = eVar;
        return this;
    }

    public BUILDER o(boolean z) {
        this.n = z;
        return this;
    }

    public BUILDER p(REQUEST[] requestArr) {
        h.b(requestArr == null || requestArr.length > 0, "No requests specified!");
        this.f6338f = requestArr;
        this.f6339g = true;
        return this;
    }

    public void q(Set<e> set) {
        this.i = set;
    }

    public BUILDER r(REQUEST request) {
        this.f6337e = request;
        return this;
    }

    public BUILDER s(e.c.e.e.a aVar) {
        this.m = aVar;
        return this;
    }

    public e.c.e.e.d t(e.c.e.e.a aVar) {
        this.m = aVar;
        return this;
    }

    public BUILDER u(boolean z) {
        this.l = z;
        return this;
    }

    public BUILDER v(boolean z) {
        this.j = z;
        return this;
    }
}
