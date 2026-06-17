package com.huawei.hms.opendevice;

import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.DeleteTokenResp;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* loaded from: classes2.dex */
public class f extends TaskApiCall<PushClient, Void> {
    private DeleteTokenReq a;

    public f(String str, DeleteTokenReq deleteTokenReq, String str2) {
        super(str, JsonUtil.createJsonString(deleteTokenReq), str2);
        this.a = deleteTokenReq;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, com.huawei.d.a.g<Void> gVar) {
        if (responseErrorCode.getErrorCode() == 0) {
            ErrorEnum fromCode = ErrorEnum.fromCode(((DeleteTokenResp) JsonUtil.jsonToEntity(str, new DeleteTokenResp())).getRetCode());
            if (fromCode != ErrorEnum.SUCCESS) {
                gVar.a(fromCode.toApiException());
                return;
            } else {
                gVar.b(null);
                h.a(pushClient.getContext(), getUri(), responseErrorCode);
                return;
            }
        }
        String str2 = HmsInstanceId.TAG;
        StringBuilder M = e.a.a.a.a.M("DeleteTokenTask failed, ErrorCode: ");
        M.append(responseErrorCode.getErrorCode());
        HMSLog.e(str2, M.toString());
        ErrorEnum fromCode2 = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (fromCode2 != ErrorEnum.ERROR_UNKNOWN) {
            gVar.a(fromCode2.toApiException());
        } else {
            gVar.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return this.a.isMultiSender() ? 50004300 : 30000000;
    }
}
