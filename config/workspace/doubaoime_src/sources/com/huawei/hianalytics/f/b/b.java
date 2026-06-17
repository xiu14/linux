package com.huawei.hianalytics.f.b;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7054c;

    /* renamed from: d, reason: collision with root package name */
    private String f7055d;

    /* renamed from: e, reason: collision with root package name */
    private String f7056e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f7057f;

    /* renamed from: g, reason: collision with root package name */
    private String f7058g;

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("androidid", this.a);
            jSONObject.put("imei", this.b);
            jSONObject.put("uuid", this.f7054c);
            jSONObject.put("udid", this.f7056e);
            jSONObject.put("oaid", this.f7055d);
            jSONObject.put("upid", this.f7057f);
            jSONObject.put("sn", this.f7058g);
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.c("InfoData", " When toJsonObj() executed has JSON Exception happened");
        }
        return jSONObject;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f7054c = "";
        } else {
            this.f7054c = str;
        }
    }

    public void d(String str) {
        this.f7055d = str;
    }

    public void e(String str) {
        if (str != null) {
            this.f7056e = str;
        }
    }

    public void f(String str) {
        this.f7057f = str;
    }

    public void g(String str) {
        this.f7058g = str;
    }
}
