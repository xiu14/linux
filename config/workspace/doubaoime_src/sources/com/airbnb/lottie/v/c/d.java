package com.airbnb.lottie.v.c;

import java.util.List;

/* loaded from: classes.dex */
public class d extends f<com.airbnb.lottie.model.content.c> {
    private final com.airbnb.lottie.model.content.c i;

    public d(List<com.airbnb.lottie.z.a<com.airbnb.lottie.model.content.c>> list) {
        super(list);
        com.airbnb.lottie.model.content.c cVar = list.get(0).b;
        int c2 = cVar != null ? cVar.c() : 0;
        this.i = new com.airbnb.lottie.model.content.c(new float[c2], new int[c2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.v.c.a
    Object h(com.airbnb.lottie.z.a aVar, float f2) {
        this.i.d((com.airbnb.lottie.model.content.c) aVar.b, (com.airbnb.lottie.model.content.c) aVar.f1459c, f2);
        return this.i;
    }
}
