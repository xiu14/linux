package com.xiaomi.push;

/* loaded from: classes2.dex */
public class bo {
    private long a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private long f8998c;

    /* renamed from: d, reason: collision with root package name */
    private long f8999d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9000e = System.currentTimeMillis();

    public int a() {
        return com.xiaomi.push.service.ao.a() ? 1 : 0;
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.f8998c;
    }

    public long d() {
        return this.f8999d;
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m135a() {
        return this.a;
    }

    public void b(long j) {
        this.b += j;
    }

    public void c(long j) {
        this.f8999d += j;
    }

    public void a(long j) {
        this.a = j;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m136a() {
        this.f8998c++;
    }
}
