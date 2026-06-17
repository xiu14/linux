package com.bytedance.frameworks.baselib.network.e;

/* loaded from: classes.dex */
final class a {
    private boolean a = false;
    private int b = -1;

    /* renamed from: c, reason: collision with root package name */
    private long f5059c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f5060d = -1;

    a() {
    }

    public int a() {
        return this.b;
    }

    public long b() {
        long j = this.f5059c;
        if (j < 0) {
            return -1L;
        }
        long j2 = this.f5060d;
        if (j2 < 0 || j > j2) {
            return -1L;
        }
        return j2 - j;
    }

    public boolean c() {
        return this.a;
    }

    public void d(long j) {
        this.f5060d = j;
    }

    public void e(boolean z) {
        this.a = z;
    }

    public void f(int i) {
        this.b = i;
    }

    public void g(long j) {
        this.f5059c = j;
    }
}
