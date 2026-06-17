package com.bytedance.apm6.util.timetask;

/* loaded from: classes.dex */
public abstract class a implements Runnable {
    private long a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private long f3724c;

    public a(long j, long j2) {
        this.a = j;
        this.f3724c = j2;
        if (j2 > 0) {
            this.b = true;
        }
    }

    public long a() {
        return this.a;
    }

    public final long b() {
        return this.f3724c;
    }

    public final boolean c() {
        return this.b;
    }

    public void d(long j, long j2) {
        this.a = j;
        this.f3724c = j2;
        if (j2 > 0) {
            this.b = true;
        }
    }
}
