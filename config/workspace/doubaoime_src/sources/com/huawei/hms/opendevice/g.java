package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResp;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.aaid.threads.AsyncExec;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* loaded from: classes2.dex */
public class g extends TaskApiCall<PushClient, TokenResult> {
    private Context a;
    private TokenReq b;

    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.a(g.this.a).b(this.a).equals(this.b)) {
                return;
            }
            HMSLog.i(HmsInstanceId.TAG, "receive a new token, refresh the local token");
            i.a(g.this.a).b(this.a, this.b);
        }
    }

    public g(String str, TokenReq tokenReq, Context context, String str2) {
        super(str, JsonUtil.createJsonString(tokenReq), str2);
        this.a = context;
        this.b = tokenReq;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return this.b.isMultiSender() ? 50004300 : 30000000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, com.huawei.d.a.g<TokenResult> gVar) {
        if (responseErrorCode.getErrorCode() != 0) {
            String str2 = HmsInstanceId.TAG;
            StringBuilder M = e.a.a.a.a.M("TokenTask failed, ErrorCode:");
            M.append(responseErrorCode.getErrorCode());
            HMSLog.e(str2, M.toString());
            a(responseErrorCode, gVar);
        } else {
            TokenResp tokenResp = (TokenResp) JsonUtil.jsonToEntity(str, new TokenResp());
            ErrorEnum fromCode = ErrorEnum.fromCode(tokenResp.getRetCode());
            if (fromCode != ErrorEnum.SUCCESS) {
                gVar.a(fromCode.toApiException());
                String str3 = HmsInstanceId.TAG;
                StringBuilder M2 = e.a.a.a.a.M("TokenTask failed, StatusCode:");
                M2.append(fromCode.getExternalCode());
                HMSLog.e(str3, M2.toString());
            } else {
                TokenResult tokenResult = new TokenResult();
                tokenResult.setToken(tokenResp.getToken());
                tokenResult.setBelongId(tokenResp.getBelongId());
                tokenResult.setRetCode(ErrorEnum.fromCode(tokenResp.getRetCode()).getExternalCode());
                gVar.b(tokenResult);
                String token = tokenResp.getToken();
                if (TextUtils.isEmpty(token)) {
                    HMSLog.i(HmsInstanceId.TAG, "GetTokenTask receive an empty token, please check onNewToken callback method.");
                    h.a(pushClient.getContext(), getUri(), responseErrorCode);
                    return;
                }
                a(token, this.b.getSubjectId());
            }
        }
        h.a(pushClient.getContext(), getUri(), responseErrorCode);
    }

    private void a(ResponseErrorCode responseErrorCode, com.huawei.d.a.g<TokenResult> gVar) {
        ErrorEnum fromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (fromCode != ErrorEnum.ERROR_UNKNOWN) {
            gVar.a(fromCode.toApiException());
        } else {
            gVar.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    private void a(String str, String str2) {
        AsyncExec.submitSeqIO(new a(str2, str));
    }
}
