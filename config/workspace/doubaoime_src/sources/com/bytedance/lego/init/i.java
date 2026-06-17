package com.bytedance.lego.init;

import com.bytedance.lego.init.monitor.InitMonitor;

/* loaded from: classes.dex */
final class i extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    public static final i a = new i();

    i() {
        super(0);
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        try {
            com.bytedance.lego.init.z.a.a.a("IdleTaskDispatcher", "asyncSendMonitorData");
            com.bytedance.lego.init.monitor.c.f5321e.f();
        } catch (Throwable th) {
            InitMonitor.INSTANCE.ensureNotReachHere(th, "IDLE_TASK_MONITOR_EXCEPTION");
        }
        return kotlin.o.a;
    }
}
