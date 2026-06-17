package com.airbnb.lottie.v.c;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class j extends f<PointF> {
    private final PointF i;

    public j(List<com.airbnb.lottie.z.a<PointF>> list) {
        super(list);
        this.i = new PointF();
    }

    @Override // com.airbnb.lottie.v.c.a
    public Object h(com.airbnb.lottie.z.a aVar, float f2) {
        return i(aVar, f2, f2, f2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.lottie.v.c.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.z.a<PointF> aVar, float f2, float f3, float f4) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.b;
        if (pointF3 == null || (pointF = aVar.f1459c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        com.airbnb.lottie.z.c<A> cVar = this.f1425e;
        if (cVar != 0 && (pointF2 = (PointF) cVar.a(aVar.f1463g, aVar.h.floatValue(), pointF4, pointF5, f2, e(), this.f1424d)) != null) {
            return pointF2;
        }
        PointF pointF6 = this.i;
        float f5 = pointF4.x;
        float a = e.a.a.a.a.a(pointF5.x, f5, f3, f5);
        float f6 = pointF4.y;
        pointF6.set(a, ((pointF5.y - f6) * f4) + f6);
        return this.i;
    }
}
