package e.b.l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import com.bytedance.rpc.transport.j;
import e.b.l.b;
import e.b.l.f;
import e.b.l.q.f;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
class i implements b.a, f.a {

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal<Object> f9620f = new ThreadLocal<>();

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadLocal<Object> f9621g = new ThreadLocal<>();
    private static final ThreadLocal<n> h = new a();
    private static final ThreadLocal<e.b.l.a> i = new b();
    private final Map<Integer, l> a = new ConcurrentHashMap();
    private final e.b.l.q.f b;

    /* renamed from: c, reason: collision with root package name */
    private final e.b.l.q.f f9622c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.rpc.transport.f f9623d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bytedance.rpc.serialize.g f9624e;

    static class a extends ThreadLocal {
        a() {
        }

        @Override // java.lang.ThreadLocal
        protected Object initialValue() {
            return new n(null);
        }
    }

    static class b extends ThreadLocal {
        b() {
        }

        @Override // java.lang.ThreadLocal
        protected Object initialValue() {
            return new e.b.l.a();
        }
    }

    public i(d dVar) {
        HandlerThread handlerThread = new HandlerThread("RpcSerialize");
        handlerThread.start();
        this.f9624e = new com.bytedance.rpc.serialize.g();
        this.f9623d = new com.bytedance.rpc.transport.f(dVar);
        this.b = new e.b.l.q.f(Looper.getMainLooper(), this);
        this.f9622c = new e.b.l.q.f(handlerThread.getLooper(), this);
    }

    private l k(m mVar) {
        int g2 = mVar.g();
        f9620f.set(Integer.valueOf(g2));
        l lVar = this.a.get(Integer.valueOf(g2));
        if (lVar == null) {
            lVar = new l(mVar);
            this.a.put(Integer.valueOf(g2), lVar);
            lVar.m(this.b, 1);
            ThreadLocal<e.b.l.a> threadLocal = i;
            if (threadLocal.get().m()) {
                mVar.a = threadLocal.get();
                threadLocal.remove();
            }
        } else {
            lVar.l(mVar);
        }
        return lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    @Override // e.b.l.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(e.b.l.m r10) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.l.i.a(e.b.l.m):java.lang.Object");
    }

