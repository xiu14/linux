package com.airbnb.lottie.v.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.v.c.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h implements e, a.b, k {

    @NonNull
    private final String a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f1392c;

    /* renamed from: d, reason: collision with root package name */
    private final LongSparseArray<LinearGradient> f1393d = new LongSparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private final LongSparseArray<RadialGradient> f1394e = new LongSparseArray<>();

    /* renamed from: f, reason: collision with root package name */
    private final Path f1395f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f1396g;
    private final RectF h;
    private final List<m> i;
    private final GradientType j;
    private final com.airbnb.lottie.v.c.a<com.airbnb.lottie.model.content.c, com.airbnb.lottie.model.content.c> k;
    private final com.airbnb.lottie.v.c.a<Integer, Integer> l;
    private final com.airbnb.lottie.v.c.a<PointF, PointF> m;
    private final com.airbnb.lottie.v.c.a<PointF, PointF> n;

    @Nullable
    private com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> o;

    @Nullable
    private com.airbnb.lottie.v.c.p p;
    private final com.airbnb.lottie.i q;
    private final int r;

    public h(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.d dVar) {
        Path path = new Path();
        this.f1395f = path;
        this.f1396g = new com.airbnb.lottie.v.a(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.f1392c = bVar;
        this.a = dVar.f();
        this.b = dVar.i();
        this.q = iVar;
        this.j = dVar.e();
        path.setFillType(dVar.c());
        this.r = (int) (iVar.k().d() / 32.0f);
        com.airbnb.lottie.v.c.a<com.airbnb.lottie.model.content.c, com.airbnb.lottie.model.content.c> a = dVar.d().a();
        this.k = a;
        a.a(this);
        bVar.i(a);
        com.airbnb.lottie.v.c.a<Integer, Integer> a2 = dVar.g().a();
        this.l = a2;
        a2.a(this);
        bVar.i(a2);
        com.airbnb.lottie.v.c.a<PointF, PointF> a3 = dVar.h().a();
        this.m = a3;
        a3.a(this);
        bVar.i(a3);
        com.airbnb.lottie.v.c.a<PointF, PointF> a4 = dVar.b().a();
        this.n = a4;
        a4.a(this);
        bVar.i(a4);
    }

    private int[] e(int[] iArr) {
        com.airbnb.lottie.v.c.p pVar = this.p;
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
        int round = Math.round(this.m.f() * this.r);
        int round2 = Math.round(this.n.f() * this.r);
        int round3 = Math.round(this.k.f() * this.r);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    @Override // com.airbnb.lottie.v.c.a.b
    public void a() {
        this.q.invalidateSelf();
    }

    @Override // com.airbnb.lottie.v.b.c
    public void b(List<c> list, List<c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            c cVar = list2.get(i);
            if (cVar instanceof m) {
                this.i.add((m) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void c(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.y.g.g(dVar, i, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.v.b.e
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.f1395f.reset();
        for (int i = 0; i < this.i.size(); i++) {
            this.f1395f.addPath(this.i.get(i).getPath(), matrix);
        }
        this.f1395f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.v.b.e
    public void f(Canvas canvas, Matrix matrix, int i) {
        RadialGradient radialGradient;
        if (this.b) {
            return;
        }
        this.f1395f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f1395f.addPath(this.i.get(i2).getPath(), matrix);
        }
        this.f1395f.computeBounds(this.h, false);
        if (this.j == GradientType.LINEAR) {
            long h = h();
            radialGradient = this.f1393d.get(h);
            if (radialGradient == null) {
                PointF g2 = this.m.g();
                PointF g3 = this.n.g();
                com.airbnb.lottie.model.content.c g4 = this.k.g();
                LinearGradient linearGradient = new LinearGradient(g2.x, g2.y, g3.x, g3.y, e(g4.a()), g4.b(), Shader.TileMode.CLAMP);
                this.f1393d.put(h, linearGradient);
                radialGradient = linearGradient;
            }
        } else {
            long h2 = h();
            radialGradient = this.f1394e.get(h2);
            if (radialGradient == null) {
                PointF g5 = this.m.g();
                PointF g6 = this.n.g();
                com.airbnb.lottie.model.content.c g7 = this.k.g();
                int[] e2 = e(g7.a());
                float[] b = g7.b();
                float f2 = g5.x;
                float f3 = g5.y;
                float hypot = (float) Math.hypot(g6.x - f2, g6.y - f3);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                radialGradient = new RadialGradient(f2, f3, hypot, e2, b, Shader.TileMode.CLAMP);
                this.f1394e.put(h2, radialGradient);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        this.f1396g.setShader(radialGradient);
        com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> aVar = this.o;
        if (aVar != null) {
            this.f1396g.setColorFilter(aVar.g());
        }
        this.f1396g.setAlpha(com.airbnb.lottie.y.g.c((int) ((((i / 255.0f) * this.l.g().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f1395f, this.f1396g);
        com.airbnb.lottie.d.a("GradientFillContent#draw");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.e
    public <T> void g(T t, @Nullable com.airbnb.lottie.z.c<T> cVar) {
        if (t == com.airbnb.lottie.n.f1359d) {
            this.l.m(cVar);
            return;
        }
        if (t == com.airbnb.lottie.n.E) {
            com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> aVar = this.o;
            if (aVar != null) {
                this.f1392c.o(aVar);
            }
            if (cVar == null) {
                this.o = null;
                return;
            }
            com.airbnb.lottie.v.c.p pVar = new com.airbnb.lottie.v.c.p(cVar, null);
            this.o = pVar;
            pVar.a(this);
            this.f1392c.i(this.o);
            return;
        }
        if (t == com.airbnb.lottie.n.F) {
            com.airbnb.lottie.v.c.p pVar2 = this.p;
            if (pVar2 != null) {
                this.f1392c.o(pVar2);
            }
            if (cVar == null) {
                this.p = null;
                return;
            }
            this.f1393d.clear();
            this.f1394e.clear();
            com.airbnb.lottie.v.c.p pVar3 = new com.airbnb.lottie.v.c.p(cVar, null);
            this.p = pVar3;
            pVar3.a(this);
            this.f1392c.i(this.p);
        }
    }

    @Override // com.airbnb.lottie.v.b.c
    public String getName() {
        return this.a;
    }
}
