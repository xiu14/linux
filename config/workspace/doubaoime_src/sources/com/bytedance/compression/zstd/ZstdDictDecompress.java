package com.bytedance.compression.zstd;

/* loaded from: classes.dex */
public class ZstdDictDecompress extends d {
    private long nativePtr;

    static {
        com.bytedance.compression.zstd.f.a.a();
    }

    public ZstdDictDecompress(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    private native void free();

    private native void init(byte[] bArr, int i, int i2);

    @Override // com.bytedance.compression.zstd.a, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // com.bytedance.compression.zstd.a
    void doClose() {
        if (this.nativePtr != 0) {
            free();
            this.nativePtr = 0L;
        }
    }

    public ZstdDictDecompress(byte[] bArr, int i, int i2) {
        this.nativePtr = 0L;
        init(bArr, i, i2);
        if (this.nativePtr == 0) {
            throw new IllegalStateException("ZSTD_createDDict failed");
        }
        storeFence();
    }
}
