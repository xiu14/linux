package com.bytedance.apm.agent.tracing;

import androidx.annotation.WorkerThread;
import com.bytedance.apm.g;
import com.bytedance.apm.v.d.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static long a = 0;
    private static long b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static long f3322c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static long f3323d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static long f3324e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static long f3325f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static long f3326g = 0;
    private static long h = 0;
    private static long i = 0;
    private static long j = 0;
    private static long k = 0;
    private static long l = 0;
    private static long m = 0;
    private static boolean n = false;
    public static String o = null;
    private static long p = 15000;

    /* renamed from: com.bytedance.apm.agent.tracing.a$a, reason: collision with other inner class name */
    static class RunnableC0110a implements Runnable {
        RunnableC0110a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.j();
        }
    }

    public static JSONArray a() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject a0 = e.a.a.a.a.a0("module_name", "base", "span_name", "app_constructor");
        a0.put("start", a);
        a0.put("end", b);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module_name", "base");
        jSONObject.put("span_name", "app_attachBaseContext");
        jSONObject.put("start", f3322c);
        jSONObject.put("end", f3323d);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("module_name", "base");
        jSONObject2.put("span_name", "app_onCreate");
        jSONObject2.put("start", f3324e);
        jSONObject2.put("end", f3325f);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("module_name", "base");
        jSONObject3.put("span_name", "activity_onCreate");
        jSONObject3.put("start", f3326g);
        jSONObject3.put("end", h);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("module_name", "base");
        jSONObject4.put("span_name", "activity_onResume");
        jSONObject4.put("start", k);
        jSONObject4.put("end", l);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("module_name", "base");
        jSONObject5.put("span_name", "activity_onStart");
        jSONObject5.put("start", i);
        jSONObject5.put("end", j);
        if (m > 0) {
            JSONObject a02 = e.a.a.a.a.a0("module_name", "base", "span_name", "activity_onWindowFocusChanged");
            a02.put("start", m);
            jSONArray.put(a02);
        }
        jSONArray.put(a0);
        jSONArray.put(jSONObject);
        jSONArray.put(jSONObject2);
        jSONArray.put(jSONObject3);
        jSONArray.put(jSONObject4);
        jSONArray.put(jSONObject5);
        return jSONArray;
    }

    public static void b(long j2, long j3, long j4, long j5, long j6, long j7) {
        com.bytedance.apm.launch.a b2 = com.bytedance.apm.launch.a.b();
        StringBuilder M = e.a.a.a.a.M("assignAppTime: ");
        M.append(f3325f);
        b2.d(M.toString());
        a = j2;
        b = j3;
        f3322c = j4;
        f3323d = j5;
        f3324e = j6;
        f3325f = j7;
        g.J(j2);
    }

    public static void c() {
        com.bytedance.apm.launch.a b2 = com.bytedance.apm.launch.a.b();
        StringBuilder M = e.a.a.a.a.M("onCreateEnd ");
        M.append(f3326g);
        M.append(" ");
        M.append(h);
        b2.d(M.toString());
        if (h == 0 && n) {
            h = System.currentTimeMillis();
        }
    }

    public static void d(String str) {
        com.bytedance.apm.launch.a b2 = com.bytedance.apm.launch.a.b();
        StringBuilder S = e.a.a.a.a.S(str, " onCreateStart ");
        S.append(f3326g);
        S.append(" ");
        S.append(f3326g - f3325f < 800);
        b2.d(S.toString());
        if (f3326g == 0) {
            f3326g = System.currentTimeMillis();
            com.bytedance.apm.launch.a b3 = com.bytedance.apm.launch.a.b();
            StringBuilder S2 = e.a.a.a.a.S(str, " onCreateStart ");
            S2.append(f3326g);
            S2.append("  ");
            S2.append(f3325f);
            S2.append(" ");
            S2.append(f3326g - f3325f < 800);
            b3.d(S2.toString());
            if (f3326g - f3325f < 800) {
                n = true;
                o = str;
            }
        }
    }

    public static void e() {
        com.bytedance.apm.launch.a b2 = com.bytedance.apm.launch.a.b();
        StringBuilder M = e.a.a.a.a.M("onResumeEnd ");
        M.append(k);
        M.append(" ");
        M.append(l);
        b2.d(M.toString());
        if (l == 0 && n) {
            l = System.currentTimeMillis();
        }
    }

    public static void f(String str) {
        com.bytedance.apm.launch.a b2 = com.bytedance.apm.launch.a.b();
        StringBuilder S = e.a.a.a.a.S(str, " onResume ");
        S.append(k);
        b2.d(S.toString());
        if (k == 0 && n) {
            k = System.currentTimeMillis();
        }
    }

    public static void g() {
        com.bytedance.apm.launch.a b2 = com.bytedance.apm.launch.a.b();
        StringBuilder M = e.a.a.a.a.M("onStartEnd ");
        M.append(i);
        M.append(" ");
        M.append(j);
        b2.d(M.toString());
        if (j == 0 && n) {
            j = System.currentTimeMillis();
        }
    }

    public static void h(String str) {
        com.bytedance.apm.launch.a b2 = com.bytedance.apm.launch.a.b();
        StringBuilder S = e.a.a.a.a.S(str, " onStart ");
        S.append(i);
        b2.d(S.toString());
        if (i == 0 && n) {
            i = System.currentTimeMillis();
        }
    }

    public static void i(String str) {
        com.bytedance.apm.launch.a b2 = com.bytedance.apm.launch.a.b();
        StringBuilder U = e.a.a.a.a.U("OnWindowFocusChanged ", str, " ");
        U.append(m);
        U.append(" ");
        U.append(f3324e);
        U.append(" ");
        U.append(n);
        b2.d(U.toString());
        if (m == 0 && f3324e > 0 && n) {
            m = System.currentTimeMillis();
            o = str;
            n = false;
        }
        com.bytedance.apm.F.b.e().h(new RunnableC0110a());
    }

    @WorkerThread
    public static void j() {
        try {
            if (g.t() == -1) {
                com.bytedance.apm.launch.a.b().d("auto launch mode not init");
                return;
            }
            long j2 = m - a;
            if (j2 > 0 && j2 <= p) {
                JSONArray a2 = a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", "launch_stats");
                jSONObject.put("start", a);
                jSONObject.put("end", m);
                jSONObject.put("spans", a2);
                jSONObject.put("collect_from", 1);
                jSONObject.put("page_name", o);
                jSONObject.put("launch_mode", g.t());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("trace", jSONObject);
                if (g.B()) {
                    com.bytedance.apm.launch.a.b().d("auto span: " + jSONObject);
                }
                com.bytedance.apm.data.pipeline.a.k().d(new d("start_trace", "", null, null, jSONObject2));
            }
        } catch (JSONException unused) {
        }
    }

    public static void k(long j2) {
        p = j2;
    }
}
