package com.bytedance.android.input.basic.thread.f;

import android.os.SystemClock;
import com.bytedance.android.input.basic.thread.ImeThreadPoolType;
import com.bytedance.android.input.basic.thread.e;
import com.prolificinteractive.materialcalendarview.r;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.h;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n {
    public static final n a = new n();
    private static final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final WeakHashMap<j, Object> f2152c = new WeakHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static final ReentrantLock f2153d = new ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    private static final kotlin.e f2154e = kotlin.a.c(a.a);

    /* renamed from: f, reason: collision with root package name */
    private static final kotlin.e f2155f = kotlin.a.c(b.a);

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<ScheduledExecutorService> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public ScheduledExecutorService invoke() {
            l lVar = l.a;
            ImeThreadPoolType imeThreadPoolType = ImeThreadPoolType.SCHEDULED;
            kotlin.s.c.l.f(imeThreadPoolType, "type");
            e.a aVar = new e.a(imeThreadPoolType);
            aVar.b(1);
            aVar.c("TaskMonitor");
            com.bytedance.android.input.basic.thread.e a2 = aVar.a();
            kotlin.s.c.l.f(a2, "options");
            m mVar = m.a;
            ExecutorService a3 = m.a(a2, false);
            kotlin.s.c.l.d(a3, "null cannot be cast to non-null type java.util.concurrent.ScheduledExecutorService");
            return (ScheduledExecutorService) a3;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public kotlin.o invoke() {
            l lVar = l.a;
            long d2 = lVar.f().d();
            lVar.m("ThreadPool-TaskMonitor", "taskBlockedTimeout=" + d2);
            final n nVar = n.a;
            nVar.d().scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.android.input.basic.thread.f.a
                @Override // java.lang.Runnable
                public final void run() {
                    n.b(n.this);
                }
            }, d2, d2, TimeUnit.MILLISECONDS);
            return kotlin.o.a;
        }
    }

    private n() {
    }

    public static final void b(n nVar) {
        StackTraceElement[] stackTrace;
        Objects.requireNonNull(nVar);
        l lVar = l.a;
        com.bytedance.android.input.basic.thread.d i = lVar.i();
        if (i.h()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long d2 = lVar.f().d();
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = f2153d;
            reentrantLock.lock();
            try {
                WeakHashMap<j, Object> weakHashMap = f2152c;
                if (weakHashMap.isEmpty()) {
                    return;
                }
                Iterator<Map.Entry<j, Object>> it2 = weakHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    j key = it2.next().getKey();
                    if (uptimeMillis - key.a() >= d2) {
                        arrayList.add(key);
                        it2.remove();
                    }
                }
                reentrantLock.unlock();
                l lVar2 = l.a;
                StringBuilder M = e.a.a.a.a.M("blockedTasks.size: ");
                M.append(arrayList.size());
                lVar2.m("ThreadPool-TaskMonitor", M.toString());
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    j jVar = (j) it3.next();
                    try {
                        o oVar = o.a;
                        String c2 = oVar.c(jVar.c());
                        if (!l.a.k(c2)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("task_name", c2);
                            jSONObject.put("pool_type", jVar.b().c().name());
                            jSONObject.put("pool_size", jVar.b().getPoolSize());
                            jSONObject.put("queue_size", jVar.b().getQueue().size());
                            jSONObject.put("duration", uptimeMillis - jVar.a());
                            Thread d3 = jVar.d();
                            if (d3 != null && (stackTrace = d3.getStackTrace()) != null) {
                                kotlin.s.c.l.e(stackTrace, "stackTrace");
                                jSONObject.put("task_stack", oVar.b(stackTrace));
                            }
                            i.c(jSONObject);
                        }
                    } catch (Throwable th) {
                        r.J(th);
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    private final JSONObject c(WeakReference<Object> weakReference, i iVar, long j) {
        Object obj;
        String c2;
        Object obj2 = weakReference.get();
        if (obj2 == null) {
            return null;
        }
        try {
            c2 = o.a.c(obj2);
        } catch (Throwable th) {
            obj = r.J(th);
        }
        if (l.a.k(c2)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("task_name", c2);
        jSONObject.put("pool_type", iVar.c().name());
        jSONObject.put("pool_size", iVar.getPoolSize());
        jSONObject.put("queue_size", iVar.getQueue().size());
        jSONObject.put("duration", j);
        obj = jSONObject;
        return (JSONObject) (obj instanceof h.a ? null : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduledExecutorService d() {
        return (ScheduledExecutorService) f2154e.getValue();
    }

    public static void e(WeakReference weakReference, i iVar, long j) {
        kotlin.s.c.l.f(weakReference, "$ref");
        kotlin.s.c.l.f(iVar, "$executor");
        JSONObject c2 = a.c(weakReference, iVar, j);
        if (c2 != null) {
            l.a.i().a(c2);
        }
    }

    public static void f(WeakReference weakReference, i iVar, long j) {
        kotlin.s.c.l.f(weakReference, "$ref");
        kotlin.s.c.l.f(iVar, "$executor");
        JSONObject c2 = a.c(weakReference, iVar, j);
        if (c2 != null) {
            l.a.i().d(c2);
        }
    }

    public final void g(Object obj, final i iVar, final long j) {
        kotlin.s.c.l.f(obj, "task");
        kotlin.s.c.l.f(iVar, "executor");
        final WeakReference weakReference = new WeakReference(obj);
        d().execute(new Runnable() { // from class: com.bytedance.android.input.basic.thread.f.f
            @Override // java.lang.Runnable
            public final void run() {
                n.e(weakReference, iVar, j);
            }
        });
    }

    public final void h(final Runnable runnable, final ThreadPoolExecutor threadPoolExecutor) {
        kotlin.s.c.l.f(runnable, "runnable");
        kotlin.s.c.l.f(threadPoolExecutor, "executor");
        if (!l.a.i().b()) {
            return;
        }
        o oVar = o.a;
        Throwable th = new Throwable();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            r.E(printWriter, null);
            final String stringWriter2 = stringWriter.toString();
            kotlin.s.c.l.e(stringWriter2, "sw.toString()");
            d().execute(new Runnable() { // from class: com.bytedance.android.input.basic.thread.f.h
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable c2;
                    Runnable runnable2 = runnable;
                    ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                    String str = stringWriter2;
                    kotlin.s.c.l.f(runnable2, "$runnable");
                    kotlin.s.c.l.f(threadPoolExecutor2, "$executor");
                    kotlin.s.c.l.f(str, "$trace");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        j jVar = runnable2 instanceof j ? (j) runnable2 : null;
                        if (jVar != null && (c2 = jVar.c()) != null) {
                            runnable2 = c2;
                        }
                        jSONObject.put("task_name", runnable2.toString());
                        if (threadPoolExecutor2 instanceof i) {
                            jSONObject.put("pool_type", ((i) threadPoolExecutor2).c().name());
                            jSONObject.put("pool_size", ((i) threadPoolExecutor2).getPoolSize());
                            jSONObject.put("task_stack", str);
                        }
                    } catch (Throwable th2) {
                        r.J(th2);
                    }
                    l.a.i().g(jSONObject);
                }
            });
        } finally {
        }
    }

    public final void i(Object obj, final i iVar, final long j) {
        kotlin.s.c.l.f(obj, "task");
        kotlin.s.c.l.f(iVar, "executor");
        final WeakReference weakReference = new WeakReference(obj);
        d().execute(new Runnable() { // from class: com.bytedance.android.input.basic.thread.f.g
            @Override // java.lang.Runnable
            public final void run() {
                n.f(weakReference, iVar, j);
            }
        });
    }

    public final void j(j jVar) {
        kotlin.s.c.l.f(jVar, "runnable");
        if (l.a.i().h()) {
            f2155f.getValue();
            ReentrantLock reentrantLock = f2153d;
            reentrantLock.lock();
            try {
                f2152c.put(jVar, b);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void k(j jVar) {
        kotlin.s.c.l.f(jVar, "runnable");
        if (l.a.i().h()) {
            ReentrantLock reentrantLock = f2153d;
            reentrantLock.lock();
            try {
                f2152c.remove(jVar);
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
