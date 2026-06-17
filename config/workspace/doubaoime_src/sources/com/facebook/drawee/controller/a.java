package com.facebook.drawee.controller;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import com.facebook.datasource.AbstractDataSource;
import com.facebook.datasource.g;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.components.a;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.ReturnsOwnership;
import e.c.c.d.h;
import e.c.e.d.a;
import e.c.f.b.a.b;
import e.c.h.g.j;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* loaded from: classes2.dex */
public abstract class a<T, INFO> implements e.c.e.e.a, a.InterfaceC0323a, a.InterfaceC0449a {
    private final com.facebook.drawee.components.a b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f6340c;

    /* renamed from: d, reason: collision with root package name */
    private com.facebook.drawee.components.c f6341d;

    /* renamed from: e, reason: collision with root package name */
    private e.c.e.d.a f6342e;

    /* renamed from: f, reason: collision with root package name */
    protected e<INFO> f6343f;
    private e.c.e.e.c h;
    private Drawable i;
    private String j;
    private Object k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private String q;
    private com.facebook.datasource.d<T> r;
    private T s;
    protected Drawable u;
    private Object v;
    private Object w;
    private Object[] x;
    private static final Map<String, Object> y = e.c.c.d.f.of("component_tag", "drawee");
    private static final Map<String, Object> z = e.c.c.d.f.of("origin", "memory_bitmap", "origin_sub", "shortcut");
    private static final Class<?> A = a.class;
    private final DraweeEventTracker a = DraweeEventTracker.a();

    /* renamed from: g, reason: collision with root package name */
    protected e.c.f.b.a.c<INFO> f6344g = new e.c.f.b.a.c<>();
    private boolean t = true;

    /* renamed from: com.facebook.drawee.controller.a$a, reason: collision with other inner class name */
    class C0324a extends com.facebook.datasource.c<T> {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        C0324a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // com.facebook.datasource.f
        public void a(com.facebook.datasource.d<T> dVar) {
            if (a.this.v() != null) {
                e.c.h.e.d.a.remove(a.this.v().toString());
            }
        }

        @Override // com.facebook.datasource.f
        public void d(com.facebook.datasource.d<T> dVar) {
            AbstractDataSource abstractDataSource = (AbstractDataSource) dVar;
            boolean b = abstractDataSource.b();
            a.d(a.this, this.a, abstractDataSource, abstractDataSource.getProgress(), b);
        }

        @Override // com.facebook.datasource.c
        public void e(com.facebook.datasource.d<T> dVar) {
            if (a.this.v() != null) {
                e.c.h.e.d.a.remove(a.this.v().toString());
            }
            a.this.I(this.a, dVar, dVar.c(), true);
        }

        @Override // com.facebook.datasource.c
        public void f(com.facebook.datasource.d<T> dVar) {
            boolean b = dVar.b();
            boolean d2 = dVar.d();
            float progress = dVar.getProgress();
            if (b && a.this.v() != null) {
                e.c.h.e.d.a.remove(a.this.v().toString());
            }
            T result = dVar.getResult();
            if (result != null) {
                a.this.K(this.a, dVar, result, progress, b, j.y() ? dVar.a() : this.b, d2);
            } else if (b) {
                a.this.I(this.a, dVar, new NullPointerException(), true);
            }
        }
    }

    private static class b<INFO> extends f<INFO> {
        private b() {
        }

        public static <INFO> b<INFO> p(e<? super INFO> eVar, e<? super INFO> eVar2) {
            e.c.h.m.b.b();
            b<INFO> bVar = new b<>();
            bVar.m(eVar);
            bVar.m(eVar2);
            e.c.h.m.b.b();
            return bVar;
        }
    }

    public a(com.facebook.drawee.components.a aVar, Executor executor, String str, Object obj) {
        this.b = aVar;
        this.f6340c = executor;
        x(null, null);
    }

    private void A(String str, Throwable th) {
        if (e.c.c.e.a.m(2)) {
            e.c.c.e.a.q(A, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.j, str, th);
        }
    }

    private void B(String str, T t) {
        if (e.c.c.e.a.m(2)) {
            Class<?> cls = A;
            Object[] objArr = new Object[5];
            objArr[0] = Integer.valueOf(System.identityHashCode(this));
            objArr[1] = this.j;
            objArr[2] = str;
            objArr[3] = t != null ? t.getClass().getSimpleName() : "<null>";
            objArr[4] = Integer.valueOf(r(t));
            e.c.c.e.a.r(cls, "controller %x %s: %s: image: %s %x", objArr);
        }
    }

