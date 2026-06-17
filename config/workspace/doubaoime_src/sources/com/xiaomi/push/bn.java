package com.xiaomi.push;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class bn<T> {
    private final long a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private long f8993c;

    /* renamed from: d, reason: collision with root package name */
    private long f8994d;

    /* renamed from: e, reason: collision with root package name */
    private long f8995e;

    /* renamed from: f, reason: collision with root package name */
    private long f8996f;

    /* renamed from: g, reason: collision with root package name */
    private long f8997g;
    private long h;
    private final long i;

    public bn(long j, long j2) {
        this.i = j * 1000000;
        this.a = j2;
    }

    public long a() {
        return this.f8993c;
    }

    public long b() {
        return this.f8994d;
    }

    public long c() {
        long j = this.f8996f;
        if (j > 0) {
            long j2 = this.f8995e;
            if (j2 > 0) {
                return j / j2;
            }
        }
        return 0L;
    }

    public long d() {
        long j = this.h;
        long j2 = this.f8997g;
        if (j > j2) {
            return j - j2;
        }
        return 0L;
    }

    public T a(Callable<T> callable) {
        long j = this.b;
        long j2 = this.i;
        if (j > j2) {
            long j3 = (j / j2) * this.a;
            this.b = 0L;
            if (j3 > 0) {
                try {
                    Thread.sleep(j3);
                } catch (Exception unused) {
                }
            }
        }
        long nanoTime = System.nanoTime();
        if (this.f8997g <= 0) {
            this.f8997g = nanoTime;
        }
        T t = null;
        try {
            t = callable.call();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        long nanoTime2 = System.nanoTime() - nanoTime;
        this.h = System.nanoTime();
        this.f8995e++;
        if (this.f8993c < nanoTime2) {
            this.f8993c = nanoTime2;
        }
        if (nanoTime2 > 0) {
            this.f8996f += nanoTime2;
            long j4 = this.f8994d;
            if (j4 == 0 || j4 > nanoTime2) {
                this.f8994d = nanoTime2;
            }
        }
        this.b = Math.max(nanoTime2, 0L) + this.b;
        return t;
    }
}
