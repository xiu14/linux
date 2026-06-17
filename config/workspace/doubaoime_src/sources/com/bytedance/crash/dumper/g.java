package com.bytedance.crash.dumper;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.push.constant.RemoteMessageConst;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class g {
    long a = 0;
    long b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f4587c = 0;

    /* renamed from: d, reason: collision with root package name */
    long f4588d;

    /* renamed from: e, reason: collision with root package name */
    long f4589e;

    /* renamed from: f, reason: collision with root package name */
    String f4590f;

    /* renamed from: g, reason: collision with root package name */
    String f4591g;
    String h;

    g() {
    }

    void a(int i) {
        if (i > this.f4587c) {
            this.f4587c = i;
        }
    }

    JSONObject b() {
        if (this.a == 0) {
            return null;
        }
        int i = this.f4587c;
        if (i != 2 && i != 4) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cost", this.a);
            jSONObject.put("longMsgEnd", this.b);
            if (this.f4587c == 4) {
                jSONObject.put(RemoteMessageConst.Notification.WHEN, this.f4588d);
                jSONObject.put("what", this.f4589e);
                jSONObject.put(TypedValues.AttributesType.S_TARGET, this.f4590f);
                com.bytedance.android.input.k.b.a.y0(jSONObject, this.f4591g, this.h);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
