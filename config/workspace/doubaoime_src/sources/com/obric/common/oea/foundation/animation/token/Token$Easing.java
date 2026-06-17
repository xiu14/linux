package com.obric.common.oea.foundation.animation.token;

/* loaded from: classes2.dex */
public enum Token$Easing {
    OUI_ANIMATION_EASING_LINEAR(0.0f, 0.0f, 1.0f, 1.0f),
    OUI_ANIMATION_EASING_STANDARD(0.34f, 0.69f, 0.1f, 1.0f),
    OUI_ANIMATION_EASING_EASE(0.25f, 0.1f, 0.25f, 1.0f),
    OUI_ANIMATION_EASING_EASE_IN(0.42f, 0.0f, 1.0f, 1.0f),
    OUI_ANIMATION_EASING_EASE_OUT(0.0f, 0.0f, 0.58f, 1.0f),
    OUI_ANIMATION_EASING_EASE_IN_OUT(0.42f, 0.0f, 0.58f, 1.0f),
    OUI_ANIMATION_EASING_EASE_IN_SINE(0.12f, 0.0f, 0.39f, 0.0f),
    OUI_ANIMATION_EASING_EASE_OUT_SINE(0.61f, 1.0f, 0.88f, 1.0f),
    OUI_ANIMATION_EASING_EASE_IN_OUT_SINE(0.37f, 0.0f, 0.63f, 1.0f),
    OUI_ANIMATION_EASING_EASE_IN_QUAD(0.11f, 0.0f, 0.5f, 0.0f),
    OUI_ANIMATION_EASING_EASE_OUT_QUAD(0.5f, 1.0f, 0.89f, 1.0f),
    OUI_ANIMATION_EASING_EASE_IN_OUT_QUAD(0.45f, 0.0f, 0.55f, 1.0f),
    OUI_ANIMATION_EASING_EASE_IN_CUBIC(0.32f, 0.0f, 0.67f, 0.0f),
    OUI_ANIMATION_EASING_EASE_OUT_CUBIC(0.33f, 1.0f, 0.68f, 1.0f),
    OUI_ANIMATION_EASING_EASE_IN_OUT_CUBIC(0.65f, 0.0f, 0.35f, 1.0f),
    OUI_ANIMATION_EASING_EASE_IN_QUART(0.5f, 0.0f, 0.75f, 0.0f),
    OUI_ANIMATION_EASING_EASE_OUT_QUART(0.25f, 1.0f, 0.5f, 1.0f),
    OUI_ANIMATION_EASING_EASE_IN_OUT_QUART(0.76f, 0.0f, 0.24f, 1.0f),
    OUI_ANIMATION_EASING_EASE_IN_QUINT(0.64f, 0.0f, 0.78f, 0.0f),
    OUI_ANIMATION_EASING_EASE_OUT_QUINT(0.22f, 1.0f, 0.36f, 1.0f),
    OUI_ANIMATION_EASING_EASE_IN_OUT_QUINT(0.83f, 0.0f, 0.17f, 1.0f),
    OUI_ANIMATION_EASING_EASE_IN_EXPO(0.95f, 0.0f, 0.795f, 0.0f),
    OUI_ANIMATION_EASING_EASE_OUT_EXPO(0.19f, 1.0f, 0.22f, 1.0f),
    OUI_ANIMATION_EASING_EASE_IN_OUT_EXPO(0.87f, 0.0f, 0.13f, 1.0f);

    private final float[] values;

    Token$Easing(float... fArr) {
        this.values = fArr;
    }

    public final float[] getValues() {
        return this.values;
    }
}
