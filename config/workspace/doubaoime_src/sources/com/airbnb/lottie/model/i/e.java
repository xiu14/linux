package com.airbnb.lottie.model.i;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class e implements m<PointF, PointF> {
    private final List<com.airbnb.lottie.z.a<PointF>> a;

    public e(List<com.airbnb.lottie.z.a<PointF>> list) {
        this.a = list;
    }

    @Override // com.airbnb.lottie.model.i.m
    public com.airbnb.lottie.v.c.a<PointF, PointF> a() {
        return this.a.get(0).h() ? new com.airbnb.lottie.v.c.j(this.a) : new com.airbnb.lottie.v.c.i(this.a);
    }

    @Override // com.airbnb.lottie.model.i.m
    public List<com.airbnb.lottie.z.a<PointF>> b() {
        return this.a;
    }

    @Override // com.airbnb.lottie.model.i.m
    public boolean c() {
        return this.a.size() == 1 && this.a.get(0).h();
    }
}
