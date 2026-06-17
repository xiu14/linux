package com.bytedance.frameworks.baselib.network.dispatcher;

import com.bytedance.frameworks.baselib.network.dispatcher.f;

/* loaded from: classes.dex */
public class e implements c {
    private static volatile boolean a = true;
    private static volatile f b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile e f5048c;

    public e() {
        if (b == null) {
            f.b bVar = new f.b();
            bVar.k(8, 8);
            bVar.m(8, 8);
            bVar.j(30L);
            bVar.o(10L);
            bVar.l(10L);
            bVar.n(true);
            b = bVar.i();
        }
    }

    @Deprecated
    public static e c() {
        if (f5048c == null) {
            synchronized (e.class) {
                if (f5048c == null) {
                    f5048c = new e();
                }
            }
        }
        return f5048c;
    }

    public static synchronized f d() {
        f fVar;
        synchronized (e.class) {
            if (b == null) {
                f.b bVar = new f.b();
                bVar.k(8, 8);
                bVar.m(8, 8);
                bVar.j(30L);
                bVar.o(10L);
                bVar.l(10L);
                bVar.n(true);
                b = bVar.i();
            }
            fVar = b;
        }
        return fVar;
    }

    public static synchronized void e(boolean z) {
        synchronized (e.class) {
            a = z;
            if (b != null) {
                b.k(a);
            }
        }
    }

    public static synchronized void f(f fVar) {
        synchronized (e.class) {
            b = fVar;
            b.k(a);
        }
    }

    public synchronized void a(b bVar) {
        d.f5044g.a(bVar);
    }

    public synchronized void b(b bVar) {
        d.f5044g.b(bVar);
    }
}
