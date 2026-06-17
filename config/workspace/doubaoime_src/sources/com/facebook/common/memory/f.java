package com.facebook.common.memory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes2.dex */
public class f extends InputStream {
    private final InputStream a;
    private final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.c.g.d<byte[]> f6312c;

    /* renamed from: d, reason: collision with root package name */
    private int f6313d;

    /* renamed from: e, reason: collision with root package name */
    private int f6314e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6315f;

    public f(InputStream inputStream, byte[] bArr, e.c.c.g.d<byte[]> dVar) {
        Objects.requireNonNull(inputStream);
        this.a = inputStream;
        Objects.requireNonNull(bArr);
        this.b = bArr;
        Objects.requireNonNull(dVar);
        this.f6312c = dVar;
        this.f6313d = 0;
        this.f6314e = 0;
        this.f6315f = false;
    }

    private boolean a() throws IOException {
        if (this.f6314e < this.f6313d) {
            return true;
        }
        int read = this.a.read(this.b);
        if (read <= 0) {
            return false;
        }
        this.f6313d = read;
        this.f6314e = 0;
        return true;
    }

    private void d() throws IOException {
        if (this.f6315f) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        e.c.c.d.h.f(this.f6314e <= this.f6313d);
        d();
        return this.a.available() + (this.f6313d - this.f6314e);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f6315f) {
            return;
        }
        this.f6315f = true;
        this.f6312c.release(this.b);
        super.close();
    }

    protected void finalize() throws Throwable {
        if (!this.f6315f) {
            e.c.c.e.a.i("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        e.c.c.d.h.f(this.f6314e <= this.f6313d);
        d();
        if (!a()) {
            return -1;
        }
        byte[] bArr = this.b;
        int i = this.f6314e;
        this.f6314e = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        e.c.c.d.h.f(this.f6314e <= this.f6313d);
        d();
        int i = this.f6313d;
        int i2 = this.f6314e;
        long j2 = i - i2;
        if (j2 >= j) {
            this.f6314e = (int) (i2 + j);
            return j;
        }
        this.f6314e = i;
        return this.a.skip(j - j2) + j2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        e.c.c.d.h.f(this.f6314e <= this.f6313d);
        d();
        if (!a()) {
            return -1;
        }
        int min = Math.min(this.f6313d - this.f6314e, i2);
        System.arraycopy(this.b, this.f6314e, bArr, i, min);
        this.f6314e += min;
        return min;
    }
}
