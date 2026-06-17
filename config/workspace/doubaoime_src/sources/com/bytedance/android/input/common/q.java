package com.bytedance.android.input.common;

import android.content.Context;
import android.os.Vibrator;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class q {
    private static Vibrator a;
    private static Method b;

    public static final void a(Context context, int i, int i2) {
        String str;
        if (a == null && context != null) {
            a = (Vibrator) context.getSystemService(Vibrator.class);
        }
        Vibrator vibrator = a;
        if (vibrator == null) {
            com.bytedance.android.input.r.j.j("VibratorSmt", "vibrator not initialized");
            return;
        }
        if (b == null) {
            try {
                Class<?> cls = Class.forName("bytedanceos.api.VibratorSmt");
                Class<?> cls2 = Integer.TYPE;
                Method method = cls.getMethod("vibrateEffectWithHapticPlayer", Vibrator.class, cls2, Double.TYPE, cls2);
                method.setAccessible(true);
                b = method;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        switch (i) {
            case 0:
                str = "EFFECT_PRESS";
                break;
            case 1:
                str = "EFFECT_TAP";
                break;
            case 2:
                str = "EFFECT_LONG_PRESS";
                break;
            case 3:
                str = "EFFECT_TICK";
                break;
            case 4:
                str = "EFFECT_RIGID";
                break;
            case 5:
                str = "EFFECT_SOFT";
                break;
            case 6:
                str = "EFFECT_CONFIRM";
                break;
            case 7:
                str = "EFFECT_REJECT";
                break;
            case 8:
                str = "EFFECT_CLEAR";
                break;
            case 9:
                str = "EFFECT_WAKE_UP";
                break;
            default:
                str = "UNKNOWN_EFFECT";
                break;
        }
        double d2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? 1.0d : 0.8d : 0.6d : 0.4d : 0.2d;
        com.bytedance.android.input.r.j.i("VibratorSmt", "vibrateEffectWithHapticPlayer: effectId = " + i + ", intensity = " + d2 + ", effectName = " + str);
        try {
            Method method2 = b;
            if (method2 != null) {
                method2.invoke(null, vibrator, Integer.valueOf(i), Double.valueOf(d2), 6);
            }
        } catch (Exception e3) {
            e.a.a.a.a.o0("Invoke method failed：", e3, "VibratorSmt");
        }
    }
}
