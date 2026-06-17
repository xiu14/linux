package com.xiaomi.push;

import android.util.Log;
import com.xiaomi.push.gk;

/* loaded from: classes2.dex */
class gh {
    private static final boolean a = Log.isLoggable("BCompressed", 3);

    static byte[] a(gg ggVar, byte[] bArr) {
        try {
            byte[] a2 = gk.a.a(bArr);
            if (a) {
                com.xiaomi.channel.commonutils.logger.c.m16a("BCompressed", "decompress " + bArr.length + " to " + a2.length + " for " + ggVar);
                if (ggVar.f474a == 1) {
                    com.xiaomi.channel.commonutils.logger.c.m16a("BCompressed", "decompress not support upStream");
                }
            }
            return a2;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m16a("BCompressed", "decompress error " + e2);
            return bArr;
        }
    }
}
