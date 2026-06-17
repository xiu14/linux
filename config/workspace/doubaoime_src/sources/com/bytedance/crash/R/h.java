package com.bytedance.crash.R;

import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.C0652g;
import com.ss.android.message.log.PushLog;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {
    private String a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private String f4502c;

    /* renamed from: d, reason: collision with root package name */
    private int f4503d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f4504e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f4505f;

    public h(String str, long j, String str2, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        this.a = str;
        this.b = j;
        this.f4502c = str2;
        this.f4503d = i;
        this.f4504e = jSONObject;
        this.f4505f = jSONObject2;
    }

    public String a() {
        return this.f4502c;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log_type", "service_monitor");
            jSONObject.put("event_type", "exception");
            jSONObject.put("service", this.f4502c);
            jSONObject.put("status", this.f4503d);
            jSONObject.put(PushLog.KEY_CATEGORY, this.f4504e);
            jSONObject.put("metric", this.f4505f);
            jSONObject.put(WsConstants.KEY_SESSION_ID, C0652g.b());
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("crash_time", this.b);
            jSONObject.put("process_name", com.bytedance.crash.util.a.i());
            jSONObject.put("crash_thread_name", this.a);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
