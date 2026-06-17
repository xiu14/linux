package com.bytedance.article.common.monitor.stack;

/* loaded from: classes.dex */
public enum HttpUtil$CompressType {
    NONE(0),
    GZIP(1),
    DEFLATER(2);

    final int nativeInt;

    HttpUtil$CompressType(int i) {
        this.nativeInt = i;
    }
}
