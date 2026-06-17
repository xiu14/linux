package com.bytedance.applog.monitor.v3;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {
    public final String a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3836c;

    /* renamed from: d, reason: collision with root package name */
    public final StageEventType f3837d;

    public g(String str, String str2, long j, StageEventType stageEventType) {
        this.a = str;
        this.b = str2;
        this.f3836c = j;
        this.f3837d = stageEventType;
    }

    public g(JSONObject jSONObject) {
        this.a = jSONObject.optString("event_name");
        this.b = jSONObject.optString("monitor_id");
        this.f3836c = jSONObject.optLong("local_time_ms");
        this.f3837d = StageEventType.parse(jSONObject.optString("type"));
    }
}
