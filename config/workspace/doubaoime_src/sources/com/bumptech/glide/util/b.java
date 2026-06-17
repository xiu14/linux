package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class b extends FilterInputStream {
    private final long a;
    private int b;

    private b(@NonNull InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    private int a(int i) throws IOException {
        if (i >= 0) {
            this.b += i;
        } else if (this.a - this.b > 0) {
            StringBuilder M = e.a.a.a.a.M("Failed to read all expected data, expected: ");
            M.append(this.a);
            M.append(", but read: ");
            M.append(this.b);
            throw new IOException(M.toString());
        }
        return i;
    }

    @NonNull
    public static InputStream d(@NonNull InputStream inputStream, long j) {
        return new b(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.a - this.b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        a(read);
        return read;
    }
}
