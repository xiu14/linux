package com.bytedance.compression.zstd;

/* loaded from: classes.dex */
abstract class d extends a {
    d() {
    }

    protected void finalize() {
        close();
    }
}
