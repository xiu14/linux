package com.bytedance.apm;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class d implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ JSONObject b;

    d(String str, JSONObject jSONObject) {
        this.a = str;
        this.b = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str = this.a;
        JSONObject jSONObject = this.b;
        int i = e.b.b.d.a.f9364e;
        if (!TextUtils.isEmpty(str)) {
            e.b.b.d.a.c(new e.b.b.d.c.b(str, jSONObject));
        } else if (e.b.b.n.a.b()) {
            e.b.b.n.g.b.a("APM-CommonEvent", "logType must be not empty");
        }
    }
}
