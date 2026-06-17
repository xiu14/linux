package com.huawei.devices.utils;

@Deprecated
/* loaded from: classes2.dex */
public enum HapticsKitConstant$ClockTypeEnum {
    STOPWATCH("haptic.clock.stopwatch"),
    TIMER("haptic.clock.timer");

    private final String mType;

    HapticsKitConstant$ClockTypeEnum(String str) {
        this.mType = str;
    }

    public final String getType() {
        return this.mType;
    }
}
