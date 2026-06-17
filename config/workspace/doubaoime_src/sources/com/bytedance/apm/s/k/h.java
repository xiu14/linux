package com.bytedance.apm.s.k;

import java.util.Objects;

/* loaded from: classes.dex */
public class h extends b {

    /* renamed from: e, reason: collision with root package name */
    private volatile long f3507e;

    /* renamed from: f, reason: collision with root package name */
    private volatile long f3508f;

    /* renamed from: g, reason: collision with root package name */
    private com.bytedance.apm.B.l.j f3509g;

    public h() {
        super("traffic_packets");
        this.f3507e = -1L;
        this.f3508f = -1L;
        this.f3509g = com.bytedance.apm.B.l.j.e();
    }

    @Override // com.bytedance.apm.s.k.b
    protected void c(boolean z, boolean z2) {
        if (g()) {
            try {
                long d2 = this.f3509g.d();
                long b = this.f3509g.b();
                if (this.f3508f > -1 && this.f3507e > -1 && z2) {
                    Objects.requireNonNull(com.bytedance.apm.s.a.B());
                    h(true, d2 - this.f3507e, null);
                    h(false, b - this.f3508f, null);
                }
                this.f3507e = d2;
                this.f3508f = b;
            } catch (Throwable th) {
                if (com.bytedance.apm.g.B()) {
                    StringBuilder M = e.a.a.a.a.M("handleTrafficMonitor error: ");
                    M.append(th.getCause());
                    com.bytedance.apm.y.d.d("<monitor><battery>", M.toString());
                }
                com.bytedance.services.apm.api.a.e(th, "BatteryPacketsStatsImpl");
            }
        }
    }

    @Override // com.bytedance.apm.s.k.l
    public void e(com.bytedance.apm.s.j.b bVar, com.bytedance.apm.w.a aVar) {
        if (aVar.i()) {
            bVar.q(aVar.a());
        } else {
            bVar.g(aVar.a());
        }
    }
}
