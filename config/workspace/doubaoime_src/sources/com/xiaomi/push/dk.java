package com.xiaomi.push;

import java.util.Map;

/* loaded from: classes2.dex */
public class dk {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private long f258a;

    /* renamed from: a, reason: collision with other field name */
    private Map<String, Integer> f259a;
    private int b;

    /* renamed from: b, reason: collision with other field name */
    private long f260b;

    /* renamed from: c, reason: collision with root package name */
    private int f9035c;

    /* renamed from: c, reason: collision with other field name */
    private long f261c;

    /* renamed from: d, reason: collision with root package name */
    private int f9036d;

    /* renamed from: d, reason: collision with other field name */
    private long f262d;

    /* renamed from: e, reason: collision with root package name */
    private int f9037e;

    /* renamed from: f, reason: collision with root package name */
    private int f9038f;

    /* renamed from: g, reason: collision with root package name */
    private int f9039g;
    private int h;
    private int i;
    private int j;
    private int k;

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.f9035c;
    }

    public int d() {
        return this.f9036d;
    }

    public int e() {
        return this.f9037e;
    }

    public int f() {
        return this.f9038f;
    }

    public int g() {
        return this.f9039g;
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

    public int k() {
        return this.k;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("PowerStatsModel{offUpCount=");
        M.append(this.a);
        M.append(", offDownCount=");
        M.append(this.b);
        M.append(", offPingCount=");
        M.append(this.f9035c);
        M.append(", offPongCount=");
        M.append(this.f9036d);
        M.append(", offDuration=");
        M.append(this.f258a);
        M.append(", onUpCount=");
        M.append(this.f9037e);
        M.append(", onDownCount=");
        M.append(this.f9038f);
        M.append(", onPingCount=");
        M.append(this.f9039g);
        M.append(", onPongCount=");
        M.append(this.h);
        M.append(", onDuration=");
        M.append(this.f260b);
        M.append(", strategiesPingCount=");
        M.append(this.f259a);
        M.append(", startTime=");
        M.append(this.f261c);
        M.append(", endTime=");
        M.append(this.f262d);
        M.append(", xmsfVc=");
        M.append(this.i);
        M.append(", androidVc=");
        M.append(this.j);
        M.append(", pushBundleVc=");
        return e.a.a.a.a.C(M, this.k, '}');
    }

    public void a(int i) {
        this.a = i;
    }

    public void b(int i) {
        this.b = i;
    }

    public void c(int i) {
        this.f9035c = i;
    }

    public void d(int i) {
        this.f9036d = i;
    }

    public void e(int i) {
        this.f9037e = i;
    }

    public void f(int i) {
        this.f9038f = i;
    }

    public void g(int i) {
        this.f9039g = i;
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

    public void k(int i) {
        this.k = i;
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m244a() {
        return this.f258a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public long m246b() {
        return this.f260b;
    }

    /* renamed from: c, reason: collision with other method in class */
    public long m247c() {
        return this.f261c;
    }

    /* renamed from: d, reason: collision with other method in class */
    public long m248d() {
        return this.f262d;
    }

    public void a(long j) {
        this.f258a = j;
    }

    public void b(long j) {
        this.f260b = j;
    }

    public void c(long j) {
        this.f261c = j;
    }

    public void d(long j) {
        this.f262d = j;
    }

    /* renamed from: a, reason: collision with other method in class */
    public Map<String, Integer> m245a() {
        return this.f259a;
    }

    public void a(Map<String, Integer> map) {
        this.f259a = map;
    }
}
