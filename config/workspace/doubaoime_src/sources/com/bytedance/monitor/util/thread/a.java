package com.bytedance.monitor.util.thread;

import androidx.annotation.NonNull;
import com.bytedance.monitor.util.thread.d;
import com.bytedance.monitor.util.thread.g.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a implements com.bytedance.monitor.util.thread.d {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f5477f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static final Object f5478g = new Object();
    private static final Object h = new Object();
    public static final /* synthetic */ int i = 0;
    private volatile com.bytedance.monitor.util.thread.g.b a;
    private volatile com.bytedance.monitor.util.thread.g.b b;

    /* renamed from: c, reason: collision with root package name */
    private volatile com.bytedance.monitor.util.thread.g.b f5479c;

    /* renamed from: d, reason: collision with root package name */
    private Map<AsyncTaskType, Long> f5480d = new ConcurrentHashMap(3);

    /* renamed from: e, reason: collision with root package name */
    private d.a f5481e;

    /* renamed from: com.bytedance.monitor.util.thread.a$a, reason: collision with other inner class name */
    class C0278a implements a.b {
        C0278a() {
        }

        @Override // com.bytedance.monitor.util.thread.g.a.b
        public void a(long j) {
            a.this.f5480d.put(AsyncTaskType.IO, Long.valueOf(j));
        }
    }

    class b implements a.b {
        b() {
        }

        @Override // com.bytedance.monitor.util.thread.g.a.b
        public void a(long j) {
            a.this.f5480d.put(AsyncTaskType.LIGHT_WEIGHT, Long.valueOf(j));
        }
    }

    class c implements a.b {
        c() {
        }

        @Override // com.bytedance.monitor.util.thread.g.a.b
        public void a(long j) {
            a.this.f5480d.put(AsyncTaskType.TIME_SENSITIVE, Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d {
        static final a a = new a();
    }

    @NonNull
    private com.bytedance.monitor.util.thread.g.c c(e eVar) {
        AsyncTaskType M = eVar.M();
        if (M == AsyncTaskType.IO) {
            return d();
        }
        if (M == AsyncTaskType.TIME_SENSITIVE) {
            if (this.f5479c == null) {
                synchronized (h) {
                    if (this.f5479c == null) {
                        i(null);
                    }
                }
            }
            return this.f5479c;
        }
        if (this.b == null) {
            synchronized (f5478g) {
                if (this.b == null) {
                    h(null);
                }
            }
        }
        return this.b;
    }

    public static a e() {
        return d.a;
    }

    private void g(f fVar) {
        synchronized (f5477f) {
            if (this.a == null) {
                com.bytedance.monitor.util.thread.g.a aVar = new com.bytedance.monitor.util.thread.g.a("io-task");
                aVar.c(null);
                aVar.d(new C0278a());
                com.bytedance.monitor.util.thread.g.b bVar = new com.bytedance.monitor.util.thread.g.b(1, aVar);
                bVar.j(null);
                this.a = bVar;
            }
        }
    }

    private void h(f fVar) {
        synchronized (f5478g) {
            if (this.b == null) {
                com.bytedance.monitor.util.thread.g.a aVar = new com.bytedance.monitor.util.thread.g.a("light-weight-task");
                aVar.c(null);
                aVar.d(new b());
                com.bytedance.monitor.util.thread.g.b bVar = new com.bytedance.monitor.util.thread.g.b(1, aVar);
                bVar.j(null);
                this.b = bVar;
            }
        }
    }

    private void i(f fVar) {
        synchronized (h) {
            if (this.f5479c == null) {
                com.bytedance.monitor.util.thread.g.a aVar = new com.bytedance.monitor.util.thread.g.a("time-sensitive-task");
                aVar.c(null);
                aVar.d(new c());
                com.bytedance.monitor.util.thread.g.b bVar = new com.bytedance.monitor.util.thread.g.b(1, aVar);
                bVar.j(null);
                this.f5479c = bVar;
            }
        }
    }

    public void b(Throwable th, String str) {
        d.a aVar = this.f5481e;
        if (aVar != null) {
            aVar.a(th, str);
        }
    }

    public com.bytedance.monitor.util.thread.g.b d() {
        if (this.a == null) {
            synchronized (f5477f) {
                if (this.a == null) {
                    g(null);
                }
            }
        }
        return this.a;
    }

    public long f(AsyncTaskType asyncTaskType) {
        Long l = this.f5480d.get(asyncTaskType);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public void j(e eVar) {
        try {
            ((com.bytedance.monitor.util.thread.g.b) c(eVar)).c(eVar);
        } catch (Throwable th) {
            d.a aVar = this.f5481e;
            if (aVar != null) {
                aVar.a(th, "Apm-Async-task-post");
            }
        }
    }

    public void k(e eVar, long j) {
        try {
            ((com.bytedance.monitor.util.thread.g.b) c(eVar)).d(eVar, j);
        } catch (Throwable th) {
            d.a aVar = this.f5481e;
            if (aVar != null) {
                aVar.a(th, "Apm-Async-task-postDelayed");
            }
        }
    }

    public void l(e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            ((com.bytedance.monitor.util.thread.g.b) c(eVar)).f(eVar);
        } catch (Throwable th) {
            b(th, "Apm-Async-task-removeTask");
        }
    }

    public void m(e eVar, long j, long j2) {
        if (eVar == null) {
            return;
        }
        try {
            ((com.bytedance.monitor.util.thread.g.b) c(eVar)).h(eVar, j, j2);
        } catch (Throwable th) {
            d.a aVar = this.f5481e;
            if (aVar != null) {
                aVar.a(th, "Apm-Async-task-removeTask");
            }
        }
    }

    public void n(d.a aVar) {
        this.f5481e = aVar;
    }
}
