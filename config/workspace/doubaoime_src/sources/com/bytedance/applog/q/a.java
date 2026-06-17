package com.bytedance.applog.q;

import com.bytedance.applog.monitor.v3.StatsCountKeys;
import com.bytedance.common.utility.NetworkUtils;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: e, reason: collision with root package name */
    static final long[] f3870e = {180000, 180000, 360000, 360000, 540000, 540000, 720000, 720000};
    protected final c a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    volatile boolean f3871c;

    /* renamed from: d, reason: collision with root package name */
    private long f3872d;

    public a(c cVar) {
        this.a = cVar;
    }

    private long b() {
        long h = h();
        if (g() && !NetworkUtils.i(this.a.l())) {
            d().I().b("checkWorkTime {} network not available", e());
            this.a.h().K().i(StatsCountKeys.NO_NETWORK_COUNT, 1);
        } else if (this.f3871c) {
            this.f3872d = 0L;
            this.f3871c = false;
            h = 0;
        } else {
            int i = this.b;
            if (i > 0) {
                long[] f2 = f();
                h = f2[(i - 1) % f2.length];
            }
        }
        return this.f3872d + h;
    }

    final long a(int i) {
        long b = b();
        if (b <= System.currentTimeMillis()) {
            synchronized (this) {
                try {
                    boolean c2 = c(i);
                    this.f3872d = System.currentTimeMillis();
                    if (c2) {
                        this.b = 0;
                    } else {
                        this.b++;
                    }
                    d().I().h(e() + " worked: {}", Boolean.valueOf(c2));
                } catch (Throwable th) {
                    try {
                        d().I().i("work failed", th, new Object[0]);
                        this.f3872d = System.currentTimeMillis();
                        this.b++;
                        d().I().h(e() + " worked: {}", Boolean.FALSE);
                    } catch (Throwable th2) {
                        this.f3872d = System.currentTimeMillis();
                        this.b++;
                        d().I().h(e() + " worked: {}", Boolean.FALSE);
                        throw th2;
                    }
                }
                b = b();
            }
        }
        return b;
    }

    protected abstract boolean c(int i) throws JSONException;

    protected com.bytedance.applog.c d() {
        return this.a.h();
    }

    protected abstract String e();

    protected abstract long[] f();

    protected abstract boolean g();

    protected abstract long h();

    public a(c cVar, long j) {
        this.a = cVar;
        this.f3872d = j;
    }
}
