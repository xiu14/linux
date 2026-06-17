package com.bytedance.apm6.hub;

import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.services.apm.api.IActivityLifeManager;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.IMonitorLogManager;
import java.util.Objects;

/* loaded from: classes.dex */
public class k {
    private static volatile boolean a = false;

    static class a implements Runnable {
        final /* synthetic */ y a;

        a(y yVar) {
            this.a = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            y yVar = this.a;
            e.b.b.m.c.b(IHttpService.class, new q(yVar));
            e.b.b.m.c.b(e.b.b.e.a.h.b.class, new r(yVar));
            e.b.b.m.c.b(e.b.b.d.b.b.class, new s(yVar));
            e.b.b.m.c.b(com.bytedance.apm6.cpu.b.b.class, new t(yVar));
            e.b.b.m.c.b(com.bytedance.apm.config.f.class, new u(yVar));
            e.b.b.m.c.b(e.b.b.m.g.a.class, new v());
            e.b.b.m.c.b(com.bytedance.services.apm.api.e.class, new w(yVar));
            e.b.b.m.c.b(e.b.b.m.e.a.class, new x(yVar));
            e.b.b.m.c.b(e.b.b.m.h.b.class, new com.bytedance.apm6.hub.a());
            e.b.b.m.c.b(com.bytedance.services.apm.api.i.class, new b());
            e.b.b.m.c.b(com.bytedance.services.apm.api.j.class, new c());
            new e.b.b.h.a();
            e.b.b.m.c.b(e.b.b.j.g.b.class, new d(yVar));
            e.b.b.m.c.b(e.b.b.i.c.class, new e(yVar));
            e.b.b.m.c.b(e.b.b.j.a.class, new f(yVar));
            e.b.b.m.c.b(e.b.b.m.d.a.class, new g(yVar));
            e.b.b.m.c.b(e.b.b.f.d.b.class, new h());
            e.b.b.m.c.b(e.b.b.m.h.a.class, new i());
            e.b.b.m.c.b(e.b.b.e.a.g.class, new j(yVar));
            e.b.b.m.c.b(e.b.b.g.c.b.class, new l());
            com.bytedance.news.common.service.manager.c.c(IActivityLifeManager.class, new m());
            com.bytedance.news.common.service.manager.c.c(IMonitorLogManager.class, new n());
            com.bytedance.apm6.hub.z.j.a.g().h();
            com.bytedance.apm6.util.timetask.b a = com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT);
            Objects.requireNonNull(yVar);
            a.c(new o(0L));
            e.b.b.e.a.k.c.g().i(new p());
        }
    }

    public static synchronized Runnable a(y yVar) {
        synchronized (k.class) {
            if (a) {
                return null;
            }
            a = true;
            b(yVar);
            return new a(yVar);
        }
    }

    private static void b(y yVar) {
        e.b.b.h.c.a.z(yVar);
        e.b.b.h.c.a.D(System.currentTimeMillis());
        e.b.b.h.c.a.B(System.currentTimeMillis());
        if (e.b.b.n.a.b()) {
            StringBuilder M = e.a.a.a.a.M("APM init start in process ");
            M.append(yVar.p());
            e.b.b.n.g.b.a("APM-Hub", M.toString());
        }
        e.b.b.n.g.b.e(new e.b.b.h.d.c());
        e.b.b.m.c.c(e.b.b.m.g.a.class, new e.b.b.h.a());
    }
}
