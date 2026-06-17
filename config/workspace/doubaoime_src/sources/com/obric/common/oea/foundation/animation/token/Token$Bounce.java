package com.obric.common.oea.foundation.animation.token;

/* loaded from: classes2.dex */
public enum Token$Bounce {
    OUI_ANIMATION_BOUNCE_SMOOTH(0.0f, 1.0f),
    OUI_ANIMATION_BOUNCE_SNAPPY_1(0.05f, 0.95f),
    OUI_ANIMATION_BOUNCE_SNAPPY_2(0.1f, 0.9f),
    OUI_ANIMATION_BOUNCE_SNAPPY_3(0.15f, 0.85f),
    OUI_ANIMATION_BOUNCE_SNAPPY_4(0.2f, 0.8f),
    OUI_ANIMATION_BOUNCE_BOUNCY_1(0.25f, 0.75f),
    OUI_ANIMATION_BOUNCE_BOUNCY_2(0.3f, 0.7f),
    OUI_ANIMATION_BOUNCE_BOUNCY_3(0.35f, 0.65f),
    OUI_ANIMATION_BOUNCE_BOUNCY_4(0.4f, 0.6f);

    private final float bounce;
    private final float dampingRatio;

    Token$Bounce(float f2, float f3) {
        this.bounce = f2;
        this.dampingRatio = f3;
    }

    public final float getBounce() {
        return this.bounce;
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }
}
