package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class w extends FilterInputStream {
    private volatile byte[] a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f1762c;

    /* renamed from: d, reason: collision with root package name */
    private int f1763d;

    /* renamed from: e, reason: collision with root package name */
    private int f1764e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.B.b f1765f;

    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public w(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.engine.B.b bVar) {
        super(inputStream);
        this.f1763d = -1;
        this.f1765f = bVar;
        this.a = (byte[]) bVar.c(65536, byte[].class);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f1763d;
        if (i != -1) {
            int i2 = this.f1764e - i;
            int i3 = this.f1762c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f1765f.c(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.a = bArr2;
                    this.f1765f.put(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f1764e - this.f1763d;
                this.f1764e = i4;
                this.f1763d = 0;
                this.b = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.f1764e;
                if (read > 0) {
                    i5 += read;
                }
                this.b = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f1763d = -1;
            this.f1764e = 0;
            this.b = read2;
        }
        return read2;
    }

    private static IOException l() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.a == null || inputStream == null) {
            l();
            throw null;
        }
        return (this.b - this.f1764e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.a != null) {
            this.f1765f.put(this.a);
            this.a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void d() {
        this.f1762c = this.a.length;
    }

    public synchronized void h() {
        if (this.a != null) {
            this.f1765f.put(this.a);
            this.a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.f1762c = Math.max(this.f1762c, i);
        this.f1763d = this.f1764e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            l();
            throw null;
        }
        if (this.f1764e >= this.b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.a && (bArr = this.a) == null) {
            l();
            throw null;
        }
        int i = this.b;
        int i2 = this.f1764e;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f1764e = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f1763d;
        if (-1 == i) {
            throw new a("Mark has been invalidated, pos: " + this.f1764e + " markLimit: " + this.f1762c);
        }
        this.f1764e = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.a;
        if (bArr == null) {
            l();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            l();
            throw null;
        }
        int i = this.b;
        int i2 = this.f1764e;
        if (i - i2 >= j) {
            this.f1764e = (int) (i2 + j);
            return j;
        }
        long j2 = i - i2;
        this.f1764e = i;
        if (this.f1763d == -1 || j > this.f1762c) {
            long skip = inputStream.skip(j - j2);
            if (skip > 0) {
                this.f1763d = -1;
            }
            return j2 + skip;
        }
        if (a(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.b;
        int i4 = this.f1764e;
        if (i3 - i4 >= j - j2) {
            this.f1764e = (int) ((i4 + j) - j2);
            return j;
        }
        long j3 = (j2 + i3) - i4;
        this.f1764e = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.a;
        if (bArr2 == null) {
            l();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f1764e;
            int i6 = this.b;
            if (i5 < i6) {
                int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f1764e += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f1763d == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.a && (bArr2 = this.a) == null) {
                        l();
                        throw null;
                    }
                    int i8 = this.b;
                    int i9 = this.f1764e;
                    i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f1764e += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            l();
            throw null;
        }
    }
}
