package com.bytedance.push.notification;

import com.bytedance.push.C;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class o implements Runnable {
    final /* synthetic */ JSONObject a;
    final /* synthetic */ n b;

    o(n nVar, JSONObject jSONObject) {
        this.b = nVar;
        this.a = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bytedance.push.interfaze.e eVar;
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        com.bytedance.push.g0.f.g("Click", "[reportPushClickForSessionId]report bdpush_push_click_for_session_id now");
        eVar = this.b.b;
        eVar.onEventV3("bdpush_push_click_for_session_id", this.a);
    }
}
