package com.bytedance.push.monitor;

import android.os.Build;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.framwork.core.sdkmonitor.f;
import com.bytedance.push.C;
import com.bytedance.push.C0679c;
import com.bytedance.push.interfaze.r;
import com.ss.android.message.log.PushLog;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j implements r {
    private final com.bytedance.push.g0.k<com.bytedance.framwork.core.sdkmonitor.f> a = new a(this);

    class a extends com.bytedance.push.g0.k<com.bytedance.framwork.core.sdkmonitor.f> {
        a(j jVar) {
        }

        @Override // com.bytedance.push.g0.k
        protected com.bytedance.framwork.core.sdkmonitor.f e(Object[] objArr) {
            SDKMonitorUtils.d("3405", Collections.singletonList("https://mon.snssdk.com/monitor/collect/"));
            SDKMonitorUtils.c("3405", Collections.singletonList("https://mon.snssdk.com/monitor/appmonitor/v2/settings"));
            return SDKMonitorUtils.a("3405");
        }
    }

    class b implements f.k {
        b(j jVar) {
        }

        @Override // com.bytedance.framwork.core.sdkmonitor.f.k
        public Map<String, String> getCommonParams() {
            Map<String, String> n = ((com.ss.android.g.e.b) com.ss.android.ug.bus.b.a(com.ss.android.g.e.b.class)).n();
            n.put("oversea", "0");
            n.remove(WsConstants.KEY_APP_ID);
            return n;
        }

        @Override // com.bytedance.framwork.core.sdkmonitor.f.k
        public String getSessionId() {
            return null;
        }
    }

    @Override // com.bytedance.push.interfaze.r
    public void ensureNotReachHere(Throwable th) {
    }

    @Override // com.bytedance.push.interfaze.r
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jSONObject4 = jSONObject == null ? new JSONObject() : jSONObject;
        try {
            jSONObject4.put("ab_tag", com.ss.android.pushmanager.setting.c.c().g().F());
            jSONObject4.put(Constants.PHONE_BRAND, Build.BRAND.toLowerCase(Locale.ROOT));
            jSONObject4.put("os_detail_type", com.bytedance.push.g0.j.h() ? "harmony" : "android");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (com.bytedance.push.g0.f.d()) {
            JSONObject jSONObject5 = new JSONObject();
            try {
                jSONObject5.put("service_name", str);
                jSONObject5.put(PushLog.KEY_CATEGORY, jSONObject);
                jSONObject5.put("metric", jSONObject2);
                jSONObject5.put("extra", jSONObject3);
                com.bytedance.push.g0.f.c("", jSONObject5.toString());
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        this.a.f(new Object[0]).O(str, jSONObject4, jSONObject2, jSONObject3);
    }

    @Override // com.bytedance.push.interfaze.r
    public void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        this.a.f(new Object[0]).S(str, i, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.push.interfaze.r
    public void onUserActive() {
        C0679c d2 = ((C) C.a()).d();
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap hashMap = new HashMap();
            com.ss.android.pushmanager.setting.a.a().b(hashMap);
            jSONObject.put("device_id", hashMap.get("device_id"));
            jSONObject.put("host_aid", d2.b);
            jSONObject.put("sdk_version", "3.9.28");
            jSONObject.put("channel", d2.h);
            jSONObject.put("app_version", d2.f5620e);
            jSONObject.put("update_version_code", d2.f5619d);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        SDKMonitorUtils.b(com.ss.android.message.a.a(), "3405", jSONObject, new b(this));
    }
}
