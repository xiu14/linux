package com.huawei.hms.push.plugin.notification;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.huawei.d.a.g;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.push.NotificationEnableReq;
import com.huawei.hms.support.api.entity.push.NotificationEnableResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* loaded from: classes2.dex */
public class b extends TaskApiCall<PushClient, NotificationStatus> {
    private Context a;
    private NotificationEnableReq b;

    public b(String str, NotificationEnableReq notificationEnableReq, Context context, String str2) {
        super(str, JsonUtil.createJsonString(notificationEnableReq), str2);
        this.a = context;
        this.b = notificationEnableReq;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, g<NotificationStatus> gVar) {
        if (responseErrorCode.getErrorCode() != 0) {
            StringBuilder M = e.a.a.a.a.M("Notification Enable failed, ErrorCode:");
            M.append(responseErrorCode.getErrorCode());
            HMSLog.e("HmsNotificationManagerEx", M.toString());
            a(responseErrorCode, gVar);
            return;
        }
        ErrorEnum fromCode = ErrorEnum.fromCode(((NotificationEnableResp) JsonUtil.jsonToEntity(str, new NotificationEnableResp())).getRetCode());
        if (fromCode != ErrorEnum.SUCCESS) {
            gVar.a(fromCode.toApiException());
            HMSLog.e("HmsNotificationManagerEx", "Notification Enable failed, StatusCode:" + fromCode.getExternalCode());
            return;
        }
        NotificationStatus notificationStatus = new NotificationStatus();
        notificationStatus.setRetCode(fromCode.getExternalCode());
        notificationStatus.getStatus().setIntent(a(responseErrorCode));
        gVar.b(notificationStatus);
        new PushPreferences(this.a, "hwpush_local_config").saveLong("notification_request_time", Long.valueOf(System.currentTimeMillis()));
        PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 5;
    }

    private void a(ResponseErrorCode responseErrorCode, g<NotificationStatus> gVar) {
        ErrorEnum fromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (fromCode != ErrorEnum.ERROR_UNKNOWN) {
            gVar.a(fromCode.toApiException());
        } else {
            gVar.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    private Intent a(ResponseErrorCode responseErrorCode) {
        Parcelable parcelable = responseErrorCode.getParcelable();
        if (parcelable == null) {
            return new Intent();
        }
        if (parcelable instanceof Intent) {
            return (Intent) parcelable;
        }
        return new Intent();
    }
}
