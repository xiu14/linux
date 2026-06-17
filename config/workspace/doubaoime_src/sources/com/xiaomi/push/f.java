package com.xiaomi.push;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class f {
    public abstract int a();

    public abstract f a(c cVar);

    public abstract void a(d dVar);

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m380a() {
        int b = b();
        byte[] bArr = new byte[b];
        m379a(bArr, 0, b);
        return bArr;
    }

    public abstract int b();

    /* renamed from: a, reason: collision with other method in class */
    public void m379a(byte[] bArr, int i, int i2) {
        try {
            d a = d.a(bArr, i, i2);
            a(a);
            a.b();
        } catch (IOException unused) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    public f a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public f a(byte[] bArr, int i, int i2) {
        try {
            c a = c.a(bArr, i, i2);
            a(a);
            a.m150a(0);
            return this;
        } catch (e e2) {
            throw e2;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    protected boolean a(c cVar, int i) {
        return cVar.m152a(i);
    }
}
