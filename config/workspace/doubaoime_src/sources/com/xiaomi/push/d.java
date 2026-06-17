package com.xiaomi.push;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public final class d {
    private final int a;

    /* renamed from: a, reason: collision with other field name */
    private final OutputStream f237a;

    /* renamed from: a, reason: collision with other field name */
    private final byte[] f238a;
    private int b;

    public static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private d(byte[] bArr, int i, int i2) {
        this.f237a = null;
        this.f238a = bArr;
        this.b = i;
        this.a = i + i2;
    }

    public static int a(boolean z) {
        return 1;
    }

    public static d a(OutputStream outputStream) {
        return a(outputStream, 4096);
    }

    public static int c(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    private void c() {
        OutputStream outputStream = this.f237a;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.f238a, 0, this.b);
        this.b = 0;
    }

    public static int d(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m221b(int i, long j) {
        c(i, 0);
        m222b(j);
    }

    /* renamed from: d, reason: collision with other method in class */
    public void m225d(int i) {
        while ((i & (-128)) != 0) {
            m223c((i & 127) | 128);
            i >>>= 7;
        }
        m223c(i);
    }

    public static d a(OutputStream outputStream, int i) {
        return new d(outputStream, new byte[i]);
    }

    public static d a(byte[] bArr, int i, int i2) {
        return new d(bArr, i, i2);
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m220b(int i, int i2) {
        c(i, 0);
        m219b(i2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m208a(int i, long j) {
        c(i, 0);
        m213a(j);
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m222b(long j) {
        m224c(j);
    }

    /* renamed from: c, reason: collision with other method in class */
    public void m223c(int i) {
        a((byte) i);
    }

    private d(OutputStream outputStream, byte[] bArr) {
        this.f237a = outputStream;
        this.f238a = bArr;
        this.b = 0;
        this.a = bArr.length;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m207a(int i, int i2) {
        c(i, 0);
        m206a(i2);
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m219b(int i) {
        m225d(i);
    }

    public void c(int i, int i2) {
        m225d(g.a(i, i2));
    }

    public static int b(int i, long j) {
        return b(j) + c(i);
    }

    public static int c(int i) {
        return d(g.a(i, 0));
    }

    public static int b(int i, int i2) {
        return b(i2) + c(i);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m212a(int i, boolean z) {
        c(i, 0);
        m217a(z);
    }

    /* renamed from: c, reason: collision with other method in class */
    public void m224c(long j) {
        while (((-128) & j) != 0) {
            m223c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m223c((int) j);
    }

    public static int b(long j) {
        return c(j);
    }

    public static int b(int i) {
        return d(i);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m211a(int i, String str) {
        c(i, 2);
        m216a(str);
    }

    public void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m210a(int i, f fVar) {
        c(i, 2);
        m215a(fVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m209a(int i, b bVar) {
        c(i, 2);
        m214a(bVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m213a(long j) {
        m224c(j);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m206a(int i) {
        if (i >= 0) {
            m225d(i);
        } else {
            m224c(i);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m217a(boolean z) {
        m223c(z ? 1 : 0);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m216a(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m225d(bytes.length);
        a(bytes);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m215a(f fVar) {
        m225d(fVar.a());
        fVar.a(this);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m214a(b bVar) {
        byte[] m125a = bVar.m125a();
        m225d(m125a.length);
        a(m125a);
    }

    public static int a(int i, long j) {
        return a(j) + c(i);
    }

    public static int a(int i, int i2) {
        return a(i2) + c(i);
    }

    public static int a(int i, boolean z) {
        return a(z) + c(i);
    }

    public static int a(int i, String str) {
        return a(str) + c(i);
    }

    public static int a(int i, f fVar) {
        return a(fVar) + c(i);
    }

    public static int a(int i, b bVar) {
        return a(bVar) + c(i);
    }

    public static int a(long j) {
        return c(j);
    }

    public static int a(int i) {
        if (i >= 0) {
            return d(i);
        }
        return 10;
    }

    public static int a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return d(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static int a(f fVar) {
        int b = fVar.b();
        return d(b) + b;
    }

    public static int a(b bVar) {
        return bVar.a() + d(bVar.a());
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m205a() {
        if (this.f237a != null) {
            c();
        }
    }

    public int a() {
        if (this.f237a == null) {
            return this.a - this.b;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    public void a(byte b) {
        if (this.b == this.a) {
            c();
        }
        byte[] bArr = this.f238a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = b;
    }

    public void a(byte[] bArr) {
        m218a(bArr, 0, bArr.length);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m218a(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        int i4 = this.b;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f238a, i4, i2);
            this.b += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f238a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.b = this.a;
        c();
        if (i7 <= this.a) {
            System.arraycopy(bArr, i6, this.f238a, 0, i7);
            this.b = i7;
        } else {
            this.f237a.write(bArr, i6, i7);
        }
    }
}
