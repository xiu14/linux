package com.xiaomi.push;

/* loaded from: classes2.dex */
public final class b {
    public static final b a = new b(new byte[0]);

    /* renamed from: a, reason: collision with other field name */
    private volatile int f136a = 0;

    /* renamed from: a, reason: collision with other field name */
    private final byte[] f137a;

    private b(byte[] bArr) {
        this.f137a = bArr;
    }

    public int a() {
        return this.f137a.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        byte[] bArr = this.f137a;
        int length = bArr.length;
        byte[] bArr2 = ((b) obj).f137a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f136a;
        if (i == 0) {
            byte[] bArr = this.f137a;
            int length = bArr.length;
            for (byte b : bArr) {
                length = (length * 31) + b;
            }
            i = length == 0 ? 1 : length;
            this.f136a = i;
        }
        return i;
    }

    public static b a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new b(bArr2);
    }

    public static b a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m125a() {
        byte[] bArr = this.f137a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
