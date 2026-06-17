package com.bytedance.apm6.cpu.collect;

/* loaded from: classes.dex */
public class CpuCacheItem {
    private CpuDataType a;
    private double b;

    /* renamed from: c, reason: collision with root package name */
    private double f3658c;

    /* renamed from: d, reason: collision with root package name */
    private double f3659d;

    /* renamed from: e, reason: collision with root package name */
    private double f3660e;

    /* renamed from: f, reason: collision with root package name */
    private String f3661f;

    /* renamed from: g, reason: collision with root package name */
    private long f3662g;
    private int h;

    public enum CpuDataType {
        MIX,
        FRONT,
        BACK
    }

    public CpuCacheItem(CpuDataType cpuDataType, long j) {
        this.h = 0;
        this.a = cpuDataType;
        this.f3662g = j;
        this.h = 0;
    }

    public void a(double d2) {
        if (d2 < 0.0d) {
            return;
        }
        this.b += d2;
    }

    public void b(double d2) {
        if (d2 < 0.0d) {
            return;
        }
        this.f3659d += d2;
    }

    public void c() {
        this.h++;
    }

    public long d() {
        return this.f3662g;
    }

    public double e() {
        return this.f3659d;
    }

    public double f() {
        return this.f3660e;
    }

    public double g() {
        return this.f3658c;
    }

    public double h() {
        return this.b;
    }

    public String i() {
        return this.f3661f;
    }

    public int j() {
        return this.h;
    }

    public CpuCacheItem k(String str) {
        this.f3661f = str;
        return this;
    }

    public void l(double d2) {
        if (this.f3658c < d2) {
            this.f3658c = d2;
        }
    }

    public void m(double d2) {
        if (this.f3660e < d2) {
            this.f3660e = d2;
        }
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CpuCacheItem{type=");
        M.append(this.a);
        M.append(", metricRate=");
        M.append(this.b);
        M.append(", metricMaxRate=");
        M.append(this.f3658c);
        M.append(", metricCpuStats=");
        M.append(this.f3659d);
        M.append(", metricMaxCpuStats=");
        M.append(this.f3660e);
        M.append(", sceneString='");
        e.a.a.a.a.G0(M, this.f3661f, '\'', ", firstTs=");
        M.append(this.f3662g);
        M.append(", times=");
        return e.a.a.a.a.C(M, this.h, '}');
    }
}
