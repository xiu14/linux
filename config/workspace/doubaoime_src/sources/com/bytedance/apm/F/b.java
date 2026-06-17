package com.bytedance.apm.F;

import android.annotation.SuppressLint;
import com.bytedance.monitor.util.thread.AsyncTaskType;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class b {
    private volatile ExecutorService a;
    private volatile boolean b = true;

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.monitor.util.thread.e f3289d = new a();

    /* renamed from: e, reason: collision with root package name */
    private final com.bytedance.monitor.util.thread.e f3290e = new C0107b();

    /* renamed from: f, reason: collision with root package name */
    CopyOnWriteArraySet<e> f3291f = new CopyOnWriteArraySet<>();

    /* renamed from: g, reason: collision with root package name */
    CopyOnWriteArraySet<e> f3292g = new CopyOnWriteArraySet<>();

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.monitor.util.thread.d f3288c = com.bytedance.monitor.util.thread.c.a();

    class a implements com.bytedance.monitor.util.thread.e {
        a() {
        }

        @Override // com.bytedance.monitor.util.thread.e
        public AsyncTaskType M() {
            return AsyncTaskType.LIGHT_WEIGHT;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<e> it2 = b.this.f3291f.iterator();
            while (it2.hasNext()) {
                it2.next().onTimeEvent(System.currentTimeMillis());
            }
            if (b.this.b) {
                b.this.i(this, 30000L);
            }
        }
    }

    /* renamed from: com.bytedance.apm.F.b$b, reason: collision with other inner class name */
    class C0107b implements com.bytedance.monitor.util.thread.e {
        C0107b() {
        }

        @Override // com.bytedance.monitor.util.thread.e
        public AsyncTaskType M() {
            return AsyncTaskType.LIGHT_WEIGHT;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<e> it2 = b.this.f3292g.iterator();
            while (it2.hasNext()) {
                it2.next().onTimeEvent(System.currentTimeMillis());
            }
            if (b.this.b) {
                b.this.i(this, 30000L);
            }
        }
    }

    class c implements ThreadFactory {
        c(b bVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "Apm_Normal");
        }
    }

    private static final class d {
        static final b a = new b(null);
    }

    public interface e {
        void onTimeEvent(long j);
    }

    b(a aVar) {
    }

    public static b e() {
        return d.a;
    }

    private com.bytedance.monitor.util.thread.e p(Runnable runnable, String str) {
        return com.bytedance.monitor.util.thread.c.d("AsyncEventManager-" + str, runnable);
    }

    public void b(e eVar) {
        try {
            if (!this.b || this.f3291f.contains(eVar)) {
                return;
            }
            this.f3291f.add(eVar);
            k(this.f3289d);
            i(this.f3289d, 30000L);
        } catch (Throwable unused) {
        }
    }

    public void c(Runnable runnable) {
        com.bytedance.monitor.util.thread.d dVar = this.f3288c;
        if (dVar == null || runnable == null) {
            return;
        }
        ((com.bytedance.monitor.util.thread.a) dVar).j(p(runnable, "post"));
    }

    public void d(com.bytedance.monitor.util.thread.e eVar, long j) {
        com.bytedance.monitor.util.thread.d dVar = this.f3288c;
        if (dVar == null || eVar == null) {
            return;
        }
        ((com.bytedance.monitor.util.thread.a) dVar).k(eVar, j);
    }

    public boolean f() {
        if (this.f3288c != null) {
            if (Thread.currentThread().getId() == ((com.bytedance.monitor.util.thread.a) this.f3288c).f(AsyncTaskType.LIGHT_WEIGHT)) {
                return true;
            }
        }
        return false;
    }

    public void g(ExecutorService executorService) {
        this.a = null;
        com.bytedance.monitor.util.thread.d dVar = this.f3288c;
        if (dVar != null) {
            ((com.bytedance.monitor.util.thread.a) dVar).d().i(null);
        }
    }

    public void h(Runnable runnable) {
        if (this.f3288c == null || runnable == null || !this.b) {
            return;
        }
        ((com.bytedance.monitor.util.thread.a) this.f3288c).j(p(runnable, "post"));
    }

    public void i(com.bytedance.monitor.util.thread.e eVar, long j) {
        if (this.f3288c == null || eVar == null || !this.b) {
            return;
        }
        ((com.bytedance.monitor.util.thread.a) this.f3288c).k(eVar, j);
    }

    public void j(Runnable runnable, long j) {
        if (this.f3288c == null || !this.b) {
            return;
        }
        ((com.bytedance.monitor.util.thread.a) this.f3288c).k(p(runnable, "postDelayed"), j);
    }

    public void k(com.bytedance.monitor.util.thread.e eVar) {
        com.bytedance.monitor.util.thread.d dVar = this.f3288c;
        if (dVar == null || eVar == null) {
            return;
        }
        ((com.bytedance.monitor.util.thread.a) dVar).l(eVar);
    }

    public void l(e eVar) {
        try {
            this.f3291f.remove(eVar);
        } catch (Throwable unused) {
        }
    }

    public void m() {
        this.b = true;
        if (!this.f3291f.isEmpty()) {
            k(this.f3289d);
            i(this.f3289d, 30000L);
        }
        if (this.f3292g.isEmpty()) {
            return;
        }
        k(this.f3290e);
        i(this.f3290e, 30000L);
    }

    public void n() {
        this.b = false;
        k(this.f3289d);
        k(this.f3290e);
    }

    @SuppressLint({"CI_NotAllowInvokeExecutorsMethods"})
    public void o(Runnable runnable) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    com.bytedance.monitor.util.thread.d dVar = this.f3288c;
                    if (dVar != null) {
                        this.a = ((com.bytedance.monitor.util.thread.a) dVar).d();
                    } else {
                        this.a = Executors.newFixedThreadPool(1, new c(this));
                    }
                }
            }
        }
        this.a.submit(runnable);
    }
}
