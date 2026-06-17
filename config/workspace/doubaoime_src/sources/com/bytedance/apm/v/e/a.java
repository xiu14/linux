package com.bytedance.apm.v.e;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static volatile a b;
    private com.bytedance.apm.E.a<JSONObject> a = new com.bytedance.apm.E.a<>(20);

    private a() {
    }

    public static a b() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public void a(JSONObject jSONObject) {
        this.a.a(jSONObject);
    }

    public List<JSONObject> c() {
        return this.a.b();
    }
}
