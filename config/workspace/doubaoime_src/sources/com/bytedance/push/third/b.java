package com.bytedance.push.third;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.permission.boot.AlertRequestParam;
import com.bytedance.common.push.e.i;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class b {
    public static final int REQUEST_CODE_REQUEST_NOTIFICATION_PERMISSION_BY_CUSTOM_DIALOG = 61521;
    public static final int REQUEST_CODE_REQUEST_NOTIFICATION_PERMISSION_BY_SYS_DIALOG = 61520;
    public static final int SYS_ALERT_STYLE_CUSTOM = 1;
    public static final int SYS_ALERT_STYLE_ORIGIN = 0;
    protected AlertRequestParam mAlertRequestParam;
    protected String mCurScenes;
    protected i mRequestResultCallback;
    public final int PROFILE_STATUS_UNKNOWN = -1;
    public final int PROFILE_STATUS_SETTINGS_NOT_ENABLE = 0;
    public final int PROFILE_STATUS_SUCCESS = 1;
    public final int PROFILE_STATUS_PROFILE_ID_IS_EMPTY = 2;
    public final int PROFILE_STATUS_NOT_SUPPORT = 3;
    public final int PROFILE_STATUS_TIMEOUT = 4;
    public final int PROFILE_STATUS_EXCEPTION = 5;
    public final int PROFILE_STATUS_SYS_FAILED = 6;
    public final long PROFILE_ID_OPERATE_TIMEOUT = com.heytap.mcssdk.constant.a.q;
    protected boolean hasCallbackShowResult = false;
    protected boolean hasCallbackClickResult = false;

    class a implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f5873c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f5874d;

        a(b bVar, int i, int i2, long j, String str) {
            this.a = i;
            this.b = i2;
            this.f5873c = j;
            this.f5874d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PushServiceManager.get().getPushExternalService().getPushSdkMonitorService().onProfileIdOperateResult(1, this.a, this.b, this.f5873c, this.f5874d);
        }
    }

    /* renamed from: com.bytedance.push.third.b$b, reason: collision with other inner class name */
    class RunnableC0306b implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f5875c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f5876d;

        RunnableC0306b(b bVar, int i, int i2, long j, String str) {
            this.a = i;
            this.b = i2;
            this.f5875c = j;
            this.f5876d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PushServiceManager.get().getPushExternalService().getPushSdkMonitorService().onProfileIdOperateResult(2, this.a, this.b, this.f5875c, this.f5876d);
        }
    }

    public boolean deleteProfileId(Context context, String str) {
        com.bytedance.push.g0.f.c(getClass().getName(), "[deleteProfileId]default implement");
        return false;
    }

    public abstract int getPushType();

    public abstract String isBusinessAlertDialogAvailable(Context context, boolean z);

    public boolean isSupportCallKit() {
        com.bytedance.push.g0.f.g(getClass().getName(), "[isSupportCallKit]default return false");
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        com.bytedance.push.g0.f.c(getClass().getName(), "[onActivityResult]default implement");
    }

    protected synchronized void onClickResult(String str, int i, String str2, boolean z, String str3, int i2, JSONObject jSONObject, i iVar) {
        com.bytedance.push.g0.f.g(getClass().getName(), "[onClickResult]hasCallbackClickResult:" + this.hasCallbackClickResult);
        if (this.hasCallbackClickResult) {
            return;
        }
        this.hasCallbackClickResult = true;
        if (i2 == 0) {
            PushServiceManager.get().getIPermissionBootExternalService().onNotificationPermissionDialogClickResult(str, str2, i, i2, z, str3, com.ss.android.message.f.a.d(com.ss.android.message.a.a()), jSONObject);
            PushServiceManager.get().getIPermissionBootExternalService().dismissPermissionRequestTipsBanner();
        }
        if (iVar != null) {
            if (z) {
                iVar.onUserAgree(true);
            } else {
                iVar.onUserReject();
            }
        }
    }

    public void onDeleteProfileIdResult(int i, long j, int i2, String str) {
        com.bytedance.common.push.d.b(new RunnableC0306b(this, i, i2, System.currentTimeMillis() - j, str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void onGuideRequestResult(String str, int i, String str2, boolean z, String str3, i iVar) {
        onGuideRequestResult(str, i, str2, z, str3, 0, iVar);
    }

    public void onSetProfileIdResult(int i, long j, int i2, String str) {
        com.bytedance.common.push.d.b(new a(this, i, i2, System.currentTimeMillis() - j, str));
    }

    public boolean requestNotificationPermission(String str, int i, int i2, AlertRequestParam alertRequestParam, i iVar) {
        com.bytedance.push.g0.f.c(getClass().getName(), "[requestNotificationPermission]default implement");
        return false;
    }

    public boolean requestOpNotificationPermission(int i) {
        com.bytedance.push.g0.f.c(getClass().getName(), "[requestOpNotificationPermission]default implement");
        return false;
    }

    public boolean setProfileId(Context context, String str) {
        com.bytedance.push.g0.f.c(getClass().getName(), "[setProfileId]default implement");
        return false;
    }

    protected synchronized void onGuideRequestResult(String str, int i, String str2, boolean z, String str3, int i2, i iVar) {
        com.bytedance.push.g0.f.c(getClass().getName(), "[onGuideRequestResult]hasCallbackShowResult:" + this.hasCallbackShowResult);
        if (this.hasCallbackShowResult) {
            return;
        }
        this.hasCallbackShowResult = true;
        if (i2 == 0) {
            int i3 = -1;
            if (this.mAlertRequestParam != null && z) {
                i3 = PushServiceManager.get().getIPermissionBootExternalService().showPermissionRequestTipsBanner(com.bytedance.common.push.b.e().h(), this.mAlertRequestParam);
            }
            int i4 = i3;
            if (!this.hasCallbackClickResult) {
                PushServiceManager.get().getIPermissionBootExternalService().onNotificationPermissionDialogRequestResultEvent(str, str2, i2, i, i4, z, str3);
            }
        }
        if (iVar != null) {
            iVar.onRequestResult(z, str3);
        }
    }
}
