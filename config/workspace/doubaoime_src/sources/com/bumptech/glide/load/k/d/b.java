package com.bumptech.glide.load.k.d;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import java.util.Objects;

/* loaded from: classes.dex */
public class b implements v<byte[]> {
    private final byte[] a;

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr, "Argument must not be null");
        this.a = bArr;
    }

    @Override // com.bumptech.glide.load.engine.v
    public int a() {
        return this.a.length;
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<byte[]> c() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public byte[] get() {
        return this.a;
    }

    @Override // com.bumptech.glide.load.engine.v
    public void recycle() {
    }
}
