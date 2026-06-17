package com.huawei.devices.utils;

@Deprecated
/* loaded from: classes2.dex */
public enum HapticsKitConstant$NavigationTypeEnum {
    CLICK_HOME("haptic.virtual_navigation.click_home"),
    CLICK_BACK("haptic.virtual_navigation.click_back"),
    CLICK_MULTITASK("haptic.virtual_navigation.click_multitask");

    private final String mType;

    HapticsKitConstant$NavigationTypeEnum(String str) {
        this.mType = str;
    }

    public final String getType() {
        return this.mType;
    }
}
