package com.ss.alive.monitor.model;

import com.bytedance.common.push.c;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends c {
    private StartType a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private String f8262c;

    /* renamed from: d, reason: collision with root package name */
    private String f8263d;

    /* renamed from: e, reason: collision with root package name */
    private StackTraceElement[] f8264e;

    /* renamed from: f, reason: collision with root package name */
    private String f8265f;

    /* renamed from: g, reason: collision with root package name */
    private long f8266g;
    private String h;

    public String n() {
        return this.f8265f;
    }

    public String o() {
        return this.f8263d;
    }

    public String p() {
        return this.f8262c;
    }

    public a q(long j) {
        this.f8266g = j;
        return this;
    }

    public a r(boolean z) {
        this.b = z;
        return this;
    }

    public a s(String str) {
        this.h = str;
        return this;
    }

    public void t(StackTraceElement[] stackTraceElementArr, String str) {
        this.f8264e = stackTraceElementArr;
        this.f8265f = str;
    }

    public a u(StartType startType) {
        this.a = startType;
        return this;
    }

    public a v(String str) {
        this.f8263d = str;
        return this;
    }

    public a y(String str) {
        this.f8262c = str;
        return this;
    }

    public JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "start_type", this.a.startType);
        add(jSONObject, "is_fore_ground", this.b ? 1L : 0L);
        add(jSONObject, "is_active", 0L);
        add(jSONObject, "target_pkg", this.f8262c);
        add(jSONObject, "target_component", this.f8263d);
        add(jSONObject, "client_time", this.f8266g);
        add(jSONObject, "process", this.h);
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTraceElementArr = this.f8264e;
        if (stackTraceElementArr != null) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                JSONObject jSONObject2 = new JSONObject();
                add(jSONObject2, "class_name", stackTraceElement.getClassName());
                add(jSONObject2, "file_name", stackTraceElement.getFileName());
                add(jSONObject2, "method_name", stackTraceElement.getMethodName());
                add(jSONObject2, "line_number", stackTraceElement.getLineNumber());
                jSONArray.put(jSONObject2);
            }
        }
        add(jSONObject, CrashHianalyticsData.STACK_TRACE, jSONArray.toString());
        return jSONObject;
    }
}
