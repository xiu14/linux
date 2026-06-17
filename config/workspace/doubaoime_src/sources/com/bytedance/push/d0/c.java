package com.bytedance.push.d0;

import android.app.Application;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.e;
import com.bytedance.push.C;
import com.bytedance.push.interfaze.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c implements Runnable {
    private final u a;

    public c(u uVar, String str) {
        this.a = uVar;
    }

    private void a() {
        e.a aVar;
        if (TextUtils.isEmpty("passport_refresh")) {
            com.bytedance.push.g0.f.c("UidSync", "action is null");
            return;
        }
        Application a = com.ss.android.message.a.a();
        Map<Integer, com.bytedance.push.R.g> b = d.b(a);
        if (b == null || b.isEmpty()) {
            com.bytedance.push.g0.f.c("UidSync", "token is empty");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (com.bytedance.push.R.g gVar : b.values()) {
            if (gVar == null || gVar.f5590e <= 0 || TextUtils.isEmpty(gVar.f5589d)) {
                com.bytedance.push.g0.f.c("UidSync", "invalid cache : " + gVar);
            } else {
                com.bytedance.push.g0.f.c("UidSync", "pushAdapter: " + com.bytedance.push.third.g.o(a).a(gVar.f5590e) + " mAction:passport_refresh");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("sender_id", gVar.f5590e);
                    jSONObject.put("token", gVar.f5589d);
                    if (!TextUtils.isEmpty(null)) {
                        jSONObject.put("profile_id", (Object) null);
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        Map<String, String> c2 = ((C) this.a).c();
        ((HashMap) c2).put("update_event", "passport_refresh");
        String c3 = com.ss.android.message.f.a.c(com.ss.android.g.d.a(), c2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("sender_token_list", jSONArray.toString()));
        arrayList.add(new Pair("push_sdk", com.bytedance.push.third.g.o(a).j().toString()));
        for (int i = 0; i < 2; i++) {
            try {
                com.bytedance.push.g0.f.c("UidSync", "request url = " + c3);
                aVar = new e.a();
                aVar.a = false;
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if ("success".equals(new JSONObject(com.bytedance.common.utility.e.b().c(c3, arrayList, com.ss.android.message.f.a.a(null), aVar)).optString("message"))) {
                com.ss.android.ug.bus.c.a aVar2 = (com.ss.android.ug.bus.c.a) com.ss.android.ug.bus.b.a(com.ss.android.ug.bus.c.a.class);
                com.bytedance.push.g0.f.g("UidSync", "success sync uid-token to server,set last_sec_uid,accountService=" + aVar2);
                if (aVar2 != null) {
                    String a2 = aVar2.a();
                    com.bytedance.push.g0.f.g("UidSync", "success sync uid-token to server,set last_sec_uid,secUid=" + a2);
                    com.ss.android.pushmanager.setting.c.c().e().k0(a2);
                    return;
                }
                return;
            }
            continue;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (b.f5650e) {
            a();
        }
    }
}
