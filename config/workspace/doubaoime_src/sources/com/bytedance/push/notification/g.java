package com.bytedance.push.notification;

import android.text.TextUtils;
import com.bytedance.push.C;
import com.bytedance.push.PushBody;
import com.vivo.push.PushClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class g implements Runnable {
    final /* synthetic */ PushBody a;
    final /* synthetic */ PushBody b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f5767c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f5768d;

    g(f fVar, PushBody pushBody, PushBody pushBody2, int i, int i2) {
        this.a = pushBody;
        this.b = pushBody2;
        this.f5767c = i;
        this.f5768d = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j;
        com.ss.android.g.e.b bVar = (com.ss.android.g.e.b) com.ss.android.ug.bus.b.a(com.ss.android.g.e.b.class);
        com.bytedance.common.push.e.a aVar = (com.bytedance.common.push.e.a) com.ss.android.ug.bus.b.a(com.bytedance.common.push.e.a.class);
        if (bVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                PushBody pushBody = this.a;
                if (pushBody != null) {
                    j = pushBody.b;
                } else {
                    PushBody pushBody2 = this.b;
                    j = pushBody2 != null ? pushBody2.w : 0L;
                }
                jSONObject.put("from_rule_id", j);
                jSONObject.put("to_rule_id", "");
                jSONObject.put("from_push_channel", this.f5767c);
                jSONObject.put("to_push_channel", this.f5768d);
                jSONObject.put("withdraw_type", 1);
                PushBody pushBody3 = this.a;
                jSONObject.put("from_group_id", pushBody3 != null ? pushBody3.f5570d : 0);
                jSONObject.put("user_id", aVar.a());
                PushBody pushBody4 = this.a;
                String str = "0";
                jSONObject.put("is_self", n.k(pushBody4 != null ? pushBody4.f5572f : "0") ? PushClient.DEFAULT_REQUEST_ID : "0");
                if (!TextUtils.isEmpty(aVar.a())) {
                    str = PushClient.DEFAULT_REQUEST_ID;
                }
                jSONObject.put("is_login", str);
                com.bytedance.push.interfaze.q qVar = ((C) C.a()).d().z;
                if (qVar != null) {
                    qVar.a(jSONObject, this.a, this.b);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            bVar.onEventV3("push_withdraw", jSONObject);
        }
    }
}
