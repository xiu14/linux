package com.bytedance.framwork.core.sdklib.util;

/* loaded from: classes.dex */
public class b {
    private static String a;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r1 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = com.bytedance.framwork.core.sdklib.util.b.a
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L9
            return r0
        L9:
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4d
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4d
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r4.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch: java.lang.Throwable -> L4d
            int r5 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L4d
            r4.append(r5)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r2.<init>()     // Catch: java.lang.Throwable -> L4e
        L3a:
            int r3 = r1.read()     // Catch: java.lang.Throwable -> L4e
            if (r3 <= 0) goto L45
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L4e
            r2.append(r3)     // Catch: java.lang.Throwable -> L4e
            goto L3a
        L45:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L4e
        L49:
            r1.close()     // Catch: java.lang.Exception -> L51
            goto L51
        L4d:
            r1 = r0
        L4e:
            if (r1 == 0) goto L51
            goto L49
        L51:
            com.bytedance.framwork.core.sdklib.util.b.a = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.sdklib.util.b.a():java.lang.String");
    }
}
