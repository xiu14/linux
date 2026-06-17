package com.huawei.hianalytics.d;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.e.d;
import com.huawei.hianalytics.util.g;

/* loaded from: classes2.dex */
public abstract class c {
    public static String a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(com.huawei.hianalytics.a.a.c(str, str2))) {
            return com.huawei.hianalytics.a.a.c(str, str2);
        }
        com.huawei.hianalytics.g.b.b("HianalyticsSDK", "getAndroidId(): to getConfigByType()");
        if (!com.huawei.hianalytics.a.a.i(str, str2)) {
            return "";
        }
        if (TextUtils.isEmpty(com.huawei.hianalytics.a.b.d())) {
            com.huawei.hianalytics.e.a.a().f().f(com.huawei.hianalytics.c.c.d(context));
        }
        return com.huawei.hianalytics.a.b.d();
    }

    public static String a(String str, String str2) {
        return com.huawei.hianalytics.a.c.e(str, str2);
    }

    public static void a(int i) {
        com.huawei.hianalytics.e.a.a().f().a(i);
    }

    public static void a(String str) {
        com.huawei.hianalytics.e.a.a().f().h(str);
    }

    public static void a(boolean z) {
        com.huawei.hianalytics.e.a.a().f().b(z);
    }

    public static String b(Context context, String str, String str2) {
        if (!"oper".equals(str2) && !"maint".equals(str2) && !"diffprivacy".equals(str2) && !"preins".equals(str2)) {
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "getChannel(): Invalid type: " + str2);
            return "";
        }
        return d(context, str, str2);
    }

    public static String b(String str, String str2) {
        return com.huawei.hianalytics.a.c.d(str, str2);
    }

    public static boolean c(String str, String str2) {
        return com.huawei.hianalytics.a.c.i(str, str2);
    }

    private static String d(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(com.huawei.hianalytics.a.c.b(str, str2))) {
            return com.huawei.hianalytics.a.c.b(str, str2);
        }
        d f2 = com.huawei.hianalytics.e.a.a().f();
        if (TextUtils.isEmpty(f2.d())) {
            String f3 = com.huawei.hianalytics.c.c.f(context);
            if (!g.a("channel", f3, 256)) {
                f3 = "";
            }
            f2.b(f3);
        }
        return f2.d();
    }
}
