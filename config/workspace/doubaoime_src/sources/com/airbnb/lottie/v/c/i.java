package com.airbnb.lottie.v.c;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class i extends f<PointF> {
    private final PointF i;
    private final float[] j;
    private final PathMeasure k;
    private h l;

    public i(List<? extends com.airbnb.lottie.z.a<PointF>> list) {
        super(list);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.v.c.a
    public Object h(com.airbnb.lottie.z.a aVar, float f2) {
        PointF pointF;
        h hVar = (h) aVar;
        Path j = hVar.j();
        if (j == null) {
            return (PointF) aVar.b;
        }
        com.airbnb.lottie.z.c<A> cVar = this.f1425e;
        if (cVar != 0 && (pointF = (PointF) cVar.a(hVar.f1463g, hVar.h.floatValue(), hVar.b, hVar.f1459c, e(), f2, this.f1424d)) != null) {
            return pointF;
        }
        if (this.l != hVar) {
            this.k.setPath(j, false);
            this.l = hVar;
        }
        PathMeasure pathMeasure = this.k;
        pathMeasure.getPosTan(pathMeasure.getLength() * f2, this.j, null);
        PointF pointF2 = this.i;
        float[] fArr = this.j;
        pointF2.set(fArr[0], fArr[1]);
        return this.i;
    }
}
