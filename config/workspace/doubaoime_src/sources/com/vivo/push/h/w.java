package com.vivo.push.h;

import android.text.TextUtils;
import com.vivo.push.PushClient;
import com.vivo.push.h.u;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class w implements u.a {
    final /* synthetic */ v a;

    w(v vVar) {
        this.a = vVar;
    }

    @Override // com.vivo.push.h.u.a
    public final void a() {
        long k = com.vivo.push.m.a().k();
        if (k < 1400 && k != 1340) {
            com.vivo.push.util.t.b("OnNotificationArrivedTask", "引擎版本太低，不支持正向展示功能，pushEngineSDKVersion：".concat(String.valueOf(k)));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("srt", PushClient.DEFAULT_REQUEST_ID);
        hashMap.put("message_id", String.valueOf(this.a.b.h()));
        String a = com.vivo.push.restructure.a.a().e().a();
        if (!TextUtils.isEmpty(a)) {
            hashMap.put("app_id", a);
        }
        hashMap.put("type", PushClient.DEFAULT_REQUEST_ID);
        hashMap.put("dtp", PushClient.DEFAULT_REQUEST_ID);
        com.vivo.push.util.f.a(6L, (HashMap<String, String>) hashMap);
    }

    @Override // com.vivo.push.h.u.a
    public final void b() {
        HashMap hashMap = new HashMap();
        hashMap.put(com.heytap.mcssdk.constant.b.f6895c, String.valueOf(this.a.b.h()));
        String a = com.vivo.push.restructure.a.a().e().a();
        if (!TextUtils.isEmpty(a)) {
            hashMap.put("remoteAppId", a);
        }
        com.vivo.push.util.f.a(2122L, (HashMap<String, String>) hashMap);
    }
}
