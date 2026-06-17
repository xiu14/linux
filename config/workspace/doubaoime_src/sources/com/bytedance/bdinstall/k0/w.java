package com.bytedance.bdinstall.k0;

import android.content.SharedPreferences;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.C0641v;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class w extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Q f4042e;

    /* renamed from: f, reason: collision with root package name */
    private final C0641v f4043f;

    w(Q q, C0641v c0641v) {
        super(true, false, false);
        this.f4042e = q;
        this.f4043f = c0641v;
    }

    @Override // com.bytedance.bdinstall.k0.d
    protected boolean a(JSONObject jSONObject) throws JSONException {
        SharedPreferences b = this.f4043f.b(this.f4042e);
        String deviceId = ((com.bytedance.bdinstall.o0.a) com.bytedance.bdinstall.o0.d.a(com.bytedance.bdinstall.o0.a.class, String.valueOf(this.f4042e.h()))).getDeviceId();
        String string = b.getString("bd_did", null);
        String string2 = b.getString("install_id", null);
        String string3 = b.getString("ssid", null);
        String string4 = b.getString("klink_edi", null);
        String string5 = b.getString("klink_eii", null);
        String string6 = b.getString("klink_egdi", null);
        int i = C0640u.a;
        e0.h(jSONObject, "install_id", string2);
        e0.h(jSONObject, "device_id", deviceId);
        e0.h(jSONObject, "ssid", string3);
        e0.h(jSONObject, "bd_did", string);
        e0.h(jSONObject, "klink_edi", string4);
        e0.h(jSONObject, "klink_eii", string5);
        e0.h(jSONObject, "klink_egdi", string6);
        return true;
    }

    @Override // com.bytedance.bdinstall.k0.d
    public void b(JSONObject jSONObject) throws SecurityException {
        jSONObject.remove("bd_did");
        jSONObject.remove("install_id");
        jSONObject.remove("ssid");
        jSONObject.remove("device_id");
        jSONObject.remove("klink_edi");
        jSONObject.remove("klink_eii");
    }
}
