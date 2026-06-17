package com.huawei.devices.utils;

@Deprecated
/* loaded from: classes2.dex */
public enum HapticsKitConstant$DiallerTypeEnum {
    LETTERS_INDEX("haptic.contacts.letters_index"),
    CLICK("haptic.dialler.click"),
    LONGPRESS("haptic.dialler.long_press"),
    DELTE("haptic.dialler.delete_long_press");

    private final String mType;

    HapticsKitConstant$DiallerTypeEnum(String str) {
        this.mType = str;
    }

    public final String getType() {
        return this.mType;
    }
}
