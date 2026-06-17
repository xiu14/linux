package com.bytedance.bdinstall.k0;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.bdinstall.C0641v;
import com.bytedance.bdinstall.Q;

/* loaded from: classes.dex */
final class s {
    static void a(Context context, C0641v c0641v, Q q) {
        SharedPreferences d2 = com.bytedance.bdinstall.util.g.d(context, q);
        SharedPreferences b = c0641v.b(q);
        boolean z = false;
        if (d2.getBoolean("dr_install_migrate", false)) {
            return;
        }
        SharedPreferences A = q.A();
        String string = A.getString("device_id", null);
        String string2 = A.getString("bd_did", null);
        String string3 = A.getString("install_id", null);
        String string4 = A.getString("ssid", null);
        SharedPreferences.Editor edit = b.edit();
        if (!TextUtils.isEmpty(string)) {
            edit.putString("device_id", string);
            z = true;
        }
        if (!TextUtils.isEmpty(string2)) {
            edit.putString("bd_did", string2);
            z = true;
        }
        if (!TextUtils.isEmpty(string3)) {
            edit.putString("install_id", string3);
            z = true;
        }
        if (!TextUtils.isEmpty(string4)) {
            edit.putString("ssid", string4);
            z = true;
        }
        if (z) {
            edit.apply();
        }
        d2.edit().putBoolean("dr_install_migrate", true).apply();
    }
}
