package com.huawei.hms.adapter;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.adapter.ui.BaseResolutionAdapter;
import com.huawei.hms.adapter.ui.UpdateAdapter;
import com.huawei.hms.availableupdate.UpdateAdapterMgr;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.ResponseWrap;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IntentUtil;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResolutionFlagUtil;
import com.huawei.hms.utils.Util;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.lang.ref.WeakReference;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class BaseAdapter {
    private WeakReference<ApiClient> a;
    private WeakReference<Activity> b;

    /* renamed from: c, reason: collision with root package name */
    private BaseCallBack f7192c;

    /* renamed from: d, reason: collision with root package name */
    private String f7193d;

    /* renamed from: e, reason: collision with root package name */
    private String f7194e;

    /* renamed from: f, reason: collision with root package name */
    private Parcelable f7195f;

    /* renamed from: g, reason: collision with root package name */
    private BaseCallBack f7196g;
    private String h;
    private Context i;
    private RequestHeader j = new RequestHeader();
    private ResponseHeader k = new ResponseHeader();
    private SystemObserver l;

    public interface BaseCallBack {
        void onComplete(String str, String str2, Parcelable parcelable);

        void onError(String str);
    }

    public class BaseRequestResultCallback implements ResultCallback<ResolveResult<CoreBaseResponse>> {
        private AtomicBoolean a = new AtomicBoolean(true);

        public BaseRequestResultCallback() {
        }

        private void a(String str, BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse, int i) {
            if (!CommonCode.Resolution.HAS_RESOLUTION_FROM_APK.equals(str)) {
                if (!"installHMS".equals(str)) {
                    BaseAdapter.this.a(baseCallBack, coreBaseResponse);
                    return;
                } else {
                    HMSLog.i("BaseAdapter", "has resolutin: installHMS");
                    a(baseCallBack, coreBaseResponse);
                    return;
                }
            }
            Activity c2 = BaseAdapter.this.c();
            HMSLog.i("BaseAdapter", "activity is: " + c2);
            if (c2 == null || c2.isFinishing()) {
                HMSLog.e("BaseAdapter", "activity null");
                BaseAdapter.this.a(baseCallBack, coreBaseResponse);
                return;
            }
            PendingIntent pendingIntent = coreBaseResponse.getPendingIntent();
            if (pendingIntent != null) {
                if (Util.isAvailableLibExist(BaseAdapter.this.i)) {
                    BaseAdapter.this.a(c2, pendingIntent, coreBaseResponse);
                    return;
                } else {
                    baseCallBack.onError(BaseAdapter.this.b(-9));
                    return;
                }
            }
            Intent intent = coreBaseResponse.getIntent();
            if (intent != null) {
                if (Util.isAvailableLibExist(BaseAdapter.this.i)) {
                    BaseAdapter.this.a(c2, intent, coreBaseResponse);
                    return;
                } else {
                    baseCallBack.onError(BaseAdapter.this.b(-9));
                    return;
                }
            }
            if (i == 2) {
                BaseAdapter baseAdapter = BaseAdapter.this;
                baseCallBack.onError(baseAdapter.b(baseAdapter.k.getErrorCode()));
            } else {
                HMSLog.e("BaseAdapter", "hasResolution is true but NO_SOLUTION");
                baseCallBack.onError(BaseAdapter.this.b(-4));
            }
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        public void onResult(ResolveResult<CoreBaseResponse> resolveResult) {
            HMSLog.i("BaseAdapter", "BaseRequestResultCallback onResult");
            BaseCallBack b = BaseAdapter.this.b();
            if (b == null) {
                HMSLog.e("BaseAdapter", "onResult baseCallBack null");
                return;
            }
            if (resolveResult == null) {
                HMSLog.e("BaseAdapter", "result null");
                b.onError(BaseAdapter.this.b(-1));
                return;
            }
            CoreBaseResponse value = resolveResult.getValue();
            if (value == null) {
                HMSLog.e("BaseAdapter", "response null");
                b.onError(BaseAdapter.this.b(-1));
                return;
            }
            if (TextUtils.isEmpty(value.getJsonHeader())) {
                HMSLog.e("BaseAdapter", "jsonHeader null");
                b.onError(BaseAdapter.this.b(-1));
                return;
            }
            JsonUtil.jsonToEntity(value.getJsonHeader(), BaseAdapter.this.k);
            if (this.a.compareAndSet(true, false)) {
                BaseAdapter baseAdapter = BaseAdapter.this;
                baseAdapter.a(baseAdapter.i, BaseAdapter.this.k);
            }
            String resolution = BaseAdapter.this.k.getResolution();
            int statusCode = BaseAdapter.this.k.getStatusCode();
            StringBuilder M = e.a.a.a.a.M("api is: ");
            M.append(BaseAdapter.this.k.getApiName());
            M.append(", resolution: ");
            M.append(resolution);
            M.append(", status_code: ");
            M.append(statusCode);
            HMSLog.i("BaseAdapter", M.toString());
            a(resolution, b, value, statusCode);
        }

        private void a(final BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse) {
            if (!BaseAdapter.this.h()) {
                if (Util.isAvailableLibExist(BaseAdapter.this.i)) {
                    Activity c2 = BaseAdapter.this.c();
                    if (c2 != null && !c2.isFinishing()) {
                        HMSLog.i("BaseAdapter", "start handleSolutionForHMS");
                        AvailableAdapter availableAdapter = new AvailableAdapter(ExceptionCode.CRASH_EXCEPTION);
                        availableAdapter.setCalledBySolutionInstallHms(true);
                        availableAdapter.startResolution(c2, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.adapter.BaseAdapter.BaseRequestResultCallback.1
                            @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                            public void onComplete(int i) {
                                e.a.a.a.a.l0("complete handleSolutionForHMS, result: ", i, "BaseAdapter");
                                if (i == 0) {
                                    BaseAdapter.this.a(baseCallBack);
                                    return;
                                }
                                BaseAdapter baseAdapter = BaseAdapter.this;
                                baseCallBack.onError(baseAdapter.a(i, baseAdapter.a(i)).toJson());
                            }
                        });
                        return;
                    }
                    HMSLog.e("BaseAdapter", "activity is null");
                    try {
                        if (BaseAdapter.this.i != null && AvailableUtil.isInstallerLibExist(BaseAdapter.this.i)) {
                            if (!UpdateAdapterMgr.INST.needStartUpdateActivity()) {
                                return;
                            }
                            HMSLog.i("BaseAdapter", "pass installHMS intent");
                            Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(BaseAdapter.this.i, UpdateAdapter.class.getName());
                            intentStartBridgeActivity.putExtra("update_version", ExceptionCode.CRASH_EXCEPTION);
                            intentStartBridgeActivity.putExtra("installHMS", "installHMS");
                            coreBaseResponse.setIntent(intentStartBridgeActivity);
                            BaseAdapter.this.a(baseCallBack, coreBaseResponse);
                        } else {
                            HMSLog.i("BaseAdapter", "pass ACTIVITY_NULL error");
                            BaseAdapter baseAdapter = BaseAdapter.this;
                            baseCallBack.onError(baseAdapter.a(-3, baseAdapter.a(-3)).toJson());
                        }
                        return;
                    } catch (RuntimeException unused) {
                        HMSLog.e("BaseAdapter", "handleSolutionForHms pass result failed");
                        return;
                    }
                }
                HMSLog.i("BaseAdapter", "handleSolutionForHms: no Available lib exist");
                baseCallBack.onError(BaseAdapter.this.b(-9));
                return;
            }
            HMSLog.i("BaseAdapter", "HMS Core exists, need to refresh bind info");
            BaseAdapter.this.a(baseCallBack);
        }
    }

    private static class a extends PendingResultImpl<ResolveResult<CoreBaseResponse>, CoreBaseResponse> {
        public a(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResolveResult<CoreBaseResponse> onComplete(CoreBaseResponse coreBaseResponse) {
            ResolveResult<CoreBaseResponse> resolveResult = new ResolveResult<>(coreBaseResponse);
            resolveResult.setStatus(Status.SUCCESS);
            return resolveResult;
        }
    }

    public BaseAdapter(ApiClient apiClient) {
        this.a = new WeakReference<>(apiClient);
        if (apiClient == null) {
            HMSLog.w("BaseAdapter", "BaseAdapter constructor client is null");
            return;
        }
        this.i = apiClient.getContext().getApplicationContext();
        StringBuilder M = e.a.a.a.a.M("In constructor, WeakReference is ");
        M.append(this.a);
        HMSLog.i("BaseAdapter", M.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return new PackageManagerHelper(this.i).getPackageStates(HMSPackageManager.getInstance(this.i).getHMSPackageName()) == PackageManagerHelper.PackageStates.ENABLED;
    }

    private void i() {
        if (this.f7193d == null || this.f7196g == null) {
            return;
        }
        this.k = null;
        this.k = new ResponseHeader();
        baseRequest(d(), e(), f(), a());
    }

    private void j() {
        if (this.i == null) {
            HMSLog.e("BaseAdapter", "sendBroadcastAfterResolutionHms, context is null");
            return;
        }
        Intent intent = new Intent("com.huawei.hms.core.action.SESSION_INVALID");
        try {
            intent.setPackage(this.i.getPackageName());
            this.i.sendBroadcast(intent);
        } catch (IllegalArgumentException unused) {
            HMSLog.e("BaseAdapter", "IllegalArgumentException when sendBroadcastAfterResolutionHms intent.setPackage");
        }
    }

    public void baseRequest(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
        a(str, str2, parcelable, baseCallBack);
        if (this.a == null) {
            HMSLog.e("BaseAdapter", "client is null");
            baseCallBack.onError(b(-2));
            return;
        }
        this.f7192c = baseCallBack;
        JsonUtil.jsonToEntity(str, this.j);
        CoreBaseRequest coreBaseRequest = new CoreBaseRequest();
        coreBaseRequest.setJsonObject(str2);
        coreBaseRequest.setJsonHeader(str);
        coreBaseRequest.setParcelable(parcelable);
        String apiName = this.j.getApiName();
        if (TextUtils.isEmpty(apiName)) {
            HMSLog.e("BaseAdapter", "get uri null");
            baseCallBack.onError(b(-5));
            return;
        }
        String transactionId = this.j.getTransactionId();
        this.h = transactionId;
        if (TextUtils.isEmpty(transactionId)) {
            HMSLog.e("BaseAdapter", "get transactionId null");
            baseCallBack.onError(b(-6));
            return;
        }
        StringBuilder U = e.a.a.a.a.U("in baseRequest + uri is :", apiName, ", transactionId is : ");
        U.append(this.h);
        HMSLog.i("BaseAdapter", U.toString());
        a(this.i, this.j);
        a(this.a.get(), apiName, coreBaseRequest).setResultCallback(new BaseRequestResultCallback());
    }

    private String d() {
        return this.f7193d;
    }

    private String e() {
        return this.f7194e;
    }

    private Parcelable f() {
        return this.f7195f;
    }

    private void g() {
        this.l = new SystemObserver() { // from class: com.huawei.hms.adapter.BaseAdapter.2
            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onNoticeResult(int i) {
                return false;
            }

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onSolutionResult(Intent intent, String str) {
                if (TextUtils.isEmpty(str)) {
                    HMSLog.e("BaseAdapter", "onSolutionResult but id is null");
                    BaseCallBack b = BaseAdapter.this.b();
                    if (b == null) {
                        HMSLog.e("BaseAdapter", "onSolutionResult baseCallBack null");
                        return true;
                    }
                    b.onError(BaseAdapter.this.b(-6));
                    return true;
                }
                if (!str.equals(BaseAdapter.this.h)) {
                    return false;
                }
                HMSLog.i("BaseAdapter", "onSolutionResult + id is :" + str);
                BaseCallBack b2 = BaseAdapter.this.b();
                if (b2 == null) {
                    HMSLog.e("BaseAdapter", "onResult baseCallBack null");
                    return true;
                }
                if (intent == null) {
                    HMSLog.e("BaseAdapter", "onSolutionResult but data is null");
                    String b3 = BaseAdapter.this.b(-7);
                    BaseAdapter baseAdapter = BaseAdapter.this;
                    baseAdapter.a(baseAdapter.i, BaseAdapter.this.k, 0L);
                    b2.onError(b3);
                    return true;
                }
                if (BaseAdapter.this.b(intent, b2) || BaseAdapter.this.a(intent, b2)) {
                    return true;
                }
                HMSLog.e("BaseAdapter", "onComplete for on activity result");
                BaseAdapter.this.c(intent, b2);
                return true;
            }

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onUpdateResult(int i) {
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity c() {
        if (this.b == null) {
            StringBuilder M = e.a.a.a.a.M("activityWeakReference is ");
            M.append(this.b);
            HMSLog.i("BaseAdapter", M.toString());
            return null;
        }
        ApiClient apiClient = this.a.get();
        if (apiClient == null) {
            HMSLog.i("BaseAdapter", "tmpApi is null");
            return null;
        }
        StringBuilder M2 = e.a.a.a.a.M("activityWeakReference has ");
        M2.append(this.b.get());
        HMSLog.i("BaseAdapter", M2.toString());
        return Util.getActiveActivity(this.b.get(), apiClient.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BaseCallBack b() {
        BaseCallBack baseCallBack = this.f7192c;
        if (baseCallBack != null) {
            return baseCallBack;
        }
        HMSLog.e("BaseAdapter", "callback null");
        return null;
    }

    private void b(Context context, RequestHeader requestHeader) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, mapFromRequestHeader);
    }

    public BaseAdapter(ApiClient apiClient, Activity activity) {
        this.a = new WeakReference<>(apiClient);
        this.b = new WeakReference<>(activity);
        if (activity == null) {
            HMSLog.w("BaseAdapter", "BaseAdapter constructor activity is null");
            return;
        }
        this.i = activity.getApplicationContext();
        StringBuilder M = e.a.a.a.a.M("In constructor, activityWeakReference is ");
        M.append(this.b);
        M.append(", activity is ");
        M.append(this.b.get());
        HMSLog.i("BaseAdapter", M.toString());
    }

    private void c(int i) {
        this.k.setTransactionId(this.j.getTransactionId());
        this.k.setAppID(this.j.getAppID());
        this.k.setApiName(this.j.getApiName());
        this.k.setSrvName(this.j.getSrvName());
        this.k.setPkgName(this.j.getPkgName());
        this.k.setStatusCode(1);
        this.k.setErrorCode(i);
        this.k.setErrorReason("Core error");
    }

    private PendingResult<ResolveResult<CoreBaseResponse>> a(ApiClient apiClient, String str, CoreBaseRequest coreBaseRequest) {
        return new a(apiClient, str, coreBaseRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BaseCallBack baseCallBack) {
        HMSPackageManager.getInstance(this.i).resetMultiServiceState();
        baseCallBack.onError(a(11, a(11)).toJson());
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(int i) {
        c(i);
        return this.k.toJson();
    }

    private void b(String str) {
        this.f7194e = str;
    }

    private void b(BaseCallBack baseCallBack) {
        this.f7196g = baseCallBack;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse) {
        HMSLog.i("BaseAdapter", "baseCallBack.onComplete");
        PendingIntent pendingIntent = coreBaseResponse.getPendingIntent();
        if (pendingIntent != null) {
            baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), pendingIntent);
            return;
        }
        Intent modifyIntentBehaviorsSafe = IntentUtil.modifyIntentBehaviorsSafe(coreBaseResponse.getIntent());
        if (modifyIntentBehaviorsSafe != null) {
            baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), modifyIntentBehaviorsSafe);
        } else {
            baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(Intent intent, BaseCallBack baseCallBack) {
        if (!intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT)) {
            return false;
        }
        int intExtra = intent.getIntExtra(KpmsConstant.KIT_UPDATE_RESULT, 0);
        e.a.a.a.a.l0("kit_update_result is ", intExtra, "BaseAdapter");
        if (intExtra == 1) {
            HMSLog.e("BaseAdapter", "kit update success,replay request");
            i();
        } else {
            HMSLog.e("BaseAdapter", "kit update failed");
            baseCallBack.onError(a(-10, a(intExtra)).toJson());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Intent intent, BaseCallBack baseCallBack) {
        long j;
        String stringExtra = intent.getStringExtra(CommonCode.MapKey.JSON_HEADER);
        String stringExtra2 = intent.getStringExtra(CommonCode.MapKey.JSON_BODY);
        Object infoFromJsonobject = JsonUtil.getInfoFromJsonobject(stringExtra, MonitorConstants.STATUS_CODE);
        Object infoFromJsonobject2 = JsonUtil.getInfoFromJsonobject(stringExtra, "error_code");
        if (intent.hasExtra(CommonCode.MapKey.HMS_FOREGROUND_RES_UI)) {
            Object infoFromJsonobject3 = JsonUtil.getInfoFromJsonobject(intent.getStringExtra(CommonCode.MapKey.HMS_FOREGROUND_RES_UI), "uiDuration");
            if (infoFromJsonobject3 instanceof Long) {
                j = ((Long) infoFromJsonobject3).longValue();
                if (!(infoFromJsonobject instanceof Integer) && (infoFromJsonobject2 instanceof Integer)) {
                    int intValue = ((Integer) infoFromJsonobject).intValue();
                    b(((Integer) infoFromJsonobject2).intValue());
                    this.k.setStatusCode(intValue);
                    a(this.i, this.k, j);
                } else {
                    b(-8);
                    a(this.i, this.k, j);
                }
                baseCallBack.onComplete(stringExtra, stringExtra2, null);
            }
        }
        j = 0;
        if (!(infoFromJsonobject instanceof Integer)) {
        }
        b(-8);
        a(this.i, this.k, j);
        baseCallBack.onComplete(stringExtra, stringExtra2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, Parcelable parcelable, CoreBaseResponse coreBaseResponse) {
        HMSLog.i("BaseAdapter", "startResolution");
        RequestHeader requestHeader = this.j;
        if (requestHeader != null) {
            b(this.i, requestHeader);
        }
        if (this.l == null) {
            g();
        }
        SystemManager.getSystemNotifier().registerObserver(this.l);
        if (Build.VERSION.SDK_INT >= 29) {
            a(coreBaseResponse);
        }
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, BaseResolutionAdapter.class.getName());
        Bundle bundle = new Bundle();
        bundle.putParcelable("resolution", parcelable);
        intentStartBridgeActivity.putExtras(bundle);
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.TRANSACTION_ID, this.h);
        long time = new Timestamp(System.currentTimeMillis()).getTime();
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.RESOLUTION_FLAG, time);
        ResolutionFlagUtil.getInstance().saveResolutionFlag(this.h, time);
        activity.startActivity(intentStartBridgeActivity);
    }

    private void a(final CoreBaseResponse coreBaseResponse) {
        HMSLog.i("BaseAdapter", "postResolutionTimeoutHandle");
        ApkResolutionFailedManager.getInstance().postTask(this.h, new Runnable() { // from class: com.huawei.hms.adapter.BaseAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                HMSLog.i("BaseAdapter", "postResolutionTimeoutHandle handle");
                SystemManager.getSystemNotifier().unRegisterObserver(BaseAdapter.this.l);
                ApkResolutionFailedManager.getInstance().removeValueOnly(BaseAdapter.this.h);
                BaseCallBack b = BaseAdapter.this.b();
                if (b == null) {
                    HMSLog.e("BaseAdapter", "timeoutRunnable callBack is null");
                } else {
                    BaseAdapter.this.a(b, coreBaseResponse);
                }
            }
        });
    }

    private void a(Context context, RequestHeader requestHeader) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, mapFromRequestHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, ResponseHeader responseHeader) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.j.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, mapFromRequestHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, ResponseHeader responseHeader, long j) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, String.valueOf(j));
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.j.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, mapFromRequestHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResponseWrap a(int i, String str) {
        c(i);
        ResponseWrap responseWrap = new ResponseWrap(this.k);
        responseWrap.setBody(str);
        return responseWrap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i);
        } catch (JSONException e2) {
            StringBuilder M = e.a.a.a.a.M("buildBodyStr failed: ");
            M.append(e2.getMessage());
            HMSLog.e("BaseAdapter", M.toString());
        }
        return jSONObject.toString();
    }

    private void a(String str) {
        this.f7193d = str;
    }

    private void a(Parcelable parcelable) {
        this.f7195f = parcelable;
    }

    private BaseCallBack a() {
        return this.f7196g;
    }

    private void a(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
        a(str);
        b(str2);
        a(parcelable);
        b(baseCallBack);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Intent intent, BaseCallBack baseCallBack) {
        if (!intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            return false;
        }
        int intExtra = intent.getIntExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, 1001);
        if (intExtra == 1001) {
            HMSLog.i("BaseAdapter", "privacy_statement_confirm_result agreed: " + intExtra + ", replay request");
            i();
            return true;
        }
        e.a.a.a.a.l0("privacy_statement_confirm_result rejected: ", intExtra, "BaseAdapter");
        baseCallBack.onError(a(CommonCode.BusInterceptor.PRIVACY_CNCEL_ERROR_CODE, a(CommonCode.BusInterceptor.PRIVACY_CNCEL_ERROR_CODE)).toJson());
        return true;
    }
}
