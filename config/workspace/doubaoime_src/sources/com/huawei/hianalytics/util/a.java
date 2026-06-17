package com.huawei.hianalytics.util;

/* loaded from: classes2.dex */
public class a {
    private byte[] a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f7171c;

    public a() {
        this.a = null;
        this.b = 1024;
        this.f7171c = 0;
        this.a = new byte[1024];
    }

    public a(int i) {
        this.a = null;
        this.b = 1024;
        this.f7171c = 0;
        this.b = i;
        this.a = new byte[i];
    }

    public int a() {
        return this.f7171c;
    }

    public void a(byte[] bArr, int i) {
        if (i <= 0) {
            return;
        }
        byte[] bArr2 = this.a;
        int length = bArr2.length;
        int i2 = this.f7171c;
        if (length - i2 >= i) {
            System.arraycopy(bArr, 0, bArr2, i2, i);
        } else {
            byte[] bArr3 = new byte[(bArr2.length + i) << 1];
            System.arraycopy(bArr2, 0, bArr3, 0, i2);
            System.arraycopy(bArr, 0, bArr3, this.f7171c, i);
            this.a = bArr3;
        }
        this.f7171c += i;
    }

    public byte[] b() {
        int i = this.f7171c;
        if (i <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.a, 0, bArr, 0, i);
        return bArr;
    }
}
