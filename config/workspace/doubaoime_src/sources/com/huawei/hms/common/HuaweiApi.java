package com.huawei.hms.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.d.a.f;
import com.huawei.d.a.g;
import com.huawei.d.a.j.e;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.RequestManager;
import com.huawei.hms.common.internal.ResolveClientBean;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.common.internal.TaskApiCallWrapper;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsInnerClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class HuaweiApi<TOption extends Api.ApiOptions> {
    private Context a;
    private TOption b;

    /* renamed from: c, reason: collision with root package name */
    private Context f7230c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractClientBuilder<?, TOption> f7231d;

    /* renamed from: e, reason: collision with root package name */
    private String f7232e;

    /* renamed from: f, reason: collision with root package name */
    private String f7233f;

    /* renamed from: g, reason: collision with root package name */
    private SubAppInfo f7234g;
    private WeakReference<Activity> h;
    private int i;
    private int j = 1;
    private boolean k = false;
    private String l;
    private boolean m;
    private RequestManager n;

    public static class RequestHandler<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {
        private final AnyClient b;

        /* renamed from: d, reason: collision with root package name */
        private final HuaweiApi<OptionsT> f7237d;

        /* renamed from: e, reason: collision with root package name */
        private ResolveClientBean f7238e;
        public final Queue<TaskApiCallbackWrapper> callbackWaitQueue = new LinkedList();
        private final Queue<TaskApiCallbackWrapper> a = new LinkedList();

        /* renamed from: c, reason: collision with root package name */
        private ConnectionResult f7236c = null;

        RequestHandler(HuaweiApi<OptionsT> huaweiApi) {
            this.f7237d = huaweiApi;
            this.b = huaweiApi.getClient(RequestManager.getHandler().getLooper(), this);
        }

        public AnyClient getClient() {
            return this.b;
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.i("HuaweiApi", "onConnected");
            BindResolveClients.getInstance().unRegister(this.f7238e);
            this.f7238e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.4
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.b();
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(final ConnectionResult connectionResult) {
            HMSLog.i("HuaweiApi", "onConnectionFailed");
            BindResolveClients.getInstance().unRegister(this.f7238e);
            this.f7238e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.3
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.b(connectionResult);
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            HMSLog.i("HuaweiApi", "onConnectionSuspended");
            BindResolveClients.getInstance().unRegister(this.f7238e);
            this.f7238e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.5
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.c();
                }
            });
        }

        public void postMessage(final TaskApiCallbackWrapper taskApiCallbackWrapper) {
            RequestManager.addToConnectedReqMap(taskApiCallbackWrapper.a().getTaskApiCall().getTransactionId(), this);
            this.a.add(taskApiCallbackWrapper);
            String uri = taskApiCallbackWrapper.a().getTaskApiCall().getUri();
            String packageName = (((HuaweiApi) this.f7237d).f7230c == null ? this.f7237d.getContext() : ((HuaweiApi) this.f7237d).f7230c).getPackageName();
            if (((HuaweiApi) this.f7237d).f7230c != null) {
                HuaweiApi<OptionsT> huaweiApi = this.f7237d;
                huaweiApi.b(((HuaweiApi) huaweiApi).f7230c);
            }
            final RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split("\\.")[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.f7237d.getAppID() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f7237d.getSubAppID());
            requestHeader.setPkgName(packageName);
            requestHeader.setSessionId(this.b.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.a().getTaskApiCall();
            requestHeader.setTransactionId(a(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.f7237d.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.f7237d.getApiLevel(), taskApiCall.getApiLevel()));
            this.b.post(requestHeader, taskApiCall.getRequestJson(), new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2
                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    AnyClient.CallBack b = taskApiCallbackWrapper.b();
                    if (b != null) {
                        b.onCallback(iMessageEntity, str);
                    }
                    RequestManager.removeReqByTransId(requestHeader.getTransactionId());
                    RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            RequestHandler.this.a.remove(taskApiCallbackWrapper);
                        }
                    });
                }
            });
        }

        private TaskApiCallbackWrapper b(final TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.1
                private AtomicBoolean a = new AtomicBoolean(true);

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    if (!(iMessageEntity instanceof ResponseHeader)) {
                        HMSLog.e("HuaweiApi", "header is not instance of ResponseHeader");
                        return;
                    }
                    ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                    if (responseHeader.getErrorCode() == 11) {
                        RequestHandler.this.a();
                        HMSLog.i("HuaweiApi", "unbind service");
                    }
                    if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                        StringBuilder M = e.a.a.a.a.M("Response has resolution: ");
                        M.append(responseHeader.getResolution());
                        HMSLog.e("HuaweiApi", M.toString());
                    }
                    if (this.a.compareAndSet(true, false)) {
                        HiAnalyticsInnerClient.reportEntryExit(RequestHandler.this.f7237d.getContext(), responseHeader, String.valueOf(RequestHandler.this.f7237d.getKitSdkVersion()));
                    }
                    taskApiCallWrapper.getTaskApiCall().onResponse(RequestHandler.this.b, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            StringBuilder M = e.a.a.a.a.M("wait queue size = ");
            M.append(this.callbackWaitQueue.size());
            HMSLog.i("HuaweiApi", M.toString());
            HMSLog.i("HuaweiApi", "run queue size = " + this.a.size());
            Iterator<TaskApiCallbackWrapper> it2 = this.callbackWaitQueue.iterator();
            while (it2.hasNext()) {
                a(it2.next());
            }
            Iterator<TaskApiCallbackWrapper> it3 = this.a.iterator();
            while (it3.hasNext()) {
                a(it3.next());
            }
            this.callbackWaitQueue.clear();
            this.a.clear();
            this.f7236c = null;
            this.b.disconnect();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(ConnectionResult connectionResult) {
            this.f7236c = connectionResult;
            Iterator<TaskApiCallbackWrapper> it2 = this.callbackWaitQueue.iterator();
            boolean z = true;
            while (it2.hasNext()) {
                TaskApiCallWrapper a = it2.next().a();
                StringBuilder M = e.a.a.a.a.M("Connection Failed:");
                M.append(a(connectionResult));
                M.append("(");
                M.append(connectionResult.getErrorCode());
                M.append(")");
                ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, M.toString());
                responseHeader.setTransactionId(a.getTaskApiCall().getTransactionId());
                HiAnalyticsInnerClient.reportEntryExit(this.f7237d.getContext(), responseHeader, String.valueOf(this.f7237d.getKitSdkVersion()));
                if (this.f7236c.getResolution() != null && z) {
                    responseHeader.setParcelable(this.f7236c.getResolution());
                    z = false;
                    if (Util.isAvailableLibExist(this.f7237d.getContext()) && this.f7236c.getErrorCode() == 26) {
                        responseHeader.setResolution(CommonCode.Resolution.HAS_RESOLUTION);
                    }
                }
                int errorCode = this.f7236c.getErrorCode();
                if (errorCode == 30 || errorCode == 31) {
                    responseHeader.setErrorCode(errorCode);
                }
                a.getTaskApiCall().onResponse(this.b, responseHeader, null, a.getTaskCompletionSource());
            }
            this.callbackWaitQueue.clear();
            this.a.clear();
            this.f7236c = null;
            this.b.disconnect();
        }

        void a(TaskApiCallWrapper taskApiCallWrapper) {
            HMSLog.i("HuaweiApi", "sendRequest");
            TaskApiCallbackWrapper b = b(taskApiCallWrapper);
            if (HMSPackageManager.getInstance(this.f7237d.getContext()).isUpdateHmsForThirdPartyDevice()) {
                this.b.disconnect();
            }
            int hmsVersionCode = HMSPackageManager.getInstance(((HuaweiApi) this.f7237d).a).getHmsVersionCode();
            if ((hmsVersionCode < 40000000 && hmsVersionCode > 0) && this.b.isConnected() && !((HuaweiApi) this.f7237d).m && ((BaseHmsClient) this.b).getAdapter().getServiceAction().equals("com.huawei.hms.core.aidlservice")) {
                int requestHmsVersionCode = this.b.getRequestHmsVersionCode();
                if (requestHmsVersionCode <= taskApiCallWrapper.getTaskApiCall().getMinApkVersion()) {
                    requestHmsVersionCode = taskApiCallWrapper.getTaskApiCall().getMinApkVersion();
                }
                if (requestHmsVersionCode > hmsVersionCode) {
                    this.b.disconnect();
                }
            }
            if (this.b.isConnected()) {
                HMSLog.i("HuaweiApi", "isConnected:true.");
                BinderAdapter adapter = ((BaseHmsClient) this.b).getAdapter();
                adapter.updateDelayTask();
                ((HmsClient) this.b).setService(IAIDLInvoke.Stub.asInterface(adapter.getServiceBinder()));
                postMessage(b);
                return;
            }
            HMSLog.i("HuaweiApi", "isConnected:false.");
            this.callbackWaitQueue.add(b);
            ConnectionResult connectionResult = this.f7236c;
            if (connectionResult != null && connectionResult.getErrorCode() != 0) {
                StringBuilder M = e.a.a.a.a.M("onConnectionFailed, ErrorCode:");
                M.append(this.f7236c.getErrorCode());
                HMSLog.i("HuaweiApi", M.toString());
                onConnectionFailed(this.f7236c);
                return;
            }
            RequestManager.addRequestToQueue(this);
            Object obj = this.b;
            if (obj instanceof BaseHmsClient) {
                ((BaseHmsClient) obj).setInternalRequest(this);
            }
            a(taskApiCallWrapper.getTaskApiCall().getMinApkVersion(), b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f7236c = null;
            this.a.clear();
            Iterator<TaskApiCallbackWrapper> it2 = this.callbackWaitQueue.iterator();
            while (it2.hasNext()) {
                postMessage(it2.next());
            }
            this.callbackWaitQueue.clear();
        }

        private String a(String str, String str2) {
            return TextUtils.isEmpty(str) ? TransactionIdCreater.getId(this.f7237d.getAppID(), str2) : str;
        }

        synchronized void a(int i, TaskApiCallbackWrapper taskApiCallbackWrapper) {
            if (this.b.isConnected()) {
                HMSLog.d("HuaweiApi", "client is connected");
                return;
            }
            if (this.b.isConnecting()) {
                HMSLog.d("HuaweiApi", "client is isConnecting");
                return;
            }
            if (this.f7237d.getActivity() != null) {
                if (this.f7238e == null) {
                    this.f7238e = new ResolveClientBean(this.b, i);
                }
                if (BindResolveClients.getInstance().isClientRegistered(this.f7238e)) {
                    HMSLog.i("HuaweiApi", "mResolveClientBean has already register, return!");
                    return;
                }
                BindResolveClients.getInstance().register(this.f7238e);
            }
            this.b.connect(i);
        }

        void a() {
            this.b.disconnect();
        }

        private void a(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            TaskApiCallWrapper a = taskApiCallbackWrapper.a();
            ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Suspended");
            responseHeader.setTransactionId(a.getTaskApiCall().getTransactionId());
            a.getTaskApiCall().onResponse(this.b, responseHeader, null, a.getTaskCompletionSource());
        }

        private String a(ConnectionResult connectionResult) {
            if (Util.isAvailableLibExist(this.f7237d.getContext())) {
                int errorCode = connectionResult.getErrorCode();
                if (errorCode != -1) {
                    if (errorCode == 3) {
                        return "HuaWei Mobile Service is disabled";
                    }
                    if (errorCode != 8) {
                        if (errorCode != 10) {
                            if (errorCode == 13) {
                                return "update cancelled";
                            }
                            if (errorCode == 21) {
                                return "device is too old to be support";
                            }
                            switch (errorCode) {
                                case 25:
                                    return "failed to get update result";
                                case 26:
                                    return "update failed, because no activity incoming, can't pop update page";
                                case 27:
                                    return "there is already an update popup at the front desk, but it hasn't been clicked or it is not effective for a while";
                                default:
                                    return "unknown errorReason";
                            }
                        }
                        return "application configuration error, please developer check configuration";
                    }
                    return "internal error";
                }
                return "get update result, but has other error codes";
            }
            int errorCode2 = connectionResult.getErrorCode();
            if (errorCode2 != -1) {
                if (errorCode2 != 8) {
                    if (errorCode2 != 10) {
                        return "unknown errorReason";
                    }
                    return "application configuration error, please developer check configuration";
                }
                return "internal error";
            }
            return "get update result, but has other error codes";
        }
    }

    public static class TaskApiCallbackWrapper {
        private final TaskApiCallWrapper a;
        private final AnyClient.CallBack b;

        TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.a = taskApiCallWrapper;
            this.b = callBack;
        }

        TaskApiCallWrapper a() {
            return this.a;
        }

        AnyClient.CallBack b() {
            return this.b;
        }
    }

    private static class a<OptionsT extends Api.ApiOptions> implements Runnable {
        private final HuaweiApi<OptionsT> a;
        private final TaskApiCallWrapper b;

        public a(HuaweiApi<OptionsT> huaweiApi, TaskApiCallWrapper taskApiCallWrapper) {
            this.a = huaweiApi;
            this.b = taskApiCallWrapper;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(com.huawei.hms.common.HuaweiApi.RequestHandler r8, java.lang.Throwable r9) {
            /*
                r7 = this;
                java.lang.String r0 = "HuaweiApi"
                r1 = 1
                r2 = 0
                com.huawei.hms.common.internal.AnyClient r8 = r8.getClient()     // Catch: java.lang.Throwable -> L38
                com.huawei.hms.common.internal.ResponseHeader r3 = new com.huawei.hms.common.internal.ResponseHeader     // Catch: java.lang.Throwable -> L35
                r4 = 907135001(0x3611c819, float:2.1723156E-6)
                java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L35
                r3.<init>(r1, r4, r9)     // Catch: java.lang.Throwable -> L35
                org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L30
                r9.<init>()     // Catch: java.lang.Throwable -> L30
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L30
                com.huawei.hms.common.internal.TaskApiCallWrapper r4 = r7.b     // Catch: java.lang.Throwable -> L2c
                com.huawei.d.a.g r4 = r4.getTaskCompletionSource()     // Catch: java.lang.Throwable -> L2c
                com.huawei.hms.common.internal.TaskApiCallWrapper r5 = r7.b     // Catch: java.lang.Throwable -> L2a
                com.huawei.hms.common.internal.TaskApiCall r2 = r5.getTaskApiCall()     // Catch: java.lang.Throwable -> L2a
                goto L52
            L2a:
                r5 = move-exception
                goto L3e
            L2c:
                r4 = move-exception
                r5 = r4
                r4 = r2
                goto L3e
            L30:
                r9 = move-exception
                r5 = r9
                r9 = r2
                r4 = r9
                goto L3e
            L35:
                r9 = move-exception
                r5 = r9
                goto L3b
            L38:
                r8 = move-exception
                r5 = r8
                r8 = r2
            L3b:
                r9 = r2
                r3 = r9
                r4 = r3
            L3e:
                java.lang.String r6 = "<notifyCpException> "
                java.lang.StringBuilder r6 = e.a.a.a.a.M(r6)
                java.lang.String r5 = r5.getMessage()
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                com.huawei.hms.support.log.HMSLog.e(r0, r5)
            L52:
                if (r8 == 0) goto L5d
                if (r3 == 0) goto L5d
                if (r9 == 0) goto L5d
                if (r4 == 0) goto L5d
                if (r2 == 0) goto L5d
                goto L5e
            L5d:
                r1 = 0
            L5e:
                if (r1 == 0) goto L64
                r2.onResponse(r8, r3, r9, r4)
                goto L69
            L64:
                java.lang.String r8 = "<notifyCpException> isNotify is false, Can not notify CP."
                com.huawei.hms.support.log.HMSLog.e(r0, r8)
            L69:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.HuaweiApi.a.a(com.huawei.hms.common.HuaweiApi$RequestHandler, java.lang.Throwable):void");
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestHandler requestHandler = new RequestHandler(this.a);
            try {
                requestHandler.a(this.b);
            } catch (Throwable th) {
                HMSLog.e("HuaweiApi", "sendRequest has exception", th);
                a(requestHandler, th);
            }
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, i, null);
    }

    @Deprecated
    public f<Boolean> disconnectService() {
        final g gVar = new g();
        RequestManager.getInstance();
        RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.1
            @Override // java.lang.Runnable
            public void run() {
                HuaweiApi.this.a((HuaweiApi<?>) this, (g<Boolean>) gVar);
            }
        });
        return gVar.a;
    }

    public <TResult, TClient extends AnyClient> f<TResult> doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
        this.k = true;
        if (taskApiCall != null) {
            HiAnalyticsInnerClient.reportEntryClient(this.a, taskApiCall.getUri(), TextUtils.isEmpty(this.f7234g.getSubAppID()) ? this.f7233f : this.f7234g.getSubAppID(), taskApiCall.getTransactionId(), String.valueOf(getKitSdkVersion()));
            if (this.n == null) {
                this.n = RequestManager.getInstance();
            }
            return a(taskApiCall);
        }
        HMSLog.e("HuaweiApi", "in doWrite:taskApiCall is null");
        e eVar = new e();
        ApiException apiException = new ApiException(Status.FAILURE);
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

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getApiLevel() {
        return this.j;
    }

    public String getAppID() {
        return this.f7233f;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.huawei.hms.common.internal.AnyClient] */
    public AnyClient getClient(Looper looper, RequestHandler requestHandler) {
        return this.f7231d.buildClient(this.a, getClientSetting(), requestHandler, requestHandler);
    }

    protected ClientSettings getClientSetting() {
        ClientSettings clientSettings = new ClientSettings(this.a.getPackageName(), this.a.getClass().getName(), getScopes(), this.f7232e, null, this.f7234g);
        if (!this.m) {
            String hMSPackageNameForMultiService = HMSPackageManager.getInstance(this.a).getHMSPackageNameForMultiService();
            if (TextUtils.isEmpty(hMSPackageNameForMultiService)) {
                hMSPackageNameForMultiService = "com.huawei.hwid";
            }
            this.l = hMSPackageNameForMultiService;
            StringBuilder M = e.a.a.a.a.M("No setInnerHms, hms pkg name is ");
            M.append(this.l);
            HMSLog.i("HuaweiApi", M.toString());
        }
        clientSettings.setInnerHmsPkg(this.l);
        clientSettings.setUseInnerHms(this.m);
        WeakReference<Activity> weakReference = this.h;
        if (weakReference != null) {
            clientSettings.setCpActivity(weakReference.get());
        }
        return clientSettings;
    }

    public Context getContext() {
        return this.a;
    }

    public int getKitSdkVersion() {
        return this.i;
    }

    public TOption getOption() {
        return this.b;
    }

    protected List<Scope> getScopes() {
        return Collections.emptyList();
    }

    public String getSubAppID() {
        return this.f7234g.getSubAppID();
    }

    public void setApiLevel(int i) {
        this.j = i;
    }

    public void setHostContext(Context context) {
        this.f7230c = context;
    }

    public void setInnerHms() {
        this.l = this.a.getPackageName();
        this.m = true;
        StringBuilder M = e.a.a.a.a.M("<setInnerHms> init inner hms pkg info:");
        M.append(this.l);
        HMSLog.i("HuaweiApi", M.toString());
    }

    public void setKitSdkVersion(int i) {
        this.i = i;
    }

    public void setSubAppId(String str) throws ApiException {
        if (!setSubAppInfo(new SubAppInfo(str))) {
            throw new ApiException(Status.FAILURE);
        }
    }

    @Deprecated
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.i("HuaweiApi", "Enter setSubAppInfo");
        SubAppInfo subAppInfo2 = this.f7234g;
        if (subAppInfo2 != null && !TextUtils.isEmpty(subAppInfo2.getSubAppID())) {
            HMSLog.e("HuaweiApi", "subAppInfo is already set");
            return false;
        }
        if (subAppInfo == null) {
            HMSLog.e("HuaweiApi", "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.e("HuaweiApi", "subAppId is empty");
            return false;
        }
        if (subAppID.equals(this.f7232e)) {
            HMSLog.e("HuaweiApi", "subAppId is host appid");
            return false;
        }
        if (this.k) {
            HMSLog.e("HuaweiApi", "Client has sent request to Huawei Mobile Services, setting subAppId is not allowed");
            return false;
        }
        this.f7234g = new SubAppInfo(subAppInfo);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        String appId = Util.getAppId(context);
        this.f7232e = appId;
        this.f7233f = appId;
    }

    private void a(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        this.a = context.getApplicationContext();
        this.b = toption;
        this.f7231d = abstractClientBuilder;
        b(context);
        this.f7234g = new SubAppInfo("");
        this.i = i;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(this.f7232e)) {
                HMSLog.e("HuaweiApi", "subAppId is host appid");
            } else {
                HMSLog.i("HuaweiApi", "subAppId is " + str);
                this.f7234g = new SubAppInfo(str);
            }
        }
        a(context);
        if (Util.isAvailableLibExist(context)) {
            AvailableUtil.asyncCheckHmsUpdateInfo(context);
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, i, str);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, 0, null);
    }

    private void a(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HuaweiApi<?> huaweiApi, g<Boolean> gVar) {
        HMSLog.i("HuaweiApi", "innerDisconnect.");
        try {
            huaweiApi.getClient(RequestManager.getHandler().getLooper(), null).disconnect();
            gVar.b(Boolean.TRUE);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("disconnect the binder failed for:");
            M.append(e2.getMessage());
            HMSLog.w("HuaweiApi", M.toString());
        }
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, i, str);
    }

    private <TResult, TClient extends AnyClient> f<TResult> a(TaskApiCall<TClient, TResult> taskApiCall) {
        if (taskApiCall.getToken() == null) {
            g gVar = new g();
            RequestManager.getHandler().post(new a(this, new TaskApiCallWrapper(taskApiCall, gVar)));
            return gVar.a;
        }
        taskApiCall.getToken();
        new e();
        throw null;
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, 0, null);
    }
}
