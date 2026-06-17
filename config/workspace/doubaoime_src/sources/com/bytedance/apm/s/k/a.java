package com.bytedance.apm.s.k;

import android.os.SystemClock;
import com.bytedance.apm.s.k.m.b;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class a<T extends com.bytedance.apm.s.k.m.b> extends c<T> implements l {
    private static final Object j = new Object();

    /* renamed from: f, reason: collision with root package name */
    private volatile int f3493f;

    /* renamed from: g, reason: collision with root package name */
    private volatile long f3494g;
    private long h;
    private int i;

    /* renamed from: com.bytedance.apm.s.k.a$a, reason: collision with other inner class name */
    class RunnableC0124a implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ boolean b;

        RunnableC0124a(long j, boolean z) {
            this.a = j;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            long j = this.a;
            boolean z = this.b;
            Objects.requireNonNull(com.bytedance.apm.s.a.B());
            aVar.m(j, z, null);
        }
    }

    a(String str) {
        super(str);
        this.f3493f = 0;
    }

    private void l(boolean z) {
        synchronized (j) {
            if (this.f3493f > 0 && this.f3494g > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (z) {
                    long j2 = elapsedRealtime - this.f3494g;
                    boolean z2 = this.f3498c;
                    Objects.requireNonNull(com.bytedance.apm.s.a.B());
                    m(j2, z2, null);
                }
                this.f3494g = elapsedRealtime;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(long j2, boolean z, String str) {
        com.bytedance.apm.s.j.a.g().i(new com.bytedance.apm.w.a(z, System.currentTimeMillis(), h(), this.f3499d, j2, str));
    }

    @Override // com.bytedance.apm.s.k.l
    public void b(boolean z) {
        l(z);
        this.f3498c = false;
    }

    @Override // com.bytedance.apm.s.k.l
    public void d(boolean z, boolean z2) {
        l(z2);
        this.f3499d = z;
    }

    @Override // com.bytedance.apm.s.k.l
    public void f(boolean z) {
        l(z);
        this.f3498c = true;
    }

    @Override // com.bytedance.apm.s.k.c
    protected void g(T t, long j2, long j3) {
        this.i++;
        long j4 = t.a;
        if (j4 >= j2) {
            j2 = j4;
        }
        long j5 = t.b;
        if (j5 > 0 && j3 >= j5) {
            j3 = j5;
        }
        p(t, j3 - j4);
        long j6 = j3 - j2;
        if (j6 > 0) {
            this.h += j6;
        }
    }

    @Override // com.bytedance.apm.s.k.c
    protected void i(long j2, long j3, boolean z) {
        this.i = 0;
        this.h = 0L;
        l(z);
        super.i(j2, j3, z);
        long currentTimeMillis = System.currentTimeMillis();
        o((this.h / (currentTimeMillis - this.b)) * 60000.0d * 10.0d, (this.i / (currentTimeMillis - this.b)) * 60000.0d * 10.0d);
    }

    void k() {
        synchronized (j) {
            com.bytedance.apm.y.a.b("APM-Battery", "addHolderCount:" + this.f3493f + " type:" + h());
            this.f3493f = this.f3493f + 1;
            if (this.f3493f == 1) {
                this.f3494g = SystemClock.elapsedRealtime();
            }
        }
    }

    void n() {
        synchronized (j) {
            com.bytedance.apm.y.a.b("APM-Battery", "reduceHolderCount:" + this.f3493f + " type:" + h());
            if (this.f3493f == 0) {
                return;
            }
            this.f3493f--;
            if (this.f3493f == 0) {
                com.bytedance.apm.F.b.e().h(new RunnableC0124a(SystemClock.elapsedRealtime() - this.f3494g, this.f3498c));
                this.f3494g = -1L;
            }
        }
    }

    abstract void o(double d2, double d3);

    protected abstract void p(T t, long j2);
}
