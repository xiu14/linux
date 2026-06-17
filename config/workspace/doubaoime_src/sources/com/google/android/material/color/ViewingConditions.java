package com.google.android.material.color;

/* loaded from: classes2.dex */
final class ViewingConditions {
    public static final ViewingConditions DEFAULT = make(ColorUtils.whitePointD65(), (float) ((ColorUtils.yFromLstar(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float aw;

    /* renamed from: c, reason: collision with root package name */
    private final float f6765c;
    private final float fl;
    private final float flRoot;
    private final float n;
    private final float nbb;
    private final float nc;
    private final float ncb;
    private final float[] rgbD;
    private final float z;

    private ViewingConditions(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.n = f2;
        this.aw = f3;
        this.nbb = f4;
        this.ncb = f5;
        this.f6765c = f6;
        this.nc = f7;
        this.rgbD = fArr;
        this.fl = f8;
        this.flRoot = f9;
        this.z = f10;
    }

    static ViewingConditions make(float[] fArr, float f2, float f3, float f4, boolean z) {
        float[][] fArr2 = Cam16.XYZ_TO_CAM16RGB;
        float f5 = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f6 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f7 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f8 = (f4 / 10.0f) + 0.8f;
        float lerp = ((double) f8) >= 0.9d ? MathUtils.lerp(0.59f, 0.69f, (f8 - 0.9f) * 10.0f) : MathUtils.lerp(0.525f, 0.59f, (f8 - 0.8f) * 10.0f);
        float exp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f2) - 42.0f) / 92.0f)) * 0.2777778f)) * f8;
        double d2 = exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f5) * exp) + 1.0f) - exp, (((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * f2) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float cbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(f2 * 5.0d))) + (f10 * f2);
        float yFromLstar = ColorUtils.yFromLstar(f3) / fArr[1];
        double d3 = yFromLstar;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * cbrt) * f5) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * cbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * cbrt) * f7) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new ViewingConditions(yFromLstar, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * pow, pow, pow, lerp, f8, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public float getAw() {
        return this.aw;
    }

    float getC() {
        return this.f6765c;
    }

    float getFl() {
        return this.fl;
    }

    public float getFlRoot() {
        return this.flRoot;
    }

    public float getN() {
        return this.n;
    }

    public float getNbb() {
        return this.nbb;
    }

    float getNc() {
        return this.nc;
    }

    float getNcb() {
        return this.ncb;
    }

    public float[] getRgbD() {
        return this.rgbD;
    }

    float getZ() {
        return this.z;
    }
}
