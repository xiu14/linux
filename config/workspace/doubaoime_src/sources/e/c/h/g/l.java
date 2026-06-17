package e.c.h.g;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.util.Pools;
import com.facebook.imagepipeline.memory.A;
import com.facebook.imagepipeline.producers.M;
import com.facebook.imagepipeline.producers.g0;
import com.facebook.imagepipeline.producers.h0;
import e.c.h.f.r;
import e.c.h.f.s;
import e.c.h.f.t;
import e.c.h.g.k;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class l {
    private static l v;
    private static e.c.h.j.c w;
    private e.c.h.g.b b;

    /* renamed from: d, reason: collision with root package name */
    private e.c.h.f.j<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> f9908d;

    /* renamed from: e, reason: collision with root package name */
    private r<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> f9909e;

    /* renamed from: f, reason: collision with root package name */
    private e.c.h.f.j<com.facebook.cache.common.b, com.facebook.common.memory.g> f9910f;

    /* renamed from: g, reason: collision with root package name */
    private r<com.facebook.cache.common.b, com.facebook.common.memory.g> f9911g;
    private e.c.h.f.f h;
    private com.facebook.cache.disk.i i;
    private e.c.h.j.c j;
    private h k;
    private e.c.h.n.d l;
    private o m;
    private p n;
    private e.c.h.f.f o;
    private HashMap<String, e.c.h.f.f> p;
    private com.facebook.cache.disk.i q;
    private HashMap<String, com.facebook.cache.disk.i> r;
    private e.c.h.d.b s;
    private com.facebook.imagepipeline.platform.d t;
    private e.c.h.c.a.a u;
    private com.facebook.common.util.b<g0> a = new a();

    /* renamed from: c, reason: collision with root package name */
    private com.facebook.common.util.b<j> f9907c = new b();

    class a extends com.facebook.common.util.b<g0> {
        a() {
        }

        @Override // com.facebook.common.util.b
        protected g0 b() {
            return new h0(((j) l.this.f9907c.a()).i().b());
        }
    }

    class b extends com.facebook.common.util.b<j> {
        b() {
        }

        @Override // com.facebook.common.util.b
        protected j b() {
            e.c.h.m.b.b();
            Objects.requireNonNull(l.this);
            e.c.h.m.b.b();
            return null;
        }
    }

    public l(j jVar) {
        e.c.h.m.b.b();
        this.b = new e.c.h.g.b(jVar.d());
        this.f9907c.c(jVar);
        this.a.c(new h0(jVar.i().b()));
        e.c.h.m.b.b();
    }

    private h b() {
        e.c.h.j.c cVar;
        e.c.h.j.c cVar2;
        e.c.h.j.c cVar3;
        e.c.h.j.c cVar4;
        Objects.requireNonNull(this.f9907c.a().j());
        if (this.n == null) {
            ContentResolver contentResolver = this.f9907c.a().e().getApplicationContext().getContentResolver();
            if (this.m == null) {
                k.d b2 = this.f9907c.a().j().b();
                Context e2 = this.f9907c.a().e();
                com.facebook.common.memory.a g2 = this.f9907c.a().q().g();
                if (this.j == null) {
                    Objects.requireNonNull(this.f9907c.a());
                    e.c.h.c.a.a c2 = c();
                    if (w == null) {
                        try {
                            w = (e.c.h.j.c) Class.forName("com.bytedance.fresco.heif.HeifDecoder$HeifFormatDecoder").getConstructor(com.facebook.common.memory.h.class).newInstance(this.f9907c.a().q().d());
                        } catch (Throwable unused) {
                            cVar = null;
                        }
                    }
                    cVar = w;
                    if (c2 != null) {
                        e.c.h.j.c b3 = c2.b(Bitmap.Config.RGB_565);
                        e.c.h.j.c c3 = c2.c(Bitmap.Config.RGB_565);
                        cVar4 = c2.d(Bitmap.Config.ARGB_8888);
                        cVar3 = c3;
                        cVar2 = b3;
                    } else {
                        cVar2 = null;
                        cVar3 = null;
                        cVar4 = null;
                    }
                    Objects.requireNonNull(this.f9907c.a());
                    this.j = new e.c.h.j.b(cVar2, cVar3, cVar4, cVar, n(), null);
                }
                e.c.h.j.c cVar5 = this.j;
                e.c.h.j.e r = this.f9907c.a().r();
                boolean w2 = this.f9907c.a().w();
                boolean x = this.f9907c.a().x();
                Objects.requireNonNull(this.f9907c.a().j());
                f i = this.f9907c.a().i();
                A q = this.f9907c.a().q();
                Objects.requireNonNull(this.f9907c.a());
                com.facebook.common.memory.h e3 = q.e(0);
                r<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> e4 = e();
                r<com.facebook.cache.common.b, com.facebook.common.memory.g> h = h();
                e.c.h.f.f k = k();
                e.c.h.f.f o = o();
                HashMap<String, e.c.h.f.f> f2 = f();
                e.c.h.f.g c4 = this.f9907c.a().c();
                e.c.h.d.b m = m();
                Objects.requireNonNull(this.f9907c.a().j());
                Objects.requireNonNull(this.f9907c.a().j());
                Objects.requireNonNull(this.f9907c.a().j());
                int a2 = this.f9907c.a().j().a();
                e.c.h.g.b bVar = this.b;
                Objects.requireNonNull(this.f9907c.a().j());
                int d2 = this.f9907c.a().j().d();
                Objects.requireNonNull(this.f9907c.a().j());
                Objects.requireNonNull((k.c) b2);
                this.m = new o(e2, g2, cVar5, r, w2, x, false, i, e3, e4, h, k, o, f2, c4, m, 0, 0, false, a2, bVar, false, d2, false);
            }
            o oVar = this.m;
            M p = this.f9907c.a().p();
            boolean x2 = this.f9907c.a().x();
            Objects.requireNonNull(this.f9907c.a().j());
            g0 a3 = this.a.a();
            boolean w3 = this.f9907c.a().w();
            Objects.requireNonNull(this.f9907c.a().j());
            boolean v2 = this.f9907c.a().v();
            if (this.l == null) {
                Objects.requireNonNull(this.f9907c.a());
                Objects.requireNonNull(this.f9907c.a());
                Objects.requireNonNull(this.f9907c.a().j());
                int a4 = this.f9907c.a().j().a();
                Objects.requireNonNull(this.f9907c.a().j());
                Objects.requireNonNull(this.f9907c.a());
                Objects.requireNonNull(this.f9907c.a());
                this.l = new e.c.h.n.f(a4, false, null, null, this.f9907c.a().j().f());
            }
            e.c.h.n.d dVar = this.l;
            Objects.requireNonNull(this.f9907c.a().j());
            Objects.requireNonNull(this.f9907c.a().j());
            this.n = new p(contentResolver, oVar, p, x2, false, a3, w3, false, false, v2, dVar, false, false);
        }
        p pVar = this.n;
        Set<e.c.h.l.f> t = this.f9907c.a().t();
        Set<e.c.h.l.e> s = this.f9907c.a().s();
        e.c.c.d.j<Boolean> m2 = this.f9907c.a().m();
        r<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> e5 = e();
        r<com.facebook.cache.common.b, com.facebook.common.memory.g> h2 = h();
        e.c.h.f.f k2 = k();
        e.c.h.f.f o2 = o();
        HashMap<String, e.c.h.f.f> f3 = f();
        e.c.h.f.g c5 = this.f9907c.a().c();
        g0 a5 = this.a.a();
        e.c.c.d.j<Boolean> c6 = this.f9907c.a().j().c();
        Objects.requireNonNull(this.f9907c.a().j());
        Objects.requireNonNull(this.f9907c.a());
        return new h(pVar, t, s, m2, e5, h2, k2, o2, f3, c5, a5, c6, null, null, this.f9907c.a());
    }

    public static l j() {
        l lVar = v;
        e.c.c.d.h.e(lVar, "ImagePipelineFactory was not initialized!");
        return lVar;
    }

    public static synchronized void q(j jVar) {
        synchronized (l.class) {
            if (v != null) {
                e.c.c.e.a.t(l.class, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            v = new l(jVar);
        }
    }

    public e.c.h.c.a.a c() {
        if (this.u == null) {
            e.c.h.d.b m = m();
            f i = this.f9907c.a().i();
            e.c.h.f.j<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> d2 = d();
            Objects.requireNonNull(this.f9907c.a().j());
            this.u = e.c.h.c.a.b.a(m, i, d2, false);
        }
        return this.u;
    }

    public e.c.h.f.j<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> d() {
        if (this.f9908d == null) {
            e.c.c.d.j<t> a2 = this.f9907c.a().a();
            com.facebook.common.memory.c o = this.f9907c.a().o();
            s.a b2 = this.f9907c.a().b();
            Objects.requireNonNull(this.f9907c.a());
            this.f9908d = e.c.h.f.a.b(a2, o, b2, null);
        }
        return this.f9908d;
    }

    public r<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> e() {
        if (this.f9909e == null) {
            Objects.requireNonNull(this.f9907c.a());
            d();
            this.f9909e = e.c.h.f.a.c(d(), this.f9907c.a().l());
        }
        return this.f9909e;
    }

    public HashMap<String, e.c.h.f.f> f() {
        if (this.p == null) {
            this.p = new HashMap<>();
            if (this.r == null) {
                this.r = new HashMap<>();
                HashMap<String, com.facebook.cache.disk.b> f2 = this.f9907c.a().f();
                for (String str : f2.keySet()) {
                    this.r.put(str, ((d) this.f9907c.a().k()).a(f2.get(str)));
                }
            }
            HashMap<String, com.facebook.cache.disk.i> hashMap = this.r;
            for (String str2 : hashMap.keySet()) {
                com.facebook.cache.disk.i iVar = hashMap.get(str2);
                A q = this.f9907c.a().q();
                Objects.requireNonNull(this.f9907c.a());
                e.c.h.f.f fVar = new e.c.h.f.f(iVar, q.e(0), this.f9907c.a().q().f(), this.f9907c.a().i().e(), this.f9907c.a().i().d(), this.f9907c.a().l());
                if (this.f9907c.a().f().get(str2) != null) {
                    fVar.r(false);
                    fVar.q(false);
                }
                this.p.put(str2, fVar);
            }
        }
        return this.p;
    }

    public e.c.h.f.j<com.facebook.cache.common.b, com.facebook.common.memory.g> g() {
        if (this.f9910f == null) {
            this.f9910f = e.c.h.f.a.a(this.f9907c.a().h(), this.f9907c.a().o());
        }
        return this.f9910f;
    }

    public r<com.facebook.cache.common.b, com.facebook.common.memory.g> h() {
        if (this.f9911g == null) {
            Objects.requireNonNull(this.f9907c.a());
            g();
            this.f9911g = e.c.h.f.a.d(g(), this.f9907c.a().l());
        }
        return this.f9911g;
    }

    public h i() {
        if (this.k == null) {
            this.k = b();
        }
        return this.k;
    }

    public e.c.h.f.f k() {
        if (this.h == null) {
            com.facebook.cache.disk.i l = l();
            A q = this.f9907c.a().q();
            Objects.requireNonNull(this.f9907c.a());
            e.c.h.f.f fVar = new e.c.h.f.f(l, q.e(0), this.f9907c.a().q().f(), this.f9907c.a().i().e(), this.f9907c.a().i().d(), this.f9907c.a().l());
            this.h = fVar;
            Objects.requireNonNull(this.f9907c.a().n());
            fVar.r(false);
            e.c.h.f.f fVar2 = this.h;
            Objects.requireNonNull(this.f9907c.a().n());
            fVar2.q(false);
        }
        return this.h;
    }

    public com.facebook.cache.disk.i l() {
        if (this.i == null) {
            this.i = ((d) this.f9907c.a().k()).a(this.f9907c.a().n());
        }
        return this.i;
    }

    public e.c.h.d.b m() {
        if (this.s == null) {
            A q = this.f9907c.a().q();
            n();
            this.s = new e.c.h.d.a(q.a(), this.b);
        }
        return this.s;
    }

    public com.facebook.imagepipeline.platform.d n() {
        if (this.t == null) {
            A q = this.f9907c.a().q();
            Objects.requireNonNull(this.f9907c.a().j());
            Objects.requireNonNull(this.f9907c.a().j());
            int i = Build.VERSION.SDK_INT;
            int b2 = q.b();
            this.t = new com.facebook.imagepipeline.platform.b(q.a(), b2, new Pools.SynchronizedPool(b2));
        }
        return this.t;
    }

    public e.c.h.f.f o() {
        if (this.o == null) {
            com.facebook.cache.disk.i p = p();
            A q = this.f9907c.a().q();
            Objects.requireNonNull(this.f9907c.a());
            e.c.h.f.f fVar = new e.c.h.f.f(p, q.e(0), this.f9907c.a().q().f(), this.f9907c.a().i().e(), this.f9907c.a().i().d(), this.f9907c.a().l());
            this.o = fVar;
            Objects.requireNonNull(this.f9907c.a().n());
            fVar.r(false);
            e.c.h.f.f fVar2 = this.o;
            Objects.requireNonNull(this.f9907c.a().n());
            fVar2.q(false);
        }
        return this.o;
    }

    public com.facebook.cache.disk.i p() {
        if (this.q == null) {
            this.q = ((d) this.f9907c.a().k()).a(this.f9907c.a().u());
        }
        return this.q;
    }
}
