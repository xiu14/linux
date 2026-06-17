package com.huawei.devices.utils;

/* loaded from: classes2.dex */
public enum HapticsKitConstant$SlideTypeEnum {
    TYPE1("haptic.slide.type1"),
    TYPE2("haptic.slide.type2"),
    TYPE3("haptic.slide.type3"),
    TYPE4("haptic.slide.type4"),
    TYPE5("haptic.slide.type5"),
    TYPE6("haptic.slide.type6");

    private final String mType;

    HapticsKitConstant$SlideTypeEnum(String str) {
        this.mType = str;
    }

    public final String getType() {
        return this.mType;
    }
}
