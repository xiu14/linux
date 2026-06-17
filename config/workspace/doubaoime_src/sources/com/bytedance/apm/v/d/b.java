package com.bytedance.apm.v.d;

import androidx.annotation.Nullable;
import com.ss.android.message.log.PushLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements com.bytedance.apm.v.c {
    public String a;
    public JSONObject b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f3600c = null;

    public b(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.a = str;
        this.b = jSONObject2;
    }

    @Override // com.bytedance.apm.v.c
    public String a() {
        return "service_monitor";
    }

    @Override // com.bytedance.apm.v.c
    public boolean b(JSONObject jSONObject) {
        return com.bytedance.apm.D.c.e(this.a);
    }

    @Override // com.bytedance.apm.v.c
    @Nullable
    public JSONObject c() {
        if (this.f3600c == null) {
            this.f3600c = new JSONObject();
        }
        try {
            this.f3600c.put("log_type", "service_monitor");
            this.f3600c.put("service", this.a);
            this.f3600c.put("status", 0);
            JSONObject jSONObject = this.b;
            if (jSONObject != null) {
                this.f3600c.put(PushLog.KEY_CATEGORY, jSONObject);
            }
            return this.f3600c;
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
        return "service_monitor";
    }
}
