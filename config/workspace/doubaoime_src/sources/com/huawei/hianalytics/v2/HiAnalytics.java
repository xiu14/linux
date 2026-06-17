package com.huawei.hianalytics.v2;

import android.content.Context;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.process.b;
import com.huawei.hianalytics.util.i;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public abstract class HiAnalytics {
    private static HiAnalyticsInstance a;

    private static synchronized HiAnalyticsInstance a() {
        HiAnalyticsInstance hiAnalyticsInstance;
        synchronized (HiAnalytics.class) {
            if (a == null) {
                a = HiAnalyticsManager.getInstanceByTag("_default_config_tag");
            }
            hiAnalyticsInstance = a;
        }
        return hiAnalyticsInstance;
    }

    public static void clearCachedData() {
        HiAnalyticsManager.clearCachedData();
    }

    public static boolean getInitFlag() {
        return HiAnalyticsManager.getInitFlag("_default_config_tag");
    }

    public static void handleV1Cache() {
        if (i.a().b()) {
            b.a().a("_default_config_tag");
        }
    }

    public static void newInstanceUUID() {
        if (a() != null) {
            a.newInstanceUUID();
        }
    }

    public static void onBackground(long j) {
        if (a() != null) {
            a.onBackground(j);
        }
    }

    public static void onEvent(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !i.a().b()) {
            return;
        }
        a.onEvent(i, str, linkedHashMap);
    }

    @Deprecated
    public static void onEvent(Context context, String str, String str2) {
        if (a() == null || !i.a().b()) {
            return;
        }
        a.onEvent(context, str, str2);
    }

    public static void onEvent(String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !i.a().b()) {
            return;
        }
        a.onEvent(0, str, linkedHashMap);
    }

    public static void onForeground(long j) {
        if (a() != null) {
            a.onForeground(j);
        }
    }

    public static void onPause(Context context) {
        if (a() == null || !i.a().b()) {
            return;
        }
        a.onPause(context);
    }

    public static void onPause(Context context, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !i.a().b()) {
            return;
        }
        a.onPause(context, linkedHashMap);
    }

    public static void onPause(String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !i.a().b()) {
            return;
        }
        a.onPause(str, linkedHashMap);
    }

    public static void onReport() {
        if (a() == null || !i.a().b()) {
            return;
        }
        a.onReport(-1);
    }

    @Deprecated
    public static void onReport(Context context) {
        if (a() == null || !i.a().b()) {
            return;
        }
        a.onReport(context, -1);
    }

    public static void onResume(Context context) {
        if (a() == null || !i.a().b()) {
            return;
        }
        a.onResume(context);
    }

    public static void onResume(Context context, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !i.a().b()) {
            return;
        }
        a.onResume(context, linkedHashMap);
    }

    public static void onResume(String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !i.a().b()) {
            return;
        }
        a.onResume(str, linkedHashMap);
    }

    public static void onStreamEvent(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !i.a().b()) {
            return;
        }
        a.onStreamEvent(i, str, linkedHashMap);
    }

    public static void setIsOaidTracking(boolean z) {
        if (a() != null) {
            a.setOAIDTrackingFlag(1, z);
            a.setOAIDTrackingFlag(0, z);
            a.setOAIDTrackingFlag(3, z);
            a.setOAIDTrackingFlag(2, z);
        }
    }

    public static void setOAID(String str) {
        if (a() != null) {
            a.setOAID(1, str);
            a.setOAID(0, str);
            a.setOAID(3, str);
            a.setOAID(2, str);
        }
    }

    public static void setUPID(String str) {
        if (a() != null) {
            a.setUpid(1, str);
            a.setUpid(0, str);
            a.setUpid(3, str);
            a.setUpid(2, str);
        }
    }
}
