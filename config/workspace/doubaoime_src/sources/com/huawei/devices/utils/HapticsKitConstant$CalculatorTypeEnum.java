package com.huawei.devices.utils;

@Deprecated
/* loaded from: classes2.dex */
public enum HapticsKitConstant$CalculatorTypeEnum {
    DELETE_LONG_PRESS("haptic.calculator.delete_long_press"),
    VITUAL_TASK("haptic.virtual_float_tasks.long_press");

    private final String mType;

    HapticsKitConstant$CalculatorTypeEnum(String str) {
        this.mType = str;
    }

    public final String getType() {
        return this.mType;
    }
}
