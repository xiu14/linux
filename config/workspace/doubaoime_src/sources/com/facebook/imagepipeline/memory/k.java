package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* loaded from: classes2.dex */
public class k {
    private static final SparseIntArray a = new SparseIntArray(0);

    public static B a() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return new B(0, min > 16777216 ? (min / 4) * 3 : min / 2, a);
    }
}
