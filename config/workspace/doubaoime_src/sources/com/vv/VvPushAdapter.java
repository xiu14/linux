package com.vv;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.bytedance.android.service.manager.permission.boot.AlertRequestParam;
import com.bytedance.push.C;
import com.bytedance.push.H;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.IPushActionListener;
import com.vivo.push.PushClient;
import com.vivo.push.PushConfig;
import com.vivo.push.listener.IPushQueryActionListener;
import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.VivoPushException;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class VvPushAdapter extends com.bytedance.push.third.b implements com.bytedance.push.third.c {
    private static final String TAG = "VivoPush";
    private static int VV_PUSH = -1;
    private static boolean hasSendValidToken = false;
    private static boolean sHasRegistered = false;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private volatile boolean appStatusHasChanged = false;
    private boolean hasShown = false;
    private final long DIALOG_SHOW_TIME_OUT = 2000;
    private final String SUCCESS = "success";

    class a implements IPushActionListener {
        final /* synthetic */ int a;
        final /* synthetic */ Context b;

        /* renamed from: com.vv.VvPushAdapter$a$a, reason: collision with other inner class name */
        class C0406a implements IPushQueryActionListener {
            C0406a() {
            }

            @Override // com.vivo.push.listener.IPushRequestListener
            public void onFail(Integer num) {
                Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
                com.bytedance.push.g0.f.e(VvPushAdapter.TAG, "onFail,error code: " + num);
            }

            @Override // com.vivo.push.listener.IPushRequestListener
            public void onSuccess(String str) {
                String str2 = str;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
                com.bytedance.push.g0.f.g(VvPushAdapter.TAG, "success get token");
                com.bytedance.push.Q.b x = C.x();
                String s = e.a.a.a.a.s("token = ", str2);
                Objects.requireNonNull((com.bytedance.push.Q.c) x);
                com.bytedance.push.g0.f.c(VvPushAdapter.TAG, s);
                VvPushAdapter.this.mHandler.post(new com.vv.b(this, str2));
            }
        }

        a(int i, Context context) {
            this.a = i;
            this.b = context;
        }

        @Override // com.vivo.push.IPushActionListener
        public void onStateChanged(int i) {
            if (i != 0) {
                String k = e.a.a.a.a.k("open push error [", i, "] ，please check the official documentation of the vendor");
                C.y().a(this.a, 104, String.valueOf(i), "vivo channel register failed");
                Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
                com.bytedance.push.g0.f.e(VvPushAdapter.TAG, k);
            } else {
                Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
                com.bytedance.push.g0.f.g(VvPushAdapter.TAG, "open push success");
            }
            PushClient.getInstance(this.b).getRegId(new C0406a());
        }
    }

    class b implements IPushActionListener {
        b(VvPushAdapter vvPushAdapter) {
        }

        @Override // com.vivo.push.IPushActionListener
        public void onStateChanged(int i) {
            com.bytedance.push.g0.f.c(VvPushAdapter.TAG, "onStateChanged() called with: i = [" + i + "]");
        }
    }

    class c implements IPushActionListener {
        c(VvPushAdapter vvPushAdapter) {
        }

        @Override // com.vivo.push.IPushActionListener
        public void onStateChanged(int i) {
            com.bytedance.push.g0.f.c(VvPushAdapter.TAG, "onStateChanged() called with: i = [" + i + "]");
        }
    }

    class d implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Boolean[] f8949c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f8950d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String[] f8951e;

        class a implements IPushRequestCallback<Integer> {
            a() {
            }

            @Override // com.vivo.push.restructure.request.IPushRequestCallback
            public void onError(int i) {
                d.this.f8949c[0] = Boolean.FALSE;
                com.bytedance.push.Q.b x = C.x();
                String j = e.a.a.a.a.j("[setProfileId]failed set profile id:", i);
                Objects.requireNonNull((com.bytedance.push.Q.c) x);
                com.bytedance.push.g0.f.e(VvPushAdapter.TAG, j);
                d.this.f8951e[0] = e.a.a.a.a.j("vv error:", i);
                d.this.f8950d.countDown();
            }

            @Override // com.vivo.push.restructure.request.IPushRequestCallback
            public void onSuccess(Integer num) {
                Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
                com.bytedance.push.g0.f.c(VvPushAdapter.TAG, "[setProfileId]success set profile id:" + num);
                d dVar = d.this;
                dVar.f8949c[0] = Boolean.TRUE;
                dVar.f8950d.countDown();
            }
        }

        d(VvPushAdapter vvPushAdapter, Context context, String str, Boolean[] boolArr, CountDownLatch countDownLatch, String[] strArr) {
            this.a = context;
            this.b = str;
            this.f8949c = boolArr;
            this.f8950d = countDownLatch;
            this.f8951e = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            PushClient.getInstance(this.a).addProfileId(this.b, new a());
        }
    }

    class e implements IPushRequestCallback<Integer> {
        final /* synthetic */ Boolean[] a;
        final /* synthetic */ CountDownLatch b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String[] f8952c;

        e(VvPushAdapter vvPushAdapter, Boolean[] boolArr, CountDownLatch countDownLatch, String[] strArr) {
            this.a = boolArr;
            this.b = countDownLatch;
            this.f8952c = strArr;
        }

        @Override // com.vivo.push.restructure.request.IPushRequestCallback
        public void onError(int i) {
            this.a[0] = Boolean.FALSE;
            com.bytedance.push.Q.b x = C.x();
            String j = e.a.a.a.a.j("[deleteProfileId]failed set profile id:", i);
            Objects.requireNonNull((com.bytedance.push.Q.c) x);
            com.bytedance.push.g0.f.c(VvPushAdapter.TAG, j);
            this.f8952c[0] = e.a.a.a.a.j("vv error:", i);
            this.b.countDown();
        }

        @Override // com.vivo.push.restructure.request.IPushRequestCallback
        public void onSuccess(Integer num) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            com.bytedance.push.g0.f.c(VvPushAdapter.TAG, "[deleteProfileId]success delete profile id:" + num);
            this.a[0] = Boolean.TRUE;
            this.b.countDown();
        }
    }

    class f implements j {
        final /* synthetic */ String a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.bytedance.common.push.e.i f8953c;

        class a implements com.vv.a {
            a() {
            }
        }

        f(String str, int i, com.bytedance.common.push.e.i iVar) {
            this.a = str;
            this.b = i;
            this.f8953c = iVar;
        }

        public void a(boolean z) {
            if (!z) {
                com.bytedance.push.g0.f.c(VvPushAdapter.TAG, "requestNotificationOfficial show failed");
                VvPushAdapter.this.onGuideRequestResult(this.a, this.b, "vv", false, "failed", this.f8953c);
                com.vv.c.b.a = null;
            } else {
                com.bytedance.push.g0.f.c(VvPushAdapter.TAG, "requestNotificationOfficial show success");
                VvPushAdapter.this.onGuideRequestResult(this.a, this.b, "vv", true, "success", this.f8953c);
                com.vv.c.b.a = new a();
            }
        }
    }

    class g implements Observer {
        final /* synthetic */ String a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.bytedance.common.push.e.i f8955c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f8956d;

        g(String str, int i, com.bytedance.common.push.e.i iVar, Context context) {
            this.a = str;
            this.b = i;
            this.f8955c = iVar;
            this.f8956d = context;
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            StringBuilder X = e.a.a.a.a.X("app status changed,isInBackGround:", booleanValue, " appStatusHasChange：");
            X.append(VvPushAdapter.this.appStatusHasChanged);
            com.bytedance.push.g0.f.c(VvPushAdapter.TAG, X.toString());
            if (booleanValue) {
                VvPushAdapter.this.appStatusHasChanged = true;
                if (VvPushAdapter.this.hasShown) {
                    VvPushAdapter.this.onGuideRequestResult(this.a, this.b, "vv", true, "success", this.f8955c);
                }
            }
            if (booleanValue || !VvPushAdapter.this.appStatusHasChanged) {
                return;
            }
            int d2 = com.ss.android.message.f.a.d(this.f8956d);
            boolean z = com.ss.android.message.f.a.f8353g;
            if (d2 == 1) {
                VvPushAdapter.this.onUserClickResult(this.a, true, this.f8955c);
            } else {
                VvPushAdapter.this.onUserClickResult(this.a, false, this.f8955c);
            }
            com.bytedance.push.helper.d.c().deleteObserver(this);
        }
    }

    class h implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.bytedance.common.push.e.i f8958c;

        h(String str, int i, com.bytedance.common.push.e.i iVar) {
            this.a = str;
            this.b = i;
            this.f8958c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder M = e.a.a.a.a.M("backup detect dialog show result now, hasShown:");
            M.append(VvPushAdapter.this.hasShown);
            M.append(" appStatusHasChanged:");
            M.append(VvPushAdapter.this.appStatusHasChanged);
            com.bytedance.push.g0.f.c(VvPushAdapter.TAG, M.toString());
            if (VvPushAdapter.this.hasShown) {
                if (VvPushAdapter.this.appStatusHasChanged) {
                    VvPushAdapter.this.onGuideRequestResult(this.a, this.b, "vv", true, "success", this.f8958c);
                } else {
                    VvPushAdapter.this.onGuideRequestResult(this.a, this.b, "vv", false, "time out", this.f8958c);
                }
            }
            VvPushAdapter.this.hasShown = false;
        }
    }

    class i implements IPushActionListener {
        final /* synthetic */ Context a;
        final /* synthetic */ Activity b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f8960c;

        class a implements IPushActionListener {
            a() {
            }

            @Override // com.vivo.push.IPushActionListener
            public void onStateChanged(int i) {
                if (i == 0) {
                    j jVar = i.this.f8960c;
                    if (jVar != null) {
                        ((f) jVar).a(true);
                        return;
                    }
                    return;
                }
                com.bytedance.push.g0.f.e(VvPushAdapter.TAG, "NotifyGuideDialog show failed");
                j jVar2 = i.this.f8960c;
                if (jVar2 != null) {
                    ((f) jVar2).a(false);
                }
            }
        }

        i(VvPushAdapter vvPushAdapter, Context context, Activity activity, j jVar) {
            this.a = context;
            this.b = activity;
            this.f8960c = jVar;
        }

        @Override // com.vivo.push.IPushActionListener
        public void onStateChanged(int i) {
            if (i == 0) {
                PushClient.getInstance(this.a).showNotifyGuideDialog(this.b, new a());
                return;
            }
            com.bytedance.push.g0.f.e(VvPushAdapter.TAG, "NotifyGuideDialog is not allowed: " + i);
            j jVar = this.f8960c;
            if (jVar != null) {
                ((f) jVar).a(false);
            }
        }
    }

    private interface j {
    }

    public static int getVvPush() {
        if (VV_PUSH == -1) {
            VV_PUSH = com.bytedance.push.third.g.o(com.ss.android.message.a.a()).d(VvPushAdapter.class.getName());
        }
        return VV_PUSH;
    }

    public static boolean hasTryRegistered() {
        return sHasRegistered;
    }

    private Boolean isPushServiceAvailable() {
        try {
            PackageInfo packageInfo = com.ss.android.message.a.a().getPackageManager().getPackageInfo("com.vivo.pushservice", 0);
            com.bytedance.push.g0.f.e(TAG, "com.vivo.pushservice versionName: " + packageInfo.versionName);
            if (packageInfo.versionCode >= 5380000) {
                com.bytedance.push.g0.f.e(TAG, "com.vivo.pushservice versionCode: " + packageInfo.versionCode + " is available!");
                return Boolean.TRUE;
            }
            com.bytedance.push.g0.f.e(TAG, "com.vivo.pushservice versionCode: " + packageInfo.versionCode + " version not supported!");
            return Boolean.FALSE;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUserClickResult(String str, boolean z, com.bytedance.common.push.e.i iVar) {
        com.bytedance.push.g0.f.g(TAG, "on request vv notification permission result,report click event,hasAgree:" + z);
        onClickResult(str, getVvPush(), "vv", z, "", 0, null, iVar);
    }

    private void requestNotificationHook(String str, int i2, int i3, com.bytedance.common.push.e.i iVar) {
        Application a2 = com.ss.android.message.a.a();
        if (this.hasShown) {
            com.bytedance.push.g0.f.e(TAG, "can't requestNotificationPermission because cur has showing");
        }
        this.hasShown = true;
        this.appStatusHasChanged = false;
        this.hasCallbackShowResult = false;
        com.bytedance.push.helper.d.c().addObserver(new g(str, i2, iVar, a2));
        String requestNotificationInternal = requestNotificationInternal();
        if (TextUtils.equals(requestNotificationInternal, "success")) {
            com.bytedance.push.g0.f.c(TAG, "backup detect dialog show result after 2000");
            com.ss.android.message.e.e().f(new h(str, i2, iVar), 2000L);
        } else {
            onGuideRequestResult(str, i2, "vv", false, requestNotificationInternal, iVar);
            this.hasShown = false;
        }
    }

    private String requestNotificationInternal() {
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        com.bytedance.push.g0.f.c(TAG, "requestNotificationInternal");
        Application a2 = com.ss.android.message.a.a();
        try {
            IBinder iBinder = (IBinder) Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", String.class).invoke(null, RemoteMessageConst.NOTIFICATION);
            if (iBinder == null) {
                Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
                com.bytedance.push.g0.f.e(TAG, "get service failed.");
                return "notification service is null";
            }
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            iBinder.transact(1598968902, obtain, obtain2, 0);
            String readString = obtain2.readString();
            if (readString == null || readString.equals("")) {
                return "readString is null";
            }
            Object invoke = Class.forName(readString + "$Stub").getDeclaredMethod("asInterface", IBinder.class).invoke(null, iBinder);
            if (invoke == null) {
                return "asInterface is null";
            }
            invoke.getClass().getDeclaredMethod("requestNotificationPermission", String.class).invoke(invoke, a2.getPackageName());
            return "success";
        } catch (NoSuchMethodException e2) {
            StringBuilder M = e.a.a.a.a.M("not support device:");
            M.append(e2.getLocalizedMessage());
            return M.toString();
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f(TAG, "requestNotificationInternal error ", th);
            return "exception:" + th.getLocalizedMessage();
        }
    }

    private void requestNotificationOfficial(j jVar) {
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        com.bytedance.push.g0.f.c(TAG, "requestNotificationOfficial");
        Application a2 = com.ss.android.message.a.a();
        try {
            Activity h2 = com.bytedance.common.push.b.e().h();
            PushClient.getInstance(a2).isNotifyGuideDialogAllowed(h2, new i(this, a2, h2, jVar));
        } catch (Exception e2) {
            com.bytedance.push.g0.f.f(TAG, "requestNotificationOfficial error ", e2);
            if (jVar != null) {
                ((f) jVar).a(false);
            }
        }
    }

    public static void sendToken(Context context, String str) {
        if (context == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Objects.requireNonNull((H) C.B());
            if (com.ss.android.message.f.a.t(context)) {
                C.y().a(getVvPush(), 102, "0", "token is empty");
                return;
            }
            return;
        }
        StringBuilder M = e.a.a.a.a.M("[sendToken]hasSendValidToken:");
        M.append(hasSendValidToken);
        com.bytedance.push.g0.f.c(TAG, M.toString());
        if (hasSendValidToken) {
            return;
        }
        hasSendValidToken = true;
        ((H) C.B()).e(context, getVvPush(), str);
    }

    private void setComponentStatus(Context context, Class cls, boolean z) {
        ComponentName componentName = new ComponentName(context, (Class<?>) cls);
        com.bytedance.push.Q.b x = C.x();
        StringBuilder M = e.a.a.a.a.M("set ");
        M.append(cls.getName());
        M.append(" to:");
        M.append(z);
        String sb = M.toString();
        Objects.requireNonNull((com.bytedance.push.Q.c) x);
        com.bytedance.push.g0.f.g(TAG, sb);
        try {
            context.getPackageManager().setComponentEnabledSetting(componentName, z ? 1 : 2, 1);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.push.third.c
    public boolean checkThirdPushConfig(String str, Context context) throws Exception {
        try {
            PushClient.getInstance(context).checkManifest();
            return true;
        } catch (VivoPushException e2) {
            StringBuilder M = e.a.a.a.a.M("VivoPush Errcode = ");
            M.append(e2.getCode());
            M.append(" ");
            M.append(e2.getMessage());
            com.bytedance.push.g0.f.e(str, M.toString());
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.bytedance.push.third.b
    public boolean deleteProfileId(Context context, String str) {
        String localizedMessage;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            int isSupportSyncProfileInfo = PushClient.getInstance(context).isSupportSyncProfileInfo();
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            com.bytedance.push.g0.f.g(TAG, "[deleteProfileId]supportProfile:" + isSupportSyncProfileInfo + " profileId:" + str);
            String str2 = null;
            if (isSupportSyncProfileInfo == 0) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Boolean[] boolArr = {null};
                String[] strArr = {""};
                PushClient.getInstance(context).deleteProfileId(str, new e(this, boolArr, countDownLatch, strArr));
                try {
                    countDownLatch.await(com.heytap.mcssdk.constant.a.q, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                if (boolArr[0] == null) {
                    i2 = 4;
                } else if (boolArr[0].booleanValue()) {
                    i2 = 1;
                } else {
                    com.bytedance.push.g0.f.c(TAG, "error msg is :" + strArr[0]);
                    i2 = 6;
                    str2 = strArr[0];
                }
            } else {
                i2 = 3;
            }
            localizedMessage = str2;
        } catch (Throwable th) {
            localizedMessage = th.getLocalizedMessage();
            i2 = 5;
        }
        onDeleteProfileIdResult(getVvPush(), currentTimeMillis, i2, localizedMessage);
        return i2 == 1;
    }

    @Override // com.bytedance.push.third.b
    public int getPushType() {
        return 11;
    }

    @Override // com.bytedance.push.third.b
    public String isBusinessAlertDialogAvailable(Context context, boolean z) {
        if (!isPushAvailable(context, VV_PUSH)) {
            com.bytedance.push.g0.f.g(TAG, "[isBusinessAlertDialogAvailable]return false because push is not available");
            return "push is not available";
        }
        if (com.ss.android.pushmanager.setting.c.c().g().l()) {
            com.bytedance.push.g0.f.g(TAG, "[isBusinessAlertDialogAvailable]return true");
            return PushClient.DEFAULT_REQUEST_ID;
        }
        com.bytedance.push.g0.f.g(TAG, "[isBusinessAlertDialogAvailable]return false because enableVvBusinessNotificationDialog is false");
        return "enableVvBusinessNotificationDialog is false";
    }

    @Override // com.bytedance.push.third.c
    public boolean isPushAvailable(Context context, int i2) {
        return com.bytedance.feedbackerlib.a.d0() && PushClient.getInstance(context.getApplicationContext()).isSupport();
    }

    @Override // com.bytedance.push.third.c
    public void registerPush(Context context, int i2) {
        try {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            com.bytedance.push.g0.f.g(TAG, "registerVivoPush");
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            if (com.bytedance.push.g0.f.d()) {
                PushClient.getInstance(context).checkManifest();
            }
            sHasRegistered = true;
            PushClient.getInstance(context.getApplicationContext()).initialize(new PushConfig.Builder().agreePrivacyStatement(true).build());
            PushClient.getInstance(context).turnOnPush(new a(i2, context));
        } catch (Exception e2) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            com.bytedance.push.g0.f.f(TAG, "error when register vv push ", e2);
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.push.third.b
    public synchronized boolean requestNotificationPermission(String str, int i2, int i3, AlertRequestParam alertRequestParam, com.bytedance.common.push.e.i iVar) {
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        com.bytedance.push.g0.f.c(TAG, "[requestNotificationPermission]");
        if (i2 != getVvPush()) {
            com.bytedance.push.g0.f.e(TAG, "invalid push_type:" + i2);
            onGuideRequestResult(str, i2, "vv", false, "invalid push_type:" + i2, iVar);
            return false;
        }
        if (com.ss.android.message.f.a.d(com.ss.android.message.a.a()) == 1) {
            com.bytedance.push.g0.f.e(TAG, "cur notification are enabled,needn't request");
            onGuideRequestResult(str, i2, "vv", false, "cur notification are enabled,needn't request", iVar);
            return false;
        }
        if (com.bytedance.common.push.b.e().h() == null) {
            com.bytedance.push.g0.f.e(TAG, "can't requestNotificationPermission on vv device because topActivity is null");
            onGuideRequestResult(str, i2, "vv", false, "topActivity is null,app is not in the foreground!", iVar);
            return false;
        }
        this.hasCallbackShowResult = false;
        this.hasCallbackClickResult = false;
        this.mAlertRequestParam = alertRequestParam;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30 && i4 <= 32) {
            requestNotificationHook(str, i2, i3, iVar);
        } else if (i4 >= 28 && isPushServiceAvailable().booleanValue()) {
            requestNotificationOfficial(new f(str, i2, iVar));
        }
        return true;
    }

    public boolean requestRemoveVoipNotification(Context context, int i2) {
        return false;
    }

    @Override // com.bytedance.push.third.c
    public void setAlias(Context context, String str, int i2) {
        try {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            com.bytedance.push.g0.f.g(TAG, "setAlias alias = " + str);
            PushClient.getInstance(context).bindAlias(str, new b(this));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.push.third.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean setProfileId(android.content.Context r18, java.lang.String r19) {
        /*
            r17 = this;
            java.lang.String r1 = "VivoPush"
            long r4 = java.lang.System.currentTimeMillis()
            r8 = 1
            r9 = 0
            com.vivo.push.PushClient r0 = com.vivo.push.PushClient.getInstance(r18)     // Catch: java.lang.Throwable -> Laa
            int r0 = r0.isSupportSyncProfileInfo()     // Catch: java.lang.Throwable -> Laa
            com.bytedance.push.Q.b r2 = com.bytedance.push.C.x()     // Catch: java.lang.Throwable -> Laa
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r3.<init>()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r6 = "[setProfileId]supportProfile:"
            r3.append(r6)     // Catch: java.lang.Throwable -> Laa
            r3.append(r0)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r6 = " profileId len:"
            r3.append(r6)     // Catch: java.lang.Throwable -> Laa
            int r6 = r19.length()     // Catch: java.lang.Throwable -> Laa
            r3.append(r6)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r6 = " profileId："
            r3.append(r6)     // Catch: java.lang.Throwable -> Laa
            r6 = r19
            r3.append(r6)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Laa
            com.bytedance.push.Q.c r2 = (com.bytedance.push.Q.c) r2     // Catch: java.lang.Throwable -> Laa
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> Laa
            com.bytedance.push.g0.f.g(r1, r3)     // Catch: java.lang.Throwable -> Laa
            r2 = 0
            if (r0 != 0) goto La6
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> Laa
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Laa
            java.lang.Boolean[] r3 = new java.lang.Boolean[r8]     // Catch: java.lang.Throwable -> Laa
            r3[r9] = r2     // Catch: java.lang.Throwable -> Laa
            java.lang.String r7 = ""
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> Laa
            com.ss.android.message.e r15 = com.ss.android.message.e.e()     // Catch: java.lang.Throwable -> Laa
            com.vv.VvPushAdapter$d r14 = new com.vv.VvPushAdapter$d     // Catch: java.lang.Throwable -> Laa
            r10 = r14
            r11 = r17
            r12 = r18
            r13 = r19
            r6 = r14
            r14 = r3
            r2 = r15
            r15 = r0
            r16 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> Laa
            r10 = 0
            r2.f(r6, r10)     // Catch: java.lang.Throwable -> Laa
            r10 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L78 java.lang.Throwable -> Laa
            r0.await(r10, r2)     // Catch: java.lang.InterruptedException -> L78 java.lang.Throwable -> Laa
            goto L7c
        L78:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Laa
        L7c:
            r0 = r3[r9]     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto La4
            r0 = r3[r9]     // Catch: java.lang.Throwable -> Laa
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto L8a
            r0 = r8
            goto La7
        L8a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r0.<init>()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = "error msg is :"
            r0.append(r2)     // Catch: java.lang.Throwable -> Laa
            r2 = r7[r9]     // Catch: java.lang.Throwable -> Laa
            r0.append(r2)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Laa
            com.bytedance.push.g0.f.c(r1, r0)     // Catch: java.lang.Throwable -> Laa
            r0 = 6
            r2 = r7[r9]     // Catch: java.lang.Throwable -> Laa
            goto La8
        La4:
            r0 = 4
            goto La7
        La6:
            r0 = 3
        La7:
            r2 = 0
        La8:
            r7 = r2
            goto Lb2
        Laa:
            r0 = move-exception
            r2 = 5
            java.lang.String r0 = r0.getLocalizedMessage()
            r7 = r0
            r0 = r2
        Lb2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onSetProfileIdResult,resultStatus:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = " extra:"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.bytedance.push.g0.f.c(r1, r2)
            int r3 = getVvPush()
            r2 = r17
            r6 = r0
            r2.onSetProfileIdResult(r3, r4, r6, r7)
            if (r0 != r8) goto Ldb
            goto Ldc
        Ldb:
            r8 = r9
        Ldc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vv.VvPushAdapter.setProfileId(android.content.Context, java.lang.String):boolean");
    }

    @Override // com.bytedance.push.third.c
    public void trackPush(Context context, int i2, Object obj) {
    }

    @Override // com.bytedance.push.third.c
    public void unregisterPush(Context context, int i2) {
        try {
            PushClient.getInstance(context).turnOffPush(new c(this));
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            com.bytedance.push.g0.f.g(TAG, "unregisterPush");
        } catch (Throwable unused) {
        }
    }
}
