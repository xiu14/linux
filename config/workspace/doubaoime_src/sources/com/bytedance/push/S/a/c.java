package com.bytedance.push.S.a;

import com.bytedance.common.push.d;
import com.bytedance.push.PushBody;
import com.bytedance.push.interfaze.f;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c extends com.bytedance.common.push.c implements f {
    private a a = new a();

    private void n(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = new JSONObject();
        try {
            str = String.valueOf(Long.parseLong(jSONObject.optString("client_time")) / 1000);
        } catch (NumberFormatException unused) {
            str = null;
        }
        add(jSONObject2, "client_time", str);
        add(jSONObject2, "rid", jSONObject.optString("rule_id"));
        add(jSONObject2, "rid64", jSONObject.optString("rule_id64"));
        add(jSONObject2, "group_id", jSONObject.optString("ttpush_group_id"));
        add(jSONObject2, "sender", jSONObject.optString("sender"));
        d.b(new b(this, "show", jSONObject2));
    }

    private void o(JSONObject jSONObject) {
        String str;
        String optString = jSONObject.optString("rule_id64");
        String optString2 = jSONObject.optString("sender");
        if (this.a.a(optString, optString2)) {
            com.bytedance.push.g0.f.c("MessageCallbackServiceImpl", "not callback message click because mClickHelper.isDoubleClick,rid64:" + optString + " sender:" + optString2);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            str = String.valueOf(Long.parseLong(jSONObject.optString("client_time")) / 1000);
        } catch (NumberFormatException unused) {
            str = null;
        }
        add(jSONObject2, "client_time", str);
        add(jSONObject2, "rid", jSONObject.optString("rule_id"));
        add(jSONObject2, "click_position", jSONObject.optString("click_position"));
        add(jSONObject2, "group_id", jSONObject.optString("ttpush_group_id"));
        try {
            add(jSONObject2, "rid64", Long.parseLong(optString));
            add(jSONObject2, "sender", Integer.parseInt(optString2));
        } catch (NumberFormatException unused2) {
            com.bytedance.push.g0.f.e("MessageCallbackServiceImpl", "error when parse rid64 and sender to int,rid64:" + optString + " sender:" + optString2);
        }
        d.b(new b(this, "click", jSONObject2));
    }

    public void p(PushBody pushBody, JSONObject jSONObject) {
        if (pushBody.M) {
            StringBuilder M = e.a.a.a.a.M("callback message arrive because body.callbackArrive is true,msgId is ");
            M.append(pushBody.b);
            com.bytedance.push.g0.f.c("MessageCallbackServiceImpl", M.toString());
            n(jSONObject);
            return;
        }
        if (!com.ss.android.pushmanager.setting.c.c().g().I().a) {
            com.bytedance.push.g0.f.c("MessageCallbackServiceImpl", "not callback message arrive");
            return;
        }
        StringBuilder M2 = e.a.a.a.a.M("callback message arrive because MsgCallbackSettings.callbackMsgArrive is true,msgId is ");
        M2.append(pushBody.b);
        com.bytedance.push.g0.f.c("MessageCallbackServiceImpl", M2.toString());
        n(jSONObject);
    }

    public void q(boolean z, JSONObject jSONObject) {
        if (jSONObject == null) {
            com.bytedance.push.g0.f.m("MessageCallbackServiceImpl", "not callback message click because param is null");
            return;
        }
        if (z) {
            com.bytedance.push.g0.f.c("MessageCallbackServiceImpl", "callback message click because body.callbackClick is true,param is " + jSONObject);
            o(jSONObject);
            return;
        }
        if (!com.ss.android.pushmanager.setting.c.c().g().I().b) {
            com.bytedance.push.g0.f.c("MessageCallbackServiceImpl", "not callback message click");
            return;
        }
        com.bytedance.push.g0.f.c("MessageCallbackServiceImpl", "callback message click because MsgCallbackSettings.callbackMsgClick is true, param is " + jSONObject);
        o(jSONObject);
    }
}
