package com.airbnb.lottie.v.c;

import java.util.List;

/* loaded from: classes.dex */
public class k extends f<com.airbnb.lottie.z.d> {
    private final com.airbnb.lottie.z.d i;

    public k(List<com.airbnb.lottie.z.a<com.airbnb.lottie.z.d>> list) {
        super(list);
        this.i = new com.airbnb.lottie.z.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.v.c.a
    public Object h(com.airbnb.lottie.z.a aVar, float f2) {
        T t;
        com.airbnb.lottie.z.d dVar;
        T t2 = aVar.b;
        if (t2 == 0 || (t = aVar.f1459c) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.z.d dVar2 = (com.airbnb.lottie.z.d) t2;
        com.airbnb.lottie.z.d dVar3 = (com.airbnb.lottie.z.d) t;
        com.airbnb.lottie.z.c<A> cVar = this.f1425e;
        if (cVar != 0 && (dVar = (com.airbnb.lottie.z.d) cVar.a(aVar.f1463g, aVar.h.floatValue(), dVar2, dVar3, f2, e(), this.f1424d)) != null) {
            return dVar;
        }
        this.i.d(com.airbnb.lottie.y.g.f(dVar2.b(), dVar3.b(), f2), com.airbnb.lottie.y.g.f(dVar2.c(), dVar3.c(), f2));
        return this.i;
    }
}
