package com.huawei.hms.push.task;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import com.huawei.d.a.g;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.push.SubscribeResult;
import com.huawei.hms.push.b;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.push.SubscribeNotificationReq;
import com.huawei.hms.support.api.entity.push.SubscribeNotificationResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class SubscribeNotificationTask extends TaskApiCall<PushClient, SubscribeResult> {
    private Activity a;

    public SubscribeNotificationTask(Activity activity, String str, SubscribeNotificationReq subscribeNotificationReq, String str2) {
        super(str, JsonUtil.createJsonString(subscribeNotificationReq), str2);
        this.a = activity;
    }

    private boolean a(PushClient pushClient, ResponseErrorCode responseErrorCode) {
        Parcelable parcelable = responseErrorCode.getParcelable();
        if (!(parcelable instanceof Intent)) {
            HMSLog.e("SubscribeNotificationTask", "not instance of intent");
            return false;
        }
        Intent intent = (Intent) parcelable;
        intent.putExtra("app_token", BaseUtils.getLocalToken(pushClient.getContext(), null));
        this.a.startActivityForResult(intent, 1001);
        return true;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, g<SubscribeResult> gVar) {
        if (responseErrorCode.getErrorCode() != 0) {
            StringBuilder M = a.M("Notification subscribe failed, error code: ");
            M.append(responseErrorCode.getErrorCode());
            HMSLog.e("SubscribeNotificationTask", M.toString());
            a(responseErrorCode, gVar);
        } else {
            SubscribeNotificationResp subscribeNotificationResp = (SubscribeNotificationResp) JsonUtil.jsonToEntity(str, new SubscribeNotificationResp());
            ErrorEnum fromCode = ErrorEnum.fromCode(subscribeNotificationResp.getRetCode());
            if (fromCode != ErrorEnum.SUCCESS) {
                gVar.a(fromCode.toApiException());
                HMSLog.e("PushLogSC3004", "Notification Subscription failed, StatusCode:" + fromCode.getExternalCode());
            } else if (!responseErrorCode.hasResolution()) {
                SubscribeResult subscribeResult = new SubscribeResult();
                subscribeResult.setSubscribedItems(b.a(subscribeNotificationResp.getSubscribeResults()));
                gVar.b(subscribeResult);
            } else if (a(pushClient, responseErrorCode)) {
                gVar.b(new SubscribeResult());
            } else {
                gVar.a(ErrorEnum.ERROR_PUSH_INTERNAL_ERROR.toApiException());
            }
        }
        PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode);
    }

    private void a(ResponseErrorCode responseErrorCode, g<SubscribeResult> gVar) {
        ErrorEnum fromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (fromCode != ErrorEnum.ERROR_UNKNOWN) {
            gVar.a(fromCode.toApiException());
        } else {
            gVar.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }
}
