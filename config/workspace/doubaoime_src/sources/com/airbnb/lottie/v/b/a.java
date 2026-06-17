package com.airbnb.lottie.v.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.v.c.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.i f1374e;

    /* renamed from: f, reason: collision with root package name */
    protected final com.airbnb.lottie.model.layer.b f1375f;
    private final float[] h;
    final Paint i;
    private final com.airbnb.lottie.v.c.a<?, Float> j;
    private final com.airbnb.lottie.v.c.a<?, Integer> k;
    private final List<com.airbnb.lottie.v.c.a<?, Float>> l;

    @Nullable
    private final com.airbnb.lottie.v.c.a<?, Float> m;

    @Nullable
    private com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> n;
    private final PathMeasure a = new PathMeasure();
    private final Path b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f1372c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final RectF f1373d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final List<b> f1376g = new ArrayList();

    private static final class b {
        private final List<m> a = new ArrayList();

        @Nullable
        private final s b;

        b(s sVar, C0018a c0018a) {
            this.b = sVar;
        }
    }

    a(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar, Paint.Cap cap, Paint.Join join, float f2, com.airbnb.lottie.model.i.d dVar, com.airbnb.lottie.model.i.b bVar2, List<com.airbnb.lottie.model.i.b> list, com.airbnb.lottie.model.i.b bVar3) {
        com.airbnb.lottie.v.a aVar = new com.airbnb.lottie.v.a(1);
        this.i = aVar;
        this.f1374e = iVar;
        this.f1375f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f2);
        this.k = dVar.a();
        this.j = bVar2.a();
        if (bVar3 == null) {
            this.m = null;
        } else {
            this.m = bVar3.a();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(list.get(i).a());
        }
        bVar.i(this.k);
        bVar.i(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            bVar.i(this.l.get(i2));
        }
        com.airbnb.lottie.v.c.a<?, Float> aVar2 = this.m;
        if (aVar2 != null) {
            bVar.i(aVar2);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.l.get(i3).a(this);
        }
        com.airbnb.lottie.v.c.a<?, Float> aVar3 = this.m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
    }

    @Override // com.airbnb.lottie.v.c.a.b
    public void a() {
        this.f1374e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.v.b.c
    public void b(List<c> list, List<c> list2) {
        s sVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof s) {
                s sVar2 = (s) cVar;
                if (sVar2.i() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.c(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof s) {
                s sVar3 = (s) cVar2;
                if (sVar3.i() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f1376g.add(bVar);
                    }
                    bVar = new b(sVar3, null);
                    sVar3.c(this);
                }
            }
            if (cVar2 instanceof m) {
                if (bVar == null) {
                    bVar = new b(sVar, null);
                }
                bVar.a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f1376g.add(bVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void c(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.y.g.g(dVar, i, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.v.b.e
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.b.reset();
        for (int i = 0; i < this.f1376g.size(); i++) {
            b bVar = this.f1376g.get(i);
            for (int i2 = 0; i2 < bVar.a.size(); i2++) {
                this.b.addPath(((m) bVar.a.get(i2)).getPath(), matrix);
            }
        }
        this.b.computeBounds(this.f1373d, false);
        float n = ((com.airbnb.lottie.v.c.c) this.j).n();
        RectF rectF2 = this.f1373d;
        float f2 = n / 2.0f;
        rectF2.set(rectF2.left - f2, rectF2.top - f2, rectF2.right + f2, rectF2.bottom + f2);
        rectF.set(this.f1373d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.d.a("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.v.b.e
    public void f(Canvas canvas, Matrix matrix, int i) {
        float f2;
        float f3;
        float f4;
        if (com.airbnb.lottie.y.h.e(matrix)) {
            com.airbnb.lottie.d.a("StrokeContent#draw");
            return;
        }
        float f5 = 100.0f;
        boolean z = false;
        this.i.setAlpha(com.airbnb.lottie.y.g.c((int) ((((i / 255.0f) * ((com.airbnb.lottie.v.c.e) this.k).n()) / 100.0f) * 255.0f), 0, 255));
        this.i.setStrokeWidth(com.airbnb.lottie.y.h.d(matrix) * ((com.airbnb.lottie.v.c.c) this.j).n());
        float f6 = 0.0f;
        if (this.i.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.d.a("StrokeContent#draw");
            return;
        }
        float f7 = 1.0f;
        if (this.l.isEmpty()) {
            com.airbnb.lottie.d.a("StrokeContent#applyDashPattern");
        } else {
            float d2 = com.airbnb.lottie.y.h.d(matrix);
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                this.h[i2] = this.l.get(i2).g().floatValue();
                if (i2 % 2 == 0) {
                    float[] fArr = this.h;
                    if (fArr[i2] < 1.0f) {
                        fArr[i2] = 1.0f;
                    }
                } else {
                    float[] fArr2 = this.h;
                    if (fArr2[i2] < 0.1f) {
                        fArr2[i2] = 0.1f;
                    }
                }
                float[] fArr3 = this.h;
                fArr3[i2] = fArr3[i2] * d2;
            }
            com.airbnb.lottie.v.c.a<?, Float> aVar = this.m;
            this.i.setPathEffect(new DashPathEffect(this.h, aVar == null ? 0.0f : aVar.g().floatValue() * d2));
            com.airbnb.lottie.d.a("StrokeContent#applyDashPattern");
        }
        com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> aVar2 = this.n;
        if (aVar2 != null) {
            this.i.setColorFilter(aVar2.g());
        }
        int i3 = 0;
        while (i3 < this.f1376g.size()) {
            b bVar = this.f1376g.get(i3);
            if (bVar.b == null) {
                f2 = f6;
                this.b.reset();
                for (int size = bVar.a.size() - 1; size >= 0; size--) {
                    this.b.addPath(((m) bVar.a.get(size)).getPath(), matrix);
                }
                com.airbnb.lottie.d.a("StrokeContent#buildPath");
                canvas.drawPath(this.b, this.i);
                com.airbnb.lottie.d.a("StrokeContent#drawPath");
            } else if (bVar.b == null) {
                com.airbnb.lottie.d.a("StrokeContent#applyTrimPath");
                f2 = f6;
            } else {
                this.b.reset();
                int size2 = bVar.a.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    } else {
                        this.b.addPath(((m) bVar.a.get(size2)).getPath(), matrix);
                    }
                }
                this.a.setPath(this.b, z);
                float length = this.a.getLength();
                while (this.a.nextContour()) {
                    length += this.a.getLength();
                }
                float floatValue = (bVar.b.g().g().floatValue() * length) / 360.0f;
                float floatValue2 = ((bVar.b.h().g().floatValue() * length) / f5) + floatValue;
                float floatValue3 = ((bVar.b.e().g().floatValue() * length) / f5) + floatValue;
                int size3 = bVar.a.size() - 1;
                float f8 = f6;
                while (size3 >= 0) {
                    this.f1372c.set(((m) bVar.a.get(size3)).getPath());
                    this.f1372c.transform(matrix);
                    this.a.setPath(this.f1372c, z);
                    float length2 = this.a.getLength();
                    if (floatValue3 > length) {
                        float f9 = floatValue3 - length;
                        if (f9 < f8 + length2 && f8 < f9) {
                            f3 = length;
                            com.airbnb.lottie.y.h.a(this.f1372c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f9 / length2, f7), 0.0f);
                            canvas.drawPath(this.f1372c, this.i);
                            f4 = 0.0f;
                            f8 += length2;
                            size3--;
                            f6 = f4;
                            length = f3;
                            z = false;
                            f7 = 1.0f;
                        }
                    }
                    f3 = length;
                    float f10 = f8 + length2;
                    if (f10 >= floatValue2 && f8 <= floatValue3) {
                        if (f10 > floatValue3 || floatValue2 >= f8) {
                            f4 = 0.0f;
                            com.airbnb.lottie.y.h.a(this.f1372c, floatValue2 < f8 ? 0.0f : (floatValue2 - f8) / length2, floatValue3 > f10 ? 1.0f : (floatValue3 - f8) / length2, 0.0f);
                            canvas.drawPath(this.f1372c, this.i);
                            f8 += length2;
                            size3--;
                            f6 = f4;
                            length = f3;
                            z = false;
                            f7 = 1.0f;
                        } else {
                            canvas.drawPath(this.f1372c, this.i);
                        }
                    }
                    f4 = 0.0f;
                    f8 += length2;
                    size3--;
                    f6 = f4;
                    length = f3;
                    z = false;
                    f7 = 1.0f;
                }
                f2 = f6;
                com.airbnb.lottie.d.a("StrokeContent#applyTrimPath");
            }
            i3++;
            f6 = f2;
            f5 = 100.0f;
            z = false;
            f7 = 1.0f;
        }
        com.airbnb.lottie.d.a("StrokeContent#draw");
    }

    @Override // com.airbnb.lottie.model.e
    @CallSuper
    public <T> void g(T t, @Nullable com.airbnb.lottie.z.c<T> cVar) {
        if (t == com.airbnb.lottie.n.f1359d) {
            this.k.m(cVar);
            return;
        }
        if (t == com.airbnb.lottie.n.q) {
            this.j.m(cVar);
            return;
        }
        if (t == com.airbnb.lottie.n.E) {
            com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> aVar = this.n;
            if (aVar != null) {
                this.f1375f.o(aVar);
            }
            if (cVar == null) {
                this.n = null;
                return;
            }
            com.airbnb.lottie.v.c.p pVar = new com.airbnb.lottie.v.c.p(cVar, null);
            this.n = pVar;
            pVar.a(this);
            this.f1375f.i(this.n);
        }
    }
}
