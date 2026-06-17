package com.airbnb.lottie.v.c;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class h extends com.airbnb.lottie.z.a<PointF> {

    @Nullable
    private Path q;
    private final com.airbnb.lottie.z.a<PointF> r;

    public h(com.airbnb.lottie.g gVar, com.airbnb.lottie.z.a<PointF> aVar) {
        super(gVar, aVar.b, aVar.f1459c, aVar.f1460d, aVar.f1461e, aVar.f1462f, aVar.f1463g, aVar.h);
        this.r = aVar;
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        T t;
        T t2;
        T t3 = this.f1459c;
        boolean z = (t3 == 0 || (t2 = this.b) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.b;
        if (t4 == 0 || (t = this.f1459c) == 0 || z) {
            return;
        }
        PointF pointF = (PointF) t4;
        PointF pointF2 = (PointF) t;
        com.airbnb.lottie.z.a<PointF> aVar = this.r;
        PointF pointF3 = aVar.o;
        PointF pointF4 = aVar.p;
        int i = com.airbnb.lottie.y.h.f1458g;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f2 = pointF3.x + pointF.x;
            float f3 = pointF.y + pointF3.y;
            float f4 = pointF2.x;
            float f5 = f4 + pointF4.x;
            float f6 = pointF2.y;
            path.cubicTo(f2, f3, f5, f6 + pointF4.y, f4, f6);
        }
        this.q = path;
    }

    @Nullable
    Path j() {
        return this.q;
    }
}
