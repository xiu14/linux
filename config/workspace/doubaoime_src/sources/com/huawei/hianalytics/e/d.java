package com.huawei.hianalytics.e;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class d {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7041c;

    /* renamed from: d, reason: collision with root package name */
    private String f7042d;

    /* renamed from: e, reason: collision with root package name */
    private String f7043e;

    /* renamed from: f, reason: collision with root package name */
    private String f7044f;

    /* renamed from: g, reason: collision with root package name */
    private String f7045g;
    private String i;
    private String j;
    private boolean k;
    private String l;
    private String m;
    private String n;
    private String o;
    private Context p;
    private int h = 5;
    private String[] q = new String[0];
    private boolean r = true;

    public int a() {
        return this.h;
    }

    public void a(int i) {
        this.h = i;
    }

    public void a(Context context) {
        this.p = context;
    }

    public void a(String str) {
        this.f7042d = str;
    }

    public void a(boolean z) {
        this.k = z;
    }

    public void a(String[] strArr) {
        if (strArr != null) {
            this.q = (String[]) strArr.clone();
        }
    }

    public int b() {
        return this.h;
    }

    public void b(String str) {
        this.o = str;
    }

    public void b(boolean z) {
        this.r = z;
    }

    public String c() {
        return this.f7042d;
    }

    public void c(String str) {
        this.a = str;
    }

    public String d() {
        return this.o;
    }

    public void d(String str) {
        this.b = str;
    }

    public String e() {
        return this.a;
    }

    public void e(String str) {
        this.f7041c = str;
    }

    public String f() {
        return this.b;
    }

    public void f(String str) {
        this.f7043e = str;
    }

    public String g() {
        return this.f7041c;
    }

    public void g(String str) {
        this.f7044f = str;
    }

    public String h() {
        return this.f7043e;
    }

    public void h(String str) {
        this.f7045g = str;
    }

    public String i() {
        return this.f7044f;
    }

    public void i(String str) {
        this.i = str;
    }

    public String j() {
        return TextUtils.isEmpty(this.f7045g) ? this.f7044f : this.f7045g;
    }

    public void j(String str) {
        this.j = str;
    }

    public String k() {
        return this.i;
    }

    public void k(String str) {
        this.l = str;
    }

    public String l() {
        return this.j;
    }

    public void l(String str) {
        this.m = str;
    }

    public void m(String str) {
        this.n = str;
    }

    public boolean m() {
        return this.k;
    }

    public String n() {
        return this.l;
    }

    public String o() {
        return this.m;
    }

    public String p() {
        return this.n;
    }

    public String[] q() {
        return (String[]) this.q.clone();
    }

    public boolean r() {
        return this.r;
    }

    public Context s() {
        return this.p;
    }
}
