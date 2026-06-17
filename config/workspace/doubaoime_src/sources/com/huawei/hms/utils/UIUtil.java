package com.huawei.hms.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import android.widget.Button;
import com.heytap.mcssdk.utils.d;
import com.huawei.hms.support.common.ActivityMgr;
import com.huawei.hms.support.log.HMSLog;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes2.dex */
public class UIUtil {

    class a implements DialogInterface.OnShowListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            if (dialogInterface instanceof AlertDialog) {
                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                UIUtil.b(alertDialog, -2, false);
                UIUtil.b(alertDialog, -3, false);
                UIUtil.b(alertDialog, -1, true);
                return;
            }
            HMSLog.e("UIUtil", "In enableFocusedForButtonsInTV, DialogInterface is invalid, dialog = " + dialogInterface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(AlertDialog alertDialog, int i, boolean z) {
        Button button = alertDialog.getButton(i);
        if (button == null) {
            HMSLog.e("UIUtil", "In enableFocused, button is null.");
            return;
        }
        button.setFocusable(true);
        button.setFocusableInTouchMode(true);
        if (z) {
            button.requestFocus();
        }
    }

    public static <T extends Dialog> T enableFocusedForButtonsInTV(T t) {
        t.setCanceledOnTouchOutside(false);
        if (!isTVDevice()) {
            return t;
        }
        if (t instanceof AlertDialog) {
            t.setOnShowListener(new a());
            return t;
        }
        HMSLog.e("UIUtil", "In enableFocusedForButtonsInTV, dialog is invalid, dialog = " + t);
        return t;
    }

    public static Activity getActiveActivity(Activity activity, Context context) {
        if (isBackground(context)) {
            StringBuilder M = e.a.a.a.a.M("isBackground");
            M.append(isBackground(context));
            HMSLog.i("UIUtil", M.toString());
            return null;
        }
        if (activity == null) {
            HMSLog.i("UIUtil", "activity is null");
            return ActivityMgr.INST.getCurrentActivity();
        }
        if (!activity.isFinishing()) {
            return activity;
        }
        StringBuilder M2 = e.a.a.a.a.M("activity isFinishing is ");
        M2.append(activity.isFinishing());
        HMSLog.i("UIUtil", M2.toString());
        return ActivityMgr.INST.getCurrentActivity();
    }

    public static int getDialogThemeId(Activity activity) {
        if (a(activity) != 0) {
            return 0;
        }
        return (activity == null || activity.getResources() == null || activity.getResources().getConfiguration() == null || (activity.getResources().getConfiguration().uiMode & 48) != 32) ? 3 : 2;
    }

    public static String getProcessName(Context context, int i) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context != null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == i) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return "";
    }

    public static String getSystemProperties(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod(MonitorConstants.CONNECT_TYPE_GET, String.class, String.class).invoke(cls, str, str2);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.e("UIUtil", "An exception occurred while reading: getSystemProperties:" + str);
            return str2;
        }
    }

    public static boolean isActivityFullscreen(Activity activity) {
        if (activity != null) {
            return (activity.getWindow().getAttributes().flags & 1024) == 1024;
        }
        HMSLog.w("UIUtil", "activity is null");
        return false;
    }

    public static boolean isBackground(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return true;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return true;
        }
        String processName = getProcessName(context, Process.myPid());
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (TextUtils.equals(runningAppProcessInfo.processName, processName)) {
                StringBuilder M = e.a.a.a.a.M("appProcess.importance is ");
                M.append(runningAppProcessInfo.importance);
                HMSLog.i("UIUtil", M.toString());
                boolean z = runningAppProcessInfo.importance == 100;
                boolean isKeyguardLocked = keyguardManager.isKeyguardLocked();
                HMSLog.i("UIUtil", "isForground is " + z + "***  isLockedState is " + isKeyguardLocked);
                return !z || isKeyguardLocked;
            }
        }
        return true;
    }

    public static boolean isTVDevice() {
        return getSystemProperties(d.f6924d, DownloadSettingKeys.BugFix.DEFAULT).equalsIgnoreCase("tv");
    }

    public static Intent modifyIntentBehaviorsSafe(Intent intent) {
        if (intent == null) {
            return null;
        }
        String action = intent.getAction();
        if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action) || "android.media.action.IMAGE_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action) || "android.media.action.VIDEO_CAPTURE".equals(action)) {
            intent.setAction("android.intent.action.VIEW");
        }
        intent.setFlags(intent.getFlags() & (-129) & (-65) & (-2) & (-3));
        return intent;
    }

    private static int a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }
}
