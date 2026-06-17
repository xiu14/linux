package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.encrypt.PushEncrypter;
import com.huawei.hms.aaid.init.AutoInitHelper;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.task.BaseVoidTask;
import com.huawei.hms.push.task.IntentCallable;
import com.huawei.hms.push.task.SendUpStreamTask;
import com.huawei.hms.push.task.SubscribeTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableNotifyReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.api.entity.push.SubscribeReq;
import com.huawei.hms.support.api.entity.push.UpSendMsgReq;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.NetWorkUtil;
import com.vivo.push.PushClientConstants;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class HmsMessaging {
    public static final String DEFAULT_TOKEN_SCOPE = "HCM";

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f7413c = Pattern.compile("[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
    private Context a;
    private HuaweiApi<Api.ApiOptions.NoOptions> b;

    private HmsMessaging(Context context) {
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

    private com.huawei.d.a.f<Void> a(String str, String str2) {
        String reportEntry = PushBiUtil.reportEntry(this.a, PushNaming.SUBSCRIBE);
        if (str == null || !f7413c.matcher(str).matches()) {
            PushBiUtil.reportExit(this.a, PushNaming.SUBSCRIBE, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            HMSLog.e("HmsMessaging", "Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
            throw new IllegalArgumentException("Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
        }
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "use proxy subscribe.");
            return TextUtils.equals(str2, "Sub") ? ProxyCenter.getProxy().subscribe(this.a, str, reportEntry) : ProxyCenter.getProxy().unsubscribe(this.a, str, reportEntry);
        }
        try {
            ErrorEnum a = v.a(this.a);
            if (a != ErrorEnum.SUCCESS) {
                throw a.toApiException();
            }
            if (NetWorkUtil.getNetworkType(this.a) == 0) {
                HMSLog.e("HmsMessaging", "no network");
                throw ErrorEnum.ERROR_NO_NETWORK.toApiException();
            }
            SubscribeReq subscribeReq = new SubscribeReq(this.a, str2, str);
            subscribeReq.setToken(BaseUtils.getLocalToken(this.a, null));
            return d.b() ? this.b.doWrite(new BaseVoidTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), reportEntry)) : this.b.doWrite(new SubscribeTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), reportEntry));
        } catch (ApiException e2) {
            com.huawei.d.a.j.e eVar = new com.huawei.d.a.j.e();
            synchronized (eVar.a) {
                if (!eVar.b) {
                    eVar.b = true;
                    eVar.f6988e = e2;
                    eVar.a.notifyAll();
                    eVar.h();
                }
                PushBiUtil.reportExit(this.a, PushNaming.SUBSCRIBE, reportEntry, e2.getStatusCode());
                return eVar;
            }
        } catch (Exception unused) {
            com.huawei.d.a.j.e eVar2 = new com.huawei.d.a.j.e();
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            ApiException apiException = errorEnum.toApiException();
            synchronized (eVar2.a) {
                if (!eVar2.b) {
                    eVar2.b = true;
                    eVar2.f6988e = apiException;
                    eVar2.a.notifyAll();
                    eVar2.h();
                }
                PushBiUtil.reportExit(this.a, PushNaming.SUBSCRIBE, reportEntry, errorEnum);
                return eVar2;
            }
        }
    }

    public static synchronized HmsMessaging getInstance(Context context) {
        HmsMessaging hmsMessaging;
        synchronized (HmsMessaging.class) {
            hmsMessaging = new HmsMessaging(context);
        }
        return hmsMessaging;
    }

    public boolean isAutoInitEnabled() {
        return AutoInitHelper.isAutoInitEnabled(this.a);
    }

    public void send(RemoteMessage remoteMessage) {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.e("HmsMessaging", "Operation(send) unsupported");
            throw new UnsupportedOperationException("Operation(send) unsupported");
        }
        HMSLog.i("HmsMessaging", "send upstream message");
        a(remoteMessage);
    }

    public void setAutoInitEnabled(boolean z) {
        AutoInitHelper.setAutoInitEnabled(this.a, z);
    }

    public com.huawei.d.a.f<Void> subscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke subscribe");
        return a(str, "Sub");
    }

    public com.huawei.d.a.f<Void> turnOffPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn off for proxy");
            return ProxyCenter.getProxy().turnOff(this.a, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOffPush");
        return a(false);
    }

    public com.huawei.d.a.f<Void> turnOnPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn on for proxy");
            return ProxyCenter.getProxy().turnOn(this.a, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOnPush");
        return a(true);
    }

    public com.huawei.d.a.f<Void> unsubscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke unsubscribe");
        return a(str, "UnSub");
    }

    private void a(RemoteMessage remoteMessage) {
        String reportEntry = PushBiUtil.reportEntry(this.a, PushNaming.UPSEND_MSG);
        ErrorEnum a = v.a(this.a);
        if (a == ErrorEnum.SUCCESS) {
            if (!TextUtils.isEmpty(remoteMessage.getTo())) {
                if (!TextUtils.isEmpty(remoteMessage.getMessageId())) {
                    if (!TextUtils.isEmpty(remoteMessage.getData())) {
                        UpSendMsgReq upSendMsgReq = new UpSendMsgReq();
                        upSendMsgReq.setPackageName(this.a.getPackageName());
                        upSendMsgReq.setMessageId(remoteMessage.getMessageId());
                        upSendMsgReq.setTo(remoteMessage.getTo());
                        upSendMsgReq.setData(remoteMessage.getData());
                        upSendMsgReq.setMessageType(remoteMessage.getMessageType());
                        upSendMsgReq.setTtl(remoteMessage.getTtl());
                        upSendMsgReq.setCollapseKey(remoteMessage.getCollapseKey());
                        upSendMsgReq.setSendMode(remoteMessage.getSendMode());
                        upSendMsgReq.setReceiptMode(remoteMessage.getReceiptMode());
                        if (d.b()) {
                            this.b.doWrite(new BaseVoidTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), reportEntry));
                            return;
                        } else {
                            a(upSendMsgReq, reportEntry);
                            return;
                        }
                    }
                    HMSLog.e("HmsMessaging", "Mandatory parameter 'data' missing");
                    PushBiUtil.reportExit(this.a, PushNaming.UPSEND_MSG, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
                    throw new IllegalArgumentException("Mandatory parameter 'data' missing");
                }
                HMSLog.e("HmsMessaging", "Mandatory parameter 'message_id' missing");
                PushBiUtil.reportExit(this.a, PushNaming.UPSEND_MSG, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
                throw new IllegalArgumentException("Mandatory parameter 'message_id' missing");
            }
            HMSLog.e("HmsMessaging", "Mandatory parameter 'to' missing");
            PushBiUtil.reportExit(this.a, PushNaming.UPSEND_MSG, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            throw new IllegalArgumentException("Mandatory parameter 'to' missing");
        }
        StringBuilder M = e.a.a.a.a.M("Message sent failed:");
        M.append(a.getExternalCode());
        M.append(':');
        M.append(a.getMessage());
        HMSLog.e("HmsMessaging", M.toString());
        PushBiUtil.reportExit(this.a, PushNaming.UPSEND_MSG, reportEntry, a);
        throw new UnsupportedOperationException(a.getMessage());
    }

    private com.huawei.d.a.f<Void> a(boolean z) {
        String reportEntry = PushBiUtil.reportEntry(this.a, PushNaming.SET_NOTIFY_FLAG);
        if (d.d(this.a) && !d.b()) {
            if (HwBuildEx.VERSION.EMUI_SDK_INT < 12) {
                HMSLog.e("HmsMessaging", "operation not available on Huawei device with EMUI lower than 5.1");
                com.huawei.d.a.j.e eVar = new com.huawei.d.a.j.e();
                ErrorEnum errorEnum = ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED;
                ApiException apiException = errorEnum.toApiException();
                synchronized (eVar.a) {
                    if (!eVar.b) {
                        eVar.b = true;
                        eVar.f6988e = apiException;
                        eVar.a.notifyAll();
                        eVar.h();
                    }
                }
                PushBiUtil.reportExit(this.a, PushNaming.SET_NOTIFY_FLAG, reportEntry, errorEnum);
                return eVar;
            }
            if (d.b(this.a) < 90101310) {
                HMSLog.i("HmsMessaging", "turn on/off with broadcast v1");
                Intent putExtra = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG").putExtra("enalbeFlag", PushEncrypter.encrypterOld(this.a, this.a.getPackageName() + "#" + z));
                putExtra.setPackage("android");
                return com.huawei.d.a.i.b(new IntentCallable(this.a, putExtra, reportEntry));
            }
            if (d.b(this.a) < 110118300) {
                HMSLog.i("HmsMessaging", "turn on/off with broadcast v2");
                new PushPreferences(this.a, "push_notify_flag").saveBoolean("notify_msg_enable", !z);
                Uri parse = Uri.parse("content://" + this.a.getPackageName() + ".huawei.push.provider/push_notify_flag.xml");
                Intent intent = new Intent("com.huawei.android.push.intent.SDK_COMMAND");
                intent.putExtra("type", "enalbeFlag");
                intent.putExtra(PushClientConstants.TAG_PKG_NAME, this.a.getPackageName());
                intent.putExtra("url", parse);
                intent.setPackage("android");
                return com.huawei.d.a.i.b(new IntentCallable(this.a, intent, reportEntry));
            }
            HMSLog.i("HmsMessaging", "turn on/off with broadcast v3");
            if (TextUtils.isEmpty(BaseUtils.getLocalToken(this.a, null))) {
                com.huawei.d.a.j.e eVar2 = new com.huawei.d.a.j.e();
                ApiException apiException2 = ErrorEnum.ERROR_NO_TOKEN.toApiException();
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
            new PushPreferences(this.a, "push_notify_flag").saveBoolean("notify_msg_enable", !z);
            Intent intent2 = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG");
            intent2.putExtra("enalbeFlag", z);
            intent2.putExtra(RemoteMessageConst.DEVICE_TOKEN, BaseUtils.getLocalToken(this.a, null));
            intent2.putExtra(PushClientConstants.TAG_PKG_NAME, this.a.getPackageName());
            intent2.putExtra("uid", this.a.getApplicationInfo().uid);
            intent2.setPackage("android");
            return com.huawei.d.a.i.b(new IntentCallable(this.a, intent2, reportEntry));
        }
        HMSLog.i("HmsMessaging", "turn on/off with AIDL");
        EnableNotifyReq enableNotifyReq = new EnableNotifyReq();
        enableNotifyReq.setPackageName(this.a.getPackageName());
        enableNotifyReq.setEnable(z);
        return this.b.doWrite(new BaseVoidTask(PushNaming.SET_NOTIFY_FLAG, JsonUtil.createJsonString(enableNotifyReq), reportEntry));
    }

    private void a(UpSendMsgReq upSendMsgReq, String str) {
        upSendMsgReq.setToken(BaseUtils.getLocalToken(this.a, null));
        try {
            this.b.doWrite(new SendUpStreamTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), str, upSendMsgReq.getPackageName(), upSendMsgReq.getMessageId()));
        } catch (Exception e2) {
            if (e2.getCause() instanceof ApiException) {
                PushBiUtil.reportExit(this.a, PushNaming.UPSEND_MSG, str, ((ApiException) e2.getCause()).getStatusCode());
            } else {
                PushBiUtil.reportExit(this.a, PushNaming.UPSEND_MSG, str, ErrorEnum.ERROR_INTERNAL_ERROR);
            }
        }
    }
}
