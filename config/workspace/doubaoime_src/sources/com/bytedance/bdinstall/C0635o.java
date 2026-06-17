package com.bytedance.bdinstall;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.bdinstall.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635o {
    private static Map<String, String> a = new ConcurrentHashMap(4);

    private C0635o() {
    }

    public static void b(Context context, Q q) {
        String str;
        if (context == null || q == null) {
            return;
        }
        a.remove(q.i());
        com.bytedance.bdinstall.util.g.d(context, q).edit().remove("cdid").apply();
        if (q.O) {
            str = com.bytedance.bdinstall.util.g.e();
        } else {
            str = com.bytedance.bdinstall.util.g.e() + BundleUtil.UNDERLINE_TAG + q.h();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        if (sharedPreferences.contains("cdid")) {
            sharedPreferences.edit().remove("cdid").apply();
        }
    }

    public static String c(Q q) {
        String str = null;
        if (q == null) {
            return null;
        }
        String i = q.i();
        String str2 = a.get(i);
        if (str2 == null) {
            synchronized (C0635o.class) {
                if (str2 == null) {
                    if (e0.f(q.q())) {
                        str = d(q);
                        a.put(i, str);
                        c0.c(q.q()).e(q.i(), "cdid", str);
                    } else {
                        Context q2 = q.q();
                        if (q2 != null) {
                            c0.c(q2).d(q.i(), "cdid", new C0634n());
                            str = a.get(q.i());
                        }
                    }
                    str2 = str;
                }
            }
        }
        return str2;
    }

    private static String d(Q q) {
        String str;
        SharedPreferences d2 = com.bytedance.bdinstall.util.g.d(q.q(), q);
        String string = d2.getString("cdid", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        if (q.O) {
            str = com.bytedance.bdinstall.util.g.e();
        } else {
            str = com.bytedance.bdinstall.util.g.e() + BundleUtil.UNDERLINE_TAG + q.h();
        }
        SharedPreferences sharedPreferences = q.q().getSharedPreferences(str, 0);
        String string2 = sharedPreferences.getString("cdid", null);
        if (TextUtils.isEmpty(string2)) {
            string2 = UUID.randomUUID().toString();
        }
        String str2 = string2;
        sharedPreferences.edit().putString("cdid", str2).apply();
        d2.edit().putString("cdid", str2).putBoolean("cdid_migrate", true).apply();
        return str2;
    }

    public static String e(Context context) {
        if (context == null) {
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(com.bytedance.bdinstall.util.g.e(), 0);
        String string = sharedPreferences.getString("cdid", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        sharedPreferences.edit().putString("cdid", uuid).apply();
        return uuid;
    }
}
