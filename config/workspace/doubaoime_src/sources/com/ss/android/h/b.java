package com.ss.android.h;

import java.io.IOException;

/* loaded from: classes2.dex */
public interface b {
    void close() throws IOException;

    long length() throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    void seek(long j, long j2) throws IOException;
}
