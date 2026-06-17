package com.bytedance.push;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.service.manager.pull.PullConfiguration;
import com.bytedance.android.service.manager.push.PushExternalService;
import com.bytedance.android.service.manager.push.client.intelligence.IClientFeatureService;
import com.bytedance.android.service.manager.push.client.intelligence.IClientIntelligenceService;
import com.bytedance.android.service.manager.push.client.intelligence.IFeatureCallBack;
import com.bytedance.android.service.manager.push.interfaze.IMultiProcessEventSenderService;
import com.bytedance.android.service.manager.push.monitor.IMultiProcessMonitor;
import com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService;
import com.bytedance.android.service.manager.push.notification.INotificationMonitorService;
import com.bytedance.android.service.manager.push.settings.ISettingsUpdateListener;
import com.bytedance.common.model.ProcessEnum;
import com.bytedance.push.client.intelligence.FeatureCollectionHelper;
import com.bytedance.push.notification.NotificationShowMonitor;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PushServiceProvider implements PushExternalService {
    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public boolean allowStartNonMainProcess() {
        return ((com.bytedance.push.U.a.a) ((C) C.a()).n()).o();
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public String checkAndGetValidChannelId(Context context, String str) {
        Objects.requireNonNull((com.bytedance.push.notification.l) ((C) C.a()).l());
        return (TextUtils.isEmpty(str) || !com.bytedance.push.notification.l.b(context, str)) ? PullConfiguration.PROCESS_NAME_PUSH : str;
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public void createDefaultChannel(Context context) {
        ((com.bytedance.push.notification.l) ((C) C.a()).l()).d(context);
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public boolean curIsWorkerProcess(Context context) {
        return ((com.bytedance.push.U.a.a) ((C) C.a()).n()).q(context);
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public IClientFeatureService getClientFeatureService() {
        return FeatureCollectionHelper.getInstance(com.bytedance.common.g.a.c().e().c().a);
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public IClientIntelligenceService getClientIntelligenceService() {
        return ((C) C.a()).b();
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public String getCurBusinessSysAlertTypeForCustomDialog(Context context) {
        return com.bytedance.push.third.g.o(context).m();
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public IMultiProcessMonitor getIMultiProcessMonitor() {
        return ((C) C.a()).k();
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public IMultiProcessEventSenderService getMultiProcessEventSenderService() {
        return ((C) C.a()).j();
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public INotificationMonitorService getNotificationMonitorService() {
        return NotificationShowMonitor.inst();
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public IPushSdkMonitorService getPushSdkMonitorService() {
        return ((C) C.a()).r();
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public ProcessEnum getWorkerProcess(Context context) {
        return ((com.bytedance.push.U.a.a) ((C) C.a()).n()).r(context);
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public boolean isAppNotifyOpen() {
        return com.ss.android.pushmanager.setting.c.c().i();
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public boolean isNewUserLaunch() {
        return ((C) C.a()).d().F;
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public boolean isSupportSystemPushPermissionDialog(Context context) {
        return com.bytedance.push.third.g.o(context).q();
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        com.bytedance.push.monitor.l.d.a().b(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public void onContentProviderLaunch(String str, String str2) {
        com.bytedance.push.monitor.h.c().e(str, str2);
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public void onNotificationDelete(long j, final JSONObject jSONObject) {
        final A a = (A) C0678b.a();
        Objects.requireNonNull(a);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("id", j);
            jSONObject.put("timestamp", com.ss.android.message.f.a.f());
            com.bytedance.common.push.d.a(new Runnable() { // from class: com.bytedance.push.PushImpl$6
                @Override // java.lang.Runnable
                public void run() {
                    C0679c c2;
                    ((C) C.a()).b();
                    c2 = A.this.c();
                    FeatureCollectionHelper.getInstance(c2.a).getFeatureForEventReport(new IFeatureCallBack() { // from class: com.bytedance.push.PushImpl$6.1
                        @Override // com.bytedance.android.service.manager.push.client.intelligence.IFeatureCallBack
                        public void onFeatureCallBack(JSONObject jSONObject2) {
                            if (jSONObject2 != null) {
                                try {
                                    jSONObject.put("client_feature", jSONObject2);
                                } catch (JSONException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            ((C) C.a()).j().onEventV3("push_clear_ug", jSONObject);
                        }
                    }, IClientFeatureService.INVOKE_SCENE_EVENT_PUSH_CLEAR_UG);
                }
            });
            ((C) C.a()).t().onNotificationDelete(j);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public void registerSettingsUpdateListener(ISettingsUpdateListener iSettingsUpdateListener) {
        com.ss.android.pushmanager.setting.c.c().j(iSettingsUpdateListener);
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public void requestNotificationPermissionBySysDialog(String str, com.bytedance.common.push.e.i iVar) {
        com.bytedance.push.third.g.o(com.ss.android.message.a.a()).s(str, iVar);
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public void requestSettings(List<String> list, boolean z) {
        com.bytedance.common.push.d.b(new com.bytedance.push.d0.a(true, z, list, false));
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public void requestSettingsSynchronous(List<String> list, boolean z) {
        new com.bytedance.push.d0.a(true, z, list, true).run();
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public void showPush(JSONObject jSONObject, int i, String str) {
        ((com.bytedance.push.notification.n) ((C) C.a()).o()).i(jSONObject, i, str, false);
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public void triggerSignalReport(String str) {
        ((C) C.a()).t().triggerSignalReport(str);
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public void tryUpdateNoticeState(Context context) {
        l lVar = (l) ((C) C.a()).m();
        Objects.requireNonNull(lVar);
        com.ss.android.message.e.e().f(new k(lVar, context), 0L);
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public void tryUpdateSender() {
        ((E) ((C) C.a()).s()).j(false);
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public void unRegisterSettingsUpdateListener(ISettingsUpdateListener iSettingsUpdateListener) {
        com.ss.android.pushmanager.setting.c.c().k(iSettingsUpdateListener);
    }

    @Override // com.bytedance.android.service.manager.push.PushExternalService
    public void showPush(JSONObject jSONObject, int i, String str, boolean z) {
        ((com.bytedance.push.notification.n) ((C) C.a()).o()).i(jSONObject, i, str, z);
    }
}
