package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public class FTOSPushHelper {
    private static long a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static volatile boolean f27a = false;

    private static void a(Context context) {
        AbstractPushManager a2 = e.a(context).a(d.ASSEMBLE_PUSH_FTOS);
        if (a2 != null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("ASSEMBLE_PUSH :  register fun touch os when network change!");
            a2.register();
        }
    }

    public static void doInNetworkChange(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (getNeedRegister()) {
            long j = a;
            if (j <= 0 || j + 300000 <= elapsedRealtime) {
                a = elapsedRealtime;
                a(context);
            }
        }
    }

    public static boolean getNeedRegister() {
        return f27a;
    }

    public static boolean hasNetwork(Context context) {
        return f.m64a(context);
    }

    public static void notifyFTOSNotificationClicked(Context context, Map<String, String> map) {
        PushMessageReceiver a2;
        if (map == null || !map.containsKey("pushMsg")) {
            return;
        }
        String str = map.get("pushMsg");
        if (TextUtils.isEmpty(str) || (a2 = f.a(context)) == null) {
            return;
        }
        MiPushMessage a3 = f.a(str);
        if (a3.getExtra().containsKey("notify_effect")) {
            return;
        }
        a2.onNotificationMessageClicked(context, a3);
    }

    public static void setNeedRegister(boolean z) {
        f27a = z;
    }

    public static void uploadToken(Context context, String str) {
        f.m63a(context, d.ASSEMBLE_PUSH_FTOS, str);
    }
}
