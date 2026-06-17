package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* loaded from: classes2.dex */
public class ba {
    private static ba a;

    /* renamed from: a, reason: collision with other field name */
    private int f1072a = 0;

    /* renamed from: a, reason: collision with other field name */
    private Context f1073a;

    private ba(Context context) {
        this.f1073a = context.getApplicationContext();
    }

    public static ba a(Context context) {
        if (a == null) {
            a = new ba(context);
        }
        return a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m776a() {
        String str = com.xiaomi.push.z.f1181a;
        return str.contains("xmsf") || str.contains("xiaomi") || str.contains("miui");
    }

    @SuppressLint({"NewApi"})
    public int a() {
        int i = this.f1072a;
        if (i != 0) {
            return i;
        }
        try {
            this.f1072a = Settings.Global.getInt(this.f1073a.getContentResolver(), "device_provisioned", 0);
        } catch (Exception unused) {
        }
        return this.f1072a;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a, reason: collision with other method in class */
    public Uri m775a() {
        return Settings.Global.getUriFor("device_provisioned");
    }
}
