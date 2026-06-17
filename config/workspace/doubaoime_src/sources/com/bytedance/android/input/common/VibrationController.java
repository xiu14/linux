package com.bytedance.android.input.common;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.bytedance.android.input.basic.IAppGlobals;

/* loaded from: classes.dex */
public final class VibrationController {
    public static final VibrationController a = null;
    private static boolean b = IAppGlobals.a.F();

    private enum AospEffect {
        TICK(2, new long[]{0, 30}),
        CLICK(0, new long[]{0, 40}),
        HEAVY_CLICK(5, new long[]{0, 50}),
        DOUBLE_CLICK(1, new long[]{0, 30, 100, 30});

        private final int id;
        private final long[] pattern;

        AospEffect(int i, long[] jArr) {
            this.id = i;
            this.pattern = jArr;
        }

        public final int getId() {
            return this.id;
        }

        public final long[] getPattern() {
            return this.pattern;
        }
    }

    private enum ObricVibEffect {
        PRESS(0, 0.1d),
        TAP(1, 0.2d),
        LONG_PRESS(2, 0.3d),
        CONFIRM(6, 0.4d),
        RIGID(4, 0.5d),
        SOFT(5, 0.2d);

        private final int id;
        private final double intensity;

        ObricVibEffect(int i, double d2) {
            this.id = i;
            this.intensity = d2;
        }

        public final int getId() {
            return this.id;
        }

        public final double getIntensity() {
            return this.intensity;
        }
    }

    public enum VibrationType {
        NONE,
        KEY_TYPING,
        LONG_PRESS,
        KEY_FUNCTION,
        CONFIRM,
        DOUBLE_CLICK,
        SPEECH_START,
        SPEECH_STOP
    }

    private static final void a(Context context, ObricVibEffect obricVibEffect, AospEffect aospEffect, int i) {
        if (b) {
            q.a(context, obricVibEffect.getId(), i);
            return;
        }
        Object systemService = context.getSystemService("vibrator");
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        com.bytedance.android.input.r.j.i("VibrationController", "performAospVibration: " + aospEffect);
        if (vibrator != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                vibrator.vibrate(VibrationEffect.createPredefined(aospEffect.getId()));
            } else {
                vibrator.vibrate(aospEffect.getPattern(), -1);
            }
        }
    }

    public static final void b(Context context, VibrationType vibrationType, int i) {
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(vibrationType, "type");
        switch (vibrationType.ordinal()) {
            case 1:
                a(context, ObricVibEffect.PRESS, AospEffect.TICK, i);
                break;
            case 2:
                a(context, ObricVibEffect.LONG_PRESS, AospEffect.HEAVY_CLICK, i);
                break;
            case 3:
                a(context, ObricVibEffect.TAP, AospEffect.CLICK, i);
                break;
            case 4:
                a(context, ObricVibEffect.CONFIRM, AospEffect.HEAVY_CLICK, i);
                break;
            case 5:
                a(context, ObricVibEffect.RIGID, AospEffect.DOUBLE_CLICK, i);
                break;
            case 6:
                a(context, ObricVibEffect.RIGID, AospEffect.HEAVY_CLICK, i);
                break;
            case 7:
                a(context, ObricVibEffect.SOFT, AospEffect.TICK, i);
                break;
        }
    }
}
