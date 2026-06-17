package com.bytedance.applog.D;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class d {
    private static final List<String> m = Collections.singletonList("TaskPresenter");

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.applog.D.e f3747e;

    /* renamed from: f, reason: collision with root package name */
    private Handler f3748f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bytedance.applog.D.b f3749g;
    private final com.bytedance.applog.c j;
    private boolean a = false;
    private volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3745c = true;

    /* renamed from: d, reason: collision with root package name */
    private long f3746d = System.currentTimeMillis();
    private final List<com.bytedance.applog.D.e> h = new ArrayList();
    private boolean i = false;
    private final Runnable k = new a();
    private final Runnable l = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.applog.w.e I = d.this.j.I();
            List<String> list = d.m;
            StringBuilder M = e.a.a.a.a.M("[Task] closeCurrentSession currentSession is null : ");
            M.append(d.this.f3747e == null);
            I.n(list, M.toString(), new Object[0]);
            if (d.this.f3747e == null) {
                d.this.j.I().f(d.m, "[Task] closeCurrentSession found that currentSession is null", new Object[0]);
                return;
            }
            if (d.this.i) {
                d.this.j.I().n(d.m, "[Task] is fired : so save session to Db", new Object[0]);
                d.this.f3749g.d(d.this.f3747e);
            } else {
                d.this.j.I().n(d.m, "[Task] is not fired : so save session in pendingSessions", new Object[0]);
                d.this.h.add(d.this.f3747e);
            }
            d.this.f3747e = null;
            d.this.f3749g.b();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.i = true;
            d.this.j.I().n(d.m, "[Task] fire pending Sessions", new Object[0]);
            Iterator it2 = new ArrayList(d.this.h).iterator();
            while (it2.hasNext()) {
                d.this.f3749g.d((com.bytedance.applog.D.e) it2.next());
            }
            d.this.h.clear();
        }
    }

    class c implements Runnable {
        final /* synthetic */ long a;

        c(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.b) {
                return;
            }
            d.this.j.I().n(d.m, "[Task] onTaskResume", new Object[0]);
            d.this.b = true;
            if (d.this.f3745c) {
                d.this.a = true;
                if (d.this.f3747e == null) {
                    d.this.j.I().n(d.m, "[Task] pure bg launch , so create a new task session", new Object[0]);
                    d dVar = d.this;
                    dVar.f3747e = new com.bytedance.applog.D.e(this.a, dVar.j.M());
                    d.this.f3749g.b();
                    d dVar2 = d.this;
                    d.p(dVar2, dVar2.f3747e.g());
                    return;
                }
                long f2 = this.a - d.this.f3747e.f();
                if (f2 <= 15000) {
                    d.this.j.I().n(d.m, e.a.a.a.a.F(e.a.a.a.a.Q("[Task] task time diff ", f2, " , is less than "), 15000L, " so , merge in previous session"), new Object[0]);
                    com.bytedance.applog.D.f.b().e(d.this.k);
                    d.this.f3747e.a(f2);
                    d.this.f3747e.n(this.a);
                    d.this.f3749g.e(d.this.f3747e);
                    d dVar3 = d.this;
                    d.p(dVar3, dVar3.f3747e.g());
                    return;
                }
                d.this.j.I().n(d.m, e.a.a.a.a.F(e.a.a.a.a.Q("[Task] task time diff ", f2, " , is bigger than "), 15000L, " so close current session and create new session"), new Object[0]);
                com.bytedance.applog.D.f.b().e(d.this.k);
                d.this.k.run();
                d dVar4 = d.this;
                dVar4.f3747e = new com.bytedance.applog.D.e(this.a, dVar4.j.M());
                d.this.f3749g.b();
                d dVar5 = d.this;
                d.p(dVar5, dVar5.f3747e.g());
            }
        }
    }

    /* renamed from: com.bytedance.applog.D.d$d, reason: collision with other inner class name */
    class RunnableC0146d implements Runnable {
        final /* synthetic */ long a;

        RunnableC0146d(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.b) {
                d.this.j.I().n(d.m, "[Task] onTaskPause", new Object[0]);
                d.this.b = false;
                if (d.this.f3745c) {
                    if (d.this.f3747e == null) {
                        d.this.j.I().f(d.m, "[Task] onTaskPause when bg, but no session available", new Object[0]);
                        return;
                    }
                    d.this.j.I().n(d.m, "[Task] wait 15000 to close current session", new Object[0]);
                    d.this.f3747e.n(this.a);
                    com.bytedance.applog.D.f b = com.bytedance.applog.D.f.b();
                    Runnable runnable = d.this.k;
                    Objects.requireNonNull(b);
                    if (runnable != null) {
                        b.c().removeCallbacks(runnable);
                        b.d(runnable, 15000L);
                    }
                    d.this.f3749g.e(d.this.f3747e);
                    d.h(d.this);
                }
            }
        }
    }

    class e implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ String b;

        e(long j, String str) {
            this.a = j;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.j.I().n(d.m, "[Task] onExitBg", new Object[0]);
            if (d.this.f3745c) {
                d.this.f3745c = false;
                com.bytedance.applog.D.f.b().e(d.this.l);
                com.bytedance.applog.D.f.b().e(d.this.k);
                d.h(d.this);
                d.this.f3749g.b();
                if (d.this.a) {
                    if (this.a - d.this.f3746d <= 30000) {
                        d.this.j.I().n(d.m, "[Task] time diff is less than 30000 , so clear current session", new Object[0]);
                        d.this.h.clear();
                        d.this.f3747e = null;
                    } else {
                        if (d.this.f3747e != null) {
                            d.this.j.I().n(d.m, "[Task] close current session", new Object[0]);
                            if (d.this.b) {
                                d.this.f3747e.l(this.b);
                                d.this.f3747e.n(this.a);
                            }
                            d.this.f3749g.d(d.this.f3747e);
                            d.this.f3747e = null;
                        }
                        d.this.l.run();
                    }
                }
                d.l(d.this);
            }
        }
    }

    class f implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ String b;

        f(long j, String str) {
            this.a = j;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.j.I().n(d.m, "[Task] onEnterBg", new Object[0]);
            if (d.this.f3745c) {
                return;
            }
            d.l(d.this);
            com.bytedance.applog.D.f b = com.bytedance.applog.D.f.b();
            Runnable runnable = d.this.l;
            Objects.requireNonNull(b);
            if (runnable != null) {
                b.c().removeCallbacks(runnable);
                b.d(runnable, 30010L);
            }
            d.this.f3746d = this.a;
            d.this.f3745c = true;
            if (d.this.b) {
                d.this.a = true;
                if (d.this.f3747e != null) {
                    d.this.j.I().f(d.m, "[Task] enter bg , bug there is already a bg task is running", new Object[0]);
                }
                d.this.j.I().n(d.m, "[Task] task is running , so create a new task session", new Object[0]);
                d dVar = d.this;
                dVar.f3747e = new com.bytedance.applog.D.e(this.a, dVar.j.M());
                d.this.f3747e.m(this.b);
                d dVar2 = d.this;
                d.p(dVar2, dVar2.f3747e.g());
            }
        }
    }

    public d(com.bytedance.applog.c cVar, com.bytedance.applog.B.b bVar, com.bytedance.applog.x.c cVar2) {
        this.j = cVar;
        this.f3749g = new com.bytedance.applog.D.b(cVar, bVar, cVar2);
    }

    static void h(d dVar) {
        dVar.v().removeMessages(1);
    }

    static void l(d dVar) {
        dVar.a = false;
        dVar.h.clear();
        dVar.i = false;
    }

    static void p(d dVar, String str) {
        Handler v = dVar.v();
        v.removeMessages(1);
        v.sendMessageDelayed(Message.obtain(v, 1, str), com.heytap.mcssdk.constant.a.r);
    }

    private Handler v() {
        if (this.f3748f == null) {
            synchronized (this) {
                if (this.f3748f == null) {
                    this.f3748f = new com.bytedance.applog.D.c(this, com.bytedance.applog.D.f.b().getLooper());
                }
            }
        }
        return this.f3748f;
    }

    public void w(long j, String str) {
        com.bytedance.applog.D.f.b().a(new f(j, str));
    }

    public void x(long j, String str) {
        com.bytedance.applog.D.f.b().a(new e(j, str));
    }

    public void y() {
        com.bytedance.applog.D.f.b().a(new RunnableC0146d(System.currentTimeMillis()));
    }

    public void z() {
        com.bytedance.applog.D.f.b().a(new c(System.currentTimeMillis()));
    }
}
