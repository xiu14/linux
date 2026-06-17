package com.bytedance.crash.Z;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.C0652g;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.util.List;

/* loaded from: classes.dex */
public final class c {
    private static volatile boolean a = false;
    private static volatile Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static List<ApplicationExitInfo> f4535c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4536d = 0;

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Nullable
    public static List<ApplicationExitInfo> b() {
        Context g2;
        ActivityManager activityManager;
        List<ApplicationExitInfo> list;
        if (!a() || (g2 = C0652g.g()) == null || (activityManager = (ActivityManager) g2.getSystemService("activity")) == null) {
            list = null;
        } else if (a) {
            list = f4535c;
        } else {
            synchronized (b) {
                if (!a) {
                    List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(g2.getPackageName(), 0, 0);
                    f4535c = historicalProcessExitReasons;
                    historicalProcessExitReasons.sort(new b());
                }
                a = true;
            }
            list = f4535c;
        }
        if (list == null) {
            return null;
        }
        return list;
    }

    static String c(long j) {
        try {
            long j2 = j / DownloadConstants.KB;
            return j2 >= 1 ? j2 <= 30 ? "[1~30MB]" : j2 <= 60 ? "(30~100MB]" : j2 <= 100 ? "(60~100MB]" : j2 <= 200 ? "(100~150MB]" : j2 <= 300 ? "(200~300MB]" : j2 <= 400 ? "(300~400MB]" : j2 <= 500 ? "(400~500MB]" : j2 <= 600 ? "(500~600MB]" : (j2 <= 600 || j2 > 700) ? j2 <= 800 ? "(700~800MB]" : j2 <= 900 ? "(800~900MB]" : j2 <= 1000 ? "(900~1000MB]" : j2 <= 1500 ? "(1GB~1.5GB]" : j2 <= 2000 ? "(1.5GB~2GB]" : j2 <= WsConstants.EXIT_DELAY_TIME ? "(2GB~3GB]" : j2 <= 4000 ? "(3GB~4GB]" : j2 <= 6000 ? "(4GB~6GB]" : j2 <= 8000 ? "(6GB~8GB]" : ">8G" : "(600~700MB]" : "<1MB";
        } catch (Throwable unused) {
            return "invalid";
        }
    }

    public static String d(int i) {
        switch (i) {
            case 1:
                return "WAIT FOR DEBUGGER";
            case 2:
                return "TOO MANY CACHED PROCS";
            case 3:
                return "TOO MANY EMPTY PROCS";
            case 4:
                return "TRIM EMPTY";
            case 5:
                return "LARGE CACHED";
            case 6:
                return "MEMORY PRESSURE";
            case 7:
                return "EXCESSIVE CPU USAGE";
            case 8:
                return "SYSTEM UPDATE_DONE";
            case 9:
                return "KILL ALL FG";
            case 10:
                return "KILL ALL BG EXCEPT";
            case 11:
                return "KILL UID";
            case 12:
                return "KILL PID";
            case 13:
                return "INVALID START";
            case 14:
                return "INVALID STATE";
            case 15:
                return "IMPERCEPTIBLE";
            case 16:
                return "REMOVE LRU";
            case 17:
                return "ISOLATED NOT NEEDED";
            case 18:
                return "CACHED IDLE FORCED APP STANDBY";
            case 19:
                return "FREEZER BINDER IOCTL";
            case 20:
                return "FREEZER BINDER TRANSACTION";
            case 21:
                return "FORCE STOP";
            case 22:
                return "REMOVE TASK";
            case 23:
                return "STOP APP";
            case 24:
                return "KILL BACKGROUND";
            case 25:
                return "PACKAGE UPDATE";
            default:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }
}
