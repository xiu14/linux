package com.huawei.hianalytics.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import com.huawei.hianalytics.util.f;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public abstract class c {
    public static String a() {
        String str;
        String str2 = "";
        try {
            String str3 = (String) Class.forName("com.huawei.android.os.BuildEx").getMethod("getUDID", new Class[0]).invoke(null, new Object[0]);
            try {
                com.huawei.hianalytics.g.b.b("HianalyticsSDK", "getUDID success");
                return str3;
            } catch (AndroidRuntimeException unused) {
                str2 = str3;
                str = "getUDID getudid failed, RuntimeException is AndroidRuntimeException";
                com.huawei.hianalytics.g.b.c("HianalyticsSDK", str);
                return str2;
            } catch (ClassNotFoundException unused2) {
                str2 = str3;
                str = "getUDID method invoke failed";
                com.huawei.hianalytics.g.b.c("HianalyticsSDK", str);
                return str2;
            } catch (IllegalAccessException unused3) {
                str2 = str3;
                str = "getUDID method invoke failed : Illegal AccessException";
                com.huawei.hianalytics.g.b.c("HianalyticsSDK", str);
                return str2;
            } catch (IllegalArgumentException unused4) {
                str2 = str3;
                str = "getUDID method invoke failed : Illegal ArgumentException";
                com.huawei.hianalytics.g.b.c("HianalyticsSDK", str);
                return str2;
            } catch (NoSuchMethodException unused5) {
                str2 = str3;
                str = "getUDID method invoke failed : NoSuchMethodException";
                com.huawei.hianalytics.g.b.c("HianalyticsSDK", str);
                return str2;
            } catch (InvocationTargetException unused6) {
                str2 = str3;
                str = "getUDID method invoke failed : InvocationTargetException";
                com.huawei.hianalytics.g.b.c("HianalyticsSDK", str);
                return str2;
            }
        } catch (AndroidRuntimeException unused7) {
        } catch (ClassNotFoundException unused8) {
        } catch (IllegalAccessException unused9) {
        } catch (IllegalArgumentException unused10) {
        } catch (NoSuchMethodException unused11) {
        } catch (InvocationTargetException unused12) {
        }
    }

    public static String a(Context context) {
        return context == null ? "" : context.getPackageName();
    }

    public static String b() {
        return f.b("ro.build.version.emui", "");
    }

    public static String b(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(a(context), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "getVersion(): The package name is not correct!");
            return "";
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String c(Context context) {
        if (f.a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? telephonyManager.getDeviceId() : "";
        } catch (SecurityException unused) {
            com.huawei.hianalytics.g.b.d("HianalyticsSDK", "getDeviceID Incorrect permissions!");
            return "";
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String d(Context context) {
        return context == null ? "" : Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String e(Context context) {
        String str = Build.SERIAL;
        if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("unknown")) {
            return str;
        }
        com.huawei.hianalytics.g.b.a("HianalyticsSDK", "getSerial : is executed.");
        if (context == null || f.a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        try {
            return Build.getSerial();
        } catch (SecurityException unused) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "getSerial() Incorrect permissions!");
            return "";
        }
    }

    public static String f(Context context) {
        Bundle bundle;
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("CHANNEL")) == null) {
                return "Unknown";
            }
            String obj2 = obj.toString();
            return obj2.length() > 256 ? "Unknown" : obj2;
        } catch (PackageManager.NameNotFoundException unused) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "getChannel(): The packageName is not correct!");
            return "Unknown";
        }
    }

    public static Pair<String, String> g(Context context) {
        if (f.a(context, "android.permission.READ_PHONE_STATE")) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "getMccAndMnc() Pair value is empty");
            return new Pair<>("", "");
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null && telephonyManager.getSimState() == 5) {
            String networkOperator = telephonyManager.getNetworkOperator();
            return (TextUtils.isEmpty(networkOperator) || TextUtils.equals(networkOperator, "null")) ? new Pair<>("", "") : networkOperator.length() > 3 ? new Pair<>(networkOperator.substring(0, 3), networkOperator.substring(3)) : new Pair<>("", "");
        }
        return new Pair<>("", "");
    }
}
