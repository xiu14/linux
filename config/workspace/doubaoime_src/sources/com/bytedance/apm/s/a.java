package com.bytedance.apm.s;

import android.app.Activity;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.apm.agent.v2.instrumentation.BatteryAgent;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.s.k.h;
import com.bytedance.apm.s.k.i;
import com.bytedance.apm.s.k.j;
import com.bytedance.apm.s.k.k;
import com.bytedance.apm.s.k.l;
import com.bytedance.apm.s.l.a;
import com.bytedance.crash.dumper.Scraps;
import com.bytedance.monitor.util.thread.AsyncTaskType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.bytedance.apm.B.a implements a.b {
    private static final Object z = new Object();
    private volatile boolean i;
    private volatile long k;
    private boolean n;
    private volatile boolean o;
    private String q;
    private HashMap<Integer, com.bytedance.apm.B.k.a> s;
    private HashMap<Integer, com.bytedance.apm.B.k.a> t;
    private long u;
    private HashMap<String, Integer> v;
    private boolean w;
    private final com.bytedance.monitor.util.thread.e x;
    private final com.bytedance.monitor.util.thread.e y;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, l> f3474g = new ConcurrentHashMap();
    private volatile long h = -1;
    private volatile boolean j = false;
    private volatile long l = 30;
    private volatile long m = -1;
    private int p = 32;
    private String[] r = new String[2];

    /* renamed from: com.bytedance.apm.s.a$a, reason: collision with other inner class name */
    class RunnableC0121a implements Runnable {
        final /* synthetic */ boolean a;

        RunnableC0121a(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.z) {
                try {
                    if (com.bytedance.apm.g.B()) {
                        com.bytedance.apm.y.d.d("<monitor><battery>", "ChargingStatusChange:" + this.a);
                    }
                    boolean t = a.t(a.this);
                    Iterator it2 = a.this.f3474g.values().iterator();
                    while (it2.hasNext()) {
                        ((l) it2.next()).d(this.a, t);
                    }
                } finally {
                    a.this.w = this.a;
                }
                a.this.w = this.a;
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.z) {
                try {
                    if (com.bytedance.apm.g.B()) {
                        com.bytedance.apm.y.d.d("<monitor><battery>", "onChangeToFront, record data");
                    }
                    com.bytedance.apm.y.a.b("APM-Battery", "ToFrontIn");
                    boolean G = a.this.G(true);
                    Iterator it2 = a.this.f3474g.values().iterator();
                    while (it2.hasNext()) {
                        ((l) it2.next()).f(G);
                    }
                } finally {
                    com.bytedance.apm.s.j.a.g().l(ActivityLifeObserver.getInstance().getTopActivityClassName());
                    a.this.i = true;
                }
                com.bytedance.apm.s.j.a.g().l(ActivityLifeObserver.getInstance().getTopActivityClassName());
                a.this.i = true;
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.z) {
                try {
                    boolean z = true;
                    if (com.bytedance.apm.g.B()) {
                        com.bytedance.apm.y.d.d("<monitor><battery>", "onTimer record, current is background? : " + ActivityLifeObserver.getInstance().isForeground());
                    }
                    com.bytedance.apm.y.a.b("APM-Battery", "OnTimerIn");
                    boolean G = a.this.G(true);
                    Iterator it2 = a.this.f3474g.values().iterator();
                    while (it2.hasNext()) {
                        ((l) it2.next()).a(G);
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (a.this.j) {
                        if (elapsedRealtime - a.this.m <= a.this.l * com.heytap.mcssdk.constant.a.f6886d) {
                            z = false;
                        }
                        if (com.bytedance.apm.g.F() && z) {
                            com.bytedance.apm.s.j.a.g().h(false);
                            a.this.m = elapsedRealtime;
                        }
                    }
                } finally {
                }
            }
        }
    }

    class d implements com.bytedance.monitor.util.thread.e {
        d() {
        }

        @Override // com.bytedance.monitor.util.thread.e
        public AsyncTaskType M() {
            return AsyncTaskType.LIGHT_WEIGHT;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.g();
        }
    }

    class e implements com.bytedance.monitor.util.thread.e {
        e() {
        }

        @Override // com.bytedance.monitor.util.thread.e
        public AsyncTaskType M() {
            return AsyncTaskType.LIGHT_WEIGHT;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.p(a.this);
                com.bytedance.apm.F.b.e().d(a.this.y, (a.this.i ? a.this.v.containsKey("cpu_monitor_thread_front_capture_period") ? ((Integer) a.this.v.get("cpu_monitor_thread_front_capture_period")).intValue() : 5 : a.this.v.containsKey("cpu_monitor_thread_background_capture_period") ? ((Integer) a.this.v.get("cpu_monitor_thread_background_capture_period")).intValue() : 20) * 1000);
            } catch (Throwable th) {
                com.bytedance.services.apm.api.a.e(th, "mUpdateThreadRecordRunnable");
            }
        }
    }

    private static final class f {
        private static final a a = new a(null);
    }

    a(RunnableC0121a runnableC0121a) {
        new ArrayList();
        this.s = new HashMap<>();
        this.t = new HashMap<>();
        this.v = new HashMap<>();
        this.x = new d();
        this.y = new e();
        this.f3229e = Scraps.BATTERY;
    }

    public static a B() {
        return f.a;
    }

    private boolean D() {
        return Build.VERSION.SDK_INT > this.p;
    }

    private void F(String str) {
        if (D()) {
            return;
        }
        com.bytedance.apm.y.a.b("APM-Battery", "ToFront:" + str);
        com.bytedance.apm.s.j.a.g().l(str);
        com.bytedance.apm.F.b.e().c(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
    
        if (r3 > ((r20.v.containsKey("cpu_monitor_front_valid_duration") ? r20.v.get("cpu_monitor_front_valid_duration").intValue() : 20) * 1000)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f5, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f3, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f1, code lost:
    
        if (r3 > ((r20.v.containsKey("cpu_monitor_background_duration") ? r20.v.get("cpu_monitor_background_duration").intValue() : 60) * 1000)) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean G(boolean r21) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.s.a.G(boolean):boolean");
    }

    private void H() {
        this.s.clear();
        this.t.clear();
        LinkedList<com.bytedance.apm.B.k.a> T = com.bytedance.android.input.k.b.a.T(Process.myPid());
        if (T == null || T.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.apm.B.k.a> it2 = T.iterator();
        while (it2.hasNext()) {
            com.bytedance.apm.B.k.a next = it2.next();
            this.s.put(Integer.valueOf(next.a), next);
        }
    }

    static void p(a aVar) {
        LinkedList<com.bytedance.apm.B.k.a> T;
        if (aVar.s.isEmpty() || (T = com.bytedance.android.input.k.b.a.T(Process.myPid())) == null || T.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.apm.B.k.a> it2 = T.iterator();
        while (it2.hasNext()) {
            com.bytedance.apm.B.k.a next = it2.next();
            long j = aVar.s.containsKey(Integer.valueOf(next.a)) ? next.f3265c - aVar.s.get(Integer.valueOf(next.a)).f3265c : next.f3265c;
            if (j > 0) {
                long j2 = (long) ((j / aVar.u) * 1000.0d);
                if (aVar.t.containsKey(Integer.valueOf(next.a))) {
                    aVar.t.get(Integer.valueOf(next.a)).f3265c = j2;
                } else {
                    aVar.t.put(Integer.valueOf(next.a), new com.bytedance.apm.B.k.a(next.a, next.b, j2));
                }
            }
        }
    }

    static boolean t(a aVar) throws JSONException {
        return aVar.G(false);
    }

    private boolean z() {
        return BatteryAgent.hasHook() && !(this.v.containsKey("cpu_monitor_enable") && this.v.get("cpu_monitor_enable").intValue() == 0);
    }

    public Map<String, l> A() {
        return this.f3474g;
    }

    public void C(boolean z2) {
        this.n = z2;
        c();
    }

    public boolean E() {
        return this.o;
    }

    @Override // com.bytedance.apm.s.l.a.b
    public void a(boolean z2) {
        if (this.f3474g.isEmpty()) {
            return;
        }
        com.bytedance.apm.s.j.a.g().l(ActivityLifeObserver.getInstance().getTopActivityClassName());
        com.bytedance.apm.F.b.e().c(new RunnableC0121a(z2));
    }

    @Override // com.bytedance.apm.B.a
    protected void b(JSONObject jSONObject) {
        this.k = jSONObject.optLong("battery_record_interval", 10L);
        this.l = jSONObject.optLong("battery_report_interval", 30L);
        int optInt = jSONObject.optInt("enable_upload", 0);
        this.j = optInt == 1 && this.k > 0;
        this.p = jSONObject.optInt("support_max_api_level", this.p);
        if (com.bytedance.apm.g.B()) {
            StringBuilder M = e.a.a.a.a.M("mRecordInterval:");
            M.append(this.k);
            M.append(",mBatteryCollectEnabled");
            M.append(optInt);
            com.bytedance.apm.y.d.c("<monitor><battery>", M.toString());
        }
        if (!this.j && !this.n) {
            this.f3474g.clear();
            ActivityLifeObserver.getInstance().unregister(this);
            com.bytedance.apm.s.l.a.f(com.bytedance.apm.g.h(), this);
        } else if (jSONObject.optInt("battery_net_for_all_interface_enable", 0) == 1) {
            this.f3474g.put("traffic_all_interface", new i());
        }
        this.o = jSONObject.optInt("trace_enable", 0) == 1;
        if (this.o) {
            com.bytedance.apm.s.h.a.k(jSONObject.optLong("max_single_wake_lock_hold_time_second", 120L) * 1000);
            com.bytedance.apm.s.h.a.n(jSONObject.optInt("max_total_wake_lock_acquire_count", 5));
            com.bytedance.apm.s.h.a.o(jSONObject.optLong("max_total_wake_lock_hold_time_second", 240L) * 1000);
            com.bytedance.apm.s.h.a.p(jSONObject.optInt("max_wake_up_alarm_invoke_count", 5));
            com.bytedance.apm.s.h.a.i(jSONObject.optInt("max_normal_alarm_invoke_count", 10));
            com.bytedance.apm.s.h.a.j(jSONObject.optLong("max_single_loc_request_time_second", 120L) * 1000);
            com.bytedance.apm.s.h.a.l(jSONObject.optInt("max_total_loc_request_count", 5));
            com.bytedance.apm.s.h.a.m(jSONObject.optLong("max_total_loc_request_time_second", 240L) * 1000);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("cpu_monitor_config");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ("cpu_monitor_enable".equals(next)) {
                    this.v.put(next, Integer.valueOf(optJSONObject.optInt(next, 1)));
                } else {
                    int optInt2 = optJSONObject.optInt(next, 0);
                    if (optInt2 > 0) {
                        this.v.put(next, Integer.valueOf(optInt2));
                    }
                }
            }
        }
        com.bytedance.android.input.k.b.a.s0(jSONObject, "scene_black_list");
        if (z()) {
            com.bytedance.apm.F.b.e().c(this.y);
            H();
        }
    }

    @Override // com.bytedance.apm.B.a
    protected boolean e() {
        return false;
    }

    @Override // com.bytedance.apm.B.a
    public void f() {
        if (D()) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("Battery init process");
        M.append(com.bytedance.apm.g.i());
        com.bytedance.apm.y.a.b("APM-Battery", M.toString());
        this.i = ActivityLifeObserver.getInstance().isForeground();
        this.r[1] = ActivityLifeObserver.getInstance().getTopActivityClassName();
        this.u = com.bytedance.apm.util.b.e(100L);
        this.w = com.bytedance.apm.s.l.a.d(com.bytedance.apm.g.h(), this);
        com.bytedance.apm.s.k.d dVar = new com.bytedance.apm.s.k.d();
        com.bytedance.apm.s.k.g gVar = new com.bytedance.apm.s.k.g();
        k kVar = new k();
        try {
            com.bytedance.apm.s.i.a aVar = new com.bytedance.apm.s.i.a();
            aVar.a(NotificationCompat.CATEGORY_ALARM, dVar);
            aVar.a("location", gVar);
            aVar.a("power", kVar);
            aVar.b();
            this.f3474g.put(NotificationCompat.CATEGORY_ALARM, dVar);
            this.f3474g.put("location", gVar);
            this.f3474g.put("power", kVar);
        } catch (Throwable th) {
            StringBuilder M2 = e.a.a.a.a.M("SYSTEM_SERVICE_FETCHERS hook failed: ");
            M2.append(th.getMessage());
            com.bytedance.apm.y.a.a("APM-Battery", M2.toString());
        }
        com.bytedance.apm.s.k.f fVar = new com.bytedance.apm.s.k.f();
        j jVar = new j();
        h hVar = new h();
        com.bytedance.apm.s.k.e eVar = new com.bytedance.apm.s.k.e();
        this.f3474g.put("cpu_active_time", fVar);
        this.f3474g.put("traffic", jVar);
        this.f3474g.put("traffic_packets", hVar);
        this.f3474g.put("battery_consume", eVar);
        this.m = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.apm.B.a
    public void g() {
        if (D() || this.f3474g.isEmpty()) {
            return;
        }
        com.bytedance.apm.y.a.b("APM-Battery", "OnTimer");
        long j = this.k * com.heytap.mcssdk.constant.a.f6886d;
        if (j > 0) {
            com.bytedance.apm.F.b.e().d(this.x, j);
        }
        com.bytedance.apm.s.j.a.g().l(ActivityLifeObserver.getInstance().getTopActivityClassName());
        com.bytedance.apm.F.b.e().c(new c());
    }

    @Override // com.bytedance.apm.B.a
    protected long k() {
        return this.k * com.heytap.mcssdk.constant.a.f6886d;
    }

    @Override // com.bytedance.apm.B.a, com.bytedance.services.apm.api.d
    public void onActivityResume(Activity activity) {
        String[] strArr = this.r;
        strArr[0] = strArr[1];
        strArr[1] = activity.getClass().getName();
        if (!TextUtils.equals(activity.getClass().getName(), this.q) && !TextUtils.isEmpty(this.r[0])) {
            F(this.r[0]);
        }
        this.q = null;
    }

    @Override // com.bytedance.apm.B.a, com.bytedance.services.apm.api.d
    public void onBackground(Activity activity) {
        super.onBackground(activity);
        if (D()) {
            return;
        }
        com.bytedance.apm.y.a.b("APM-Battery", "ToBack");
        com.bytedance.apm.s.j.a.g().l(ActivityLifeObserver.getInstance().getTopActivityClassName());
        com.bytedance.apm.F.b.e().c(new com.bytedance.apm.s.b(this));
    }

    @Override // com.bytedance.apm.B.a, com.bytedance.services.apm.api.d
    public void onFront(Activity activity) {
        super.onFront(activity);
        this.q = activity.getClass().getName();
        F(ActivityLifeObserver.getInstance().getTopActivityClassName());
    }

    @Override // com.bytedance.apm.B.a, com.bytedance.services.slardar.config.a
    public void onReady() {
        super.onReady();
        if (com.bytedance.apm.g.F() && this.j) {
            com.bytedance.apm.s.j.a.g().h(true);
            this.m = SystemClock.elapsedRealtime();
        }
    }
}
