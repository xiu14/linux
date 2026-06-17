package com.ss.alive.monitor.h;

/* loaded from: classes2.dex */
public class b {
    public long a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public long f8255c;

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ProcessStartDbInfo{id=");
        M.append(this.a);
        M.append(", dataJson='");
        e.a.a.a.a.G0(M, this.b, '\'', ", endTime=");
        return e.a.a.a.a.E(M, this.f8255c, '}');
    }
}
