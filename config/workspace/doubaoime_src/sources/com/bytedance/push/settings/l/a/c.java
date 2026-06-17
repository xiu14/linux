package com.bytedance.push.settings.l.a;

import android.text.TextUtils;
import com.bytedance.push.g0.f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c extends com.bytedance.common.push.c {
    public Map<String, String> a;
    public int b;

    public c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("component_info");
            if (!TextUtils.isEmpty(optString)) {
                this.a = com.bytedance.android.input.k.b.a.I0(optString, new HashMap());
            }
            this.b = jSONObject.optInt("update_version_code");
        } catch (Throwable th) {
            f.f("ComponentProcessInfo", "error when parse ComponentProcessInfo ", th);
        }
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = this.a;
        if (map != null) {
            add(jSONObject, "component_info", com.bytedance.android.input.k.b.a.n0(map));
        }
        add(jSONObject, "update_version_code", this.b);
        return jSONObject.toString();
    }
}
