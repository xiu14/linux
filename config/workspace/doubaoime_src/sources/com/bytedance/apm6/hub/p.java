package com.bytedance.apm6.hub;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class p implements e.b.b.e.a.k.b {
    p() {
    }

    @Override // e.b.b.e.a.k.b
    public void a(List<e.b.b.e.a.k.a> list) {
        if (com.bytedance.android.input.k.b.a.e0(list)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (e.b.b.e.a.k.a aVar : list) {
            try {
                jSONObject2.put("before_size_" + aVar.c(), aVar.b());
                jSONObject2.put("after_size_" + aVar.c(), aVar.a());
                jSONObject.put("strategy", aVar.c());
                if (aVar.d()) {
                    jSONObject.put("reach_top_today", aVar.d());
                }
            } catch (Exception unused) {
            }
        }
        e.b.b.d.a.g("apm_db_size", jSONObject, jSONObject2, null);
    }
}
