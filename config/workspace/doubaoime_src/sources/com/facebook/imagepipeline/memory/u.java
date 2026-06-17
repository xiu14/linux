package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.AbstractC0719b;

/* loaded from: classes2.dex */
public abstract class u extends AbstractC0719b<t> {
    private final int[] k;

    u(com.facebook.common.memory.c cVar, B b, C c2) {
        super(cVar, b, c2);
        SparseIntArray sparseIntArray = b.f6488c;
        this.k = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.k;
            if (i >= iArr.length) {
                j();
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    protected void d(t tVar) {
        tVar.close();
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
    protected int g(t tVar) {
        return tVar.a();
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    protected int h(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    protected boolean l(t tVar) {
        return !tVar.isClosed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC0719b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public abstract t b(int i);

    int r() {
        return this.k[0];
    }
}
