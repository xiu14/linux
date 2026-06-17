package com.bytedance.apm.util;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public class b {
    private static int a = 0;
    private static long b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static long f3581c = -1;

    public static long a() {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/stat")), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
                try {
                    bufferedReader2.close();
                    return parseLong;
                } catch (Throwable unused) {
                    return parseLong;
                }
            } catch (Throwable unused2) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused3) {
                    }
                }
                return -1L;
            }
        } catch (Throwable unused4) {
        }
    }

    public static synchronized int b() {
        BufferedReader bufferedReader;
        Throwable th;
        synchronized (b.class) {
            int i = a;
            if (i != 0) {
                return i;
            }
            int i2 = 0;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"), 50);
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            if (readLine.startsWith("processor")) {
                                i2++;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (bufferedReader == null) {
                                throw th;
                            }
                            bufferedReader.close();
                            throw th;
                        }
                    }
                    bufferedReader.close();
                    a = i2;
                } catch (Throwable th3) {
                    bufferedReader = null;
                    th = th3;
                }
            } catch (Throwable unused) {
            }
            return a;
        }
    }

    public static long c(File file) {
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles == null) {
            return 0L;
        }
        for (File file2 : listFiles) {
            j = (file2.isDirectory() ? c(file2) : file2.length()) + j;
        }
        return j;
    }

    public static long d() {
        if (f3581c == -1) {
            try {
                f3581c = Runtime.getRuntime().maxMemory();
            } catch (Exception unused) {
            }
        }
        return f3581c;
    }

    public static long e(long j) {
        if (b == -1) {
            long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
            if (sysconf > 0) {
                j = sysconf;
            }
            b = j;
        }
        return b;
    }
}
