package com.bumptech.glide.m;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
class b implements Closeable {
    private final InputStream a;
    private final Charset b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f1799c;

    /* renamed from: d, reason: collision with root package name */
    private int f1800d;

    /* renamed from: e, reason: collision with root package name */
    private int f1801e;

    class a extends ByteArrayOutputStream {
        a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, b.this.b.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(c.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.a = inputStream;
        this.b = charset;
        this.f1799c = new byte[8192];
    }

    private void d() throws IOException {
        InputStream inputStream = this.a;
        byte[] bArr = this.f1799c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f1800d = 0;
        this.f1801e = read;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.a) {
            if (this.f1799c != null) {
                this.f1799c = null;
                this.a.close();
            }
        }
    }

    public boolean h() {
        return this.f1801e == -1;
    }

    public String l() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.a) {
            if (this.f1799c == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f1800d >= this.f1801e) {
                d();
            }
            for (int i3 = this.f1800d; i3 != this.f1801e; i3++) {
                byte[] bArr2 = this.f1799c;
                if (bArr2[i3] == 10) {
                    if (i3 != this.f1800d) {
                        i2 = i3 - 1;
                        if (bArr2[i2] == 13) {
                            byte[] bArr3 = this.f1799c;
                            int i4 = this.f1800d;
                            String str = new String(bArr3, i4, i2 - i4, this.b.name());
                            this.f1800d = i3 + 1;
                            return str;
                        }
                    }
                    i2 = i3;
                    byte[] bArr32 = this.f1799c;
                    int i42 = this.f1800d;
                    String str2 = new String(bArr32, i42, i2 - i42, this.b.name());
                    this.f1800d = i3 + 1;
                    return str2;
                }
            }
            a aVar = new a((this.f1801e - this.f1800d) + 80);
            loop1: while (true) {
                byte[] bArr4 = this.f1799c;
                int i5 = this.f1800d;
                aVar.write(bArr4, i5, this.f1801e - i5);
                this.f1801e = -1;
                d();
                i = this.f1800d;
                while (i != this.f1801e) {
                    bArr = this.f1799c;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.f1800d;
            if (i != i6) {
                aVar.write(bArr, i6, i - i6);
            }
            this.f1800d = i + 1;
            return aVar.toString();
        }
    }
}
