package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class w {
    private static w a;

    /* renamed from: a, reason: collision with other field name */
    private Context f1158a;

    /* renamed from: a, reason: collision with other field name */
    private List<String> f1159a = new ArrayList();
    private final List<String> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f9354c = new ArrayList();

    private w(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f1158a = applicationContext;
        if (applicationContext == null) {
            this.f1158a = context;
        }
        SharedPreferences sharedPreferences = this.f1158a.getSharedPreferences("mipush_app_info", 0);
        for (String str : sharedPreferences.getString("unregistered_pkg_names", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (TextUtils.isEmpty(str)) {
                this.f1159a.add(str);
            }
        }
        for (String str2 : sharedPreferences.getString("disable_push_pkg_names", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (!TextUtils.isEmpty(str2)) {
                this.b.add(str2);
            }
        }
        for (String str3 : sharedPreferences.getString("disable_push_pkg_names_cache", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (!TextUtils.isEmpty(str3)) {
                this.f9354c.add(str3);
            }
        }
    }

    public static w a(Context context) {
        if (a == null) {
            a = new w(context);
        }
        return a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m837b(String str) {
        boolean contains;
        synchronized (this.b) {
            contains = this.b.contains(str);
        }
        return contains;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m838c(String str) {
        boolean contains;
        synchronized (this.f9354c) {
            contains = this.f9354c.contains(str);
        }
        return contains;
    }

    public void d(String str) {
        synchronized (this.f1159a) {
            if (this.f1159a.contains(str)) {
                this.f1159a.remove(str);
                this.f1158a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", com.xiaomi.push.bm.a(this.f1159a, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    public void e(String str) {
        synchronized (this.b) {
            if (this.b.contains(str)) {
                this.b.remove(str);
                this.f1158a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", com.xiaomi.push.bm.a(this.b, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    public void f(String str) {
        synchronized (this.f9354c) {
            if (this.f9354c.contains(str)) {
                this.f9354c.remove(str);
                this.f1158a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", com.xiaomi.push.bm.a(this.f9354c, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m836a(String str) {
        boolean contains;
        synchronized (this.f1159a) {
            contains = this.f1159a.contains(str);
        }
        return contains;
    }

    public void b(String str) {
        synchronized (this.b) {
            if (!this.b.contains(str)) {
                this.b.add(str);
                this.f1158a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", com.xiaomi.push.bm.a(this.b, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    public void c(String str) {
        synchronized (this.f9354c) {
            if (!this.f9354c.contains(str)) {
                this.f9354c.add(str);
                this.f1158a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", com.xiaomi.push.bm.a(this.f9354c, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    public void a(String str) {
        synchronized (this.f1159a) {
            if (!this.f1159a.contains(str)) {
                this.f1159a.add(str);
                this.f1158a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", com.xiaomi.push.bm.a(this.f1159a, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }
}
