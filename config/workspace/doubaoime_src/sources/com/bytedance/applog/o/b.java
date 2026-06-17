package com.bytedance.applog.o;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.applog.l;
import com.bytedance.applog.w.j;
import com.bytedance.bdinstall.B;
import com.bytedance.bdinstall.C0629i;
import com.bytedance.bdinstall.C0632l;
import com.bytedance.bdinstall.C0633m;
import com.bytedance.bdinstall.C0641v;
import com.bytedance.bdinstall.C0642w;
import com.bytedance.bdinstall.D;
import com.bytedance.bdinstall.E;
import com.bytedance.bdinstall.F;
import com.bytedance.bdinstall.InterfaceC0644y;
import com.bytedance.bdinstall.InterfaceC0645z;
import com.bytedance.bdinstall.Level;
import com.bytedance.bdinstall.P;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.V;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements com.bytedance.applog.o.d, E {
    private volatile Q b;

    /* renamed from: c, reason: collision with root package name */
    private volatile com.bytedance.applog.o.c f3852c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.applog.c f3853d;

    /* renamed from: e, reason: collision with root package name */
    private volatile InterfaceC0645z f3854e;

    /* renamed from: g, reason: collision with root package name */
    private P f3856g;
    private String h;
    private String i;
    private String j;

    @SuppressLint({"StaticFieldLeak"})
    private volatile C0633m a = new C0633m();

    /* renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f3855f = new ConcurrentHashMap<>();

    class a implements Executor {
        final /* synthetic */ Handler a;

        a(b bVar, Handler handler) {
            this.a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.a.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                this.a.post(runnable);
            }
        }
    }

    /* renamed from: com.bytedance.applog.o.b$b, reason: collision with other inner class name */
    class C0149b implements D {
        C0149b() {
        }

        @Override // com.bytedance.bdinstall.D
        public void a(String str, JSONObject jSONObject) {
            if (b.this.f3853d.X()) {
                b.this.f3853d.q0(str, jSONObject);
            }
        }
    }

    class c implements F {
        c() {
        }
    }

    class d implements B {
        d() {
        }

        @Override // com.bytedance.bdinstall.B
        public void a(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
            b.this.h = str2;
            b.this.i = str4;
            b.this.j = str6;
            if (b.this.f3853d.q() != null) {
                b.this.f3853d.q().a(z, str, str2, str3, str4, str5, str6);
            }
            b.this.f3853d.K().t("device_id", str2);
            int i = j.a;
        }

        @Override // com.bytedance.bdinstall.B
        public void b(String str, String str2, String str3) {
            b.this.h = str;
            b.this.i = str2;
            b.this.j = str3;
            if (b.this.f3853d.q() != null) {
                b.this.f3853d.q().b(str, str2, str3);
            }
            b.this.f3853d.K().t("device_id", str);
            int i = j.a;
        }
    }

    private static class e implements E, InterfaceC0644y {
        private final E a;
        private final f b;

        /* renamed from: c, reason: collision with root package name */
        private JSONObject f3857c;

        /* renamed from: d, reason: collision with root package name */
        private P f3858d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3859e = false;

        public e(E e2, f fVar) {
            this.a = e2;
            this.b = fVar;
        }

        private void c() {
            P p;
            synchronized (this) {
                if (this.f3859e) {
                    this.b.a(this.f3857c, this.f3858d);
                } else {
                    JSONObject jSONObject = this.f3857c;
                    if (jSONObject != null && (p = this.f3858d) != null) {
                        this.f3859e = true;
                        this.b.b(jSONObject, p);
                    }
                }
            }
        }

        @Override // com.bytedance.bdinstall.E
        public void a(@NonNull P p) {
            this.a.a(p);
            this.f3858d = p;
            c();
        }

        @Override // com.bytedance.bdinstall.InterfaceC0644y
        public void b(JSONObject jSONObject) {
            this.f3857c = jSONObject;
            c();
        }
    }

    public interface f {
        void a(JSONObject jSONObject, P p);

        void b(JSONObject jSONObject, P p);
    }

    public b(com.bytedance.applog.c cVar) {
        this.f3853d = cVar;
    }

    private InterfaceC0645z k() {
        if (this.f3854e == null) {
            synchronized (this) {
                if (this.f3854e == null) {
                    if (com.bytedance.applog.b.d(this.f3853d)) {
                        this.f3854e = C0629i.e();
                    } else {
                        int i = C0629i.f4007c;
                        this.f3854e = new C0632l();
                    }
                }
            }
        }
        return this.f3854e;
    }

    @Override // com.bytedance.bdinstall.E
    public void a(@NonNull P p) {
        this.f3856g = p;
    }

    public void f() {
        ((C0632l) k()).c(new d());
    }

    public void g(f fVar) {
        e eVar = new e(this, fVar);
        C0632l c0632l = (C0632l) k();
        Objects.requireNonNull(c0632l);
        c0632l.j.c(true, new com.bytedance.bdinstall.g0.f(eVar));
        ((C0632l) k()).a(true, eVar);
    }

    public String h(Context context, StringBuilder sb, boolean z, Level level) {
        return ((C0632l) k()).b(context, sb, z, level);
    }

    public void i(C0641v c0641v) {
        ((C0632l) k()).d(c0641v);
    }

    public void j(C0641v c0641v) {
        Objects.requireNonNull((C0632l) k());
    }

    public boolean l(JSONObject jSONObject) {
        return ((C0632l) k()).i(jSONObject);
    }

    public String m() {
        if (TextUtils.isEmpty(this.h)) {
            this.h = ((C0632l) k()).k();
        }
        return this.h;
    }

    public String n() {
        if (TextUtils.isEmpty(this.i)) {
            P o = o();
            this.i = o != null ? o.e() : null;
        }
        return this.i;
    }

    public P o() {
        if (this.f3856g == null) {
            this.f3856g = ((C0632l) k()).l();
        }
        return this.f3856g;
    }

    public Q p() {
        return this.b;
    }

    public String q() {
        if (TextUtils.isEmpty(this.j)) {
            P o = o();
            this.j = o != null ? o.g() : null;
        }
        return this.j;
    }

    public void r(com.bytedance.applog.x.b bVar, C0641v c0641v, Looper looper, com.bytedance.applog.d dVar) {
        l r = bVar.r();
        this.f3852c = new com.bytedance.applog.o.c(this.f3853d, k());
        if (!this.f3855f.isEmpty()) {
            this.f3852c.b(this.f3855f);
            this.f3855f.clear();
        }
        Handler handler = new Handler(looper);
        C0642w c0642w = new C0642w();
        c0642w.a = new a(this, handler);
        c0642w.b = looper;
        ((C0632l) k()).s(c0642w, r.c());
        C0149b c0149b = new C0149b();
        c cVar = this.f3853d.h0() ? new c() : null;
        C0633m c0633m = this.a;
        c0633m.q(this.f3853d.o());
        c0633m.g(null);
        c0633m.n(true);
        c0633m.h(Integer.parseInt(r.c()));
        c0633m.i(false);
        c0633m.j(null);
        c0633m.l(null);
        c0633m.k(r.d());
        c0633m.o(c0149b);
        c0633m.x(cVar);
        c0633m.p(r.f());
        c0633m.H(null);
        c0633m.w(false);
        c0633m.G(false);
        c0633m.C(null);
        c0633m.f(r.b());
        c0633m.t(false);
        c0633m.v(this.f3853d.t());
        c0633m.s(null);
        c0633m.z(new com.bytedance.applog.o.a(this.f3853d));
        c0633m.y(0L);
        c0633m.K(r.n());
        c0633m.L(r.m());
        c0633m.I(r.k());
        c0633m.J(r.o());
        c0633m.B(null);
        c0633m.E(false);
        c0633m.F(r.j());
        c0633m.M(null);
        c0633m.e(bVar.G());
        c0633m.A(null);
        c0633m.r(this.f3852c);
        c0633m.m(null);
        c0633m.c(false);
        c0633m.x(null);
        c0633m.u(null);
        c0633m.L = false;
        c0633m.d(true);
        c0633m.D(null);
        c0633m.b(true);
        if (dVar != null) {
            dVar.b(this.a);
        }
        synchronized (b.class) {
            Q a2 = this.a.a();
            ((C0632l) k()).p(a2, c0641v);
            this.a = null;
            this.b = a2;
        }
        if (dVar != null) {
            dVar.a();
        }
    }

    public void s(Context context, C0641v c0641v, long j, V v) {
        ((C0632l) k()).q(context, c0641v, j, v);
    }

    public void t(Context context, C0641v c0641v, long j, V v) {
        Objects.requireNonNull((C0632l) k());
    }

    public void u(HashMap<String, Object> hashMap) {
        if (this.f3852c != null) {
            this.f3852c.b(hashMap);
        } else {
            this.f3855f.putAll(hashMap);
        }
    }

    public void v() {
        ((C0632l) k()).v();
    }

    public void w(Application application, String str) {
        ((C0632l) k()).u(application, str);
    }
}
