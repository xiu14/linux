package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    @NonNull
    private final OutputStream a;
    private byte[] b;

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.B.b f1562c;

    /* renamed from: d, reason: collision with root package name */
    private int f1563d;

    public c(@NonNull OutputStream outputStream, @NonNull com.bumptech.glide.load.engine.B.b bVar) {
        this.a = outputStream;
        this.f1562c = bVar;
        this.b = (byte[]) bVar.c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.a.close();
            byte[] bArr = this.b;
            if (bArr != null) {
                this.f1562c.put(bArr);
                this.b = null;
            }
        } catch (Throwable th) {
            this.a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        int i = this.f1563d;
        if (i > 0) {
            this.a.write(this.b, 0, i);
            this.f1563d = 0;
        }
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.b;
        int i2 = this.f1563d;
        int i3 = i2 + 1;
        this.f1563d = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.a.write(bArr, 0, i3);
        this.f1563d = 0;
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f1563d;
            if (i6 == 0 && i4 >= this.b.length) {
                this.a.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.b.length - i6);
            System.arraycopy(bArr, i5, this.b, this.f1563d, min);
            int i7 = this.f1563d + min;
            this.f1563d = i7;
            i3 += min;
            byte[] bArr2 = this.b;
            if (i7 == bArr2.length && i7 > 0) {
                this.a.write(bArr2, 0, i7);
                this.f1563d = 0;
            }
        } while (i3 < i2);
    }
}
