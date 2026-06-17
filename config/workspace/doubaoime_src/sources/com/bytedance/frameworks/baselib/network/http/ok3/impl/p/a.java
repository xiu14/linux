package com.bytedance.frameworks.baselib.network.http.ok3.impl.p;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.bytedance.frameworks.baselib.network.c.c.b<d> {
    private Map<String, String> i(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null && jSONObject.length() != 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                    hashMap.put(next, optString);
                }
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.frameworks.baselib.network.c.c.b
    public String a() {
        return "ttnet_req_meta_dp";
    }

    @Override // com.bytedance.frameworks.baselib.network.c.c.b
    public d e(Object obj) {
        JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObject == null) {
            return null;
        }
        d dVar = new d();
        dVar.a = i(jSONObject.optJSONObject("query_add"));
        dVar.b = f(jSONObject.optJSONArray("query_rm"));
        dVar.f5201c = i(jSONObject.optJSONObject("header_add"));
        dVar.f5202d = f(jSONObject.optJSONArray("header_rm"));
        return dVar;
    }
}
