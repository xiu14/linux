package com.bytedance.push.settings.w;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class l extends com.bytedance.common.push.c {
    public String a;
    public List<String> b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5868c;

    public l(JSONObject jSONObject) {
        try {
            this.a = jSONObject.optString("reg");
            this.f5868c = jSONObject.optBoolean("need_intercept");
            JSONArray optJSONArray = jSONObject.optJSONArray("black_field_list");
            this.b = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.b.add(optJSONArray.getString(i));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean n(String str) {
        return com.bytedance.feedbackerlib.a.T(str, this.a);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("regText:");
        M.append(this.a);
        M.append(" blackFiledList:");
        M.append(this.b);
        return M.toString();
    }
}
