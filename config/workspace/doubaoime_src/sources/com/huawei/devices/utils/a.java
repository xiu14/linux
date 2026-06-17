package com.huawei.devices.utils;

import android.content.Context;
import android.util.Log;
import com.huawei.android.os.SystemPropertiesEx;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class a {
    private static volatile c a = null;
    private static volatile HiAnalyticsInstance b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f6990c = false;

    public static void a() {
        if (f6990c) {
            HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("VibratorServiceTag");
            if (instanceByTag == null) {
                Log.e("ReportData", "instance is null");
            } else {
                Log.i("ReportData", "VibratorServiceTag onReport");
                instanceByTag.onReport(0);
            }
        }
    }

    public static void b(Context context) {
        String str = SystemPropertiesEx.get("ro.config.hw_optb", "0");
        boolean equals = str == null ? false : str.equals("156");
        f6990c = equals;
        if (equals) {
            HiAnalyticsConfig build = new HiAnalyticsConfig.Builder().setCollectURL("https://metrics1.data.hicloud.com:6447").setEnableAndroidID(false).setEnableImei(false).setEnableSN(false).setEnableUDID(false).build();
            HiAnalyticsConfig build2 = new HiAnalyticsConfig.Builder().build();
            HiAnalyticsConfig build3 = new HiAnalyticsConfig.Builder().build();
            HiAnalyticsInstance create = new HiAnalyticsInstance.Builder(context).setOperConf(build).setMaintConf(build2).setDiffConf(build3).create("VibratorServiceTag");
            b = create;
            if (create == null) {
                b = new HiAnalyticsInstance.Builder(context).setOperConf(build).setMaintConf(build2).setDiffConf(build3).refresh("VibratorServiceTag");
            }
        }
    }

    public static void c(b bVar) {
        if (f6990c) {
            c cVar = a;
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            if (cVar != null) {
                linkedHashMap.put("package", cVar.a);
                linkedHashMap.put("service", "HapticsKit");
                linkedHashMap.put("version", "1.0.1.500");
            }
            if (bVar != null) {
                linkedHashMap.put("apiName", bVar.a);
                linkedHashMap.put(WiseOpenHianalyticsData.UNION_COSTTIME, "10");
                linkedHashMap.put("result", String.valueOf(bVar.b));
                linkedHashMap.put("type", bVar.f6991c);
            }
            HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("VibratorServiceTag");
            if (instanceByTag == null) {
                Log.e("ReportData", "instance is null");
            } else {
                Log.i("ReportData", "VibratorServiceTag EventForData");
                instanceByTag.onEvent("60000", linkedHashMap);
            }
        }
    }

    public static void d(c cVar) {
        a = cVar;
    }
}
