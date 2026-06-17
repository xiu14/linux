package com.huawei.hianalytics.log.e;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* loaded from: classes2.dex */
public class f {
    public static String a() {
        String format = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.getDefault()).format(Calendar.getInstance().getTime());
        return Process.myPid() + BundleUtil.UNDERLINE_TAG + format + ".log";
    }

    public static void a(Context context, String str) {
        float f2 = 3.0f;
        try {
            float parseFloat = Float.parseFloat(str.split(ContainerUtils.KEY_VALUE_DELIMITER)[1].trim());
            if (parseFloat <= 3.0f) {
                f2 = parseFloat < 0.0f ? 0.0f : parseFloat;
            }
        } catch (NumberFormatException unused) {
            com.huawei.hianalytics.g.b.d("AppLogApi/LogUtil", "The cycle of the server returns : " + str);
            f2 = 1.0f;
        }
        com.huawei.hianalytics.g.b.b("AppLogApi/LogUtil", "setpolicy cycle : " + f2);
        c.a(c.b(context), "autocheck_policy", Float.valueOf(1.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if ((r2 - r6) > r10) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r14) {
        /*
            r0 = 0
            java.lang.String r1 = "AppLogApi/LogUtil"
            if (r14 != 0) goto Lb
            java.lang.String r14 = "No init of logServer!"
            com.huawei.hianalytics.g.b.c(r1, r14)
            return r0
        Lb:
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r14 = com.huawei.hianalytics.log.e.c.b(r14)
            r4 = -1
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            java.lang.String r7 = "autocheck_starttime"
            java.lang.Object r6 = com.huawei.hianalytics.log.e.c.b(r14, r7, r6)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "checkPolicyOver beforeTimeMillis : "
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            com.huawei.hianalytics.g.b.b(r1, r8)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 1
            if (r4 != 0) goto L42
            java.lang.String r14 = "checkPolicyOver beforeTimeMillis is first!"
            com.huawei.hianalytics.g.b.c(r1, r14)
        L40:
            r0 = r5
            goto L7e
        L42:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r8 = java.lang.Float.valueOf(r4)
            java.lang.String r9 = "autocheck_policy"
            java.lang.Object r8 = com.huawei.hianalytics.log.e.c.b(r14, r9, r8)
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            r10 = 1285868416(0x4ca4cb80, float:8.64E7)
            float r10 = r10 * r8
            long r10 = (long) r10
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "checkPolicyOver policy : "
            r12.<init>(r13)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            com.huawei.hianalytics.g.b.b(r1, r12)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L78
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            com.huawei.hianalytics.log.e.c.a(r14, r9, r0)
            goto L40
        L78:
            long r2 = r2 - r6
            int r14 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r14 <= 0) goto L7e
            goto L40
        L7e:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r2 = "checkPolicyOver() No upload cycle :  "
            r14.<init>(r2)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            com.huawei.hianalytics.g.b.b(r1, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hianalytics.log.e.f.a(android.content.Context):boolean");
    }

    public static boolean a(String str) {
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }

    public static boolean a(File[] fileArr) {
        for (File file : fileArr) {
            if (!file.getName().contains("Crash")) {
                if (!file.delete()) {
                    return true;
                }
                com.huawei.hianalytics.g.b.c("AppLogApi/LogUtil", "Logzips folder is larger than 1.8M, and the first file is deleted. ");
                return true;
            }
        }
        return false;
    }

    public static int b(File[] fileArr) {
        String str;
        int length = fileArr.length;
        int i = 0;
        for (File file : fileArr) {
            String path = file.getPath();
            if (!path.endsWith(".log") && !path.endsWith(".zip")) {
                if (file.delete()) {
                    i++;
                    str = "del filter file :";
                } else {
                    str = "del file failed.";
                }
                com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", str);
            }
        }
        return length - i;
    }

    public static String b() {
        return new SimpleDateFormat("yy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(Calendar.getInstance().getTime());
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str) || new File(str).delete()) {
            return;
        }
        com.huawei.hianalytics.g.b.d("AppLogApi/LogUtil", "delete file fail");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r13 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.content.Context r13) {
        /*
            r0 = 0
            java.lang.String r1 = "AppLogApi/LogUtil"
            if (r13 != 0) goto Lb
            java.lang.String r13 = "No init of logServer!"
            com.huawei.hianalytics.g.b.d(r1, r13)
            return r0
        Lb:
            android.content.SharedPreferences r2 = com.huawei.hianalytics.log.e.c.b(r13)
            long r3 = java.lang.System.currentTimeMillis()
            r5 = -1
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            java.lang.String r8 = "autocheck_tenminstarttime"
            java.lang.Object r7 = com.huawei.hianalytics.log.e.c.b(r2, r8, r7)
            java.lang.Long r7 = (java.lang.Long) r7
            long r9 = r7.longValue()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r11 = "checkTimeOver beforeTimeMillis : "
            r7.<init>(r11)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.huawei.hianalytics.g.b.b(r1, r7)
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r6 = 1
            if (r5 == 0) goto L7d
            long r9 = r3 - r9
            r11 = 600000(0x927c0, double:2.964394E-318)
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 <= 0) goto L8a
            android.content.pm.PackageManager r5 = r13.getPackageManager()
            java.lang.String r7 = r13.getPackageName()
            java.lang.String r9 = "android.permission.ACCESS_NETWORK_STATE"
            int r5 = r5.checkPermission(r9, r7)
            if (r5 == 0) goto L5d
            java.lang.String r13 = "HiAnalytics/logServer"
            java.lang.String r5 = "not have network state phone permission!"
            com.huawei.hianalytics.g.b.c(r13, r5)
        L5b:
            r13 = r0
            goto L7b
        L5d:
            java.lang.String r5 = "connectivity"
            java.lang.Object r13 = r13.getSystemService(r5)
            android.net.ConnectivityManager r13 = (android.net.ConnectivityManager) r13
            if (r13 != 0) goto L68
            goto L5b
        L68:
            android.net.NetworkInfo r13 = r13.getActiveNetworkInfo()
            if (r13 == 0) goto L5b
            boolean r5 = r13.isConnected()
            if (r5 == 0) goto L5b
            boolean r13 = r13.isAvailable()
            if (r13 == 0) goto L5b
            r13 = r6
        L7b:
            if (r13 == 0) goto L8a
        L7d:
            java.lang.Long r13 = java.lang.Long.valueOf(r3)
            com.huawei.hianalytics.log.e.c.a(r2, r8, r13)
            java.lang.String r13 = "setTenMinAutoCheckTime!"
            com.huawei.hianalytics.g.b.b(r1, r13)
            r0 = r6
        L8a:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r2 = "checkTimeOver "
            r13.<init>(r2)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.huawei.hianalytics.g.b.c(r1, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hianalytics.log.e.f.b(android.content.Context):boolean");
    }

    public static boolean a(File[] fileArr, File file) {
        FileOutputStream fileOutputStream;
        synchronized (f.class) {
            byte[] bArr = new byte[1024];
            ZipOutputStream zipOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    ZipOutputStream zipOutputStream2 = new ZipOutputStream(fileOutputStream2);
                    if (fileArr != null) {
                        try {
                            if (fileArr.length > 0) {
                                int length = fileArr.length;
                                int i = 0;
                                int i2 = 0;
                                while (i < length) {
                                    File file2 = fileArr[i];
                                    if (file2.length() > 1887436.8d) {
                                        if (file2.delete()) {
                                            com.huawei.hianalytics.g.b.b("AppLogApi/LogUtil", "Delete a file larger than 1.8M");
                                        }
                                        fileOutputStream = fileOutputStream2;
                                    } else {
                                        FileInputStream fileInputStream = new FileInputStream(file2);
                                        try {
                                            zipOutputStream2.putNextEntry(new ZipEntry(file2.getName()));
                                            long length2 = file2.length();
                                            fileOutputStream = fileOutputStream2;
                                            if (i2 + length2 <= 1887436.8d) {
                                                while (true) {
                                                    try {
                                                        try {
                                                            int read = fileInputStream.read(bArr);
                                                            if (read <= 0) {
                                                                break;
                                                            }
                                                            i2 += read;
                                                            zipOutputStream2.write(bArr, 0, read);
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            d.a(1, fileInputStream);
                                                            throw th;
                                                        }
                                                    } catch (IOException unused) {
                                                        com.huawei.hianalytics.g.b.d("AppLogApi/LogUtil", "createLogZipWithLock() Stream Exception!");
                                                        d.a(1, fileInputStream);
                                                        i++;
                                                        fileOutputStream2 = fileOutputStream;
                                                    }
                                                }
                                            }
                                            zipOutputStream2.flush();
                                        } catch (IOException unused2) {
                                            fileOutputStream = fileOutputStream2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            fileOutputStream = fileOutputStream2;
                                        }
                                        try {
                                            d.a(1, fileInputStream);
                                        } catch (FileNotFoundException unused3) {
                                            zipOutputStream = zipOutputStream2;
                                            try {
                                                com.huawei.hianalytics.g.b.c("HiAnalytics/logServer", "checkUploadLog,file not found !");
                                                d.a(5, zipOutputStream);
                                                d.a(6, fileOutputStream);
                                                return false;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                d.a(5, zipOutputStream);
                                                d.a(6, fileOutputStream);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            zipOutputStream = zipOutputStream2;
                                            d.a(5, zipOutputStream);
                                            d.a(6, fileOutputStream);
                                            throw th;
                                        }
                                    }
                                    i++;
                                    fileOutputStream2 = fileOutputStream;
                                }
                            }
                        } catch (FileNotFoundException unused4) {
                            fileOutputStream = fileOutputStream2;
                        } catch (Throwable th5) {
                            th = th5;
                            fileOutputStream = fileOutputStream2;
                        }
                    }
                    FileOutputStream fileOutputStream3 = fileOutputStream2;
                    d.a(5, zipOutputStream2);
                    d.a(6, fileOutputStream3);
                    return true;
                } catch (FileNotFoundException unused5) {
                    fileOutputStream = fileOutputStream2;
                } catch (Throwable th6) {
                    th = th6;
                    fileOutputStream = fileOutputStream2;
                }
            } catch (FileNotFoundException unused6) {
                fileOutputStream = null;
            } catch (Throwable th7) {
                th = th7;
                fileOutputStream = null;
            }
        }
    }
}
