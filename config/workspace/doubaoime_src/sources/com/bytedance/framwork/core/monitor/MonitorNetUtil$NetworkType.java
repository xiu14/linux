package com.bytedance.framwork.core.monitor;

/* loaded from: classes.dex */
public enum MonitorNetUtil$NetworkType {
    NONE(0),
    MOBILE(1),
    MOBILE_2G(2),
    MOBILE_3G(3),
    WIFI(4),
    MOBILE_4G(5);

    final int nativeInt;

    MonitorNetUtil$NetworkType(int i) {
        this.nativeInt = i;
    }

    public int getValue() {
        return this.nativeInt;
    }
}
