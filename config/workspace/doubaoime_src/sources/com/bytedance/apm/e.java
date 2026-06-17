package com.bytedance.apm;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class e implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ JSONObject b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f3428c;

    e(String str, JSONObject jSONObject, boolean z) {
        this.a = str;
        this.b = jSONObject;
        this.f3428c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str = this.a;
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            try {
                jSONObject.put("log_type", str);
            } catch (JSONException unused) {
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            c.m("monitorCommonLog", jSONObject.toString());
        }
    }
}
