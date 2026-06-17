package com.bumptech.glide.load.engine.B;

/* loaded from: classes.dex */
public final class h implements a<int[]> {
    @Override // com.bumptech.glide.load.engine.B.a
    public String a() {
        return "IntegerArrayPool";
    }

    @Override // com.bumptech.glide.load.engine.B.a
    public int b() {
        return 4;
    }

    @Override // com.bumptech.glide.load.engine.B.a
    public int c(int[] iArr) {
        return iArr.length;
    }

    @Override // com.bumptech.glide.load.engine.B.a
    public int[] newArray(int i) {
        return new int[i];
    }
}
