package com.ttnet.org.chromium.net;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class D implements Closeable {
    public abstract long a() throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public abstract void d(E e2, ByteBuffer byteBuffer) throws IOException;

    public abstract void h(E e2) throws IOException;
}
