package com.bytedance.push.O;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class b extends InputStream {
    private final InputStream a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private long f5565c;

    /* renamed from: d, reason: collision with root package name */
    private long f5566d;

    /* renamed from: e, reason: collision with root package name */
    private long f5567e = -1;

    public b(InputStream inputStream) {
        this.a = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, 4096);
    }

    private void h(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.a.skip(j2 - j);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j += skip;
        }
    }

    public void a(long j) throws IOException {
        if (this.b > this.f5566d || j < this.f5565c) {
            throw new IOException("Cannot reset");
        }
        this.a.reset();
        h(this.f5565c, j);
        this.b = j;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    public long d(int i) {
        long j = this.b;
        long j2 = i + j;
        long j3 = this.f5566d;
        if (j3 < j2) {
            try {
                if (this.f5565c >= j || j > j3) {
                    this.f5565c = j;
                    this.a.mark((int) (j2 - j));
                } else {
                    this.a.reset();
                    this.a.mark((int) (j2 - this.f5565c));
                    h(this.f5565c, this.b);
                }
                this.f5566d = j2;
            } catch (IOException e2) {
                throw new IllegalStateException("Unable to mark: " + e2);
            }
        }
        return this.b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f5567e = d(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = this.a.read();
        if (read != -1) {
            this.b++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        a(this.f5567e);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = this.a.skip(j);
        this.b += skip;
        return skip;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int read = this.a.read(bArr);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
