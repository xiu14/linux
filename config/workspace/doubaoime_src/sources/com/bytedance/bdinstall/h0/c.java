package com.bytedance.bdinstall.h0;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends com.bytedance.bdinstall.g0.i.c {
    private long a = 0;
    private long b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f4002c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4003d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4004e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f4005f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f4006g = 0;
    private boolean h = false;

    @Override // com.bytedance.bdinstall.g0.i.c
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("params_for_special", "uc_login");
            jSONObject.put("duration", this.b - this.a);
            jSONObject.put("retry_count", this.f4002c);
            jSONObject.put("is_first", this.f4004e);
            jSONObject.put("did_change", this.f4003d);
            jSONObject.put("is_new_user_mode", this.f4005f);
            jSONObject.put("scene", this.f4006g);
            jSONObject.put("result", this.h);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.bytedance.bdinstall.g0.i.c
    protected void c() {
        this.a = 0L;
        this.b = 0L;
        this.f4002c = 0;
        this.f4003d = false;
        this.f4004e = false;
        this.h = false;
    }

    public void d() {
        if (this.b > 0) {
            return;
        }
        this.b = System.currentTimeMillis();
    }

    public void e() {
        if (this.a > 0) {
            return;
        }
        this.a = System.currentTimeMillis();
    }

    public void f(boolean z) {
        this.f4003d = z;
    }

    public void g(boolean z) {
        this.f4004e = z;
    }

    public void h(int i) {
        this.f4005f = i;
    }

    public void i(int i) {
        this.f4002c = i;
    }

    public void j(boolean z) {
        this.h = z;
    }

    public void k(int i) {
        this.f4006g = i;
    }
}
