package com.airbnb.lottie.v.c;

import java.util.List;

/* loaded from: classes.dex */
public class c extends f<Float> {
    public c(List<com.airbnb.lottie.z.a<Float>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.v.c.a
    Object h(com.airbnb.lottie.z.a aVar, float f2) {
        return Float.valueOf(o(aVar, f2));
    }

    public float n() {
        return o(b(), d());
    }

    float o(com.airbnb.lottie.z.a<Float> aVar, float f2) {
        Float f3;
        if (aVar.b == null || aVar.f1459c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.z.c<A> cVar = this.f1425e;
        return (cVar == 0 || (f3 = (Float) cVar.a(aVar.f1463g, aVar.h.floatValue(), aVar.b, aVar.f1459c, f2, e(), this.f1424d)) == null) ? com.airbnb.lottie.y.g.f(aVar.f(), aVar.c(), f2) : f3.floatValue();
    }
}
