package com.bytedance.android.service.manager.permission.boot;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.common.push.e.i;
import com.bytedance.push.settings.x.a.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface IPermissionBootExternalService {
    BusinessCustomSysAlertDialogStatus allowBusinessCustomSysAlertDialog(Context context);

    GoogleCustomSysAlertDialogStatus allowGoogleCustomSysAlertDialog(Context context);

    void dismissPermissionRequestTipsBanner();

    a getCustomSysDialogConfig(Context context);

    void initOnApplication();

    boolean isEnableSysSettingsPageDialog(Context context);

    void onNotificationPermissionDialogClickResult(String str, String str2, int i, int i2, boolean z, String str3, int i3, JSONObject jSONObject);

    void onNotificationPermissionDialogOpen(String str, String str2, int i, int i2, String str3, JSONObject jSONObject);

    void onNotificationPermissionDialogRequestResultEvent(String str, String str2, int i, int i2, int i3, boolean z, String str3);

    boolean openSysPushSettingsPage(String str, Activity activity, ISysPermissionPageCallback iSysPermissionPageCallback);

    boolean openSysPushSettingsPage(String str, Activity activity, LottieAnimatorModel lottieAnimatorModel, ISysPermissionPageCallback iSysPermissionPageCallback);

    void reportDefaultNotificationStatus();

    boolean requestNotificationPermissionByBusinessAlert(String str, View view, boolean z, IOriginSysDialog iOriginSysDialog);

    void requestNotificationPermissionByGoogleAlert(String str, View view, boolean z, boolean z2, boolean z3, AlertRequestParam alertRequestParam, i iVar);

    void requestNotificationPermissionBySysSettingsPageAlert(String str, View view, i iVar);

    boolean sdkNeedRequestSettings();

    boolean shouldOpenSysPushSettingsByPushSdk(Context context);

    int showPermissionRequestTipsBanner(Activity activity, AlertRequestParam alertRequestParam);

    PushPermissionBootShowResult tryShowPushPermissionBoot(PermissionBootRequestParam permissionBootRequestParam);
}
