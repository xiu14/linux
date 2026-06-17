package com.obric.common.oea.foundation.animation.token;

import androidx.constraintlayout.motion.widget.Key;

/* loaded from: classes2.dex */
public enum AnimationProperty$FloatProperty {
    X("x"),
    Y("y"),
    SCALE_X("scaleX"),
    SCALE_Y("scaleY"),
    ROTATION(Key.ROTATION),
    ROTATION_X("rotationX"),
    ROTATION_Y("rotationY"),
    TRANSLATION_X("translationX"),
    TRANSLATION_Y("translationY"),
    ALPHA("alpha");

    public static final a Companion = new Object(null) { // from class: com.obric.common.oea.foundation.animation.token.AnimationProperty$FloatProperty.a
    };
    private final String propertyName;

    AnimationProperty$FloatProperty(String str) {
        this.propertyName = str;
    }

    public final String getPropertyName() {
        return this.propertyName;
    }
}
