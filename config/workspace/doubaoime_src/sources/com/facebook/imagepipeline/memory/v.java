package com.facebook.imagepipeline.memory;

import com.facebook.common.memory.g;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes2.dex */
public class v implements com.facebook.common.memory.g {
    private final int a;
    e.c.c.g.a<t> b;

    public v(e.c.c.g.a<t> aVar, int i) {
        Objects.requireNonNull(aVar);
        e.c.c.d.h.a(i >= 0 && i <= aVar.r().a());
        this.b = aVar.clone();
        this.a = i;
    }

    synchronized void a() {
        if (isClosed()) {
            throw new g.a();
        }
    }

    @Override // com.facebook.common.memory.g, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        e.c.c.g.a<t> aVar = this.b;
        int i = e.c.c.g.a.h;
        if (aVar != null) {
            aVar.close();
        }
        this.b = null;
    }

    @Override // com.facebook.common.memory.g
    public synchronized byte e(int i) {
        a();
        boolean z = true;
        e.c.c.d.h.a(i >= 0);
        if (i >= this.a) {
            z = false;
        }
        e.c.c.d.h.a(z);
        return this.b.r().e(i);
    }

    @Override // com.facebook.common.memory.g
    public synchronized int f(int i, byte[] bArr, int i2, int i3) {
        a();
        e.c.c.d.h.a(i + i3 <= this.a);
        return this.b.r().f(i, bArr, i2, i3);
    }

    @Override // com.facebook.common.memory.g
    public synchronized ByteBuffer g() {
        return this.b.r().g();
    }

    @Override // com.facebook.common.memory.g
    public synchronized long i() throws UnsupportedOperationException {
        a();
        return this.b.r().i();
    }

    @Override // com.facebook.common.memory.g
    public synchronized boolean isClosed() {
        return !e.c.c.g.a.x(this.b);
    }

    @Override // com.facebook.common.memory.g
    public synchronized int size() {
        a();
        return this.a;
    }
}
