package com.bytedance.android.input.s;

import android.os.SystemClock;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {
    private static long a;

    public static final void a() {
        a = SystemClock.uptimeMillis();
    }

    public static final void b() {
        if (a > 0) {
            IAppLog.a aVar = IAppLog.a;
            JSONObject jSONObject = new JSONObject();
            long uptimeMillis = SystemClock.uptimeMillis() - a;
            com.bytedance.android.input.r.j.m("AppSettingsDisplayTimeEventTracker", "post app_settings_display_time event: " + uptimeMillis);
            jSONObject.put("duration", uptimeMillis);
            aVar.t("settings_activity_display_duration", jSONObject);
        }
        a = 0L;
    }
}
