package e.b.b.i;

import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.monitor.collector.j;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static int f9462c = -1;
    private e.b.b.i.b a;
    private volatile boolean b;

    private static class b {
        private static final a a = new a(null);
    }

    a(C0427a c0427a) {
    }

    public static a a() {
        return b.a;
    }

    public void b() {
        e.b.b.i.b config;
        if (this.b) {
            return;
        }
        c cVar = (c) e.b.b.m.c.a(c.class);
        if (cVar != null && (config = cVar.getConfig()) != null) {
            this.a = config;
        }
        e.b.b.i.b bVar = this.a;
        if (bVar != null && bVar.a) {
            if (-1 == f9462c && j.l()) {
                f9462c = MonitorJni.initJavaMem() ? 1 : 0;
            }
            int i = f9462c;
        }
        this.b = true;
    }

    public void c(e.b.b.i.b bVar) {
        if (bVar == null) {
            return;
        }
        this.a = bVar;
    }
}
