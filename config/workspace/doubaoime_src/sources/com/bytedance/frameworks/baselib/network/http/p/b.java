package com.bytedance.frameworks.baselib.network.http.p;

/* loaded from: classes.dex */
public abstract class b implements Runnable {
    private final long a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private long f5229c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5230d;

    public b() {
        this.a = 0L;
        this.f5229c = 0L;
        this.f5230d = "";
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.f5229c;
    }

    public final String c() {
        return this.f5230d;
    }

    public final boolean d() {
        return this.b;
    }

    public b(long j, String str) {
        this.a = j;
        this.f5229c = 0L;
        this.f5230d = str;
    }
}
