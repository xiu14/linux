package com.bytedance.push.settings.D;

import android.content.Context;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes2.dex */
public class a {
    private static String a;
    private static Boolean b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r6) {
        /*
            java.lang.String r0 = com.bytedance.push.settings.D.a.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r6 = com.bytedance.push.settings.D.a.a
            return r6
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto L1b
            java.lang.String r0 = android.app.Application.getProcessName()     // Catch: java.lang.Exception -> L17
            goto L1c
        L17:
            r0 = move-exception
            r0.printStackTrace()
        L1b:
            r0 = r2
        L1c:
            com.bytedance.push.settings.D.a.a = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L27
            java.lang.String r6 = com.bytedance.push.settings.D.a.a
            return r6
        L27:
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L4d
            r3 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "currentProcessName"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L4d
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r4)     // Catch: java.lang.Throwable -> L4d
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.Throwable -> L4d
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L51
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L4d
            goto L52
        L4d:
            r0 = move-exception
            r0.printStackTrace()
        L51:
            r0 = r2
        L52:
            com.bytedance.push.settings.D.a.a = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L5d
            java.lang.String r6 = com.bytedance.push.settings.D.a.a
            return r6
        L5d:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r4.<init>()     // Catch: java.lang.Throwable -> La0
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch: java.lang.Throwable -> La0
            int r5 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> La0
            r4.append(r5)     // Catch: java.lang.Throwable -> La0
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> La0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = "iso-8859-1"
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> La0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1
            r1.<init>()     // Catch: java.lang.Throwable -> La1
        L8d:
            int r3 = r0.read()     // Catch: java.lang.Throwable -> La1
            if (r3 <= 0) goto L98
            char r3 = (char) r3     // Catch: java.lang.Throwable -> La1
            r1.append(r3)     // Catch: java.lang.Throwable -> La1
            goto L8d
        L98:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La1
            r0.close()     // Catch: java.lang.Exception -> La7
            goto La7
        La0:
            r0 = r2
        La1:
            if (r0 == 0) goto La6
            r0.close()     // Catch: java.lang.Exception -> La6
        La6:
            r1 = r2
        La7:
            com.bytedance.push.settings.D.a.a = r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lb2
            java.lang.String r6 = com.bytedance.push.settings.D.a.a
            return r6
        Lb2:
            if (r6 != 0) goto Lb5
            goto Ldf
        Lb5:
            int r0 = android.os.Process.myPid()
            java.lang.String r1 = "activity"
            java.lang.Object r6 = r6.getSystemService(r1)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            if (r6 == 0) goto Ldf
            java.util.List r6 = r6.getRunningAppProcesses()
            if (r6 == 0) goto Ldf
            java.util.Iterator r6 = r6.iterator()
        Lcd:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Ldf
            java.lang.Object r1 = r6.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r3 = r1.pid
            if (r3 != r0) goto Lcd
            java.lang.String r2 = r1.processName
        Ldf:
            com.bytedance.push.settings.D.a.a = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.settings.D.a.a(android.content.Context):java.lang.String");
    }

    public static boolean b(Context context) {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        String a2 = a(context);
        boolean z = false;
        if (a2 != null && a2.contains(Constants.COLON_SEPARATOR)) {
            return false;
        }
        if (a2 != null && a2.equals(context.getPackageName())) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        b = valueOf;
        return valueOf.booleanValue();
    }
}
