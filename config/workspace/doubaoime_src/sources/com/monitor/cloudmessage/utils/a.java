package com.monitor.cloudmessage.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* loaded from: classes2.dex */
public class a {
    private static final String a = "a";
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
            goto L94
        L22:
            java.io.File[] r5 = r5.listFiles()
        L26:
            int r0 = r5.length
            if (r1 >= r0) goto L94
            r0 = r5[r1]
            a(r0, r6, r7)
            int r1 = r1 + 1
            goto L26
        L31:
            boolean r0 = com.bytedance.apm.g.B()
            if (r0 == 0) goto L52
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r2 = "压缩："
            java.lang.StringBuilder r2 = e.a.a.a.a.S(r2, r7)
            java.lang.String r3 = r5.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0[r1] = r2
            java.lang.String r2 = "cloudmessage"
            com.bytedance.apm.y.d.b(r2, r0)
        L52:
            boolean r0 = r5.exists()
            if (r0 != 0) goto L59
            goto L94
        L59:
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La4
            r2.<init>(r5)     // Catch: java.lang.Throwable -> La1 java.lang.Exception -> La4
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
            r4.<init>()     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
            r4.append(r7)     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
            r4.append(r5)     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
            r6.putNextEntry(r0)     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r5]     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
        L83:
            int r0 = r3.read(r7, r1, r5)     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
            r4 = -1
            if (r0 == r4) goto L8e
            r6.write(r7, r1, r0)     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
            goto L83
        L8e:
            r3.close()     // Catch: java.lang.Throwable -> L91
        L91:
            r2.close()     // Catch: java.lang.Throwable -> L94
        L94:
            return
        L95:
            r5 = move-exception
            r0 = r3
            goto Laf
        L98:
            r5 = move-exception
            r0 = r3
            goto L9e
        L9b:
            r5 = move-exception
            goto Laf
        L9d:
            r5 = move-exception
        L9e:
            r6 = r0
            r0 = r2
            goto La6
        La1:
            r5 = move-exception
            r2 = r0
            goto Laf
        La4:
            r5 = move-exception
            r6 = r0
        La6:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lac
            r7.<init>(r5)     // Catch: java.lang.Throwable -> Lac
            throw r7     // Catch: java.lang.Throwable -> Lac
        Lac:
            r5 = move-exception
            r2 = r0
            r0 = r6
        Laf:
            if (r0 == 0) goto Lb4
            r0.close()     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            if (r2 == 0) goto Lb9
            r2.close()     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.utils.a.a(java.io.File, java.util.zip.ZipOutputStream, java.lang.String):void");
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
            java.lang.String r3 = "不存在！"
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
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.utils.a.b(java.lang.String, java.lang.String[]):void");
    }

    public static boolean c(String str, String str2, String str3) {
        FileInputStream fileInputStream;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
            fileInputStream = fileInputStream2;
        }
        try {
            boolean h = h(fileInputStream, str2, str3);
            try {
                fileInputStream.close();
            } catch (Exception unused) {
            }
            return h;
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Exception unused2) {
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    public static void d(@NonNull File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    if (file2.isFile()) {
                        file2.delete();
                    } else if (file.isDirectory()) {
                        d(file2);
                    }
                }
            }
            file.delete();
        }
    }

    public static File e(Context context) {
        File externalFilesDir = context.getExternalFilesDir("cloudMessage");
        if (externalFilesDir == null) {
            externalFilesDir = new File(context.getFilesDir(), "cloudMessage");
        }
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdir();
        }
        return externalFilesDir;
    }

    public static File f(String str, String str2) {
        Context e2;
        e2 = e.h.a.a.g().e();
        str.hashCode();
        switch (str) {
            case "data_package":
                return new File(e2.getFilesDir().getParentFile(), str2);
            case "sd_package_file":
                return new File(e2.getExternalFilesDir(null), str2);
            case "sd_package_cache":
                return new File(e2.getExternalCacheDir(), str2);
            case "data_package_cache":
                return new File(e2.getCacheDir(), str2);
            case "sd_package":
                return new File(e2.getExternalFilesDir(null).getParentFile(), str2);
            case "data_package_file":
                return new File(e2.getFilesDir(), str2);
            default:
                return null;
        }
    }

    public static boolean g(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        int length = listFiles.length;
        boolean z = true;
        for (int i = 0; i < length; i++) {
            z = !listFiles[i].isDirectory() ? !(z && listFiles[i].delete()) : !(z && g(listFiles[i].getAbsolutePath()));
        }
        return z && file.delete();
    }

    public static boolean h(InputStream inputStream, String str, String str2) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(str);
                if (!file.exists() && !file.mkdirs()) {
                    try {
                        inputStream.close();
                    } catch (Exception unused) {
                    }
                    return false;
                }
                fileOutputStream = new FileOutputStream(new File(file, str2));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            inputStream.close();
                            try {
                                inputStream.close();
                                return true;
                            } catch (Exception unused2) {
                                return true;
                            }
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream;
                    Log.d(a, "save inputstream error: " + e);
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Exception unused3) {
                        }
                    }
                    try {
                        inputStream.close();
                    } catch (Exception unused4) {
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception unused5) {
                        }
                    }
                    try {
                        inputStream.close();
                        throw th;
                    } catch (Exception unused6) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static void i(String str, String str2) throws Exception {
        File file = new File(str);
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str2));
            try {
                j(zipOutputStream2, file, "");
                try {
                    zipOutputStream2.close();
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                if (zipOutputStream != null) {
                    try {
                        zipOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void j(ZipOutputStream zipOutputStream, File file, String str) throws Exception {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            zipOutputStream.putNextEntry(new ZipEntry(e.a.a.a.a.s(str, "/")));
            String s = str.length() == 0 ? "" : e.a.a.a.a.s(str, "/");
            for (int i = 0; i < listFiles.length; i++) {
                File file2 = listFiles[i];
                StringBuilder M = e.a.a.a.a.M(s);
                M.append(listFiles[i].getName());
                j(zipOutputStream, file2, M.toString());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            while (true) {
                try {
                    int read = fileInputStream2.read();
                    if (read == -1) {
                        try {
                            fileInputStream2.close();
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    zipOutputStream.write(read);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
