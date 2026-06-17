package com.bytedance.common.wschannel.channel.c.a.h;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.huawei.hms.framework.common.ContainerUtils;
import okhttp3.B;

/* loaded from: classes.dex */
public class a {
    private final Context a;
    private int b = 0;

    a(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a() {
        /*
            r6 = this;
            android.content.Context r0 = r6.a
            r1 = 1
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch: java.lang.Exception -> L19
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L19
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L19
            boolean r0 = r0.isAvailable()     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 != 0) goto L1f
            r0 = -1
            return r0
        L1f:
            int r0 = r6.b
            int r0 = r0 + r1
            r6.b = r0
            r2 = 5000(0x1388, double:2.4703E-320)
            int r0 = r1 << r0
            long r0 = (long) r0
            long r0 = r0 * r2
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            long r0 = java.lang.Math.min(r0, r2)
            double r0 = (double) r0
            double r2 = java.lang.Math.random()
            r4 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r2 = r2 * r4
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r4
            double r2 = r2 + r0
            long r0 = (long) r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.c.a.h.a.a():long");
    }

    public long b(B b) {
        int l;
        String p;
        long a = a();
        if (a == -1) {
            return -1L;
        }
        if (b != null) {
            try {
                if (!b.z() && (((l = b.l()) == 414 || l == 511 || l == 512) && (p = b.p("Handshake-Options")) != null)) {
                    for (String str : p.split(";")) {
                        if (!TextUtils.isEmpty(str)) {
                            String[] split = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
                            if ("reconnect-interval".equals(split[0])) {
                                String str2 = split[1];
                                Logger.d("WsChannelSdk_ok", "override retry interval");
                                try {
                                    a = Long.parseLong(str2) * 1000;
                                    Logger.d("WsChannelSdk_ok", "read response hand shake option : reconnect-interval:" + a + " ms");
                                    break;
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return a;
    }

    public void c() {
        this.b = 0;
    }
}
