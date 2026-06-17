package com.obric.common.oea.foundation.animation.token;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;

/* loaded from: classes2.dex */
public enum Token$Delay {
    OUI_ANIMATION_DELAY_NONE(0),
    OUI_ANIMATION_DELAY_SHORT_1(50),
    OUI_ANIMATION_DELAY_SHORT_2(100),
    OUI_ANIMATION_DELAY_SHORT_3(150),
    OUI_ANIMATION_DELAY_SHORT_4(200),
    OUI_ANIMATION_DELAY_MEDIUM_1(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION),
    OUI_ANIMATION_DELAY_MEDIUM_2(300),
    OUI_ANIMATION_DELAY_MEDIUM_3(350),
    OUI_ANIMATION_DELAY_MEDIUM_4(400),
    OUI_ANIMATION_DELAY_LONG_1(450),
    OUI_ANIMATION_DELAY_LONG_2(500),
    OUI_ANIMATION_DELAY_LONG_3(550),
    OUI_ANIMATION_DELAY_LONG_4(600),
    OUI_ANIMATION_DELAY_VERY_LONG_1(TypedValues.TransitionType.TYPE_DURATION),
    OUI_ANIMATION_DELAY_VERY_LONG_2(800),
    OUI_ANIMATION_DELAY_VERY_LONG_3(TypedValues.Custom.TYPE_INT),
    OUI_ANIMATION_DELAY_VERY_LONG_4(1000);

    private final int value;

    Token$Delay(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
