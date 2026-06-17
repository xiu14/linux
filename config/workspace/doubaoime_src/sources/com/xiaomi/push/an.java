package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes2.dex */
class an {
    private static volatile boolean a = false;

    private static void a(Class<?> cls, Context context) {
        if (a) {
            return;
        }
        try {
            a = true;
            cls.getDeclaredMethod("InitEntry", Context.class).invoke(cls, context);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.m15a("mdid:load lib error " + th);
        }
    }

    public static boolean a(Context context) {
        try {
            Class<?> a2 = t.a(context, "com.bun.miitmdid.core.JLibrary");
            if (a2 == null) {
                return false;
            }
            a(a2, context);
            return true;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.m15a("mdid:check error " + th);
            return false;
        }
    }
}
