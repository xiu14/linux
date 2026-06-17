package com.bytedance.bdinstall.migrate;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import androidx.annotation.WorkerThread;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.util.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static int f4085e = -1;
    private final PackageManager a;
    private final ComponentName b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4086c;

    /* renamed from: d, reason: collision with root package name */
    private final SharedPreferences f4087d;

    @WorkerThread
    public a(Context context, Q q) {
        Context applicationContext = context.getApplicationContext();
        SharedPreferences d2 = g.d(context, q);
        this.f4087d = d2;
        PackageManager packageManager = applicationContext.getPackageManager();
        this.a = packageManager;
        ComponentName componentName = new ComponentName(context, (Class<?>) MigrateDetectorActivity.class);
        this.b = componentName;
        int i = f4085e;
        boolean z = false;
        if (i == -1) {
            try {
                i = packageManager.getComponentEnabledSetting(componentName);
                f4085e = i;
            } catch (Exception unused) {
            }
        }
        int i2 = d2.getInt("component_state", 0);
        int i3 = C0640u.a;
        if (i == 0 && i2 == 2) {
            z = true;
        }
        this.f4086c = z;
        int i4 = C0640u.a;
    }

    public static void c(Context context, Q q, String str, boolean z) {
        SharedPreferences.Editor edit = g.d(context, q).edit();
        edit.putString("old_did", str);
        if (z) {
            edit.putBoolean("is_migrate", true);
        } else {
            edit.remove("is_migrate");
        }
        edit.apply();
    }

    public void a() {
        int i = C0640u.a;
        try {
            this.a.setComponentEnabledSetting(this.b, 2, 1);
            this.f4087d.edit().putInt("component_state", 2).apply();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean b() {
        return this.f4086c;
    }
}
