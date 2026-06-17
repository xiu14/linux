package com.huawei.hms.push.task;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.common.wschannel.WsConstants;
import com.huawei.d.a.g;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.push.r;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class SendUpStreamTask extends TaskApiCall<PushClient, BaseVoidTask> {
    private String a;
    private String b;

    public SendUpStreamTask(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        this.a = str4;
        this.b = str5;
    }

    private void a(PushClient pushClient, ResponseErrorCode responseErrorCode) {
        StringBuilder M = a.M("receive upstream, msgId :");
        M.append(this.b);
        M.append(" , packageName = ");
        M.append(this.a);
        M.append(" , errorCode = ");
        M.append(responseErrorCode.getErrorCode());
        HMSLog.i("SendUpStreamTask", M.toString());
        Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
        intent.setPackage(this.a);
        Bundle bundle = new Bundle();
        bundle.putString("message_id", this.b);
        bundle.putInt(WsConstants.KEY_CONNECTION_ERROR, responseErrorCode.getErrorCode());
        if (ErrorEnum.SUCCESS.getInternalCode() == responseErrorCode.getErrorCode()) {
            bundle.putString("message_type", "sent_message");
        } else {
            bundle.putString("message_type", "send_error");
        }
        if (new r().a(pushClient.getContext(), bundle, intent)) {
            HMSLog.i("SendUpStreamTask", "receive upstream, start service success");
            PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode);
        } else {
            HMSLog.w("SendUpStreamTask", "receive upstream, start service failed");
            PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode.getTransactionId(), ErrorEnum.ERROR_BIND_SERVICE_SELF_MAPPING);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 40003000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, g<BaseVoidTask> gVar) {
        if (responseErrorCode.getErrorCode() == 0) {
            HMSLog.i("SendUpStreamTask", "send up stream task,Operate succeed");
            gVar.b(null);
        } else {
            StringBuilder M = a.M("send up stream task,Operate failed with ret=");
            M.append(responseErrorCode.getErrorCode());
            HMSLog.e("SendUpStreamTask", M.toString());
            ErrorEnum fromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
            if (fromCode != ErrorEnum.ERROR_UNKNOWN) {
                gVar.a(fromCode.toApiException());
            } else {
                gVar.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
        }
        a(pushClient, responseErrorCode);
    }
}
