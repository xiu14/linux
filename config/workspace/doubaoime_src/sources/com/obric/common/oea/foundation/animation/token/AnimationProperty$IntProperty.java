package com.obric.common.oea.foundation.animation.token;

/* loaded from: classes2.dex */
public enum AnimationProperty$IntProperty {
    BACKGROUND_COLOR("backgroundColor"),
    TEXT_COLOR("textColor"),
    STROKE_COLOR("strokeColor"),
    FILL_COLOR("fillColor"),
    WIDTH("width"),
    HEIGHT("height");

    public static final a Companion = new Object(null) { // from class: com.obric.common.oea.foundation.animation.token.AnimationProperty$IntProperty.a
    };
    private final String propertyName;

    AnimationProperty$IntProperty(String str) {
        this.propertyName = str;
    }

    public final String getPropertyName() {
        return this.propertyName;
    }
}
