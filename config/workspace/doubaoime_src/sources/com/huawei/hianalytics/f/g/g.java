package com.huawei.hianalytics.f.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class g {
    public static String a(Context context) {
        return (String) b(d(context, "global_v2"), "app_ver", "");
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences == null) {
            return null;
        }
        String str2 = (String) b(sharedPreferences, str, "");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(str);
        edit.apply();
        return str2;
    }

    public static Set<String> a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getAll().keySet();
    }

    public static void a(Context context, String str) {
        a(d(context, "global_v2"), "app_ver", str);
    }

    public static void a(Context context, String str, String str2) {
        File filesDir = context.getFilesDir();
        StringBuilder M = e.a.a.a.a.M(str);
        M.append(com.huawei.hianalytics.util.e.b(context, str2));
        M.append(".xml");
        File file = new File(filesDir, M.toString());
        if (file.exists() && file.delete()) {
            com.huawei.hianalytics.g.b.c("SharedPreferenceUtil", "delete sp file");
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor edit = d(context, str2).edit();
        edit.putString(str3, str);
        edit.commit();
    }

    public static void a(SharedPreferences sharedPreferences, String str, Object obj) {
        com.huawei.hianalytics.util.e.a(sharedPreferences, str, obj);
    }

    public static void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.hianalytics.g.b.c("SharedPreferenceUtil", "clearTypeDataByTag() eventTag is null or empty!");
            return;
        }
        if ("_default_config_tag".equals(str)) {
            a(str, false, context);
            return;
        }
        String s = e.a.a.a.a.s(str, "-oper");
        String s2 = e.a.a.a.a.s(str, "-maint");
        a(s, false, context);
        a(s2, false, context);
        a(str + "-diffprivacy", false, context);
    }

    @SuppressLint({"ApplySharedPref"})
    public static synchronized void a(String str, boolean z, Context context) {
        synchronized (g.class) {
            com.huawei.hianalytics.g.b.b("SharedPreferenceUtil", "clear data file : eventTag : " + str);
            SharedPreferences d2 = d(context, "stat_v2_1");
            if (d2 != null) {
                SharedPreferences.Editor edit = d2.edit();
                if (z) {
                    edit.clear();
                } else {
                    edit.remove(str);
                }
                edit.commit();
            }
            SharedPreferences d3 = d(context, "cached_v2_1");
            if (d3 != null) {
                SharedPreferences.Editor edit2 = d3.edit();
                if (z) {
                    edit2.clear();
                } else {
                    edit2.remove(str);
                }
                edit2.commit();
            }
        }
    }

    public static void a(Set<String> set, Set<String> set2, Context context) {
        for (String str : set2) {
            if (!set.contains(str)) {
                a(str, false, context);
            }
        }
    }

    public static boolean a(Context context, String str, int i) {
        long length = c(context, str).length();
        if (length <= i) {
            return false;
        }
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "reach local file limited size - file len: %d limitedSize: %d", Long.valueOf(length), Integer.valueOf(i));
        return true;
    }

    public static long b(Context context, String str) {
        return c(context, str).length();
    }

    public static Object b(SharedPreferences sharedPreferences, String str, Object obj) {
        return com.huawei.hianalytics.util.e.b(sharedPreferences, str, obj);
    }

    public static Map<String, String> b(SharedPreferences sharedPreferences) {
        Set<String> a = a(sharedPreferences);
        HashMap hashMap = new HashMap(a.size());
        for (String str : a) {
            hashMap.put(str, (String) b(sharedPreferences, str, ""));
        }
        return hashMap;
    }

    public static boolean b(Context context) {
        long longValue = ((Long) b(d(context, "analytics_key"), "flashKeyTime", -1L)).longValue();
        if (longValue == -1) {
            longValue = ((Long) b(d(context, "Privacy_MY"), "flashKeyTime", -1L)).longValue();
        }
        return System.currentTimeMillis() - longValue > com.heytap.mcssdk.constant.a.f6889g;
    }

    public static File c(Context context, String str) {
        String str2 = "hianalytics_" + str + BundleUtil.UNDERLINE_TAG + context.getPackageName() + ".xml";
        return new File(context.getFilesDir(), "../shared_prefs/" + str2);
    }

    public static SharedPreferences d(Context context, String str) {
        return com.huawei.hianalytics.util.e.a(context, str);
    }

    public static void e(Context context, String str) {
        SharedPreferences d2 = d(context, "backup_event");
        if (d2 == null || !d2.contains(str)) {
            return;
        }
        com.huawei.hianalytics.g.b.b("SharedPreferenceUtil", "begin clear backup data! spKey:" + str);
        SharedPreferences.Editor edit = d2.edit();
        edit.remove(str);
        edit.commit();
    }
}
