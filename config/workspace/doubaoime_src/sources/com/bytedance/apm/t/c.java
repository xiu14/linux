package com.bytedance.apm.t;

import org.json.JSONObject;

/* loaded from: classes.dex */
class c {
    String b;

    /* renamed from: g, reason: collision with root package name */
    long f3532g;
    long i;
    boolean l;
    long m;
    long n;
    StackTraceElement[] o;
    StackTraceElement[] p;
    String q;
    String r;
    String s;
    JSONObject t;
    JSONObject u;
    JSONObject v;
    JSONObject w;
    boolean a = true;

    /* renamed from: c, reason: collision with root package name */
    boolean f3528c = false;

    /* renamed from: d, reason: collision with root package name */
    boolean f3529d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f3530e = false;

    /* renamed from: f, reason: collision with root package name */
    boolean f3531f = false;
    long h = -1;
    boolean j = false;
    boolean k = false;

    c(long j, String str) {
        this.f3532g = -1L;
        this.f3532g = j;
        this.b = str;
    }

    c a() {
        c cVar = new c(this.f3532g, this.b);
        cVar.h = this.h;
        cVar.a = this.a;
        cVar.f3528c = this.f3528c;
        cVar.f3529d = this.f3529d;
        cVar.f3530e = this.f3530e;
        cVar.f3531f = this.f3531f;
        cVar.i = this.i;
        cVar.j = this.j;
        cVar.k = this.k;
        cVar.m = this.m;
        cVar.n = this.n;
        cVar.o = this.o;
        cVar.p = this.p;
        cVar.q = this.q;
        cVar.r = this.r;
        cVar.s = this.s;
        cVar.t = this.t;
        cVar.u = this.u;
        cVar.v = this.v;
        cVar.w = this.w;
        cVar.l = this.l;
        return cVar;
    }

    void b() {
        this.a = true;
        this.f3528c = false;
        this.f3529d = false;
        this.f3530e = false;
        this.f3531f = false;
        this.i = 0L;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = 0L;
        this.n = 0L;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
    }
}
