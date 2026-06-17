package com.bytedance.apm6.hub.z;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements e.b.b.d.b.b {
    private volatile e.b.b.d.b.a a;

    /* renamed from: com.bytedance.apm6.hub.z.a$a, reason: collision with other inner class name */
    class C0139a implements com.bytedance.apm6.hub.z.j.b {
        C0139a() {
        }

        @Override // com.bytedance.apm6.hub.z.j.b
        public void a(JSONObject jSONObject, boolean z) {
            a.a(a.this, jSONObject, z);
        }
    }

    public a() {
        com.bytedance.apm6.hub.z.j.a.g().h();
        com.bytedance.apm6.hub.z.j.a.g().i(new C0139a());
    }

    static void a(a aVar, JSONObject jSONObject, boolean z) {
        Objects.requireNonNull(aVar);
        JSONObject optJSONObject = jSONObject.optJSONObject("custom_event_settings");
        if (optJSONObject != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("allow_service_name");
            HashSet hashSet = new HashSet();
            if (optJSONObject2 != null) {
                Iterator<String> keys = optJSONObject2.keys();
                while (keys.hasNext()) {
                    hashSet.add(keys.next());
                }
            }
            HashSet hashSet2 = new HashSet();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("allow_log_type");
            if (optJSONObject3 != null) {
                Iterator<String> keys2 = optJSONObject3.keys();
                while (keys2.hasNext()) {
                    String next = keys2.next();
                    if (optJSONObject3.optInt(next) == 1) {
                        hashSet2.add(next);
                    }
                }
            }
            aVar.a = new e.b.b.d.b.a(hashSet, hashSet2);
            if (e.b.b.n.a.b()) {
                e.b.b.n.g.b.a("APM-Config", "received customEventSettings=" + optJSONObject);
                e.b.b.n.g.b.a("APM-Config", "parsed CommonEventConfig=" + aVar.a);
            }
            e.b.b.d.a.k(aVar.a);
        }
    }

    @Override // e.b.b.d.b.b
    public e.b.b.d.b.a getConfig() {
        return this.a;
    }
}
