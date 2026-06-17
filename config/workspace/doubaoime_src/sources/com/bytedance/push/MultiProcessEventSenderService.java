package com.bytedance.push;

import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.push.interfaze.IMultiProcessEventSenderService;
import com.ss.android.message.log.PushLog;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MultiProcessEventSenderService implements IMultiProcessEventSenderService {
    private final String TAG = "MultiProcessEventSenderService";

    @Override // com.bytedance.android.service.manager.push.interfaze.IMultiProcessEventSenderService
    public void onEventV3(String str, JSONObject jSONObject) {
        onEventV3(false, str, jSONObject);
    }

    @Override // com.bytedance.android.service.manager.push.interfaze.IMultiProcessEventSenderService
    public void onEventV3(boolean z, String str, JSONObject jSONObject) {
        com.bytedance.common.model.c c2 = com.bytedance.common.g.a.c().e().c();
        if (z) {
            StringBuilder U = e.a.a.a.a.U("report event by http: event name is ", str, " params is ");
            U.append(jSONObject == null ? "" : jSONObject.toString());
            com.bytedance.push.g0.f.g("MultiProcessEventSenderService", U.toString());
            PushServiceManager.get().getIAllianceService().onEventV3WithHttp(true, str, jSONObject);
        }
        if (!com.ss.android.message.f.a.t(c2.a)) {
            StringBuilder U2 = e.a.a.a.a.U("report event by pushLog: event name is ", str, " params is ");
            U2.append(jSONObject != null ? jSONObject.toString() : "");
            com.bytedance.push.g0.f.g("MultiProcessEventSenderService", U2.toString());
            PushLog.onEventV3(c2.a, str, jSONObject);
            return;
        }
        com.bytedance.push.interfaze.e eVar = c2.l;
        if (eVar != null) {
            StringBuilder U3 = e.a.a.a.a.U("report event by appLog: event name is ", str, " params is ");
            U3.append(jSONObject != null ? jSONObject.toString() : "");
            com.bytedance.push.g0.f.g("MultiProcessEventSenderService", U3.toString());
            eVar.onEventV3(str, jSONObject);
        }
    }
}
