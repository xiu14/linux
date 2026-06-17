package com.bytedance.apm.launch;

import android.util.Log;
import com.bytedance.apm.internal.g;
import com.bytedance.apm.launch.a;
import com.bytedance.apm.launch.e;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private static boolean a = false;

    public static e.a a() {
        if (a) {
            return null;
        }
        a = true;
        if (a.b.a.a().d() && g.c(4)) {
            return e.d();
        }
        return null;
    }

    public static JSONObject b(e.a aVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (aVar.t() != -1) {
                jSONObject2.put("launch_perf_gc_count", aVar.t());
            }
            if (aVar.u() != -1) {
                jSONObject2.put("launch_perf_gc_time", aVar.u());
            }
            if (aVar.q() != -1) {
                jSONObject2.put("launch_perf_block_gc_count", aVar.q());
            }
            if (aVar.r() != -1) {
                jSONObject2.put("launch_perf_block_gc_time", aVar.r());
            }
            if (aVar.w() != -1.0d) {
                jSONObject2.put("launch_perf_iowait_time", aVar.w());
            }
            if (aVar.A() != -1.0d) {
                jSONObject2.put("launch_perf_runnable_time", aVar.A());
            }
            if (aVar.B() != -1.0d) {
                jSONObject2.put("launch_perf_sleep_time", aVar.B());
            }
            if (aVar.z() != -1) {
                jSONObject2.put("launch_perf_minfor_fault", aVar.z());
            }
            if (aVar.y() != -1) {
                jSONObject2.put("launch_perf_major_fault", aVar.y());
            }
            if (aVar.s() != -1.0d) {
                jSONObject2.put("launch_perf_cpu_time", aVar.s());
            }
            if (aVar.C() != -1) {
                jSONObject2.put("launch_perf_voluntary_switches", aVar.C());
            }
            if (aVar.v() != -1) {
                jSONObject2.put("launch_perf_involuntary_switches", aVar.v());
            }
            if (aVar.o() != -1) {
                jSONObject2.put("launch_perf_all_thread_count", aVar.o());
            }
            if (aVar.p() != -1) {
                jSONObject2.put("launch_perf_binder_time", aVar.p());
            }
            jSONObject.put("list_data", jSONObject2);
            List<String> x = aVar.x();
            if (x != null && !x.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it2 = x.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next());
                }
                jSONObject.put("current_thread_list", jSONArray);
            }
            a.b.a.d("perf data: " + jSONObject);
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e("LaunchAnalysis", "notice!!!+ " + th.getLocalizedMessage());
            return null;
        }
    }
}
