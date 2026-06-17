package com.huawei.devices.utils;

@Deprecated
/* loaded from: classes2.dex */
public enum HapticsKitConstant$SystemuiTypeEnum {
    EXPAND("haptic.systemui.notifications_expand"),
    MOVE("haptic.systemui.notifications_move"),
    SWITCH_LONG_PRESS("haptic.systemui.switches_long_press"),
    NOTIFICATIONS_LONG_PRESS("haptic.systemui.notifications_long_press"),
    SWITCH_SORT_LONG_PRESS("haptic.systemui.switches_sort_long_press"),
    SCREEN_RECORD_STOP("haptic.systemui.screen_record_stop");

    private final String mType;

    HapticsKitConstant$SystemuiTypeEnum(String str) {
        this.mType = str;
    }

    public final String getType() {
        return this.mType;
    }
}
