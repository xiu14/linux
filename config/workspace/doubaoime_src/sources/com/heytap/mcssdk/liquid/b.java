package com.heytap.mcssdk.liquid;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.heytap.mcs.liquid.model.ActionResult;
import com.heytap.mcs.liquid.model.SeedingRequest;
import com.heytap.mcs.liquid.model.SeedingRequestResult;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.liquid.DownloadRequest;
import com.heytap.mcssdk.utils.Utils;
import com.heytap.mcssdk.utils.e;
import com.heytap.msp.push.callback.ILiquidDownloadCallback;
import com.heytap.msp.push.callback.ILiquidTaskQueryCallback;
import com.heytap.msp.push.callback.IPackageAuthCallbackListener;
import e.f.a.a.a.a.a;
import e.f.a.a.a.a.b.a;
import e.f.a.a.a.a.b.b;
import e.f.a.a.a.a.b.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class b {
    public static final String a = "b";

    /* renamed from: d, reason: collision with root package name */
    private static final String f6917d = "oplus.software.support_fluid_entry";

    /* renamed from: e, reason: collision with root package name */
    private static volatile Boolean f6918e;

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicReference<com.heytap.mcssdk.liquid.a> f6919g = new AtomicReference<>();
    private static final AtomicReference<com.heytap.mcssdk.liquid.a> h = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    private volatile LiquidSettingChangeObserver f6920c;
    private final AtomicReference<e.f.a.a.a.a.a> b = new AtomicReference<>();

    /* renamed from: f, reason: collision with root package name */
    private final LinkedBlockingDeque<com.heytap.mcssdk.liquid.a> f6921f = new LinkedBlockingDeque<>();

    static class a {
        static b a = new b();

        a() {
        }
    }

    public static b a() {
        return a.a;
    }

    private e.f.a.a.a.a.b.b a(final ILiquidDownloadCallback iLiquidDownloadCallback) {
        return new b.a() { // from class: com.heytap.mcssdk.liquid.b.3
            @Override // e.f.a.a.a.a.b.b
            public void onClick(String str, int i) {
                if (e.g()) {
                    e.b(e.a, "onClick -- traceId" + str + " type:" + i);
                }
                ILiquidDownloadCallback iLiquidDownloadCallback2 = iLiquidDownloadCallback;
                if (iLiquidDownloadCallback2 != null) {
                    iLiquidDownloadCallback2.onClick(str, i);
                }
            }

            @Override // e.f.a.a.a.a.b.b
            public void onDismiss(String str) {
                if (e.g()) {
                    e.b(e.a, "onDismiss -- traceId" + str);
                }
                ILiquidDownloadCallback iLiquidDownloadCallback2 = iLiquidDownloadCallback;
                if (iLiquidDownloadCallback2 != null) {
                    iLiquidDownloadCallback2.onDismiss(str);
                }
            }

            @Override // e.f.a.a.a.a.b.b
            public void onFailed(String str, int i, int i2) {
                if (e.g()) {
                    e.b(e.a, "onFailed -- traceId" + str + " type:" + i2);
                }
                ILiquidDownloadCallback iLiquidDownloadCallback2 = iLiquidDownloadCallback;
                if (iLiquidDownloadCallback2 != null) {
                    iLiquidDownloadCallback2.onFailed(str, i, i2);
                }
            }

            @Override // e.f.a.a.a.a.b.b
            public ActionResult onPauseClick(String str) {
                if (e.g()) {
                    e.b(e.a, "onPauseClick -- traceId" + str);
                }
                ILiquidDownloadCallback iLiquidDownloadCallback2 = iLiquidDownloadCallback;
                return iLiquidDownloadCallback2 != null ? iLiquidDownloadCallback2.onPauseClick(str) : new ActionResult(-1);
            }

            @Override // e.f.a.a.a.a.b.b
            public ActionResult onResumeClick(String str) {
                if (e.g()) {
                    e.b(e.a, "onResumeClick -- traceId" + str);
                }
                ILiquidDownloadCallback iLiquidDownloadCallback2 = iLiquidDownloadCallback;
                return iLiquidDownloadCallback2 != null ? iLiquidDownloadCallback2.onResumeClick(str) : new ActionResult(-1);
            }

            @Override // e.f.a.a.a.a.b.b
            public void onShow(String str, int i) {
                if (e.g()) {
                    e.b(e.a, "onShow -- traceId" + str + " type:" + i);
                }
                ILiquidDownloadCallback iLiquidDownloadCallback2 = iLiquidDownloadCallback;
                if (iLiquidDownloadCallback2 != null) {
                    iLiquidDownloadCallback2.onShow(str, i);
                }
            }
        };
    }

    private void a(Context context, e.f.a.a.a.a.a aVar, List<DownloadRequest> list) {
        try {
            ArrayList arrayList = new ArrayList();
            final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Iterator<DownloadRequest> it2 = list.iterator(); it2.hasNext(); it2 = it2) {
                DownloadRequest next = it2.next();
                String uuid = UUID.randomUUID().toString();
                arrayList.add(new SeedingRequest(uuid, context.getPackageName(), next.getLoadingType(), next.getPkgName(), next.getTraceId(), next.getToken(), next.getStatus(), next.getDesc(), next.getAction(), next.getManagerAction(), next.getPercent(), a(next.getCallback())));
                concurrentHashMap.put(uuid, next);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            aVar.L(arrayList, new a.AbstractBinderC0455a() { // from class: com.heytap.mcssdk.liquid.b.5
                @Override // e.f.a.a.a.a.b.a
                public void onFailed(List<SeedingRequestResult> list2) {
                    b.this.a(list2, (Map<String, DownloadRequest>) concurrentHashMap);
                }
            });
        } catch (Exception e2) {
            if (e.g()) {
                StringBuilder M = e.a.a.a.a.M("requestDownloadSeedingBatch() has happened error in start process download .");
                M.append(e2.getMessage());
                e.b(e.a, M.toString());
                e2.printStackTrace();
            }
            a(DownloadRequest.ErrorCode.ERROR_ILLEGAL_COMPONENT, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e.f.a.a.a.a.a aVar, Context context) {
        com.heytap.mcssdk.liquid.a andSet = h.getAndSet(null);
        if (andSet == null || aVar == null) {
            return;
        }
        String e2 = andSet.e();
        final IPackageAuthCallbackListener f2 = andSet.f();
        if (e2 == null || e2.isEmpty()) {
            return;
        }
        if (context != null && b(context)) {
            if (e.g()) {
                e.b(e.a, "dealAuthStatusQuery() MCS version <= 52807, return status 4");
            }
            if (f2 != null) {
                f2.onAuthResult(4);
                return;
            }
            return;
        }
        try {
            aVar.T(e2, new c.a() { // from class: com.heytap.mcssdk.liquid.b.4
                @Override // e.f.a.a.a.a.b.c
                public void onAuthResult(int i) {
                    if (e.g()) {
                        e.b(e.a, "queryPackageAuthDetail() onAuthResult status: " + i);
                    }
                    IPackageAuthCallbackListener iPackageAuthCallbackListener = f2;
                    if (iPackageAuthCallbackListener != null) {
                        iPackageAuthCallbackListener.onAuthResult(i);
                    }
                }
            });
        } catch (Exception e3) {
            if (e.g()) {
                StringBuilder M = e.a.a.a.a.M("queryPackageAuthDetail() has happened error in dealCachedMessageProcessTask: ");
                M.append(e3.getMessage());
                e.b(e.a, M.toString());
                e3.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<SeedingRequestResult> list, Map<String, DownloadRequest> map) {
        e.b(a, "onFailedCallback - recv batch results .");
        if (list == null || list.isEmpty()) {
            return;
        }
        for (SeedingRequestResult seedingRequestResult : list) {
            DownloadRequest downloadRequest = map.get(seedingRequestResult.b());
            if (downloadRequest != null && downloadRequest.getCallback() != null) {
                String str = a;
                StringBuilder M = e.a.a.a.a.M("onFailedCallback - recv  fail: request trace-id:");
                M.append(downloadRequest.getTraceId());
                M.append(" downloadResult trace-id:");
                M.append(seedingRequestResult.c());
                e.b(str, M.toString());
                downloadRequest.getCallback().onFailed(seedingRequestResult.c(), seedingRequestResult.e(), seedingRequestResult.a());
            }
        }
        map.clear();
    }

    private boolean b(Context context) {
        String mcsPackageName;
        try {
            mcsPackageName = PushService.getInstance().getMcsPackageName(context);
        } catch (Exception e2) {
            if (e.g()) {
                StringBuilder M = e.a.a.a.a.M("checkMcsVersionNotSupportAuth() error: ");
                M.append(e2.getMessage());
                e.b(e.a, M.toString());
            }
        }
        if (mcsPackageName == null) {
            return false;
        }
        int versionCode = Utils.getVersionCode(context, mcsPackageName);
        if (e.g()) {
            e.b(e.a, "checkMcsVersionNotSupportAuth() mcsVersionCode: " + versionCode);
        }
        if (versionCode <= 52807) {
            if (b()) {
                return true;
            }
        }
        return false;
    }

    private boolean c() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            return ((Boolean) cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]), f6917d)).booleanValue();
        } catch (Throwable th) {
            if (e.g()) {
                StringBuilder M = e.a.a.a.a.M("checkFluidFeature() error .");
                M.append(th.getMessage());
                e.b(e.a, M.toString());
            }
            return false;
        }
    }

    private boolean c(final Context context) {
        Intent intent = new Intent();
        intent.setAction("com.mcs.action.LIQUID_SERVICE");
        intent.setPackage(PushService.getInstance().getMcsPackageName(context));
        return context.bindService(intent, new ServiceConnection() { // from class: com.heytap.mcssdk.liquid.b.2
            @Override // android.content.ServiceConnection
            public void onBindingDied(ComponentName componentName) {
                b.this.b.set(null);
                if (e.g()) {
                    e.b(e.a, "bindLiquidApiService onBindingDied " + componentName);
                }
            }

            @Override // android.content.ServiceConnection
            public void onNullBinding(ComponentName componentName) {
                b.this.b.set(null);
                if (e.g()) {
                    e.b(e.a, "bindLiquidApiService onNullBinding " + componentName);
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                try {
                    e.f.a.a.a.a.a d2 = a.AbstractBinderC0453a.d(iBinder);
                    b.this.b.set(d2);
                    b.this.a(d2, context);
                    b.this.d(context);
                } catch (Exception e2) {
                    if (e.g()) {
                        StringBuilder M = e.a.a.a.a.M("bindLiquidApiService() error :");
                        M.append(e2.getMessage());
                        e.b(e.a, M.toString());
                        e2.printStackTrace();
                    }
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                b.this.b.set(null);
                if (e.g()) {
                    e.b(e.a, "bindLiquidApiService onServiceDisconnected " + componentName);
                }
            }
        }, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        try {
            e.f.a.a.a.a.a aVar = this.b.get();
            com.heytap.mcssdk.liquid.a andSet = f6919g.getAndSet(null);
            if (andSet != null) {
                ILiquidTaskQueryCallback c2 = andSet.c();
                List<String> a2 = aVar.a(context.getPackageName());
                if (c2 != null) {
                    c2.onSuccess(a2);
                }
            }
            if (e.g()) {
                e.b(e.a, "dealCachedMessageProcessTask  cacheClassifyModel:" + this.f6921f);
            }
            if (this.f6921f.size() == 0) {
                return;
            }
            while (true) {
                com.heytap.mcssdk.liquid.a pollFirst = this.f6921f.pollFirst();
                if (pollFirst == null) {
                    return;
                }
                int a3 = pollFirst.a();
                if (e.g()) {
                    e.b(e.a, "dealCachedMessageProcessTask() apiType ." + a3);
                }
                if (a3 == 1) {
                    DownloadRequest b = pollFirst.b();
                    if (b != null && aVar != null) {
                        aVar.d0(context.getPackageName(), b.getLoadingType(), b.getPkgName(), b.getTraceId(), b.getToken(), b.getStatus(), b.getDesc(), b.getAction(), b.getManagerAction(), b.getPercent(), a(b.getCallback()));
                    }
                } else if (a3 == 3) {
                    a(context, aVar, pollFirst.d());
                }
            }
        } catch (Exception unused) {
            if (e.g()) {
                e.b(e.a, "exception happened in deal cached classify task .");
            }
        }
    }

    public void a(int i, List<DownloadRequest> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (DownloadRequest downloadRequest : list) {
            if (downloadRequest.getCallback() != null) {
                downloadRequest.getCallback().onFailed(downloadRequest.getTraceId(), i, downloadRequest.getStatus());
            }
        }
    }

    public void a(Context context) {
        if (this.f6920c != null) {
            context.unregisterReceiver(this.f6920c);
        }
    }

    public synchronized void a(Context context, DownloadRequest downloadRequest) {
        e.f.a.a.a.a.a aVar = this.b.get();
        if (aVar == null) {
            com.heytap.mcssdk.liquid.a aVar2 = new com.heytap.mcssdk.liquid.a(1, downloadRequest);
            this.f6921f.add(aVar2);
            if (!c(context)) {
                if (downloadRequest.getCallback() != null) {
                    downloadRequest.getCallback().onFailed(downloadRequest.getTraceId(), DownloadRequest.ErrorCode.ERROR_ILLEGAL_COMPONENT, downloadRequest.getStatus());
                }
                if (!this.f6921f.remove(aVar2) && e.g()) {
                    e.b(e.a, "requestDownloadSeeding cacheClassifyModel remove failed ");
                }
            }
        } else {
            if (e.g()) {
                e.b(e.a, "requestDownloadSeeding mLiquidApiService = " + aVar + " request = " + downloadRequest);
            }
            try {
                aVar.d0(context.getPackageName(), downloadRequest.getLoadingType(), downloadRequest.getPkgName(), downloadRequest.getTraceId(), downloadRequest.getToken(), downloadRequest.getStatus(), downloadRequest.getDesc(), downloadRequest.getAction(), downloadRequest.getManagerAction(), downloadRequest.getPercent(), a(downloadRequest.getCallback()));
            } catch (Exception e2) {
                if (downloadRequest.getCallback() != null) {
                    downloadRequest.getCallback().onFailed(downloadRequest.getTraceId(), DownloadRequest.ErrorCode.ERROR_ILLEGAL_COMPONENT, downloadRequest.getStatus());
                }
                if (e.g()) {
                    e.b(e.a, "requestDownloadSeeding() has happened error in start process download ." + e2.getMessage());
                    e2.printStackTrace();
                }
            }
        }
    }

    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public synchronized void a(Context context, OnLiquidSettingChangeListener onLiquidSettingChangeListener) {
        if (this.f6920c == null) {
            this.f6920c = new LiquidSettingChangeObserver(context, onLiquidSettingChangeListener);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(LiquidConstants.liquidSwitchChangeThirdAppReceiverAction);
            context.registerReceiver(this.f6920c, intentFilter);
        }
    }

    public synchronized void a(Context context, ILiquidTaskQueryCallback iLiquidTaskQueryCallback) {
        e.f.a.a.a.a.a aVar = this.b.get();
        if (aVar == null) {
            AtomicReference<com.heytap.mcssdk.liquid.a> atomicReference = f6919g;
            atomicReference.set(new com.heytap.mcssdk.liquid.a(2, iLiquidTaskQueryCallback));
            if (!c(context)) {
                if (iLiquidTaskQueryCallback != null) {
                    iLiquidTaskQueryCallback.onFailure(DownloadRequest.ErrorCode.ERROR_ILLEGAL_COMPONENT);
                }
                atomicReference.set(null);
            }
        } else {
            try {
                List<String> a2 = aVar.a(context.getPackageName());
                if (iLiquidTaskQueryCallback != null) {
                    iLiquidTaskQueryCallback.onSuccess(a2);
                }
            } catch (Exception e2) {
                if (e.g()) {
                    e.b(e.a, "requestDownloadSeeding() has happened error in start process download ." + e2.getMessage());
                    e2.printStackTrace();
                }
            }
        }
    }

    public synchronized void a(Context context, String str, final IPackageAuthCallbackListener iPackageAuthCallbackListener) {
        if (str != null) {
            if (!str.isEmpty()) {
                if (b(context)) {
                    if (e.g()) {
                        e.b(e.a, "queryPackageAuthDetail() MCS version <= 52807, return status 4");
                    }
                    if (iPackageAuthCallbackListener != null) {
                        iPackageAuthCallbackListener.onAuthResult(4);
                    }
                    return;
                }
                e.f.a.a.a.a.a aVar = this.b.get();
                if (aVar == null) {
                    AtomicReference<com.heytap.mcssdk.liquid.a> atomicReference = h;
                    atomicReference.set(new com.heytap.mcssdk.liquid.a(4, str, iPackageAuthCallbackListener));
                    if (!c(context)) {
                        if (e.g()) {
                            e.b(e.a, "queryPackageAuthDetail() bind service failed");
                        }
                        atomicReference.set(null);
                    }
                } else {
                    try {
                        aVar.T(str, new c.a() { // from class: com.heytap.mcssdk.liquid.b.1
                            @Override // e.f.a.a.a.a.b.c
                            public void onAuthResult(int i) {
                                if (e.g()) {
                                    e.b(e.a, "queryPackageAuthDetail() onAuthResult status: " + i);
                                }
                                IPackageAuthCallbackListener iPackageAuthCallbackListener2 = iPackageAuthCallbackListener;
                                if (iPackageAuthCallbackListener2 != null) {
                                    iPackageAuthCallbackListener2.onAuthResult(i);
                                }
                            }
                        });
                    } catch (Exception e2) {
                        if (e.g()) {
                            e.b(e.a, "queryPackageAuthDetail() has happened error: " + e2.getMessage());
                            e2.printStackTrace();
                        }
                    }
                }
                return;
            }
        }
        if (e.g()) {
            e.b(e.a, "queryPackageAuthDetail() packageName is null or empty");
        }
    }

    public synchronized void a(Context context, List<DownloadRequest> list) {
        e.f.a.a.a.a.a aVar = this.b.get();
        if (aVar == null) {
            com.heytap.mcssdk.liquid.a aVar2 = new com.heytap.mcssdk.liquid.a(3, list);
            this.f6921f.add(aVar2);
            boolean c2 = c(context);
            if (e.g()) {
                e.b(e.a, "requestDownloadSeedingList  bindResult:" + c2 + "cacheClassifyModel:" + this.f6921f);
            }
            if (!c2) {
                a(DownloadRequest.ErrorCode.ERROR_ILLEGAL_COMPONENT, list);
                if (!this.f6921f.remove(aVar2) && e.g()) {
                    e.b(e.a, "requestDownloadSeedingList cacheClassifyModel remove failed ");
                }
            }
        } else {
            if (e.g()) {
                e.b(e.a, "requestDownloadSeedingList mLiquidApiService = " + aVar + " requestList = " + list);
            }
            a(context, aVar, list);
        }
    }

    public boolean b() {
        if (f6918e == null) {
            synchronized (this) {
                if (f6918e == null) {
                    f6918e = Boolean.valueOf(c());
                }
            }
        }
        StringBuilder M = e.a.a.a.a.M("isSupportFluidDevice() isFluidDevice:");
        M.append(f6918e);
        e.b(e.a, M.toString());
        return f6918e.booleanValue();
    }
}
