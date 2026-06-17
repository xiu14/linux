package e.b.b.g;

import android.os.Process;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.services.apm.api.IFdCheck;
import e.b.b.m.c;
import java.io.File;

/* loaded from: classes.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    private static a f9440g = new a();
    private e.b.b.g.c.a a;
    private volatile boolean b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f9441c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f9442d = false;

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.apm6.util.timetask.a f9443e;

    /* renamed from: f, reason: collision with root package name */
    private IFdCheck f9444f;

    /* renamed from: e.b.b.g.a$a, reason: collision with other inner class name */
    class C0426a extends com.bytedance.apm6.util.timetask.a {
        C0426a(long j) {
            super(j, 0L);
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT).b(a.this.f9443e);
            a.b(a.this, null);
            a.this.f9442d = true;
            a.this.h();
        }
    }

    class b extends com.bytedance.apm6.util.timetask.a {
        b(long j, long j2) {
            super(j, j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            a.e(a.this);
        }
    }

    static /* synthetic */ com.bytedance.apm6.util.timetask.a b(a aVar, com.bytedance.apm6.util.timetask.a aVar2) {
        aVar.f9443e = null;
        return null;
    }

    static void e(a aVar) {
        if (aVar.a == null) {
            return;
        }
        e.b.b.m.g.a aVar2 = (e.b.b.m.g.a) c.a(e.b.b.m.g.a.class);
        int i = 0;
        boolean isForeground = aVar2 != null ? aVar2.isForeground() : false;
        try {
            i = new File("/proc/" + Process.myPid() + "/fd").listFiles().length;
        } catch (Exception unused) {
        }
        if (i > 0 && i < aVar.a.b()) {
            e.b.b.k.b.c(new e.b.b.g.b(i, null, isForeground));
            return;
        }
        if (aVar.f9444f == null) {
            aVar.f9444f = (IFdCheck) com.bytedance.news.common.service.manager.c.a(IFdCheck.class);
        }
        IFdCheck iFdCheck = aVar.f9444f;
        if (iFdCheck == null) {
            return;
        }
        e.b.b.k.b.c(new e.b.b.g.b(i, iFdCheck.getFdList(), isForeground));
    }

    public static a f() {
        return f9440g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h() {
        e.b.b.g.c.a aVar;
        if (this.f9442d && (aVar = this.a) != null && aVar.c() && !this.f9441c) {
            this.f9441c = true;
            com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT).c(new b(0L, this.a.a()));
        }
    }

    public void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        e.b.b.g.c.b bVar = (e.b.b.g.c.b) c.a(e.b.b.g.c.b.class);
        if (bVar != null) {
            i(bVar.getConfig());
        }
        this.f9443e = new C0426a(1200000L);
        com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT).c(this.f9443e);
    }

    public synchronized void i(e.b.b.g.c.a aVar) {
        if (aVar == null) {
            return;
        }
        this.a = aVar;
        if (e.b.b.n.a.b()) {
            e.b.b.n.g.b.a("APM-FD", "updateConfig:" + aVar);
        }
        h();
    }
}
