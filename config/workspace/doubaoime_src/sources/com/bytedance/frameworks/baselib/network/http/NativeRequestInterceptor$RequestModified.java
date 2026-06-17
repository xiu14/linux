package com.bytedance.frameworks.baselib.network.http;

/* loaded from: classes.dex */
public enum NativeRequestInterceptor$RequestModified {
    NOT_MODIFIED(0),
    URL_MODIFIED(1),
    HEADER_MODIFIED(2),
    BOTH_MODIFIED(3);

    public final int mValue;

    NativeRequestInterceptor$RequestModified(int i) {
        this.mValue = i;
    }

    public int getValue() {
        return this.mValue;
    }
}
