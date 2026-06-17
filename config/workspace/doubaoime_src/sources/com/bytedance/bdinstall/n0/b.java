package com.bytedance.bdinstall.n0;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
class b implements Callable<String> {
    b(c cVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006f  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String call() throws java.lang.Exception {
        /*
            r8 = this;
            r0 = 28
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.util.UUID r3 = new java.util.UUID     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r4 = -1301668207276963122(0xedef8ba979d64ace, double:-3.563403477674908E221)
            r6 = -6645017420763422227(0xa3c827dcd51d21ed, double:-2.5964014370906125E-136)
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            android.media.MediaDrm r4 = new android.media.MediaDrm     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.lang.String r1 = "deviceUniqueId"
            byte[] r1 = r4.getPropertyByteArray(r1)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L5d
            java.lang.String r1 = com.bytedance.bdinstall.e0.a(r1)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L5d
            if (r2 < r0) goto L2e
            r4.close()     // Catch: java.lang.Exception -> L29
            goto L5c
        L29:
            r0 = move-exception
            r0.printStackTrace()
            goto L5c
        L2e:
            r4.release()     // Catch: java.lang.Exception -> L32
            goto L5c
        L32:
            r0 = move-exception
            r0.printStackTrace()
            goto L5c
        L37:
            r1 = move-exception
            goto L3e
        L39:
            r2 = move-exception
            goto L60
        L3b:
            r2 = move-exception
            r4 = r1
            r1 = r2
        L3e:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L5d
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L50
            if (r4 == 0) goto L5a
            r4.close()     // Catch: java.lang.Exception -> L4b
            goto L5a
        L4b:
            r0 = move-exception
            r0.printStackTrace()
            goto L5a
        L50:
            if (r4 == 0) goto L5a
            r4.release()     // Catch: java.lang.Exception -> L56
            goto L5a
        L56:
            r0 = move-exception
            r0.printStackTrace()
        L5a:
            java.lang.String r1 = ""
        L5c:
            return r1
        L5d:
            r1 = move-exception
            r2 = r1
            r1 = r4
        L60:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r0) goto L6f
            if (r1 == 0) goto L79
            r1.close()     // Catch: java.lang.Exception -> L6a
            goto L79
        L6a:
            r0 = move-exception
            r0.printStackTrace()
            goto L79
        L6f:
            if (r1 == 0) goto L79
            r1.release()     // Catch: java.lang.Exception -> L75
            goto L79
        L75:
            r0 = move-exception
            r0.printStackTrace()
        L79:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.n0.b.call():java.lang.Object");
    }
}
