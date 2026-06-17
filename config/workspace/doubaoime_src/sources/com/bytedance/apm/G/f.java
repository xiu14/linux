package com.bytedance.apm.G;

import android.text.TextUtils;
import com.bytedance.monitor.collector.j;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import org.json.JSONObject;

/* loaded from: classes.dex */
class f implements Runnable {
    final /* synthetic */ long[] a;
    final /* synthetic */ long b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f3307c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f3308d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f3309e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f3310f;

    f(g gVar, long[] jArr, long j, long j2, long j3, int i, String str) {
        this.a = jArr;
        this.b = j;
        this.f3307c = j2;
        this.f3308d = j3;
        this.f3309e = i;
        this.f3310f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String v = com.bytedance.apm.t.l.e.y().v(this.a, this.b);
            if (TextUtils.isEmpty(v)) {
                return;
            }
            long j = this.f3307c - this.f3308d;
            JSONObject c2 = j.h().c();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_main_process", com.bytedance.apm.g.F());
            jSONObject.put("block_duration", j);
            jSONObject.put("stack", v);
            jSONObject.put("stack_key", "1048574\n");
            jSONObject.put("scene", "launchTrace");
            jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, j);
            jSONObject.put("method_time", j);
            jSONObject.put("message", "launchTrace");
            jSONObject.put("event_type", "lag_drop_frame");
            JSONObject c3 = e.b.b.l.a.a.a().c(true);
            c3.put("crash_section", com.bytedance.apm.g.A(System.currentTimeMillis()));
            c3.put("trace_type", "launchTrace");
            c3.put("launchMode", String.valueOf(this.f3309e));
            c3.put("customLaunchMode", this.f3310f);
            jSONObject.put(MonitorConstants.CUSTOM, c2);
            jSONObject.put("filters", c3);
            com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.c("drop_frame_stack", jSONObject));
        } catch (Throwable unused) {
        }
    }
}
