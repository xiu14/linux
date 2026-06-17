package com.facebook.common.memory;

import java.io.InputStream;

/* loaded from: classes2.dex */
public class i extends InputStream {
    final g a;
    int b;

    /* renamed from: c, reason: collision with root package name */
    int f6316c;

    public i(g gVar) {
        e.c.c.d.h.a(!gVar.isClosed());
        this.a = gVar;
        this.b = 0;
        this.f6316c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.a.size() - this.b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f6316c = this.b;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        g gVar = this.a;
        int i = this.b;
        this.b = i + 1;
        return gVar.e(i) & 255;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.b = this.f6316c;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        e.c.c.d.h.a(j >= 0);
        int min = Math.min((int) j, available());
        this.b += min;
        return min;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            int available = available();
            if (available <= 0) {
                return -1;
            }
            if (i2 <= 0) {
                return 0;
            }
            int min = Math.min(available, i2);
            this.a.f(this.b, bArr, i, min);
            this.b += min;
            return min;
        }
        StringBuilder M = e.a.a.a.a.M("length=");
        e.a.a.a.a.F0(M, bArr.length, "; regionStart=", i, "; regionLength=");
        M.append(i2);
        throw new ArrayIndexOutOfBoundsException(M.toString());
    }
}
