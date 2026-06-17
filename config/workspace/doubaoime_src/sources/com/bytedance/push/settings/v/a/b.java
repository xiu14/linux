package com.bytedance.push.settings.v.a;

import com.bytedance.common.push.c;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends c {
    public boolean a;
    public boolean b;

    public b() {
        this.a = false;
        this.b = false;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "callback_msg_arrive", this.a);
        add(jSONObject, "callback_msg_click", this.b);
        return jSONObject.toString();
    }

    public b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = jSONObject.optBoolean("callback_msg_arrive", false);
            this.b = jSONObject.optBoolean("callback_msg_click", false);
        } catch (Throwable th) {
            th.printStackTrace();
            this.a = false;
            this.b = false;
        }
    }
}
