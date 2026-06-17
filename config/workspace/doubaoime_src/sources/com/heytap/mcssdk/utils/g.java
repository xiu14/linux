package com.heytap.mcssdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.heytap.mcssdk.PushService;

/* loaded from: classes2.dex */
public class g {
    private static final String a = "shared_msg_sdk";
    private static final String b = "hasDefaultChannelCreated";

    /* renamed from: c, reason: collision with root package name */
    private static final String f6933c = "decryptTag";

    /* renamed from: d, reason: collision with root package name */
    private static final String f6934d = "registerTimeoutCount";

    /* renamed from: e, reason: collision with root package name */
    private Context f6935e;

    /* renamed from: f, reason: collision with root package name */
    private SharedPreferences f6936f;

    /* renamed from: g, reason: collision with root package name */
    private Object f6937g;

    private static class a {
        static g a = new g();

        private a() {
        }
    }

    private g() {
        this.f6937g = new Object();
        Context context = PushService.getInstance().getContext();
        if (context != null) {
            this.f6935e = a(context);
        }
        Context context2 = this.f6935e;
        if (context2 != null) {
            this.f6936f = context2.getSharedPreferences(a, 0);
        }
    }

    private Context a(Context context) {
        boolean a2 = com.heytap.mcssdk.utils.a.a();
        e.b("fbeVersion is " + a2);
        return a2 ? context.createDeviceProtectedStorageContext() : context.getApplicationContext();
    }

    public static g f() {
        return a.a;
    }

    private SharedPreferences g() {
        Context context;
        SharedPreferences sharedPreferences = this.f6936f;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        synchronized (this.f6937g) {
            SharedPreferences sharedPreferences2 = this.f6936f;
            if (sharedPreferences2 != null || (context = this.f6935e) == null) {
                return sharedPreferences2;
            }
            SharedPreferences sharedPreferences3 = context.getSharedPreferences(a, 0);
            this.f6936f = sharedPreferences3;
            return sharedPreferences3;
        }
    }

    public void a(String str) {
        SharedPreferences g2 = g();
        if (g2 != null) {
            g2.edit().putString(f6933c, str).commit();
        }
    }

    public void a(boolean z) {
        SharedPreferences g2 = g();
        if (g2 != null) {
            g2.edit().putBoolean(b, z).commit();
        }
    }

    public boolean a() {
        SharedPreferences g2 = g();
        if (g2 != null) {
            return g2.getBoolean(b, false);
        }
        return false;
    }

    public String b() {
        SharedPreferences g2 = g();
        return g2 != null ? g2.getString(f6933c, "DES") : "DES";
    }

    public int c() {
        SharedPreferences g2 = g();
        if (g2 != null) {
            return g2.getInt(f6934d, 0);
        }
        return 0;
    }

    public void d() {
        SharedPreferences g2 = g();
        if (g2 != null) {
            g2.edit().putInt(f6934d, c() + 1).commit();
        }
    }

    public void e() {
        SharedPreferences g2 = g();
        if (g2 != null) {
            g2.edit().putInt(f6934d, 0).commit();
        }
    }
}
