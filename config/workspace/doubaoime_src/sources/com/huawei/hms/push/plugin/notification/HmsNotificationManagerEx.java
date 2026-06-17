package com.huawei.hms.push.plugin.notification;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Looper;
import com.huawei.d.a.f;
import com.huawei.d.a.i;
import com.huawei.d.a.j.e;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.NotificationEnableReq;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes2.dex */
public class HmsNotificationManagerEx {
    private HuaweiApi<Api.ApiOptions.NoOptions> a;
    private Context b;

    private HmsNotificationManagerEx(Activity activity) {
        Preconditions.checkNotNull(activity);
        this.b = activity;
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = new HuaweiApi<>((Activity) this.b, (Api<Api.ApiOptions>) new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH), (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        this.a = huaweiApi;
        huaweiApi.setKitSdkVersion(61000300);
    }

    private f<NotificationStatus> a(Exception exc) {
        e eVar = new e();
        synchronized (eVar.a) {
            if (!eVar.b) {
                eVar.b = true;
                eVar.f6988e = exc;
                eVar.a.notifyAll();
                eVar.h();
            }
        }
        return eVar;
    }

    public static HmsNotificationManagerEx getInstance(Activity activity) {
        return new HmsNotificationManagerEx(activity);
    }

    public f<NotificationStatus> enableNotification() {
        return a();
    }

    private f<NotificationStatus> a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return a(ErrorEnum.ERROR_MAIN_THREAD.toApiException());
        }
        if (!a.a()) {
            HMSLog.e("HmsNotificationManagerEx", "operation not supported on device with EMUI lower than 10");
            return a(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException());
        }
        if (((NotificationManager) this.b.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled()) {
            HMSLog.e("HmsNotificationManagerEx", "App already enabled notification");
            return a(ErrorEnum.ERROR_NOTIFICATION_ENABLED.toApiException());
        }
        long j = new PushPreferences(this.b, "hwpush_local_config").getLong("notification_request_time");
        if (j > 0 && System.currentTimeMillis() - j < 172800000) {
            HMSLog.e("HmsNotificationManagerEx", "the frequency is too high");
            return a(ErrorEnum.ERROR_OVER_FLOW_CONTROL_SIZE.toApiException());
        }
        String reportEntry = PushBiUtil.reportEntry(this.b, "push.enableNotification");
        try {
            NotificationEnableReq notificationEnableReq = new NotificationEnableReq();
            notificationEnableReq.setPkgName(this.b.getPackageName());
            f doWrite = this.a.doWrite(new b("push.enableNotification", notificationEnableReq, this.b, reportEntry));
            i.a(doWrite);
            return doWrite;
        } catch (Exception e2) {
            if (e2.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e2.getCause();
                PushBiUtil.reportExit(this.b, "push.enableNotification", reportEntry, apiException.getStatusCode());
                return a(apiException);
            }
            Context context = this.b;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            PushBiUtil.reportExit(context, "push.enableNotification", reportEntry, errorEnum);
            return a(errorEnum.toApiException());
        }
    }
}
