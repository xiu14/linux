package com.xiaomi.push;

/* loaded from: classes2.dex */
public final class jy extends jz {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f922a;
    private int b;

    public void a(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    @Override // com.xiaomi.push.jz
    public int a_() {
        return this.a;
    }

    public void b(byte[] bArr, int i, int i2) {
        this.f922a = bArr;
        this.a = i;
        this.b = i + i2;
    }

    @Override // com.xiaomi.push.jz
    public int a(byte[] bArr, int i, int i2) {
        int b = b();
        if (i2 > b) {
            i2 = b;
        }
        if (i2 > 0) {
            System.arraycopy(this.f922a, this.a, bArr, i, i2);
            a(i2);
        }
        return i2;
    }

    @Override // com.xiaomi.push.jz
    public int b() {
        return this.b - this.a;
    }

    @Override // com.xiaomi.push.jz
    /* renamed from: a */
    public void mo650a(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.xiaomi.push.jz
    public byte[] a() {
        return this.f922a;
    }

    @Override // com.xiaomi.push.jz
    public void a(int i) {
        this.a += i;
    }
}
