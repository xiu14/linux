package com.bytedance.apm6.cpu.b;

/* loaded from: classes.dex */
public class a {
    private boolean a = false;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private long f3648c = 120;

    /* renamed from: d, reason: collision with root package name */
    private long f3649d = 600;

    /* renamed from: e, reason: collision with root package name */
    private long f3650e = 1200;

    /* renamed from: f, reason: collision with root package name */
    private long f3651f = 120;

    /* renamed from: g, reason: collision with root package name */
    private long f3652g = 600;

    public long a() {
        return this.f3649d * 1000;
    }

    public long b() {
        return this.f3652g * 1000;
    }

    public long c() {
        return this.f3648c * 1000;
    }

    public long d() {
        return this.f3651f * 1000;
    }

    public long e() {
        return this.f3650e * 1000;
    }

    public boolean f() {
        return this.b;
    }

    public boolean g() {
        return this.a;
    }

    public void h(long j) {
        this.f3649d = j;
    }

    public void i(long j) {
        this.f3652g = j;
    }

    public void j(boolean z) {
        this.b = z;
    }

    public void k(boolean z) {
        this.a = z;
    }

    public void l(long j) {
        this.f3648c = j;
    }

    public void m(long j) {
        this.f3651f = j;
    }

    public void n(long j) {
        this.f3650e = j;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CpuConfig{mEnableUpload=");
        M.append(this.a);
        M.append(", mCollectAllProcess=");
        M.append(this.b);
        M.append(", mFrontCollectInterval=");
        M.append(this.f3648c);
        M.append(", mBackCollectInterval=");
        M.append(this.f3649d);
        M.append(", mMonitorInterval=");
        M.append(this.f3650e);
        M.append(", mFrontThreadCollectInterval=");
        M.append(this.f3651f);
        M.append(", mBackThreadCollectInterval=");
        return e.a.a.a.a.E(M, this.f3652g, '}');
    }
}
