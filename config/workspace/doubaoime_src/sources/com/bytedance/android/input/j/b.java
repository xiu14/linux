package com.bytedance.android.input.j;

import com.bytedance.android.input.j.a;
import com.bytedance.android.input.r.j;
import com.prolificinteractive.materialcalendarview.r;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.g;
import kotlin.h;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b {
    public static final b a = new b();
    private static final List<com.bytedance.android.input.j.a> b;

    /* renamed from: c, reason: collision with root package name */
    private static final e f2446c;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements a.InterfaceC0077a {
        private final List<com.bytedance.android.input.j.a> a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final c f2447c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends com.bytedance.android.input.j.a> list, int i, c cVar) {
            l.f(list, "interceptors");
            l.f(cVar, "request");
            this.a = list;
            this.b = i;
            this.f2447c = cVar;
        }

        public d a(c cVar) {
            l.f(cVar, "request");
            if (this.b >= this.a.size()) {
                l.f(cVar, "request");
                return new d(cVar.a(), cVar.b(), false, "", 0);
            }
            return this.a.get(this.b).a(new a(this.a, this.b + 1, cVar));
        }

        public c b() {
            return this.f2447c;
        }
    }

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        b = copyOnWriteArrayList;
        e eVar = new e();
        f2446c = eVar;
        l.f(eVar, "interceptor");
        if (!copyOnWriteArrayList.contains(eVar)) {
            copyOnWriteArrayList.add(eVar);
        }
        f fVar = new f();
        l.f(fVar, "interceptor");
        if (copyOnWriteArrayList.contains(fVar)) {
            return;
        }
        copyOnWriteArrayList.add(fVar);
    }

    private b() {
    }

    public static final void a() {
        Object J2;
        try {
            f2446c.b();
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b2 = h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.P0(b2, e.a.a.a.a.M("[ImeCommitInterceptor] notifyUserCursorMoved error, err="), "ImeCommitInterceptorManager");
        }
    }

    public static final d b(c cVar) {
        Object J2;
        l.f(cVar, "request");
        List<com.bytedance.android.input.j.a> list = b;
        if (list.isEmpty()) {
            l.f(cVar, "request");
            return new d(cVar.a(), cVar.b(), false, "", 0);
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            List e0 = g.e0(list);
            J2 = new a(e0, 0, cVar).a(cVar);
            j.i("ImeCommitInterceptorManager", "[ImeCommitInterceptor] interceptors size=" + e0.size() + ", cost=" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b2 = h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.P0(b2, e.a.a.a.a.Q("[ImeCommitInterceptor] interceptors error, cost=", System.currentTimeMillis() - currentTimeMillis, "ms, err="), "ImeCommitInterceptorManager");
        }
        l.f(cVar, "request");
        d dVar = new d(cVar.a(), cVar.b(), false, "", 0);
        if (J2 instanceof h.a) {
            J2 = dVar;
        }
        return (d) J2;
    }

    public static final boolean c() {
        Object J2;
        try {
            J2 = Boolean.valueOf(f2446c.c());
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b2 = h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.P0(b2, e.a.a.a.a.M("[ImeCommitInterceptor] removeAutoAppendedSpaceBeforeAction error, err="), "ImeCommitInterceptorManager");
        }
        Boolean bool = Boolean.FALSE;
        if (J2 instanceof h.a) {
            J2 = bool;
        }
        return ((Boolean) J2).booleanValue();
    }
}
