package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class bx {
    private static volatile bx a;

    /* renamed from: a, reason: collision with other field name */
    private Context f157a;

    private bx(Context context) {
        this.f157a = context;
    }

    public static bx a(Context context) {
        if (a == null) {
            synchronized (bx.class) {
                if (a == null) {
                    a = new bx(context);
                }
            }
        }
        return a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m144a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = this.f157a.getSharedPreferences(str, 4).edit();
        edit.putString(str2, str3);
        edit.commit();
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m143a(String str, String str2, long j) {
        SharedPreferences.Editor edit = this.f157a.getSharedPreferences(str, 4).edit();
        edit.putLong(str2, j);
        edit.commit();
    }

    public synchronized String a(String str, String str2, String str3) {
        try {
        } catch (Throwable unused) {
            return str3;
        }
        return this.f157a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    public synchronized long a(String str, String str2, long j) {
        try {
        } catch (Throwable unused) {
            return j;
        }
        return this.f157a.getSharedPreferences(str, 4).getLong(str2, j);
    }
}
