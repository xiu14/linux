package com.xiaomi.push;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.vivo.push.PushClientConstants;

/* loaded from: classes2.dex */
public class s {
    private static int a;

    /* renamed from: a, reason: collision with other field name */
    private static long f935a;

    public static int a(Context context) {
        Bundle bundle;
        if (context != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - f935a) > com.heytap.mcssdk.constant.a.f6888f) {
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(PushClientConstants.COM_ANDROID_SYSTEMUI, 128);
                    if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                        a = bundle.getInt("SupportForPushVersionCode");
                        f935a = currentTimeMillis;
                    }
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.c.d("exception occurred in getting systemui support version, exception: " + th);
                }
            }
        }
        return a;
    }

    public static boolean b(Context context) {
        return a(context) >= 3;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m668a(Context context) {
        return a(context) >= 2;
    }
}
