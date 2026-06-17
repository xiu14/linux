package com.facebook.imagepipeline.memory;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface t {
    int a();

    void close();

    long d();

    byte e(int i);

    int f(int i, byte[] bArr, int i2, int i3);

    ByteBuffer g();

    void h(int i, t tVar, int i2, int i3);

    long i() throws UnsupportedOperationException;

    boolean isClosed();

    int l(int i, byte[] bArr, int i2, int i3);
}
