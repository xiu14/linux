package com.ttnet.org.chromium.net.impl;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class P extends com.ttnet.org.chromium.net.D {
    private final com.ttnet.org.chromium.net.D a;

    public P(com.ttnet.org.chromium.net.D d2) {
        this.a = d2;
    }

    @Override // com.ttnet.org.chromium.net.D
    public long a() throws IOException {
        return this.a.a();
    }

    @Override // com.ttnet.org.chromium.net.D, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // com.ttnet.org.chromium.net.D
    public void d(com.ttnet.org.chromium.net.E e2, ByteBuffer byteBuffer) throws IOException {
        this.a.d(e2, byteBuffer);
    }

    @Override // com.ttnet.org.chromium.net.D
    public void h(com.ttnet.org.chromium.net.E e2) throws IOException {
        this.a.h(e2);
    }
}
