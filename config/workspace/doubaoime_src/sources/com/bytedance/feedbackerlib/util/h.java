package com.bytedance.feedbackerlib.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {
    @Nullable
    public static String a(@NonNull Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == Process.myPid()) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public static synchronized void b(Context context, String str, String str2, String str3) {
        synchronized (h.class) {
            k.c(new j());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("device_id", str3);
                jSONObject.putOpt("host_aid", str);
                jSONObject.putOpt("channel", str2);
                if (context != null) {
                    jSONObject.putOpt(Constants.PACKAGE_NAME, context.getPackageName());
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    PackageInfo packageInfo = null;
                    try {
                        packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                    } catch (Throwable unused) {
                    }
                    if (packageInfo != null) {
                        jSONObject.putOpt("base_version_code", Integer.valueOf(packageInfo.versionCode));
                        jSONObject.putOpt("app_version", packageInfo.versionName);
                        jSONObject.putOpt("update_version_code", Integer.valueOf(packageInfo.versionCode));
                        jSONObject.putOpt("sdk_version", packageInfo.versionName);
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://mon.snssdk.com/monitor/appmonitor/v2/settings");
            SDKMonitorUtils.c(String.valueOf(1925L), arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("https://mon.snssdk.com/monitor/collect/");
            SDKMonitorUtils.d(String.valueOf(1925L), arrayList2);
            SDKMonitorUtils.b(context, String.valueOf(1925L), jSONObject, new i());
        }
    }
}
