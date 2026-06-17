package com.huawei.hms.hatool;

import android.os.Build;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class y0 extends t0 {

    /* renamed from: f, reason: collision with root package name */
    String f7404f;

    /* renamed from: g, reason: collision with root package name */
    String f7405g;
    private String h;

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_rom_ver", this.h);
        jSONObject.put("_emui_ver", this.a);
        jSONObject.put("_model", Build.MODEL);
        jSONObject.put("_mcc", this.f7404f);
        jSONObject.put("_mnc", this.f7405g);
        jSONObject.put("_package_name", this.b);
        jSONObject.put("_app_ver", this.f7397c);
        jSONObject.put("_lib_ver", "2.2.0.315");
        jSONObject.put("_channel", this.f7398d);
        jSONObject.put("_lib_name", "hianalytics");
        jSONObject.put("_oaid_tracking_flag", this.f7399e);
        return jSONObject;
    }

    public void f(String str) {
        this.f7404f = str;
    }

    public void g(String str) {
        this.f7405g = str;
    }

    public void h(String str) {
        this.h = str;
    }
}
