package com.bytedance.apm6.hub.z;

import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements com.bytedance.apm6.cpu.b.b {
    private com.bytedance.apm6.cpu.b.a a;
    private com.bytedance.apm6.cpu.b.c b;

    class a implements com.bytedance.apm6.hub.z.j.b {
        a() {
        }

        @Override // com.bytedance.apm6.hub.z.j.b
        public void a(JSONObject jSONObject, boolean z) {
            b.a(b.this, jSONObject, z);
        }
    }

    public b() {
        com.bytedance.apm6.hub.z.j.a.g().h();
        com.bytedance.apm6.hub.z.j.a.g().i(new a());
    }

    static void a(b bVar, JSONObject jSONObject, boolean z) {
        Objects.requireNonNull(bVar);
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject2 = jSONObject.optJSONObject("performance_modules").optJSONObject(MonitorConstants.CPU);
        } catch (Throwable unused) {
        }
        if (jSONObject2 != null) {
            bVar.a = new com.bytedance.apm6.cpu.b.a();
            bVar.a.k(jSONObject2.optInt("enable_upload", 0) == 1);
            bVar.a.j(jSONObject2.optInt("enable_collect_all_process", 0) == 1);
            long optLong = jSONObject2.optLong("front_collect_interval", 0L);
            if (optLong > 0) {
                bVar.a.l(optLong);
            }
            long optLong2 = jSONObject2.optLong("back_collect_interval", 0L);
            if (optLong2 > 0) {
                bVar.a.h(optLong2);
            }
            long optLong3 = jSONObject2.optLong("monitor_interval", 0L);
            if (optLong3 > 0) {
                bVar.a.n(optLong3);
            }
            long optLong4 = jSONObject2.optLong("front_thread_collect_interval", 0L);
            if (optLong4 > 0) {
                bVar.a.m(optLong4);
            }
            long optLong5 = jSONObject2.optLong("back_thread_collect_interval", 0L);
            if (optLong5 > 0) {
                bVar.a.i(optLong5);
            }
            bVar.b = new com.bytedance.apm6.cpu.b.c();
            bVar.b.x(jSONObject2.optInt("exception_switch", 0) == 1);
            double optDouble = jSONObject2.optDouble("exception_process_back_max_speed", 0.0d);
            if (optDouble > 0.0d) {
                bVar.b.t(optDouble);
            }
            double optDouble2 = jSONObject2.optDouble("exception_process_fore_max_speed", 0.0d);
            if (optDouble2 > 0.0d) {
                bVar.b.u(optDouble2);
            }
            bVar.b.p(jSONObject2.optInt("main_thread_collect_enabled", 0) == 1);
            bVar.b.o(jSONObject2.optInt("exception_collect_all_process", 0) == 1);
            bVar.b.r(jSONObject2.optInt("exception_thread_stack_enabled", 1) == 1);
            double optDouble3 = jSONObject2.optDouble("exception_thread_max_usage", 0.0d);
            if (optDouble3 > 0.0d) {
                bVar.b.v(optDouble3);
            }
            JSONObject optJSONObject = jSONObject2.optJSONObject("exception_thread_max_usage_map");
            HashMap hashMap = new HashMap();
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    double optDouble4 = optJSONObject.optDouble(next, 0.0d);
                    if (optDouble4 > 0.0d) {
                        hashMap.put(next, Double.valueOf(optDouble4));
                    }
                }
            }
            bVar.b.w(hashMap);
            bVar.b.y(jSONObject2.optInt("process_detect_interval", 30));
            bVar.b.z(jSONObject2.optInt("thread_detect_interval", 30));
            JSONObject optJSONObject2 = jSONObject2.optJSONObject("exception_fore_max_speed_scene");
            HashMap hashMap2 = new HashMap();
            if (optJSONObject2 != null) {
                Iterator<String> keys2 = optJSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    double optDouble5 = optJSONObject2.optDouble(next2, 0.0d);
                    if (optDouble5 > 0.0d) {
                        hashMap2.put(next2, Double.valueOf(optDouble5));
                    }
                }
            }
            bVar.b.s(hashMap2);
            JSONObject optJSONObject3 = jSONObject2.optJSONObject("exception_back_max_speed_scene");
            HashMap hashMap3 = new HashMap();
            if (optJSONObject3 != null) {
                Iterator<String> keys3 = optJSONObject3.keys();
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    double optDouble6 = optJSONObject3.optDouble(next3, 0.0d);
                    if (optDouble6 > 0.0d) {
                        hashMap3.put(next3, Double.valueOf(optDouble6));
                    }
                }
            }
            bVar.b.n(hashMap3);
            bVar.b.q(jSONObject2.optBoolean("exception_native_thread_enabled", false));
        }
        e.b.b.n.g.b.a("APM-CPU", bVar.a + " " + bVar.b);
        com.bytedance.apm6.cpu.collect.a.d().g(bVar.a);
        com.bytedance.apm6.cpu.exception.c.a().c(bVar.b);
    }
}
