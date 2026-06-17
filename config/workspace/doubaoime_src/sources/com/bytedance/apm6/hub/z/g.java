package com.bytedance.apm6.hub.z;

import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g implements e.b.b.j.g.b {
    private e.b.b.j.g.a a;

    class a implements com.bytedance.apm6.hub.z.j.b {
        a() {
        }

        @Override // com.bytedance.apm6.hub.z.j.b
        public void a(JSONObject jSONObject, boolean z) {
            g.a(g.this, jSONObject, z);
        }
    }

    public g() {
        com.bytedance.apm6.hub.z.j.a.g().h();
        com.bytedance.apm6.hub.z.j.a.g().i(new a());
    }

    static void a(g gVar, JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        Objects.requireNonNull(gVar);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("memory")) == null) {
            return;
        }
        gVar.a = new e.b.b.j.g.a(optJSONObject.optLong("collect_interval", 120L), optJSONObject.optDouble("reach_top_memory_rate", 0.8d), false, false, optJSONObject.optInt("enable_upload", 0) == 1, optJSONObject.optInt("close_memory_collect") != 1);
        if (e.b.b.n.a.b()) {
            StringBuilder M = e.a.a.a.a.M("parsed MemoryConfig=");
            M.append(gVar.a);
            e.b.b.n.g.b.a("APM-Config", M.toString());
        }
        e.b.b.j.c.e().k(gVar.getConfig());
    }

    @Override // e.b.b.j.g.b
    public e.b.b.j.g.a getConfig() {
        return this.a;
    }
}
