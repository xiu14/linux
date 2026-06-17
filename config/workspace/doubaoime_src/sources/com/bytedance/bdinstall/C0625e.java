package com.bytedance.bdinstall;

import android.content.Context;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.bytedance.bdinstall.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0625e {
    static void a(Context context, Q q, StringBuilder sb) {
        String[] h;
        if (!q.T()) {
            C0624d.b(sb, "build_serial", com.bytedance.bdinstall.util.o.g(context, q));
            if (q.U() && (h = com.bytedance.bdinstall.util.o.h(context, q)) != null && h.length > 0) {
                String str = h[0];
                for (int i = 1; i < h.length; i++) {
                    StringBuilder S = e.a.a.a.a.S(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
                    S.append(h[i]);
                    str = S.toString();
                }
                C0624d.b(sb, "sim_serial_number", str);
            }
        }
        com.bytedance.bdinstall.m0.k.n(context).l();
    }
}
