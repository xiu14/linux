package com.bytedance.common.utility.j;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class a {
    private static List<String> a = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:17:0x001c, B:19:0x0023, B:22:0x002a, B:24:0x003b, B:26:0x004b, B:28:0x0054, B:30:0x005a, B:31:0x005d, B:33:0x0063, B:12:0x000f), top: B:3:0x0003, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054 A[Catch: all -> 0x0097, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0003, B:17:0x001c, B:19:0x0023, B:22:0x002a, B:24:0x003b, B:26:0x004b, B:28:0x0054, B:30:0x005a, B:31:0x005d, B:33:0x0063, B:12:0x000f), top: B:3:0x0003, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean a(android.content.Context r9, java.lang.String r10) {
        /*
            java.lang.Class<com.bytedance.common.utility.j.a> r0 = com.bytedance.common.utility.j.a.class
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = com.bytedance.common.utility.j.a.a     // Catch: java.lang.Throwable -> L97
            boolean r1 = r1.contains(r10)     // Catch: java.lang.Throwable -> L97
            r2 = 1
            if (r1 == 0) goto Le
            monitor-exit(r0)
            return r2
        Le:
            r1 = 0
            java.lang.System.loadLibrary(r10)     // Catch: java.lang.Throwable -> L19 java.lang.UnsatisfiedLinkError -> L1b
            java.util.List<java.lang.String> r3 = com.bytedance.common.utility.j.a.a     // Catch: java.lang.Throwable -> L19 java.lang.UnsatisfiedLinkError -> L1b
            r3.add(r10)     // Catch: java.lang.Throwable -> L19 java.lang.UnsatisfiedLinkError -> L1b
            goto L93
        L19:
            monitor-exit(r0)
            return r1
        L1b:
            r3 = move-exception
            java.lang.String r4 = java.lang.System.mapLibraryName(r10)     // Catch: java.lang.Throwable -> L97
            r5 = 0
            if (r9 == 0) goto L48
            java.io.File r6 = r9.getFilesDir()     // Catch: java.lang.Throwable -> L97
            if (r6 != 0) goto L2a
            goto L48
        L2a:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L97
            java.io.File r7 = r9.getFilesDir()     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = "libso"
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L97
            boolean r7 = r6.exists()     // Catch: java.lang.Throwable -> L97
            if (r7 != 0) goto L49
            java.lang.String r7 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L97
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L97
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L97
            r8.mkdirs()     // Catch: java.lang.Throwable -> L97
            goto L49
        L48:
            r6 = r5
        L49:
            if (r6 == 0) goto L50
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L97
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L97
        L50:
            if (r5 != 0) goto L54
            monitor-exit(r0)
            return r1
        L54:
            boolean r4 = r5.exists()     // Catch: java.lang.Throwable -> L97
            if (r4 == 0) goto L5d
            r5.delete()     // Catch: java.lang.Throwable -> L97
        L5d:
            java.lang.String r9 = b(r9, r10, r5)     // Catch: java.lang.Throwable -> L97
            if (r9 == 0) goto L87
            java.lang.String r10 = "loadLibrary"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r2.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L97
            r2.append(r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = "["
            r2.append(r3)     // Catch: java.lang.Throwable -> L97
            r2.append(r9)     // Catch: java.lang.Throwable -> L97
            java.lang.String r9 = "]"
            r2.append(r9)     // Catch: java.lang.Throwable -> L97
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> L97
            android.util.Log.e(r10, r9)     // Catch: java.lang.Throwable -> L97
            monitor-exit(r0)
            return r1
        L87:
            java.lang.String r9 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L95
            java.lang.System.load(r9)     // Catch: java.lang.Throwable -> L95
            java.util.List<java.lang.String> r9 = com.bytedance.common.utility.j.a.a     // Catch: java.lang.Throwable -> L95
            r9.add(r10)     // Catch: java.lang.Throwable -> L95
        L93:
            monitor-exit(r0)
            return r2
        L95:
            monitor-exit(r0)
            return r1
        L97:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.j.a.a(android.content.Context, java.lang.String):boolean");
    }

    private static String b(Context context, String str, File file) {
        InputStream inputStream;
        ZipFile zipFile;
        String message;
        String str2;
        ZipEntry entry;
        FileOutputStream fileOutputStream = null;
        try {
            zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("lib/");
                str2 = Build.CPU_ABI;
                sb.append(str2);
                sb.append("/");
                sb.append(System.mapLibraryName(str));
                entry = zipFile.getEntry(sb.toString());
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            zipFile = null;
        }
        if (entry == null) {
            int indexOf = str2.indexOf(45);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("lib/");
            if (indexOf <= 0) {
                indexOf = str2.length();
            }
            sb2.append(str2.substring(0, indexOf));
            sb2.append("/");
            sb2.append(System.mapLibraryName(str));
            String sb3 = sb2.toString();
            ZipEntry entry2 = zipFile.getEntry(sb3);
            if (entry2 == null) {
                message = "Library entry not found:" + sb3;
                com.bytedance.android.input.k.b.a.g(null);
                com.bytedance.android.input.k.b.a.g(null);
                com.bytedance.android.input.k.b.a.h(zipFile);
                return message;
            }
            entry = entry2;
        }
        file.createNewFile();
        InputStream inputStream2 = zipFile.getInputStream(entry);
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read <= 0) {
                        com.bytedance.android.input.k.b.a.F0(file.getAbsolutePath(), 493);
                        com.bytedance.android.input.k.b.a.g(fileOutputStream2);
                        com.bytedance.android.input.k.b.a.g(inputStream2);
                        com.bytedance.android.input.k.b.a.h(zipFile);
                        return null;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                }
            } catch (Throwable th3) {
                fileOutputStream = fileOutputStream2;
                inputStream = inputStream2;
                th = th3;
                try {
                    message = th.getMessage();
                    com.bytedance.android.input.k.b.a.g(fileOutputStream);
                    com.bytedance.android.input.k.b.a.g(inputStream);
                    com.bytedance.android.input.k.b.a.h(zipFile);
                    return message;
                } catch (Throwable th4) {
                    com.bytedance.android.input.k.b.a.g(fileOutputStream);
                    com.bytedance.android.input.k.b.a.g(inputStream);
                    com.bytedance.android.input.k.b.a.h(zipFile);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            inputStream = inputStream2;
            th = th5;
        }
    }
}
