package com.bytedance.crash.monitor;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g implements com.bytedance.crash.N.c {
    protected h a;
    protected com.bytedance.crash.R.f b;

    /* renamed from: c, reason: collision with root package name */
    protected com.bytedance.crash.R.c f4639c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.crash.N.b f4640d;

    public g(h hVar) {
        this.a = hVar;
        com.bytedance.crash.N.b b = b();
        this.f4640d = b;
        b.h(this);
    }

    @Override // com.bytedance.crash.N.c
    public void a(JSONObject jSONObject) {
        StringBuilder M = e.a.a.a.a.M("onConfigChanged:");
        M.append(this.a.b());
        com.bytedance.android.input.k.b.a.q("NPTH-Config", M.toString());
        if (jSONObject == null) {
            return;
        }
        d(jSONObject);
        e(jSONObject);
        this.a.g().t(this.f4639c);
        this.a.h().f(this.b);
    }

    @NonNull
    protected com.bytedance.crash.N.b b() {
        return new com.bytedance.crash.N.b(this.a);
    }

    public void c() {
        this.f4640d.c();
    }

    protected void d(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        JSONObject optJSONObject2 = jSONObject.optJSONObject("custom_event_settings");
        JSONObject optJSONObject3 = optJSONObject2 != null ? optJSONObject2.optJSONObject("allow_log_type") : null;
        if (optJSONObject3 != null) {
            Iterator<String> keys = optJSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (optJSONObject3.optInt(next) == 1) {
                    hashSet.add(next);
                }
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject optJSONObject4 = jSONObject.optJSONObject("exception_modules");
        boolean z = false;
        if (optJSONObject4 != null && (optJSONObject = optJSONObject4.optJSONObject("exception")) != null) {
            boolean z2 = optJSONObject.optInt("enable_upload") == 1;
            jSONObject2 = optJSONObject.optJSONObject("metric_sampling");
            z = z2;
        }
        this.f4639c = new com.bytedance.crash.R.c(hashSet, jSONObject2, z);
        StringBuilder M = e.a.a.a.a.M("parseEnsureConfig:");
        M.append(this.a.f4642d);
        M.append(" ");
        M.append(this.f4639c);
        com.bytedance.android.input.k.b.a.q("NPTH-Config", M.toString());
    }

    protected void e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        JSONObject optJSONObject = jSONObject.optJSONObject("custom_event_settings");
        JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("allow_service_name") : null;
        if (optJSONObject2 != null) {
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (optJSONObject2.optInt(next) == 1) {
                    hashSet.add(next);
                }
            }
        }
        this.b = new com.bytedance.crash.R.f(hashSet);
    }
}
