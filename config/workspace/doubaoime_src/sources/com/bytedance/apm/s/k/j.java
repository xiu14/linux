package com.bytedance.apm.s.k;

import java.util.Objects;

/* loaded from: classes.dex */
public class j extends b {

    /* renamed from: e, reason: collision with root package name */
    private volatile long f3513e;

    /* renamed from: f, reason: collision with root package name */
    private volatile long f3514f;

    /* renamed from: g, reason: collision with root package name */
    private com.bytedance.apm.B.l.j f3515g;

    public j() {
        super("traffic");
        this.f3513e = -1L;
        this.f3514f = -1L;
        this.f3515g = com.bytedance.apm.B.l.j.e();
    }

    @Override // com.bytedance.apm.s.k.b
    protected void c(boolean z, boolean z2) {
        if (g()) {
            try {
                long c2 = this.f3515g.c();
                long a = this.f3515g.a();
                if (this.f3514f > -1 && this.f3513e > -1 && z2) {
                    Objects.requireNonNull(com.bytedance.apm.s.a.B());
                    h(true, c2 - this.f3513e, null);
                    h(false, a - this.f3514f, null);
                }
                this.f3513e = c2;
                this.f3514f = a;
            } catch (Throwable th) {
                if (com.bytedance.apm.g.B()) {
                    StringBuilder M = e.a.a.a.a.M("handleTrafficMonitor error: ");
                    M.append(th.getCause());
                    com.bytedance.apm.y.d.d("<monitor><battery>", M.toString());
                }
                com.bytedance.services.apm.api.a.e(th, "BatteryTrafficStatsImpl");
            }
        }
    }

    @Override // com.bytedance.apm.s.k.l
    public void e(com.bytedance.apm.s.j.b bVar, com.bytedance.apm.w.a aVar) {
        if (aVar.i()) {
            bVar.p(aVar.a());
        } else {
            bVar.f(aVar.a());
        }
    }
}
