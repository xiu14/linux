package com.google.android.material.color;

/* loaded from: classes2.dex */
final class Cam16 {
    private final float astar;
    private final float bstar;
    private final float chroma;
    private final float hue;
    private final float j;
    private final float jstar;
    private final float m;
    private final float q;
    private final float s;
    static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    private Cam16(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.hue = f2;
        this.chroma = f3;
        this.j = f4;
        this.q = f5;
        this.m = f6;
        this.s = f7;
        this.jstar = f8;
        this.astar = f9;
        this.bstar = f10;
    }

    public static Cam16 fromInt(int i) {
        return fromIntInViewingConditions(i, ViewingConditions.DEFAULT);
    }

    static Cam16 fromIntInViewingConditions(int i, ViewingConditions viewingConditions) {
        float linearized = ColorUtils.linearized(((16711680 & i) >> 16) / 255.0f) * 100.0f;
        float linearized2 = ColorUtils.linearized(((65280 & i) >> 8) / 255.0f) * 100.0f;
        float linearized3 = ColorUtils.linearized((i & 255) / 255.0f) * 100.0f;
        float f2 = (0.18051042f * linearized3) + (0.35762063f * linearized2) + (0.41233894f * linearized);
        float f3 = (0.0722f * linearized3) + (0.7152f * linearized2) + (0.2126f * linearized);
        float f4 = (linearized3 * 0.9503448f) + (linearized2 * 0.11916382f) + (linearized * 0.01932141f);
        float[][] fArr = XYZ_TO_CAM16RGB;
        float f5 = (fArr[0][2] * f4) + (fArr[0][1] * f3) + (fArr[0][0] * f2);
        float f6 = (fArr[1][2] * f4) + (fArr[1][1] * f3) + (fArr[1][0] * f2);
        float f7 = (f4 * fArr[2][2]) + (f3 * fArr[2][1]) + (f2 * fArr[2][0]);
        float f8 = viewingConditions.getRgbD()[0] * f5;
        float f9 = viewingConditions.getRgbD()[1] * f6;
        float f10 = viewingConditions.getRgbD()[2] * f7;
        float pow = (float) Math.pow((Math.abs(f8) * viewingConditions.getFl()) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f9) * viewingConditions.getFl()) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f10) * viewingConditions.getFl()) / 100.0d, 0.42d);
        float signum = ((Math.signum(f8) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f9) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f10) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = signum3;
        float f11 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d2)) / 11.0f;
        float f12 = ((float) ((signum + signum2) - (d2 * 2.0d))) / 9.0f;
        float f13 = signum2 * 20.0f;
        float f14 = ((21.0f * signum3) + ((signum * 20.0f) + f13)) / 20.0f;
        float f15 = (((signum * 40.0f) + f13) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f16 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f15 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float aw = (viewingConditions.getAw() + 4.0f) * (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(pow4 / 100.0f)) * viewingConditions.getFlRoot();
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(Math.toRadians(((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.hypot(r2, r5))) / (f14 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float flRoot = pow5 * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt((r2 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f17 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log1p = ((float) Math.log1p(0.0228f * flRoot)) * 43.85965f;
        double d3 = f16;
        return new Cam16(atan2, pow5, pow4, aw, flRoot, sqrt, f17, log1p * ((float) Math.cos(d3)), log1p * ((float) Math.sin(d3)));
    }

    static Cam16 fromJch(float f2, float f3, float f4) {
        return fromJchInViewingConditions(f2, f3, f4, ViewingConditions.DEFAULT);
    }

    private static Cam16 fromJchInViewingConditions(float f2, float f3, float f4, ViewingConditions viewingConditions) {
        float aw = (viewingConditions.getAw() + 4.0f) * (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(f2 / 100.0d)) * viewingConditions.getFlRoot();
        float flRoot = f3 * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt(((f3 / ((float) Math.sqrt(r4))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f5 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log1p = ((float) Math.log1p(flRoot * 0.0228d)) * 43.85965f;
        double d2 = (3.1415927f * f4) / 180.0f;
        return new Cam16(f4, f3, f2, aw, flRoot, sqrt, f5, log1p * ((float) Math.cos(d2)), log1p * ((float) Math.sin(d2)));
    }

    public static Cam16 fromUcs(float f2, float f3, float f4) {
        return fromUcsInViewingConditions(f2, f3, f4, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(float f2, float f3, float f4, ViewingConditions viewingConditions) {
        double d2 = f3;
        double d3 = f4;
        double expm1 = (Math.expm1(Math.hypot(d2, d3) * 0.02280000038444996d) / 0.02280000038444996d) / viewingConditions.getFlRoot();
        double atan2 = Math.atan2(d3, d2) * 57.29577951308232d;
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        return fromJchInViewingConditions(f2 / (1.0f - ((f2 - 100.0f) * 0.007f)), (float) expm1, (float) atan2, viewingConditions);
    }

    float distance(Cam16 cam16) {
        float jStar = getJStar() - cam16.getJStar();
        float aStar = getAStar() - cam16.getAStar();
        float bStar = getBStar() - cam16.getBStar();
        return (float) (Math.pow(Math.sqrt((bStar * bStar) + (aStar * aStar) + (jStar * jStar)), 0.63d) * 1.41d);
    }

    public float getAStar() {
        return this.astar;
    }

    public float getBStar() {
        return this.bstar;
    }

    public float getChroma() {
        return this.chroma;
    }

    public float getHue() {
        return this.hue;
    }

    public int getInt() {
        return viewed(ViewingConditions.DEFAULT);
    }

    public float getJ() {
        return this.j;
    }

    public float getJStar() {
        return this.jstar;
    }

    public float getM() {
        return this.m;
    }

    public float getQ() {
        return this.q;
    }

    public float getS() {
        return this.s;
    }

    int viewed(ViewingConditions viewingConditions) {
        float pow = (float) Math.pow(((((double) getChroma()) == 0.0d || ((double) getJ()) == 0.0d) ? 0.0f : getChroma() / ((float) Math.sqrt(getJ() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f;
        float aw = viewingConditions.getAw() * ((float) Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ()));
        float nc = cos * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = aw / viewingConditions.getNbb();
        float sin = (float) Math.sin(hue);
        float cos2 = (float) Math.cos(hue);
        float f2 = (((0.305f + nbb) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (nc * 23.0f)));
        float f3 = cos2 * f2;
        float f4 = f2 * sin;
        float f5 = nbb * 460.0f;
        float f6 = ((288.0f * f4) + ((451.0f * f3) + f5)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float f8 = ((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f;
        float fl = (100.0f / viewingConditions.getFl()) * Math.signum(f6) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f6) * 27.13d) / (400.0d - Math.abs(f6))), 2.380952380952381d));
        float fl2 = (100.0f / viewingConditions.getFl()) * Math.signum(f7) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d));
        float fl3 = (100.0f / viewingConditions.getFl()) * Math.signum(f8) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float f9 = fl / viewingConditions.getRgbD()[0];
        float f10 = fl2 / viewingConditions.getRgbD()[1];
        float f11 = fl3 / viewingConditions.getRgbD()[2];
        float[][] fArr = CAM16RGB_TO_XYZ;
        return ColorUtils.intFromXyzComponents((fArr[0][2] * f11) + (fArr[0][1] * f10) + (fArr[0][0] * f9), (fArr[1][2] * f11) + (fArr[1][1] * f10) + (fArr[1][0] * f9), (f11 * fArr[2][2]) + (f10 * fArr[2][1]) + (f9 * fArr[2][0]));
    }
}
