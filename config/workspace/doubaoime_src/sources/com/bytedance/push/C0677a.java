package com.bytedance.push;

/* renamed from: com.bytedance.push.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0677a {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private String f5607c;

    /* renamed from: d, reason: collision with root package name */
    private int f5608d;

    /* renamed from: e, reason: collision with root package name */
    private String f5609e;

    /* renamed from: f, reason: collision with root package name */
    private String f5610f;

    public int a() {
        return this.a;
    }

    public String b() {
        return this.f5610f;
    }

    public String c() {
        return this.f5609e;
    }

    public int d() {
        return this.f5608d;
    }

    public int e() {
        return this.b;
    }

    public String f() {
        return this.f5607c;
    }

    public void g(int i) {
        this.a = i;
    }

    public void h(String str) {
        this.f5610f = str;
    }

    public void i(String str) {
        this.f5609e = str;
    }

    public void j(int i) {
        this.f5608d = i;
    }

    public void k(int i) {
        this.b = i;
    }

    public void l(String str) {
        this.f5607c = str;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AppInfo{aid=");
        M.append(this.a);
        M.append(", versionCode=");
        M.append(this.b);
        M.append(", versionName='");
        e.a.a.a.a.G0(M, this.f5607c, '\'', ", updateVersionCode=");
        M.append(this.f5608d);
        M.append(", channel='");
        e.a.a.a.a.G0(M, this.f5609e, '\'', ", appName='");
        return e.a.a.a.a.H(M, this.f5610f, '\'', '}');
    }
}
