package com.xiaomi.push;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public class dp {
    private static Cdo a;

    public static File a(Context context) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.c.d("ERROR: Context cannot be null.");
            return null;
        }
        Cdo cdo = a;
        if (cdo != null) {
            return cdo.a(context);
        }
        com.xiaomi.channel.commonutils.logger.c.d("ERROR: XMSF not configure the instance of LogAgent.");
        return null;
    }
}
