package com.ttnet.org.chromium.net.impl;

/* loaded from: classes2.dex */
public class TTCompressManager {

    public enum CompressType {
        GZIP(1),
        BROTLI(2),
        ZSTD(3);

        final int mType;

        CompressType(int i) {
            this.mType = i;
        }

        public int getValue() {
            return this.mType;
        }
    }

    public static byte[] a(byte[] bArr, int i, int i2, CompressType compressType) {
        return nativeCompressData(bArr, i, i2, compressType.getValue());
    }

    public static byte[] b(byte[] bArr, int i, CompressType compressType) {
        return nativeDecompressData(bArr, i, compressType.getValue());
    }

    private static native byte[] nativeCompressData(byte[] bArr, int i, int i2, int i3);

    private static native byte[] nativeDecompressData(byte[] bArr, int i, int i2);
}
