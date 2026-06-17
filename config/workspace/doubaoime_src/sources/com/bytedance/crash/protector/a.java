package com.bytedance.crash.protector;

/* loaded from: classes.dex */
public class a {
    private byte[] a;
    private int b = 0;

    public a() {
        this.a = null;
        this.a = new byte[512];
    }

    private void c(int i) {
        byte[] bArr = this.a;
        if (bArr.length - this.b < i) {
            int length = bArr.length;
            byte[] bArr2 = new byte[Math.max(length, i) + length];
            System.arraycopy(this.a, 0, bArr2, 0, this.b);
            this.a = bArr2;
        }
    }

    public void a(int i) {
        int i2 = ((((r0 + i) - 1) / i) * i) - this.b;
        c(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = this.a;
            int i4 = this.b;
            this.b = i4 + 1;
            bArr[i4] = 0;
        }
    }

    public byte[] b() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e(int i) {
        a(4);
        int i2 = this.b;
        i(i);
        return i2;
    }

    public void f(byte[] bArr) {
        g(bArr, 0, bArr.length);
    }

    public void g(byte[] bArr, int i, int i2) {
        c(i2);
        System.arraycopy(bArr, i, this.a, this.b, i2);
        this.b += i2;
    }

    public void h(int i) {
        c(1);
        byte[] bArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    public void i(int i) {
        a(4);
        c(4);
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.b = i4;
        bArr[i3] = (byte) ((i >>> 8) & 255);
        int i5 = i4 + 1;
        this.b = i5;
        bArr[i4] = (byte) ((i >>> 16) & 255);
        this.b = i5 + 1;
        bArr[i5] = (byte) ((i >>> 24) & 255);
    }

    public void j(int i, int i2) {
        int i3 = this.b;
        this.b = i;
        i(i2);
        this.b = i3;
    }

    public void k(long j) {
        a(8);
        i((int) (j & 4294967295L));
        i((int) ((j >>> 32) & 4294967295L));
    }

    public void l(long j) {
        c(10);
        do {
            byte b = (byte) (127 & j);
            j >>>= 7;
            if (j != 0) {
                b = (byte) (b | 128);
            }
            byte[] bArr = this.a;
            int i = this.b;
            this.b = i + 1;
            bArr[i] = b;
        } while (j != 0);
    }
}
