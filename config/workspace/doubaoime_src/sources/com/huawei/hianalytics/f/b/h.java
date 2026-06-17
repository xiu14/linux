package com.huawei.hianalytics.f.b;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vivo.push.PushClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h {
    private String a;
    private String b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f7069c;

    /* renamed from: d, reason: collision with root package name */
    private String f7070d;

    /* renamed from: e, reason: collision with root package name */
    private String f7071e;

    /* renamed from: f, reason: collision with root package name */
    private String f7072f;

    /* renamed from: g, reason: collision with root package name */
    private String f7073g;

    public String a() {
        return this.a;
    }

    public void a(String str) {
        this.f7072f = str;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("protocol_version", PushClient.DEFAULT_REQUEST_ID);
            jSONObject.put("compress_mode", PushClient.DEFAULT_REQUEST_ID);
            jSONObject.put("serviceid", this.f7070d);
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, this.a);
            jSONObject.put("hmac", this.b);
            jSONObject.put("chifer", this.f7073g);
            jSONObject.put("timestamp", this.f7069c);
            jSONObject.put("servicetag", this.f7071e);
            jSONObject.put("requestid", this.f7072f);
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.c("HeadData", "headData - toJsonObj():JSON structure Exception!");
        }
        return jSONObject;
    }

    public void b(String str) {
        this.f7071e = str;
    }

    public void c(String str) {
        this.f7073g = str;
    }

    public void d(String str) {
        this.f7070d = str;
    }

    public void e(String str) {
        this.a = str;
    }

    public void f(String str) {
        this.b = str;
    }

    public void g(String str) {
        this.f7069c = str;
    }
}
