package com.vivo.push;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class z implements k {
    private y a = new y();
    private y b = new y();

    /* renamed from: c, reason: collision with root package name */
    private com.vivo.push.c.a f8940c;

    /* renamed from: d, reason: collision with root package name */
    private volatile String f8941d;

    /* renamed from: e, reason: collision with root package name */
    private com.vivo.push.restructure.b.a f8942e;

    public z(com.vivo.push.c.a aVar, com.vivo.push.restructure.b.a aVar2) {
        this.f8940c = aVar;
        this.f8942e = aVar2;
    }

    private void d(String str) {
        this.f8941d = str;
        this.f8942e.c(this.f8941d);
    }

    @Override // com.vivo.push.k
    public final String b() {
        if (!TextUtils.isEmpty(this.f8941d)) {
            return this.f8941d;
        }
        String d2 = d();
        if (TextUtils.isEmpty(d2)) {
            d2 = this.f8942e.f();
            t.b(new aa(this, d2));
        }
        this.f8941d = d2;
        com.vivo.push.util.t.d("SubscribeImpl", "getRegidByCoreSdk code = ".concat(String.valueOf(d2)));
        return d2;
    }

    @Override // com.vivo.push.k
    public final void c(String str) {
        d(str);
    }

    private int c() {
        if (!this.f8940c.d()) {
            return 8013;
        }
        if (this.b.a()) {
            com.vivo.push.util.t.d("SubscribeImpl", "isAppSubscribe 两秒内重复调用  ");
            return 1002;
        }
        int i = 1;
        try {
            String a = new e(1, com.vivo.push.restructure.a.a().b().getPackageName(), "", "", com.vivo.push.restructure.a.a().e().f()).a();
            com.vivo.push.util.t.d("SubscribeImpl", "isAppSubscribe parameter = ".concat(String.valueOf(a)));
            String a2 = com.vivo.push.c.a.a(com.vivo.push.restructure.a.a().b(), a);
            com.vivo.push.util.t.d("SubscribeImpl", "isAppSubscribe isSubscribe = ".concat(String.valueOf(a2)));
            if (!TextUtils.isEmpty(a2)) {
                i = 1 ^ (Boolean.parseBoolean(((g) g.a.a(a2)).b()) ? 1 : 0);
            }
        } catch (Exception e2) {
            com.vivo.push.util.t.a("SubscribeImpl", "isAppSubscribe", e2);
        }
        com.vivo.push.util.t.d("SubscribeImpl", "isAppSubscribe code = ".concat(String.valueOf(i)));
        return i;
    }

    @Override // com.vivo.push.k
    public final void a(IPushActionListener iPushActionListener, String str, String str2) {
        if (this.f8940c.c() || iPushActionListener == null) {
            m.a().b(iPushActionListener, str, str2);
        } else {
            iPushActionListener.onStateChanged(8012);
        }
    }

    private String d() {
        String str = "";
        if (!this.f8940c.d()) {
            com.vivo.push.util.t.d("SubscribeImpl", "getRegidByCoreSdk 系统不支持查询regid  ");
            return "";
        }
        if (this.a.a()) {
            com.vivo.push.util.t.d("SubscribeImpl", "getRegidByCoreSdk 两秒内重复调用  ");
            return "";
        }
        try {
            String a = new e(2, com.vivo.push.restructure.a.a().b().getPackageName(), "", "", com.vivo.push.restructure.a.a().e().f()).a();
            com.vivo.push.util.t.d("SubscribeImpl", "getRegidByCoreSdk parameter = ".concat(String.valueOf(a)));
            String a2 = com.vivo.push.c.a.a(com.vivo.push.restructure.a.a().b(), a);
            com.vivo.push.util.t.d("SubscribeImpl", "getRegidByCoreSdk isSubscribe = ".concat(String.valueOf(a2)));
            if (!TextUtils.isEmpty(a2)) {
                str = ((g) g.a.a(a2)).b();
            }
        } catch (Exception e2) {
            com.vivo.push.util.t.a("SubscribeImpl", "getRegidByCoreSdk", e2);
        }
        com.vivo.push.util.t.d("SubscribeImpl", "getRegidByCoreSdk code = ".concat(String.valueOf(str)));
        return str;
    }

    @Override // com.vivo.push.k
    public final int a() {
        return c();
    }

    @Override // com.vivo.push.k
    public final void a(String str, String str2, String str3) {
        d(str);
        this.f8942e.a(str2);
        this.f8942e.b(str3);
    }

    @Override // com.vivo.push.k
    public final void a(String str) {
        d(str);
        this.f8942e.d();
        this.f8942e.b();
    }

    @Override // com.vivo.push.k
    public final void b(String str) {
        d(str);
        m.a().e();
        this.f8942e.h();
        this.f8942e.d();
        this.f8942e.b();
    }
}
