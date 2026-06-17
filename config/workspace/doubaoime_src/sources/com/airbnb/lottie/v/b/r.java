package com.airbnb.lottie.v.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeStroke;

/* loaded from: classes.dex */
public class r extends a {
    private final com.airbnb.lottie.model.layer.b o;
    private final String p;
    private final boolean q;
    private final com.airbnb.lottie.v.c.a<Integer, Integer> r;

    @Nullable
    private com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> s;

    public r(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar, ShapeStroke shapeStroke) {
        super(iVar, bVar, shapeStroke.b().toPaintCap(), shapeStroke.e().toPaintJoin(), shapeStroke.g(), shapeStroke.i(), shapeStroke.j(), shapeStroke.f(), shapeStroke.d());
        this.o = bVar;
        this.p = shapeStroke.h();
        this.q = shapeStroke.k();
        com.airbnb.lottie.v.c.a<Integer, Integer> a = shapeStroke.c().a();
        this.r = a;
        a.a(this);
        bVar.i(a);
    }

    @Override // com.airbnb.lottie.v.b.a, com.airbnb.lottie.v.b.e
    public void f(Canvas canvas, Matrix matrix, int i) {
        if (this.q) {
            return;
        }
        this.i.setColor(((com.airbnb.lottie.v.c.b) this.r).n());
        com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> aVar = this.s;
        if (aVar != null) {
            this.i.setColorFilter(aVar.g());
        }
        super.f(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.v.b.a, com.airbnb.lottie.model.e
    public <T> void g(T t, @Nullable com.airbnb.lottie.z.c<T> cVar) {
        super.g(t, cVar);
        if (t == com.airbnb.lottie.n.b) {
            this.r.m(cVar);
            return;
        }
        if (t == com.airbnb.lottie.n.E) {
            com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> aVar = this.s;
            if (aVar != null) {
                this.o.o(aVar);
            }
            if (cVar == null) {
                this.s = null;
                return;
            }
            com.airbnb.lottie.v.c.p pVar = new com.airbnb.lottie.v.c.p(cVar, null);
            this.s = pVar;
            pVar.a(this);
            this.o.i(this.r);
        }
    }

    @Override // com.airbnb.lottie.v.b.c
    public String getName() {
        return this.p;
    }
}
