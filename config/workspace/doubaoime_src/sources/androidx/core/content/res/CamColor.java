package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;

/* loaded from: classes.dex */
class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    CamColor(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.mHue = f2;
        this.mChroma = f3;
        this.mJ = f4;
        this.mQ = f5;
        this.mM = f6;
        this.mS = f7;
        this.mJstar = f8;
        this.mAstar = f9;
        this.mBstar = f10;
    }

    @Nullable
    private static CamColor findCamByJ(@FloatRange(from = 0.0d, to = 360.0d) float f2, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f3, @FloatRange(from = 0.0d, to = 100.0d) float f4) {
        float f5 = 1000.0f;
        float f6 = 0.0f;
        CamColor camColor = null;
        float f7 = 100.0f;
        float f8 = 1000.0f;
        while (Math.abs(f6 - f7) > LIGHTNESS_SEARCH_ENDPOINT) {
            float f9 = ((f7 - f6) / 2.0f) + f6;
            int viewedInSrgb = fromJch(f9, f3, f2).viewedInSrgb();
            float lStarFromInt = CamUtils.lStarFromInt(viewedInSrgb);
            float abs = Math.abs(f4 - lStarFromInt);
            if (abs < 0.2f) {
                CamColor fromColor = fromColor(viewedInSrgb);
                float distance = fromColor.distance(fromJch(fromColor.getJ(), fromColor.getChroma(), f2));
                if (distance <= 1.0f) {
                    camColor = fromColor;
                    f5 = abs;
                    f8 = distance;
                }
            }
            if (f5 == 0.0f && f8 == 0.0f) {
                break;
            }
            if (lStarFromInt < f4) {
                f6 = f9;
            } else {
                f7 = f9;
            }
        }
        return camColor;
    }

    @NonNull
    static CamColor fromColor(@ColorInt int i) {
        return fromColorInViewingConditions(i, ViewingConditions.DEFAULT);
    }

    @NonNull
    static CamColor fromColorInViewingConditions(@ColorInt int i, @NonNull ViewingConditions viewingConditions) {
        float[] xyzFromInt = CamUtils.xyzFromInt(i);
        float[][] fArr = CamUtils.XYZ_TO_CAM16RGB;
        float f2 = (xyzFromInt[2] * fArr[0][2]) + (xyzFromInt[1] * fArr[0][1]) + (xyzFromInt[0] * fArr[0][0]);
        float f3 = (xyzFromInt[2] * fArr[1][2]) + (xyzFromInt[1] * fArr[1][1]) + (xyzFromInt[0] * fArr[1][0]);
        float f4 = (xyzFromInt[2] * fArr[2][2]) + (xyzFromInt[1] * fArr[2][1]) + (xyzFromInt[0] * fArr[2][0]);
        float f5 = viewingConditions.getRgbD()[0] * f2;
        float f6 = viewingConditions.getRgbD()[1] * f3;
        float f7 = viewingConditions.getRgbD()[2] * f4;
        float pow = (float) Math.pow((Math.abs(f5) * viewingConditions.getFl()) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f6) * viewingConditions.getFl()) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f7) * viewingConditions.getFl()) / 100.0d, 0.42d);
        float signum = ((Math.signum(f5) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f6) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f7) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = signum3;
        float f8 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d2)) / 11.0f;
        float f9 = ((float) ((signum + signum2) - (d2 * 2.0d))) / 9.0f;
        float f10 = signum2 * 20.0f;
        float f11 = ((21.0f * signum3) + ((signum * 20.0f) + f10)) / 20.0f;
        float f12 = (((signum * 40.0f) + f10) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f9, f8)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f13 = atan2;
        float f14 = (3.1415927f * f13) / 180.0f;
        float pow4 = ((float) Math.pow((f12 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float aw = (viewingConditions.getAw() + 4.0f) * (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(pow4 / 100.0f)) * viewingConditions.getFlRoot();
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f13) < 20.14d ? 360.0f + f13 : f13) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((f9 * f9) + (f8 * f8)))) / (f11 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float flRoot = pow5 * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt((r1 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f15 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * flRoot) + 1.0f)) * 43.85965f;
        double d3 = f14;
        return new CamColor(f13, pow5, pow4, aw, flRoot, sqrt, f15, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    @NonNull
    private static CamColor fromJch(@FloatRange(from = 0.0d, to = 100.0d) float f2, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f3, @FloatRange(from = 0.0d, to = 360.0d) float f4) {
        return fromJchInFrame(f2, f3, f4, ViewingConditions.DEFAULT);
    }

    @NonNull
    private static CamColor fromJchInFrame(@FloatRange(from = 0.0d, to = 100.0d) float f2, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f3, @FloatRange(from = 0.0d, to = 360.0d) float f4, ViewingConditions viewingConditions) {
        float aw = (viewingConditions.getAw() + 4.0f) * (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(f2 / 100.0d)) * viewingConditions.getFlRoot();
        float flRoot = f3 * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt(((f3 / ((float) Math.sqrt(r4))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f5 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((flRoot * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f4) / 180.0f;
        return new CamColor(f4, f3, f2, aw, flRoot, sqrt, f5, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    static int toColor(@FloatRange(from = 0.0d, to = 360.0d) float f2, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f3, @FloatRange(from = 0.0d, to = 100.0d) float f4) {
        return toColor(f2, f3, f4, ViewingConditions.DEFAULT);
    }

    float distance(@NonNull CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((bStar * bStar) + (aStar * aStar) + (jStar * jStar)), 0.63d) * 1.41d);
    }

    @FloatRange(from = Double.NEGATIVE_INFINITY, fromInclusive = false, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getAStar() {
        return this.mAstar;
    }

    @FloatRange(from = Double.NEGATIVE_INFINITY, fromInclusive = false, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getBStar() {
        return this.mBstar;
    }

    @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getChroma() {
        return this.mChroma;
    }

    @FloatRange(from = 0.0d, to = 360.0d, toInclusive = false)
    float getHue() {
        return this.mHue;
    }

    @FloatRange(from = 0.0d, to = 100.0d)
    float getJ() {
        return this.mJ;
    }

    @FloatRange(from = 0.0d, to = 100.0d)
    float getJStar() {
        return this.mJstar;
    }

    @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getM() {
        return this.mM;
    }

    @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getQ() {
        return this.mQ;
    }

    @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getS() {
        return this.mS;
    }

    @ColorInt
    int viewed(@NonNull ViewingConditions viewingConditions) {
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
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        return ColorUtils.XYZToColor((fArr[0][2] * f11) + (fArr[0][1] * f10) + (fArr[0][0] * f9), (fArr[1][2] * f11) + (fArr[1][1] * f10) + (fArr[1][0] * f9), (f11 * fArr[2][2]) + (f10 * fArr[2][1]) + (f9 * fArr[2][0]));
    }

    @ColorInt
    int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }

    @ColorInt
    static int toColor(@FloatRange(from = 0.0d, to = 360.0d) float f2, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f3, @FloatRange(from = 0.0d, to = 100.0d) float f4, @NonNull ViewingConditions viewingConditions) {
        if (f3 < 1.0d || Math.round(f4) <= 0.0d || Math.round(f4) >= 100.0d) {
            return CamUtils.intFromLStar(f4);
        }
        float min = f2 < 0.0f ? 0.0f : Math.min(360.0f, f2);
        CamColor camColor = null;
        boolean z = true;
        float f5 = 0.0f;
        float f6 = f3;
        while (Math.abs(f5 - f3) >= CHROMA_SEARCH_ENDPOINT) {
            CamColor findCamByJ = findCamByJ(min, f6, f4);
            if (z) {
                if (findCamByJ != null) {
                    return findCamByJ.viewed(viewingConditions);
                }
                z = false;
            } else if (findCamByJ == null) {
                f3 = f6;
            } else {
                f5 = f6;
                camColor = findCamByJ;
            }
            f6 = ((f3 - f5) / 2.0f) + f5;
        }
        return camColor == null ? CamUtils.intFromLStar(f4) : camColor.viewed(viewingConditions);
    }
}
