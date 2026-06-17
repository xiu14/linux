package com.google.android.material.color;

import e.a.a.a.a;

/* loaded from: classes2.dex */
final class Blend {
    private static final float HARMONIZE_MAX_DEGREES = 15.0f;
    private static final float HARMONIZE_PERCENTAGE = 0.5f;

    private Blend() {
    }

    public static int blendCam16Ucs(int i, int i2, float f2) {
        Cam16 fromInt = Cam16.fromInt(i);
        Cam16 fromInt2 = Cam16.fromInt(i2);
        float jStar = fromInt.getJStar();
        float aStar = fromInt.getAStar();
        float bStar = fromInt.getBStar();
        return Cam16.fromUcs(a.a(fromInt2.getJStar(), jStar, f2, jStar), a.a(fromInt2.getAStar(), aStar, f2, aStar), a.a(fromInt2.getBStar(), bStar, f2, bStar)).getInt();
    }

    public static int blendHctHue(int i, int i2, float f2) {
        return Hct.from(Cam16.fromInt(blendCam16Ucs(i, i2, f2)).getHue(), Cam16.fromInt(i).getChroma(), ColorUtils.lstarFromInt(i)).toInt();
    }

    public static int harmonize(int i, int i2) {
        Hct fromInt = Hct.fromInt(i);
        Hct fromInt2 = Hct.fromInt(i2);
        float min = Math.min(MathUtils.differenceDegrees(fromInt.getHue(), fromInt2.getHue()) * 0.5f, HARMONIZE_MAX_DEGREES);
        return Hct.from(MathUtils.sanitizeDegrees((min * rotationDirection(fromInt.getHue(), fromInt2.getHue())) + fromInt.getHue()), fromInt.getChroma(), fromInt.getTone()).toInt();
    }

    private static float rotationDirection(float f2, float f3) {
        float f4 = f3 - f2;
        float f5 = f4 + 360.0f;
        float f6 = f4 - 360.0f;
        float abs = Math.abs(f4);
        float abs2 = Math.abs(f5);
        float abs3 = Math.abs(f6);
        return (abs > abs2 || abs > abs3) ? (abs2 > abs || abs2 > abs3) ? ((double) f6) >= 0.0d ? 1.0f : -1.0f : ((double) f5) >= 0.0d ? 1.0f : -1.0f : ((double) f4) >= 0.0d ? 1.0f : -1.0f;
    }
}
