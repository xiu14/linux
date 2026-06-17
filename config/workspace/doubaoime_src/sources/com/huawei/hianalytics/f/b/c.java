package com.huawei.hianalytics.f.b;

/* loaded from: classes2.dex */
public abstract class c {
    protected String a;
    protected String b;

    /* renamed from: c, reason: collision with root package name */
    protected String f7059c;

    /* renamed from: d, reason: collision with root package name */
    protected long f7060d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected String f7061e;

    /* renamed from: f, reason: collision with root package name */
    protected String f7062f;

    /* renamed from: g, reason: collision with root package name */
    protected String f7063g;
    protected String h;

    public void a(c cVar) {
        if (cVar == null) {
            return;
        }
        cVar.c(e());
        cVar.a(c());
        cVar.b(d());
        cVar.e(g());
        cVar.d(f());
        cVar.f(h());
        cVar.g(j());
    }

    public void a(String str) {
        this.f7063g = str;
    }

    public void b(String str) {
        this.h = str;
    }

    public String c() {
        return this.f7063g;
    }

    public void c(String str) {
        this.a = str;
    }

    public String d() {
        return this.h;
    }

    public void d(String str) {
        this.b = str;
    }

    public String e() {
        return this.a;
    }

    public void e(String str) {
        this.f7061e = str;
    }

    public String f() {
        return this.b;
    }

    public void f(String str) {
        this.f7059c = str;
    }

    public String g() {
        return this.f7061e;
    }

    public void g(String str) {
        this.f7062f = str;
    }

    public String h() {
        return this.f7059c;
    }

    public long i() {
        return this.f7060d;
    }

    public String j() {
        return this.f7062f;
    }
}
