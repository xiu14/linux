package com.bytedance.compression.zstd;

/* loaded from: classes.dex */
public class ZstdDictCompress extends d {
    private int level;
    private long nativePtr;

    static {
        com.bytedance.compression.zstd.f.a.a();
    }

    public ZstdDictCompress(byte[] bArr, int i) {
        this(bArr, 0, bArr.length, i);
    }

    private native void free();

    private native void init(byte[] bArr, int i, int i2, int i3);

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

    int level() {
        return this.level;
    }

    public ZstdDictCompress(byte[] bArr, int i, int i2, int i3) {
        this.nativePtr = 0L;
        this.level = ZstdCompress.defaultCompressionLevel();
        this.level = i3;
        if (bArr.length - i < 0) {
            throw new IllegalArgumentException("Dictionary buffer is to short");
        }
        init(bArr, i, i2, i3);
        if (0 == this.nativePtr) {
            throw new IllegalStateException("ZSTD_createCDict failed");
        }
        storeFence();
    }
}
