package com.bytedance.android.input.s;

import android.os.SystemClock;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {
    public static final j a = null;
    private static final boolean b = d.a.b.a.i(IAppGlobals.a.getApplication());

    /* renamed from: c, reason: collision with root package name */
    private static long f3021c;

    /* renamed from: d, reason: collision with root package name */
    private static long f3022d;

    /* renamed from: e, reason: collision with root package name */
    private static long f3023e;

    public static final void a() {
        if (f3021c > 0 || !b) {
            return;
        }
        f3021c = SystemClock.uptimeMillis() - f3023e;
    }

    public static final void b() {
        if (f3021c > 0 || !b) {
            return;
        }
        f3023e = SystemClock.uptimeMillis();
    }

    public static final void c() {
        if (f3022d > 0) {
            return;
        }
        f3022d = SystemClock.uptimeMillis() - f3023e;
        IAppLog.a aVar = IAppLog.a;
        JSONObject jSONObject = new JSONObject();
        IAppGlobals.a aVar2 = IAppGlobals.a;
        jSONObject.put("new_version", Boolean.compare(aVar2.I(), false));
        jSONObject.put("ime_version", "1.3.9");
        jSONObject.put(CrashHianalyticsData.TIME, f3021c + f3022d);
        jSONObject.put("time_0", f3021c);
        jSONObject.put("time_1", f3022d);
        jSONObject.put("screen_width", aVar2.v());
        jSONObject.put("screen_height", aVar2.a());
        com.bytedance.android.input.r.j.m("ProcessStartEventTracker", "application time: " + f3021c + " service time: " + f3022d + " is new version: " + aVar2.I());
        aVar.t("server_start", jSONObject);
        f3023e = 0L;
    }

    public static final void d() {
        if (f3022d > 0) {
            return;
        }
        f3023e = SystemClock.uptimeMillis();
    }
}
