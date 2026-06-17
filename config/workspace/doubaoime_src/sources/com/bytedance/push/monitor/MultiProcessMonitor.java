package com.bytedance.push.monitor;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.service.manager.push.monitor.IMultiProcessMonitor;
import com.bytedance.common.model.ProcessEnum;
import com.bytedance.push.C0679c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MultiProcessMonitor implements IMultiProcessMonitor, com.bytedance.common.d.a.d {
    private final String METHOD_NAME_MULTI_PROCESS_MONITOR = "multi_process_monitor";

    @Override // com.bytedance.common.d.a.d
    public String getMethodName() {
        return "multi_process_monitor";
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IMultiProcessMonitor
    public void init(Context context) {
        if (com.ss.android.message.f.a.t(context)) {
            com.bytedance.common.d.a.b.m().q(this);
        }
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IMultiProcessMonitor
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (com.ss.android.message.f.a.t(C0679c.a().a)) {
            i.b(str, jSONObject, jSONObject2, jSONObject3);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(jSONObject == null ? "" : jSONObject.toString());
        arrayList.add(jSONObject2 == null ? "" : jSONObject2.toString());
        arrayList.add(jSONObject3 != null ? jSONObject3.toString() : "");
        com.bytedance.common.d.a.b.m().k(ProcessEnum.MAIN, "multi_process_monitor", arrayList, true);
    }

    @Override // com.bytedance.common.d.a.d
    public String onMethodCall(ProcessEnum processEnum, List list) {
        try {
            String str = (String) list.get(0);
            String str2 = (String) list.get(1);
            String str3 = (String) list.get(2);
            String str4 = (String) list.get(3);
            monitorEvent(str, TextUtils.isEmpty(str2) ? null : new JSONObject(str2), TextUtils.isEmpty(str3) ? null : new JSONObject(str3), TextUtils.isEmpty(str4) ? null : new JSONObject(str4));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }
}
