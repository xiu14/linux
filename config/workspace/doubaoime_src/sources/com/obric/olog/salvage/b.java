package com.obric.olog.salvage;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* loaded from: classes2.dex */
public class b {
    private static final Logger a = Logger.getLogger(b.class.getName());

    private static void a(File file, String str, ZipOutputStream zipOutputStream) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    StringBuilder S = e.a.a.a.a.S(str, "/");
                    S.append(file2.getName());
                    a(file2, S.toString(), zipOutputStream);
                } else {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        try {
                            zipOutputStream.putNextEntry(new ZipEntry(str + "/" + file2.getName()));
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read < 0) {
                                    break;
                                } else {
                                    zipOutputStream.write(bArr, 0, read);
                                }
                            }
                            zipOutputStream.closeEntry();
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        a.log(Level.SEVERE, "Error compressing file {0}: {1}", new Object[]{file2.getAbsolutePath(), e2.getMessage()});
                        throw e2;
                    }
                }
            }
        }
    }

    public static void b(Context context, String[] strArr, String str) throws IOException {
        File file = new File(context.getFilesDir(), str);
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
                try {
                    for (String str2 : strArr) {
                        File file2 = new File(str2);
                        if (file2.exists() && file2.isDirectory()) {
                            a(file2, file2.getName(), zipOutputStream);
                        }
                        a.log(Level.SEVERE, "Source directory {0} does not exist or is not a directory.", str2);
                    }
                    zipOutputStream.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (IOException e2) {
            a.log(Level.SEVERE, "Error compressing files to {0}: {1}", new Object[]{file.getAbsolutePath(), e2.getMessage()});
            throw e2;
        }
    }
}
