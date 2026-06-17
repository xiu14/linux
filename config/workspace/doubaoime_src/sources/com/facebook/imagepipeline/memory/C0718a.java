package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.Objects;

@TargetApi(27)
/* renamed from: com.facebook.imagepipeline.memory.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0718a implements t, Closeable {
    private SharedMemory a;
    private ByteBuffer b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6491c;

    public C0718a(int i) {
        e.c.c.d.h.a(i > 0);
        try {
            SharedMemory create = SharedMemory.create("AshmemMemoryChunk", i);
            this.a = create;
            this.b = create.mapReadWrite();
            this.f6491c = System.identityHashCode(this);
        } catch (ErrnoException e2) {
            throw new RuntimeException("Fail to create AshmemMemory", e2);
        }
    }

    private void o(int i, t tVar, int i2, int i3) {
        if (!(tVar instanceof C0718a)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        e.c.c.d.h.f(!isClosed());
        e.c.c.d.h.f(!tVar.isClosed());
        m.b(i, tVar.a(), i2, i3, a());
        this.b.position(i);
        tVar.g().position(i2);
        byte[] bArr = new byte[i3];
        this.b.get(bArr, 0, i3);
        tVar.g().put(bArr, 0, i3);
    }

    @Override // com.facebook.imagepipeline.memory.t
    public int a() {
        e.c.c.d.h.f(!isClosed());
        return this.a.getSize();
    }

    @Override // com.facebook.imagepipeline.memory.t, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!isClosed()) {
            SharedMemory.unmap(this.b);
            this.a.close();
            this.b = null;
            this.a = null;
        }
    }

    @Override // com.facebook.imagepipeline.memory.t
    public long d() {
        return this.f6491c;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized byte e(int i) {
        boolean z = true;
        e.c.c.d.h.f(!isClosed());
        e.c.c.d.h.a(i >= 0);
        if (i >= a()) {
            z = false;
        }
        e.c.c.d.h.a(z);
        return this.b.get(i);
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized int f(int i, byte[] bArr, int i2, int i3) {
        int a;
        Objects.requireNonNull(bArr);
        e.c.c.d.h.f(!isClosed());
        a = m.a(i, i3, a());
        m.b(i, bArr.length, i2, a, a());
        this.b.position(i);
        this.b.get(bArr, i2, a);
        return a;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public ByteBuffer g() {
        return this.b;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public void h(int i, t tVar, int i2, int i3) {
        Objects.requireNonNull(tVar);
        if (tVar.d() == this.f6491c) {
            StringBuilder M = e.a.a.a.a.M("Copying from AshmemMemoryChunk ");
            M.append(Long.toHexString(this.f6491c));
            M.append(" to AshmemMemoryChunk ");
            M.append(Long.toHexString(tVar.d()));
            M.append(" which are the same ");
            Log.w("AshmemMemoryChunk", M.toString());
            e.c.c.d.h.a(false);
        }
        if (tVar.d() < this.f6491c) {
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
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized boolean isClosed() {
        boolean z;
        if (this.b != null) {
            z = this.a == null;
        }
        return z;
    }

    @Override // com.facebook.imagepipeline.memory.t
    public synchronized int l(int i, byte[] bArr, int i2, int i3) {
        int a;
        e.c.c.d.h.f(!isClosed());
        a = m.a(i, i3, a());
        m.b(i, bArr.length, i2, a, a());
        this.b.position(i);
        this.b.put(bArr, i2, a);
        return a;
    }
}
