package com.ss.alive.monitor.services.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.common.d.a.d;
import com.bytedance.common.model.ProcessEnum;
import com.bytedance.push.g0.f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AssociationStartMonitorEventServiceImpl extends com.bytedance.common.push.c implements d {
    private boolean mIsActive;
    private ProcessEnum mProcessEnum;
    private final String TAG = "AssociationStartMonitor";
    private final String ALOG_TAG = "ALOG_ASSOCIATION_START_MONITOR";
    private final String ASSOCIATION_START_METHOD_NAME = "onAssociationStartEvent";
    private boolean mEnableReport = false;

    public AssociationStartMonitorEventServiceImpl(Context context) {
        ProcessEnum g2 = com.ss.android.message.f.a.g(context);
        this.mProcessEnum = g2;
        if (g2 == ProcessEnum.MAIN) {
            com.bytedance.common.d.a.b.m().q(this);
            this.mIsActive = com.ss.android.message.f.a.r(context);
        }
    }

    private void monitorEventInternal(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.mProcessEnum != ProcessEnum.MAIN) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        add(jSONObject, "sdk_version", "1.0");
        add(jSONObject, "is_active", this.mIsActive ? 1L : 0L);
        f.c("AssociationStartMonitor", "[monitorEventInternal] serviceName is " + str);
        PushServiceManager.get().getPushExternalService().monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
    }

    public void enableReport(boolean z) {
        this.mEnableReport = z;
    }

    @Override // com.bytedance.common.d.a.d
    public String getMethodName() {
        return "onAssociationStartEvent";
    }

    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.mEnableReport) {
            ProcessEnum processEnum = this.mProcessEnum;
            ProcessEnum processEnum2 = ProcessEnum.MAIN;
            if (processEnum == processEnum2) {
                monitorEventInternal(str, jSONObject, jSONObject2, jSONObject3);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(jSONObject == null ? "" : jSONObject.toString());
            arrayList.add(jSONObject2 == null ? "" : jSONObject2.toString());
            arrayList.add(jSONObject3 != null ? jSONObject3.toString() : "");
            com.bytedance.common.d.a.b.m().k(processEnum2, "onAssociationStartEvent", arrayList, true);
        }
    }

    public void onAssociationStartEvent(com.ss.alive.monitor.model.a aVar) {
        monitorEvent("association_start_event", aVar.z(), null, null);
    }

    public void onHookResult(String str, boolean z, String str2, long j) {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "hook_name", str);
        add(jSONObject, "result", z);
        add(jSONObject, "msg", str2);
        add(jSONObject, "process", this.mProcessEnum.processSuffix);
        add(jSONObject, "client_time", com.ss.android.message.f.a.f());
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "duration", j);
        monitorEvent("push_hook_result", jSONObject, jSONObject2, null);
    }

    @Override // com.bytedance.common.d.a.d
    public String onMethodCall(ProcessEnum processEnum, List list) {
        try {
            if (this.mProcessEnum == ProcessEnum.MAIN && list.size() == 4) {
                f.e("AssociationStartMonitor", "recv  rom the chain-start record of " + processEnum);
                String str = (String) list.get(1);
                String str2 = (String) list.get(2);
                String str3 = (String) list.get(3);
                monitorEventInternal((String) list.get(0), TextUtils.isEmpty(str) ? null : new JSONObject(str), TextUtils.isEmpty(str2) ? null : new JSONObject(str2), TextUtils.isEmpty(str3) ? null : new JSONObject(str3));
            }
        } catch (Throwable th) {
            f.e("AssociationStartMonitor", "onMethodCall error : origin processName is " + processEnum);
            th.printStackTrace();
        }
        return null;
    }

    public void onUserActive() {
        this.mIsActive = true;
    }
}
