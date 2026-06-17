package com.bytedance.apm.util;

import android.app.Activity;
import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.apm.core.ActivityLifeObserver;

/* loaded from: classes.dex */
public class h {
    private static float a;
    private static int b;

    /* renamed from: c, reason: collision with root package name */
    private static int f3587c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f3588d;

    /* renamed from: e, reason: collision with root package name */
    private static int f3589e;

    static {
        Context h = com.bytedance.apm.g.h();
        ActivityLifeObserver.getInstance().register(new g());
        float f2 = 0.0f;
        if (com.bytedance.apm.g.d0() && h != null) {
            Display defaultDisplay = ((WindowManager) h.getSystemService("window")).getDefaultDisplay();
            float refreshRate = defaultDisplay.getRefreshRate();
            for (Display.Mode mode : defaultDisplay.getSupportedModes()) {
                float refreshRate2 = mode.getRefreshRate();
                if (refreshRate2 > f2) {
                    f2 = refreshRate2;
                }
            }
            b = f(refreshRate);
            int f3 = f(f2);
            f3587c = f3;
            int i = b;
            f3588d = i == f3;
            a = 1000.0f / i;
            return;
        }
        f3587c = 60;
        b = 60;
        f3588d = true;
        a = 1000.0f / 60;
        f3589e = 60;
        if (h != null) {
            Display defaultDisplay2 = ((WindowManager) h.getSystemService("window")).getDefaultDisplay();
            f(defaultDisplay2.getRefreshRate());
            for (Display.Mode mode2 : defaultDisplay2.getSupportedModes()) {
                float refreshRate3 = mode2.getRefreshRate();
                if (refreshRate3 > f2) {
                    f2 = refreshRate3;
                }
            }
            f3589e = f(f2);
        }
    }

    static void a(Activity activity) {
        float refreshRate = activity.getWindowManager().getDefaultDisplay().getRefreshRate();
        f(refreshRate);
        if (com.bytedance.apm.g.d0()) {
            int f2 = f(refreshRate);
            b = f2;
            f3588d = f2 == f3587c;
            a = 1000.0f / f2;
        }
    }

    public static int b() {
        return f3587c;
    }

    public static float c() {
        return a;
    }

    public static int d() {
        return f3589e;
    }

    public static int e() {
        return b;
    }

    private static int f(float f2) {
        if (Math.abs(f2 - 60.0f) < 5.1f) {
            return 60;
        }
        if (Math.abs(f2 - 90.0f) < 5.1f) {
            return 90;
        }
        if (Math.abs(f2 - 120.0f) < 5.1f) {
            return 120;
        }
        return (int) f2;
    }

    public static boolean g() {
        return f3588d;
    }
}
