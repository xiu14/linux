package com.airbnb.lottie.v.c;

import java.util.List;

/* loaded from: classes.dex */
public class e extends f<Integer> {
    public e(List<com.airbnb.lottie.z.a<Integer>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.v.c.a
    Object h(com.airbnb.lottie.z.a aVar, float f2) {
        return Integer.valueOf(o(aVar, f2));
    }

    public int n() {
        return o(b(), d());
    }

    int o(com.airbnb.lottie.z.a<Integer> aVar, float f2) {
        Integer num;
        if (aVar.b == null || aVar.f1459c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.z.c<A> cVar = this.f1425e;
        if (cVar != 0 && (num = (Integer) cVar.a(aVar.f1463g, aVar.h.floatValue(), aVar.b, aVar.f1459c, f2, e(), this.f1424d)) != null) {
            return num.intValue();
        }
        int g2 = aVar.g();
        int d2 = aVar.d();
        int i = com.airbnb.lottie.y.g.b;
        return (int) ((f2 * (d2 - g2)) + g2);
    }
}
