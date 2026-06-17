package com.bytedance.android.input.basic.settings.impl;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.crash.C0650e;
import com.bytedance.retrofit2.N;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.prolificinteractive.materialcalendarview.r;
import java.util.UUID;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g implements com.bytedance.news.common.settings.e.b {
    @Override // com.bytedance.news.common.settings.e.b
    public com.bytedance.news.common.settings.e.c request() {
        com.bytedance.news.common.settings.e.c cVar = new com.bytedance.news.common.settings.e.c();
        IAppGlobals.a aVar = IAppGlobals.a;
        if (!NetworkUtils.h(aVar.getApplication())) {
            return cVar;
        }
        aVar.j("Settings_RequestService", "settings:  Response start ");
        Object e2 = RetrofitUtils.e("https://is.snssdk.com", IRequest.class);
        l.e(e2, "createSsService(url, IRequest::class.java)");
        try {
            N<String> execute = ((IRequest) e2).getSettings().execute();
            aVar.x("Settings_RequestService", "settings:  response");
            try {
                JSONObject jSONObject = new JSONObject(execute.a());
                if (l.a("success", jSONObject.optString("message"))) {
                    JSONObject optJSONObject = jSONObject.optJSONObject(RemoteMessageConst.DATA);
                    JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("settings") : null;
                    com.bytedance.news.common.settings.e.d dVar = new com.bytedance.news.common.settings.e.d(optJSONObject2, null, UUID.randomUUID().toString(), true);
                    StringBuilder sb = new StringBuilder();
                    sb.append("settings:  settingsData = ");
                    sb.append(optJSONObject2 != null ? optJSONObject2.getJSONObject("asr_config") : null);
                    aVar.j("Settings_RequestService", sb.toString());
                    cVar.b = dVar;
                    cVar.f5505c = optJSONObject != null ? optJSONObject.optJSONObject("vid_info") : null;
                    cVar.f5506d = optJSONObject != null ? optJSONObject.optString("ctx_infos") : null;
                    cVar.a = true;
                }
            } catch (Exception e3) {
                IAppGlobals.a.e("Settings_RequestService", "settings parse data error : " + e3);
                if (!C0650e.a(e3)) {
                    com.bytedance.crash.monitor.l.d().m("settings parse data error", null, e3, "core_exception_monitor");
                }
            }
        } catch (Throwable th) {
            r.J(th);
        }
        IAppGlobals.a.j("Settings_RequestService", "settings:  Response end");
        return cVar;
    }
}
