package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.xiaomi.push.bh;

/* loaded from: classes2.dex */
public class h {
    private static int a = -1;

    public static q a(Context context) {
        return m69a(context) ? q.HUAWEI : c(context) ? q.OPPO : d(context) ? q.VIVO : q.OTHER;
    }

    public static boolean b(Context context) {
        Object a2 = bh.a(bh.a("com.google.android.gms.common.GoogleApiAvailability", "getInstance", new Object[0]), "isGooglePlayServicesAvailable", context);
        Object a3 = bh.a("com.google.android.gms.common.ConnectionResult", "SUCCESS");
        if (a3 == null || !(a3 instanceof Integer)) {
            com.xiaomi.channel.commonutils.logger.c.c("google service is not avaliable");
            a = 0;
            return false;
        }
        int intValue = ((Integer) Integer.class.cast(a3)).intValue();
        if (a2 != null) {
            if (a2 instanceof Integer) {
                a = ((Integer) Integer.class.cast(a2)).intValue() == intValue ? 1 : 0;
            } else {
                a = 0;
                com.xiaomi.channel.commonutils.logger.c.c("google service is not avaliable");
            }
        }
        StringBuilder M = e.a.a.a.a.M("is google service can be used");
        M.append(a > 0);
        com.xiaomi.channel.commonutils.logger.c.c(M.toString());
        return a > 0;
    }

    public static boolean c(Context context) {
        boolean z = false;
        Object a2 = bh.a("com.xiaomi.assemble.control.COSPushManager", "isSupportPush", context);
        if (a2 != null && (a2 instanceof Boolean)) {
            z = ((Boolean) Boolean.class.cast(a2)).booleanValue();
        }
        com.xiaomi.channel.commonutils.logger.c.c("color os push  is avaliable ? :" + z);
        return z;
    }

    public static boolean d(Context context) {
        boolean z = false;
        Object a2 = bh.a("com.xiaomi.assemble.control.FTOSPushManager", "isSupportPush", context);
        if (a2 != null && (a2 instanceof Boolean)) {
            z = ((Boolean) Boolean.class.cast(a2)).booleanValue();
        }
        com.xiaomi.channel.commonutils.logger.c.c("fun touch os push  is avaliable ? :" + z);
        return z;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m69a(Context context) {
        try {
            if (context.getPackageManager().getServiceInfo(new ComponentName("com.huawei.hwid", "com.huawei.hms.core.service.HMSCoreService"), 128) != null) {
                if (a()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean a() {
        try {
            String str = (String) bh.a("android.os.SystemProperties", MonitorConstants.CONNECT_TYPE_GET, "ro.build.hw_emui_api_level", "");
            if (!TextUtils.isEmpty(str)) {
                if (Integer.parseInt(str) >= 9) {
                    return true;
                }
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
        }
        return false;
    }
}
