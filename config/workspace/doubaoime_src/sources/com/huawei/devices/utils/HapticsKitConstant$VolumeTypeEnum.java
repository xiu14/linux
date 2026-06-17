package com.huawei.devices.utils;

/* loaded from: classes2.dex */
public enum HapticsKitConstant$VolumeTypeEnum {
    TRIGGER("haptic.volume.trigger"),
    CHANGE("haptic.volume.change"),
    MAXMIN("haptic.volume.maxmin");

    private final String mType;

    HapticsKitConstant$VolumeTypeEnum(String str) {
        this.mType = str;
    }

    public final String getType() {
        return this.mType;
    }
}