    private b.a C(com.facebook.datasource.d<T> dVar, INFO info, Uri uri) {
        return D(dVar == null ? null : dVar.getExtras(), E(info), uri);
    }

    private b.a D(Map<String, Object> map, Map<String, Object> map2, Uri uri) {
        PointF pointF;
        String str;
        e.c.e.e.c cVar = this.h;
        if (cVar instanceof com.facebook.drawee.generic.a) {
            com.facebook.drawee.generic.a aVar = (com.facebook.drawee.generic.a) cVar;
            str = aVar == null ? null : String.valueOf(aVar.o());
            pointF = aVar == null ? null : aVar.n();
        } else {
            pointF = null;
            str = null;
        }
        Map<String, Object> map3 = y;
        Map<String, Object> map4 = z;
        e.c.e.e.c cVar2 = this.h;
        Rect a = cVar2 != null ? cVar2.a() : null;
        Object obj = this.k;
        b.a aVar2 = new b.a();
        HashMap hashMap = new HashMap();
        aVar2.b = hashMap;
        hashMap.putAll(map3);
        if (a != null) {
            aVar2.b.put("viewport_width", Integer.valueOf(a.width()));
            aVar2.b.put("viewport_height", Integer.valueOf(a.height()));
        } else {
            aVar2.b.put("viewport_width", -1);
            aVar2.b.put("viewport_height", -1);
        }
        aVar2.b.put("scale_type", str);
        if (pointF != null) {
            aVar2.b.put("focus_point_x", Float.valueOf(pointF.x));
            aVar2.b.put("focus_point_y", Float.valueOf(pointF.y));
        }
        aVar2.b.put("caller_context", obj);
        if (uri != null) {
            aVar2.b.put("uri_main", uri);
        }
        if (map != null) {
            aVar2.a = map;
            if (map2 != null) {
                map.putAll(map2);
            }
        } else {
            aVar2.a = map2;
            aVar2.b.putAll(map4);
        }
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(String str, com.facebook.datasource.d<T> dVar, Throwable th, boolean z2) {
        Drawable drawable;
        e.c.h.m.b.b();
        if (!z(str, dVar)) {
            A("ignore_old_datasource @ onFailure", th);
            dVar.close();
            e.c.h.m.b.b();
            return;
        }
        this.a.b(z2 ? DraweeEventTracker.Event.ON_DATASOURCE_FAILURE : DraweeEventTracker.Event.ON_DATASOURCE_FAILURE_INT);
        if (z2) {
            A("final_failed @ onFailure", th);
            this.r = null;
            this.n = true;
            if (this.o && (drawable = this.u) != null) {
                e.c.e.e.c cVar = this.h;
                if (cVar != null) {
                    cVar.g(drawable, 1.0f, true);
                }
            } else if (a0()) {
                e.c.e.e.c cVar2 = this.h;
                if (cVar2 != null) {
                    cVar2.c(th);
                }
            } else {
                e.c.e.e.c cVar3 = this.h;
                if (cVar3 != null) {
                    cVar3.d(th);
                }
            }
            b.a C = C(dVar, null, null);
            j().c(this.j, th);
            this.f6344g.b(this.j, th, C);
            e<INFO> j = j();
            if (j instanceof c) {
                ((c) j).i(this.j, (ImageRequest) this.v, th);
            }
            j.c(this.j, th);
        } else {
            A("intermediate_failed @ onFailure", th);
            j().f(this.j, th);
            Objects.requireNonNull(this.f6344g);
        }
        e.c.h.m.b.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(String str, com.facebook.datasource.d<T> dVar, T t, float f2, boolean z2, boolean z3, boolean z4) {
        try {
            e.c.h.m.b.b();
            if (!z(str, dVar)) {
                B("ignore_old_datasource @ onNewResult", t);
                O(t);
                dVar.close();
                e.c.h.m.b.b();
                return;
            }
            this.a.b(z2 ? DraweeEventTracker.Event.ON_DATASOURCE_RESULT : DraweeEventTracker.Event.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable g2 = g(t);
                T t2 = this.s;
                Drawable drawable = this.u;
                this.s = t;
                this.u = g2;
                if (dVar instanceof g.b) {
                    e.c.c.d.j<com.facebook.datasource.d<T>> s = ((g.b) dVar).s();
                    if (s instanceof AbstractDraweeControllerBuilder.b) {
                        Object a = ((AbstractDraweeControllerBuilder.b) s).a();
                        if (this.v == null && a != null) {
                            ImageRequest imageRequest = (ImageRequest) a;
                            this.v = imageRequest;
                            Objects.requireNonNull(imageRequest);
                        }
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("drawableWidth", Integer.valueOf(g2.getIntrinsicWidth()));
                hashMap.put("drawableHeight", Integer.valueOf(g2.getIntrinsicHeight()));
                hashMap.put("scene_tag", this.k);
                try {
                    if (z2) {
                        B("set_final_result @ onNewResult", t);
                        this.r = null;
                        e.c.e.e.c cVar = this.h;
                        if (cVar != null) {
                            cVar.g(g2, 1.0f, z3);
                        }
                        R(str, t, dVar);
                    } else if (z4) {
                        B("set_temporary_result @ onNewResult", t);
                        e.c.e.e.c cVar2 = this.h;
                        if (cVar2 != null) {
                            cVar2.g(g2, 1.0f, z3);
                        }
                        R(str, t, dVar);
                    } else {
                        B("set_intermediate_result @ onNewResult", t);
                        e.c.e.e.c cVar3 = this.h;
                        if (cVar3 != null) {
                            cVar3.g(g2, f2, z3);
                        }
                        j().a(str, s(t));
                        Objects.requireNonNull(this.f6344g);
                        if (j() instanceof c) {
                            ((c) j()).k(str, s(t), h());
                        }
                    }
                    e.c.h.m.b.b();
                } finally {
                    if (drawable != null && drawable != g2) {
                        M(drawable);
                    }
                    if (t2 != null && t2 != t) {
                        B("release_previous_result @ onNewResult", t2);
                        O(t2);
                    }
                }
            } catch (Exception e2) {
                B("drawable_failed @ onNewResult", t);
                O(t);
                I(str, dVar, e2, z2);
                e.c.h.m.b.b();
            }
        } catch (Throwable th) {
            e.c.h.m.b.b();
            throw th;
        }
    }

    private void N() {
        Map<String, Object> map;
        Map<String, Object> map2;
        boolean z2 = this.m;
        this.m = false;
        this.n = false;
        com.facebook.datasource.d<T> dVar = this.r;
        if (dVar != null) {
            map = dVar.getExtras();
            this.r.close();
            this.r = null;
        } else {
            map = null;
        }
        Drawable drawable = this.u;
        if (drawable != null) {
            M(drawable);
        }
        if (this.q != null) {
            this.q = null;
        }
        this.u = null;
        T t = this.s;
        if (t != null) {
            map2 = E(s(t));
            B("release", this.s);
            O(this.s);
            this.s = null;
        } else {
            map2 = null;
        }
        if (z2) {
            j().d(this.j);
            this.f6344g.c(this.j, D(map, map2, null));
            e<INFO> j = j();
            if (j instanceof c) {
                ((c) j).l(this.j, (ImageRequest) this.v);
            }
            j.d(this.j);
        }
    }

    private void R(String str, T t, com.facebook.datasource.d<T> dVar) {
        INFO s = s(t);
        HashMap hashMap = new HashMap();
        hashMap.put("drawableWidth", Integer.valueOf(this.u.getIntrinsicWidth()));
        hashMap.put("drawableHeight", Integer.valueOf(this.u.getIntrinsicHeight()));
        e<INFO> j = j();
        if (j instanceof c) {
            ((c) j).j(str, s(t), h(), (ImageRequest) this.v, hashMap);
        }
        j.b(str, s, h());
        this.f6344g.d(str, s, C(dVar, s, null));
    }

    private boolean a0() {
        com.facebook.drawee.components.c cVar;
        return this.n && (cVar = this.f6341d) != null && cVar.e();
    }

    static void d(a aVar, String str, com.facebook.datasource.d dVar, float f2, boolean z2) {
        e.c.e.e.c cVar;
        if (!aVar.z(str, dVar)) {
            aVar.A("ignore_old_datasource @ onProgress", null);
            dVar.close();
        } else {
            if (z2 || (cVar = aVar.h) == null) {
                return;
            }
            cVar.e(f2, false);
        }
    }

    private synchronized void x(String str, Object obj) {
        com.facebook.drawee.components.a aVar;
        e.c.h.m.b.b();
        this.a.b(DraweeEventTracker.Event.ON_INIT_CONTROLLER);
        if (!this.t && (aVar = this.b) != null) {
            aVar.a(this);
        }
        this.l = false;
        N();
        this.o = false;
        com.facebook.drawee.components.c cVar = this.f6341d;
        if (cVar != null) {
            cVar.a();
        }
        e.c.e.d.a aVar2 = this.f6342e;
        if (aVar2 != null) {
            aVar2.a();
            this.f6342e.e(this);
        }
        e<INFO> eVar = this.f6343f;
        if (eVar instanceof b) {
            ((b) eVar).n();
        } else {
            this.f6343f = null;
        }
        e.c.e.e.c cVar2 = this.h;
        if (cVar2 != null) {
            if (!this.p) {
                cVar2.reset();
            }
            this.h.b(null);
            this.h = null;
        }
        this.i = null;
        if (e.c.c.e.a.m(2)) {
            e.c.c.e.a.p(A, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.j, str);
        }
        this.j = str;
        this.k = obj;
        e.c.h.m.b.b();
    }

    private boolean z(String str, com.facebook.datasource.d<T> dVar) {
        if (dVar == null && this.r == null) {
            return true;
        }
        return str.equals(this.j) && dVar == this.r && this.m;
    }

    public abstract Map<String, Object> E(INFO info);

    public void F() {
        e.c.h.m.b.b();
        if (e.c.c.e.a.m(2)) {
            e.c.c.e.a.p(A, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.j, this.m ? "request already submitted" : "request needs submit");
        }
        this.a.b(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        Objects.requireNonNull(this.h);
        this.b.a(this);
        this.l = true;
        if (!this.m) {
            b0();
        }
        e.c.h.m.b.b();
    }

    public boolean G() {
        if (e.c.c.e.a.m(2)) {
            e.c.c.e.a.o(A, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.j);
        }
        if (!a0()) {
            return false;
        }
        this.f6341d.b();
        e.c.e.e.c cVar = this.h;
        if (cVar != null) {
            cVar.reset();
        }
        b0();
        return true;
    }

    public void H() {
        e.c.h.m.b.b();
        if (e.c.c.e.a.m(2)) {
            e.c.c.e.a.o(A, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.j);
        }
        this.a.b(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
        this.l = false;
        this.b.c(this);
        e.c.h.m.b.b();
    }

    protected void J(String str, T t) {
    }

    public boolean L(MotionEvent motionEvent) {
        if (e.c.c.e.a.m(2)) {
            e.c.c.e.a.p(A, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.j, motionEvent);
        }
        e.c.e.d.a aVar = this.f6342e;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b() && !a0()) {
            return false;
        }
        this.f6342e.c(motionEvent);
        return true;
    }

    protected abstract void M(Drawable drawable);

    protected abstract void O(T t);

    public void P(e.c.f.b.a.b<INFO> bVar) {
        this.f6344g.g(bVar);
    }

    protected void Q(com.facebook.datasource.d<T> dVar, INFO info) {
        j().e(this.j, this.k);
        this.f6344g.a(this.j, this.k, C(dVar, info, v()));
    }

    public void S(String str) {
        this.q = null;
    }

    protected void T(Drawable drawable) {
        this.i = drawable;
        e.c.e.e.c cVar = this.h;
        if (cVar != null) {
            cVar.b(drawable);
        }
    }

    public void U(Object[] objArr) {
        this.x = objArr;
    }

    protected void V(e.c.e.d.a aVar) {
        this.f6342e = aVar;
        aVar.e(this);
    }

    public void W(Object obj) {
        this.v = obj;
    }

    public void X(Object obj) {
        this.w = obj;
    }

    protected void Y(boolean z2) {
        this.o = z2;
    }

    public void Z(boolean z2) {
        this.p = z2;
    }

    @Override // e.c.e.e.a
    public void a(e.c.e.e.b bVar) {
        if (e.c.c.e.a.m(2)) {
            e.c.c.e.a.p(A, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.j, bVar);
        }
        this.a.b(bVar != null ? DraweeEventTracker.Event.ON_SET_HIERARCHY : DraweeEventTracker.Event.ON_CLEAR_HIERARCHY);
        if (this.m) {
            this.b.a(this);
            release();
        }
        e.c.e.e.c cVar = this.h;
        if (cVar != null) {
            cVar.b(null);
            this.h = null;
        }
        if (bVar != null) {
            h.a(bVar instanceof e.c.e.e.c);
            e.c.e.e.c cVar2 = (e.c.e.e.c) bVar;
            this.h = cVar2;
            cVar2.b(this.i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void b0() {
        e.c.h.m.b.b();
        Object i = i();
        e.c.c.g.a aVar = i instanceof e.c.c.g.a ? (e.c.c.g.a) i : null;
        if (aVar != null && (aVar.r() instanceof com.facebook.imagepipeline.image.d)) {
        }
        boolean z2 = false;
        if (i != null) {
            e.c.h.m.b.b();
            this.r = null;
            this.m = true;
            this.n = false;
            this.a.b(DraweeEventTracker.Event.ON_SUBMIT_CACHE_HIT);
            Q(this.r, s(i));
            J(this.j, i);
            K(this.j, this.r, i, 1.0f, true, true, true);
            e.c.h.m.b.b();
            e.c.h.m.b.b();
            return;
        }
        this.a.b(DraweeEventTracker.Event.ON_DATASOURCE_SUBMIT);
        e.c.e.e.c cVar = this.h;
        if (cVar != null) {
            cVar.e(0.0f, true);
        }
        this.m = true;
        this.n = false;
        com.facebook.datasource.d<T> l = l();
        this.r = l;
        Q(l, null);
        if (e.c.c.e.a.m(2)) {
            e.c.c.e.a.p(A, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.j, Integer.valueOf(System.identityHashCode(this.r)));
        }
        String str = this.j;
        com.facebook.datasource.d<T> dVar = this.r;
        if (dVar != null && dVar.a()) {
            z2 = true;
        }
        this.r.e(new C0324a(str, z2), this.f6340c);
        if (v() != null) {
            e.c.h.e.d.a.put(v().toString(), this);
        }
        e.c.h.m.b.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(e<? super INFO> eVar) {
        Objects.requireNonNull(eVar);
        e<INFO> eVar2 = this.f6343f;
        if (eVar2 instanceof b) {
            ((b) eVar2).m(eVar);
        } else if (eVar2 != null) {
            this.f6343f = b.p(eVar2, eVar);
        } else {
            this.f6343f = eVar;
        }
    }

    public void f(e.c.f.b.a.b<INFO> bVar) {
        this.f6344g.e(bVar);
    }

    protected abstract Drawable g(T t);

    public Animatable h() {
        Object obj = this.u;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    protected T i() {
        return null;
    }

    protected e<INFO> j() {
        e<INFO> eVar = this.f6343f;
        return eVar == null ? c.g() : eVar;
    }

    protected Drawable k() {
        return this.i;
    }

    public abstract com.facebook.datasource.d<T> l();

    public Drawable m() {
        return this.u;
    }

    public Object[] n() {
        return this.x;
    }

    protected e.c.e.d.a o() {
        return this.f6342e;
    }

    public e.c.e.e.b p() {
        return this.h;
    }

    public String q() {
        return this.j;
    }

    protected int r(T t) {
        return System.identityHashCode(t);
    }

    @Override // com.facebook.drawee.components.a.InterfaceC0323a
    public void release() {
        this.a.b(DraweeEventTracker.Event.ON_RELEASE_CONTROLLER);
        com.facebook.drawee.components.c cVar = this.f6341d;
        if (cVar != null) {
            cVar.c();
        }
        e.c.e.d.a aVar = this.f6342e;
        if (aVar != null) {
            aVar.d();
        }
        e.c.e.e.c cVar2 = this.h;
        if (cVar2 != null) {
            cVar2.reset();
        }
        N();
    }

    protected abstract INFO s(T t);

    public ImageRequest t() {
        return (ImageRequest) this.v;
    }

    public String toString() {
        h.b k = h.k(this);
        k.c("isAttached", this.l);
        k.c("isRequestSubmitted", this.m);
        k.c("hasFetchFailed", this.n);
        k.a("fetchedImage", r(this.s));
        k.b("events", this.a.toString());
        return k.toString();
    }

    public Object u() {
        return this.w;
    }

    protected Uri v() {
        return null;
    }

    @ReturnsOwnership
    protected com.facebook.drawee.components.c w() {
        if (this.f6341d == null) {
            this.f6341d = new com.facebook.drawee.components.c();
        }
        return this.f6341d;
    }

    protected void y(String str, Object obj, ImageRequest imageRequest) {
        this.v = imageRequest;
        x(str, obj);
        this.t = false;
    }
}
