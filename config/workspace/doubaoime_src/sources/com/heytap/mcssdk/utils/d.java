package com.heytap.mcssdk.utils;

import android.content.Context;
import android.provider.Settings;

/* loaded from: classes2.dex */
public class d {
    public static final String a = "oplus_system_folding_mode";
    public static final int b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final String f6923c = "tablet";

    /* renamed from: d, reason: collision with root package name */
    public static final String f6924d = "ro.build.characteristics";

    public static final boolean a() {
        try {
            String a2 = h.a(f6924d);
            if (a2 != null) {
                return a2.contains(f6923c);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean a(Context context) {
        return -1 != b(context);
    }

    public static final int b(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), a, -1);
        } catch (Exception unused) {
            return -1;
        }
    }
}
