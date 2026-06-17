package com.xiaomi.push.service.logupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* loaded from: classes2.dex */
public class a {
    public static void a(File file, File file2) {
        if (file == null || !file.exists()) {
            throw new IOException("Source not exist: " + file + "when zipDirectory");
        }
        if (!file.isDirectory()) {
            c(file, file2);
            return;
        }
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file2));
        try {
            a(file, file, zipOutputStream);
            zipOutputStream.close();
        } catch (Throwable th) {
            try {
                zipOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void b(File file, File file2) {
        if (file == null || !file.exists()) {
            com.xiaomi.channel.commonutils.logger.c.m16a("FileOperationHelper", "source not exist: " + file + "when copyToDirectory");
            return;
        }
        if (file2.exists() || file2.mkdirs()) {
            File file3 = new File(file2, file.getName());
            if (file.isDirectory()) {
                e(file, file3);
                return;
            } else {
                d(file, file3);
                return;
            }
        }
        throw new IOException("Failed to create target dir: " + file2 + file + "when copyToDirectory");
    }

    private static void c(File file, File file2) {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file2));
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        zipOutputStream.closeEntry();
                        fileInputStream.close();
                        zipOutputStream.close();
                        return;
                    }
                    zipOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                zipOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void d(File file, File file2) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileInputStream.getChannel().transferTo(0L, fileInputStream.getChannel().size(), fileOutputStream.getChannel());
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void e(File file, File file2) {
        if (!file2.exists() && !file2.mkdirs()) {
            throw new IOException("Failed to create directory: " + file2);
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file3 : listFiles) {
            if (file3 != null) {
                File file4 = new File(file2, file3.getName());
                if (file3.isDirectory()) {
                    e(file3, file4);
                } else {
                    d(file3, file4);
                }
            }
        }
    }

    public static boolean a(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists() && !b(file)) {
            com.xiaomi.channel.commonutils.logger.c.m16a("FileOperationHelper", "Failed to delete folder: " + file);
            return false;
        }
        if (file.mkdirs() || file.exists()) {
            return true;
        }
        com.xiaomi.channel.commonutils.logger.c.m16a("FileOperationHelper", "Failed to create folder: " + file);
        return false;
    }

    public static boolean b(File file) {
        File[] listFiles;
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (!b(file2)) {
                    com.xiaomi.channel.commonutils.logger.c.m16a("FileOperationHelper", "failed to delete: " + file2);
                }
            }
        }
        boolean delete = file.delete();
        if (!delete) {
            com.xiaomi.channel.commonutils.logger.c.m16a("FileOperationHelper", "failed to delete: " + file);
        }
        return delete;
    }

    private static void a(File file, File file2, ZipOutputStream zipOutputStream) {
        File[] listFiles = file2.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file3 : listFiles) {
            if (file3.isDirectory()) {
                a(file, file3, zipOutputStream);
            } else {
                zipOutputStream.putNextEntry(new ZipEntry(file.toURI().relativize(file3.toURI()).getPath()));
                FileInputStream fileInputStream = new FileInputStream(file3);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        } else {
                            zipOutputStream.write(bArr, 0, read);
                        }
                    }
                    fileInputStream.close();
                    zipOutputStream.closeEntry();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }
}
