package com.airbnb.lottie.model.i;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class i implements m<PointF, PointF> {
    private final b a;
    private final b b;

    public i(b bVar, b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    @Override // com.airbnb.lottie.model.i.m
    public com.airbnb.lottie.v.c.a<PointF, PointF> a() {
        return new com.airbnb.lottie.v.c.m(this.a.a(), this.b.a());
    }

    @Override // com.airbnb.lottie.model.i.m
    public List<com.airbnb.lottie.z.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.airbnb.lottie.model.i.m
    public boolean c() {
        return this.a.c() && this.b.c();
    }
}
