package com.bytedance.apm6.hub;

import java.util.Objects;

/* loaded from: classes.dex */
final class o extends com.bytedance.apm6.util.timetask.a {
    o(long j) {
        super(j, 0L);
    }

    @Override // java.lang.Runnable
    public void run() {
        e.b.b.k.b.d(e.b.b.e.a.f.c());
        e.b.b.j.c.e().f();
        e.b.b.i.a.a().b();
        if (e.b.b.h.c.a.y()) {
            e.b.b.f.a.d().e();
        }
        com.bytedance.apm6.cpu.collect.a.d().e();
        Objects.requireNonNull(com.bytedance.apm.j.a());
        e.b.b.m.c.a(com.bytedance.apm.config.f.class);
        if (e.b.b.h.c.a.y()) {
            com.bytedance.apm.launch.d.a();
            com.bytedance.apm.g.J(com.bytedance.apm.G.c.d());
        }
        if (e.b.b.h.c.a.y()) {
            e.b.b.g.a.f().g();
        }
    }
}
