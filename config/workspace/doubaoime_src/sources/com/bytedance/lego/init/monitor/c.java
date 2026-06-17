package com.bytedance.lego.init.monitor;

import android.annotation.SuppressLint;
import android.util.Log;
import android.util.Pair;
import com.bytedance.lego.init.InitScheduler;
import com.bytedance.lego.init.x;
import com.bytedance.services.apm.api.IApmAgent;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.e;
import kotlin.reflect.i;
import kotlin.s.c.A;
import kotlin.s.c.l;
import kotlin.s.c.m;
import kotlin.s.c.t;
import org.json.JSONObject;

@SuppressLint({"CI_ByteDanceKotlinRules_Static_Names"})
/* loaded from: classes.dex */
public final class c {
    static final /* synthetic */ i[] a;
    private static final CopyOnWriteArrayList<Pair<String, Long>> b;

    /* renamed from: c, reason: collision with root package name */
    private static final e f5319c;

    /* renamed from: d, reason: collision with root package name */
    private static long f5320d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f5321e;

    static final class a extends m implements kotlin.s.b.a<IApmAgent> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public IApmAgent invoke() {
            return (IApmAgent) x.b.a(IApmAgent.class);
        }
    }

    static {
        t tVar = new t(A.b(c.class), "iApmAgent", "getIApmAgent()Lcom/bytedance/services/apm/api/IApmAgent;");
        A.g(tVar);
        a = new i[]{tVar};
        f5321e = new c();
        b = new CopyOnWriteArrayList<>();
        f5319c = kotlin.a.c(a.a);
        f5320d = -1L;
    }

    private c() {
    }

    private final void a(String str, long j) {
        b.add(new Pair<>(str, Long.valueOf(j)));
    }

    private final String e(boolean z) {
        return z ? InitMonitor.MAIN : InitMonitor.ASYNC;
    }

    public final void b(String str, long j, boolean z) {
        l.g(str, DBDefinition.TASK_ID);
        a(e.a.a.a.a.K(new StringBuilder(), e(z), "Task-", str), j);
    }

    public final void c(String str, boolean z) {
        l.g(str, DBDefinition.TASK_ID);
        if (f5320d > 0) {
            a(e.a.a.a.a.K(new StringBuilder(), e(z), str, InitMonitor.TASK_END_SUFFIX), System.currentTimeMillis() - f5320d);
        }
    }

    public final void d(String str, boolean z) {
        l.g(str, DBDefinition.TASK_ID);
        if (f5320d > 0) {
            a(e.a.a.a.a.K(new StringBuilder(), e(z), str, InitMonitor.TASK_START_SUFFIX), System.currentTimeMillis() - f5320d);
        }
    }

    public final void f() {
        e eVar = f5319c;
        i iVar = a[0];
        if (((IApmAgent) eVar.getValue()) == null) {
            l.g("IdleTaskMonitor", "classname");
            l.g("ServiceManager.getService(IApmAgent::class.java) is null.", "message");
            Log.e("#inittask#", "IdleTaskMonitor ServiceManager.getService(IApmAgent::class.java) is null.");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<T> it2 = b.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                String str = (String) pair.first;
                Object obj = pair.second;
                l.b(obj, "it.second");
                jSONObject.put(str, ((Number) obj).longValue());
            }
        } catch (Throwable unused) {
        }
        com.bytedance.lego.init.z.a.a.a("IdleTaskMonitor", "sendIdleTaskMonitor " + jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(PushLog.KEY_CATEGORY, InitScheduler.INSTANCE.getINIT_SCHEDULER_CATEGORY$initscheduler_release());
        e eVar2 = f5319c;
        i iVar2 = a[0];
        IApmAgent iApmAgent = (IApmAgent) eVar2.getValue();
        if (iApmAgent != null) {
            iApmAgent.monitorEvent("idle_task_monitor", jSONObject2, jSONObject, new JSONObject());
        }
        b.clear();
    }

    public final void g(long j) {
        f5320d = j;
    }
}
