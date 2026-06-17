package com.airbnb.lottie.v.c;

import androidx.annotation.Nullable;
import java.util.Collections;

/* loaded from: classes.dex */
public class p<K, A> extends a<K, A> {
    private final A i;

    public p(com.airbnb.lottie.z.c<A> cVar, @Nullable A a) {
        super(Collections.emptyList());
        this.f1425e = cVar;
        this.i = a;
    }

    @Override // com.airbnb.lottie.v.c.a
    float c() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.v.c.a
    public A g() {
        com.airbnb.lottie.z.c<A> cVar = this.f1425e;
        A a = this.i;
        float f2 = this.f1424d;
        return cVar.a(0.0f, 0.0f, a, a, f2, f2, f2);
    }

    @Override // com.airbnb.lottie.v.c.a
    A h(com.airbnb.lottie.z.a<K> aVar, float f2) {
        return g();
    }

    @Override // com.airbnb.lottie.v.c.a
    public void j() {
        if (this.f1425e != null) {
            super.j();
        }
    }

    @Override // com.airbnb.lottie.v.c.a
    public void l(float f2) {
        this.f1424d = f2;
    }
}
