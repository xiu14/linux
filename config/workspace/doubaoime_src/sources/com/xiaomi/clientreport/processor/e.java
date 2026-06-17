package com.xiaomi.clientreport.processor;

import android.text.TextUtils;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.push.y;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class e {
    public static void a(String str, com.xiaomi.clientreport.data.a[] aVarArr) {
        RandomAccessFile randomAccessFile;
        if (aVarArr == null || aVarArr.length <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        FileLock fileLock = null;
        try {
            File file = new File(str + ".lock");
            y.m850a(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable unused) {
            randomAccessFile = null;
        }
        try {
            fileLock = randomAccessFile.getChannel().lock();
            HashMap<String, String> m31a = m31a(str);
            for (com.xiaomi.clientreport.data.a aVar : aVarArr) {
                if (aVar != null) {
                    String a = a((PerfClientReport) aVar);
                    long j = ((PerfClientReport) aVar).perfCounts;
                    long j2 = ((PerfClientReport) aVar).perfLatencies;
                    if (!TextUtils.isEmpty(a) && j > 0 && j2 >= 0) {
                        a(m31a, a, j, j2);
                    }
                }
            }
            a(str, m31a);
            if (fileLock != null && fileLock.isValid()) {
                try {
                    fileLock.release();
                } catch (IOException e2) {
                    e = e2;
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e);
                    y.a(randomAccessFile);
                }
            }
        } catch (Throwable unused2) {
            try {
                com.xiaomi.channel.commonutils.logger.c.c("failed to write perf to file ");
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (IOException e3) {
                        e = e3;
                        com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e);
                        y.a(randomAccessFile);
                    }
                }
                y.a(randomAccessFile);
            } catch (Throwable th) {
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (IOException e4) {
                        com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e4);
                    }
                }
                y.a(randomAccessFile);
                throw th;
            }
        }
        y.a(randomAccessFile);
    }

    private static void a(HashMap<String, String> hashMap, String str, long j, long j2) {
        String str2;
        String str3 = hashMap.get(str);
        if (TextUtils.isEmpty(str3)) {
            hashMap.put(str, j + "#" + j2);
            return;
        }
        long[] m32a = m32a(str3);
        if (m32a != null && m32a[0] > 0 && m32a[1] >= 0) {
            str2 = (j + m32a[0]) + "#" + (j2 + m32a[1]);
        } else {
            str2 = j + "#" + j2;
        }
        hashMap.put(str, str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    protected static long[] m32a(String str) {
        long[] jArr = new long[2];
        try {
            String[] split = str.split("#");
            if (split.length >= 2) {
                jArr[0] = Long.parseLong(split[0].trim());
                jArr[1] = Long.parseLong(split[1].trim());
            }
            return jArr;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            return null;
        }
    }

    private static void a(String str, HashMap<String, String> hashMap) {
        BufferedWriter bufferedWriter;
        Throwable th;
        Exception e2;
        if (TextUtils.isEmpty(str) || hashMap == null || hashMap.size() == 0) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                try {
                    for (String str2 : hashMap.keySet()) {
                        bufferedWriter.write(str2 + "%%%" + hashMap.get(str2));
                        bufferedWriter.newLine();
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                    y.a(bufferedWriter);
                }
            } catch (Throwable th2) {
                th = th2;
                y.a(bufferedWriter);
                throw th;
            }
        } catch (Exception e4) {
            bufferedWriter = null;
            e2 = e4;
        } catch (Throwable th3) {
            bufferedWriter = null;
            th = th3;
            y.a(bufferedWriter);
            throw th;
        }
        y.a(bufferedWriter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* renamed from: a, reason: collision with other method in class */
    private static HashMap<String, String> m31a(String str) {
        BufferedReader bufferedReader;
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str) || !e.a.a.a.a.R0(str)) {
            return hashMap;
        }
        BufferedReader bufferedReader2 = null;
        ?? r1 = 0;
        BufferedReader bufferedReader3 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(str));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        ?? split = readLine.split("%%%");
                        r1 = split.length;
                        if (r1 >= 2) {
                            r1 = 0;
                            r1 = 0;
                            if (!TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                                r1 = split[0];
                                hashMap.put(r1, split[1]);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedReader3 = bufferedReader;
                        com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e);
                        y.a(bufferedReader3);
                        bufferedReader2 = bufferedReader3;
                        return hashMap;
                    } catch (Throwable th) {
                        th = th;
                        y.a(bufferedReader);
                        throw th;
                    }
                }
                y.a(bufferedReader);
                bufferedReader2 = r1;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.BufferedReader, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.String> a(android.content.Context r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.e.a(android.content.Context, java.lang.String):java.util.List");
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String[] m33a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("#");
    }

    private static PerfClientReport a(String str) {
        PerfClientReport perfClientReport = null;
        try {
            String[] m33a = m33a(str);
            if (m33a == null || m33a.length < 4 || TextUtils.isEmpty(m33a[0]) || TextUtils.isEmpty(m33a[1]) || TextUtils.isEmpty(m33a[2]) || TextUtils.isEmpty(m33a[3])) {
                return null;
            }
            perfClientReport = PerfClientReport.getBlankInstance();
            perfClientReport.production = Integer.parseInt(m33a[0]);
            perfClientReport.clientInterfaceId = m33a[1];
            perfClientReport.reportType = Integer.parseInt(m33a[2]);
            perfClientReport.code = Integer.parseInt(m33a[3]);
            return perfClientReport;
        } catch (Exception unused) {
            com.xiaomi.channel.commonutils.logger.c.c("parse per key error");
            return perfClientReport;
        }
    }

    private static PerfClientReport a(PerfClientReport perfClientReport, String str) {
        long[] m32a;
        if (perfClientReport == null || (m32a = m32a(str)) == null) {
            return null;
        }
        perfClientReport.perfCounts = m32a[0];
        perfClientReport.perfLatencies = m32a[1];
        return perfClientReport;
    }

    public static String a(PerfClientReport perfClientReport) {
        return perfClientReport.production + "#" + perfClientReport.clientInterfaceId + "#" + perfClientReport.reportType + "#" + perfClientReport.code;
    }
}
