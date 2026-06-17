package com.bytedance.apm.util;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

/* loaded from: classes.dex */
public class p {
    private static volatile int a = -1;

    public static long a(@NonNull Context context, long j, long j2, int i) {
        NetworkStatsManager networkStatsManager;
        long j3 = 0;
        if (!(Build.VERSION.SDK_INT < 28 && ContextCompat.checkSelfPermission(com.bytedance.apm.g.h(), "android.permission.READ_PHONE_STATE") == 0) || (networkStatsManager = (NetworkStatsManager) context.getApplicationContext().getSystemService("netstats")) == null) {
            return 0L;
        }
        NetworkStats networkStats = null;
        NetworkStats.Bucket bucket = new NetworkStats.Bucket();
        try {
            networkStats = networkStatsManager.querySummary(i, null, j, j2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        long j4 = 0;
        while (networkStats != null && networkStats.hasNextBucket()) {
            networkStats.getNextBucket(bucket);
            int uid = bucket.getUid();
            if (a == -1) {
                try {
                    PackageInfo packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 128);
                    if (packageInfo != null) {
                        a = packageInfo.applicationInfo.uid;
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    e3.printStackTrace();
                }
            }
            if (a == uid) {
                long rxBytes = bucket.getRxBytes() + j3;
                j4 = bucket.getTxBytes() + j4;
                j3 = rxBytes;
            }
        }
        if (networkStats != null) {
            networkStats.close();
        }
        return j3 + j4;
    }
}