    void d(f fVar, boolean z, boolean z2) {
        int r = fVar.r();
        l g2 = g(r);
        if (g2 != null) {
            g2.j(fVar);
            if (!z && !g2.h()) {
                Objects.requireNonNull(this.f9623d);
            }
            if ((z && (fVar.u() || fVar.w())) || !fVar.u()) {
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    m(g2, fVar);
                } else {
                    this.b.obtainMessage(5, r, 0, fVar).sendToTarget();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.Object e(e.b.l.m r22, com.bytedance.rpc.transport.i r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.l.i.e(e.b.l.m, com.bytedance.rpc.transport.i):java.lang.Object");
    }

    void f(m mVar, f fVar) {
        if (com.bytedance.rpc.log.b.e()) {
            com.bytedance.rpc.log.b.b(null, String.format("rpc: exception exception=%s,request=%s", fVar, mVar));
        }
        e.b.l.p.b[] f2 = mVar.i().f();
        if (f2.length > 0) {
            Class l = mVar.l();
            Method d2 = mVar.d();
            String e2 = mVar.e();
            for (e.b.l.p.b bVar : f2) {
                bVar.b(l, d2, fVar, e2);
            }
        }
    }

    public l g(int i2) {
        return this.a.get(Integer.valueOf(i2));
    }

    com.bytedance.rpc.transport.g h(l lVar) {
        com.bytedance.rpc.transport.g g2 = lVar.g();
        com.bytedance.rpc.transport.h[] h2 = lVar.f().i().h();
        if (h2.length > 0) {
            for (com.bytedance.rpc.transport.h hVar : h2) {
                com.bytedance.rpc.transport.g a2 = hVar.a(g2);
                if (a2 != null) {
                    g2 = a2;
                }
            }
        }
        return g2;
    }

    @Override // e.b.l.q.f.a
    public void handleMsg(Message message) {
        int i2 = message.what;
        int i3 = message.arg1;
        Handler target = message.getTarget();
        l lVar = this.a.get(Integer.valueOf(message.arg1));
        if (lVar == null || target == null) {
            return;
        }
        if (this.f9622c != target || lVar.h()) {
            if (this.b == target) {
                if (1 != i2) {
                    if (5 == i2) {
                        m(lVar, message.obj);
                        return;
                    }
                    return;
                }
                l lVar2 = this.a.get(Integer.valueOf(i3));
                if ((lVar2 == null || lVar2.f() == null || lVar2.h()) ? false : true) {
                    l lVar3 = this.a.get(Integer.valueOf(i3));
                    ((com.bytedance.rpc.transport.ttnet.a) this.f9623d.a(lVar3)).e(i3);
                    boolean m = lVar3.f().m();
                    lVar3.a();
                    int i4 = f.h;
                    f.b bVar = new f.b(987654324, "请求超时", false, null);
                    bVar.g("cancel");
                    bVar.f(i3);
                    d(bVar.b(), true, m);
                    return;
                }
                return;
            }
            return;
        }
        if (2 == i2) {
            m f2 = lVar.f();
            try {
                lVar.i(n(f2));
                this.f9622c.obtainMessage(3, f2.g(), 0).sendToTarget();
                return;
            } catch (Exception e2) {
                f.b o = f.o(e2);
                o.f(f2.g());
                o.g("serialize");
                d(o.b(), true, true);
                return;
            }
        }
        if (3 == i2) {
            com.bytedance.rpc.transport.c a2 = this.f9623d.a(lVar);
            int g2 = lVar.f().g();
            try {
                ((com.bytedance.rpc.transport.ttnet.a) a2).i(h(lVar), new j(this, lVar, g2));
                return;
            } catch (Exception e3) {
                f.b o2 = f.o(e3);
                o2.f(g2);
                o2.g(NotificationCompat.CATEGORY_TRANSPORT);
                d(o2.b(), false, true);
                return;
            }
        }
        if (4 == i2) {
            com.bytedance.rpc.transport.i iVar = (com.bytedance.rpc.transport.i) message.obj;
            m f3 = lVar.f();
            try {
                this.b.obtainMessage(5, f3.g(), 0, e(f3, iVar)).sendToTarget();
            } catch (Exception e4) {
                f.b o3 = f.o(e4);
                o3.f(f3.g());
                o3.g("deserialize");
                o3.h(com.bytedance.rpc.transport.i.class, iVar);
                d(o3.b(), true, true);
            }
        }
    }

    void i(l lVar, Object obj, com.bytedance.rpc.transport.i iVar) {
        m f2 = lVar.f();
        if (f2 == null) {
            return;
        }
        if (iVar == null && (obj instanceof f)) {
            iVar = (com.bytedance.rpc.transport.i) ((f) obj).t(com.bytedance.rpc.transport.i.class);
        }
        if (com.bytedance.rpc.log.b.d()) {
            int g2 = f2.g();
            String format = iVar == null ? String.format("rpc: result (requestId=%d,error=%s)", Integer.valueOf(g2), obj) : String.format("rpc: result (requestId=%d,code=%d,msg=%s,data=%s,headers=%s)", Integer.valueOf(g2), Integer.valueOf(iVar.e()), iVar.f(), obj, iVar.d());
            if (obj instanceof f) {
                com.bytedance.rpc.log.b.b(null, format);
            } else {
                com.bytedance.rpc.log.b.a(format);
            }
        }
        com.bytedance.rpc.transport.k[] i2 = f2.i().i();
        if (i2.length > 0) {
            j.b bVar = new j.b();
            bVar.l(obj);
            bVar.h(f2.g());
            bVar.i(lVar.d());
            bVar.k(lVar.e());
            bVar.j(lVar.f9635g);
            bVar.g(lVar.h);
            if (iVar != null) {
                bVar.e(iVar.e());
                bVar.f(iVar.f());
                bVar.d(iVar.d());
                bVar.c(iVar.c());
                bVar.b(iVar.b());
            }
            com.bytedance.rpc.transport.j a2 = bVar.a();
            com.bytedance.rpc.transport.g g3 = lVar.g();
            if (g3 == null) {
                g3 = com.bytedance.rpc.transport.g.i(f2.g()).h();
            }
            for (com.bytedance.rpc.transport.k kVar : i2) {
                try {
                    kVar.a(a2, g3);
                } catch (Throwable th) {
                    if (com.bytedance.rpc.log.b.e()) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    Object j(m mVar) {
        if (e.b.l.q.c.a(this.f9624e.h())) {
            throw new RuntimeException(String.format("did you add any rpc-adapter in your dependence ,no serialize factory found", new Object[0]));
        }
        e.b.l.b bVar = null;
        e.b.l.p.c[] g2 = mVar.i().g();
        if (g2.length > 0) {
            for (e.b.l.p.c cVar : g2) {
                try {
                    e.b.l.b invoke = cVar.invoke(mVar.l(), mVar);
                    if (invoke != null) {
                        bVar = invoke;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        if (bVar == null) {
            return a(mVar);
        }
        k(mVar);
        return bVar.a(this, mVar);
    }

    void l(com.bytedance.rpc.serialize.e eVar) {
        this.f9624e.k(eVar);
    }

    void m(l lVar, Object obj) {
        m f2 = lVar.f();
        if (f2 != null) {
            try {
                e.b.l.p.a c2 = f2.c();
                if (c2 != null && f2.m()) {
                    if (obj instanceof f) {
                        f fVar = (f) obj;
                        lVar.h = System.currentTimeMillis();
                        c2.a(fVar);
                        f(f2, fVar);
                        i(lVar, fVar, null);
                    } else {
                        c2.onSuccess(obj);
                    }
                }
                if (obj instanceof f) {
                    f fVar2 = (f) obj;
                    lVar.h = System.currentTimeMillis();
                    f(f2, fVar2);
                    i(lVar, fVar2, null);
                }
            } finally {
                lVar.b();
                this.a.remove(Integer.valueOf(f2.g()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    com.bytedance.rpc.transport.g n(e.b.l.m r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.l.i.n(e.b.l.m):com.bytedance.rpc.transport.g");
    }

    void o(int i2, String str) {
        f.b o = f.o(new RuntimeException("this request intercepted by your RpcInterceptor"));
        o.c(987654325);
        o.f(i2);
        o.g(str);
        throw o.b();
    }
}
