package com.bytedance.bdinstall.h0;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.bytedance.bdinstall.g0.i.c {
    private long a = 0;
    private long b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f3995c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3996d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f3997e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f3998f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3999g = false;

    @Override // com.bytedance.bdinstall.g0.i.c
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("params_for_special", "uc_login");
            jSONObject.put("duration", this.b - this.a);
            jSONObject.put("retry_count", this.f3995c);
            jSONObject.put("is_first", this.f3996d);
            jSONObject.put("is_new_user_mode", this.f3997e);
            jSONObject.put("scene", this.f3998f);
            jSONObject.put("result", this.f3999g);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.bytedance.bdinstall.g0.i.c
    protected void c() {
        this.a = 0L;
        this.b = 0L;
        this.f3995c = 0L;
        this.f3996d = false;
        this.f3999g = false;
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

    public void f(long j) {
        this.f3995c = j;
    }

    public void g(boolean z) {
        this.f3996d = z;
    }

    public void h(int i) {
        this.f3997e = i;
    }

    public void i(boolean z) {
        this.f3999g = z;
    }

    public void j(int i) {
        this.f3998f = i;
    }
}
