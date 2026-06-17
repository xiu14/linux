package com.huawei.hms.hatool;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class l extends t {
    private String b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f7372c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f7373d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f7374e = "";

    /* renamed from: f, reason: collision with root package name */
    protected String f7375f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f7376g;

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("androidid", this.a);
        jSONObject.put("oaid", this.f7376g);
        jSONObject.put("uuid", this.f7375f);
        jSONObject.put("upid", this.f7374e);
        jSONObject.put("imei", this.b);
        jSONObject.put("sn", this.f7372c);
        jSONObject.put("udid", this.f7373d);
        return jSONObject;
    }

    public void b(String str) {
        this.b = str;
    }

    public void c(String str) {
        this.f7376g = str;
    }

    public void d(String str) {
        this.f7372c = str;
    }

    public void e(String str) {
        this.f7373d = str;
    }

    public void f(String str) {
        this.f7374e = str;
    }

    public void g(String str) {
        this.f7375f = str;
    }
}
