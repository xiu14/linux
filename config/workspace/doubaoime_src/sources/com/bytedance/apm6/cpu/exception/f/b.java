package com.bytedance.apm6.cpu.exception.f;

import android.util.Log;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements e.b.b.k.c {
    private double a;
    private double b;

    /* renamed from: c, reason: collision with root package name */
    private String f3697c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3698d;

    /* renamed from: e, reason: collision with root package name */
    private List<com.bytedance.apm6.cpu.exception.e> f3699e;

    public b(double d2, double d3, List<com.bytedance.apm6.cpu.exception.e> list, String str, boolean z) {
        this.a = d2;
        this.b = d3;
        this.f3697c = str;
        this.f3698d = z;
        this.f3699e = new ArrayList(list);
    }

    @Override // e.b.b.k.c
    public String a() {
        return "cpu_exception_trace";
    }

    @Override // e.b.b.k.c
    public boolean b() {
        List<com.bytedance.apm6.cpu.exception.e> list = this.f3699e;
        return list != null && !list.isEmpty() && this.a > 0.0d && this.b > 0.0d;
    }

    @Override // e.b.b.k.c
    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event_type", "cpu_exception_trace");
            jSONObject.put("log_type", "cpu_exception_trace");
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("crash_time", System.currentTimeMillis());
            jSONObject.put("is_main_process", com.bytedance.apm.g.F());
            jSONObject.put("process_name", com.bytedance.apm.g.i());
            if (this.f3698d) {
                jSONObject.put("data_type", "back");
            } else {
                jSONObject.put("data_type", "front");
            }
            jSONObject.put("scene", this.f3697c);
            jSONObject.put("report_scene", this.f3697c);
            if (com.bytedance.apm.g.g() > com.bytedance.apm.g.z() || com.bytedance.apm.g.g() == 0) {
                jSONObject.put("app_launch_start_time", com.bytedance.apm.g.z());
            } else {
                jSONObject.put("app_launch_start_time", com.bytedance.apm.g.g());
            }
            jSONObject.put("process_speed_avg", this.a);
            jSONObject.put("process_speed_max", this.b);
            jSONObject.put("battery_temperature", com.bytedance.apm.B.g.c().e());
            jSONObject.put("battery_recharge_state", com.bytedance.apm.B.g.c().d());
            JSONArray jSONArray = new JSONArray();
            for (com.bytedance.apm6.cpu.exception.e eVar : this.f3699e) {
                if (eVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("nice", eVar.b());
                    jSONObject2.put("weight", Double.valueOf(eVar.h()));
                    jSONObject2.put("cpu_usage", eVar.a());
                    jSONObject2.put(CrashHianalyticsData.THREAD_NAME, eVar.g());
                    jSONObject2.put("thread_back_trace", eVar.d());
                    jSONObject2.put(CrashHianalyticsData.THREAD_ID, eVar.f());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("threads_info", jSONArray);
        } catch (Throwable th) {
            e.b.b.n.g.b.c("APM-CPU", "cpu_exception_data_assemble", th);
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("exception", th.getLocalizedMessage());
                e.b.b.d.a.d("cpu_exception_no_stack", jSONObject3, null);
            } catch (Throwable unused) {
            }
        }
        Log.i("APM-CPU", "exception data: " + jSONObject);
        return jSONObject;
    }
}
