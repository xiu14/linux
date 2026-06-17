package com.bytedance.apm6.cpu.exception;

import java.util.Objects;

/* loaded from: classes.dex */
public class e {
    private int a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private long f3689c;

    /* renamed from: d, reason: collision with root package name */
    private double f3690d;

    /* renamed from: e, reason: collision with root package name */
    private String f3691e;

    /* renamed from: f, reason: collision with root package name */
    private String f3692f;

    /* renamed from: g, reason: collision with root package name */
    private long f3693g;
    private int h;

    public double a() {
        return this.f3690d;
    }

    public int b() {
        return this.h;
    }

    public long c() {
        return this.f3693g;
    }

    public String d() {
        return this.f3692f;
    }

    public long e() {
        return this.f3689c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b.equals(eVar.b);
    }

    public int f() {
        return this.a;
    }

    public String g() {
        return this.b;
    }

    public String h() {
        return this.f3691e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public void i(double d2) {
        this.f3690d = d2;
    }

    public void j(int i) {
        this.h = i;
    }

    public void k(long j) {
        this.f3693g = j;
    }

    public void l(String str) {
        this.f3692f = str;
    }

    public void m(long j) {
        this.f3689c = j;
    }

    public void n(int i) {
        this.a = i;
    }

    public void o(String str) {
        this.b = str;
    }

    public void p(String str) {
        this.f3691e = str;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ThreadExceptionItem{threadId=");
        M.append(this.a);
        M.append(", threadName='");
        e.a.a.a.a.G0(M, this.b, '\'', ", threadCpuTime=");
        M.append(this.f3689c);
        M.append(", processCpuTime=");
        M.append(this.f3693g);
        M.append(", cpuUsage=");
        M.append(this.f3690d);
        M.append(", weight=");
        M.append(this.f3691e);
        M.append(", nice=");
        return e.a.a.a.a.C(M, this.h, '}');
    }
}
