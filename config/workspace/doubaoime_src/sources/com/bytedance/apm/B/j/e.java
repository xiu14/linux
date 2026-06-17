package com.bytedance.apm.B.j;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.apm.g;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: g, reason: collision with root package name */
    private static e f3260g = new e();
    private static boolean h = false;
    private Handler a;
    private ReferenceQueue<Object> b;

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f3261c;

    /* renamed from: d, reason: collision with root package name */
    private com.bytedance.apm.config.a f3262d;

    /* renamed from: e, reason: collision with root package name */
    private long f3263e;

    /* renamed from: f, reason: collision with root package name */
    private volatile com.bytedance.monitor.util.thread.d f3264f;

    static void c(e eVar, com.bytedance.apm.B.j.g.b bVar, String str) {
        if (eVar.f3264f == null) {
            eVar.f3264f = com.bytedance.monitor.util.thread.c.a();
        }
        com.bytedance.monitor.util.thread.d dVar = eVar.f3264f;
        com.bytedance.monitor.util.thread.e d2 = com.bytedance.monitor.util.thread.c.d("LeakCheck-Thread", new b(eVar, bVar, str));
        if (eVar.f3263e <= 0) {
            eVar.f3263e = com.heytap.mcssdk.constant.a.f6886d;
        }
        ((com.bytedance.monitor.util.thread.a) dVar).k(d2, eVar.f3263e);
    }

    static void d(e eVar) {
        while (true) {
            com.bytedance.apm.B.j.g.b bVar = (com.bytedance.apm.B.j.g.b) eVar.b.poll();
            if (bVar == null) {
                return;
            } else {
                eVar.f3261c.remove(bVar.a);
            }
        }
    }

    static boolean e(e eVar, com.bytedance.apm.B.j.g.b bVar) {
        return !eVar.f3261c.contains(bVar.a);
    }

    static void g(e eVar) {
        Objects.requireNonNull(eVar);
        long currentTimeMillis = System.currentTimeMillis();
        Runtime.getRuntime().gc();
        try {
            Thread.sleep(100L);
            System.runFinalization();
            if (g.B()) {
                StringBuilder M = e.a.a.a.a.M("GC time done, cost: ");
                M.append(System.currentTimeMillis() - currentTimeMillis);
                M.append(" ms.");
                com.bytedance.apm.y.d.d("DetectActivityLeakTask", M.toString());
            }
        } catch (InterruptedException unused) {
            throw new AssertionError();
        }
    }

    static void h(e eVar, com.bytedance.apm.B.j.g.b bVar, String str) {
        Objects.requireNonNull(eVar);
        if (g.B()) {
            com.bytedance.apm.y.d.c("DetectActivityLeakTask", e.a.a.a.a.s("Leak:", str));
        }
        Activity activity = (Activity) bVar.get();
        if (activity == null) {
            return;
        }
        if (eVar.f3262d.f()) {
            eVar.a.post(new c(eVar, bVar));
        }
        if (eVar.f3262d.e()) {
            String name = activity.getClass().getName();
            boolean e2 = com.bytedance.apm.D.c.e("activity_leak_event");
            if (g.B()) {
                com.bytedance.apm.y.d.d("ActivityLeakFixer", e.a.a.a.a.A("activity_leak_event : ", e2));
            }
            if (e2 && !TextUtils.isEmpty(name)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(name, 1);
                    com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.b("activity_leak_event", 0, null, jSONObject, null, null));
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            if (g.B()) {
                StringBuilder M = e.a.a.a.a.M("upload leak activity:");
                M.append(activity.getLocalClassName());
                com.bytedance.apm.y.d.d("DetectActivityLeakTask", M.toString());
            }
        }
        eVar.f3261c.remove(bVar.a);
        if (eVar.f3262d.b() != null) {
            kotlin.g[] gVarArr = {new kotlin.g("activity", activity.getLocalClassName())};
            l.f(gVarArr, "pairs");
            HashMap hashMap = new HashMap(kotlin.collections.g.H(1));
            kotlin.collections.g.Q(hashMap, gVarArr);
            l.d(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            com.bytedance.apm.c.g("activity_leak", new JSONObject(hashMap), null, null);
        }
    }

    public static void i(Application application, com.bytedance.apm.config.a aVar) {
        if (application == null || aVar == null || h) {
            return;
        }
        h = true;
        e eVar = f3260g;
        eVar.f3262d = aVar;
        eVar.f3263e = aVar.c();
        long currentTimeMillis = System.currentTimeMillis();
        eVar.a = new Handler(Looper.getMainLooper());
        eVar.b = new ReferenceQueue<>();
        eVar.f3261c = new CopyOnWriteArraySet();
        application.registerActivityLifecycleCallbacks(new a(eVar));
        if (g.B()) {
            StringBuilder M = e.a.a.a.a.M("initActivityLeakCheck done, cost: ");
            M.append(System.currentTimeMillis() - currentTimeMillis);
            M.append(" ms.");
            com.bytedance.apm.y.d.d("DetectActivityLeakTask", M.toString());
        }
    }
}
