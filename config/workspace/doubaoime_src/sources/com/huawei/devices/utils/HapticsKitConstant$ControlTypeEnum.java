package com.huawei.devices.utils;

@Deprecated
/* loaded from: classes2.dex */
public enum HapticsKitConstant$ControlTypeEnum {
    SEARCH_LONG_PRESS("haptic.control.search_long_press"),
    TEXT_EDIT("haptic.control.text_edit"),
    TEXT_CHOSE_CURSOR_MOVE("haptic.control.text_choose_cursor_move"),
    WIDGET_OPERATION("haptic.control.widget_operation"),
    TIME_SCROLL("haptic.control.time_scroll"),
    LETTERS_SCROLL("haptic.control.letters_scroll");

    private final String mType;

    HapticsKitConstant$ControlTypeEnum(String str) {
        this.mType = str;
    }

    public final String getType() {
        return this.mType;
    }
}
