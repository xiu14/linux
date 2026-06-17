package com.xiaomi.push;

/* loaded from: classes2.dex */
public class jx extends jz {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private jh f921a;

    public jx(int i) {
        this.f921a = new jh(i);
    }

    @Override // com.xiaomi.push.jz
    public int a(byte[] bArr, int i, int i2) {
        byte[] m635a = this.f921a.m635a();
        if (i2 > this.f921a.a() - this.a) {
            i2 = this.f921a.a() - this.a;
        }
        if (i2 > 0) {
            System.arraycopy(m635a, this.a, bArr, i, i2);
            this.a += i2;
        }
        return i2;
    }

    @Override // com.xiaomi.push.jz
    /* renamed from: a */
    public void mo650a(byte[] bArr, int i, int i2) {
        this.f921a.write(bArr, i, i2);
    }

    public int a() {
        return this.f921a.size();
    }
}
