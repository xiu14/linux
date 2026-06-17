package com.bytedance.apm.s.k;

import java.util.Objects;

/* loaded from: classes.dex */
public class f extends b {

    /* renamed from: e, reason: collision with root package name */
    private long f3506e;

    public f() {
        super("cpu_active_time");
        this.f3506e = 0L;
    }

    @Override // com.bytedance.apm.s.k.b
    protected void c(boolean z, boolean z2) {
        long a = com.bytedance.apm.util.b.a();
        long j = this.f3506e;
        if (j > 0 && z2) {
            long j2 = a - j;
            if (j2 > 0) {
                Objects.requireNonNull(com.bytedance.apm.s.a.B());
                h(z, j2, null);
            } else {
                com.bytedance.apm.y.a.b("APM-Battery", "CPU Value:" + j2);
            }
        }
        this.f3506e = a;
    }

    @Override // com.bytedance.apm.s.k.l
    public void e(com.bytedance.apm.s.j.b bVar, com.bytedance.apm.w.a aVar) {
        if (aVar.i()) {
            bVar.l((long) ((aVar.a() / com.bytedance.apm.util.b.e(100L)) * 1000.0d));
        } else {
            bVar.b((long) ((aVar.a() / com.bytedance.apm.util.b.e(100L)) * 1000.0d));
        }
    }
}
