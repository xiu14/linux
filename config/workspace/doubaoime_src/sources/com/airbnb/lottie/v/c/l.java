package com.airbnb.lottie.v.c;

import android.graphics.Path;
import java.util.List;

/* loaded from: classes.dex */
public class l extends a<com.airbnb.lottie.model.content.h, Path> {
    private final com.airbnb.lottie.model.content.h i;
    private final Path j;

    public l(List<com.airbnb.lottie.z.a<com.airbnb.lottie.model.content.h>> list) {
        super(list);
        this.i = new com.airbnb.lottie.model.content.h();
        this.j = new Path();
    }

    @Override // com.airbnb.lottie.v.c.a
    public Path h(com.airbnb.lottie.z.a<com.airbnb.lottie.model.content.h> aVar, float f2) {
        this.i.c(aVar.b, aVar.f1459c, f2);
        com.airbnb.lottie.y.g.e(this.i, this.j);
        return this.j;
    }
}
