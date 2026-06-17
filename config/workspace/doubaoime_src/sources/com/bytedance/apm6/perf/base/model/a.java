package com.bytedance.apm6.perf.base.model;

import e.b.b.k.c;
import e.b.b.n.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a implements c {
    private JSONObject a;

    @Override // e.b.b.k.c
    public String a() {
        return "performance_monitor";
    }

    @Override // e.b.b.k.c
    public JSONObject c() {
        try {
            if (this.a == null) {
                this.a = d();
            }
            this.a.put("log_type", "performance_monitor");
            this.a.put("service", h());
            JSONObject f2 = f();
            if (!b.c(f2)) {
                this.a.put("extra_values", f2);
            }
            JSONObject e2 = e();
            if (!b.c(e2)) {
                this.a.put("extra_status", e2);
            }
            JSONObject g2 = g();
            if (!b.c(g2)) {
                this.a.put("filters", g2);
            }
            return this.a;
        } catch (JSONException unused) {
            return null;
        }
    }

    protected JSONObject d() {
        return new JSONObject();
    }

    protected abstract JSONObject e();

    protected abstract JSONObject f();

    protected abstract JSONObject g();

    protected abstract String h();
}
