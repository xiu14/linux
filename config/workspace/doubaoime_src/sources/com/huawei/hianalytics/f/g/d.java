package com.huawei.hianalytics.f.g;

import android.content.Context;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public class d {
    private static final Object a = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.FileInputStream] */
    public static String a(Context context, String str) {
        FileInputStream fileInputStream;
        File file = new File(context.getFilesDir(), c(context, str));
        boolean z = false;
        if (file.exists()) {
            long length = file.length();
            if (length > 5242880) {
                com.huawei.hianalytics.g.b.b("HiAnalytics/event", "v1 cached file size overlarge - file len: %d limitedSize: %d", Long.valueOf(length), 5242880L);
            } else {
                z = true;
            }
        } else {
            com.huawei.hianalytics.g.b.b("HiAnalytics/event", "cached file not found");
        }
        ?? r0 = 0;
        if (!z) {
            return null;
        }
        synchronized (a) {
            try {
            } catch (Throwable th) {
                th = th;
                r0 = context;
            }
            try {
                com.huawei.hianalytics.util.a aVar = new com.huawei.hianalytics.util.a(2048);
                fileInputStream = context.openFileInput(c(context, str));
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        aVar.a(bArr, read);
                    }
                    if (aVar.a() == 0) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                            com.huawei.hianalytics.g.b.c("StorageUtil", "IOException happened when getInfoFromFile's FileOutputStream close");
                        }
                        return null;
                    }
                    String str2 = new String(aVar.b(), "UTF-8");
                    try {
                        fileInputStream.close();
                    } catch (IOException unused2) {
                        com.huawei.hianalytics.g.b.c("StorageUtil", "IOException happened when getInfoFromFile's FileOutputStream close");
                    }
                    return str2;
                } catch (FileNotFoundException unused3) {
                    com.huawei.hianalytics.g.b.c("StorageUtil", "getInfoFromFile(): is not found file");
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused4) {
                            com.huawei.hianalytics.g.b.c("StorageUtil", "IOException happened when getInfoFromFile's FileOutputStream close");
                        }
                    }
                    return null;
                } catch (IOException unused5) {
                    com.huawei.hianalytics.g.b.c("StorageUtil", "getInfoFromFile(): IOException");
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused6) {
                            com.huawei.hianalytics.g.b.c("StorageUtil", "IOException happened when getInfoFromFile's FileOutputStream close");
                        }
                    }
                    return null;
                }
            } catch (FileNotFoundException unused7) {
                fileInputStream = null;
            } catch (IOException unused8) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (r0 != 0) {
                    try {
                        r0.close();
                    } catch (IOException unused9) {
                        com.huawei.hianalytics.g.b.c("StorageUtil", "IOException happened when getInfoFromFile's FileOutputStream close");
                    }
                }
                throw th;
            }
        }
    }

    public static List<String> a(Context context) {
        return com.huawei.hianalytics.util.b.a(context);
    }

    public static void a(File file) {
        com.huawei.hianalytics.util.c.a(file);
    }

    public static void b(Context context, String str) {
        synchronized (a) {
            context.deleteFile(c(context, str));
        }
    }

    private static String c(Context context, String str) {
        return "hianalytics_" + str + BundleUtil.UNDERLINE_TAG + context.getPackageName();
    }
}
