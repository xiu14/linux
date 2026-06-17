package com.ss.android.e.a;

import android.annotation.SuppressLint;

@SuppressLint({"NewApi", "CI_InlinedApi", "CI_NewApi", "InlinedApi"})
/* loaded from: classes2.dex */
public final class a {
    public static boolean a = false;
    public static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static String f8301c;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b4, code lost:
    
        if (r1 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r6) {
        /*
            java.lang.String r0 = "Process"
            java.lang.String r1 = com.ss.android.e.a.a.f8301c
            boolean r2 = com.bytedance.android.input.k.b.a.Y(r1)
            if (r2 != 0) goto Lb
            return r1
        Lb:
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L50
            java.lang.String r2 = "activity"
            java.lang.Object r6 = r6.getSystemService(r2)     // Catch: java.lang.Exception -> L50
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6     // Catch: java.lang.Exception -> L50
            java.util.List r6 = r6.getRunningAppProcesses()     // Catch: java.lang.Exception -> L50
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L50
        L1f:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Exception -> L50
            if (r2 == 0) goto L54
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Exception -> L50
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Exception -> L50
            int r3 = r2.pid     // Catch: java.lang.Exception -> L50
            if (r3 != r1) goto L1f
            boolean r6 = com.bytedance.common.utility.Logger.debug()     // Catch: java.lang.Exception -> L50
            if (r6 == 0) goto L4b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50
            r6.<init>()     // Catch: java.lang.Exception -> L50
            java.lang.String r1 = "processName = "
            r6.append(r1)     // Catch: java.lang.Exception -> L50
            java.lang.String r1 = r2.processName     // Catch: java.lang.Exception -> L50
            r6.append(r1)     // Catch: java.lang.Exception -> L50
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L50
            com.bytedance.common.utility.Logger.d(r0, r6)     // Catch: java.lang.Exception -> L50
        L4b:
            java.lang.String r6 = r2.processName     // Catch: java.lang.Exception -> L50
            com.ss.android.e.a.a.f8301c = r6     // Catch: java.lang.Exception -> L50
            return r6
        L50:
            r6 = move-exception
            r6.printStackTrace()
        L54:
            r6 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lb3
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lb3
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lb3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r4.<init>()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb3
            int r5 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> Lb3
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lb3
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lb3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r2.<init>()     // Catch: java.lang.Throwable -> Lb4
        L85:
            int r3 = r1.read()     // Catch: java.lang.Throwable -> Lb4
            if (r3 <= 0) goto L90
            char r3 = (char) r3     // Catch: java.lang.Throwable -> Lb4
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb4
            goto L85
        L90:
            boolean r3 = com.bytedance.common.utility.Logger.debug()     // Catch: java.lang.Throwable -> Lb4
            if (r3 == 0) goto Lae
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r3.<init>()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r4 = "get processName = "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> Lb4
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lb4
            com.bytedance.common.utility.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> Lb4
        Lae:
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> Lb4
            goto Lb6
        Lb3:
            r1 = r6
        Lb4:
            if (r1 == 0) goto Lb9
        Lb6:
            r1.close()     // Catch: java.lang.Exception -> Lb9
        Lb9:
            com.ss.android.e.a.a.f8301c = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.e.a.a.a(android.content.Context):java.lang.String");
    }

    public static boolean b() {
        if (!b) {
            try {
                Class.forName("miui.os.Build");
                a = true;
                b = true;
                return true;
            } catch (Exception unused) {
                b = true;
            }
        }
        return a;
    }
}
