package com.huawei.devices.utils;

@Deprecated
/* loaded from: classes2.dex */
public enum HapticsKitConstant$LockScreenTypeEnum {
    UNLOCK_SLIP("haptic.lockscreen.unlock_slip"),
    UNLOCK_CLICK("haptic.lockscreen.unlock_click"),
    NUMBER_UNLOCK_FAIL("haptic.lockscreen.number_unlock_fail"),
    FACE_UNLOCK_FAIL("haptic.lockscreen.face_unlock_fail"),
    FACE_UNLOCK_RETRY("haptic.lockscreen.face_unlock_retry"),
    UPGLIDE_SWITCH("haptic.lockscreen.upglide_switches"),
    ONEHAND_KEYBOARD_SWITCH("haptic.lockscreen.onehand_keyboard_switch");

    private final String mType;

    HapticsKitConstant$LockScreenTypeEnum(String str) {
        this.mType = str;
    }

    public final String getType() {
        return this.mType;
    }
}
