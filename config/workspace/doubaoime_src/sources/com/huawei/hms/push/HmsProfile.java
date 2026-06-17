package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ProfileTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.ProfileReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* loaded from: classes2.dex */
public class HmsProfile {
    public static final int CUSTOM_PROFILE = 2;
    public static final int HUAWEI_PROFILE = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final String f7414c = "HmsProfile";
    private Context a;
    private HuaweiApi<Api.ApiOptions.NoOptions> b;

    private HmsProfile(Context context) {
        this.a = null;
        Preconditions.checkNotNull(context);
        this.a = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.b = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.b = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.b.setKitSdkVersion(61300300);
    }

    private com.huawei.d.a.f<Void> a(int i, String str, int i2, String str2) {
        if (!isSupportProfile()) {
            com.huawei.d.a.j.e eVar = new com.huawei.d.a.j.e();
            ApiException apiException = ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException();
            synchronized (eVar.a) {
                if (!eVar.b) {
                    eVar.b = true;
                    eVar.f6988e = apiException;
                    eVar.a.notifyAll();
                    eVar.h();
                }
            }
            return eVar;
        }
        if (!TextUtils.isEmpty(str)) {
            String a = a(this.a);
            if (TextUtils.isEmpty(a)) {
                HMSLog.i(f7414c, "agc connect services config missing project id.");
                com.huawei.d.a.j.e eVar2 = new com.huawei.d.a.j.e();
                ApiException apiException2 = ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
                synchronized (eVar2.a) {
                    if (!eVar2.b) {
                        eVar2.b = true;
                        eVar2.f6988e = apiException2;
                        eVar2.a.notifyAll();
                        eVar2.h();
                    }
                }
                return eVar2;
            }
            if (str.equals(a)) {
                str = "";
            }
        }
        ProfileReq profileReq = new ProfileReq();
        if (i == 0) {
            profileReq.setOperation(0);
            profileReq.setType(i2);
        } else {
            profileReq.setOperation(1);
        }
        String reportEntry = PushBiUtil.reportEntry(this.a, PushNaming.PUSH_PROFILE);
        try {
            profileReq.setSubjectId(str);
            profileReq.setProfileId(com.huawei.e.a.a.a.b.b.b(str2));
            profileReq.setPkgName(this.a.getPackageName());
            return this.b.doWrite(new ProfileTask(PushNaming.PUSH_PROFILE, JsonUtil.createJsonString(profileReq), reportEntry));
        } catch (Exception e2) {
            if (e2.getCause() instanceof ApiException) {
                com.huawei.d.a.j.e eVar3 = new com.huawei.d.a.j.e();
                ApiException apiException3 = (ApiException) e2.getCause();
                synchronized (eVar3.a) {
                    if (!eVar3.b) {
                        eVar3.b = true;
                        eVar3.f6988e = apiException3;
                        eVar3.a.notifyAll();
                        eVar3.h();
                    }
                    PushBiUtil.reportExit(this.a, PushNaming.PUSH_PROFILE, reportEntry, apiException3.getStatusCode());
                    return eVar3;
                }
            }
            com.huawei.d.a.j.e eVar4 = new com.huawei.d.a.j.e();
            Context context = this.a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            PushBiUtil.reportExit(context, PushNaming.PUSH_PROFILE, reportEntry, errorEnum);
            ApiException apiException4 = errorEnum.toApiException();
            synchronized (eVar4.a) {
                if (!eVar4.b) {
                    eVar4.b = true;
                    eVar4.f6988e = apiException4;
                    eVar4.a.notifyAll();
                    eVar4.h();
                }
                return eVar4;
            }
        }
    }

    private boolean b(Context context) {
        return d.b(context) >= 110001400;
    }

    public static HmsProfile getInstance(Context context) {
        return new HmsProfile(context);
    }

    public com.huawei.d.a.f<Void> addProfile(int i, String str) {
        return addProfile("", i, str);
    }

    public com.huawei.d.a.f<Void> deleteProfile(String str) {
        return deleteProfile("", str);
    }

    public boolean isSupportProfile() {
        if (!d.d(this.a)) {
            return true;
        }
        if (d.c()) {
            HMSLog.i(f7414c, "current EMUI version below 9.1, not support profile operation.");
            return false;
        }
        if (b(this.a)) {
            return true;
        }
        HMSLog.i(f7414c, "current HwPushService.apk version below 11.0.1.400,please upgrade your HwPushService.apk version.");
        return false;
    }

    public com.huawei.d.a.f<Void> addProfile(String str, int i, String str2) {
        if (i != 1 && i != 2) {
            HMSLog.i(f7414c, "add profile type undefined.");
            com.huawei.d.a.j.e eVar = new com.huawei.d.a.j.e();
            ApiException apiException = ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException();
            synchronized (eVar.a) {
                if (!eVar.b) {
                    eVar.b = true;
                    eVar.f6988e = apiException;
                    eVar.a.notifyAll();
                    eVar.h();
                }
            }
            return eVar;
        }
        if (!TextUtils.isEmpty(str2)) {
            return a(0, str, i, str2);
        }
        HMSLog.i(f7414c, "add profile params is empty.");
        com.huawei.d.a.j.e eVar2 = new com.huawei.d.a.j.e();
        ApiException apiException2 = ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException();
        synchronized (eVar2.a) {
            if (!eVar2.b) {
                eVar2.b = true;
                eVar2.f6988e = apiException2;
                eVar2.a.notifyAll();
                eVar2.h();
            }
        }
        return eVar2;
    }

    public com.huawei.d.a.f<Void> deleteProfile(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return a(1, str, -1, str2);
        }
        HMSLog.e(f7414c, "del profile params is empty.");
        com.huawei.d.a.j.e eVar = new com.huawei.d.a.j.e();
        ApiException apiException = ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException();
        synchronized (eVar.a) {
            if (!eVar.b) {
                eVar.b = true;
                eVar.f6988e = apiException;
                eVar.a.notifyAll();
                eVar.h();
            }
        }
        return eVar;
    }

    private static String a(Context context) {
        return ((com.huawei.b.g.e.c) com.huawei.b.g.a.d(context)).a("client/project_id");
    }
}
