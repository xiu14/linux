package com.google.android.material.color;

/* loaded from: classes2.dex */
final class Hct {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DE_MAX_ERROR = 1.0E-9f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private float chroma;
    private float hue;
    private float tone;

    private Hct(float f2, float f3, float f4) {
        setInternalState(gamutMap(f2, f3, f4));
    }

    private static Cam16 findCamByJ(float f2, float f3, float f4) {
        float f5 = 1000.0f;
        float f6 = 0.0f;
        Cam16 cam16 = null;
        float f7 = 100.0f;
        float f8 = 1000.0f;
        while (Math.abs(f6 - f7) > LIGHTNESS_SEARCH_ENDPOINT) {
            float f9 = ((f7 - f6) / 2.0f) + f6;
            int i = Cam16.fromJch(f9, f3, f2).getInt();
            float lstarFromInt = ColorUtils.lstarFromInt(i);
            float abs = Math.abs(f4 - lstarFromInt);
            if (abs < 0.2f) {
                Cam16 fromInt = Cam16.fromInt(i);
                float distance = fromInt.distance(Cam16.fromJch(fromInt.getJ(), fromInt.getChroma(), f2));
                if (distance <= 1.0f && distance <= f5) {
                    cam16 = fromInt;
                    f8 = abs;
                    f5 = distance;
                }
            }
            if (f8 == 0.0f && f5 < DE_MAX_ERROR) {
                break;
            }
            if (lstarFromInt < f4) {
                f6 = f9;
            } else {
                f7 = f9;
            }
        }
        return cam16;
    }

    public static Hct from(float f2, float f3, float f4) {
        return new Hct(f2, f3, f4);
    }

    public static Hct fromInt(int i) {
        Cam16 fromInt = Cam16.fromInt(i);
        return new Hct(fromInt.getHue(), fromInt.getChroma(), ColorUtils.lstarFromInt(i));
    }

    private static int gamutMap(float f2, float f3, float f4) {
        return gamutMapInViewingConditions(f2, f3, f4, ViewingConditions.DEFAULT);
    }

    static int gamutMapInViewingConditions(float f2, float f3, float f4, ViewingConditions viewingConditions) {
        if (f3 < 1.0d || Math.round(f4) <= 0.0d || Math.round(f4) >= 100.0d) {
            return ColorUtils.intFromLstar(f4);
        }
        float sanitizeDegrees = MathUtils.sanitizeDegrees(f2);
        Cam16 cam16 = null;
        boolean z = true;
        float f5 = 0.0f;
        float f6 = f3;
        while (Math.abs(f5 - f3) >= CHROMA_SEARCH_ENDPOINT) {
            Cam16 findCamByJ = findCamByJ(sanitizeDegrees, f6, f4);
            if (z) {
                if (findCamByJ != null) {
                    return findCamByJ.viewed(viewingConditions);
                }
                z = false;
            } else if (findCamByJ == null) {
                f3 = f6;
            } else {
                f5 = f6;
                cam16 = findCamByJ;
            }
            f6 = ((f3 - f5) / 2.0f) + f5;
        }
        return cam16 == null ? ColorUtils.intFromLstar(f4) : cam16.viewed(viewingConditions);
    }

    private void setInternalState(int i) {
        Cam16 fromInt = Cam16.fromInt(i);
        float lstarFromInt = ColorUtils.lstarFromInt(i);
        this.hue = fromInt.getHue();
        this.chroma = fromInt.getChroma();
        this.tone = lstarFromInt;
    }

    public float getChroma() {
        return this.chroma;
    }

    public float getHue() {
        return this.hue;
    }

    public float getTone() {
        return this.tone;
    }

    public void setChroma(float f2) {
        setInternalState(gamutMap(this.hue, f2, this.tone));
    }

    public void setHue(float f2) {
        setInternalState(gamutMap(MathUtils.sanitizeDegrees(f2), this.chroma, this.tone));
    }

    public void setTone(float f2) {
        setInternalState(gamutMap(this.hue, this.chroma, f2));
    }

    public int toInt() {
        return gamutMap(this.hue, this.chroma, this.tone);
    }
}
