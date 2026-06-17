package com.huawei.hianalytics.util;

import java.io.File;

/* loaded from: classes2.dex */
public class c {
    public static void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            if (file.delete()) {
                return;
            }
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "remover file fail!");
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "not have file remove!");
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2);
            } else if (!file2.delete()) {
                com.huawei.hianalytics.g.b.d("HianalyticsSDK", "remover file fail!");
            }
        }
    }
}
