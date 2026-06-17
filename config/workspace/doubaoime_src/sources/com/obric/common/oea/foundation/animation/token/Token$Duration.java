package com.obric.common.oea.foundation.animation.token;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;

/* loaded from: classes2.dex */
public enum Token$Duration {
    OUI_ANIMATION_DURATION_SHORT_1(50, 15791),
    OUI_ANIMATION_DURATION_SHORT_2(100, 3948),
    OUI_ANIMATION_DURATION_SHORT_3(150, 1755),
    OUI_ANIMATION_DURATION_SHORT_4(200, 987),
    OUI_ANIMATION_DURATION_MEDIUM_1(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 632),
    OUI_ANIMATION_DURATION_MEDIUM_2(300, 439),
    OUI_ANIMATION_DURATION_MEDIUM_3(350, 322),
    OUI_ANIMATION_DURATION_MEDIUM_4(400, 247),
    OUI_ANIMATION_DURATION_LONG_1(450, 195),
    OUI_ANIMATION_DURATION_LONG_2(500, 158),
    OUI_ANIMATION_DURATION_LONG_3(550, 131),
    OUI_ANIMATION_DURATION_LONG_4(600, 110),
    OUI_ANIMATION_DURATION_VERY_LONG_1(TypedValues.TransitionType.TYPE_DURATION, 81),
    OUI_ANIMATION_DURATION_VERY_LONG_2(800, 62),
    OUI_ANIMATION_DURATION_VERY_LONG_3(TypedValues.Custom.TYPE_INT, 49),
    OUI_ANIMATION_DURATION_VERY_LONG_4(1000, 39);

    private final int duration;
    private final int stiffness;

    Token$Duration(int i, int i2) {
        this.duration = i;
        this.stiffness = i2;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getStiffness() {
        return this.stiffness;
    }
}
