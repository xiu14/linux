package com.huawei.devices.utils;

@Deprecated
/* loaded from: classes2.dex */
public enum HapticsKitConstant$FingerPrintTypeEnum {
    INPUT_LONG_PRESS("haptic.fingerprint.input_long_press"),
    UNLOCK_FAILE("haptic.fingerprint.unlock_fail");

    private final String mType;

    HapticsKitConstant$FingerPrintTypeEnum(String str) {
        this.mType = str;
    }

    public final String getType() {
        return this.mType;
    }
}
