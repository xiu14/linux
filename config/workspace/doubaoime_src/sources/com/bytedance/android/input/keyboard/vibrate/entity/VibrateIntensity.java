package com.bytedance.android.input.keyboard.vibrate.entity;

import com.bytedance.android.input.basic.IAppGlobals;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public enum VibrateIntensity {
    WEAK("WEAK", 2),
    WEAKER("WEAKER", 3),
    MODE_RATE("MODE_RATE", 4),
    STRONGER("STRONGER", 5),
    STRONG("STRONG", 6),
    NONE("NONE", 0),
    FOLLOW_SYSTEM("FOLLOW_SYSTEM", 1);

    public static final a Companion = new a(null);
    private static final int O_POSITION_DIFF = 2;
    private final String nameSource;
    private final int position;

    public static final class a {
        public a(g gVar) {
        }

        public final int a(VibrateIntensity vibrateIntensity) {
            l.f(vibrateIntensity, "vibrateIntensity");
            if (!IAppGlobals.a.F()) {
                return vibrateIntensity.position;
            }
            int i = vibrateIntensity.position - 2;
            if (i < 0) {
                return 0;
            }
            return i;
        }

        public final VibrateIntensity b() {
            return IAppGlobals.a.F() ? VibrateIntensity.STRONG : VibrateIntensity.NONE;
        }

        public final VibrateIntensity c(String str) {
            VibrateIntensity vibrateIntensity;
            l.f(str, "nameSource");
            VibrateIntensity[] values = VibrateIntensity.values();
            int i = 0;
            while (true) {
                if (i >= 7) {
                    vibrateIntensity = null;
                    break;
                }
                vibrateIntensity = values[i];
                if (l.a(vibrateIntensity.getNameSource(), str)) {
                    break;
                }
                i++;
            }
            return vibrateIntensity == null ? b() : vibrateIntensity;
        }
    }

    VibrateIntensity(String str, int i) {
        this.nameSource = str;
        this.position = i;
    }

    public final String getNameSource() {
        return this.nameSource;
    }
}
