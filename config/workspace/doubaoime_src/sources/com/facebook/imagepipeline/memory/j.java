package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes2.dex */
public class j implements t, Closeable {
    private ByteBuffer a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6507c = System.identityHashCode(this);

    public j(int i) {
        this.a = ByteBuffer.allocateDirect(i);
        this.b = i;
    }

    private void o(int i, t tVar, int i2, int i3) {
        if (!(tVar instanceof j)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        e.c.c.d.h.f(!isClosed());
        e.c.c.d.h.f(!tVar.isClosed());
        m.b(i, tVar.a(), i2, i3, this.b);
        this.a.position(i);
        tVar.g().position(i2);
        byte[] bArr = new byte[i3];
        this.a.get(bArr, 0, i3);
        tVar.g().put(bArr, 0, i3);
    }

    @Override // com.facebook.imagepipeline.memory.t
    public int a() {
        return this.b;
    }

    @Override // com.facebook.imagepipeline.memory.t, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.a = null;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public long d() {
        return this.f6507c;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized byte e(int i) {
        boolean z = true;
        e.c.c.d.h.f(!isClosed());
        e.c.c.d.h.a(i >= 0);
        if (i >= this.b) {
            z = false;
        }
        e.c.c.d.h.a(z);
        return this.a.get(i);
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized int f(int i, byte[] bArr, int i2, int i3) {
        int a;
        Objects.requireNonNull(bArr);
        e.c.c.d.h.f(!isClosed());
        a = m.a(i, i3, this.b);
        m.b(i, bArr.length, i2, a, this.b);
        this.a.position(i);
        this.a.get(bArr, i2, a);
        return a;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized ByteBuffer g() {
        return this.a;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public void h(int i, t tVar, int i2, int i3) {
        Objects.requireNonNull(tVar);
        if (tVar.d() == this.f6507c) {
            StringBuilder M = e.a.a.a.a.M("Copying from BufferMemoryChunk ");
            M.append(Long.toHexString(this.f6507c));
            M.append(" to BufferMemoryChunk ");
            M.append(Long.toHexString(tVar.d()));
            M.append(" which are the same ");
            Log.w("BufferMemoryChunk", M.toString());
            e.c.c.d.h.a(false);
        }
        if (tVar.d() < this.f6507c) {
            synchronized (tVar) {
                synchronized (this) {
                    o(i, tVar, i2, i3);
                }
            }
        } else {
            synchronized (this) {
                synchronized (tVar) {
                    o(i, tVar, i2, i3);
                }
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.t
    public long i() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized boolean isClosed() {
        return this.a == null;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized int l(int i, byte[] bArr, int i2, int i3) {
        int a;
        e.c.c.d.h.f(!isClosed());
        a = m.a(i, i3, this.b);
        m.b(i, bArr.length, i2, a, this.b);
        this.a.position(i);
        this.a.put(bArr, i2, a);
        return a;
    }
}
