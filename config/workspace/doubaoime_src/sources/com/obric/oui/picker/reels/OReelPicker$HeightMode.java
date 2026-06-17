package com.obric.oui.picker.reels;

import e.a.a.a.a;

/* loaded from: classes2.dex */
public enum OReelPicker$HeightMode {
    SEVEN_LINES(a.e0("Resources.getSystem()", 1, 292)),
    FIVE_LINES(a.e0("Resources.getSystem()", 1, 212));

    private final int heightInDp;

    OReelPicker$HeightMode(int i) {
        this.heightInDp = i;
    }

    public final int getHeightInDp() {
        return this.heightInDp;
    }
}
