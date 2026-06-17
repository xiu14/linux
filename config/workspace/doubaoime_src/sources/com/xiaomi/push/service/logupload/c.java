package com.xiaomi.push.service.logupload;

import android.content.Context;

/* loaded from: classes2.dex */
public class c {
    public static boolean a(Context context, int i) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("MarketCallerVerifier", "context is invalid when varifying market package.");
            return false;
        }
        try {
            String nameForUid = context.getPackageManager().getNameForUid(i);
            if (nameForUid == null) {
                com.xiaomi.channel.commonutils.logger.c.m16a("MarketCallerVerifier", "caller package is null for uid when upload log: " + i);
                return false;
            }
            if ("com.xiaomi.market".equals(nameForUid)) {
                return true;
            }
            com.xiaomi.channel.commonutils.logger.c.m16a("MarketCallerVerifier", "caller is not market when upload log: " + nameForUid);
            return false;
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("market package name verify failed: ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.c("MarketCallerVerifier", M.toString());
            return false;
        }
    }
}
