package com.xiaomi.push;

/* loaded from: classes2.dex */
public class de {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private long f242a;

    /* renamed from: a, reason: collision with other field name */
    private String f243a;
    private int b;

    /* renamed from: b, reason: collision with other field name */
    private long f244b;

    /* renamed from: b, reason: collision with other field name */
    private String f245b;

    /* renamed from: c, reason: collision with root package name */
    private int f9023c;

    /* renamed from: c, reason: collision with other field name */
    private long f246c;

    /* renamed from: d, reason: collision with root package name */
    private int f9024d;

    /* renamed from: d, reason: collision with other field name */
    private long f247d;

    /* renamed from: e, reason: collision with root package name */
    private int f9025e;

    /* renamed from: e, reason: collision with other field name */
    private long f248e;

    /* renamed from: f, reason: collision with root package name */
    private int f9026f;

    /* renamed from: g, reason: collision with root package name */
    private int f9027g;
    private int h;
    private int i;
    private int j;

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.f9023c;
    }

    public int d() {
        return this.f9024d;
    }

    public int e() {
        return this.f9025e;
    }

    public int f() {
        return this.f9026f;
    }

    public int g() {
        return this.f9027g;
    }

    public int h() {
        return this.h;
    }

    public int i() {
        return this.i;
    }

    public int j() {
        return this.j;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("DisconnectStatsModel{count=");
        M.append(this.a);
        M.append(", host='");
        e.a.a.a.a.G0(M, this.f243a, '\'', ", netState=");
        M.append(this.b);
        M.append(", reason=");
        M.append(this.f9023c);
        M.append(", pingInterval=");
        M.append(this.f242a);
        M.append(", netType=");
        M.append(this.f9025e);
        M.append(", wifiDigest='");
        e.a.a.a.a.G0(M, this.f245b, '\'', ", connectedNetType=");
        M.append(this.f9026f);
        M.append(", offDuration=");
        M.append(this.f244b);
        M.append(", onDuration=");
        M.append(this.f246c);
        M.append(", disconnectionTime=");
        M.append(this.f247d);
        M.append(", reconnectionTime=");
        M.append(this.f248e);
        M.append(", appVc=");
        M.append(this.f9027g);
        M.append(", xmsfVc=");
        M.append(this.h);
        M.append(", androidVc=");
        M.append(this.i);
        M.append(", pushBundleVc=");
        return e.a.a.a.a.C(M, this.j, '}');
    }

    public void a(int i) {
        this.a = i;
    }

    public void b(int i) {
        this.b = i;
    }

    public void c(int i) {
        this.f9023c = i;
    }

    public void d(int i) {
        this.f9024d = i;
    }

    public void e(int i) {
        this.f9025e = i;
    }

    public void f(int i) {
        this.f9026f = i;
    }

    public void g(int i) {
        this.f9027g = i;
    }

    public void h(int i) {
        this.h = i;
    }

    public void i(int i) {
        this.i = i;
    }

    public void j(int i) {
        this.j = i;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m231a() {
        return this.f243a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public String m233b() {
        return this.f245b;
    }

    /* renamed from: c, reason: collision with other method in class */
    public long m234c() {
        return this.f246c;
    }

    /* renamed from: d, reason: collision with other method in class */
    public long m235d() {
        return this.f247d;
    }

    /* renamed from: e, reason: collision with other method in class */
    public long m236e() {
        return this.f248e;
    }

    public void a(String str) {
        this.f243a = str;
    }

    public void b(String str) {
        this.f245b = str;
    }

    public void c(long j) {
        this.f246c = j;
    }

    public void d(long j) {
        this.f247d = j;
    }

    public void e(long j) {
        this.f248e = j;
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m230a() {
        return this.f242a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public long m232b() {
        return this.f244b;
    }

    public void a(long j) {
        this.f242a = j;
    }

    public void b(long j) {
        this.f244b = j;
    }
}
