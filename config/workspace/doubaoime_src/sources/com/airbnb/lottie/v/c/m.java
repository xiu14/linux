package com.airbnb.lottie.v.c;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Collections;

/* loaded from: classes.dex */
public class m extends a<PointF, PointF> {
    private final PointF i;
    private final PointF j;
    private final a<Float, Float> k;
    private final a<Float, Float> l;

    @Nullable
    protected com.airbnb.lottie.z.c<Float> m;

    @Nullable
    protected com.airbnb.lottie.z.c<Float> n;

    public m(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.i = new PointF();
        this.j = new PointF();
        this.k = aVar;
        this.l = aVar2;
        l(this.f1424d);
    }

    @Override // com.airbnb.lottie.v.c.a
    public PointF g() {
        return n(0.0f);
    }

    @Override // com.airbnb.lottie.v.c.a
    /* bridge */ /* synthetic */ PointF h(com.airbnb.lottie.z.a<PointF> aVar, float f2) {
        return n(f2);
    }

    @Override // com.airbnb.lottie.v.c.a
    public void l(float f2) {
        this.k.l(f2);
        this.l.l(f2);
        this.i.set(this.k.g().floatValue(), this.l.g().floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    PointF n(float f2) {
        Float f3;
        com.airbnb.lottie.z.a<Float> b;
        com.airbnb.lottie.z.a<Float> b2;
        Float f4 = null;
        if (this.m == null || (b2 = this.k.b()) == null) {
            f3 = null;
        } else {
            float d2 = this.k.d();
            Float f5 = b2.h;
            com.airbnb.lottie.z.c<Float> cVar = this.m;
            float f6 = b2.f1463g;
            f3 = cVar.a(f6, f5 == null ? f6 : f5.floatValue(), b2.b, b2.f1459c, f2, f2, d2);
        }
        if (this.n != null && (b = this.l.b()) != null) {
            float d3 = this.l.d();
            Float f7 = b.h;
            com.airbnb.lottie.z.c<Float> cVar2 = this.n;
            float f8 = b.f1463g;
            f4 = cVar2.a(f8, f7 == null ? f8 : f7.floatValue(), b.b, b.f1459c, f2, f2, d3);
        }
        if (f3 == null) {
            this.j.set(this.i.x, 0.0f);
        } else {
            this.j.set(f3.floatValue(), 0.0f);
        }
        if (f4 == null) {
            PointF pointF = this.j;
            pointF.set(pointF.x, this.i.y);
        } else {
            PointF pointF2 = this.j;
            pointF2.set(pointF2.x, f4.floatValue());
        }
        return this.j;
    }
}
