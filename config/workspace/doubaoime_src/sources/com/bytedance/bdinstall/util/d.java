package com.bytedance.bdinstall.util;

import android.text.TextUtils;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.Q;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private static volatile d b;
    private final Map<String, Map<String, com.bytedance.bdinstall.g0.i.c>> a = new ConcurrentHashMap();

    private d() {
    }

    public static d b() {
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = new d();
                }
            }
        }
        return b;
    }

    public static void e(Q q, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        boolean z = !TextUtils.isEmpty(jSONObject2.optString("device_id_str"));
        JSONObject optJSONObject = jSONObject.optJSONObject("oaid");
        String str = null;
        com.bytedance.bdinstall.m0.n a = optJSONObject != null ? com.bytedance.bdinstall.m0.n.a(optJSONObject.toString()) : null;
        boolean isEmpty = TextUtils.isEmpty(jSONObject.optString("install_id"));
        boolean isEmpty2 = TextUtils.isEmpty(jSONObject.optString("device_id"));
        try {
            jSONObject3.put("reqeust_did_success", z);
            jSONObject3.put("empty_iid", isEmpty);
            jSONObject3.put("empty_did", isEmpty2);
            if (a != null) {
                str = a.a;
            }
            jSONObject3.put("dr_oaid", str);
            jSONObject3.put("oaid_thread_switch_ts", com.bytedance.bdinstall.m0.o.c() - com.bytedance.bdinstall.m0.o.a());
            jSONObject3.put("oaid_file_load_ts", com.bytedance.bdinstall.m0.o.f() - com.bytedance.bdinstall.m0.o.c());
            jSONObject3.put("oaid_sys_call_ts", com.bytedance.bdinstall.m0.o.g() - com.bytedance.bdinstall.m0.o.f());
            jSONObject3.put("oaid_save_ts", com.bytedance.bdinstall.m0.o.b() - com.bytedance.bdinstall.m0.o.g());
            jSONObject3.put("dr_wait_oaid_realtime", com.bytedance.bdinstall.m0.o.d() - com.bytedance.bdinstall.m0.o.e());
            jSONObject3.put("dr_wait_oaid_estimate_time", com.bytedance.bdinstall.m0.o.d() - com.bytedance.bdinstall.m0.o.e());
            jSONObject3.put("support_oaid", jSONObject.optBoolean("oaid_may_support"));
            jSONObject3.put("oaid_impl", com.bytedance.bdinstall.m0.k.n(q.q()).j());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (q != null && q.u() != null) {
            q.u().a("did_fetch_result", jSONObject3);
        }
        String str2 = "did_fetch_result, " + jSONObject3;
        int i = C0640u.a;
    }

    public com.bytedance.bdinstall.h0.a a(int i) {
        Map<String, com.bytedance.bdinstall.g0.i.c> map = this.a.get(String.valueOf(i));
        if (map == null) {
            map = new ConcurrentHashMap<>();
            this.a.put(String.valueOf(i), map);
        }
        com.bytedance.bdinstall.h0.a aVar = (com.bytedance.bdinstall.h0.a) map.get("activate");
        if (aVar != null) {
            return aVar;
        }
        com.bytedance.bdinstall.h0.a aVar2 = new com.bytedance.bdinstall.h0.a();
        map.put("activate", aVar2);
        return aVar2;
    }

    public com.bytedance.bdinstall.h0.b c(int i) {
        Map<String, com.bytedance.bdinstall.g0.i.c> map = this.a.get(String.valueOf(i));
        if (map == null) {
            map = new ConcurrentHashMap<>();
            this.a.put(String.valueOf(i), map);
        }
        com.bytedance.bdinstall.h0.b bVar = (com.bytedance.bdinstall.h0.b) map.get(com.heytap.mcssdk.constant.b.D);
        if (bVar != null) {
            return bVar;
        }
        com.bytedance.bdinstall.h0.b bVar2 = new com.bytedance.bdinstall.h0.b();
        map.put(com.heytap.mcssdk.constant.b.D, bVar2);
        return bVar2;
    }

    public com.bytedance.bdinstall.h0.c d(int i) {
        Map<String, com.bytedance.bdinstall.g0.i.c> map = this.a.get(String.valueOf(i));
        if (map == null) {
            map = new ConcurrentHashMap<>();
            this.a.put(String.valueOf(i), map);
        }
        com.bytedance.bdinstall.h0.c cVar = (com.bytedance.bdinstall.h0.c) map.get(MiPushClient.COMMAND_REGISTER);
        if (cVar != null) {
            return cVar;
        }
        com.bytedance.bdinstall.h0.c cVar2 = new com.bytedance.bdinstall.h0.c();
        map.put(MiPushClient.COMMAND_REGISTER, cVar2);
        return cVar2;
    }

    public void f(int i) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(MiPushClient.COMMAND_REGISTER, new com.bytedance.bdinstall.h0.c());
        concurrentHashMap.put("activate", new com.bytedance.bdinstall.h0.a());
        concurrentHashMap.put(com.heytap.mcssdk.constant.b.D, new com.bytedance.bdinstall.h0.b());
        this.a.put(String.valueOf(i), concurrentHashMap);
    }
}
