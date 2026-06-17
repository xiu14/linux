package com.ttnet.org.chromium.base;

import android.app.ActivityManager;
import android.os.StrictMode;
import android.util.Log;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class SysUtils {
    private static Boolean a;
    private static Integer b;

    private SysUtils() {
    }

    private static int a() {
        Pattern compile = Pattern.compile("^MemTotal:\\s+([0-9]+) kB$");
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                FileReader fileReader = new FileReader("/proc/meminfo");
                try {
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                Log.w("SysUtils", "/proc/meminfo lacks a MemTotal entry?");
                                break;
                            }
                            Matcher matcher = compile.matcher(readLine);
                            if (matcher.find()) {
                                int parseInt = Integer.parseInt(matcher.group(1));
                                if (parseInt > 1024) {
                                    return parseInt;
                                }
                                Log.w("SysUtils", "Invalid /proc/meminfo total size in kB: " + matcher.group(1));
                            }
                        } finally {
                            bufferedReader.close();
                        }
                    }
                } finally {
                    fileReader.close();
                }
            } catch (Exception e2) {
                Log.w("SysUtils", "Cannot get total physical size from /proc/meminfo", e2);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return 0;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @CalledByNative
    public static int amountOfPhysicalMemoryKB() {
        if (b == null) {
            b = Integer.valueOf(a());
        }
        return b.intValue();
    }

    @CalledByNative
    public static boolean isCurrentlyLowMemory() {
        ActivityManager activityManager = (ActivityManager) c.b().getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    @CalledByNative
    public static boolean isLowEndDevice() {
        if (a == null) {
            if (!b.a().b("enable-low-end-device-mode")) {
                if (b.a().b("disable-low-end-device-mode")) {
                    r1 = false;
                } else {
                    Integer valueOf = Integer.valueOf(a());
                    b = valueOf;
                    boolean z = valueOf.intValue() > 0 && b.intValue() / 1024 <= 1024;
                    com.ttnet.org.chromium.base.k.b.b("Android.SysUtilsLowEndMatches", z == (c.b() != null ? ((ActivityManager) c.b().getSystemService("activity")).isLowRamDevice() : false));
                    r1 = z;
                }
            }
            a = Boolean.valueOf(r1);
        }
        return a.booleanValue();
    }
}
