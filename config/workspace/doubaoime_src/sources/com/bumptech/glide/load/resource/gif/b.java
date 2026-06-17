package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.n.a;

/* loaded from: classes.dex */
public final class b implements a.InterfaceC0042a {
    private final com.bumptech.glide.load.engine.B.d a;

    @Nullable
    private final com.bumptech.glide.load.engine.B.b b;

    public b(com.bumptech.glide.load.engine.B.d dVar, @Nullable com.bumptech.glide.load.engine.B.b bVar) {
        this.a = dVar;
        this.b = bVar;
    }

    @NonNull
    public Bitmap a(int i, int i2, @NonNull Bitmap.Config config) {
        return this.a.b(i, i2, config);
    }

    @NonNull
    public byte[] b(int i) {
        com.bumptech.glide.load.engine.B.b bVar = this.b;
        return bVar == null ? new byte[i] : (byte[]) bVar.c(i, byte[].class);
    }

    @NonNull
    public int[] c(int i) {
        com.bumptech.glide.load.engine.B.b bVar = this.b;
        return bVar == null ? new int[i] : (int[]) bVar.c(i, int[].class);
    }

    public void d(@NonNull Bitmap bitmap) {
        this.a.c(bitmap);
    }

    public void e(@NonNull byte[] bArr) {
        com.bumptech.glide.load.engine.B.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    public void f(@NonNull int[] iArr) {
        com.bumptech.glide.load.engine.B.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}
