package com.bytedance.android.input.s;

import android.os.SystemClock;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i {
    private static long a;

    public static final void a() {
        a = SystemClock.uptimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        String e2 = e.a.a.a.a.e(IAppGlobals.a, C0838R.string.keyboard_first_show_time, "IAppGlobals.context.getS…keyboard_first_show_time)");
        if (l.a(SettingsConfigNext.f(e2), 0L)) {
            com.bytedance.android.input.r.j.i("KeyboardDisplayTimeEventTracker", "saveFirstShowTime: " + currentTimeMillis);
            SettingsConfigNext.l(e2, Long.valueOf(currentTimeMillis));
            KeyboardJni.updateProviderLongValue(e2, Long.valueOf(currentTimeMillis));
        }
    }

    public static final void b() {
        if (a > 0) {
            IAppLog.a aVar = IAppLog.a;
            JSONObject jSONObject = new JSONObject();
            long uptimeMillis = SystemClock.uptimeMillis() - a;
            com.bytedance.android.input.r.j.m("KeyboardDisplayTimeEventTracker", "post keyboard_display_time event: " + uptimeMillis);
            jSONObject.put("duration", uptimeMillis);
            aVar.t("keyboard_display_duration", jSONObject);
        }
        a = 0L;
    }
}
