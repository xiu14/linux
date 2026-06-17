package com.airbnb.lottie.v.b;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.model.content.GradientType;

/* loaded from: classes.dex */
public class i extends a {
    private final String o;
    private final boolean p;
    private final LongSparseArray<LinearGradient> q;
    private final LongSparseArray<RadialGradient> r;
    private final RectF s;
    private final GradientType t;
    private final int u;
    private final com.airbnb.lottie.v.c.a<com.airbnb.lottie.model.content.c, com.airbnb.lottie.model.content.c> v;
    private final com.airbnb.lottie.v.c.a<PointF, PointF> w;
    private final com.airbnb.lottie.v.c.a<PointF, PointF> x;

    @Nullable
    private com.airbnb.lottie.v.c.p y;

    public i(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.e eVar) {
        super(iVar, bVar, eVar.b().toPaintCap(), eVar.g().toPaintJoin(), eVar.i(), eVar.k(), eVar.m(), eVar.h(), eVar.c());
        this.q = new LongSparseArray<>();
        this.r = new LongSparseArray<>();
        this.s = new RectF();
        this.o = eVar.j();
        this.t = eVar.f();
        this.p = eVar.n();
        this.u = (int) (iVar.k().d() / 32.0f);
        com.airbnb.lottie.v.c.a<com.airbnb.lottie.model.content.c, com.airbnb.lottie.model.content.c> a = eVar.e().a();
        this.v = a;
        a.a(this);
        bVar.i(a);
        com.airbnb.lottie.v.c.a<PointF, PointF> a2 = eVar.l().a();
        this.w = a2;
        a2.a(this);
        bVar.i(a2);
        com.airbnb.lottie.v.c.a<PointF, PointF> a3 = eVar.d().a();
        this.x = a3;
        a3.a(this);
        bVar.i(a3);
    }

    private int[] e(int[] iArr) {
        com.airbnb.lottie.v.c.p pVar = this.y;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.g();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int h() {
        int round = Math.round(this.w.f() * this.u);
        int round2 = Math.round(this.x.f() * this.u);
        int round3 = Math.round(this.v.f() * this.u);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.v.b.a, com.airbnb.lottie.v.b.e
    public void f(Canvas canvas, Matrix matrix, int i) {
        RadialGradient radialGradient;
        if (this.p) {
            return;
        }
        d(this.s, matrix, false);
        if (this.t == GradientType.LINEAR) {
            long h = h();
            radialGradient = this.q.get(h);
            if (radialGradient == null) {
                PointF g2 = this.w.g();
                PointF g3 = this.x.g();
                com.airbnb.lottie.model.content.c g4 = this.v.g();
                radialGradient = new LinearGradient(g2.x, g2.y, g3.x, g3.y, e(g4.a()), g4.b(), Shader.TileMode.CLAMP);
                this.q.put(h, radialGradient);
            }
        } else {
            long h2 = h();
            radialGradient = this.r.get(h2);
            if (radialGradient == null) {
                PointF g5 = this.w.g();
                PointF g6 = this.x.g();
                com.airbnb.lottie.model.content.c g7 = this.v.g();
                int[] e2 = e(g7.a());
                float[] b = g7.b();
                radialGradient = new RadialGradient(g5.x, g5.y, (float) Math.hypot(g6.x - r9, g6.y - r10), e2, b, Shader.TileMode.CLAMP);
                this.r.put(h2, radialGradient);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        this.i.setShader(radialGradient);
        super.f(canvas, matrix, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.v.b.a, com.airbnb.lottie.model.e
    public <T> void g(T t, @Nullable com.airbnb.lottie.z.c<T> cVar) {
        super.g(t, cVar);
        if (t == com.airbnb.lottie.n.F) {
            com.airbnb.lottie.v.c.p pVar = this.y;
            if (pVar != null) {
                this.f1375f.o(pVar);
            }
            if (cVar == null) {
                this.y = null;
                return;
            }
            com.airbnb.lottie.v.c.p pVar2 = new com.airbnb.lottie.v.c.p(cVar, null);
            this.y = pVar2;
            pVar2.a(this);
            this.f1375f.i(this.y);
        }
    }

    @Override // com.airbnb.lottie.v.b.c
    public String getName() {
        return this.o;
    }
}
