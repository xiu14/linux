package com.bytedance.bdinstall;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class S implements com.bytedance.bdinstall.o0.b {

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f3959g = new AtomicBoolean(false);
    private volatile Q a;
    private volatile K b;

    /* renamed from: c, reason: collision with root package name */
    private volatile com.bytedance.bdinstall.k0.m f3960c;

    /* renamed from: d, reason: collision with root package name */
    private volatile com.bytedance.bdinstall.g0.c f3961d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f3962e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC0645z f3963f;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            S.j(S.this, false);
        }
    }

    class b implements Runnable {
        final /* synthetic */ C0641v a;

        b(C0641v c0641v) {
            this.a = c0641v;
        }

        @Override // java.lang.Runnable
        public void run() {
            S.this.b.l(this.a, false);
            S.this.f3960c.b();
            S.this.f3960c.o();
        }
    }

    class c implements Runnable {
        final /* synthetic */ C0641v a;

        c(C0641v c0641v) {
            this.a = c0641v;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (S.this.f3962e.get()) {
                S.this.b.m(this.a, true, false);
                return;
            }
            StringBuilder M = e.a.a.a.a.M("not start yet,start it ");
            M.append(this.a);
            M.toString();
            int i = C0640u.a;
            S.this.b.l(this.a, false);
            S.j(S.this, true);
            S.this.r();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            K k = S.this.b;
            if (k != null) {
                k.k();
            } else {
                new RuntimeException("active failed");
                int i = C0640u.a;
            }
        }
    }

    S(InterfaceC0645z interfaceC0645z) {
        this.f3963f = interfaceC0645z;
    }

    static void j(S s, boolean z) {
        if (!s.o() || s.a == null) {
            throw new RuntimeException("please init first");
        }
        if (s.f3962e.getAndSet(true)) {
            return;
        }
        com.bytedance.bdinstall.o0.c cVar = (com.bytedance.bdinstall.o0.c) com.bytedance.bdinstall.o0.d.a(com.bytedance.bdinstall.o0.c.class, s.a.i());
        if (cVar != null) {
            cVar.start();
        }
        s.f3960c.w();
        s.b.q(z);
        W w = new W(s.a.q());
        w.c(s.a);
        w.e();
    }

    private boolean o() {
        return this.b != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (com.bytedance.bdinstall.util.g.d(this.a.q(), this.a).getBoolean("_install_started_v2", false)) {
            return;
        }
        com.bytedance.bdinstall.util.g.d(this.a.q(), this.a).edit().putBoolean("_install_started_v2", true).apply();
    }

    @Override // com.bytedance.bdinstall.o0.b
    public void a(C0641v c0641v) {
        int i = C0640u.a;
        if (this.b == null || this.a == null || this.f3960c == null) {
            new RuntimeException("not init yet");
            return;
        }
        String str = "clearInstallInfoWhenSwitchChildMode " + c0641v;
        C0643x.h(this.a.i(), new b(c0641v));
    }

    @Override // com.bytedance.bdinstall.o0.b
    public void b(Context context, Map<String, Object> map) {
        boolean z;
        if (this.f3960c != null) {
            loop0: while (true) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    z = this.f3960c.y(entry.getKey(), entry.getValue()) || z;
                }
            }
            if (!z || this.f3961d == null) {
                return;
            }
            this.f3961d.b(new com.bytedance.bdinstall.g0.i.a(this.f3960c.e()));
        }
    }

    @Override // com.bytedance.bdinstall.o0.b
    public boolean c() {
        int i = C0640u.a;
        if (!o() || this.a == null) {
            return false;
        }
        C0643x.h(this.a.i(), new d());
        return true;
    }

    @Override // com.bytedance.bdinstall.o0.b
    public void d(Context context, Map<String, String> map, boolean z, boolean z2) {
        SharedPreferences.Editor edit = z ? com.bytedance.bdinstall.util.g.d(context, this.a).edit() : null;
        boolean z3 = false;
        if (this.f3960c != null) {
            boolean z4 = false;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                z4 = this.f3960c.y(key, value) || z4;
                if (edit != null) {
                    edit.putString(key, value);
                }
            }
            if (edit != null) {
                edit.apply();
            }
            z3 = z4;
        }
        if (z3 && z2 && this.b != null) {
            this.b.n();
        }
        if (!z3 || this.f3961d == null) {
            return;
        }
        this.f3961d.b(new com.bytedance.bdinstall.g0.i.a(this.f3960c.e()));
    }

    @Override // com.bytedance.bdinstall.o0.b
    public void e(P p) {
    }

    @Override // com.bytedance.bdinstall.o0.b
    public P f() {
        if (this.f3960c == null) {
            return null;
        }
        return this.f3960c.h();
    }

    @Override // com.bytedance.bdinstall.o0.b
    public void g(Context context, C0641v c0641v, long j, V v) {
        int i = C0640u.a;
        if (this.b == null) {
            new RuntimeException("not init yet");
            return;
        }
        String str = "resetInstallInfoWhenSwitchChildMode " + c0641v;
        com.bytedance.bdinstall.util.t tVar = new com.bytedance.bdinstall.util.t(j, v, this.a);
        ((C0632l) this.f3963f).a(false, tVar);
        tVar.e();
        if (this.a != null) {
            C0643x.h(this.a.i(), new c(c0641v));
        }
    }

    @Override // com.bytedance.bdinstall.o0.b
    public String getDid() {
        if (this.f3960c == null) {
            return null;
        }
        return this.f3960c.f();
    }

    @Override // com.bytedance.bdinstall.o0.b
    public boolean h(JSONObject jSONObject) {
        JSONObject g2;
        if (this.f3960c == null || (g2 = this.f3960c.g()) == null) {
            return false;
        }
        e0.d(jSONObject, g2);
        return true;
    }

    @Override // com.bytedance.bdinstall.o0.b
    public void i(Q q, C0641v c0641v) {
        System.currentTimeMillis();
        int i = C0640u.a;
        synchronized (this) {
            if (this.b == null) {
                this.a = q;
                if (TextUtils.equals(q.o(), "local_test")) {
                    try {
                        com.bytedance.bdinstall.o0.d.b(com.bytedance.bdinstall.o0.c.class, (com.bytedance.bdinstall.o0.c) Class.forName("com.bytedance.bdinstall.nu.NUModeServiceImpl").getConstructor(Q.class).newInstance(q), String.valueOf(q.h()));
                    } catch (Throwable unused) {
                    }
                }
                this.f3960c = new com.bytedance.bdinstall.k0.q(q.q(), q, c0641v);
                this.f3960c.u(this.f3961d);
                this.b = new K(q, this.f3960c, C0629i.c(), c0641v);
                this.b.p(this.f3961d);
                this.f3960c.v(this.b);
                com.bytedance.bdinstall.o0.d.b(InterfaceC0638s.class, new C0639t(q, c0641v), String.valueOf(q.h()));
            }
        }
        System.currentTimeMillis();
    }

    public void p(Application application) {
        if (application != null && f3959g.compareAndSet(false, true)) {
            C0629i.g(application);
        }
    }

    public void q(com.bytedance.bdinstall.g0.c cVar) {
        this.f3961d = cVar;
    }

    @Override // com.bytedance.bdinstall.o0.b
    public void start() {
        if (!o() || this.a == null) {
            throw new RuntimeException("please init first");
        }
        this.a.h();
        int i = C0640u.a;
        C0643x.h(this.a.i(), new a());
        r();
    }
}
