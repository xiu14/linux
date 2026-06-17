package com.bytedance.common.c;

import com.bytedance.common.c.h;

/* loaded from: classes.dex */
class i extends Thread {
    final /* synthetic */ h.b a;
    final /* synthetic */ h b;

    i(h hVar, h.b bVar) {
        this.b = hVar;
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0030 -> B:8:0x006f). Please report as a decompilation issue!!! */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            java.lang.String r0 = "Error closing socket"
            java.lang.String r1 = "NetworkReachability"
            r2 = 443(0x1bb, float:6.21E-43)
            r3 = 0
            java.net.Socket r4 = new java.net.Socket     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r4.<init>()     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.net.InetSocketAddress r3 = new java.net.InetSocketAddress     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L36
            com.bytedance.common.c.h r5 = r8.b     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L36
            java.lang.String r6 = r5.b     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L36
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L36
            r3.<init>(r6, r2)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L36
            r5 = 3000(0xbb8, float:4.204E-42)
            r4.connect(r3, r5)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L36
            boolean r3 = r4.isConnected()     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L36
            com.bytedance.common.c.h$b r5 = r8.a     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L36
            r5.a(r3)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L36
            java.lang.String r3 = "test Reachability"
            com.bytedance.push.g0.f.c(r1, r3)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L36
            r4.close()     // Catch: java.io.IOException -> L2f
            goto L6f
        L2f:
            r2 = move-exception
            com.bytedance.push.g0.f.f(r1, r0, r2)
            goto L6f
        L34:
            r3 = move-exception
            goto L3f
        L36:
            r2 = move-exception
            r3 = r4
            goto L70
        L39:
            r2 = move-exception
            goto L70
        L3b:
            r4 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
        L3f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r5.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = "Reachability test failed for "
            r5.append(r6)     // Catch: java.lang.Throwable -> L36
            com.bytedance.common.c.h r6 = r8.b     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = r6.b     // Catch: java.lang.Throwable -> L36
            r5.append(r6)     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = ":"
            r5.append(r6)     // Catch: java.lang.Throwable -> L36
            com.bytedance.common.c.h r6 = r8.b     // Catch: java.lang.Throwable -> L36
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L36
            r5.append(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L36
            com.bytedance.push.g0.f.f(r1, r2, r3)     // Catch: java.lang.Throwable -> L36
            com.bytedance.common.c.h$b r2 = r8.a     // Catch: java.lang.Throwable -> L36
            r3 = 0
            r2.a(r3)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L6f
            r4.close()     // Catch: java.io.IOException -> L2f
        L6f:
            return
        L70:
            if (r3 == 0) goto L7a
            r3.close()     // Catch: java.io.IOException -> L76
            goto L7a
        L76:
            r3 = move-exception
            com.bytedance.push.g0.f.f(r1, r0, r3)
        L7a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.c.i.run():void");
    }
}
