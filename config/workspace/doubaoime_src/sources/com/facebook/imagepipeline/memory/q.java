package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.AbstractC0719b;

/* loaded from: classes2.dex */
public class q extends AbstractC0719b<byte[]> implements com.facebook.common.memory.a {
    private final int[] k;

    public q(com.facebook.common.memory.c cVar, B b, C c2) {
        super(cVar, b, c2);
        SparseIntArray sparseIntArray = b.f6488c;
        this.k = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.k[i] = sparseIntArray.keyAt(i);
        }
        j();
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    protected byte[] b(int i) {
        return new byte[i];
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    protected void d(byte[] bArr) {
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    protected int f(int i) {
        if (i <= 0) {
            throw new AbstractC0719b.C0327b(Integer.valueOf(i));
        }
        for (int i2 : this.k) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    protected int g(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    protected int h(int i) {
        return i;
    }
}
