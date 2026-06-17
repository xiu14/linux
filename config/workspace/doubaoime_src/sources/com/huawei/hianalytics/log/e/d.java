package com.huawei.hianalytics.log.e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public class d {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String a(Context context) {
        NetworkInfo activeNetworkInfo;
        String str;
        if (context == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/logServer", "not have network state phone permission!");
            return "";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return "";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() != 0) {
            if (activeNetworkInfo.getType() != 16) {
                return "";
            }
            com.huawei.hianalytics.g.b.c("HiAnalytics/logServer", "type name = COMPANION_PROXY");
            return "COMPANION_PROXY";
        }
        String subtypeName = activeNetworkInfo.getSubtypeName();
        com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "Network getSubtypeName : " + subtypeName);
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                str = "2G";
                return str;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                str = "3G";
                return str;
            case 13:
                str = "4G";
                return str;
            default:
                if (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000")) {
                    return subtypeName;
                }
                str = "3G";
                return str;
        }
    }

    public static void a(int i, Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                com.huawei.hianalytics.g.b.c("LogStreamUtil", "closeQuietly(): Exception when closing the closeable!");
            }
        }
    }
}
