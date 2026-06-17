package com.bytedance.common.wschannel;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public enum TransportMode {
    TUDP(0),
    TLS(1),
    HTTP2(2),
    TUDP_PROXY(3),
    TLS_PROXY(4);

    final int mTypeValue;

    TransportMode(int i) {
        this.mTypeValue = i;
    }

    @Nullable
    public static TransportMode convertToMode() {
        return null;
    }

    public int getTypeValue() {
        return this.mTypeValue;
    }
}
