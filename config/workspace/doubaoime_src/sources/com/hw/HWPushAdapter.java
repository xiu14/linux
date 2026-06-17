package com.hw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.android.service.manager.permission.boot.AlertRequestParam;
import com.bytedance.common.push.e.i;
import com.bytedance.push.C;
import com.bytedance.push.H;
import com.bytedance.push.g0.a;
import com.bytedance.push.g0.f;
import com.bytedance.push.settings.LocalSettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.h;
import com.bytedance.push.third.g;
import com.huawei.d.a.e;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.push.HmsMessaging;
import com.huawei.hms.push.HmsProfile;
import com.huawei.hms.push.plugin.notification.HmsNotificationManagerEx;
import com.huawei.hms.push.plugin.notification.NotificationStatus;
import com.huawei.hms.utils.Util;
import com.vivo.push.PushClient;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class HWPushAdapter extends com.bytedance.push.third.b implements com.bytedance.push.third.c {
    private static int HW_PUSH = -1;
    public static final String TAG = "HWPush";
    private boolean hasShown = false;
    private int dialogRequestPushType = -1;
    private volatile boolean appStatusHasChanged = false;

    class a implements Runnable {
        final /* synthetic */ Context a;

        a(HWPushAdapter hWPushAdapter, Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocalSettings localSettings = (LocalSettings) h.b(this.a, LocalSettings.class);
            if (localSettings.p0() == 0) {
                f.g(HWPushAdapter.TAG, "update LastHwDialogShowTime to cur time because app first launch");
                localSettings.C0(System.currentTimeMillis());
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ Activity a;
        final /* synthetic */ i b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7507c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7508d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7509e;

        class a implements com.huawei.d.a.d {
            a() {
            }

            @Override // com.huawei.d.a.d
            public void a(Exception exc) {
                StringBuilder M = e.a.a.a.a.M("[huaweiPushPermissionDialog] onFailure:");
                M.append(exc.getLocalizedMessage());
                f.e(HWPushAdapter.TAG, M.toString());
                HWPushAdapter.this.hasShown = false;
                b bVar = b.this;
                HWPushAdapter hWPushAdapter = HWPushAdapter.this;
                String str = bVar.f7507c;
                int i = bVar.f7509e;
                StringBuilder M2 = e.a.a.a.a.M("onError:");
                M2.append(exc.getLocalizedMessage());
                String sb = M2.toString();
                b bVar2 = b.this;
                hWPushAdapter.onGuideRequestResult(str, i, "hms", false, sb, bVar2.f7508d, bVar2.b);
            }
        }

        /* renamed from: com.hw.HWPushAdapter$b$b, reason: collision with other inner class name */
        class C0354b implements e<NotificationStatus> {
            C0354b() {
            }

            @Override // com.huawei.d.a.e
            public void onSuccess(NotificationStatus notificationStatus) {
                NotificationStatus notificationStatus2 = notificationStatus;
                StringBuilder M = e.a.a.a.a.M("[huaweiPushPermissionDialog] onSuccess ,notificationStatus.getStatus: ");
                M.append(notificationStatus2.getStatus());
                f.g(HWPushAdapter.TAG, M.toString());
                HWPushAdapter.this.hasShown = false;
                try {
                    f.g(HWPushAdapter.TAG, "enable notification status success,topActivity:" + b.this.a);
                    b bVar = b.this;
                    ((com.bytedance.push.third.b) HWPushAdapter.this).mRequestResultCallback = bVar.b;
                    b bVar2 = b.this;
                    ((com.bytedance.push.third.b) HWPushAdapter.this).mCurScenes = bVar2.f7507c;
                    int i = b.this.f7508d == 0 ? com.bytedance.push.third.b.REQUEST_CODE_REQUEST_NOTIFICATION_PERMISSION_BY_SYS_DIALOG : com.bytedance.push.third.b.REQUEST_CODE_REQUEST_NOTIFICATION_PERMISSION_BY_CUSTOM_DIALOG;
                    com.bytedance.common.push.b.e().addObserver(new com.hw.a(this, i));
                    notificationStatus2.startResolutionForResult(b.this.a, i);
                    b bVar3 = b.this;
                    HWPushAdapter.this.onGuideRequestResult(bVar3.f7507c, bVar3.f7509e, "hms", true, "success", bVar3.f7508d, bVar3.b);
                    ((LocalSettings) h.b(com.ss.android.message.a.a(), LocalSettings.class)).C0(System.currentTimeMillis());
                } catch (Throwable th) {
                    StringBuilder M2 = e.a.a.a.a.M("enable notification catch exception: ");
                    M2.append(th.getMessage());
                    f.e(HWPushAdapter.TAG, M2.toString());
                    b bVar4 = b.this;
                    HWPushAdapter hWPushAdapter = HWPushAdapter.this;
                    String str = bVar4.f7507c;
                    int i2 = bVar4.f7509e;
                    StringBuilder M3 = e.a.a.a.a.M("error when startResolutionForResult:");
                    M3.append(th.getLocalizedMessage());
                    String sb = M3.toString();
                    b bVar5 = b.this;
                    hWPushAdapter.onGuideRequestResult(str, i2, "hms", false, sb, bVar5.f7508d, bVar5.b);
                }
            }
        }

        b(Activity activity, i iVar, String str, int i, int i2) {
            this.a = activity;
            this.b = iVar;
            this.f7507c = str;
            this.f7508d = i;
            this.f7509e = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.huawei.d.a.f<NotificationStatus> enableNotification = HmsNotificationManagerEx.getInstance(this.a).enableNotification();
                enableNotification.c(new C0354b());
                enableNotification.b(new a());
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("[requestNotificationPermissionInternal] exception:");
                M.append(th.getLocalizedMessage());
                f.e(HWPushAdapter.TAG, M.toString());
                HWPushAdapter.this.hasShown = false;
                HWPushAdapter hWPushAdapter = HWPushAdapter.this;
                String str = this.f7507c;
                int i = this.f7509e;
                StringBuilder M2 = e.a.a.a.a.M("exception:");
                M2.append(th.getLocalizedMessage());
                hWPushAdapter.onGuideRequestResult(str, i, "hms", false, M2.toString(), this.f7508d, this.b);
            }
        }
    }

    class c implements com.huawei.d.a.c<Void> {
        final /* synthetic */ com.huawei.d.a.f[] a;
        final /* synthetic */ CountDownLatch b;

        c(HWPushAdapter hWPushAdapter, com.huawei.d.a.f[] fVarArr, CountDownLatch countDownLatch) {
            this.a = fVarArr;
            this.b = countDownLatch;
        }

        @Override // com.huawei.d.a.c
        public void onComplete(com.huawei.d.a.f<Void> fVar) {
            StringBuilder M = e.a.a.a.a.M("onComplete add profile id,task is :");
            M.append(fVar.f());
            f.g(HWPushAdapter.TAG, M.toString());
            this.a[0] = fVar;
            this.b.countDown();
        }
    }

    class d implements com.huawei.d.a.c<Void> {
        final /* synthetic */ com.huawei.d.a.f[] a;
        final /* synthetic */ CountDownLatch b;

        d(HWPushAdapter hWPushAdapter, com.huawei.d.a.f[] fVarArr, CountDownLatch countDownLatch) {
            this.a = fVarArr;
            this.b = countDownLatch;
        }

        @Override // com.huawei.d.a.c
        public void onComplete(com.huawei.d.a.f<Void> fVar) {
            StringBuilder M = e.a.a.a.a.M("onComplete delete profile id,task is :");
            M.append(fVar.f());
            f.g(HWPushAdapter.TAG, M.toString());
            this.a[0] = fVar;
            this.b.countDown();
        }
    }

    public static int getHwPush() {
        if (HW_PUSH == -1) {
            HW_PUSH = g.o(com.ss.android.message.a.a()).d(HWPushAdapter.class.getName());
        }
        return HW_PUSH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUserClickResult(boolean z, int i, int i2, i iVar) {
        f.g(TAG, "[onUserClickResult]on request hw notification permission result,report click event,hasAgree:" + z + " sysAlertStyle:" + i);
        onClickResult(this.mCurScenes, getHwPush(), "hms", z, "", i, null, iVar);
    }

    private void requestNotificationPermissionInternal(String str, int i, Activity activity, i iVar, int i2, i iVar2) {
        com.ss.android.message.e.e().f(new b(activity, iVar, str, i2, i), 0L);
    }

    @Override // com.bytedance.push.third.c
    public boolean checkThirdPushConfig(String str, Context context) throws Exception {
        boolean z;
        if (TextUtils.isEmpty(Util.getAppId(context))) {
            f.c(str, "HWPush. You need to declare metadata \"com.huawei.hms.client.appid \" in AndroidManifest.xml");
            z = false;
        } else {
            z = true;
        }
        a.C0301a c0301a = new a.C0301a("com.huawei.MessageService");
        c0301a.e(context.getPackageName());
        c0301a.a(new a.b(Collections.singletonList("com.huawei.push.action.MESSAGING_EVENT")));
        return com.bytedance.push.g0.g.d(context, str, TAG, Collections.singletonList(c0301a.b())) & z;
    }

    @Override // com.bytedance.push.third.b
    public boolean deleteProfileId(Context context, String str) {
        int i;
        String localizedMessage;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            boolean isSupportProfile = HmsProfile.getInstance(context).isSupportProfile();
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.c(TAG, "[deleteProfileId]supportProfile:" + isSupportProfile);
            String str2 = null;
            if (isSupportProfile) {
                f.g(TAG, "cur device support profile id,delete profile id,profileId is " + str);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                com.huawei.d.a.f[] fVarArr = {null};
                HmsProfile.getInstance(context).deleteProfile(str).a(new d(this, fVarArr, countDownLatch));
                try {
                    countDownLatch.await(com.heytap.mcssdk.constant.a.q, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                com.huawei.d.a.f fVar = fVarArr[0];
                f.g(TAG, "finished delete profile id,task is :" + fVar);
                if (fVar != null) {
                    f.g(TAG, "finished delete profile id,success:" + fVar.f());
                    if (fVar.f()) {
                        i = 1;
                    } else {
                        f.g(TAG, "delete profile id error msg is :" + fVar.d().getLocalizedMessage());
                        i = 6;
                        str2 = fVar.d().getLocalizedMessage();
                    }
                } else {
                    i = 4;
                }
            } else {
                i = 3;
            }
            localizedMessage = str2;
        } catch (Throwable th) {
            i = 5;
            localizedMessage = th.getLocalizedMessage();
        }
        onDeleteProfileIdResult(getHwPush(), currentTimeMillis, i, localizedMessage);
        return i == 1;
    }

    @Override // com.bytedance.push.third.b
    public int getPushType() {
        return 7;
    }

    @Override // com.bytedance.push.third.b
    public String isBusinessAlertDialogAvailable(Context context, boolean z) {
        if (!isPushAvailable(context, HW_PUSH)) {
            f.g(TAG, "[isBusinessAlertDialogAvailable]return false because push is not available");
            return "push is not available";
        }
        PushOnlineSettings g2 = com.ss.android.pushmanager.setting.c.c().g();
        if (!g2.E()) {
            f.g(TAG, "[isBusinessAlertDialogAvailable]return false because enableHmsBusinessNotificationDialog is false");
            return "enableHmsBusinessNotificationDialog is false";
        }
        if (z) {
            LocalSettings localSettings = (LocalSettings) h.b(context, LocalSettings.class);
            if (localSettings.p0() == 0) {
                f.m(TAG, "[isBusinessAlertDialogAvailable]return false  because lastHwDialogShowTime is 0");
                localSettings.C0(System.currentTimeMillis());
                return "lastHwDialogShowTime is 0";
            }
            if (System.currentTimeMillis() - localSettings.p0() < g2.n()) {
                f.m(TAG, "[isBusinessAlertDialogAvailable]return false because frequency control");
                return "frequency control";
            }
        }
        f.g(TAG, "[isBusinessAlertDialogAvailable]return true");
        return PushClient.DEFAULT_REQUEST_ID;
    }

    @Override // com.bytedance.push.third.c
    public boolean isPushAvailable(Context context, int i) {
        com.ss.android.message.e.e().f(new a(this, context), 0L);
        f.g(TAG, "isHMSAvailableCode = " + HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(context));
        return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(context) == 0;
    }

    @Override // com.bytedance.push.third.b
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 61520 || i == 61521) {
            f.g(TAG, "on request hw notification permission result,resultCode is " + i2);
            onUserClickResult(i2 == -1, i == 61521 ? 1 : 0, i, this.mRequestResultCallback);
        }
    }

    @Override // com.bytedance.push.third.c
    public void registerPush(Context context, int i) {
        if (context == null || i != getHwPush()) {
            C.y().a(i, 101, "0", context == null ? "context is null" : "register channel error");
            return;
        }
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        if (f.d()) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.c(TAG, "registerHWPush");
        }
        com.bytedance.common.push.d.b(new com.huawei.a(context, 0));
    }

    @Override // com.bytedance.push.third.b
    public boolean requestNotificationPermission(String str, int i, int i2, AlertRequestParam alertRequestParam, i iVar) {
        Activity h = com.bytedance.common.push.b.e().h();
        if (h == null) {
            f.e(TAG, "can't requestNotificationPermission on hw device because topActivity is null");
            onGuideRequestResult(str, i, "hms", false, "topActivity is null,app is not in the foreground!", i2, iVar);
            return false;
        }
        if (this.hasShown) {
            f.e(TAG, "can't requestNotificationPermission because cur has showing");
            onGuideRequestResult(str, i, "hms", false, "cur has showing", i2, iVar);
            return false;
        }
        this.hasShown = true;
        this.hasCallbackShowResult = false;
        this.hasCallbackClickResult = false;
        this.dialogRequestPushType = i;
        this.mAlertRequestParam = alertRequestParam;
        requestNotificationPermissionInternal(str, i, h, iVar, i2, iVar);
        return true;
    }

    public boolean requestRemoveVoipNotification(Context context, int i) {
        return false;
    }

    @Override // com.bytedance.push.third.c
    public void setAlias(Context context, String str, int i) {
        if (context == null || i != getHwPush()) {
            return;
        }
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        if (f.d()) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.c(TAG, "setAlias");
        }
    }

    @Override // com.bytedance.push.third.b
    public boolean setProfileId(Context context, String str) {
        String localizedMessage;
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            int i2 = 2;
            String str2 = null;
            if (!TextUtils.isEmpty(str)) {
                if (HmsProfile.getInstance(context).isSupportProfile()) {
                    f.g(TAG, "cur device support profile id,set profile id,profileId is " + str);
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    com.huawei.d.a.f[] fVarArr = {null};
                    HmsProfile.getInstance(context).addProfile(2, str).a(new c(this, fVarArr, countDownLatch));
                    try {
                        countDownLatch.await(com.heytap.mcssdk.constant.a.q, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                    com.huawei.d.a.f fVar = fVarArr[0];
                    f.g(TAG, "finished add profile id,task is :" + fVar);
                    if (fVar != null) {
                        f.g(TAG, "finished add profile id,success:" + fVar.f());
                        if (fVar.f()) {
                            i2 = 1;
                        } else {
                            f.g(TAG, "error msg is :" + fVar.d().getLocalizedMessage());
                            str2 = fVar.d().getLocalizedMessage();
                            i2 = 6;
                        }
                    } else {
                        i2 = 4;
                    }
                } else {
                    f.g(TAG, "cur device not support profile id set,can't set profile id");
                    i2 = 3;
                }
            }
            i = i2;
            localizedMessage = str2;
        } catch (Throwable th) {
            th.printStackTrace();
            f.e(TAG, "error when trySetProfileId:" + th.getLocalizedMessage());
            localizedMessage = th.getLocalizedMessage();
            i = 5;
        }
        onSetProfileIdResult(getHwPush(), currentTimeMillis, i, localizedMessage);
        return i == 1;
    }

    @Override // com.bytedance.push.third.c
    public void trackPush(Context context, int i, Object obj) {
    }

    @Override // com.bytedance.push.third.c
    public void unregisterPush(Context context, int i) {
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        if (f.d()) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.c(TAG, "unregisterPush");
        }
        if (com.bytedance.common.utility.b.a()) {
            try {
                Objects.requireNonNull((H) C.B());
                if (TextUtils.isEmpty(com.bytedance.push.d0.b.b(context, i))) {
                    return;
                }
                HmsInstanceId.getInstance(context).deleteToken(Util.getAppId(context), HmsMessaging.DEFAULT_TOKEN_SCOPE);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
