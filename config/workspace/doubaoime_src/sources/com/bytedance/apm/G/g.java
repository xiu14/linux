package com.bytedance.apm.G;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm.launch.e;
import com.bytedance.apm.launch.evil.LaunchSleepDetector;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f3311f = true;
    private long a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.bytedance.apm.w.b> f3312c = new ConcurrentHashMap<>(4);

    /* renamed from: d, reason: collision with root package name */
    private final String f3313d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3314e;

    public g(String str, String str2) {
        if (!"start_trace".equals(str) && !"page_load_trace".equals(str)) {
            throw new IllegalStateException("Please add TraceServiceName support on TraceState#reportAsync");
        }
        this.f3313d = str;
        this.f3314e = str2;
    }

    static void c(g gVar, int i, String str, String str2, long j, e.a aVar) {
        JSONObject b;
        Objects.requireNonNull(gVar);
        JSONArray jSONArray = new JSONArray();
        int i2 = 2;
        try {
            if (TextUtils.equals(str2, com.bytedance.apm.agent.tracing.a.o)) {
                jSONArray = com.bytedance.apm.agent.tracing.a.a();
            }
            ConcurrentHashMap<String, com.bytedance.apm.w.b> concurrentHashMap = gVar.f3312c;
            if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                for (Map.Entry<String, com.bytedance.apm.w.b> entry : gVar.f3312c.entrySet()) {
                    String key = entry.getKey();
                    com.bytedance.apm.w.b value = entry.getValue();
                    if (value.b != 0) {
                        JSONObject jSONObject = new JSONObject();
                        String[] split = key.split("#");
                        if (split.length == i2) {
                            if ("page_load_trace".equals(gVar.f3313d)) {
                                jSONObject.put("name", split[1]);
                            } else {
                                jSONObject.put("module_name", split[0]);
                                jSONObject.put("span_name", split[1]);
                            }
                        } else if (split.length == 1) {
                            jSONObject.put("span_name", split[0]);
                        }
                        jSONObject.put("start", value.a);
                        jSONObject.put("end", value.b);
                        jSONObject.put("thread", value.f3615c);
                        jSONArray.put(jSONObject);
                        i2 = 2;
                    }
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        ConcurrentHashMap<String, com.bytedance.apm.w.b> concurrentHashMap2 = gVar.f3312c;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.clear();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("name", gVar.f3314e);
            jSONObject2.put("page_type", gVar.f3314e);
            jSONObject2.put("start", gVar.a);
            jSONObject2.put("end", j);
            jSONObject2.put("spans", jSONArray);
            jSONObject2.put("collect_from", 2);
            jSONObject2.put("page_name", str2);
            if (i != -1) {
                jSONObject2.put("launch_mode", i);
            }
            if (!str.isEmpty()) {
                jSONObject2.put("custom_launch_mode", str);
            }
        } catch (JSONException unused) {
        }
        if (gVar.h() && com.bytedance.apm.launch.a.b().a().b()) {
            JSONObject jSONObject3 = new JSONObject();
            com.bytedance.apm.util.e.g().c(jSONObject3, true);
            com.bytedance.apm.util.e.g().a(jSONObject3, true);
            try {
                jSONObject2.put("device_info_data", jSONObject3);
            } catch (Throwable unused2) {
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject4.put("trace", jSONObject2);
            if (aVar != null && (b = com.bytedance.apm.launch.b.b(aVar)) != null) {
                jSONObject4.put("perf_data", b);
            }
        } catch (JSONException unused3) {
        }
        com.bytedance.apm.v.d.d dVar = new com.bytedance.apm.v.d.d(gVar.f3313d, "", null, null, jSONObject4);
        dVar.f3606f = e.b.b.l.a.a.a().c(false);
        if (com.bytedance.apm.g.B()) {
            String str3 = "reportAsync: " + jSONObject4;
            if (str3 != null && str3.length() != 0) {
                if (str3.length() <= 3072) {
                    Log.d("AppStartStats", str3);
                } else {
                    while (str3.length() > 3072) {
                        String substring = str3.substring(0, 3072);
                        str3 = str3.replace(substring, "");
                        Log.d("AppStartStats", substring);
                    }
                    Log.d("AppStartStats", str3);
                }
            }
        }
        com.bytedance.apm.data.pipeline.a.k().d(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return "start_trace".equals(this.f3313d);
    }

    public void d() {
        this.f3312c.clear();
    }

    public void e(String str, String str2) {
        com.bytedance.apm.w.b bVar = this.f3312c.get(str + "#" + str2);
        if (bVar == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String name = Thread.currentThread().getName();
        bVar.b = currentTimeMillis;
        bVar.f3615c = name;
        this.f3312c.put(str + "#" + str2, bVar);
    }

    public void f(int i, String str, long j, long j2) {
        if (i == -1 && com.bytedance.apm.g.B()) {
            throw new IllegalArgumentException("Launch mode is both none");
        }
        e.a a = h() ? com.bytedance.apm.launch.b.a() : null;
        this.b = System.currentTimeMillis();
        if (j2 > 0) {
            this.b = this.a + j2;
        }
        long j3 = this.b - this.a;
        if (j <= 0 || j3 <= j) {
            if (h() && e.b.j.b.a.m && f3311f) {
                f3311f = false;
                long j4 = this.a;
                long j5 = this.b;
                long[] s = com.bytedance.apm.t.l.e.y().s();
                long uptimeMillis = SystemClock.uptimeMillis();
                if (s != null) {
                    com.bytedance.apm.F.b.e().h(new f(this, s, uptimeMillis, j5, j4, i, ""));
                }
            }
            if (h()) {
                Objects.requireNonNull(com.bytedance.apm.launch.a.b().c());
            }
            com.bytedance.apm.F.b.e().h(new e(this, a, i, "", str));
            if (h()) {
                LaunchSleepDetector.a();
            }
        }
    }

    public long g() {
        return this.a;
    }

    public void i(String str, String str2) {
        if (this.f3312c.get(str + "#" + str2) != null) {
            return;
        }
        com.bytedance.apm.w.b bVar = new com.bytedance.apm.w.b(System.currentTimeMillis());
        this.f3312c.put(str + "#" + str2, bVar);
    }

    public void j() {
        this.a = System.currentTimeMillis();
    }
}
