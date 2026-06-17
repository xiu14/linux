package com.bytedance.apm6.hub.z;

import com.bytedance.apm.j;
import com.bytedance.apm.l;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e implements com.bytedance.apm.config.f {
    private com.bytedance.apm.config.e a;

    class a implements com.bytedance.apm6.hub.z.j.b {
        a() {
        }

        @Override // com.bytedance.apm6.hub.z.j.b
        public void a(JSONObject jSONObject, boolean z) {
            e.a(e.this, jSONObject, z);
        }
    }

    public e() {
        com.bytedance.apm6.hub.z.j.a.g().h();
        com.bytedance.apm6.hub.z.j.a.g().i(new a());
    }

    static void a(e eVar, JSONObject jSONObject, boolean z) {
        Objects.requireNonNull(eVar);
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject2 = jSONObject.optJSONObject("performance_modules").optJSONObject("smooth");
        } catch (Throwable unused) {
        }
        if (jSONObject2 == null) {
            return;
        }
        eVar.a = new com.bytedance.apm.config.e();
        eVar.a.r(jSONObject2.optInt("enable_stack_sampling", 0) == 1);
        eVar.a.s(jSONObject2.optInt("enable_trace", 0) == 1);
        eVar.a.j(jSONObject2.optLong("atrace_tag", 0L));
        eVar.a.k(jSONObject2.optInt("block_dump_stack_enable", 1) == 1);
        eVar.a.q(jSONObject2.optInt("enable_gfx_monitor", 0) == 1);
        eVar.a.m(jSONObject2.optInt("block_monitor_mode", 1001));
        eVar.a.u(jSONObject2.optInt("serious_block_enable_upload", 1) == 1);
        eVar.a.v(jSONObject2.optLong("serious_block_threshold", 4000L));
        eVar.a.x(jSONObject2.optInt("slow_method_enable_upload", 1) == 1);
        eVar.a.o(jSONObject2.optInt("drop_enable_upload", 1) == 1);
        eVar.a.t(jSONObject2.optInt("enable_upload", 0) == 1);
        eVar.a.n(jSONObject2.optLong("block_threshold", 2500L));
        eVar.a.w(jSONObject2.optLong("drop_threshold", 1000L));
        eVar.a.l(jSONObject2.optInt("block_enable_upload", 0) == 1);
        eVar.a.p(jSONObject2.optBoolean("drop_slow_method_switch", true));
        jSONObject2.optJSONObject("scene_enable_upload");
        Objects.requireNonNull(eVar.a);
        j a2 = j.a();
        com.bytedance.apm.config.e eVar2 = eVar.a;
        Objects.requireNonNull(a2);
        if (eVar2 == null) {
            return;
        }
        com.bytedance.apm.t.j.A(eVar2.d());
        Objects.requireNonNull(com.bytedance.apm.t.f.a());
        com.bytedance.monitor.collector.j.h().n();
        com.bytedance.apm.t.f.a().c(eVar2.a());
        l.b(eVar2);
        com.bytedance.apm.t.e.b(eVar2.g(), eVar2.d());
    }
}
