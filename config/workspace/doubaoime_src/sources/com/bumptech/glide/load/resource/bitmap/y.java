package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class y extends f {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f1766c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(com.bumptech.glide.load.d.a);
    private final int b;

    public y(int i) {
        d.a.b.a.a(i > 0, "roundingRadius must be greater than 0.");
        this.b = i;
    }

    @Override // com.bumptech.glide.load.d
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f1766c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.f
    protected Bitmap c(@NonNull com.bumptech.glide.load.engine.B.d dVar, @NonNull Bitmap bitmap, int i, int i2) {
        return A.j(dVar, bitmap, this.b);
    }

    @Override // com.bumptech.glide.load.d
    public boolean equals(Object obj) {
        return (obj instanceof y) && this.b == ((y) obj).b;
    }

    @Override // com.bumptech.glide.load.d
    public int hashCode() {
        int i = this.b;
        int i2 = com.bumptech.glide.util.j.f1862d;
        return ((i + 527) * 31) - 569625254;
    }
}
