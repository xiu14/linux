package com.bytedance.apm6.cpu.collect;

import com.bytedance.apm6.cpu.collect.a;

/* loaded from: classes.dex */
class c extends com.bytedance.apm6.util.timetask.a {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f3672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, long j, long j2) {
        super(j, j2);
        this.f3672d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        long j;
        if (com.bytedance.apm.g.B()) {
            StringBuilder M = e.a.a.a.a.M("run: ");
            j = this.f3672d.f3674d;
            M.append(j);
            e.b.b.n.g.b.a("APM-CPU", M.toString());
        }
        e.c(this.f3672d, a.c.a.f());
        z = this.f3672d.j;
        if (!z) {
            e.f(this.f3672d);
            e.g(this.f3672d);
        }
        this.f3672d.j = false;
    }
}
