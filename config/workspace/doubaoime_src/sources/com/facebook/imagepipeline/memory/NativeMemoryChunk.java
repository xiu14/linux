package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.Objects;

@e.c.c.d.c
/* loaded from: classes2.dex */
public class NativeMemoryChunk implements t, Closeable {
    private final long a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6490c;

    static {
        com.facebook.soloader.r.a.c("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        e.c.c.d.h.a(i > 0);
        this.b = i;
        this.a = nativeAllocate(i);
        this.f6490c = false;
    }

    @e.c.c.d.c
    private static native long nativeAllocate(int i);

    @e.c.c.d.c
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @e.c.c.d.c
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @e.c.c.d.c
    private static native void nativeFree(long j);

    @e.c.c.d.c
    private static native void nativeMemcpy(long j, long j2, int i);

    @e.c.c.d.c
    private static native byte nativeReadByte(long j);

    private void o(int i, t tVar, int i2, int i3) {
        if (!(tVar instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        e.c.c.d.h.f(!isClosed());
        e.c.c.d.h.f(!tVar.isClosed());
        m.b(i, tVar.a(), i2, i3, this.b);
        nativeMemcpy(tVar.i() + i2, this.a + i, i3);
    }

    @Override // com.facebook.imagepipeline.memory.t
    public int a() {
        return this.b;
    }

    @Override // com.facebook.imagepipeline.memory.t, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f6490c) {
            this.f6490c = true;
            nativeFree(this.a);
        }
    }

    @Override // com.facebook.imagepipeline.memory.t
    public long d() {
        return this.a;
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
        return nativeReadByte(this.a + i);
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized int f(int i, byte[] bArr, int i2, int i3) {
        int a;
        Objects.requireNonNull(bArr);
        e.c.c.d.h.f(!isClosed());
        a = m.a(i, i3, this.b);
        m.b(i, bArr.length, i2, a, this.b);
        nativeCopyToByteArray(this.a + i, bArr, i2, a);
        return a;
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("finalize: Chunk ");
        M.append(Integer.toHexString(System.identityHashCode(this)));
        M.append(" still active. ");
        Log.w("NativeMemoryChunk", M.toString());
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.imagepipeline.memory.t
    public ByteBuffer g() {
        return null;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public void h(int i, t tVar, int i2, int i3) {
        Objects.requireNonNull(tVar);
        if (tVar.d() == this.a) {
            StringBuilder M = e.a.a.a.a.M("Copying from NativeMemoryChunk ");
            M.append(Integer.toHexString(System.identityHashCode(this)));
            M.append(" to NativeMemoryChunk ");
            M.append(Integer.toHexString(System.identityHashCode(tVar)));
            M.append(" which share the same address ");
            M.append(Long.toHexString(this.a));
            Log.w("NativeMemoryChunk", M.toString());
            e.c.c.d.h.a(false);
        }
        if (tVar.d() < this.a) {
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
        return this.a;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized boolean isClosed() {
        return this.f6490c;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized int l(int i, byte[] bArr, int i2, int i3) {
        int a;
        e.c.c.d.h.f(!isClosed());
        a = m.a(i, i3, this.b);
        m.b(i, bArr.length, i2, a, this.b);
        nativeCopyFromByteArray(this.a + i, bArr, i2, a);
        return a;
    }

    public NativeMemoryChunk() {
        this.b = 0;
        this.a = 0L;
        this.f6490c = true;
    }
}
