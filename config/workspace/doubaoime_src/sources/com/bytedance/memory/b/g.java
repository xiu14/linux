package com.bytedance.memory.b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* loaded from: classes.dex */
public class g {
    private static void a(File file, ZipOutputStream zipOutputStream, String str) throws Exception {
        byte[] bArr = new byte[2048];
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                zipOutputStream.closeEntry();
                fileInputStream.close();
                return;
            }
            zipOutputStream.write(bArr, 0, read);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0044 -> B:9:0x0047). Please report as a decompilation issue!!! */
    public static void b(File file, File file2) {
        ZipOutputStream zipOutputStream;
        long currentTimeMillis = System.currentTimeMillis();
        ?? r3 = 0;
        ZipOutputStream zipOutputStream2 = null;
        r3 = 0;
        try {
            try {
                try {
                    zipOutputStream = new ZipOutputStream(new FileOutputStream(file2));
                } catch (Throwable th) {
                    th = th;
                    zipOutputStream = r3;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            r3 = r3;
        }
        try {
            a(file, zipOutputStream, file.getName());
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            c.b("Compress over cost： %d ms", Long.valueOf(currentTimeMillis2));
            zipOutputStream.close();
            r3 = currentTimeMillis2;
        } catch (Exception e4) {
            e = e4;
            zipOutputStream2 = zipOutputStream;
            c.a(e, "HeapFile compress failed", new Object[0]);
            r3 = zipOutputStream2;
            if (zipOutputStream2 != null) {
                zipOutputStream2.close();
                r3 = zipOutputStream2;
            }
        } catch (Throwable th2) {
            th = th2;
            if (zipOutputStream != null) {
                try {
                    zipOutputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.zip.DeflaterOutputStream] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.zip.DeflaterOutputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.String] */
    public static void c(File file, File file2, boolean z) {
        FileInputStream fileInputStream;
        DeflaterOutputStream deflaterOutputStream;
        long currentTimeMillis = System.currentTimeMillis();
        ?? r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    deflaterOutputStream = new DeflaterOutputStream(new FileOutputStream(file2));
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        deflaterOutputStream.write(bArr, 0, read);
                    }
                }
                r2 = "Compress over cost： %d ms";
                c.b("Compress over cost： %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                if (file2.exists() && z) {
                    file.delete();
                }
                try {
                    deflaterOutputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (Exception e4) {
                e = e4;
                r2 = deflaterOutputStream;
                c.a(e, "HeapFile compress failed", new Object[0]);
                if (r2 != 0) {
                    try {
                        r2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                if (fileInputStream == null) {
                    return;
                }
                fileInputStream.close();
            } catch (Throwable th2) {
                th = th2;
                r2 = deflaterOutputStream;
                if (r2 != 0) {
                    try {
                        r2.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                if (fileInputStream == null) {
                    throw th;
                }
                try {
                    fileInputStream.close();
                    throw th;
                } catch (IOException e7) {
                    e7.printStackTrace();
                    throw th;
                }
            }
        } catch (Exception e8) {
            e = e8;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
        try {
            fileInputStream.close();
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }
}
