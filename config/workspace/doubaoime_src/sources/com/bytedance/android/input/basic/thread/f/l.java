package com.bytedance.android.input.basic.thread.f;

import com.bytedance.android.input.basic.thread.ImeThreadPoolType;
import com.bytedance.android.input.basic.thread.b;
import com.bytedance.android.input.basic.thread.e;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0798e0;
import kotlinx.coroutines.G;
import kotlinx.coroutines.r0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l {
    public static final l a = new l();
    private static volatile com.bytedance.android.input.basic.thread.b b = new b.a().a();

    /* renamed from: c, reason: collision with root package name */
    private static volatile com.bytedance.android.input.basic.thread.d f2146c = new h();

    /* renamed from: d, reason: collision with root package name */
    private static volatile com.bytedance.android.input.basic.thread.c f2147d = new g();

    /* renamed from: e, reason: collision with root package name */
    private static volatile int f2148e = 30;

    /* renamed from: f, reason: collision with root package name */
    private static volatile int f2149f = 15;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<ExecutorService> f2150g;
    private static final kotlin.e h;
    private static final kotlin.e i;
    private static final kotlin.e j;
    private static final kotlin.e k;
    private static final kotlin.e l;
    private static final kotlin.e m;
    private static final kotlin.e n;
    private static final kotlin.e o;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<ExecutorService> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public ExecutorService invoke() {
            m mVar = m.a;
            ImeThreadPoolType imeThreadPoolType = ImeThreadPoolType.BACKGROUND;
            kotlin.s.c.l.f(imeThreadPoolType, "type");
            ExecutorService a2 = m.a(new e.a(imeThreadPoolType).a(), true);
            l.f2150g.add(a2);
            return a2;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.a<G> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public G invoke() {
            return r.b(r.d0((r0) C0795d.a(null, 1), new C0798e0(l.a(l.a))));
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.a<ExecutorService> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public ExecutorService invoke() {
            m mVar = m.a;
            ImeThreadPoolType imeThreadPoolType = ImeThreadPoolType.CPU;
            kotlin.s.c.l.f(imeThreadPoolType, "type");
            ExecutorService a2 = m.a(new e.a(imeThreadPoolType).a(), true);
            l.f2150g.add(a2);
            return a2;
        }
    }

    static final class d extends kotlin.s.c.m implements kotlin.s.b.a<G> {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public G invoke() {
            return r.b(r.d0((r0) C0795d.a(null, 1), new C0798e0(l.c(l.a))));
        }
    }

    static final class e extends kotlin.s.c.m implements kotlin.s.b.a<ExecutorService> {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public ExecutorService invoke() {
            l lVar = l.a;
            m mVar = m.a;
            ImeThreadPoolType imeThreadPoolType = ImeThreadPoolType.IO;
            kotlin.s.c.l.f(imeThreadPoolType, "type");
            e.a aVar = new e.a(imeThreadPoolType);
            aVar.d(128);
            ExecutorService a2 = m.a(aVar.a(), true);
            l.f2150g.add(a2);
            return a2;
        }
    }

    static final class f extends kotlin.s.c.m implements kotlin.s.b.a<G> {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public G invoke() {
            return r.b(r.d0((r0) C0795d.a(null, 1), new C0798e0(l.d(l.a))));
        }
    }

    public static final class g implements com.bytedance.android.input.basic.thread.c {
        g() {
        }

        @Override // com.bytedance.android.input.basic.thread.c
        public void d(String str, String str2) {
            kotlin.s.c.l.f(str, "tag");
            kotlin.s.c.l.f(str2, "msg");
        }

        @Override // com.bytedance.android.input.basic.thread.c
        public void w(String str, String str2) {
            kotlin.s.c.l.f(str, "tag");
            kotlin.s.c.l.f(str2, "msg");
        }
    }

    public static final class h implements com.bytedance.android.input.basic.thread.d {
        h() {
        }

        @Override // com.bytedance.android.input.basic.thread.d
        public void a(JSONObject jSONObject) {
            kotlin.s.c.l.f(jSONObject, DBDefinition.SEGMENT_INFO);
        }

        @Override // com.bytedance.android.input.basic.thread.d
        public boolean b() {
            return false;
        }

        @Override // com.bytedance.android.input.basic.thread.d
        public void c(JSONObject jSONObject) {
            kotlin.s.c.l.f(jSONObject, DBDefinition.SEGMENT_INFO);
        }

        @Override // com.bytedance.android.input.basic.thread.d
        public void d(JSONObject jSONObject) {
            kotlin.s.c.l.f(jSONObject, DBDefinition.SEGMENT_INFO);
        }

        @Override // com.bytedance.android.input.basic.thread.d
        public boolean e() {
            return false;
        }

        @Override // com.bytedance.android.input.basic.thread.d
        public boolean f() {
            return false;
        }

        @Override // com.bytedance.android.input.basic.thread.d
        public void g(JSONObject jSONObject) {
            kotlin.s.c.l.f(jSONObject, DBDefinition.SEGMENT_INFO);
        }

        @Override // com.bytedance.android.input.basic.thread.d
        public boolean h() {
            return false;
        }
    }

    static final class i extends kotlin.s.c.m implements kotlin.s.b.a<ScheduledExecutorService> {
        public static final i a = new i();

        i() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public ScheduledExecutorService invoke() {
            m mVar = m.a;
            ImeThreadPoolType imeThreadPoolType = ImeThreadPoolType.SCHEDULED;
            kotlin.s.c.l.f(imeThreadPoolType, "type");
            e.a aVar = new e.a(imeThreadPoolType);
            aVar.b(3);
            ExecutorService a2 = m.a(aVar.a(), true);
            kotlin.s.c.l.d(a2, "null cannot be cast to non-null type java.util.concurrent.ScheduledExecutorService");
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) a2;
            l.f2150g.add(scheduledExecutorService);
            return scheduledExecutorService;
        }
    }

    static final class j extends kotlin.s.c.m implements kotlin.s.b.a<G> {
        public static final j a = new j();

        j() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public G invoke() {
            return r.b(r.d0((r0) C0795d.a(null, 1), new C0798e0(l.e(l.a))));
        }
    }

    static {
        Set<ExecutorService> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        kotlin.s.c.l.e(newSetFromMap, "newSetFromMap(java.util.…rent.ConcurrentHashMap())");
        f2150g = newSetFromMap;
        h = kotlin.a.c(e.a);
        i = kotlin.a.c(c.a);
        j = kotlin.a.c(a.a);
        k = kotlin.a.c(i.a);
        l = kotlin.a.c(f.a);
        m = kotlin.a.c(d.a);
        n = kotlin.a.c(b.a);
        o = kotlin.a.c(j.a);
    }

    private l() {
    }

    public static final ExecutorService a(l lVar) {
        return (ExecutorService) j.getValue();
    }

    public static final ExecutorService c(l lVar) {
        return (ExecutorService) i.getValue();
    }

    public static final ExecutorService d(l lVar) {
        return (ExecutorService) h.getValue();
    }

    public static final ScheduledExecutorService e(l lVar) {
        return (ScheduledExecutorService) k.getValue();
    }

    public final com.bytedance.android.input.basic.thread.b f() {
        return b;
    }

    public final ExecutorService g() {
        return (ExecutorService) h.getValue();
    }

    public final int h() {
        return f2148e;
    }

    public final com.bytedance.android.input.basic.thread.d i() {
        return f2146c;
    }

    public final int j() {
        return f2149f;
    }

    public final boolean k(String str) {
        if (str.length() == 0) {
            return false;
        }
        List<String> c2 = b.c();
        if (!(c2 instanceof Collection) || !c2.isEmpty()) {
            Iterator<T> it2 = c2.iterator();
            while (it2.hasNext()) {
                if (kotlin.text.a.d(str, (String) it2.next(), false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean l(ExecutorService executorService) {
        kotlin.s.c.l.f(executorService, "executor");
        return f2150g.contains(executorService);
    }

    public final void m(String str, String str2) {
        kotlin.s.c.l.f(str, "tag");
        kotlin.s.c.l.f(str2, "msg");
        if (b.a()) {
            f2147d.d(str, str2);
        }
    }

    public final void n(String str, String str2) {
        kotlin.s.c.l.f(str, "tag");
        kotlin.s.c.l.f(str2, "msg");
        f2147d.w(str, str2);
    }

    public final void o(com.bytedance.android.input.basic.thread.b bVar) {
        kotlin.s.c.l.f(bVar, "<set-?>");
        b = bVar;
    }

    public final void p(com.bytedance.android.input.basic.thread.c cVar) {
        kotlin.s.c.l.f(cVar, "<set-?>");
        f2147d = cVar;
    }

    public final void q(com.bytedance.android.input.basic.thread.d dVar) {
        kotlin.s.c.l.f(dVar, "<set-?>");
        f2146c = dVar;
    }
}
