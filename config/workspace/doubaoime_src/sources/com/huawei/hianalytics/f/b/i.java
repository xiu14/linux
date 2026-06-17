package com.huawei.hianalytics.f.b;

import android.os.Build;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7074c;

    /* renamed from: d, reason: collision with root package name */
    private String f7075d;

    /* renamed from: e, reason: collision with root package name */
    private String f7076e;

    /* renamed from: f, reason: collision with root package name */
    private String f7077f;

    /* renamed from: g, reason: collision with root package name */
    private String f7078g;
    private String h;

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_rom_ver", this.h);
            jSONObject.put("_emui_ver", this.a);
            jSONObject.put("_model", Build.MODEL);
            jSONObject.put("_mcc", this.f7077f);
            jSONObject.put("_mnc", this.f7078g);
            jSONObject.put("_package_name", this.b);
            jSONObject.put("_app_ver", this.f7074c);
            jSONObject.put("_lib_ver", "2.1.4.308");
            jSONObject.put("_channel", this.f7075d);
            jSONObject.put("_lib_name", "hianalytics");
            jSONObject.put("_oaid_tracking_flag", this.f7076e);
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.c("RomInfoData", "toJsonObj(): JSON structure Exception: Rom info toJsonObj exception!");
        }
        return jSONObject;
    }

    public void a(String str) {
        this.f7076e = str;
    }

    public void b(String str) {
        this.f7075d = str;
    }

    public void c(String str) {
        this.a = str;
    }

    public void d(String str) {
        this.b = str;
    }

    public void e(String str) {
        this.f7074c = str;
    }

    public void f(String str) {
        this.f7077f = str;
    }

    public void g(String str) {
        this.f7078g = str;
    }

    public void h(String str) {
        this.h = str;
    }
}
