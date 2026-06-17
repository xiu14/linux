package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class o implements com.bumptech.glide.load.i<Drawable> {
    private final com.bumptech.glide.load.i<Bitmap> b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1753c;

    public o(com.bumptech.glide.load.i<Bitmap> iVar, boolean z) {
        this.b = iVar;
        this.f1753c = z;
    }

    @Override // com.bumptech.glide.load.d
    public void a(@NonNull MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.i
    @NonNull
    public com.bumptech.glide.load.engine.v<Drawable> b(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.v<Drawable> vVar, int i, int i2) {
        com.bumptech.glide.load.engine.B.d d2 = com.bumptech.glide.c.b(context).d();
        Drawable drawable = vVar.get();
        com.bumptech.glide.load.engine.v<Bitmap> a = n.a(d2, drawable, i, i2);
        if (a != null) {
            com.bumptech.glide.load.engine.v<Bitmap> b = this.b.b(context, a, i, i2);
            if (!b.equals(a)) {
                return u.b(context.getResources(), b);
            }
            b.recycle();
            return vVar;
        }
        if (!this.f1753c) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.d
    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.b.equals(((o) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.d
    public int hashCode() {
        return this.b.hashCode();
    }
}
