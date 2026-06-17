package com.bytedance.apm.s.k;

import com.bytedance.apm.core.ActivityLifeObserver;

/* loaded from: classes.dex */
public abstract class b implements l {

    /* renamed from: c, reason: collision with root package name */
    private final String f3496c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f3497d = com.bytedance.apm.g.F();
    volatile boolean a = ActivityLifeObserver.getInstance().isForeground();
    volatile boolean b = com.bytedance.apm.s.l.a.e(com.bytedance.apm.g.h());

    b(String str) {
        this.f3496c = str;
    }

    @Override // com.bytedance.apm.s.k.l
    public void a(boolean z) {
        c(this.a, z);
    }

    @Override // com.bytedance.apm.s.k.l
    public void b(boolean z) {
        c(this.a, z);
        this.a = false;
    }

    protected abstract void c(boolean z, boolean z2);

    @Override // com.bytedance.apm.s.k.l
    public void d(boolean z, boolean z2) {
        c(this.a, z2);
        this.b = z;
    }

    @Override // com.bytedance.apm.s.k.l
    public void f(boolean z) {
        c(this.a, z);
        this.a = true;
    }

    protected boolean g() {
        return this.f3497d;
    }

    void h(boolean z, long j, String str) {
        if (j >= 0) {
            com.bytedance.apm.s.j.a.g().i(new com.bytedance.apm.w.a(z, System.currentTimeMillis(), this.f3496c, this.b, j, null));
            return;
        }
        if (com.bytedance.apm.g.B()) {
            StringBuilder Q = e.a.a.a.a.Q("AbsBatteryValueStats value error: ", j, " type:");
            Q.append(this.f3496c);
            com.bytedance.apm.y.d.d("<monitor><battery>", Q.toString());
        }
        StringBuilder Q2 = e.a.a.a.a.Q("AbsBatteryValueStats value error: ", j, " type:");
        Q2.append(this.f3496c);
        com.bytedance.apm.y.a.b("APM-Battery", Q2.toString());
    }
}
