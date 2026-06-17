package com.bytedance.bdinstall.k0;

import com.ss.android.socialbase.downloader.constants.MonitorConstants;

/* loaded from: classes.dex */
public class a {
    private static volatile a b;
    private String a;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0021, code lost:
    
        if (java.lang.System.getProperty("ro.yunos.version") != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private a() {
        /*
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "java.vm.name"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch: java.lang.Exception -> L25
            if (r1 == 0) goto L1b
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "lemur"
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Exception -> L25
            if (r0 != 0) goto L23
        L1b:
            java.lang.String r0 = "ro.yunos.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Exception -> L25
            if (r0 == 0) goto L25
        L23:
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            if (r0 == 0) goto L40
            java.lang.String r0 = "ro.aliyun.clouduuid"
            java.lang.String r1 = "false"
            java.lang.String r0 = b(r0, r1)
            r2.a = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L40
            java.lang.String r0 = "ro.sys.aliyun.clouduuid"
            java.lang.String r0 = b(r0, r1)
            r2.a = r0
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.k0.a.<init>():void");
    }

    private static String b(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static a c() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public String a() {
        return this.a;
    }
}
