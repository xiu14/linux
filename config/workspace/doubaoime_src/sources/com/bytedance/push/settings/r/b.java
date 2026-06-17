package com.bytedance.push.settings.r;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    private static volatile b f5822f;
    private boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private String f5823c;

    /* renamed from: d, reason: collision with root package name */
    private final a f5824d = new a("bdpush_is_first_process.lock");

    /* renamed from: e, reason: collision with root package name */
    private final a f5825e = new a("bdpush_local_settings_sp.lock");

    private b() {
    }

    public static b b() {
        if (f5822f == null) {
            synchronized (b.class) {
                if (f5822f == null) {
                    f5822f = new b();
                }
            }
        }
        return f5822f;
    }

    private void e(Context context) {
        if (this.f5825e.a(context)) {
            SharedPreferences.Editor edit = context.getSharedPreferences("local_settings_sp", 0).edit();
            String a = com.bytedance.push.settings.D.a.a(context);
            edit.putString("first_process", a);
            edit.putInt("first_process_pid", Process.myPid());
            edit.apply();
            com.bytedance.push.settings.s.a b = com.bytedance.push.settings.s.a.b();
            StringBuilder U = e.a.a.a.a.U("write  ", a, "  as first process success on ");
            U.append(com.bytedance.push.settings.D.a.a(context));
            b.a("SettingsFileLockHelper", U.toString());
            this.f5825e.c();
        }
    }

    public String a(Context context) {
        if (!TextUtils.isEmpty(this.f5823c)) {
            return this.f5823c;
        }
        if (!this.f5825e.a(context)) {
            return "";
        }
        this.f5823c = context.getSharedPreferences("local_settings_sp", 0).getString("first_process", "");
        this.f5825e.c();
        com.bytedance.push.settings.s.a b = com.bytedance.push.settings.s.a.b();
        StringBuilder M = e.a.a.a.a.M("read first process success , first process is:");
        M.append(this.f5823c);
        M.append(" on ");
        M.append(com.bytedance.push.settings.D.a.a(context));
        b.a("SettingsFileLockHelper", M.toString());
        return this.f5823c;
    }

    public boolean c(Context context) {
        try {
            com.bytedance.push.settings.s.a.b().a("SettingsFileLockHelper", "curIsFirstProcess called on " + com.bytedance.push.settings.D.a.a(context) + " process , sHasCheckIsFirst is " + this.a);
            if (this.a) {
                return this.b;
            }
            this.a = true;
            this.b = this.f5824d.a(context);
            com.bytedance.push.settings.s.a.b().a("SettingsFileLockHelper", "isFirstLockFile: sIsFirst = " + this.b + "  process = " + com.bytedance.push.settings.D.a.a(context));
            if (this.b) {
                e(context);
            }
            return this.b;
        } catch (Throwable th) {
            th.printStackTrace();
            this.b = false;
            return false;
        }
    }

    public boolean d(Context context) {
        if (!this.f5825e.a(context)) {
            return true;
        }
        boolean z = context.getSharedPreferences("local_settings_sp", 0).getBoolean("allow", true);
        com.bytedance.push.settings.s.a b = com.bytedance.push.settings.s.a.b();
        StringBuilder X = e.a.a.a.a.X("read allow start other process success , allow is:", z, " on ");
        X.append(com.bytedance.push.settings.D.a.a(context));
        b.a("SettingsFileLockHelper", X.toString());
        this.f5825e.c();
        return z;
    }
}
