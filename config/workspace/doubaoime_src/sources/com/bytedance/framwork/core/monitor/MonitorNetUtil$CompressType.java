package com.bytedance.framwork.core.monitor;

/* loaded from: classes.dex */
public enum MonitorNetUtil$CompressType {
    NONE(0),
    GZIP(1),
    DEFLATER(2);

    final int nativeInt;

    MonitorNetUtil$CompressType(int i) {
        this.nativeInt = i;
    }
}
