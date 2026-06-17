package com.bytedance.news.common.settings.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.news.common.settings.SettingsConfigProvider;
import com.huawei.hms.framework.common.BundleUtil;

/* loaded from: classes.dex */
public class g {
    private static volatile g b;
    private SharedPreferences a;

    private g(Context context) {
        SettingsConfigProvider settingsConfigProvider = (SettingsConfigProvider) com.bytedance.news.common.service.manager.c.a(SettingsConfigProvider.class);
        if (settingsConfigProvider != null && settingsConfigProvider.getConfig() != null) {
            settingsConfigProvider.getConfig().l(context, "__settings_meta.sp", 0, false);
            this.a = null;
        }
        if (this.a == null) {
            this.a = context.getSharedPreferences("__settings_meta.sp", 0);
        }
    }

    private static String a(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : e.a.a.a.a.t(str, BundleUtil.UNDERLINE_TAG, str2);
    }

    public static g b(Context context) {
        if (b == null) {
            synchronized (g.class) {
                if (b == null) {
                    b = new g(context);
                }
            }
        }
        return b;
    }

    public int c(String str) {
        int i = 0;
        try {
            return this.a.getInt("key_prefix_version_" + str, 0);
        } catch (ClassCastException e2) {
            try {
                i = Integer.valueOf(this.a.getString("key_prefix_version_" + str, "0")).intValue();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            e2.printStackTrace();
            return i;
        }
    }

    public boolean d(String str) {
        return this.a.getBoolean("key_one_sp_migrate_" + str, false);
    }

    public boolean e(String str, String str2) {
        return !TextUtils.equals(this.a.getString(str, ""), this.a.getString(a("key_latest_update_token", str2), ""));
    }

    public void f(String str, String str2) {
        this.a.edit().putString(a("key_latest_update_token", str2), str).apply();
    }

    public void g(String str) {
        try {
            this.a.edit().putBoolean("key_one_sp_migrate_" + str, true).apply();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void h(String str, int i) {
        try {
            this.a.edit().putInt("key_prefix_version_" + str, i).apply();
        } catch (Exception e2) {
            e2.printStackTrace();
            this.a.edit().putString(e.a.a.a.a.s("key_prefix_version_", str), String.valueOf(i)).apply();
        }
    }

    public void i(String str, String str2) {
        this.a.edit().putString(str, str2).apply();
    }
}
