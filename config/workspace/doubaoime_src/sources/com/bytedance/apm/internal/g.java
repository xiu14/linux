package com.bytedance.apm.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class g {
    private static volatile boolean a = false;
    private static SharedPreferences b;

    /* renamed from: c, reason: collision with root package name */
    private static int f3452c;

    /* renamed from: d, reason: collision with root package name */
    private static int f3453d;

    /* renamed from: e, reason: collision with root package name */
    private static long f3454e;

    public static long a() {
        return f3454e;
    }

    public static int b() {
        return (f3452c & (-536870912)) >>> 29;
    }

    public static boolean c(int i) {
        return (i & f3452c) != 0;
    }

    public static synchronized void d(Context context) {
        synchronized (g.class) {
            if (a) {
                return;
            }
            a = true;
            if (b == null) {
                b = context.getSharedPreferences("monitor_switch_config", 0);
            }
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                int i = sharedPreferences.getInt("monitor_switch_config_first_flag", 0);
                f3452c = i;
                f3453d = i;
                f3454e = b.getLong("monitor_switch_config_atrace_flag", 0L);
            }
        }
    }

    public static void e() {
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("monitor_switch_config_first_flag", f3453d).putLong("monitor_switch_config_atrace_flag", f3454e).apply();
        }
    }

    public static void f(long j) {
        f3454e = j;
    }

    public static void g(int i, int i2) {
        f3453d = (i2 & i) + ((~i) & f3453d);
    }

    public static void h(int i, boolean z) {
        if (z) {
            f3453d = i | f3453d;
        } else {
            f3453d = (~i) & f3453d;
        }
    }
}
