package com.bytedance.apm.t;

import com.bytedance.monitor.collector.m;
import java.util.Objects;

/* loaded from: classes.dex */
class k implements Runnable {
    final /* synthetic */ c a;
    final /* synthetic */ j b;

    k(j jVar, c cVar) {
        this.b = jVar;
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        c cVar = this.a;
        long j3 = cVar.h - cVar.f3532g;
        j = this.b.f3540d;
        if (j3 > j && com.bytedance.apm.D.c.d("serious_block_monitor")) {
            c cVar2 = this.b.j;
            com.bytedance.monitor.collector.j h = com.bytedance.monitor.collector.j.h();
            c cVar3 = this.a;
            cVar2.w = h.d(cVar3.f3532g, cVar3.h);
        }
        boolean z4 = false;
        Objects.requireNonNull(this.a);
        c cVar4 = this.a;
        if (cVar4.q == null || cVar4.l) {
            cVar4.q = "Invalid Stack\n";
        }
        long j4 = cVar4.h - cVar4.f3532g;
        j2 = this.b.f3540d;
        if (j4 > j2 && !this.a.j) {
            z3 = this.b.f3541e;
            if (z3) {
                this.a.v = j.j(this.b);
                this.a.u = com.bytedance.apm.B.c.b().a();
                this.a.j = true;
                z4 = true;
            }
        }
        try {
            String a = m.a(this.a.b);
            j jVar = this.b;
            c cVar5 = this.a;
            j.m(jVar, cVar5.f3529d, cVar5, a);
            if (this.a.j) {
                z = this.b.b;
                if (z) {
                    z2 = this.b.f3541e;
                    if (z2) {
                        j.d(this.b, this.a, a, z4);
                    }
                }
            }
            j.e(this.b, this.a, a);
        } catch (Exception unused) {
        }
    }
}
