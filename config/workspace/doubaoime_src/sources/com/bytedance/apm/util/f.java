package com.bytedance.apm.util;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public class f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.io.File r5, java.util.zip.ZipOutputStream r6, java.lang.String r7) {
        /*
            boolean r0 = r5.isDirectory()
            r1 = 0
            if (r0 == 0) goto L31
            java.lang.StringBuilder r7 = e.a.a.a.a.M(r7)
            java.lang.String r0 = r5.getName()
            r7.append(r0)
            java.lang.String r0 = java.io.File.separator
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            boolean r0 = r5.exists()
            if (r0 != 0) goto L22
            goto L89
        L22:
            java.io.File[] r5 = r5.listFiles()
        L26:
            int r0 = r5.length
            if (r1 >= r0) goto L89
            r0 = r5[r1]
            a(r0, r6, r7)
            int r1 = r1 + 1
            goto L26
        L31:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r2 = "compress："
            java.lang.StringBuilder r2 = e.a.a.a.a.S(r2, r7)
            java.lang.String r3 = r5.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.println(r2)
            boolean r0 = r5.exists()
            if (r0 != 0) goto L4e
            goto L89
        L4e:
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L99
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r4.<init>()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r4.append(r7)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r4.append(r5)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r6.putNextEntry(r0)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r5]     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
        L78:
            int r0 = r3.read(r7, r1, r5)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r4 = -1
            if (r0 == r4) goto L83
            r6.write(r7, r1, r0)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            goto L78
        L83:
            r3.close()     // Catch: java.lang.Throwable -> L86
        L86:
            r2.close()     // Catch: java.lang.Throwable -> L89
        L89:
            return
        L8a:
            r5 = move-exception
            r0 = r3
            goto La4
        L8d:
            r5 = move-exception
            r0 = r3
            goto L93
        L90:
            r5 = move-exception
            goto La4
        L92:
            r5 = move-exception
        L93:
            r6 = r0
            r0 = r2
            goto L9b
        L96:
            r5 = move-exception
            r2 = r0
            goto La4
        L99:
            r5 = move-exception
            r6 = r0
        L9b:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> La1
            r7.<init>(r5)     // Catch: java.lang.Throwable -> La1
            throw r7     // Catch: java.lang.Throwable -> La1
        La1:
            r5 = move-exception
            r2 = r0
            r0 = r6
        La4:
            if (r0 == 0) goto La9
            r0.close()     // Catch: java.lang.Throwable -> La9
        La9:
            if (r2 == 0) goto Lae
            r2.close()     // Catch: java.lang.Throwable -> Lae
        Lae:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.util.f.a(java.io.File, java.util.zip.ZipOutputStream, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(java.lang.String r7, java.lang.String... r8) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            r7 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L6a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L6a
            java.util.zip.CheckedOutputStream r0 = new java.util.zip.CheckedOutputStream     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L60
            java.util.zip.CRC32 r2 = new java.util.zip.CRC32     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L60
            r2.<init>()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L60
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L60
            java.util.zip.ZipOutputStream r2 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            int r7 = r8.length     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L75
            r3 = 0
        L1c:
            if (r3 >= r7) goto L4a
            r4 = r8[r3]     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L75
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L75
            r5.<init>(r4)     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L75
            boolean r6 = r5.exists()     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L75
            if (r6 == 0) goto L33
            java.lang.String r4 = ""
            a(r5, r2, r4)     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L75
            int r3 = r3 + 1
            goto L1c
        L33:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L75
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L75
            r8.<init>()     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L75
            r8.append(r4)     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L75
            java.lang.String r3 = "not exist！"
            r8.append(r3)     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L75
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L75
            r7.<init>(r8)     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L75
            throw r7     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L75
        L4a:
            r2.close()     // Catch: java.lang.Throwable -> L4d
        L4d:
            r0.close()     // Catch: java.lang.Throwable -> L50
        L50:
            r1.close()     // Catch: java.lang.Throwable -> L53
        L53:
            return
        L54:
            r7 = move-exception
            goto L6f
        L56:
            r8 = move-exception
            r2 = r7
            goto L68
        L59:
            r8 = move-exception
            r2 = r7
            goto L6e
        L5c:
            r8 = move-exception
            r0 = r7
            r2 = r0
            goto L68
        L60:
            r8 = move-exception
            r0 = r7
            r2 = r0
            goto L6e
        L64:
            r8 = move-exception
            r0 = r7
            r1 = r0
            r2 = r1
        L68:
            r7 = r8
            goto L76
        L6a:
            r8 = move-exception
            r0 = r7
            r1 = r0
            r2 = r1
        L6e:
            r7 = r8
        L6f:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L75
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L75
            throw r8     // Catch: java.lang.Throwable -> L75
        L75:
            r7 = move-exception
        L76:
            if (r2 == 0) goto L7b
            r2.close()     // Catch: java.lang.Throwable -> L7b
        L7b:
            if (r0 == 0) goto L80
            r0.close()     // Catch: java.lang.Throwable -> L80
        L80:
            if (r1 == 0) goto L85
            r1.close()     // Catch: java.lang.Throwable -> L85
        L85:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.util.f.b(java.lang.String, java.lang.String[]):void");
    }

    public static File c(Context context) {
        File file = null;
        if (context == null) {
            return null;
        }
        try {
            file = context.getExternalFilesDir(null);
            do {
                file = file.getParentFile();
            } while (file.getAbsolutePath().contains("/Android"));
        } catch (Throwable unused) {
        }
        return file;
    }

    public static long d(File file) {
        if (!file.exists()) {
            return -1L;
        }
        if (file.isFile()) {
            return file.length();
        }
        long j = 0;
        if (!file.isDirectory()) {
            return -1L;
        }
        for (File file2 : file.listFiles()) {
            j += d(file2);
        }
        return j;
    }
}
