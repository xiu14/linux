package com.bytedance.apm.B;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private static volatile c a;

    private c() {
    }

    public static c b() {
        if (a == null) {
            synchronized (c.class) {
                if (a == null) {
                    a = new c();
                }
            }
        }
        return a;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            e.b.b.m.h.a aVar = (e.b.b.m.h.a) e.b.b.m.c.a(e.b.b.m.h.a.class);
            jSONObject.put("process_usage", aVar.a());
            jSONObject.put("stat_speed", aVar.b());
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }
}
