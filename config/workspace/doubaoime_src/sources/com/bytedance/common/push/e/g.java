package com.bytedance.common.push.e;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.push.frontier.FrontierStrategy;
import java.lang.reflect.Method;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public abstract class g {
    private final String TAG = "IPushCommonConfiguration";

    class a implements com.bytedance.common.b.a {
        a(g gVar) {
        }

        @Override // com.bytedance.common.b.a
        public Sensor a(SensorManager sensorManager, int i) {
            com.bytedance.push.g0.f.c("IPushCommonConfiguration", "default SensorAbility#getDefaultSensor");
            return null;
        }

        @Override // com.bytedance.common.b.a
        public boolean b(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i) {
            com.bytedance.push.g0.f.c("IPushCommonConfiguration", "default SensorAbility#registerListener");
            return false;
        }

        @Override // com.bytedance.common.b.a
        public void c(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor) {
            com.bytedance.push.g0.f.c("IPushCommonConfiguration", "default SensorAbility#unregisterListener");
        }
    }

    class b implements com.bytedance.common.e.a {
        b(g gVar) {
        }
    }

    public interface c {
        void a(boolean z);
    }

    public boolean addInstrumentationListener(f fVar) {
        return false;
    }

    public boolean autoRequestNotificationPermission() {
        return true;
    }

    public boolean defaultEnableUnDuplicateMessage() {
        return false;
    }

    public boolean disableAutoStartChildProcess() {
        return false;
    }

    public boolean enableExceptionInDebugModeWhenFatalError() {
        return true;
    }

    public boolean enableInstrKa() {
        return true;
    }

    public boolean enableMonitorNotificationClick() {
        return false;
    }

    public boolean fixAssociationStartMonitorServiceAnr() {
        return true;
    }

    public com.bytedance.common.push.e.a getAccountService() {
        return new com.bytedance.common.push.f.a();
    }

    public com.bytedance.common.e.a getActualObjGetterForHandlerBeDynamicProxy() {
        return new b(this);
    }

    public int getAppIconResId() {
        return C0838R.drawable.status_icon;
    }

    public com.bytedance.common.push.e.c getEventReportListener() {
        return null;
    }

    public FrontierStrategy getFrontierMode() {
        return FrontierStrategy.STRATEGY_USE_HOST;
    }

    public com.bytedance.push.frontier.a.a getFrontierService() {
        return null;
    }

    public d getHostSysAccountConfig() {
        return null;
    }

    public e getHostWidgetService() {
        return null;
    }

    public com.bytedance.common.utility.e getNetworkClient() {
        return null;
    }

    public String getProfileId() {
        com.bytedance.common.push.e.a accountService = getAccountService();
        String str = null;
        if (accountService != null) {
            String a2 = accountService.a();
            if (!TextUtils.isEmpty(a2)) {
                if (a2 != null) {
                    try {
                        try {
                            if (a2.length() != 0) {
                                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                                messageDigest.update(a2.getBytes("UTF-8"));
                                str = e.b.a.a.a.b.a.a(messageDigest.digest());
                            }
                        } catch (Throwable th) {
                            com.bytedance.push.g0.f.f("IPushCommonConfiguration", "error when md5 sec_uid ", th);
                        }
                    } catch (Exception unused) {
                    }
                }
                com.bytedance.push.g0.f.c("IPushCommonConfiguration", "success md5 sec_uid,sec_uid:" + a2 + " profile_id:" + str);
            }
        }
        return str;
    }

    public com.bytedance.common.b.a getSensorAbility() {
        return new a(this);
    }

    public String getSessionId() {
        return "";
    }

    public com.bytedance.common.model.d getSyncConfig() {
        return null;
    }

    public boolean hasAgreedForPrivacyDialog() {
        return true;
    }

    public void invokeActivityLifeCycleMethod(Method method, Activity activity) {
    }

    public boolean isGuestMode() {
        return false;
    }

    public void onRemoteViewsServiceGetView(int i) {
    }

    public boolean optActivityThreadHandlerGetScreenState() {
        return true;
    }

    public boolean optAnr() {
        return false;
    }

    public boolean optMainProcessInitTimeCost() {
        return false;
    }

    public boolean optMainProcessInitTimeCostV2() {
        return false;
    }

    public void optNewUserUploadToken(c cVar) {
        cVar.a(false);
    }

    public boolean optUidChangeByHostInvoke() {
        return false;
    }

    public void pushIllegalNotificationInterceptAction(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(activity.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            activity.startActivity(launchIntentForPackage);
        }
        activity.finishAffinity();
    }

    public com.bytedance.push.settings.u.b pushIllegalNotificationSettings() {
        return new com.bytedance.push.settings.u.b();
    }

    public Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, 2) : context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public void requestPermissions(Activity activity, String[] strArr, int i) {
        com.bytedance.push.g0.f.m("IPushCommonConfiguration", "[requestPermissions]do nothing because host not Override cur method");
    }
}
