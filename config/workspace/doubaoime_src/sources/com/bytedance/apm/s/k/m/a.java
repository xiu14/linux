package com.bytedance.apm.s.k.m;

import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: e, reason: collision with root package name */
    public int f3516e;

    /* renamed from: f, reason: collision with root package name */
    public long f3517f;

    /* renamed from: g, reason: collision with root package name */
    public String f3518g;

    @Nullable
    public JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_time", this.a);
            jSONObject.put("end_time", this.b);
            jSONObject.put(CrashHianalyticsData.THREAD_NAME, this.f3519c);
            jSONObject.put("thread_stack", a());
            jSONObject.put("interval", this.f3517f);
            jSONObject.put("type", this.f3516e);
            jSONObject.put("intent_info", this.f3518g);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AlarmInfo{type=");
        M.append(this.f3516e);
        M.append(", interval=");
        M.append(this.f3517f);
        M.append(", intentInfo=");
        M.append(this.f3518g);
        M.append(", startTime=");
        M.append(this.a);
        M.append(", endTime=");
        M.append(this.b);
        M.append(", threadName=");
        M.append(this.f3519c);
        M.append(", threadStack=");
        return e.a.a.a.a.G(M, a(), '}');
    }
}
