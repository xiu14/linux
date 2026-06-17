package com.huawei.hms.hatool;

import java.util.Map;

/* loaded from: classes2.dex */
public class s0 {
    private boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private String f7392c;

    /* renamed from: d, reason: collision with root package name */
    private String f7393d;

    /* renamed from: e, reason: collision with root package name */
    private String f7394e;

    /* renamed from: f, reason: collision with root package name */
    private String f7395f;

    /* renamed from: g, reason: collision with root package name */
    private j0 f7396g;
    private String h;
    private Map<String, String> i;
    private String j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private String p;
    private long q;

    public s0() {
        this.f7394e = "";
        this.f7395f = "";
        this.f7396g = new j0();
        this.h = "";
        this.j = "";
        this.k = 10;
        this.l = 7;
        this.m = true;
        this.n = true;
        this.o = false;
        this.q = 0L;
    }

    public s0(s0 s0Var) {
        this.f7394e = "";
        this.f7395f = "";
        this.f7396g = new j0();
        this.h = "";
        this.j = "";
        this.k = 10;
        this.l = 7;
        this.m = true;
        this.n = true;
        this.o = false;
        this.q = 0L;
        this.f7396g = s0Var.f7396g;
        b(s0Var.a);
        a(s0Var.f7392c);
        b(s0Var.f7393d);
        e(s0Var.f7394e);
        g(s0Var.f7395f);
        d(s0Var.h);
        f(s0Var.j);
        c(s0Var.b);
        a(s0Var.k);
        b(s0Var.l);
        d(s0Var.m);
        a(s0Var.n);
        e(s0Var.o);
        a(s0Var.i);
        c(s0Var.p);
        a(s0Var.q);
    }

    public void a(int i) {
        this.k = i;
    }

    public void a(long j) {
        this.q = j;
    }

    public void a(String str) {
        this.f7392c = str;
    }

    public void a(Map<String, String> map) {
        this.i = map;
    }

    public void a(boolean z) {
        this.n = z;
    }

    public boolean a() {
        return this.n;
    }

    public int b() {
        return this.k;
    }

    public void b(int i) {
        this.l = i;
    }

    public void b(String str) {
        this.f7393d = str;
    }

    public void b(boolean z) {
        this.a = z;
    }

    public void c(String str) {
        this.p = str;
    }

    public void c(boolean z) {
        this.b = z;
    }

    public boolean c() {
        return this.a;
    }

    public int d() {
        return this.l;
    }

    public void d(String str) {
        this.h = str;
    }

    public void d(boolean z) {
        this.m = z;
    }

    public void e(String str) {
        this.f7394e = str;
    }

    public void e(boolean z) {
        this.o = z;
    }

    public boolean e() {
        return this.b;
    }

    public String f() {
        return this.f7392c;
    }

    public void f(String str) {
        this.j = str;
    }

    public void g(String str) {
        this.f7395f = str;
    }

    public boolean g() {
        return this.m;
    }

    public String h() {
        return this.f7393d;
    }

    public boolean i() {
        return this.o;
    }

    public j0 j() {
        return this.f7396g;
    }

    public Map<String, String> k() {
        return this.i;
    }

    public long l() {
        return this.q;
    }

    public String m() {
        return this.p;
    }

    public String n() {
        return this.h;
    }

    public String o() {
        return this.f7394e;
    }

    public String p() {
        return this.j;
    }

    public String q() {
        return this.f7395f;
    }
}
