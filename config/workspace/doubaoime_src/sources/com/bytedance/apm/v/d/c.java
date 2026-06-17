package com.bytedance.apm.v.d;

import androidx.annotation.Nullable;
import com.bytedance.apm.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements com.bytedance.apm.v.c {
    private String a;
    private JSONObject b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3601c;

    /* renamed from: d, reason: collision with root package name */
    private long f3602d;

    public c(String str, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        this.a = str;
        this.b = jSONObject;
        this.f3602d = currentTimeMillis;
    }

    @Override // com.bytedance.apm.v.c
    public String a() {
        return this.a;
    }

    @Override // com.bytedance.apm.v.c
    public boolean b(JSONObject jSONObject) {
        return this.f3601c || com.bytedance.apm.D.c.d(this.a);
    }

    @Override // com.bytedance.apm.v.c
    @Nullable
    public JSONObject c() {
        JSONObject jSONObject = this.b;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject.put("timestamp", this.f3602d);
            this.b.put("crash_time", this.f3602d);
            this.b.put("is_main_process", g.F());
            this.b.put("process_name", g.i());
            this.b.put("log_type", this.a);
            if (g.g() > g.z() || g.g() == 0) {
                this.b.put("app_launch_start_time", g.z());
            } else {
                this.b.put("app_launch_start_time", g.g());
            }
        } catch (JSONException unused) {
        }
        return this.b;
    }

    @Override // com.bytedance.apm.v.c
    public boolean d() {
        return true;
    }

    @Override // com.bytedance.apm.v.c
    public String e() {
        return this.a;
    }

    public long f() {
        return this.f3602d;
    }

    public void g() {
        this.f3601c = true;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ExceptionLogData{eventType='");
        e.a.a.a.a.G0(M, this.a, '\'', ", logJson=");
        M.append(this.b);
        M.append(", forceSampled=");
        M.append(this.f3601c);
        M.append(", time=");
        return e.a.a.a.a.E(M, this.f3602d, '}');
    }

    public c(String str, JSONObject jSONObject, long j) {
        this.a = str;
        this.b = jSONObject;
        this.f3602d = j;
    }
}
