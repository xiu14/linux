package e.b.b.f;

import android.content.SharedPreferences;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static a f9406e = new a();
    private e.b.b.f.d.a a;
    private volatile boolean b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f9407c;

    /* renamed from: d, reason: collision with root package name */
    private com.bytedance.apm6.util.timetask.a f9408d;

    /* renamed from: e.b.b.f.a$a, reason: collision with other inner class name */
    class C0424a extends com.bytedance.apm6.util.timetask.a {
        C0424a() {
            super(0L, 0L);
        }

        @Override // java.lang.Runnable
        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            if (e.b.b.n.a.b()) {
                e.b.b.n.g.b.a("APM-Disk", "startCollect:");
            }
            SharedPreferences sharedPreferences = e.b.b.n.a.a().getSharedPreferences("monitor_config", 0);
            long currentTimeMillis2 = System.currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("check_disk_last_time", 0L) : 0L);
            if (e.b.b.n.a.b()) {
                e.b.b.n.g.b.a("APM-Disk", "durationMs:" + currentTimeMillis2);
            }
            if (currentTimeMillis2 >= com.heytap.mcssdk.constant.a.f6888f) {
                b j = c.p().j(a.this.a);
                if (e.b.b.n.a.b()) {
                    StringBuilder M = e.a.a.a.a.M("durationMs:");
                    M.append(j.c());
                    e.b.b.n.g.b.a("APM-Disk", M.toString());
                }
                e.b.b.k.b.c(j);
                sharedPreferences.edit().putLong("check_disk_last_time", System.currentTimeMillis()).commit();
            }
            com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT).b(a.this.f9408d);
            if (e.b.b.n.a.b()) {
                StringBuilder M2 = e.a.a.a.a.M("collect end and cost time:");
                M2.append(System.currentTimeMillis() - currentTimeMillis);
                e.b.b.n.g.b.a("APM-Disk", M2.toString());
            }
        }
    }

    private synchronized void c() {
        if (this.f9407c) {
            return;
        }
        e.b.b.f.d.a aVar = this.a;
        if (aVar != null && aVar.k()) {
            if (e.b.b.h.c.a.y()) {
                this.f9407c = true;
                this.f9408d = new C0424a();
                com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT).c(this.f9408d);
            }
        }
    }

    public static a d() {
        return f9406e;
    }

    public void e() {
        if (this.b) {
            return;
        }
        this.b = true;
        e.b.b.f.d.b bVar = (e.b.b.f.d.b) e.b.b.m.c.a(e.b.b.f.d.b.class);
        if (bVar != null) {
            f(bVar.getConfig());
        }
    }

    public synchronized void f(e.b.b.f.d.a aVar) {
        if (aVar == null) {
            return;
        }
        this.a = aVar;
        if (e.b.b.n.a.b()) {
            e.b.b.n.g.b.a("APM-Disk", "updateConfig:" + aVar);
        }
        if (this.b) {
            e.b.b.m.g.a aVar2 = (e.b.b.m.g.a) e.b.b.m.c.a(e.b.b.m.g.a.class);
            if (aVar2 != null && !aVar2.isForeground()) {
                c();
            }
        }
    }
}
