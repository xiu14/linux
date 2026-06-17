package com.bytedance.crash.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.crash.C0652g;

/* loaded from: classes.dex */
public final class d {
    private static final String[] a = {"unknown", "wifi", "mobile", "2g", "3g", "4g", "5g"};

    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a() {
        /*
            r0 = 0
            android.content.Context r1 = com.bytedance.crash.C0652g.g()     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L8
            goto L43
        L8:
            java.lang.String r2 = "connectivity"
            java.lang.Object r2 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L43
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Throwable -> L43
            if (r2 != 0) goto L13
            goto L43
        L13:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L43
            boolean r3 = r2.isAvailable()     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L20
            goto L43
        L20:
            int r2 = r2.getType()     // Catch: java.lang.Throwable -> L43
            r3 = 1
            if (r3 != r2) goto L28
            goto L44
        L28:
            r3 = 2
            if (r2 != 0) goto L44
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L43
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L43
            int r1 = r1.getNetworkType()     // Catch: java.lang.Throwable -> L43
            switch(r1) {
                case 2: goto L41;
                case 3: goto L3f;
                case 4: goto L3a;
                case 5: goto L3f;
                case 6: goto L3f;
                case 7: goto L3a;
                case 8: goto L3f;
                case 9: goto L3f;
                case 10: goto L3f;
                case 11: goto L3a;
                case 12: goto L3f;
                case 13: goto L3d;
                case 14: goto L3f;
                case 15: goto L3f;
                case 16: goto L3a;
                case 17: goto L3a;
                case 18: goto L3a;
                case 19: goto L3a;
                case 20: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L44
        L3b:
            r3 = 6
            goto L44
        L3d:
            r3 = 5
            goto L44
        L3f:
            r3 = 4
            goto L44
        L41:
            r3 = 3
            goto L44
        L43:
            r3 = r0
        L44:
            r1 = 7
            if (r3 < r1) goto L48
            goto L49
        L48:
            r0 = r3
        L49:
            java.lang.String[] r1 = com.bytedance.crash.util.d.a
            r0 = r1[r0]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.d.a():java.lang.String");
    }

    public static boolean b() {
        NetworkInfo activeNetworkInfo;
        Context g2 = C0652g.g();
        if (g2 == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) g2.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isAvailable();
        } catch (Exception e2) {
            com.bytedance.crash.Q.b.e("NPTH_CATCH_NEW", e2);
        }
        return false;
    }
}
