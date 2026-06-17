package com.bytedance.crash.L;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.C0653h;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    private static long a = -1;
    private static ActivityManager.ProcessErrorStateInfo b;

    public static String a(Context context, int i) {
        ActivityManager.ProcessErrorStateInfo next;
        if (SystemClock.uptimeMillis() - a < com.heytap.mcssdk.constant.a.r) {
            System.out.println("get_anr_info_is_time_out");
            return null;
        }
        int i2 = 0;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                loop0: while (i2 < i) {
                    List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                    if (processesInErrorState != null) {
                        Iterator<ActivityManager.ProcessErrorStateInfo> it2 = processesInErrorState.iterator();
                        while (it2.hasNext()) {
                            next = it2.next();
                            if (next.condition == 2) {
                                break loop0;
                            }
                        }
                    }
                    i2++;
                    if (i == i2) {
                        break;
                    }
                    SystemClock.sleep(600L);
                }
                System.out.println("get_anr_info_times_out");
            }
            next = null;
            if (next != null && Process.myPid() == next.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = b;
                if (processErrorStateInfo != null && g.j(processErrorStateInfo, next)) {
                    a = SystemClock.uptimeMillis();
                    return null;
                }
                b = next;
                a = SystemClock.uptimeMillis();
                return g.e(next);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT < 34 || !C0653h.a()) {
            return c();
        }
        int i = 0;
        while (i < 100) {
            i++;
            if (c()) {
                return true;
            }
            Thread.sleep(20L);
        }
        return false;
    }

    private static boolean c() {
        boolean z;
        boolean z2;
        ActivityManager activityManager = (ActivityManager) C0652g.d().getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo != null && runningAppProcessInfo.pid == myPid) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return false;
        }
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
        if (processesInErrorState != null) {
            Iterator<ActivityManager.ProcessErrorStateInfo> it2 = processesInErrorState.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ActivityManager.ProcessErrorStateInfo next = it2.next();
                if (next != null && next.pid == myPid) {
                    if (next.condition == 1) {
                        z2 = true;
                    }
                }
            }
        }
        z2 = false;
        return !z2;
    }
}
