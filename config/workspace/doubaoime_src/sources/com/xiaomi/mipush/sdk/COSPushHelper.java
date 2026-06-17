package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public class COSPushHelper {
    private static long a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static volatile boolean f26a = false;

    public static void convertMessage(Intent intent) {
        f.a(intent);
    }

    public static void doInNetworkChange(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (getNeedRegister()) {
            long j = a;
            if (j <= 0 || j + 300000 <= elapsedRealtime) {
                a = elapsedRealtime;
                registerCOSAssemblePush(context);
            }
        }
    }

    public static boolean getNeedRegister() {
        return f26a;
    }

    public static boolean hasNetwork(Context context) {
        return f.m64a(context);
    }

    public static void onNotificationMessageCome(Context context, String str) {
    }

    public static void onPassThoughMessageCome(Context context, String str) {
    }

    public static void registerCOSAssemblePush(Context context) {
        AbstractPushManager a2 = e.a(context).a(d.ASSEMBLE_PUSH_COS);
        if (a2 != null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("ASSEMBLE_PUSH :  register cos when network change!");
            a2.register();
        }
    }

    public static synchronized void setNeedRegister(boolean z) {
        synchronized (COSPushHelper.class) {
            f26a = z;
        }
    }

    public static void uploadToken(Context context, String str) {
        f.m63a(context, d.ASSEMBLE_PUSH_COS, str);
    }
}
