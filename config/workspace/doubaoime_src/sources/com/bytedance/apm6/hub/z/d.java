package com.bytedance.apm6.hub.z;

import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements e.b.b.g.c.b {
    private e.b.b.g.c.a a;

    class a implements com.bytedance.apm6.hub.z.j.b {
        a() {
        }

        @Override // com.bytedance.apm6.hub.z.j.b
        public void a(JSONObject jSONObject, boolean z) {
            d.a(d.this, jSONObject, z);
        }
    }

    public d() {
        if (e.b.b.n.a.b()) {
            e.b.b.n.g.b.a("APM-FD", "FdConfigManager:");
        }
        com.bytedance.apm6.hub.z.j.a.g().h();
        com.bytedance.apm6.hub.z.j.a.g().i(new a());
    }

    static void a(d dVar, JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        Objects.requireNonNull(dVar);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (e.b.b.n.a.b()) {
            e.b.b.n.g.b.a("APM-FD", "parseConfig:" + optJSONObject2);
        }
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("fd")) == null) {
            return;
        }
        if (e.b.b.n.a.b()) {
            e.b.b.n.g.b.a("APM-FD", "parseConfig:" + optJSONObject);
        }
        boolean z2 = optJSONObject.optInt("enable_upload", 0) == 1;
        long optInt = optJSONObject.optInt("fd_count_threshold", 800);
        long optLong = optJSONObject.optLong("collect_interval", 10L) * com.heytap.mcssdk.constant.a.f6886d;
        if (optLong < 10) {
            optLong = 600000;
        }
        e.b.b.g.c.a aVar = new e.b.b.g.c.a(optInt, optLong, z2);
        if (e.b.b.n.a.b()) {
            e.b.b.n.g.b.a("APM-FD", "parseConfig:" + aVar);
        }
        dVar.a = aVar;
        e.b.b.g.a.f().i(aVar);
    }

    @Override // e.b.b.g.c.b
    public e.b.b.g.c.a getConfig() {
        return this.a;
    }
}
