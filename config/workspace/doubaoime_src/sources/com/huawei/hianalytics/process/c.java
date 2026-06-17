package com.huawei.hianalytics.process;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hianalytics.global.AutoCollectEventType;
import com.huawei.hianalytics.util.e;
import com.huawei.hianalytics.util.g;
import com.huawei.hianalytics.util.i;
import java.util.List;

/* loaded from: classes2.dex */
public class c extends d implements HiAnalyticsInstanceEx {

    /* renamed from: c, reason: collision with root package name */
    private Context f7170c;

    c(Context context) {
        super("_instance_ex_tag");
        this.f7170c = context;
    }

    public void a(List<AutoCollectEventType> list) {
        com.huawei.hianalytics.g.b.b("HianalyticsSDK", "autoCollect() is executed.");
        if (!i.a().b()) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "userManager.isUserUnlocked() == false");
            return;
        }
        if (list == null) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "autoCollect() eventTypes is null,End this method!");
            return;
        }
        com.huawei.hianalytics.g.b.b("HianalyticsSDK", "autoCollect() executed.");
        if (list.contains(AutoCollectEventType.APP_FIRST_RUN)) {
            SharedPreferences a = e.a(this.f7170c, "global_v2");
            boolean booleanValue = ((Boolean) e.b(a, "isFirstRun", Boolean.FALSE)).booleanValue();
            if (!booleanValue) {
                e.a(a, "isFirstRun", Boolean.TRUE);
            }
            if (!booleanValue) {
                com.huawei.hianalytics.g.b.b("HianalyticsSDK", "autoCollect: APP_FIRST_RUN");
                b.a().b();
            }
        }
        String g2 = com.huawei.hianalytics.a.b.g();
        String b = com.huawei.hianalytics.a.b.b();
        if (list.contains(AutoCollectEventType.APP_UPGRADE)) {
            if ((TextUtils.isEmpty(b) || g2.equals(b)) ? false : true) {
                com.huawei.hianalytics.g.b.b("HianalyticsSDK", "autoCollect: APP_UPGRADE");
                b.a().b(g2, b);
            }
        }
        if (list.contains(AutoCollectEventType.APP_CRASH)) {
            com.huawei.hianalytics.g.b.b("HianalyticsSDK", "autoCollect: APP_CRUSH : true");
            b.a().a(true);
        } else {
            com.huawei.hianalytics.g.b.b("HianalyticsSDK", "autoCollect: APP_CRUSH : false");
            b.a().a(false);
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstanceEx
    public void enableLogCollection(Context context, HiAnalyticsLogConfig hiAnalyticsLogConfig) {
        com.huawei.hianalytics.g.b.b("HianalyticsSDK", "enableLogCollection() is executed.");
        if (context != null) {
            a.b().a(context.getApplicationContext(), hiAnalyticsLogConfig);
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstanceEx
    @Deprecated
    public void handleV1Cache() {
        if (!i.a().b()) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "userManager.isUserUnlocked() == false");
        } else {
            com.huawei.hianalytics.g.b.b("HianalyticsSDK", "handleV1Cache() is executed.");
            b.a().a("_instance_ex_tag");
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstanceEx
    public void onStartApp(String str, String str2) {
        com.huawei.hianalytics.g.b.b("HianalyticsSDK", "onStartApp() is executed.");
        if (!i.a().b()) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "userManager.isUserUnlocked() == false");
        } else if (g.a("startType", str, 4096) && g.a("startCMD", str2, 4096)) {
            b.a().a(str, str2);
        } else {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "onStartApp() Parameter error, please enter the correct parameter");
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstanceEx
    public void refreshLogCollection(HiAnalyticsLogConfig hiAnalyticsLogConfig, boolean z) {
        com.huawei.hianalytics.g.b.b("HianalyticsSDK", "refreshLogCollection() is executed.");
        a.b().a(hiAnalyticsLogConfig, z);
    }
}
