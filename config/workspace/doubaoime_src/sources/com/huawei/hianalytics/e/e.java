package com.huawei.hianalytics.e;

/* loaded from: classes2.dex */
public class e {
    private c a;
    private c b;

    /* renamed from: c, reason: collision with root package name */
    private c f7046c;

    /* renamed from: d, reason: collision with root package name */
    private c f7047d;

    public e(String str) {
    }

    public c a() {
        return this.a;
    }

    public c a(String str) {
        if ("oper".equals(str)) {
            return b();
        }
        if ("maint".equals(str)) {
            return a();
        }
        if ("diffprivacy".equals(str)) {
            return d();
        }
        if ("preins".equals(str)) {
            return c();
        }
        com.huawei.hianalytics.g.b.c("HianalyticsSDK", "HiAnalyticsInstData.getConfig(type): wrong type!");
        return null;
    }

    public void a(c cVar) {
        this.a = cVar;
    }

    public c b() {
        return this.b;
    }

    public void b(c cVar) {
        this.b = cVar;
    }

    public c c() {
        return this.f7047d;
    }

    public void c(c cVar) {
        this.f7047d = cVar;
    }

    public c d() {
        return this.f7046c;
    }

    public void d(c cVar) {
        this.f7046c = cVar;
    }
}
