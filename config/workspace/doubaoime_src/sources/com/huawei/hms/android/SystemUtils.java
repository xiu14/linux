package com.huawei.hms.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.AndroidException;
import com.heytap.mcssdk.utils.d;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import e.a.a.a.a;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* loaded from: classes2.dex */
public class SystemUtils {
    public static final String PRODUCT_BRAND = "ro.product.brand";
    public static final String PRODUCT_HONOR = "HONOR";
    public static final String PRODUCT_HUAWEI = "HUAWEI";
    public static final String UNKNOWN = "unknown";

    private static String a() {
        return getSystemProperties("ro.product.locale", "");
    }

    private static String b() {
        return getSystemProperties("ro.product.locale.region", "");
    }

    public static String getAndoridVersion() {
        return getSystemProperties("ro.build.version.release", "unknown");
    }

    public static String getLocalCountry() {
        Locale locale = Locale.getDefault();
        return locale != null ? locale.getCountry() : "";
    }

    public static String getManufacturer() {
        return getSystemProperties("ro.product.manufacturer", "unknown");
    }

    public static long getMegabyte(double d2) {
        return (long) (d2 * 1000.0d * 1000.0d);
    }

    public static String getNetType(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? "" : activeNetworkInfo.getTypeName();
    }

    public static String getPhoneModel() {
        return getSystemProperties("ro.product.model", "unknown");
    }

    public static String getSystemProperties(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod(MonitorConstants.CONNECT_TYPE_GET, String.class, String.class).invoke(cls, str, str2);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.e("SystemUtils", "An exception occurred while reading: getSystemProperties:" + str);
            return str2;
        }
    }

    @Deprecated
    public static boolean isChinaROM() {
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            return "cn".equalsIgnoreCase(b);
        }
        String a = a();
        if (!TextUtils.isEmpty(a)) {
            return a.toLowerCase(Locale.US).contains("cn");
        }
        String localCountry = getLocalCountry();
        if (TextUtils.isEmpty(localCountry)) {
            return false;
        }
        return "cn".equalsIgnoreCase(localCountry);
    }

    public static boolean isEMUI() {
        StringBuilder M = a.M("is Emui :");
        int i = HwBuildEx.VERSION.EMUI_SDK_INT;
        M.append(i);
        HMSLog.i("SystemUtils", M.toString());
        return i > 0;
    }

    public static boolean isHuawei() {
        String systemProperties = getSystemProperties(PRODUCT_BRAND, "unknown");
        return PRODUCT_HUAWEI.equalsIgnoreCase(systemProperties) || PRODUCT_HONOR.equalsIgnoreCase(systemProperties);
    }

    public static boolean isSystemApp(Context context, String str) {
        if (context == null) {
            HMSLog.w("SystemUtils", "isSystemApp context is null");
            return false;
        }
        PackageInfo packageInfo = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (AndroidException e2) {
            HMSLog.e("SystemUtils", "isSystemApp Exception: " + e2);
        } catch (RuntimeException e3) {
            HMSLog.e("SystemUtils", "isSystemApp RuntimeException:" + e3);
        }
        return packageInfo != null && (packageInfo.applicationInfo.flags & 1) > 0;
    }

    public static boolean isTVDevice() {
        return getSystemProperties(d.f6924d, DownloadSettingKeys.BugFix.DEFAULT).equalsIgnoreCase("tv");
    }
}
