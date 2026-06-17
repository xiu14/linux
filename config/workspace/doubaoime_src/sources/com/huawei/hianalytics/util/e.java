package com.huawei.hianalytics.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hms.framework.common.BundleUtil;

/* loaded from: classes2.dex */
public class e {
    public static SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences(b(context, str), 0);
    }

    public static void a(SharedPreferences sharedPreferences, String str, Object obj) {
        if (sharedPreferences == null || str == null || str.isEmpty()) {
            com.huawei.hianalytics.g.b.b("HiAnalyticsSharedPreference", "sp/spKey is null");
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            edit.putLong(str, ((Long) obj).longValue());
        } else {
            edit.putString(str, (String) obj);
        }
        edit.commit();
    }

    public static Object b(SharedPreferences sharedPreferences, String str, Object obj) {
        if (sharedPreferences == null || str == null || str.isEmpty()) {
            return "";
        }
        try {
        } catch (ClassCastException unused) {
            com.huawei.hianalytics.g.b.c("HiAnalyticsSharedPreference", "getInfoFromSP() class cast Exception !");
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
        }
        if (obj instanceof String) {
            return sharedPreferences.getString(str, (String) obj);
        }
        return obj;
    }

    public static String b(Context context, String str) {
        return "hianalytics_" + str + BundleUtil.UNDERLINE_TAG + context.getPackageName();
    }
}
