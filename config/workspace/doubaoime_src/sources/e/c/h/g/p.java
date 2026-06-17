package e.c.h.g;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.imagepipeline.producers.B;
import com.facebook.imagepipeline.producers.C;
import com.facebook.imagepipeline.producers.C0721a;
import com.facebook.imagepipeline.producers.C0726f;
import com.facebook.imagepipeline.producers.C0727g;
import com.facebook.imagepipeline.producers.C0728h;
import com.facebook.imagepipeline.producers.C0729i;
import com.facebook.imagepipeline.producers.C0730j;
import com.facebook.imagepipeline.producers.C0731k;
import com.facebook.imagepipeline.producers.C0733m;
import com.facebook.imagepipeline.producers.C0738s;
import com.facebook.imagepipeline.producers.C0739t;
import com.facebook.imagepipeline.producers.C0740u;
import com.facebook.imagepipeline.producers.C0741v;
import com.facebook.imagepipeline.producers.D;
import com.facebook.imagepipeline.producers.G;
import com.facebook.imagepipeline.producers.I;
import com.facebook.imagepipeline.producers.L;
import com.facebook.imagepipeline.producers.M;
import com.facebook.imagepipeline.producers.P;
import com.facebook.imagepipeline.producers.Q;
import com.facebook.imagepipeline.producers.S;
import com.facebook.imagepipeline.producers.U;
import com.facebook.imagepipeline.producers.Z;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.f0;
import com.facebook.imagepipeline.producers.g0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.request.ImageRequest;
import e.c.h.f.s;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class p {
    Map<U<e.c.c.g.a<com.facebook.imagepipeline.image.d>>, U<e.c.c.g.a<com.facebook.imagepipeline.image.d>>> A;
    private final ContentResolver a;
    private final o b;

    /* renamed from: c, reason: collision with root package name */
    private M f9921c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9922d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9923e;

    /* renamed from: f, reason: collision with root package name */
    private final g0 f9924f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f9925g;
    private final boolean h;
    private final boolean i;
    private final e.c.h.n.d j;
    private final boolean k;
    private final boolean l;
    U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> m;
    U<com.facebook.imagepipeline.image.f> n;
    U<com.facebook.imagepipeline.image.f> o;
    U<Void> p;
    U<Void> q;
    private U<com.facebook.imagepipeline.image.f> r;
    U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> s;
    U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> t;
    U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> u;
    U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> v;
    U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> w;
    U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> x;
    U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> y;
    Map<U<e.c.c.g.a<com.facebook.imagepipeline.image.d>>, U<e.c.c.g.a<com.facebook.imagepipeline.image.d>>> z = new HashMap();

    public p(ContentResolver contentResolver, o oVar, M m, boolean z, boolean z2, g0 g0Var, boolean z3, boolean z4, boolean z5, boolean z6, e.c.h.n.d dVar, boolean z7, boolean z8) {
        this.a = contentResolver;
        this.b = oVar;
        this.f9921c = m;
        this.f9922d = z;
        new HashMap();
        this.A = new HashMap();
        this.f9924f = g0Var;
        this.f9925g = z3;
        this.h = z4;
        this.f9923e = z5;
        this.i = z6;
        this.j = dVar;
        this.k = z7;
        this.l = z8;
    }

    private synchronized U<com.facebook.imagepipeline.image.f> a() {
        e.c.h.m.b.b();
        if (this.n == null) {
            e.c.h.m.b.b();
            U<com.facebook.imagepipeline.image.f> r = r(this.b.e());
            o oVar = this.b;
            g0 g0Var = this.f9924f;
            Objects.requireNonNull(oVar);
            this.n = new f0(r, g0Var);
            e.c.h.m.b.b();
        }
        e.c.h.m.b.b();
        return this.n;
    }

    private synchronized U<com.facebook.imagepipeline.image.f> b() {
        e.c.h.m.b.b();
        if (this.o == null) {
            e.c.h.m.b.b();
            o oVar = this.b;
            U<com.facebook.imagepipeline.image.f> c2 = c();
            g0 g0Var = this.f9924f;
            Objects.requireNonNull(oVar);
            this.o = new f0(c2, g0Var);
            e.c.h.m.b.b();
        }
        e.c.h.m.b.b();
        return this.o;
    }

    private synchronized U<com.facebook.imagepipeline.image.f> c() {
        e.c.h.m.b.b();
        if (this.r == null) {
            e.c.h.m.b.b();
            o oVar = this.b;
            C0721a c0721a = new C0721a(r(new L(oVar.k, oVar.f9917d, this.f9921c)));
            this.r = c0721a;
            this.r = this.b.f(c0721a, this.f9922d && !this.f9925g, this.j);
            e.c.h.m.b.b();
        }
        e.c.h.m.b.b();
        return this.r;
    }

    private synchronized U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> d() {
        if (this.x == null) {
            C0733m c0733m = new C0733m(this.b.k);
            e.c.c.i.b bVar = e.c.c.i.c.a;
            this.x = o(this.b.f(new C0721a(c0733m), true, this.j));
        }
        return this.x;
    }

    private synchronized U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> g() {
        if (this.w == null) {
            o oVar = this.b;
            this.w = p(new B(oVar.j.e(), oVar.k, oVar.f9916c));
        }
        return this.w;
    }

    private synchronized U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> h() {
        if (this.u == null) {
            o oVar = this.b;
            C c2 = new C(oVar.j.e(), oVar.k, oVar.a);
            o oVar2 = this.b;
            Objects.requireNonNull(oVar2);
            this.u = q(c2, new k0[]{new D(oVar2.j.e(), oVar2.k, oVar2.a), this.b.d()});
        }
        return this.u;
    }

    private synchronized U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> i() {
        if (this.v == null) {
            o oVar = this.b;
            this.v = p(new G(oVar.j.e(), oVar.k, oVar.b));
        }
        return this.v;
    }

    private synchronized U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> j() {
        if (this.t == null) {
            o oVar = this.b;
            this.t = n(new I(oVar.j.e(), oVar.a));
        }
        return this.t;
    }

    private synchronized U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> k() {
        e.c.h.m.b.b();
        if (this.m == null) {
            e.c.h.m.b.b();
            this.m = o(c());
            e.c.h.m.b.b();
        }
        e.c.h.m.b.b();
        return this.m;
    }

    private synchronized U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> l() {
        if (this.y == null) {
            o oVar = this.b;
            this.y = p(new Z(oVar.j.e(), oVar.k, oVar.a));
        }
        return this.y;
    }

    private static String m(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() <= 30) {
            return valueOf;
        }
        return valueOf.substring(0, 30) + "...";
    }

    private U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> n(U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> u) {
        o oVar = this.b;
        s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> sVar = oVar.p;
        e.c.h.f.g gVar = oVar.q;
        C0727g c0727g = new C0727g(gVar, new C0728h(sVar, gVar, u));
        o oVar2 = this.b;
        g0 g0Var = this.f9924f;
        Objects.requireNonNull(oVar2);
        f0 f0Var = new f0(c0727g, g0Var);
        if (!this.k && !this.l) {
            o oVar3 = this.b;
            return new C0726f(oVar3.p, oVar3.q, f0Var);
        }
        o oVar4 = this.b;
        s<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> sVar2 = oVar4.p;
        e.c.h.f.g gVar2 = oVar4.q;
        return new C0730j(oVar4.o, oVar4.l, oVar4.m, gVar2, oVar4.r, oVar4.s, new C0726f(sVar2, gVar2, f0Var));
    }

    private U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> o(U<com.facebook.imagepipeline.image.f> u) {
        e.c.h.m.b.b();
        U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> n = n(this.b.a(u));
        e.c.h.m.b.b();
        return n;
    }

    private U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> p(U<com.facebook.imagepipeline.image.f> u) {
        return q(u, new k0[]{this.b.d()});
    }

    private U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> q(U<com.facebook.imagepipeline.image.f> u, k0<com.facebook.imagepipeline.image.f>[] k0VarArr) {
        i0 i0Var = new i0(5, this.b.j.b(), this.b.f(new C0721a(r(u)), true, this.j));
        Objects.requireNonNull(this.b);
        return o(new C0731k(this.b.f(new j0(k0VarArr), true, this.j), i0Var));
    }

    private U<com.facebook.imagepipeline.image.f> r(U<com.facebook.imagepipeline.image.f> u) {
        C0738s c2;
        e.c.c.i.b bVar = e.c.c.i.c.a;
        if (this.i) {
            e.c.h.m.b.b();
            if (this.f9923e) {
                o oVar = this.b;
                c2 = oVar.c(new P(oVar.l, oVar.q, oVar.k, oVar.f9917d, u));
            } else {
                c2 = this.b.c(u);
            }
            u = this.b.b(c2);
            e.c.h.m.b.b();
        }
        o oVar2 = this.b;
        s<com.facebook.cache.common.b, com.facebook.common.memory.g> sVar = oVar2.o;
        e.c.h.f.g gVar = oVar2.q;
        C0740u c0740u = new C0740u(sVar, gVar, u);
        if (!this.l) {
            return new C0739t(gVar, oVar2.z, c0740u);
        }
        return new C0739t(gVar, oVar2.z, new C0741v(oVar2.l, oVar2.m, gVar, oVar2.r, oVar2.s, c0740u));
    }

    public U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> e(ImageRequest imageRequest) {
        U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> k;
        e.c.h.m.b.b();
        try {
            e.c.h.m.b.b();
            Objects.requireNonNull(imageRequest);
            Uri v = imageRequest.v();
            e.c.c.d.h.e(v, "Uri is null.");
            int w = imageRequest.w();
            if (w != 0) {
                switch (w) {
                    case 2:
                    case 9:
                        k = j();
                        break;
                    case 3:
                        synchronized (this) {
                            if (this.s == null) {
                                this.s = p(this.b.e());
                            }
                            k = this.s;
                        }
                        break;
                    case 4:
                        if (!e.c.c.f.a.a(this.a.getType(v))) {
                            k = h();
                            break;
                        } else {
                            k = j();
                            break;
                        }
                    case 5:
                        k = g();
                        break;
                    case 6:
                        k = i();
                        break;
                    case 7:
                        k = d();
                        break;
                    case 8:
                        k = l();
                        break;
                    case 10:
                        k = h();
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + m(v));
                }
            } else {
                k = k();
            }
            e.c.h.m.b.b();
            if (imageRequest.k() != null) {
                synchronized (this) {
                    if (!this.z.containsKey(k)) {
                        o oVar = this.b;
                        S s = new S(k, oVar.t, oVar.j.c());
                        o oVar2 = this.b;
                        this.z.put(k, new Q(oVar2.p, oVar2.q, s));
                    }
                    k = this.z.get(k);
                }
            }
            if (this.h) {
                synchronized (this) {
                    U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> u = this.A.get(k);
                    if (u == null) {
                        o oVar3 = this.b;
                        C0729i c0729i = new C0729i(k, oVar3.u, oVar3.v, oVar3.w);
                        this.A.put(k, c0729i);
                        k = c0729i;
                    } else {
                        k = u;
                    }
                }
            }
            return k;
        } finally {
            e.c.h.m.b.b();
        }
    }

    public U<Void> f(ImageRequest imageRequest) {
        U<Void> u;
        U<Void> u2;
        Objects.requireNonNull(imageRequest);
        e.c.c.d.h.a(imageRequest.j().getValue() <= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue());
        int w = imageRequest.w();
        if (w == 0) {
            synchronized (this) {
                e.c.h.m.b.b();
                if (this.q == null) {
                    e.c.h.m.b.b();
                    this.q = new e0(b());
                    e.c.h.m.b.b();
                }
                e.c.h.m.b.b();
                u = this.q;
            }
            return u;
        }
        if (w != 2 && w != 3) {
            Uri v = imageRequest.v();
            StringBuilder M = e.a.a.a.a.M("Unsupported uri scheme for encoded image fetch! Uri is: ");
            M.append(m(v));
            throw new IllegalArgumentException(M.toString());
        }
        synchronized (this) {
            e.c.h.m.b.b();
            if (this.p == null) {
                e.c.h.m.b.b();
                this.p = new e0(a());
                e.c.h.m.b.b();
            }
            e.c.h.m.b.b();
            u2 = this.p;
        }
        return u2;
    }
}
