package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class j {
    private static String a = null;

    /* renamed from: a, reason: collision with other field name */
    private static final Set<String> f859a;
    private static String b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f9270c = "";

    /* renamed from: d, reason: collision with root package name */
    private static String f9271d;

    /* renamed from: e, reason: collision with root package name */
    private static String f9272e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f9273f = String.valueOf((char) 2);

    /* renamed from: a, reason: collision with other field name */
    private static final String[] f860a = {"--", "a-", "u-", "v-", "o-", "g-", "d-"};

    static {
        HashSet hashSet = new HashSet();
        f859a = hashSet;
        hashSet.add("com.xiaomi.xmsf");
        hashSet.add("com.xiaomi.finddevice");
        hashSet.add("com.miui.securitycenter");
    }

    private static double a(double d2) {
        int i = 1;
        while (true) {
            double d3 = i;
            if (d3 >= d2) {
                return d3;
            }
            i <<= 1;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String m614a(int i) {
        if (i > 0) {
            String[] strArr = f860a;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return f860a[0];
    }

    public static int b() {
        BufferedReader bufferedReader;
        String[] split;
        int i = 0;
        if (e.a.a.a.a.R0("/proc/meminfo")) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
                } catch (IOException unused) {
                }
                try {
                    String readLine = bufferedReader.readLine();
                    if (!TextUtils.isEmpty(readLine) && (split = readLine.split("\\s+")) != null && split.length >= 2 && TextUtils.isDigitsOnly(split[1])) {
                        i = Integer.parseInt(split[1]);
                    }
                    bufferedReader.close();
                } catch (Exception unused2) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return i;
                } catch (Throwable th) {
                    bufferedReader2 = bufferedReader;
                    th = th;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused4) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return i;
    }

    @Deprecated
    public static String b(Context context) {
        return null;
    }

    public static String c() {
        return b() + "KB";
    }

    @Deprecated
    public static String c(Context context) {
        return null;
    }

    public static String d() {
        return (a(Environment.getDataDirectory()) / DownloadConstants.KB) + "KB";
    }

    @Deprecated
    public static String d(Context context) {
        return null;
    }

    @Deprecated
    public static String e(Context context) {
        return "";
    }

    public static String f(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
    }

    private static String g(Context context) {
        String string = context.getSharedPreferences("device_info", 0).getString("default_id", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String h = h(context);
        a(context, h);
        return h;
    }

    private static String h(Context context) {
        String str = Build.BRAND;
        String a2 = l.a();
        int i = Build.VERSION.SDK_INT;
        String str2 = Build.VERSION.RELEASE;
        String e2 = k.e();
        int a3 = a();
        String packageName = context.getPackageName();
        long currentTimeMillis = System.currentTimeMillis();
        String a4 = bm.a(16);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(a2);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(i);
        e.a.a.a.a.M0(sb, BundleUtil.UNDERLINE_TAG, str2, BundleUtil.UNDERLINE_TAG, e2);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(a3);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(packageName);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(currentTimeMillis);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(a4);
        return bj.a(sb.toString());
    }

    public static synchronized String a(Context context, boolean z) {
        String str;
        int i;
        synchronized (j.class) {
            if (f9271d == null) {
                String mo101a = aq.a(context).mo101a();
                if (TextUtils.isEmpty(mo101a) || mo101a.startsWith("00000000-0000-0000-0000-000000000000")) {
                    mo101a = a(context);
                    if (TextUtils.isEmpty(mo101a)) {
                        mo101a = g(context);
                        i = 6;
                    } else {
                        i = 5;
                    }
                } else {
                    i = 4;
                }
                com.xiaomi.channel.commonutils.logger.c.b("devid rule select:" + i);
                if (i == 3) {
                    f9271d = mo101a;
                } else {
                    f9271d = m614a(i) + bm.b(mo101a);
                }
            }
            str = f9271d;
        }
        return str;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static String m618b() {
        return a(((a(Environment.getDataDirectory()) / 1024.0d) / 1024.0d) / 1024.0d) + "GB";
    }

    public static String a(Context context) {
        if (!k.m655a(context)) {
            return null;
        }
        String str = b;
        if (str != null) {
            return str;
        }
        try {
            b = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.m15a("failure to get androidId: " + th);
        }
        return b;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m619b(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null || powerManager.isScreenOn();
    }

    @TargetApi(17)
    public static int a() {
        Object a2 = bh.a("android.os.UserHandle", "myUserId", new Object[0]);
        if (a2 == null) {
            return -1;
        }
        return ((Integer) Integer.class.cast(a2)).intValue();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m613a() {
        return a(b()) + "GB";
    }

    private static float a(int i) {
        float f2 = ((((((i + 102400) / 524288) + 1) * 512) * 1024) / 1024.0f) / 1024.0f;
        double d2 = f2;
        return d2 > 0.5d ? (float) Math.ceil(d2) : f2;
    }

    private static long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m616a(Context context) {
        boolean z = true;
        try {
            Intent a2 = n.a(context, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (a2 == null) {
                return false;
            }
            int intExtra = a2.getIntExtra("status", -1);
            if (intExtra != 2 && intExtra != 5) {
                z = false;
            }
            return z;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.b("DeviceInfo", "getChargingStatus error", e2);
            return false;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m615a() {
        return a() <= 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m617a(Context context, String str) {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo = (PackageInfo) bh.a((Object) context.getPackageManager(), "getPackageInfoAsUser", str, 0, 999);
        return packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 8388608) != 8388608;
    }

    private static void a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info", 0);
        if (TextUtils.isEmpty(sharedPreferences.getString("default_id", null))) {
            sharedPreferences.edit().putString("default_id", str).apply();
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("default_id exist,do not change it.");
        }
    }
}
