package com.bytedance.retrofit2;

import android.os.SystemClock;
import android.util.Log;
import com.bytedance.retrofit2.I;
import com.bytedance.retrofit2.S.a;
import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.util.List;

/* renamed from: com.bytedance.retrofit2.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0703g<T> implements com.bytedance.retrofit2.T.b, q, r {
    private final G<T> a;
    private volatile com.bytedance.retrofit2.client.d b;

    /* renamed from: c, reason: collision with root package name */
    private Request f6015c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f6016d;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f6017e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f6018f;

    /* renamed from: g, reason: collision with root package name */
    private volatile long f6019g;

    public C0703g(G<T> g2) {
        this.a = g2;
    }

    @Override // com.bytedance.retrofit2.S.a
    public N a(a.InterfaceC0308a interfaceC0308a) throws Exception {
        com.bytedance.retrofit2.client.c a;
        Request d2 = ((com.bytedance.retrofit2.S.b) interfaceC0308a).d();
        this.f6015c = d2;
        RetrofitMetrics metrics = d2.getMetrics();
        metrics.E0.f5964e.b++;
        metrics.q = SystemClock.uptimeMillis();
        this.f6015c.getMetrics().j0(this.f6015c.getPriorityLevel());
        this.f6015c.getMetrics().n0 = this.f6015c.getRequestPriorityLevel();
        synchronized (this) {
            if (this.f6018f) {
                throw new IllegalStateException("Already executed.");
            }
            this.f6018f = true;
        }
        Throwable th = this.f6017e;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            throw new Exception(this.f6017e);
        }
        com.bytedance.retrofit2.Q.a aVar = this.a.m;
        com.bytedance.retrofit2.client.c b = aVar != null ? aVar.b(this.f6015c) : null;
        if (b != null) {
            this.f6015c.getMetrics().S();
            this.f6015c.getMetrics().E();
        }
        if (b == null) {
            try {
                this.b = this.a.b.get().a(this.f6015c);
                if (this.f6019g > 0) {
                    this.b.setThrottleNetSpeed(this.f6019g);
                }
                if (this.f6016d) {
                    this.b.cancel();
                }
                List<com.bytedance.retrofit2.client.b> headers = this.f6015c.headers("content-encoding");
                if (headers != null && headers.size() > 0) {
                    this.f6015c.getMetrics().p0 = this.f6015c.headers("content-encoding").get(0).b();
                }
                try {
                    this.f6015c.getMetrics().S();
                    this.f6015c.getMetrics().E();
                    RetrofitMetrics metrics2 = this.f6015c.getMetrics();
                    metrics2.E0.a.p = System.nanoTime();
                    metrics2.f5989J = com.bytedance.feedbackerlib.a.p0(metrics2.E0.a.p);
                    metrics2.r = metrics2.a(metrics2.E0.a.p);
                    b = this.b.execute();
                    this.f6015c.getMetrics().v();
                    this.f6015c.getMetrics().F();
                    this.f6015c.getMetrics().V(this);
                    this.f6015c.getMetrics().E0.f5964e.a = true;
                    com.bytedance.retrofit2.Q.a aVar2 = this.a.m;
                    if (aVar2 != null && (a = aVar2.a(this.f6015c, b)) != null) {
                        b = a;
                    }
                } catch (Throwable th2) {
                    this.f6015c.getMetrics().v();
                    this.f6015c.getMetrics().F();
                    this.f6015c.getMetrics().V(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
                this.f6017e = e;
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                this.f6017e = e;
                throw e;
            } catch (Throwable th3) {
                this.f6017e = th3;
                if (th3 instanceof Exception) {
                    throw th3;
                }
                throw new Exception(th3);
            }
        }
        List<com.bytedance.retrofit2.client.b> i = b.i("content-encoding");
        if (i != null) {
            this.f6015c.getMetrics().o0 = i.get(0).b();
        }
        RetrofitMetrics metrics3 = this.f6015c.getMetrics();
        com.bytedance.retrofit2.mime.h a2 = b.a();
        int f2 = b.f();
        if (f2 < 200 || f2 >= 300) {
            return N.c(a2, b);
        }
        if (f2 == 204 || f2 == 205) {
            return N.j(null, b);
        }
        if (metrics3 != null) {
            try {
                metrics3.E0.f5962c.c();
                metrics3.L = SystemClock.uptimeMillis();
            } catch (Throwable th4) {
                if (metrics3 != null) {
                    metrics3.i0 = false;
                }
                Log.i("ToResponseLog", "toResponse failed");
                throw th4;
            }
        }
        try {
            return N.j(this.a.o.a(a2), b);
        } finally {
            if (metrics3 != null) {
                I.c cVar = metrics3.E0.f5962c;
                cVar.j = cVar.a();
                metrics3.M = SystemClock.uptimeMillis();
            }
        }
    }

    public void b() {
        this.f6016d = true;
        if (this.b != null) {
            this.b.cancel();
        }
    }

    public void c(boolean z) {
        this.f6016d = true;
        if (this.b != null) {
            this.b.cancel();
        }
        this.f6016d = z;
    }

    public boolean d() {
        return this.f6016d;
    }

    @Override // com.bytedance.retrofit2.q
    public void doCollect() {
    }

    public synchronized boolean e() {
        return this.f6018f;
    }

    public Request f() {
        return this.f6015c;
    }

    public synchronized void g() {
        this.f6018f = false;
    }

    @Override // com.bytedance.retrofit2.r
    public Object getRequestInfo() {
        if (this.b instanceof r) {
            return ((r) this.b).getRequestInfo();
        }
        return null;
    }

    public boolean h(long j) {
        this.f6019g = j;
        if (this.b != null) {
            return this.b.setThrottleNetSpeed(j);
        }
        return false;
    }
}
