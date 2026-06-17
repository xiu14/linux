package com.bytedance.feedbackerlib.manager;

import androidx.annotation.NonNull;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;

/* loaded from: classes.dex */
public class z {
    private static com.bytedance.framwork.core.sdkmonitor.f a;

    public static void a() {
        b().y();
        b().A();
    }

    @NonNull
    public static com.bytedance.framwork.core.sdkmonitor.f b() {
        if (a == null) {
            a = SDKMonitorUtils.a(String.valueOf(1925L));
        }
        return a;
    }
}
