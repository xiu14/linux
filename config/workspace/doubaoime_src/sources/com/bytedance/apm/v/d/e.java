package com.bytedance.apm.v.d;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e implements com.bytedance.apm.v.c {
    public String a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f3608c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f3609d = null;

    public e(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.a = str;
        this.b = str2;
        this.f3608c = jSONObject;
    }

    @Override // com.bytedance.apm.v.c
    public String a() {
        return "ui_action";
    }

    @Override // com.bytedance.apm.v.c
    public boolean b(JSONObject jSONObject) {
        return com.bytedance.apm.D.c.b("ui");
    }

    @Override // com.bytedance.apm.v.c
    @Nullable
    public JSONObject c() {
        try {
            if (this.f3609d == null) {
                this.f3609d = new JSONObject();
            }
            this.f3609d.put("log_type", "ui_action");
            this.f3609d.put("action", this.a);
            this.f3609d.put("page", this.b);
            this.f3609d.put("context", this.f3608c);
            return this.f3609d;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.v.c
    public boolean d() {
        return true;
    }

    @Override // com.bytedance.apm.v.c
    public String e() {
        return "ui_action";
    }
}
