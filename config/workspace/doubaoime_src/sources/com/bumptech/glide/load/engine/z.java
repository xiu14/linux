package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.j.o;

/* loaded from: classes.dex */
class z implements d.a<Object> {
    final /* synthetic */ o.a a;
    final /* synthetic */ A b;

    z(A a, o.a aVar) {
        this.b = a;
        this.a = aVar;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(@NonNull Exception exc) {
        if (this.b.f(this.a)) {
            this.b.h(this.a, exc);
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(@Nullable Object obj) {
        if (this.b.f(this.a)) {
            this.b.g(this.a, obj);
        }
    }
}
