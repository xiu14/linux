package com.huawei.hianalytics.e;

/* loaded from: classes2.dex */
public class c {
    private boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private String f7036c;

    /* renamed from: d, reason: collision with root package name */
    private String f7037d;

    /* renamed from: e, reason: collision with root package name */
    private String f7038e;

    /* renamed from: f, reason: collision with root package name */
    private String f7039f;

    /* renamed from: g, reason: collision with root package name */
    private b f7040g;
    private String h;
    private String i;
    private int j;
    private int k;
    private boolean l;
    private String m;

    public c() {
        this.f7038e = "";
        this.f7039f = "";
        this.f7040g = new b();
        this.h = "";
        this.i = "";
        this.l = true;
    }

    public c(c cVar) {
        this.f7038e = "";
        this.f7039f = "";
        this.f7040g = new b();
        this.h = "";
        this.i = "";
        this.l = true;
        this.f7040g = cVar.f7040g;
        b(cVar.a);
        a(cVar.f7036c);
        b(cVar.f7037d);
        c(cVar.f7038e);
        d(cVar.f7039f);
        e(cVar.h);
        f(cVar.i);
        a(cVar.b);
        b(cVar.j);
        a(cVar.k);
        c(cVar.l);
    }

    public b a() {
        return this.f7040g;
    }

    public void a(int i) {
        this.k = i;
    }

    public void a(String str) {
        this.f7036c = str;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public int b() {
        return this.k;
    }

    public void b(int i) {
        this.j = i;
    }

    public void b(String str) {
        this.f7037d = str;
    }

    public void b(boolean z) {
        this.a = z;
    }

    public int c() {
        return this.j;
    }

    public void c(String str) {
        this.f7038e = str;
    }

    public void c(boolean z) {
        this.l = z;
    }

    public void d(String str) {
        this.f7039f = str;
    }

    public boolean d() {
        return this.b;
    }

    public void e(String str) {
        this.h = str;
    }

    public boolean e() {
        return this.a;
    }

    public String f() {
        return this.f7036c;
    }

    public void f(String str) {
        this.i = str;
    }

    public String g() {
        return this.f7037d;
    }

    public void g(String str) {
        this.m = str;
    }

    public String h() {
        return this.f7038e;
    }

    public String i() {
        return this.f7039f;
    }

    public String j() {
        return this.h;
    }

    public String k() {
        return this.i;
    }

    public boolean l() {
        return this.l;
    }

    public String m() {
        return this.m;
    }
}
