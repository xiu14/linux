package com.bytedance.frameworks.baselib.network.f;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private final List<a> a = new ArrayList();

    static class a {
        private final String a;

        a(String str) {
            this.a = str;
        }
    }

    void a(a aVar) {
        this.a.add(aVar);
    }

    public JSONObject b() {
        if (com.bytedance.android.input.k.b.a.Z(this.a)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (a aVar : this.a) {
                if (aVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (!com.bytedance.android.input.k.b.a.Z(null)) {
                        new JSONArray();
                        throw null;
                    }
                    if (!com.bytedance.android.input.k.b.a.Z(null)) {
                        new JSONArray();
                        throw null;
                    }
                    if (!com.bytedance.android.input.k.b.a.Z(null)) {
                        new JSONArray();
                        throw null;
                    }
                    jSONObject.put(TextUtils.isEmpty(aVar.a) ? "null" : aVar.a, jSONObject2);
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
