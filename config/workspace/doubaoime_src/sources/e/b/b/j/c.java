package e.b.b.j;

import android.app.Activity;
import com.bytedance.android.input.r.j;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import e.b.b.j.d;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class c {
    private volatile boolean a;
    private volatile com.bytedance.apm.x.b b;

    /* renamed from: c, reason: collision with root package name */
    private e.b.b.j.g.a f9464c;

    /* renamed from: d, reason: collision with root package name */
    private com.bytedance.apm6.util.timetask.a f9465d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f9466e;

    /* renamed from: f, reason: collision with root package name */
    private long f9467f = 0;

    /* renamed from: g, reason: collision with root package name */
    private b f9468g = new b(null);
    private List<e.b.b.j.h.a> h = new CopyOnWriteArrayList();

    private static class a {
        private static final c a = new c(null);
    }

    private class b extends e.b.b.m.g.b {
        b(e.b.b.j.b bVar) {
        }

        @Override // e.b.b.m.g.b, e.b.b.m.g.c
        public final void onBackground(Activity activity) {
            if (e.b.b.n.a.b()) {
                StringBuilder M = e.a.a.a.a.M("isStopWhenBackground:");
                M.append(c.b(c.this));
                e.b.b.n.g.b.a("APM-Memory", M.toString());
            }
            if (c.b(c.this)) {
                c.this.j();
            }
        }

        @Override // e.b.b.m.g.b, e.b.b.m.g.c
        public final void onFront(Activity activity) {
            if (e.b.b.n.a.b()) {
                StringBuilder M = e.a.a.a.a.M("isStopWhenBackground:");
                M.append(c.b(c.this));
                e.b.b.n.g.b.a("APM-Memory", M.toString());
            }
            if (c.b(c.this)) {
                c.this.i();
            }
        }
    }

    c(e.b.b.j.b bVar) {
    }

    static void a(c cVar) {
        d dVar;
        Objects.requireNonNull(cVar);
        long currentTimeMillis = System.currentTimeMillis();
        dVar = d.a.a;
        e.b.b.j.i.a a2 = dVar.a(cVar.f9464c);
        if (a2 == null) {
            if (e.b.b.n.a.b()) {
                e.b.b.n.g.b.a("APM-Memory", "collectWithConfig return is null");
                return;
            }
            return;
        }
        a2.k(null);
        if (e.b.b.n.a.b()) {
            e.b.b.n.g.b.a("APM-Memory", String.format("collect[isUploadEnable=%s cost=%s]: %s", Boolean.valueOf(cVar.f9464c.d()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis), a2.c().toString()));
        }
        if (cVar.f9464c.d()) {
            e.b.b.k.b.c(a2);
        }
        if (a2.i() > cVar.f9464c.f() && cVar.b != null) {
            Objects.requireNonNull((com.bytedance.android.input.r.c) cVar.b);
            j jVar = j.f3013f;
        }
        List<e.b.b.j.h.a> list = cVar.h;
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            e.b.b.j.f.a j = a2.j();
            Iterator<e.b.b.j.h.a> it2 = cVar.h.iterator();
            while (it2.hasNext()) {
                it2.next().a(j);
            }
        } catch (Exception unused) {
        }
    }

    static boolean b(c cVar) {
        e.b.b.j.g.a aVar = cVar.f9464c;
        return aVar != null && aVar.c();
    }

    public static c e() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        if (!this.f9466e) {
            this.f9466e = true;
            if (e.b.b.n.a.b()) {
                e.b.b.n.g.b.a("APM-Memory", "start");
            }
            if (this.f9465d == null) {
                if (e.b.b.n.a.b()) {
                    e.b.b.n.g.b.a("APM-Memory", "scheduleCollectMemory");
                }
                this.f9465d = new e.b.b.j.b(this, 0L, this.f9467f);
                com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT).c(this.f9465d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        if (this.f9466e) {
            this.f9466e = false;
            if (e.b.b.n.a.b()) {
                e.b.b.n.g.b.a("APM-Memory", "cancelCollectMemory");
            }
            if (this.f9465d != null) {
                com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT).b(this.f9465d);
                this.f9465d = null;
            }
        }
    }

    public final synchronized void f() {
        if (this.a) {
            return;
        }
        this.a = true;
        k(((e.b.b.j.g.b) e.b.b.m.c.a(e.b.b.j.g.b.class)).getConfig());
    }

    public void g() {
        d dVar;
        dVar = d.a.a;
        dVar.f();
    }

    public void h(com.bytedance.apm.x.b bVar) {
        this.b = bVar;
    }

    public synchronized void k(e.b.b.j.g.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f9464c = aVar;
        if (e.b.b.n.a.b()) {
            e.b.b.n.g.b.a("APM-Memory", "updateConfig: " + aVar);
        }
        if (!aVar.a()) {
            j();
            e.b.b.m.g.a aVar2 = (e.b.b.m.g.a) e.b.b.m.c.a(e.b.b.m.g.a.class);
            if (aVar2 != null) {
                aVar2.a(this.f9468g);
            }
            if (e.b.b.n.a.b()) {
                e.b.b.n.g.b.a("APM-Memory", "isApm6SampleEnable: " + aVar.a());
            }
            return;
        }
        e.b.b.m.g.a aVar3 = (e.b.b.m.g.a) e.b.b.m.c.a(e.b.b.m.g.a.class);
        if (aVar3 != null) {
            if (aVar.c()) {
                aVar3.a(this.f9468g);
                aVar3.b(this.f9468g);
            } else {
                aVar3.a(this.f9468g);
            }
        }
        long e2 = aVar.e() * 1000;
        this.f9467f = e2;
        if (e2 < 30000) {
            if (e.b.b.n.a.b()) {
                e.b.b.n.g.b.a("APM-Memory", "pollingIntervalMillis: " + this.f9467f);
            }
            this.f9467f = 30000L;
        }
        if (e.b.b.n.a.b()) {
            e.b.b.n.g.b.a("APM-Memory", "result pollingIntervalMillis: " + this.f9467f);
        }
        com.bytedance.apm6.util.timetask.a aVar4 = this.f9465d;
        if (aVar4 != null && aVar4.b() != this.f9467f) {
            j();
        }
        i();
        e.b.b.j.a aVar5 = (e.b.b.j.a) e.b.b.m.c.a(e.b.b.j.a.class);
        if (aVar5 != null) {
            aVar5.start();
        }
    }
}
