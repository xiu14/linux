package com.facebook.common.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface g extends Closeable {

    public static class a extends RuntimeException {
        public a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    byte e(int i);

    int f(int i, byte[] bArr, int i2, int i3);

    ByteBuffer g();

    long i();

    boolean isClosed();

    int size();
}
