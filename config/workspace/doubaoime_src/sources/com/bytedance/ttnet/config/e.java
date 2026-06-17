package com.bytedance.ttnet.config;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    private static volatile e f6151f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f6152g = new Object();
    private static volatile SharedPreferences h;
    private volatile Context a;
    private volatile int b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f6153c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f6154d;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f6155e;

    private e(Context context) {
        if (context != null) {
            this.a = context.getApplicationContext();
        }
        try {
            if (h == null) {
                h = this.a.getSharedPreferences("image_opt_table", 0);
            }
            SharedPreferences sharedPreferences = h;
            this.b = sharedPreferences.getInt("image_opt_switch", 0);
            this.f6153c = sharedPreferences.getLong("image_opt_black_interval", 0L);
            this.f6154d = sharedPreferences.getInt("image_opt_failed_times", 0);
            this.f6155e = sharedPreferences.getInt("image_opt_limit_count", 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static e a(Context context) {
        if (f6151f == null) {
            synchronized (f6152g) {
                if (f6151f == null) {
                    f6151f = new e(context);
                }
            }
        }
        return f6151f;
    }

    public static e b() {
        return f6151f;
    }

    public void c(JSONObject jSONObject) {
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            int optInt = jSONObject.optInt("image_opt_switch", 0);
            long optLong = jSONObject.optLong("image_opt_black_interval", 0L);
            int optInt2 = jSONObject.optInt("image_opt_failed_times", 0);
            int optInt3 = jSONObject.optInt("image_opt_limit_count", 0);
            if (h == null) {
                h = this.a.getSharedPreferences("image_opt_table", 0);
            }
            SharedPreferences.Editor edit = h.edit();
            if (optInt != this.b) {
                edit.putInt("image_opt_switch", optInt);
            }
            if (optLong != this.f6153c) {
                edit.putLong("image_opt_black_interval", optLong);
            }
            if (optInt2 != this.f6154d) {
                edit.putInt("image_opt_failed_times", optInt2);
            }
            if (optInt3 != this.f6155e) {
                edit.putInt("image_opt_limit_count", optInt3);
            }
            edit.apply();
            this.b = optInt;
            this.f6153c = optLong;
            this.f6154d = optInt2;
            this.f6155e = optInt3;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
