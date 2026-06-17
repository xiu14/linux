package com.bytedance.push.settings.w;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h {
    public boolean a;
    public int b;

    h() {
        this.a = false;
        this.b = 0;
    }

    h(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = jSONObject.optBoolean("enable_harmony_os4_importance_category", false);
            this.b = jSONObject.optInt("harmony_os4_importance_category_intercept_strategy", 0);
        } catch (Throwable unused) {
        }
    }
}
