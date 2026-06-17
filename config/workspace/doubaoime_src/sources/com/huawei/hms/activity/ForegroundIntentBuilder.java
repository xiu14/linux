package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.ForegroundBusResponseMgr;
import com.huawei.hms.activity.internal.ForegroundInnerHeader;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.api.entity.core.CoreNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.utils.Util;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class ForegroundIntentBuilder {
    private Activity a;
    private RequestHeader b;

    /* renamed from: c, reason: collision with root package name */
    private String f7184c;

    /* renamed from: d, reason: collision with root package name */
    private ForegroundInnerHeader f7185d;

    /* renamed from: e, reason: collision with root package name */
    private String f7186e;

    /* renamed from: f, reason: collision with root package name */
    private Context f7187f;

    public ForegroundIntentBuilder(Activity activity) throws IllegalArgumentException {
        if (activity == null) {
            throw new IllegalArgumentException("listener must not be null.");
        }
        this.a = activity;
        RequestHeader requestHeader = new RequestHeader();
        this.b = requestHeader;
        requestHeader.setSdkVersion(61300301);
        this.f7184c = "";
        ForegroundInnerHeader foregroundInnerHeader = new ForegroundInnerHeader();
        this.f7185d = foregroundInnerHeader;
        foregroundInnerHeader.setApkVersion(30000000);
    }

    public static void registerResponseCallback(String str, BusResponseCallback busResponseCallback) {
        ForegroundBusResponseMgr.getInstance().registerObserver(str, busResponseCallback);
    }

    public static void unregisterResponseCallback(String str) {
        ForegroundBusResponseMgr.getInstance().unRegisterObserver(str);
    }

    public Intent build() {
        String packageName;
        String appId;
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(this.a, ForegroundBusDelegate.class.getName());
        Context context = this.f7187f;
        if (context != null) {
            packageName = context.getPackageName();
            appId = Util.getAppId(this.f7187f);
        } else {
            packageName = this.a.getPackageName();
            appId = Util.getAppId(this.a);
        }
        if (this.b.getAppID() == null) {
            this.b.setAppID(appId + HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        } else {
            RequestHeader requestHeader = this.b;
            StringBuilder S = a.S(appId, HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            S.append(this.b.getAppID());
            requestHeader.setAppID(S.toString());
        }
        if (TextUtils.isEmpty(this.b.getTransactionId())) {
            RequestHeader requestHeader2 = this.b;
            requestHeader2.setTransactionId(TransactionIdCreater.getId(requestHeader2.getAppID(), CoreNaming.HUBREQUEST));
        }
        this.b.setPkgName(packageName);
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_HEADER, this.b.toJson());
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_BODY, this.f7184c);
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_INNER, this.f7185d.toJson());
        if (!TextUtils.isEmpty(this.f7186e)) {
            intentStartBridgeActivity.putExtra(ForegroundBusDelegate.INNER_PKG_NAME, this.f7186e);
        }
        return intentStartBridgeActivity;
    }

    public ForegroundIntentBuilder setAction(String str) {
        this.b.setApiName(str);
        return this;
    }

    public ForegroundIntentBuilder setApiLevel(int i) {
        this.b.setApiLevel(i);
        return this;
    }

    public ForegroundIntentBuilder setApplicationContext(Context context) {
        this.f7187f = context;
        return this;
    }

    public ForegroundIntentBuilder setInnerHms() {
        this.f7186e = this.a.getPackageName();
        return this;
    }

    public ForegroundIntentBuilder setKitSdkVersion(int i) {
        this.b.setKitSdkVersion(i);
        return this;
    }

    public ForegroundIntentBuilder setMinApkVersion(int i) {
        this.f7185d.setApkVersion(i);
        return this;
    }

    public ForegroundIntentBuilder setRequestBody(String str) {
        this.f7184c = str;
        return this;
    }

    public ForegroundIntentBuilder setResponseCallback(String str, BusResponseCallback busResponseCallback) {
        this.f7185d.setResponseCallbackKey(str);
        ForegroundBusResponseMgr.getInstance().registerObserver(str, busResponseCallback);
        return this;
    }

    public ForegroundIntentBuilder setServiceName(String str) {
        this.b.setSrvName(str);
        return this;
    }

    public ForegroundIntentBuilder setSubAppId(String str) {
        this.b.setAppID(str);
        return this;
    }

    public ForegroundIntentBuilder setTransactionId(String str) {
        this.b.setTransactionId(str);
        return this;
    }

    public ForegroundIntentBuilder setResponseCallback(String str) {
        this.f7185d.setResponseCallbackKey(str);
        return this;
    }
}
