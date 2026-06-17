package com.xiaomi.push;

import android.content.Context;
import android.provider.Settings;

/* loaded from: classes2.dex */
class et {
    static boolean a() {
        int b = ax.b();
        if (b == 0) {
            return true;
        }
        return b == 1 && ev.a().b();
    }

    static boolean b() {
        Context m841a = t.m841a();
        if (m841a == null) {
            return false;
        }
        return com.xiaomi.push.service.aq.a(m841a).a(hz.MdKaSwitch.a(), true);
    }

    static boolean c() {
        try {
            Context m841a = t.m841a();
            if (m841a == null) {
                return false;
            }
            return Settings.System.getInt(m841a.getContentResolver(), "power_supersave_mode_open", 0) == 1;
        } catch (Throwable th) {
            e.a.a.a.a.w0("[superPower]  exception occurred when check super power mode switch, exception: ", th, "HwKaMgr");
            return false;
        }
    }
}
