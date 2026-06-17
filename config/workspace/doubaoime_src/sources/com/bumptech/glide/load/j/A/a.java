package com.bumptech.glide.load.j.A;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.j;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.j.h;
import com.bumptech.glide.load.j.n;
import com.bumptech.glide.load.j.o;
import com.bumptech.glide.load.j.p;
import com.bumptech.glide.load.j.s;
import java.io.InputStream;

/* loaded from: classes.dex */
public class a implements o<h, InputStream> {
    public static final com.bumptech.glide.load.e<Integer> b = com.bumptech.glide.load.e.d("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    @Nullable
    private final n<h, h> a;

    /* renamed from: com.bumptech.glide.load.j.A.a$a, reason: collision with other inner class name */
    public static class C0030a implements p<h, InputStream> {
        private final n<h, h> a = new n<>(500);

        @Override // com.bumptech.glide.load.j.p
        @NonNull
        public o<h, InputStream> d(s sVar) {
            return new a(this.a);
        }
    }

    public a(@Nullable n<h, h> nVar) {
        this.a = nVar;
    }

    @Override // com.bumptech.glide.load.j.o
    public /* bridge */ /* synthetic */ boolean a(@NonNull h hVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.j.o
    public o.a<InputStream> b(@NonNull h hVar, int i, int i2, @NonNull f fVar) {
        h hVar2 = hVar;
        n<h, h> nVar = this.a;
        if (nVar != null) {
            h a = nVar.a(hVar2, 0, 0);
            if (a == null) {
                this.a.b(hVar2, 0, 0, hVar2);
            } else {
                hVar2 = a;
            }
        }
        return new o.a<>(hVar2, new j(hVar2, ((Integer) fVar.c(b)).intValue()));
    }
}
