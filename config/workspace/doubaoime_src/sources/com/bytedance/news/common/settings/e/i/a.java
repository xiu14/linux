package com.bytedance.news.common.settings.e.i;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class a {
    private static volatile a b;
    private final SharedPreferences a;

    private a(Context context) {
        this.a = context.getSharedPreferences("__ctx_info.sp", 0);
    }

    public static a b(Context context) {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a(context);
                }
            }
        }
        return b;
    }

    public String a() {
        SharedPreferences sharedPreferences = this.a;
        return sharedPreferences == null ? "" : sharedPreferences.getString("key_ctx_info", "");
    }

    public synchronized void c(@Nullable String str) {
        this.a.edit().putString("key_ctx_info", str).apply();
    }

    public synchronized void d(long j) {
        this.a.edit().putLong("key_settings_time", j).apply();
    }
}
