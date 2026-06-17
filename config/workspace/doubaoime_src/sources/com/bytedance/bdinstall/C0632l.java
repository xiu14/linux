package com.bytedance.bdinstall;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import androidx.annotation.AnyThread;
import com.bytedance.bdinstall.j0.a;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdinstall.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0632l implements InterfaceC0645z {
    private static Map<String, C0632l> l = new ConcurrentHashMap();
    private static final AtomicInteger m = new AtomicInteger(0);
    private C0626f h;
    private com.bytedance.bdinstall.util.b i;
    public final com.bytedance.bdinstall.g0.c j;

    @SuppressLint({"CI_StaticFieldLeak", "StaticFieldLeak"})
    private volatile Q a = null;
    private volatile com.bytedance.bdinstall.j0.a b = new a.C0155a();

    /* renamed from: c, reason: collision with root package name */
    private final U f4048c = new U();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f4049d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f4050e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final C0630j f4051f = new C0630j();

    /* renamed from: g, reason: collision with root package name */
    private final com.bytedance.bdinstall.util.f<com.bytedance.bdinstall.o0.b> f4052g = new a();
    private final com.bytedance.bdinstall.util.p<P> k = new b(this);

    /* renamed from: com.bytedance.bdinstall.l$a */
    class a extends com.bytedance.bdinstall.util.f<com.bytedance.bdinstall.o0.b> {
        a() {
        }

        @Override // com.bytedance.bdinstall.util.f
        protected com.bytedance.bdinstall.o0.b a(Object[] objArr) {
            if (!e0.f((Context) objArr[0])) {
                X x = new X(C0632l.this);
                x.k(C0632l.this.j);
                return x;
            }
            S s = new S(C0632l.this);
            Context context = (Context) objArr[0];
            if (!(context instanceof Application) && context != null) {
                context = context.getApplicationContext();
            }
            s.p((Application) context);
            s.q(C0632l.this.j);
            return s;
        }
    }

    /* renamed from: com.bytedance.bdinstall.l$b */
    class b extends com.bytedance.bdinstall.util.p<P> {
        b(C0632l c0632l) {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected P a(Object[] objArr) {
            return new W((Context) objArr[0]).b();
        }
    }

    public C0632l() {
        m.incrementAndGet();
        this.h = new C0626f(this);
        this.i = new com.bytedance.bdinstall.util.b();
        this.j = new com.bytedance.bdinstall.g0.c();
    }

    private Context h() {
        return (this.a == null || this.a.q() == null) ? BDInstallProvider.b() : this.a.q();
    }

    public static C0632l n(String str) {
        return l.get(str);
    }

    @AnyThread
    public void a(boolean z, E e2) {
        if (e2 == null) {
            return;
        }
        this.j.c(z, new com.bytedance.bdinstall.g0.g(e2));
    }

    public String b(Context context, StringBuilder sb, boolean z, Level level) {
        boolean z2 = true;
        if (!C0629i.f(this) && this.a == null) {
            z2 = false;
        }
        if (z2) {
            return this.h.a(context, sb, null, z, level);
        }
        return null;
    }

    public void c(B b2) {
        this.i.c(b2);
    }

    public void d(C0641v c0641v) {
        Context h = h();
        if (h == null) {
            return;
        }
        this.f4052g.b(h).a(c0641v);
    }

    public com.bytedance.bdinstall.j0.a e() {
        return this.b;
    }

    public C0626f f() {
        return this.h;
    }

    public C0630j g() {
        return this.f4051f;
    }

    public boolean i(JSONObject jSONObject) {
        Context h = h();
        if (h == null) {
            return false;
        }
        try {
            return this.f4052g.b(h).h(jSONObject);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public com.bytedance.bdinstall.util.b j() {
        return this.i;
    }

    public String k() {
        if (this.a != null && this.a.q() != null) {
            return this.f4052g.b(this.a.q()).getDid();
        }
        int i = C0640u.a;
        P w = w();
        if (w == null) {
            return null;
        }
        return w.c();
    }

    public P l() {
        if (this.a != null && this.a.q() != null) {
            return this.f4052g.b(this.a.q()).f();
        }
        int i = C0640u.a;
        return w();
    }

    public Q m() {
        return this.a;
    }

    public U o() {
        return this.f4048c;
    }

    public void p(Q q, C0641v c0641v) {
        synchronized (this) {
            if (!l.containsKey(String.valueOf(q.h()))) {
                int i = C0640u.a;
                l.put(String.valueOf(q.h()), this);
                q.O = C0629i.f(this);
                this.a = q;
                this.j.a(this.a.i());
                if (q.g() != null) {
                    this.b = q.g();
                }
                J B = q.B();
                if (B != null) {
                    String valueOf = String.valueOf(q.h());
                    ConcurrentHashMap<String, J> concurrentHashMap = b0.f3971c;
                    if (!concurrentHashMap.containsKey(valueOf)) {
                        concurrentHashMap.put(valueOf, B);
                    }
                }
                if (q.P()) {
                    this.h.c(com.bytedance.bdinstall.util.j.d(q.q()));
                    com.bytedance.bdinstall.util.j.f();
                }
                this.f4052g.b(q.q()).i(q, c0641v);
                this.f4049d.set(true);
                if (this.f4050e.get()) {
                    if (this.f4049d.get()) {
                        Context h = h();
                        if (h != null) {
                            this.f4052g.b(h).c();
                        }
                    } else {
                        this.f4050e.set(true);
                    }
                }
            }
        }
    }

    public void q(Context context, C0641v c0641v, long j, V v) {
        Context h = h();
        if (h == null) {
            return;
        }
        this.f4052g.b(h).g(context, c0641v, j, v);
    }

    public void r(Context context, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(MonitorConstants.CUSTOM, jSONObject);
        this.f4052g.b(context).b(context, hashMap);
    }

    public void s(C0642w c0642w, String str) {
        C0643x.k(str, c0642w);
    }

    public void t(P p) {
        Context h = h();
        if (h == null) {
            return;
        }
        this.f4052g.b(h).e(p);
    }

    public void u(Context context, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("user_unique_id", str);
        this.f4052g.b(context).d(context, hashMap, true, true);
    }

    public void v() {
        if (this.a == null) {
            return;
        }
        this.f4052g.b(this.a.q()).start();
        com.bytedance.bdinstall.m0.k.n(this.a.q()).s(this.a);
        com.bytedance.bdinstall.m0.k.n(this.a.q()).r(this.j);
        com.bytedance.bdinstall.m0.k.n(this.a.q()).t();
    }

    public P w() {
        Context h = h();
        if (h == null) {
            return null;
        }
        return this.k.b(h);
    }
}
