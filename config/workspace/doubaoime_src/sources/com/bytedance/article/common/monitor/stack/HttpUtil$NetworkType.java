package com.bytedance.article.common.monitor.stack;

/* loaded from: classes.dex */
public enum HttpUtil$NetworkType {
    NONE(0),
    MOBILE(1),
    MOBILE_2G(2),
    MOBILE_3G(3),
    WIFI(4),
    MOBILE_4G(5);

    final int nativeInt;

    HttpUtil$NetworkType(int i) {
        this.nativeInt = i;
    }

    public int getValue() {
        return this.nativeInt;
    }
}
