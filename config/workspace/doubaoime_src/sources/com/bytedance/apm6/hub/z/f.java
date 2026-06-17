package com.bytedance.apm6.hub.z;

import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f implements e.b.b.i.c {
    private e.b.b.i.b a;

    class a implements com.bytedance.apm6.hub.z.j.b {
        a() {
        }

        @Override // com.bytedance.apm6.hub.z.j.b
        public void a(JSONObject jSONObject, boolean z) {
            f.a(f.this, jSONObject, z);
        }
    }

    public f() {
        com.bytedance.apm6.hub.z.j.a.g().h();
        com.bytedance.apm6.hub.z.j.a.g().i(new a());
    }

    static void a(f fVar, JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        Objects.requireNonNull(fVar);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("memory")) == null) {
            return;
        }
        fVar.a = new e.b.b.i.b(optJSONObject.optInt("enable_alloc_collect", 0) == 1, optJSONObject.optInt("enable_alloc_upload", 0) == 1, optJSONObject.optInt("alloc_collect_per_thousand_alloc", 0), optJSONObject.optInt("alloc_dump_per_thousand_collect", 0), optJSONObject.optInt("alloc_threshold_alloc_frequency", 0), optJSONObject.optLong("alloc_threshold_alloc_size", 0L));
        if (e.b.b.n.a.b()) {
            StringBuilder M = e.a.a.a.a.M("parsed JavaAllocConfig=");
            M.append(fVar.a);
            e.b.b.n.g.b.a("APM-Config", M.toString());
        }
        e.b.b.i.a.a().c(fVar.a);
    }

    @Override // e.b.b.i.c
    public e.b.b.i.b getConfig() {
        return this.a;
    }
}
