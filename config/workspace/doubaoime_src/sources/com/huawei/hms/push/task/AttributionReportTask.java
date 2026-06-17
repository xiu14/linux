package com.huawei.hms.push.task;

import com.huawei.d.a.g;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class AttributionReportTask extends BaseVoidTask {
    public AttributionReportTask(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 4;
    }

    @Override // com.huawei.hms.push.task.BaseVoidTask, com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 60900100;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.hms.push.task.BaseVoidTask, com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, g<Void> gVar) {
        if (responseErrorCode.getErrorCode() == 0) {
            HMSLog.i("AnalysisReportTask", "analysis report task,Operate succeed");
            gVar.b(null);
        } else {
            StringBuilder M = a.M("analysis report task,Operate failed with ret=");
            M.append(responseErrorCode.getErrorCode());
            HMSLog.e("AnalysisReportTask", M.toString());
            ErrorEnum fromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
            if (fromCode == ErrorEnum.ERROR_UNKNOWN) {
                gVar.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            } else if (fromCode == ErrorEnum.ERROR_NOT_IN_SERVICE) {
                new PushPreferences(pushClient.getContext(), "hwpush_local_config").saveLong("analysis_last_failed_time", Long.valueOf(System.currentTimeMillis()));
                gVar.a(fromCode.toApiException());
            } else {
                gVar.a(fromCode.toApiException());
            }
        }
        PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode);
    }
}
