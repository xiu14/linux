package com.huawei.hianalytics.log.f;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: com.huawei.hianalytics.log.f.a$a, reason: collision with other inner class name */
    public static class C0348a implements Serializable, Comparator<File> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long lastModified = file.lastModified() - file2.lastModified();
            if (lastModified > 0) {
                return 1;
            }
            return lastModified < 0 ? -1 : 0;
        }
    }

    public static File a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.huawei.hianalytics.g.b.d("AppLogManager", "createLogFile Exc, not have file path or name");
            return null;
        }
        File file = new File(str, str2);
        try {
            if (file.createNewFile()) {
                com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "log file createNewFile");
            }
        } catch (IOException unused) {
            com.huawei.hianalytics.g.b.d("AppLogManager", "createNewFile Exception,log File creation failure!");
        }
        File[] a = a(str);
        int b = com.huawei.hianalytics.log.e.f.b(a);
        int i2 = i;
        boolean z = false;
        for (File file2 : a) {
            if (file2.getName().equals("eventinfo.log")) {
                i2++;
                z = true;
            }
        }
        if (b > i2) {
            if (z) {
                File[] a2 = a(a);
                Arrays.sort(a2, new C0348a());
                a(a2, i);
            } else {
                Arrays.sort(a, new C0348a());
                a(a, i);
            }
        }
        return file;
    }

    public static void a(String str, int i) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            str3 = "Failed to create file";
        } else {
            if (listFiles.length <= i) {
                Arrays.sort(listFiles, new C0348a());
                long j = 0;
                for (File file2 : listFiles) {
                    if (file2.length() <= 1887436.8d || !file2.delete()) {
                        long length = file2.length() + j;
                        if (length >= 1887436.8d) {
                            if (!com.huawei.hianalytics.log.e.f.a(listFiles)) {
                                str2 = listFiles[0].delete() ? "delFullFile() Crash file deletion success" : "delFullFile() true";
                                a(str, i);
                            }
                            com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", str2);
                            a(str, i);
                        }
                        j = length;
                    } else {
                        com.huawei.hianalytics.g.b.c("HiAnalytics/logServer", "Delete a file with a length greater than 1.8M ");
                        j = 0;
                    }
                }
                return;
            }
            com.huawei.hianalytics.log.e.a.a(file);
            str3 = "zips number anomaly ,Delete the file ";
        }
        com.huawei.hianalytics.g.b.c("AppLogManager", str3);
    }

    public static boolean a(File file) {
        return file.length() <= 204800;
    }

    public static boolean a(File[] fileArr, int i) {
        if (fileArr == null || fileArr.length < i) {
            com.huawei.hianalytics.g.b.b("AppLogManager", "files is empty or files size too much");
            return false;
        }
        boolean z = true;
        int i2 = 0;
        for (int i3 = 0; i3 < fileArr.length; i3++) {
            if (i3 < (fileArr.length - i) + i2) {
                if (fileArr[i3].getName().contains("Crash")) {
                    i2++;
                } else if (fileArr[i3].delete()) {
                    com.huawei.hianalytics.g.b.c("AppLogManager", "delete success:");
                } else {
                    com.huawei.hianalytics.g.b.c("AppLogManager", "delete failed:");
                    z = false;
                }
            }
            if (i2 >= 5) {
                if (fileArr[0].delete()) {
                    com.huawei.hianalytics.g.b.c("AppLogManager", "delete success:");
                } else {
                    com.huawei.hianalytics.g.b.c("AppLogManager", "delete failed:");
                    z = false;
                }
            }
        }
        return z;
    }

    public static File[] a(String str) {
        return new File(str).listFiles();
    }

    public static File[] a(File[] fileArr) {
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            if (!"eventinfo.log".equals(file.getName())) {
                arrayList.add(file);
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }
}
