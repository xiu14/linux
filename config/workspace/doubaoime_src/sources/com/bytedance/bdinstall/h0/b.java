package com.bytedance.bdinstall.h0;

import com.bytedance.common.wschannel.WsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends com.bytedance.bdinstall.g0.i.c {
    private int a = 0;
    private int b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f4000c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f4001d = 0;

    @Override // com.bytedance.bdinstall.g0.i.c
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("params_for_special", "uc_login");
            jSONObject.put("duration", this.f4001d);
            jSONObject.put("type", this.a);
            jSONObject.put(WsConstants.KEY_CONNECTION_STATE, this.b);
            jSONObject.put("flag", this.f4000c);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.bytedance.bdinstall.g0.i.c
    protected void c() {
        this.a = 0;
        this.b = 0;
        this.f4000c = 0;
        this.f4001d = 0L;
    }

    public void d(long j) {
        this.f4001d = j;
    }

    public void e(int i) {
        this.f4000c = i;
    }

    public void f(int i) {
        this.b = i;
    }

    public void g(int i) {
        this.a = i;
    }
}
