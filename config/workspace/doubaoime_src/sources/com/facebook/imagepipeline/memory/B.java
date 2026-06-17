package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* loaded from: classes2.dex */
public class B {
    public final int a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseIntArray f6488c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6489d;

    public B(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public B(int i, int i2, SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        e.c.c.d.h.f(i >= 0 && i2 >= i);
        this.b = i;
        this.a = i2;
        this.f6488c = sparseIntArray;
        this.f6489d = i5;
    }
}
