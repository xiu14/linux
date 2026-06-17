package com.bytedance.push;

import com.bytedance.android.service.manager.push.interfaze.IMultiProcessEventSenderService;
import com.bytedance.android.service.manager.push.monitor.IMultiProcessMonitor;
import com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService;
import com.bytedance.push.client.intelligence.ClientIntelligenceServiceImpl;
import com.bytedance.push.event.sync.SignalReportServiceImpl;
import com.bytedance.push.interfaze.IClientIntelligenceService;
import com.bytedance.push.monitor.MultiProcessMonitor;
import com.bytedance.push.monitor.PushSdkMonitorServiceImpl;
import com.bytedance.push.sys.broadcast.SystemBroadcastServiceImpl;
import java.util.Map;

/* loaded from: classes2.dex */
public class C implements com.bytedance.push.interfaze.u {
    private static C w = new C();
    private com.bytedance.push.Q.c a = new com.bytedance.push.Q.c();
    private volatile C0679c b;

    /* renamed from: c, reason: collision with root package name */
    private volatile com.bytedance.push.T.a f5548c;

    /* renamed from: d, reason: collision with root package name */
    private volatile com.bytedance.push.interfaze.i f5549d;

    /* renamed from: e, reason: collision with root package name */
    private volatile E f5550e;

    /* renamed from: f, reason: collision with root package name */
    private volatile H f5551f;

    /* renamed from: g, reason: collision with root package name */
    private volatile com.bytedance.push.interfaze.l f5552g;
    private volatile com.bytedance.push.interfaze.h h;
    private volatile com.bytedance.push.interfaze.o i;
    private volatile IMultiProcessEventSenderService j;
    private volatile IClientIntelligenceService k;
    private volatile com.bytedance.push.interfaze.k l;
    private volatile com.bytedance.push.interfaze.n m;
    private volatile IMultiProcessMonitor n;
    private volatile com.bytedance.push.interfaze.g o;
    private volatile com.bytedance.push.interfaze.t p;
    private volatile IPushSdkMonitorService q;
    private volatile com.bytedance.push.interfaze.f r;
    private volatile com.bytedance.push.interfaze.v s;
    private volatile com.bytedance.push.V.a t;
    private volatile com.bytedance.push.interfaze.x u;
    private volatile com.bytedance.push.interfaze.j v;

    public static com.bytedance.push.interfaze.e A() {
        return w.d().m;
    }

    public static com.bytedance.push.interfaze.w B() {
        C c2 = w;
        if (c2.f5551f == null) {
            synchronized (c2) {
                if (c2.f5551f == null) {
                    c2.f5551f = new H(c2.s(), c2.o(), c2.d());
                }
            }
        }
        return c2.f5551f;
    }

    public static com.bytedance.push.interfaze.u a() {
        return w;
    }

    public static com.bytedance.push.Q.b x() {
        return w.a;
    }

    public static com.bytedance.push.interfaze.h y() {
        return w.i();
    }

    public static com.bytedance.push.interfaze.l z() {
        return w.o();
    }

    public IClientIntelligenceService b() {
        if (this.k == null) {
            synchronized (this) {
                if (this.k == null) {
                    this.k = new ClientIntelligenceServiceImpl(d().a);
                }
            }
        }
        return this.k;
    }

    public Map<String, String> c() {
        if (this.f5548c == null) {
            synchronized (this) {
                if (this.f5548c == null) {
                    this.f5548c = new com.bytedance.push.T.a(d());
                }
            }
        }
        return this.f5548c.a();
    }

