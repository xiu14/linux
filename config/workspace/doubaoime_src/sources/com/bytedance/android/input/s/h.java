package com.bytedance.android.input.s;

import android.os.SystemClock;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {
    private static long a = 0;
    private static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f3020c = true;

    public static void a(boolean z, long j, boolean z2) {
        if (!z || j <= 0) {
            return;
        }
        try {
            IAppLog.a aVar = IAppLog.a;
            JSONObject jSONObject = new JSONObject();
            IAppGlobals.a aVar2 = IAppGlobals.a;
            Objects.requireNonNull(aVar2);
            jSONObject.put("ime_version", "1.3.9");
            jSONObject.put("first_display", z2);
            jSONObject.put("keyboard_color", aVar2.b() ? "black" : "white");
            long uptimeMillis = SystemClock.uptimeMillis() - j;
            com.bytedance.android.input.r.j.m("KeyboardDisplayEventTracker", "post keyboard display event: " + uptimeMillis);
            jSONObject.put(CrashHianalyticsData.TIME, uptimeMillis);
            aVar.t("keyboard_display", jSONObject);
            f3020c = false;
        } catch (Exception e2) {
            e.a.a.a.a.f0(e2, e.a.a.a.a.M("throw exception when stop keyboard display event: "), "KeyboardDisplayEventTracker");
        }
    }

    public static final void b() {
        a = SystemClock.uptimeMillis();
    }

    public static final void c() {
        if (a > 0) {
            b = true;
        }
    }

    public static final void d() {
        final boolean z = b;
        final long j = a;
        final boolean z2 = f3020c;
        a = 0L;
        b = false;
        com.bytedance.android.input.basic.d.a.a(new Runnable() { // from class: com.bytedance.android.input.s.a
            @Override // java.lang.Runnable
            public final void run() {
                h.a(z, j, z2);
            }
        });
    }
}
