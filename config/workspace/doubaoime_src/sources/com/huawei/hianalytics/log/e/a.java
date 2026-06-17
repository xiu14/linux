package com.huawei.hianalytics.log.e;

import android.content.Context;
import com.huawei.hianalytics.log.b.a;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public class a {
    public static synchronized void a(Context context) {
        synchronized (a.class) {
            if (context != null) {
                com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "Clear all data of local log");
                b(new File(context.getFilesDir().getPath() + a.C0347a.a));
            }
        }
    }

    public static void a(File file) {
        com.huawei.hianalytics.util.c.a(file);
    }

    public static void a(String str) {
        String str2;
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                if (name.endsWith(".log") || name.endsWith(".zip")) {
                    if (!"eventinfo.log".equals(name)) {
                        long j = 0;
                        try {
                            Date parse = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.getDefault()).parse(name.substring(0, name.lastIndexOf(".")).split(BundleUtil.UNDERLINE_TAG)[r4.length - 1].trim());
                            if (parse != null) {
                                j = parse.getTime();
                            }
                        } catch (ParseException unused) {
                            com.huawei.hianalytics.g.b.c("HiAnalytics/logServer", "Time conversion Exception : getTimeMillis!");
                        }
                        if (System.currentTimeMillis() - j >= 604800000 && file.delete()) {
                            str2 = "out time file del ok";
                            com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", str2);
                        }
                    }
                } else if (file.delete()) {
                    str2 = "this file is not our fileName :" + name;
                    com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", str2);
                }
            }
        }
    }

    public static void b(File file) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                if (file.delete()) {
                    return;
                }
                com.huawei.hianalytics.g.b.c("HiAnalytics/logServer", "refresh clear file fail");
                return;
            }
            if (file.isDirectory()) {
                String[] list = file.list();
                if (list == null) {
                    if (file.delete()) {
                        return;
                    }
                    com.huawei.hianalytics.g.b.c("HiAnalytics/logServer", "refresh clear file fail");
                    return;
                }
                for (String str : list) {
                    b(new File(file, str));
                }
                if (file.delete()) {
                    return;
                }
                com.huawei.hianalytics.g.b.c("HiAnalytics/logServer", "refresh clear file fail");
            }
        }
    }
}
