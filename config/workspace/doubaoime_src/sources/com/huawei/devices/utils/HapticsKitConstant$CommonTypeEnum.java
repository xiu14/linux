package com.huawei.devices.utils;

/* loaded from: classes2.dex */
public enum HapticsKitConstant$CommonTypeEnum {
    BUTTON("haptic.common.button"),
    CHARGING("haptic.common.charging"),
    DELETE_LONG_PRESS("haptic.common.delete_long_press"),
    FAIL_PATTERN1("haptic.common.fail_pattern1"),
    FAIL_PATTERN2("haptic.common.fail_pattern2"),
    LONG_PRESS("haptic.common.long_press"),
    LONG_PRESS1("haptic.common.long_press1"),
    LONG_PRESS2("haptic.common.long_press2"),
    NOTICE("haptic.common.notice"),
    PINCH("haptic.common.pinch"),
    SUCCESS("haptic.common.success"),
    SWITCH("haptic.common.switch"),
    THRESHOLD("haptic.common.threshold"),
    UPGLIDE("haptic.common.upglide"),
    CHANGE("haptic.mode.change");

    private final String mType;

    HapticsKitConstant$CommonTypeEnum(String str) {
        this.mType = str;
    }

    public final String getType() {
        return this.mType;
    }
}
