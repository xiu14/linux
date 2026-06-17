package com.bytedance.apm.util;

/* loaded from: classes.dex */
public class l {
    private static String a;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = com.bytedance.apm.util.l.a
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L9
            return r0
        L9:
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4f
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4f
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r4.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch: java.lang.Throwable -> L4f
            int r5 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L4f
            r4.append(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L4f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r3 = 32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L50
        L3c:
            int r3 = r1.read()     // Catch: java.lang.Throwable -> L50
            if (r3 <= 0) goto L47
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L50
            r2.append(r3)     // Catch: java.lang.Throwable -> L50
            goto L3c
        L47:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L50
            r1.close()     // Catch: java.lang.Throwable -> L55
            goto L55
        L4f:
            r1 = r0
        L50:
            if (r1 == 0) goto L55
            r1.close()     // Catch: java.lang.Throwable -> L55
        L55:
            com.bytedance.apm.util.l.a = r0
            if (r0 != 0) goto L5b
            java.lang.String r0 = ""
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.util.l.a():java.lang.String");
    }
}
