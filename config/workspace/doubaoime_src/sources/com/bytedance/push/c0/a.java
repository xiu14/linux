package com.bytedance.push.c0;

/* loaded from: classes2.dex */
final class a {
    public long a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public long f5629c;

    /* renamed from: d, reason: collision with root package name */
    public long f5630d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5631e;

    /* renamed from: f, reason: collision with root package name */
    public String f5632f;

    /* renamed from: g, reason: collision with root package name */
    public long f5633g;
    public boolean h;
    public boolean i;
    public boolean j;

    a() {
    }

    public long a() {
        return this.f5630d - this.a;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AliveData{startElapsedRealTime=");
        M.append(this.a);
        M.append(", startTs=");
        M.append(this.b);
        M.append(", endTs=");
        M.append(this.f5629c);
        M.append(", endElapsedRealTime=");
        M.append(this.f5630d);
        M.append(", isBackground=");
        M.append(this.f5631e);
        M.append(", session='");
        e.a.a.a.a.G0(M, this.f5632f, '\'', ", delay=");
        M.append(this.f5633g);
        M.append(", isForeground=");
        M.append(this.h);
        M.append(", isScreenOn=");
        M.append(this.i);
        M.append(", isUsbCharging=");
        return e.a.a.a.a.L(M, this.j, '}');
    }
}
