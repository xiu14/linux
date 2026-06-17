package com.bumptech.glide.load.engine.C;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.C.i;
import com.bumptech.glide.load.engine.v;

/* loaded from: classes.dex */
public class h extends com.bumptech.glide.util.g<com.bumptech.glide.load.d, v<?>> implements i {

    /* renamed from: d, reason: collision with root package name */
    private i.a f1608d;

    public h(long j) {
        super(j);
    }

    @Override // com.bumptech.glide.load.engine.C.i
    public void d(@NonNull i.a aVar) {
        this.f1608d = aVar;
    }

    @Override // com.bumptech.glide.util.g
    protected int g(@Nullable v<?> vVar) {
        v<?> vVar2 = vVar;
        if (vVar2 == null) {
            return 1;
        }
        return vVar2.a();
    }

    @Override // com.bumptech.glide.util.g
    protected void h(@NonNull com.bumptech.glide.load.d dVar, @Nullable v<?> vVar) {
        v<?> vVar2 = vVar;
        i.a aVar = this.f1608d;
        if (aVar == null || vVar2 == null) {
            return;
        }
        ((com.bumptech.glide.load.engine.k) aVar).g(vVar2);
    }

    @Override // com.bumptech.glide.load.engine.C.i
    @SuppressLint({"InlinedApi"})
    public void trimMemory(int i) {
        if (i >= 40) {
            a();
        } else if (i >= 20 || i == 15) {
            k(f() / 2);
        }
    }
}
