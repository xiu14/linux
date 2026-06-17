package com.bytedance.push.monitor;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.provider.FontsContractCompat;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.alliance.IAllianceService;
import com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService;
import com.bytedance.common.model.ProcessEnum;
import com.bytedance.push.C;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.PushOnlineSettings$$SettingImpl;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PushSdkMonitorServiceImpl extends com.bytedance.common.push.c implements IPushSdkMonitorService, Observer {
    private Context mContext;
    private volatile com.bytedance.push.settings.u.d mPushMonitorSettingsModel;
    private final String TAG = "PushSdkMonitorServiceImpl";
    private final Object mSettingsModelLock = "settings_model_lock";
    private final AtomicBoolean mHasReportDauEvent = new AtomicBoolean(false);
    private Boolean mCurIsDau = null;
    private Boolean mCurIsTransmit = null;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PushSdkMonitorServiceImpl.this.initPushMonitorSettingsModel();
            if (PushSdkMonitorServiceImpl.this.mPushMonitorSettingsModel.f5852e) {
                PushSdkMonitorServiceImpl.this.monitorEvent("push_monitor_dau", null, null, null);
            } else {
                com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", "enableDauMonitor is false,not monitor dau");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initPushMonitorSettingsModel() {
        if (this.mPushMonitorSettingsModel == null) {
            synchronized (this.mSettingsModelLock) {
                if (this.mPushMonitorSettingsModel == null) {
                    Application a2 = com.ss.android.message.a.a();
                    this.mContext = a2;
                    if (com.ss.android.message.f.a.z(a2)) {
                        this.mPushMonitorSettingsModel = new PushOnlineSettings$$SettingImpl(new com.bytedance.push.settings.storage.h(this.mContext, "push_multi_process_config")).r();
                    } else {
                        this.mPushMonitorSettingsModel = ((PushOnlineSettings) com.bytedance.push.settings.h.b(this.mContext, PushOnlineSettings.class)).r();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (com.bytedance.push.g0.f.d()) {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("service_name", str);
                Object obj = "null";
                jSONObject4.put(PushLog.KEY_CATEGORY, jSONObject == null ? "null" : jSONObject);
                jSONObject4.put("metric", jSONObject2 == null ? "null" : jSONObject2);
                if (jSONObject3 != null) {
                    obj = jSONObject3;
                }
                jSONObject4.put("extra", obj);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", String.format("[reportEvent]%s", jSONObject4));
        } else {
            com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", String.format("[reportEvent] eventName:%s,category:%s,metric:%s,extra:%s", str, jSONObject, jSONObject2, jSONObject3));
        }
        com.bytedance.push.monitor.l.d.a().b(str, jSONObject, jSONObject2, jSONObject3);
    }

    private void onBadgeShowResult(int i, Integer num, boolean z, String str) {
        int i2;
        initPushMonitorSettingsModel();
        if (!this.mPushMonitorSettingsModel.f5850c) {
            com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", "enableBadgeApplyMonitor is false,not monitor badge show result");
            return;
        }
        com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", String.format("on badge show result,badgeNumber is %s,result is %s, msg is %s", num, Boolean.valueOf(z), str));
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "operateType", i);
        add(jSONObject, "result", z);
        if (i == 1 && this.mPushMonitorSettingsModel.f5851d) {
            try {
                i2 = PushServiceManager.get().getIRedBadgeExternalService().getCurRedBadgeNumber(this.mContext);
            } catch (RuntimeException e2) {
                com.bytedance.push.g0.f.f("PushSdkMonitorServiceImpl", "error when  getCurRedBadgeNumber", e2);
                i2 = -1;
            }
            add(jSONObject, "real_result", i2 == -1 || num.intValue() == i2);
        }
        if (num != null) {
            add(jSONObject, "badge_number", num.intValue());
        }
        add(jSONObject, "msg", str);
        add(jSONObject, "process", com.ss.android.message.f.a.j(this.mContext));
        add(jSONObject, "in_foreground", !com.bytedance.push.K.a.i());
        monitorEvent("push_monitor_red_badge_operate_result", jSONObject, null, null);
    }

    private void onDauEvent() {
        if (this.mHasReportDauEvent.getAndSet(true)) {
            com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", "has reported dau,do nothing");
        } else {
            this.mCurIsDau = Boolean.TRUE;
            com.ss.android.message.e.e().f(new a(), 0L);
        }
    }

    private void onRequestResult(String str, String str2, boolean z, String str3, String str4, long j, JSONObject jSONObject) {
        initPushMonitorSettingsModel();
        if (!this.mPushMonitorSettingsModel.f5853f) {
            com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", "enableNetworkRequestMonitor is false,not monitor network request result");
            return;
        }
        String str5 = "";
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(63);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            try {
                Matcher matcher = Pattern.compile("https?://([^/]+)/(.*)").matcher(str);
                if (matcher.find()) {
                    str5 = matcher.group(2);
                }
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("error when parsePathFromUrl:");
                M.append(th.getLocalizedMessage());
                com.bytedance.push.g0.f.e("", M.toString());
            }
            str5 = str;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, DownloadConstants.PATH_KEY, str5);
        add(jSONObject2, "method", str2);
        add(jSONObject2, "result", z);
        add(jSONObject2, "msg", str3);
        add(jSONObject2, "network_client_class_name", str4);
        add(jSONObject2, "process", com.ss.android.message.f.a.j(this.mContext));
        add(jSONObject2, "in_foreground", !com.bytedance.push.K.a.i());
        if (jSONObject != null) {
            add(jSONObject2, jSONObject);
        }
        JSONObject jSONObject3 = new JSONObject();
        add(jSONObject3, "time_cost", currentTimeMillis);
        monitorEvent("push_monitor_network_request_result", jSONObject2, jSONObject3, null);
    }

    private void startSdkMonitor(Context context) {
        h.c().j();
        if (com.ss.android.message.f.a.t(context)) {
            if (com.bytedance.push.K.a.i()) {
                com.bytedance.push.K.a.d().addObserver(this);
            } else {
                onDauEvent();
            }
        }
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public boolean curIsDau() {
        Boolean bool = this.mCurIsDau;
        return bool != null && bool.booleanValue();
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public boolean curIsTransmit() {
        Boolean bool = this.mCurIsTransmit;
        return bool != null && bool.booleanValue();
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void initOnApplication(Context context) {
        startSdkMonitor(context);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onActivityDepthsDeviceStatus(JSONObject jSONObject) {
        monitorEvent("push_monitor_activity_depths_device_status", jSONObject, null, null);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onActivityStartResult(boolean z, int i, String str, String str2, String str3, long j, String str4) {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "event_type", "all_activity_start_event");
        add(jSONObject, "result", z);
        add(jSONObject, FontsContractCompat.Columns.RESULT_CODE, i);
        add(jSONObject, "target_pkg", str);
        add(jSONObject, "result_msg", str2);
        add(jSONObject, "target_activity", str3);
        if (TextUtils.isEmpty(str4)) {
            str4 = "null";
        }
        add(jSONObject, "cur_top_app", str4);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "life_cycle_time_cost", j);
        monitorEvent("push_monitor_activity_start_result", jSONObject, jSONObject2, null);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onActivityStartReturnValue(String str, JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "target_pkg", str);
        add(jSONObject2, "target_activity", jSONObject);
        add(jSONObject2, "return_value", i);
        monitorEvent("push_monitor_activity_start_return_value", jSONObject2, null, null);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onBadgeOperateFailed(int i, Integer num, String str) {
        onBadgeShowResult(i, num, false, str);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onBadgeOperateSuccess(int i, Integer num) {
        onBadgeShowResult(i, num, true, "success");
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onContentRequest(String str, int i, int i2) {
        initPushMonitorSettingsModel();
        if (!this.mPushMonitorSettingsModel.h) {
            com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", "enableContentRequestMonitor is false,not monitor content request result");
            return;
        }
        str.hashCode();
        if (str.equals(IAllianceService.PATH_POST_COMPOSE)) {
            if ((i & 256) == 256 || (i & 1) == 1) {
                onContentRequestInternal(str, IAllianceService.CONTENT_TYPE_BADGE, i, i2);
            }
            if ((i & 4096) == 4096 || (i & 16) == 16) {
                onContentRequestInternal(str, IAllianceService.CONTENT_TYPE_LOCAL_PUSH, i, i2);
                return;
            }
            return;
        }
        if (str.equals(IAllianceService.PATH_GET_COMPOSE)) {
            if ((i & 256) != 256) {
                onContentRequestInternal(str, IAllianceService.CONTENT_TYPE_BADGE, i, i2);
            }
            if ((i & 4096) != 4096) {
                onContentRequestInternal(str, IAllianceService.CONTENT_TYPE_LOCAL_PUSH, i, i2);
            }
        }
    }

    public void onContentRequestInternal(String str, String str2, int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        Application a2 = com.ss.android.message.a.a();
        add(jSONObject, "req_path", str);
        add(jSONObject, MonitorConstants.EXTRA_CONTENT_TYPE, str2);
        add(jSONObject, "api_strategy", i);
        add(jSONObject, "scene_id", i2);
        add(jSONObject, "process", com.ss.android.message.f.a.j(a2));
        if (TextUtils.equals(IAllianceService.PATH_POST_COMPOSE, str)) {
            if (!curIsDau()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("dau");
                this.mCurIsDau = Boolean.valueOf(Boolean.parseBoolean(com.bytedance.common.d.a.b.m().j(ProcessEnum.MAIN, "active_source_method", arrayList)));
            }
            if (!curIsTransmit()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("transmit");
                this.mCurIsTransmit = Boolean.valueOf(Boolean.parseBoolean(com.bytedance.common.d.a.b.m().j(ProcessEnum.MAIN, "active_source_method", arrayList2)));
            }
            Boolean bool = this.mCurIsDau;
            add(jSONObject, "cur_is_dau", bool == null ? "unknown" : String.valueOf(bool));
            Boolean bool2 = this.mCurIsTransmit;
            add(jSONObject, "cur_is_transmit", bool2 != null ? String.valueOf(bool2) : "unknown");
        }
        monitorEvent("push_monitor_content_request", jSONObject, null, null);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onContentShow(String str, String str2, int i) {
        initPushMonitorSettingsModel();
        if (!this.mPushMonitorSettingsModel.f5854g) {
            com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", "enableContentShowMonitor is false,not monitor network request result");
            return;
        }
        int X = ((PushOnlineSettings) com.bytedance.push.settings.h.b(com.ss.android.message.a.a(), PushOnlineSettings.class)).X();
        str.hashCode();
        if (str.equals(IAllianceService.PATH_POST_COMPOSE)) {
            if (TextUtils.equals(str2, IAllianceService.CONTENT_TYPE_BADGE)) {
                if ((X & 256) == 256) {
                    onContentShowInternal(str, IAllianceService.CONTENT_TYPE_BADGE, X, i);
                    return;
                }
                return;
            } else {
                if (TextUtils.equals(str2, IAllianceService.CONTENT_TYPE_LOCAL_PUSH) && (X & 4096) == 4096) {
                    onContentShowInternal(str, IAllianceService.CONTENT_TYPE_LOCAL_PUSH, X, i);
                    return;
                }
                return;
            }
        }
        if (str.equals(IAllianceService.PATH_GET_COMPOSE)) {
            if (TextUtils.equals(str2, IAllianceService.CONTENT_TYPE_BADGE)) {
                if ((X & 256) != 256) {
                    onContentShowInternal(str, IAllianceService.CONTENT_TYPE_BADGE, X, i);
                }
            } else {
                if (!TextUtils.equals(str2, IAllianceService.CONTENT_TYPE_LOCAL_PUSH) || (X & 4096) == 4096) {
                    return;
                }
                onContentShowInternal(str, IAllianceService.CONTENT_TYPE_LOCAL_PUSH, X, i);
            }
        }
    }

    public void onContentShowInternal(String str, String str2, int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        Application a2 = com.ss.android.message.a.a();
        add(jSONObject, "req_path", str);
        add(jSONObject, MonitorConstants.EXTRA_CONTENT_TYPE, str2);
        add(jSONObject, "api_strategy", i);
        add(jSONObject, "scene_id", i2);
        add(jSONObject, "process", com.ss.android.message.f.a.j(a2));
        monitorEvent("push_monitor_content_show", jSONObject, null, null);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onInvalidMrDepths(Context context, List<String> list) {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "preferred_features", String.valueOf(list));
        add(jSONObject, "process", com.ss.android.message.f.a.j(context));
        monitorEvent("push_monitor_invalid_mr_depths", jSONObject, null, null);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onKeepAliveFrom(String str, String str2, int i) {
        this.mCurIsTransmit = Boolean.TRUE;
        initPushMonitorSettingsModel();
        if (!this.mPushMonitorSettingsModel.i) {
            com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", "enableKeepAliveFromMonitor is false,not monitor keep_alive result");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Application a2 = com.ss.android.message.a.a();
        add(jSONObject, "partner", str);
        add(jSONObject, "method", str2);
        add(jSONObject, "api_strategy", i);
        add(jSONObject, "process", com.ss.android.message.f.a.j(a2));
        monitorEvent("push_monitor_transmit_keep_alive_from", jSONObject, null, null);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onLaunchEvent(boolean z, boolean z2, long j, long j2, int i, int i2, String str) {
        com.bytedance.common.model.c c2;
        com.bytedance.common.push.e.g gVar;
        if (!com.ss.android.message.f.a.t(com.ss.android.message.a.a())) {
            com.bytedance.push.g0.f.m("PushSdkMonitorServiceImpl", "[onLaunchEvent]do nothing because cur is not main process");
            return;
        }
        com.bytedance.common.g.b.b e2 = com.bytedance.common.g.a.c().e();
        boolean z3 = false;
        if (e2 != null && (c2 = e2.c()) != null && (gVar = c2.o) != null) {
            com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", String.format("onLaunchEvent,enableMonitorNotificationClick from host is %s", Boolean.valueOf(gVar.enableMonitorNotificationClick())));
            z3 = gVar.enableMonitorNotificationClick();
        }
        com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", "[onLaunchEvent]enableMonitorNotificationClick from host:" + z3);
        if (!z3) {
            initPushMonitorSettingsModel();
            z3 = this.mPushMonitorSettingsModel.a;
            com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", "[onLaunchEvent]enableMonitorNotificationClick from sdk settings:" + z3);
        }
        if (!z3) {
            com.bytedance.push.g0.f.m("PushSdkMonitorServiceImpl", "[onLaunchEvent]enableMonitorNotificationClick is false,do nothing");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("detect_timeout", z);
            jSONObject.put("success_to_foreground", z2);
            JSONObject jSONObject2 = new JSONObject();
            if (!z) {
                if (z2) {
                    jSONObject2.put("process_launch_to_foreground_time_cost", j);
                    jSONObject2.put("component_launch_to_foreground_time_cost", j2);
                }
                jSONObject2.put("badge_num_when_app_launch", i);
                jSONObject.put("start_type", i2);
                jSONObject.put("component", str);
            }
            monitorEvent("push_monitor_app_launch", jSONObject, jSONObject2, null);
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("PushSdkMonitorServiceImpl", "error when report launch event ", th);
        }
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onMessageArrive(long j) {
        initPushMonitorSettingsModel();
        if (!this.mPushMonitorSettingsModel.b) {
            com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", "enableMessageShowMonitor is false,not monitor message [arrive] and message show");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "msg_id", j);
        add(jSONObject, "process", com.ss.android.message.f.a.j(com.ss.android.message.a.a()));
        monitorEvent("push_monitor_message_arrive", jSONObject, null, null);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onMessageShow(long j, long j2) {
        initPushMonitorSettingsModel();
        if (!this.mPushMonitorSettingsModel.b) {
            com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", "enableMessageShowMonitor is false,not monitor message arrive and message [show]");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "msg_id", j);
        add(jSONObject, "process", com.ss.android.message.f.a.j(com.ss.android.message.a.a()));
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "show_time_cost", System.currentTimeMillis() - j2);
        monitorEvent("push_monitor_message_show", jSONObject, jSONObject2, null);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onProcessStartEvent(boolean z, boolean z2, long j, long j2, int i, int i2, String str, boolean z3) {
        initPushMonitorSettingsModel();
        if (this.mPushMonitorSettingsModel == null || this.mPushMonitorSettingsModel.k == null || !this.mPushMonitorSettingsModel.k.a) {
            com.bytedance.push.g0.f.m("PushSdkMonitorServiceImpl", "[onProcessStartEvent]do nothing because settings config is invalid");
            return;
        }
        com.bytedance.push.settings.u.a aVar = this.mPushMonitorSettingsModel.k;
        if (z2 && !aVar.b) {
            com.bytedance.push.g0.f.m("PushSdkMonitorServiceImpl", "[onProcessStartEvent]do nothing because cur is foreground process start but enableMonitorForegroundProcess is false");
            return;
        }
        if (!z3 && !aVar.f5844c) {
            com.bytedance.push.g0.f.m("PushSdkMonitorServiceImpl", "[onProcessStartEvent]do nothing because cur is not first process and enableMonitorAllProcess is false");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("detect_timeout", z);
            jSONObject.put("process", com.ss.android.message.f.a.j(com.ss.android.message.a.a()));
            jSONObject.put("success_to_foreground", z2);
            JSONObject jSONObject2 = new JSONObject();
            if (!z) {
                if (z2) {
                    jSONObject2.put("process_launch_to_foreground_time_cost", j);
                    jSONObject2.put("component_launch_to_foreground_time_cost", j2);
                }
                jSONObject2.put("badge_num_when_process_launch", i);
                jSONObject2.put("notification_num_when_process_launch", PushServiceManager.get().getIPushNotificationService().getNotificationNum(this.mContext));
                jSONObject.put("start_type", i2);
                jSONObject.put("component", str);
            }
            jSONObject.put("is_first_process", z3);
            monitorEvent("push_monitor_process_launch", jSONObject, jSONObject2, null);
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("PushSdkMonitorServiceImpl", "error when report launch event ", th);
        }
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onProfileIdOperateResult(int i, int i2, int i3, long j, String str) {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "operate_type", i);
        add(jSONObject, "push_type", i2);
        add(jSONObject, FontsContractCompat.Columns.RESULT_CODE, i3);
        add(jSONObject, "extra_str", str);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "time_cost", j);
        monitorEvent("push_monitor_profile_id_operate_result", jSONObject, jSONObject2, null);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService, com.bytedance.push.monitor.b
    public void onRequestFailed(String str, String str2, String str3, String str4, long j) {
        onRequestResult(str, str2, false, str3, str4, j, null);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService, com.bytedance.push.monitor.b
    public void onRequestSuccess(String str, String str2, String str3, long j) {
        onRequestResult(str, str2, true, "success", str3, j, null);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onTokenRetry(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "push_type", i);
        add(jSONObject, "retry_reason", str);
        add(jSONObject, "is_new_user", ((C) C.a()).d().F);
        monitorEvent("bdpush_retry_token_register", jSONObject, null, null);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onTokenRetryResult(int i, boolean z, String str) {
        com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", "[onTokenRetryResult]pushType:" + i + " result:" + z + " retryReason:" + str);
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "push_type", (long) i);
        add(jSONObject, "result", z);
        add(jSONObject, "retry_reason", str);
        add(jSONObject, "is_new_user", ((C) C.a()).d().F);
        monitorEvent("bdpush_retry_token_register_result", jSONObject, null, null);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService
    public void onTransmitStrategyRequest() {
        initPushMonitorSettingsModel();
        if (!this.mPushMonitorSettingsModel.f5853f) {
            com.bytedance.push.g0.f.c("PushSdkMonitorServiceImpl", "enableNetworkRequestMonitor is false,not monitor network request result");
            return;
        }
        if (!curIsDau()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("dau");
            this.mCurIsDau = Boolean.valueOf(Boolean.parseBoolean(com.bytedance.common.d.a.b.m().j(ProcessEnum.MAIN, "active_source_method", arrayList)));
        }
        if (!curIsTransmit()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("transmit");
            this.mCurIsTransmit = Boolean.valueOf(Boolean.parseBoolean(com.bytedance.common.d.a.b.m().j(ProcessEnum.MAIN, "active_source_method", arrayList2)));
        }
        JSONObject jSONObject = new JSONObject();
        Application a2 = com.ss.android.message.a.a();
        Boolean bool = this.mCurIsDau;
        add(jSONObject, "cur_is_dau", bool == null ? "unknown" : String.valueOf(bool));
        Boolean bool2 = this.mCurIsTransmit;
        add(jSONObject, "cur_is_transmit", bool2 != null ? String.valueOf(bool2) : "unknown");
        add(jSONObject, "process", com.ss.android.message.f.a.j(a2));
        monitorEvent("push_monitor_transmit_strategy_request", jSONObject, null, null);
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        onDauEvent();
        com.bytedance.push.K.a.d().deleteObserver(this);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService, com.bytedance.push.monitor.b
    public void onRequestFailed(String str, String str2, String str3, String str4, long j, JSONObject jSONObject) {
        onRequestResult(str, str2, false, str3, str4, j, jSONObject);
    }

    @Override // com.bytedance.android.service.manager.push.monitor.IPushSdkMonitorService, com.bytedance.push.monitor.b
    public void onRequestSuccess(String str, String str2, String str3, long j, JSONObject jSONObject) {
        onRequestResult(str, str2, true, "success", str3, j, jSONObject);
    }
}
