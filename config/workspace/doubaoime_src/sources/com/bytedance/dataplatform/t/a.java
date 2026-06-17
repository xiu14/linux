package com.bytedance.dataplatform.t;

import org.json.JSONObject;

/* loaded from: classes.dex */
class a implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ JSONObject b;

    a(String str, JSONObject jSONObject) {
        this.a = str;
        this.b = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        b.a(this.a, this.b);
    }
}
