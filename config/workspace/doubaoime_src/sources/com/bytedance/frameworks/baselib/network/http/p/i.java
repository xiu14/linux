package com.bytedance.frameworks.baselib.network.http.p;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class i {
    private static AtomicInteger a = new AtomicInteger(0);
    private static volatile String b = null;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p.i.a(android.content.Context):java.lang.String");
    }

    public static int b() {
        return a.get();
    }

    public static boolean c(Context context) {
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("TTNet ProcessFlag: ");
            M.append(a);
            Logger.d("ProcessUtils", M.toString());
        }
        int i = a.get();
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        String a2 = a(context);
        if (a2 == null || !a2.contains(Constants.COLON_SEPARATOR)) {
            return a2 != null && a2.equals(context.getPackageName());
        }
        return false;
    }

    public static void d(int i) {
        a.set(i);
    }
}
