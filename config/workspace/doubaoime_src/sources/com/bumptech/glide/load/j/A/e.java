package com.bumptech.glide.load.j.A;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.j.h;
import com.bumptech.glide.load.j.o;
import com.bumptech.glide.load.j.p;
import com.bumptech.glide.load.j.s;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes.dex */
public class e implements o<URL, InputStream> {
    private final o<h, InputStream> a;

    public static class a implements p<URL, InputStream> {
        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<URL, InputStream> d(s sVar) {
            return new e(sVar.c(h.class, InputStream.class));
        }
    }

    public e(o<h, InputStream> oVar) {
        this.a = oVar;
    }

    @Override // com.bumptech.glide.load.j.o
    public /* bridge */ /* synthetic */ boolean a(@NonNull URL url) {
        return true;
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a<InputStream> b(@NonNull URL url, int i, int i2, @NonNull f fVar) {
        return this.a.b(new h(url), i, i2, fVar);
    }
}
