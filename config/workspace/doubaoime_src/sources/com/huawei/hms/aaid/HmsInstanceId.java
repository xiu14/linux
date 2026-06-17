package com.huawei.hms.aaid;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.d.a.f;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.AAIDResult;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.a;
import com.huawei.hms.opendevice.b;
import com.huawei.hms.opendevice.e;
import com.huawei.hms.opendevice.g;
import com.huawei.hms.opendevice.h;
import com.huawei.hms.opendevice.i;
import com.huawei.hms.opendevice.l;
import com.huawei.hms.support.log.HMSLog;
import com.vivo.push.PushClient;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes2.dex */
public class HmsInstanceId {
    public static final String TAG = "HmsInstanceId";
    private Context a;
    private PushPreferences b;

    /* renamed from: c, reason: collision with root package name */
    private HuaweiApi<Api.ApiOptions.NoOptions> f7178c;

    private HmsInstanceId(Context context) {
        this.a = context.getApplicationContext();
        this.b = new PushPreferences(context, "aaid");
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f7178c = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f7178c = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f7178c.setKitSdkVersion(61300300);
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!e.e(this.a)) {
            i.a(this.a).removeKey("subjectId");
            return;
        }
        String string = i.a(this.a).getString("subjectId");
        if (TextUtils.isEmpty(string)) {
            i.a(this.a).saveString("subjectId", str);
            return;
        }
        if (string.contains(str)) {
            return;
        }
        i.a(this.a).saveString("subjectId", string + Constants.ACCEPT_TIME_SEPARATOR_SP + str);
    }

    private void b() throws ApiException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw ErrorEnum.ERROR_MAIN_THREAD.toApiException();
        }
    }

    public static HmsInstanceId getInstance(Context context) {
        Preconditions.checkNotNull(context);
        l.c(context);
        return new HmsInstanceId(context);
    }

    public void deleteAAID() throws ApiException {
        b();
        try {
            if (this.b.containsKey("aaid")) {
                this.b.removeKey("aaid");
                this.b.removeKey("creationTime");
                if (b.d(this.a)) {
                    if (ProxyCenter.getProxy() != null) {
                        HMSLog.i(TAG, "use proxy delete all token after delete AaId.");
                        ProxyCenter.getProxy().deleteAllToken(this.a);
                        return;
                    }
                    DeleteTokenReq a = b.a(this.a);
                    a.setDeleteType(1);
                    a.setMultiSender(false);
                    a(a, 1);
                    BaseUtils.deleteAllTokenCache(this.a);
                }
            }
        } catch (ApiException e2) {
            throw e2;
        } catch (Exception unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public void deleteToken(String str, String str2) throws ApiException {
        b();
        a();
        DeleteTokenReq a = b.a(this.a, str, str2);
        a.setMultiSender(false);
        a(a, 1);
    }

    public f<AAIDResult> getAAID() {
        try {
            return com.huawei.d.a.i.b(new a(this.a.getApplicationContext()));
        } catch (Exception unused) {
            com.huawei.d.a.j.e eVar = new com.huawei.d.a.j.e();
            ApiException apiException = ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            synchronized (eVar.a) {
                if (!eVar.b) {
                    eVar.b = true;
                    eVar.f6988e = apiException;
                    eVar.a.notifyAll();
                    eVar.h();
                }
                return eVar;
            }
        }
    }

    public long getCreationTime() {
        try {
            if (!this.b.containsKey("creationTime")) {
                getAAID();
            }
            return this.b.getLong("creationTime");
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String getId() {
        return b.b(this.a);
    }

    @Deprecated
    public String getToken() {
        try {
            return getToken(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getToken(String str, String str2) throws ApiException {
        b();
        a();
        TokenReq b = b.b(this.a, null, str2);
        b.setAaid(getId());
        b.setMultiSender(false);
        i.a(this.a).saveString(this.a.getPackageName(), PushClient.DEFAULT_REQUEST_ID);
        return a(b, 1);
    }

    public void deleteToken(String str) throws ApiException {
        b();
        a();
        if (!TextUtils.isEmpty(str)) {
            String c2 = b.c(this.a);
            if (!TextUtils.isEmpty(c2)) {
                if (str.equals(c2)) {
                    deleteToken(null, null);
                    return;
                }
                DeleteTokenReq a = b.a(this.a, str);
                a.setMultiSender(true);
                a(a, 2);
                return;
            }
            throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    public String getToken(String str) throws ApiException {
        b();
        a();
        if (!TextUtils.isEmpty(str)) {
            String c2 = b.c(this.a);
            if (!TextUtils.isEmpty(c2)) {
                if (str.equals(c2)) {
                    return getToken(null, null);
                }
                TokenReq b = b.b(this.a, str);
                b.setAaid(getId());
                b.setMultiSender(true);
                return a(b, 2);
            }
            throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    private String a(TokenReq tokenReq, int i) throws ApiException {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
            ProxyCenter.getProxy().getToken(this.a, tokenReq.getSubjectId(), null);
            return null;
        }
        a(tokenReq.getSubjectId());
        String a = h.a(this.a, "push.gettoken");
        try {
            HMSLog.d(TAG, "getToken req :" + tokenReq.toString());
            g gVar = new g("push.gettoken", tokenReq, this.a, a);
            gVar.setApiLevel(i);
            return ((TokenResult) com.huawei.d.a.i.a(this.f7178c.doWrite(gVar))).getToken();
        } catch (Exception e2) {
            if (e2.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e2.getCause();
                h.a(this.a, "push.gettoken", a, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            h.a(context, "push.gettoken", a, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    private void a(DeleteTokenReq deleteTokenReq, int i) throws ApiException {
        String subjectId = deleteTokenReq.getSubjectId();
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i(TAG, "use proxy delete token");
            ProxyCenter.getProxy().deleteToken(this.a, subjectId, null);
            return;
        }
        String a = h.a(this.a, "push.deletetoken");
        try {
            String b = i.a(this.a).b(subjectId);
            if (deleteTokenReq.isMultiSender() && (TextUtils.isEmpty(b) || b.equals(i.a(this.a).b(null)))) {
                i.a(this.a).removeKey(subjectId);
                HMSLog.i(TAG, "The local subject token is null");
                return;
            }
            deleteTokenReq.setToken(b);
            com.huawei.hms.opendevice.f fVar = new com.huawei.hms.opendevice.f("push.deletetoken", deleteTokenReq, a);
            fVar.setApiLevel(i);
            com.huawei.d.a.i.a(this.f7178c.doWrite(fVar));
            i.a(this.a).c(subjectId);
        } catch (Exception e2) {
            if (e2.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e2.getCause();
                h.a(this.a, "push.deletetoken", a, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            h.a(context, "push.deletetoken", a, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    private void a() throws ApiException {
        if (BaseUtils.getProxyInit(this.a) && ProxyCenter.getProxy() == null && !BaseUtils.isMainProc(this.a)) {
            HMSLog.e(TAG, "Operations in child processes are not supported.");
            throw ErrorEnum.ERROR_OPER_IN_CHILD_PROCESS.toApiException();
        }
    }
}
