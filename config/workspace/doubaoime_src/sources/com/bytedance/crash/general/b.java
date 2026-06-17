package com.bytedance.crash.general;

/* loaded from: classes.dex */
public class b {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a() {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String[] r1 = android.os.Build.SUPPORTED_ABIS     // Catch: java.lang.Exception -> L27
            int r2 = r1.length     // Catch: java.lang.Exception -> L27
            if (r2 <= 0) goto L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r2.<init>()     // Catch: java.lang.Exception -> L27
            r0 = 0
        L10:
            int r3 = r1.length     // Catch: java.lang.Exception -> L25
            if (r0 >= r3) goto L2d
            r3 = r1[r0]     // Catch: java.lang.Exception -> L25
            r2.append(r3)     // Catch: java.lang.Exception -> L25
            int r3 = r1.length     // Catch: java.lang.Exception -> L25
            int r3 = r3 + (-1)
            if (r0 == r3) goto L22
            java.lang.String r3 = ", "
            r2.append(r3)     // Catch: java.lang.Exception -> L25
        L22:
            int r0 = r0 + 1
            goto L10
        L25:
            r0 = move-exception
            goto L2a
        L27:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L2a:
            com.bytedance.android.input.k.b.a.P0(r0)
        L2d:
            r0 = r2
        L2e:
            java.lang.String r0 = r0.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L3a
            java.lang.String r0 = "unknown"
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.general.b.a():java.lang.String");
    }
}
