package com.bytedance.crash.protector;

/* loaded from: classes.dex */
public class b {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        r5.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069 A[Catch: all -> 0x00b9, TRY_ENTER, TryCatch #7 {all -> 0x00b9, blocks: (B:3:0x0010, B:6:0x0020, B:8:0x0026, B:12:0x0030, B:15:0x0037, B:18:0x003a, B:20:0x0040, B:24:0x0048, B:28:0x0050, B:38:0x0069, B:41:0x006f, B:43:0x0075, B:48:0x007d, B:50:0x008e, B:60:0x00a3, B:62:0x00a9, B:72:0x00b8), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f A[Catch: all -> 0x00b9, TryCatch #7 {all -> 0x00b9, blocks: (B:3:0x0010, B:6:0x0020, B:8:0x0026, B:12:0x0030, B:15:0x0037, B:18:0x003a, B:20:0x0040, B:24:0x0048, B:28:0x0050, B:38:0x0069, B:41:0x006f, B:43:0x0075, B:48:0x007d, B:50:0x008e, B:60:0x00a3, B:62:0x00a9, B:72:0x00b8), top: B:2:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(org.json.JSONObject r13) {
        /*
            com.bytedance.crash.protector.CrashProtectorConfig r0 = new com.bytedance.crash.protector.CrashProtectorConfig
            r0.<init>(r13)
            byte[] r13 = r0.a()
            int r0 = r0.b()
            java.lang.String r1 = "NPTH_PROT"
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = com.bytedance.crash.C0652g.f()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = "crash_protector.config"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lb9
            r4 = 0
            if (r13 == 0) goto L66
            if (r0 <= 0) goto L66
            boolean r5 = r3.exists()     // Catch: java.lang.Throwable -> Lb9
            if (r5 == 0) goto L66
            long r5 = r3.length()     // Catch: java.lang.Throwable -> Lb9
            long r7 = (long) r0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L30
            goto L66
        L30:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> Lb9
            r5.<init>(r3)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> Lb9
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> Lb9
            r7 = r2
        L3a:
            int r8 = r5.read(r6)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> Lb9
            if (r8 <= 0) goto L5d
            int r9 = r7 + r8
            if (r9 <= r0) goto L45
            goto L5d
        L45:
            r10 = r2
        L46:
            if (r10 >= r8) goto L57
            r11 = r6[r10]     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> Lb9
            int r12 = r7 + r10
            r12 = r13[r12]     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> Lb9
            if (r11 == r12) goto L54
            r5.close()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> Lb9
            goto L66
        L54:
            int r10 = r10 + 1
            goto L46
        L57:
            r7 = r9
            goto L3a
        L59:
            r7 = r2
            goto L5d
        L5b:
            r7 = r2
            r5 = r4
        L5d:
            if (r5 == 0) goto L62
            r5.close()     // Catch: java.lang.Throwable -> L62
        L62:
            if (r7 != r0) goto L66
            r5 = 1
            goto L67
        L66:
            r5 = r2
        L67:
            if (r5 == 0) goto L6f
            java.lang.String r13 = "config not changed"
            com.bytedance.android.input.k.b.a.X(r1, r13)     // Catch: java.lang.Throwable -> Lb9
            goto Lbe
        L6f:
            boolean r5 = r3.exists()     // Catch: java.lang.Throwable -> Lb9
            if (r5 == 0) goto L78
            r3.delete()     // Catch: java.lang.Throwable -> Lb9
        L78:
            if (r13 == 0) goto Lbe
            if (r0 > 0) goto L7d
            goto Lbe
        L7d:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r6 = com.bytedance.crash.C0652g.f()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r7 = "crash_protector.config.tmp"
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> Lb9
            boolean r6 = r5.exists()     // Catch: java.lang.Throwable -> Lb9
            if (r6 != 0) goto L95
            boolean r6 = r5.createNewFile()     // Catch: java.lang.Throwable -> Lb9
            if (r6 != 0) goto L95
            goto Lbe
        L95:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb2
            r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> Lb2
            r6.write(r13, r2, r0)     // Catch: java.lang.Throwable -> Laf
            r6.flush()     // Catch: java.lang.Throwable -> Laf
            r6.close()     // Catch: java.lang.Throwable -> La3
        La3:
            boolean r13 = r5.renameTo(r3)     // Catch: java.lang.Throwable -> Lb9
            if (r13 == 0) goto Lb9
            java.lang.String r13 = "update config file done"
            com.bytedance.android.input.k.b.a.X(r1, r13)     // Catch: java.lang.Throwable -> Lb9
            goto Lbe
        Laf:
            r13 = move-exception
            r4 = r6
            goto Lb3
        Lb2:
            r13 = move-exception
        Lb3:
            if (r4 == 0) goto Lb8
            r4.close()     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            throw r13     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            java.lang.String r13 = "failed to update config file"
            com.bytedance.android.input.k.b.a.D(r1, r13)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.protector.b.a(org.json.JSONObject):void");
    }
}
