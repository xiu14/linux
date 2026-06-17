package com.bytedance.apm.s.k.m;

import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: e, reason: collision with root package name */
    public String f3521e;

    @Nullable
    public JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_time", this.a);
            jSONObject.put("end_time", this.b);
            jSONObject.put(CrashHianalyticsData.THREAD_NAME, this.f3519c);
            jSONObject.put("thread_stack", a());
            jSONObject.put("request", this.f3521e);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("LocInfo{request=");
        M.append(this.f3521e);
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
