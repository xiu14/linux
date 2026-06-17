package com.bytedance.apm.v.d;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.apm.g;
import com.bytedance.crash.dumper.Scraps;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements com.bytedance.apm.v.c {
    public String a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3603c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f3604d;

    /* renamed from: e, reason: collision with root package name */
    public JSONObject f3605e;

    /* renamed from: f, reason: collision with root package name */
    public JSONObject f3606f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f3607g;

    public d() {
    }

    @Override // com.bytedance.apm.v.c
    public String a() {
        return this.a;
    }

    @Override // com.bytedance.apm.v.c
    public boolean b(@Nullable JSONObject jSONObject) {
        boolean c2;
        JSONObject optJSONObject;
        if ("fps".equals(this.a) || "fps_drop".equals(this.a)) {
            c2 = com.bytedance.apm.D.c.c(this.a, this.b);
        } else if ("temperature".equals(this.a)) {
            c2 = com.bytedance.apm.D.c.d(this.a);
        } else {
            if (!Scraps.BATTERY.equals(this.a)) {
                if ("start".equals(this.a)) {
                    if (!com.bytedance.apm.D.c.b(this.a) && !com.bytedance.apm.D.c.a(this.b)) {
                        c2 = false;
                    }
                } else if ("start_trace".equals(this.a)) {
                    if (jSONObject != null) {
                        if (!com.bytedance.apm.D.c.d("enable_perf_data_collect")) {
                            jSONObject.remove("perf_data");
                        }
                        if (!com.bytedance.apm.D.c.b(this.a) && (optJSONObject = jSONObject.optJSONObject("trace")) != null) {
                            optJSONObject.remove("spans");
                        }
                    }
                    c2 = com.bytedance.apm.D.c.b(this.a);
                } else {
                    c2 = com.bytedance.apm.D.c.b(this.a);
                }
            }
            c2 = true;
        }
        return this.f3603c || c2;
    }

    @Override // com.bytedance.apm.v.c
    @Nullable
    public JSONObject c() {
        try {
            if (this.f3607g == null) {
                this.f3607g = new JSONObject();
            }
            this.f3607g.put("log_type", "performance_monitor");
            this.f3607g.put("service", this.a);
            if (!com.bytedance.android.input.k.b.a.c0(this.f3604d)) {
                this.f3607g.put("extra_values", this.f3604d);
            }
            if (TextUtils.equals("start", this.a) && TextUtils.equals("from", this.f3607g.optString("monitor-plugin"))) {
                if (this.f3605e == null) {
                    this.f3605e = new JSONObject();
                }
                this.f3605e.put("start_mode", g.t());
            }
            if (!com.bytedance.android.input.k.b.a.c0(this.f3605e)) {
                this.f3607g.put("extra_status", this.f3605e);
            }
            if (!com.bytedance.android.input.k.b.a.c0(this.f3606f)) {
                this.f3607g.put("filters", this.f3606f);
            }
            return this.f3607g;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.v.c
    public boolean d() {
        return true;
    }

    @Override // com.bytedance.apm.v.c
    public String e() {
        return "performance_monitor";
    }

    public d(String str, String str2, boolean z, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.a = str;
        this.b = str2;
        this.f3603c = z;
        this.f3604d = jSONObject;
        this.f3605e = jSONObject2;
        this.f3607g = jSONObject3;
    }

    public d(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this(str, str2, false, jSONObject, jSONObject2, jSONObject3);
    }
}
