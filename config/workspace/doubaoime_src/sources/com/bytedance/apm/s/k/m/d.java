package com.bytedance.apm.s.k.m;

import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: e, reason: collision with root package name */
    public int f3522e;

    /* renamed from: f, reason: collision with root package name */
    public String f3523f;

    @Nullable
    public JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("flags", this.f3522e);
            jSONObject.put("tag", this.f3523f);
            jSONObject.put("start_time", this.a);
            jSONObject.put("end_time", this.b);
            jSONObject.put(CrashHianalyticsData.THREAD_NAME, this.f3519c);
            jSONObject.put("thread_stack", a());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("WakeLockInfo{flags=");
        M.append(this.f3522e);
        M.append(", tag=");
        M.append(this.f3523f);
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
