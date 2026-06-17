package com.huawei.hms.push;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.notification.SubscribedItem;
import com.huawei.hms.push.task.SubscribeNotificationTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.api.entity.push.SubscribeNotificationReq;
import com.huawei.hms.support.log.HMSLog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class NotificationSubscription {
    public static final int NOTIFICATION_SUBSCRIBE_REQUEST_CODE = 1001;

    /* renamed from: d, reason: collision with root package name */
    private static final String f7415d = "NotificationSubscription";
    private Activity a;
    private Context b;

    /* renamed from: c, reason: collision with root package name */
    private HuaweiApi<Api.ApiOptions.NoOptions> f7416c;

    private NotificationSubscription(Activity activity) {
        Preconditions.checkNotNull(activity);
        this.b = activity.getApplicationContext();
        this.a = activity;
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = new HuaweiApi<>(activity, (Api<Api.ApiOptions>) new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH), (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        this.f7416c = huaweiApi;
        huaweiApi.setKitSdkVersion(61300300);
    }

    private com.huawei.d.a.f<SubscribeResult> a(Exception exc) {
        com.huawei.d.a.j.e eVar = new com.huawei.d.a.j.e();
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

    private SubscribeNotificationReq b(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next());
        }
        SubscribeNotificationReq subscribeNotificationReq = new SubscribeNotificationReq();
        subscribeNotificationReq.setEntityIds(jSONArray.toString());
        subscribeNotificationReq.setToken(BaseUtils.getLocalToken(this.b, null));
        return subscribeNotificationReq;
    }

    public static NotificationSubscription getInstance(Activity activity) {
        return new NotificationSubscription(activity);
    }

    public static SubscribeResult getSubscribeResult(Intent intent) {
        String stringExtra;
        if (intent == null) {
            return null;
        }
        try {
            stringExtra = intent.getStringExtra("errorMsg");
        } catch (Throwable unused) {
            HMSLog.e(f7415d, "get subscribe result occurs exception");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            String stringExtra2 = intent.getStringExtra("subscribedItems");
            if (!TextUtils.isEmpty(stringExtra2)) {
                List<SubscribedItem> a = b.a(stringExtra2);
                SubscribeResult subscribeResult = new SubscribeResult();
                subscribeResult.setSubscribedItems(a);
                return subscribeResult;
            }
            return null;
        }
        SubscribeResult subscribeResult2 = new SubscribeResult();
        subscribeResult2.setErrorMsg(stringExtra);
        HMSLog.e(f7415d, "get subscribe error msg:" + stringExtra);
        return subscribeResult2;
    }

    public com.huawei.d.a.f<SubscribeResult> requestSubscribeNotification(List<String> list) {
        HMSLog.i(f7415d, "invoke request subscribe notification");
        return a(list);
    }

    private com.huawei.d.a.f<SubscribeResult> a(List<String> list) {
        String reportEntry = PushBiUtil.reportEntry(this.b, PushNaming.SUBSCRIBE_NOTIFICATION);
        if (list != null && !list.isEmpty() && list.size() <= 3) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                Context context = this.b;
                ErrorEnum errorEnum = ErrorEnum.ERROR_MAIN_THREAD;
                PushBiUtil.reportExit(context, PushNaming.SUBSCRIBE_NOTIFICATION, reportEntry, errorEnum);
                return a(errorEnum.toApiException());
            }
            if (!((NotificationManager) this.b.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled()) {
                HMSLog.i(f7415d, "App disabled notification");
                Context context2 = this.b;
                ErrorEnum errorEnum2 = ErrorEnum.ERROR_NOTIFICATION_DISABLED;
                PushBiUtil.reportExit(context2, PushNaming.SUBSCRIBE_NOTIFICATION, reportEntry, errorEnum2);
                return a(errorEnum2.toApiException());
            }
            try {
                if (v.a(this.b) != ErrorEnum.SUCCESS) {
                    return a(ErrorEnum.ERROR_NO_TOKEN.toApiException());
                }
                if (-1 != this.b.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.b.getPackageName()) && g.a(this.b) == -1) {
                    HMSLog.e(f7415d, "no network");
                    return a(ErrorEnum.ERROR_NO_NETWORK.toApiException());
                }
                com.huawei.d.a.f doWrite = this.f7416c.doWrite(new SubscribeNotificationTask(this.a, PushNaming.SUBSCRIBE_NOTIFICATION, b(list), reportEntry));
                com.huawei.d.a.i.a(doWrite);
                return doWrite;
            } catch (Exception e2) {
                if (e2.getCause() instanceof ApiException) {
                    ApiException apiException = (ApiException) e2.getCause();
                    PushBiUtil.reportExit(this.b, PushNaming.SUBSCRIBE_NOTIFICATION, reportEntry, apiException.getStatusCode());
                    return a(apiException);
                }
                Context context3 = this.b;
                ErrorEnum errorEnum3 = ErrorEnum.ERROR_INTERNAL_ERROR;
                PushBiUtil.reportExit(context3, PushNaming.SUBSCRIBE_NOTIFICATION, reportEntry, errorEnum3);
                return a(errorEnum3.toApiException());
            }
        }
        Context context4 = this.b;
        ErrorEnum errorEnum4 = ErrorEnum.ERROR_ARGUMENTS_INVALID;
        PushBiUtil.reportExit(context4, PushNaming.SUBSCRIBE_NOTIFICATION, reportEntry, errorEnum4);
        HMSLog.e(f7415d, "Invalid entityIds: entityId list should not be empty or more than max size");
        return a(errorEnum4.toApiException());
    }
}
