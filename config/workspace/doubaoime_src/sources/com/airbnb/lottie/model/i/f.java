package com.airbnb.lottie.model.i;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class f extends n<PointF, PointF> {
    public f(List<com.airbnb.lottie.z.a<PointF>> list) {
        super((List) list);
    }

    @Override // com.airbnb.lottie.model.i.m
    public com.airbnb.lottie.v.c.a<PointF, PointF> a() {
        return new com.airbnb.lottie.v.c.j(this.a);
    }

    @Override // com.airbnb.lottie.model.i.m
    public List b() {
        return this.a;
    }
}
