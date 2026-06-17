package com.bytedance.compression.zstd;

/* loaded from: classes.dex */
public class e extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j) {
        super(Zstd.getErrorName(j));
        Zstd.getErrorCode(j);
    }

    public e(long j, String str) {
        super(str);
    }
}
