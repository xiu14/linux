package e.c.h.g;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.A;
import com.facebook.imagepipeline.memory.z;
import com.facebook.imagepipeline.producers.C0745z;
import com.facebook.imagepipeline.producers.M;
import e.c.h.f.s;
import e.c.h.f.t;
import e.c.h.f.w;
import e.c.h.g.k;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class j {
    private static boolean y = false;
    private static b z = new b(null);
    private final e.c.c.d.j<t> a;
    private final s.a b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.h.f.g f9891c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f9892d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9893e;

    /* renamed from: f, reason: collision with root package name */
    private final g f9894f;

    /* renamed from: g, reason: collision with root package name */
    private final e.c.c.d.j<t> f9895g;
    private final f h;
    private final e.c.h.f.p i;
    private final e.c.c.d.j<Boolean> j;
    private final com.facebook.cache.disk.b k;
    private final com.facebook.common.memory.c l;
    private final M m;
    private final int n;
    private final A o;
    private final e.c.h.j.e p;
    private final Set<e.c.h.l.f> q;
    private final Set<e.c.h.l.e> r;
    private final boolean s;
    private final com.facebook.cache.disk.b t;
    private final HashMap<String, com.facebook.cache.disk.b> u;
    private final k v;
    private final boolean w;
    private final e.c.h.i.a x;

    public static class a {
        private Bitmap.Config a;
        private e.c.c.d.j<t> b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f9896c;

        /* renamed from: e, reason: collision with root package name */
        private e.c.c.d.j<t> f9898e;

        /* renamed from: f, reason: collision with root package name */
        private com.facebook.cache.disk.b f9899f;

        /* renamed from: g, reason: collision with root package name */
        private com.facebook.common.memory.c f9900g;
        private M h;
        private A i;
        private Set<e.c.h.l.f> j;
        private com.facebook.cache.disk.b k;

        /* renamed from: d, reason: collision with root package name */
        private boolean f9897d = false;
        private final k.b l = new k.b(this);
        private boolean m = true;
        private e.c.h.i.a n = new e.c.h.i.a();

        a(Context context, i iVar) {
            Objects.requireNonNull(context);
            this.f9896c = context;
        }

        static /* synthetic */ int e(a aVar) {
            return -1;
        }

        static /* synthetic */ boolean j(a aVar) {
            return true;
        }

        public j q() {
            return new j(this, null);
        }

        public a r(e.c.c.d.j<t> jVar) {
            this.b = jVar;
            return this;
        }

        public a s(Bitmap.Config config) {
            this.a = config;
            return this;
        }

        public a t(boolean z) {
            this.f9897d = z;
            return this;
        }

        public a u(e.c.c.d.j<t> jVar) {
            this.f9898e = jVar;
            return this;
        }

        public a v(com.facebook.cache.disk.b bVar) {
            this.f9899f = bVar;
            return this;
        }

        public a w(com.facebook.common.memory.c cVar) {
            this.f9900g = cVar;
            return this;
        }

        public a x(A a) {
            this.i = a;
            return this;
        }

        public a y(com.facebook.cache.disk.b bVar) {
            this.k = bVar;
            return this;
        }
    }

    public static class b {
        b(i iVar) {
        }

        public int a() {
            return 30;
        }
    }

    j(a aVar, i iVar) {
        com.facebook.cache.disk.b bVar;
        e.c.h.m.b.b();
        this.v = new k(aVar.l, null);
        this.a = aVar.b == null ? new e.c.h.f.k((ActivityManager) aVar.f9896c.getSystemService("activity")) : aVar.b;
        this.b = new e.c.h.f.d();
        if (aVar.a == null) {
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
        } else {
            Bitmap.Config unused = aVar.a;
        }
        this.f9891c = e.c.h.f.l.c();
        Context context = aVar.f9896c;
        Objects.requireNonNull(context);
        this.f9892d = context;
        this.f9894f = new d(new e());
        this.f9893e = aVar.f9897d;
        this.f9895g = aVar.f9898e == null ? new e.c.h.f.m() : aVar.f9898e;
        this.i = w.a();
        this.j = new i(this);
        if (aVar.f9899f == null) {
            Context context2 = aVar.f9896c;
            try {
                e.c.h.m.b.b();
                bVar = com.facebook.cache.disk.b.n(context2).m();
                e.c.h.m.b.b();
            } finally {
            }
        } else {
            bVar = aVar.f9899f;
        }
        this.k = bVar;
        this.l = aVar.f9900g == null ? com.facebook.common.memory.d.b() : aVar.f9900g;
        int e2 = a.e(aVar) < 0 ? 30000 : a.e(aVar);
        this.n = e2;
        e.c.h.m.b.b();
        this.m = aVar.h == null ? new C0745z(e2) : aVar.h;
        e.c.h.m.b.b();
        A a2 = aVar.i == null ? new A(z.k().b()) : aVar.i;
        this.o = a2;
        this.p = new e.c.h.j.g();
        this.q = aVar.j == null ? new HashSet<>() : aVar.j;
        this.r = new HashSet();
        this.s = a.j(aVar);
        this.t = aVar.k != null ? aVar.k : bVar;
        try {
            e.c.h.m.b.b();
            HashMap<String, com.facebook.cache.disk.b> hashMap = new HashMap<>();
            e.c.h.m.b.b();
            this.u = hashMap;
            this.h = new c(a2.b());
            this.w = aVar.m;
            this.x = aVar.n;
            y = false;
        } finally {
        }
    }

    public static b g() {
        return z;
    }

    public static boolean y() {
        return y;
    }

    public static a z(Context context) {
        return new a(context, null);
    }

    public e.c.c.d.j<t> a() {
        return this.a;
    }

    public s.a b() {
        return this.b;
    }

    public e.c.h.f.g c() {
        return this.f9891c;
    }

    public e.c.h.i.a d() {
        return this.x;
    }

    public Context e() {
        return this.f9892d;
    }

    public HashMap<String, com.facebook.cache.disk.b> f() {
        return this.u;
    }

    public e.c.c.d.j<t> h() {
        return this.f9895g;
    }

    public f i() {
        return this.h;
    }

    public k j() {
        return this.v;
    }

    public g k() {
        return this.f9894f;
    }

    public e.c.h.f.p l() {
        return this.i;
    }

    public e.c.c.d.j<Boolean> m() {
        return this.j;
    }

    public com.facebook.cache.disk.b n() {
        return this.k;
    }

    public com.facebook.common.memory.c o() {
        return this.l;
    }

    public M p() {
        return this.m;
    }

    public A q() {
        return this.o;
    }

    public e.c.h.j.e r() {
        return this.p;
    }

    public Set<e.c.h.l.e> s() {
        return Collections.unmodifiableSet(this.r);
    }

    public Set<e.c.h.l.f> t() {
        return Collections.unmodifiableSet(this.q);
    }

    public com.facebook.cache.disk.b u() {
        return this.t;
    }

    public boolean v() {
        return this.w;
    }

    public boolean w() {
        return this.f9893e;
    }

    public boolean x() {
        return this.s;
    }
}
