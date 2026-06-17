package com.facebook.common.memory;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class j extends OutputStream {
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e2) {
            e.c.c.d.h.j(e2);
            throw new RuntimeException(e2);
        }
    }

    public abstract int size();
}
