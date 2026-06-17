package e.b.b.d;

import e.b.b.d.c.d;
import e.b.b.k.c;
import e.b.b.n.f.a;
import e.b.b.n.g.b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static volatile e.b.b.d.b.a a = null;
    private static volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static e.b.b.n.f.a<c> f9362c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f9363d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f9364e = 0;

    /* renamed from: e.b.b.d.a$a, reason: collision with other inner class name */
    static class C0422a implements a.InterfaceC0429a<c> {
        C0422a() {
        }

        @Override // e.b.b.n.f.a.InterfaceC0429a
        public void a(c cVar) {
            c cVar2 = cVar;
            if (a.f9363d) {
                b.b("APM-CommonEvent", "evicted Monitorable " + cVar2);
            }
        }
    }

    static {
        e.b.b.n.f.a<c> aVar = new e.b.b.n.f.a<>(1000);
        f9362c = aVar;
        f9363d = true;
        aVar.d(new C0422a());
    }

    private static synchronized void b() {
        e.b.b.d.b.b bVar;
        synchronized (a.class) {
            if (!b && (bVar = (e.b.b.d.b.b) e.b.b.m.c.a(e.b.b.d.b.b.class)) != null) {
                k(bVar.getConfig());
                b = true;
            }
        }
    }

    public static void c(e.b.b.d.c.b bVar) {
        if (bVar == null) {
            return;
        }
        if (a == null) {
            f9362c.c(bVar);
            if (e.b.b.n.a.b()) {
                b.a("APM-CommonEvent", "Cached CommonLog: " + bVar);
            }
            b();
            return;
        }
        if (a.a(bVar.a())) {
            bVar.d();
            if (e.b.b.n.a.b()) {
                b.a("APM-CommonEvent", "Sampled CommonLog:" + bVar);
            }
            e.b.b.k.b.c(bVar);
            return;
        }
        if (e.b.b.n.a.b()) {
            bVar.d();
            com.bytedance.apm.doctor.a.b(bVar.a(), bVar.c(), false);
            b.a("APM-CommonEvent", "UnSampled CommonLog:" + bVar);
        }
    }

    public static void d(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        e(new e.b.b.d.c.a(str, 0, jSONObject, null, null, jSONObject2));
    }

    public static void e(e.b.b.d.c.a aVar) {
        if (aVar == null) {
            return;
        }
        if (a == null) {
            f9362c.c(aVar);
            if (e.b.b.n.a.b()) {
                b.a("APM-CommonEvent", "cached CommonEvent:" + aVar);
            }
            b();
            return;
        }
        if (a.b(aVar.e())) {
            aVar.d();
            e.b.b.k.b.c(aVar);
            if (e.b.b.n.a.b()) {
                b.a("APM-CommonEvent", "Sampled CommonEvent:" + aVar);
                return;
            }
            return;
        }
        if (e.b.b.n.a.b()) {
            b.a("APM-CommonEvent", "UnSampled CommonEvent:" + aVar);
        }
        if (e.b.b.n.a.b()) {
            aVar.d();
            com.bytedance.apm.doctor.a.b("service_monitor", aVar.c(), false);
        }
    }

    public static void f(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        e(new e.b.b.d.c.a(str, i, null, jSONObject2, jSONObject3, jSONObject4));
    }

    public static void g(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        f(str, 0, null, jSONObject, jSONObject2, jSONObject3);
    }

    public static void h(e.b.b.d.c.c cVar) {
        if (cVar == null) {
            return;
        }
        e.b.b.k.b.c(cVar);
    }

    public static void i(d dVar) {
        if (e.b.b.n.a.b()) {
            StringBuilder M = e.a.a.a.a.M("trace_data:");
            M.append(dVar.c());
            b.a("APM-CommonEvent", M.toString());
        }
        e.b.b.k.b.c(dVar);
    }

    public static synchronized void j(boolean z) {
        synchronized (a.class) {
            f9363d = z;
        }
    }

    public static synchronized void k(e.b.b.d.b.a aVar) {
        synchronized (a.class) {
            if (aVar != null) {
                if (a != aVar) {
                    if (e.b.b.n.a.b()) {
                        b.a("APM-CommonEvent", "updateConfig " + aVar);
                    }
                    a = aVar;
                    while (!f9362c.a()) {
                        c b2 = f9362c.b();
                        if (b2 instanceof e.b.b.d.c.a) {
                            e((e.b.b.d.c.a) b2);
                        } else if (b2 instanceof e.b.b.d.c.b) {
                            c((e.b.b.d.c.b) b2);
                        }
                    }
                }
            }
        }
    }
}
