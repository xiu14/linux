package com.airbnb.lottie.v.c;

import java.util.List;

/* loaded from: classes.dex */
public class b extends f<Integer> {
    public b(List<com.airbnb.lottie.z.a<Integer>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.v.c.a
    Object h(com.airbnb.lottie.z.a aVar, float f2) {
        return Integer.valueOf(o(aVar, f2));
    }

    public int n() {
        return o(b(), d());
    }

    public int o(com.airbnb.lottie.z.a<Integer> aVar, float f2) {
        Integer num;
        Integer num2 = aVar.b;
        if (num2 == null || aVar.f1459c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = num2.intValue();
        int intValue2 = aVar.f1459c.intValue();
        com.airbnb.lottie.z.c<A> cVar = this.f1425e;
        return (cVar == 0 || (num = (Integer) cVar.a(aVar.f1463g, aVar.h.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f2, e(), this.f1424d)) == null) ? com.airbnb.lottie.y.b.c(com.airbnb.lottie.y.g.b(f2, 0.0f, 1.0f), intValue, intValue2) : num.intValue();
    }
}
