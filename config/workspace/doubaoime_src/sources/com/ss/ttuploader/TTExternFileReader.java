package com.ss.ttuploader;

/* loaded from: classes2.dex */
public interface TTExternFileReader {
    public static final int KeyGetHeaderSize = 1;
    public static final int KeyIsGetFileSize = 0;
    public static final int ReadSliceEnd = 0;
    public static final int ReadSliceError = -1;
    public static final int ReadSliceErrorIsCancel = -2;

    void cancel();

    long getCrc32ByOffset(long j, int i);

    long getValue(int i);

    int readSlice(int i, byte[] bArr, int i2);

    int readSliceByOffset(long j, byte[] bArr, int i, int i2);
}
