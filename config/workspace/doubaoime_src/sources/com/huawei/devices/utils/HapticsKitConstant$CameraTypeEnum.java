package com.huawei.devices.utils;

/* loaded from: classes2.dex */
public enum HapticsKitConstant$CameraTypeEnum {
    FOCUS("haptic.camera.focus"),
    GEAR_SLIP("haptic.camera.gear_slip"),
    PORTAIT_SWITH("haptic.camera.portrait_switch"),
    MODE_SWITCH("haptic.camera.mode_switch"),
    LONG_PRESS("haptic.camera.long_press");

    private final String mType;

    HapticsKitConstant$CameraTypeEnum(String str) {
        this.mType = str;
    }

    public final String getType() {
        return this.mType;
    }
}
