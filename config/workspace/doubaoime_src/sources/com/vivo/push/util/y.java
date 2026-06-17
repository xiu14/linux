package com.vivo.push.util;

/* loaded from: classes2.dex */
public final class y {
    public static int a(com.vivo.push.b.c cVar) {
        ad c2 = ad.c();
        int b = cVar.b();
        long currentTimeMillis = System.currentTimeMillis();
        int b2 = c2.b("com.vivo.push_preferences.operate." + b + "OPERATE_COUNT", 0);
        long b3 = currentTimeMillis - c2.b("com.vivo.push_preferences.operate." + b + "START_TIME", 0L);
        if (b3 > com.heytap.mcssdk.constant.a.f6888f || b3 < 0) {
            c2.a("com.vivo.push_preferences.operate." + b + "START_TIME", System.currentTimeMillis());
            c2.a("com.vivo.push_preferences.operate." + b + "OPERATE_COUNT", 1);
        } else {
            if (b2 >= cVar.e()) {
                return 1001;
            }
            c2.a("com.vivo.push_preferences.operate." + b + "OPERATE_COUNT", b2 + 1);
        }
        return 0;
    }
}
