package com.bumptech.glide.load.engine.B;

/* loaded from: classes.dex */
public final class f implements a<byte[]> {
    @Override // com.bumptech.glide.load.engine.B.a
    public String a() {
        return "ByteArrayPool";
    }

    @Override // com.bumptech.glide.load.engine.B.a
    public int b() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.B.a
    public int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.bumptech.glide.load.engine.B.a
    public byte[] newArray(int i) {
        return new byte[i];
    }
}
