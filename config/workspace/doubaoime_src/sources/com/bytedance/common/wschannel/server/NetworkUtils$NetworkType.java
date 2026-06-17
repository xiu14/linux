package com.bytedance.common.wschannel.server;

/* loaded from: classes.dex */
public enum NetworkUtils$NetworkType {
    NONE(0),
    MOBILE(1),
    MOBILE_2G(2),
    MOBILE_3G(3),
    WIFI(4),
    MOBILE_4G(5);

    final int nativeInt;

    NetworkUtils$NetworkType(int i) {
        this.nativeInt = i;
    }

    public int getValue() {
        return this.nativeInt;
    }
}