    public C0679c d() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = C0679c.a();
                }
            }
        }
        return this.b;
    }

    public com.bytedance.push.V.a e() {
        if (this.t == null) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = new com.bytedance.push.V.a();
                }
            }
        }
        return this.t;
    }

    public com.bytedance.push.Q.b f() {
        return this.a;
    }

    public com.bytedance.push.interfaze.f g() {
        if (this.r == null) {
            synchronized (this) {
                if (this.r == null) {
                    this.r = new com.bytedance.push.S.a.c();
                }
            }
        }
        return this.r;
    }

    public com.bytedance.push.interfaze.g h() {
        if (this.o == null) {
            synchronized (this) {
                if (this.o == null) {
                    this.o = new com.bytedance.push.a0.a.a();
                }
            }
        }
        return this.o;
    }

    public com.bytedance.push.interfaze.h i() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    if (com.ss.android.message.f.a.t(d().a)) {
                        this.h = new com.bytedance.push.monitor.f();
                    } else {
                        this.h = new com.bytedance.push.monitor.g();
                    }
                }
            }
        }
        return this.h;
    }

    public IMultiProcessEventSenderService j() {
        if (this.j == null) {
            synchronized (this) {
                if (this.j == null) {
                    this.j = new MultiProcessEventSenderService();
                }
            }
        }
        return this.j;
    }

    public IMultiProcessMonitor k() {
        if (this.n == null) {
            synchronized (this) {
                if (this.n == null) {
                    this.n = new MultiProcessMonitor();
                }
            }
        }
        return this.n;
    }

    public com.bytedance.push.interfaze.i l() {
        if (this.f5549d == null) {
            synchronized (this) {
                if (this.f5549d == null) {
                    this.f5549d = new com.bytedance.push.notification.l(this);
                }
            }
        }
        return this.f5549d;
    }

    public com.bytedance.push.interfaze.j m() {
        if (this.v == null) {
            synchronized (this) {
                if (this.v == null) {
                    this.v = new l();
                }
            }
        }
        return this.v;
    }

    public com.bytedance.push.interfaze.k n() {
        if (this.l == null) {
            synchronized (this) {
                if (this.l == null) {
                    this.l = new com.bytedance.push.U.a.a(d().a);
                }
            }
        }
        return this.l;
    }

    public com.bytedance.push.interfaze.l o() {
        if (this.f5552g == null) {
            synchronized (this) {
                if (this.f5552g == null) {
                    this.f5552g = new com.bytedance.push.notification.n(d());
                }
            }
        }
        return this.f5552g;
    }

    public com.bytedance.push.interfaze.n p() {
        if (this.m == null) {
            synchronized (this) {
                if (this.m == null) {
                    this.m = new com.bytedance.push.notification.p();
                }
            }
        }
        return this.m;
    }

    public com.bytedance.push.interfaze.o q() {
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    this.i = new com.bytedance.push.X.a(d().a);
                }
            }
        }
        return this.i;
    }

    public IPushSdkMonitorService r() {
        if (this.q == null) {
            synchronized (this) {
                if (this.q == null) {
                    this.q = new PushSdkMonitorServiceImpl();
                }
            }
        }
        return this.q;
    }

    public com.bytedance.push.interfaze.s s() {
        if (this.f5550e == null) {
            synchronized (this) {
                if (this.f5550e == null) {
                    this.f5550e = new E();
                }
            }
        }
        return this.f5550e;
    }

    public com.bytedance.push.interfaze.t t() {
        if (this.p == null) {
            synchronized (this) {
                if (this.p == null) {
                    this.p = new SignalReportServiceImpl();
                }
            }
        }
        return this.p;
    }

    public com.bytedance.push.interfaze.v u() {
        if (this.s == null) {
            synchronized (this) {
                if (this.s == null) {
                    this.s = new SystemBroadcastServiceImpl();
                }
            }
        }
        return this.s;
    }

    public com.bytedance.push.interfaze.x v() {
        if (this.u == null) {
            synchronized (this) {
                if (this.u == null) {
                    this.u = new com.bytedance.push.e0.a();
                }
            }
        }
        return this.u;
    }

    public void w(C0679c c0679c, com.bytedance.push.T.a aVar) {
        this.b = c0679c;
        this.f5548c = aVar;
    }
}
