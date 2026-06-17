package com.ss.android.ugc.quota;

import android.app.Application;
import android.util.Pair;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: g, reason: collision with root package name */
    private static volatile b f8410g;
    private static final Pair<String, String> h = new Pair<>("x-tt-request-tag", "");

    /* renamed from: d, reason: collision with root package name */
    private boolean f8412d;
    private e<Application> a = new a(this);
    private e<d> b = new C0386b();

    /* renamed from: c, reason: collision with root package name */
    private e<com.ss.android.ugc.quota.f.b> f8411c = new c();

    /* renamed from: e, reason: collision with root package name */
    private AtomicBoolean f8413e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private int f8414f = -999;

    class a extends e<Application> {
        a(b bVar) {
        }

        @Override // com.ss.android.ugc.quota.e
        protected Application b() {
            IBDNetworkTagConfig iBDNetworkTagConfig = (IBDNetworkTagConfig) com.ss.android.i.a.a.a.e.a().b(IBDNetworkTagConfig.class);
            if (iBDNetworkTagConfig != null) {
                return iBDNetworkTagConfig.getApplication();
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.quota.b$b, reason: collision with other inner class name */
    class C0386b extends e<d> {
        C0386b() {
        }

        @Override // com.ss.android.ugc.quota.e
        protected d b() {
            IBDNetworkTagConfig iBDNetworkTagConfig = (IBDNetworkTagConfig) com.ss.android.i.a.a.a.e.a().b(IBDNetworkTagConfig.class);
            d tagDepend = iBDNetworkTagConfig != null ? iBDNetworkTagConfig.getTagDepend() : null;
            if (tagDepend != null) {
                b.this.f8413e.set(tagDepend.a());
                b.this.f8412d = tagDepend.d();
            }
            return tagDepend;
        }
    }

    class c extends e<com.ss.android.ugc.quota.f.b> {
        c() {
        }

        @Override // com.ss.android.ugc.quota.e
        protected com.ss.android.ugc.quota.f.b b() {
            com.ss.android.ugc.quota.f.b b;
            return (b.this.b.a() == null || (b = ((d) b.this.b.a()).b()) == null) ? new com.ss.android.ugc.quota.f.a((Application) b.this.a.a()) : b;
        }
    }

    private b() {
    }

    private boolean f() {
        return this.b.a() != null && this.f8413e.get();
    }

    public static b g() {
        if (f8410g == null) {
            synchronized (b.class) {
                if (f8410g == null) {
                    f8410g = new b();
                }
            }
        }
        return f8410g;
    }

    public Pair<String, String> e(com.ss.android.ugc.quota.c cVar) {
        if (!f()) {
            return h;
        }
        int a2 = this.f8411c.a().a();
        if (this.f8414f != a2) {
            i(a2);
        }
        StringBuilder M = e.a.a.a.a.M("t=");
        M.append(cVar.b());
        M.append(";n=");
        M.append(cVar.a() ? 1 : 0);
        return new Pair<>("x-tt-request-tag", M.toString());
    }

    public boolean h() {
        if (f()) {
            return this.f8412d;
        }
        return false;
    }

    public void i(int i) {
        if (f()) {
            this.f8414f = i;
            if (this.b.a() != null) {
                this.b.a().c(i);
            }
        }
    }
}
