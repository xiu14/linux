package com.airbnb.lottie.v.c;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.v.c.a;
import java.util.Collections;

/* loaded from: classes.dex */
public class o {
    private final Matrix a = new Matrix();
    private final Matrix b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f1431c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f1432d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f1433e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private a<PointF, PointF> f1434f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private a<?, PointF> f1435g;

    @NonNull
    private a<com.airbnb.lottie.z.d, com.airbnb.lottie.z.d> h;

    @NonNull
    private a<Float, Float> i;

    @NonNull
    private a<Integer, Integer> j;

    @Nullable
    private c k;

    @Nullable
    private c l;

    @Nullable
    private a<?, Float> m;

    @Nullable
    private a<?, Float> n;

    public o(com.airbnb.lottie.model.i.l lVar) {
        this.f1434f = lVar.b() == null ? null : lVar.b().a();
        this.f1435g = lVar.e() == null ? null : lVar.e().a();
        this.h = lVar.g() == null ? null : lVar.g().a();
        this.i = lVar.f() == null ? null : lVar.f().a();
        c cVar = lVar.h() == null ? null : (c) lVar.h().a();
        this.k = cVar;
        if (cVar != null) {
            this.b = new Matrix();
            this.f1431c = new Matrix();
            this.f1432d = new Matrix();
            this.f1433e = new float[9];
        } else {
            this.b = null;
            this.f1431c = null;
            this.f1432d = null;
            this.f1433e = null;
        }
        this.l = lVar.i() == null ? null : (c) lVar.i().a();
        if (lVar.d() != null) {
            this.j = lVar.d().a();
        }
        if (lVar.j() != null) {
            this.m = lVar.j().a();
        } else {
            this.m = null;
        }
        if (lVar.c() != null) {
            this.n = lVar.c().a();
        } else {
            this.n = null;
        }
    }

    private void d() {
        for (int i = 0; i < 9; i++) {
            this.f1433e[i] = 0.0f;
        }
    }

    public void a(com.airbnb.lottie.model.layer.b bVar) {
        bVar.i(this.j);
        bVar.i(this.m);
        bVar.i(this.n);
        bVar.i(this.f1434f);
        bVar.i(this.f1435g);
        bVar.i(this.h);
        bVar.i(this.i);
        bVar.i(this.k);
        bVar.i(this.l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.j;
        if (aVar != null) {
            aVar.a.add(bVar);
        }
        a<?, Float> aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.a.add(bVar);
        }
        a<?, Float> aVar3 = this.n;
        if (aVar3 != null) {
            aVar3.a.add(bVar);
        }
        a<PointF, PointF> aVar4 = this.f1434f;
        if (aVar4 != null) {
            aVar4.a.add(bVar);
        }
        a<?, PointF> aVar5 = this.f1435g;
        if (aVar5 != null) {
            aVar5.a.add(bVar);
        }
        a<com.airbnb.lottie.z.d, com.airbnb.lottie.z.d> aVar6 = this.h;
        if (aVar6 != null) {
            aVar6.a.add(bVar);
        }
        a<Float, Float> aVar7 = this.i;
        if (aVar7 != null) {
            aVar7.a.add(bVar);
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.a.add(bVar);
        }
        c cVar2 = this.l;
        if (cVar2 != null) {
            cVar2.a.add(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> boolean c(T t, @Nullable com.airbnb.lottie.z.c<T> cVar) {
        c cVar2;
        c cVar3;
        a<?, Float> aVar;
        a<?, Float> aVar2;
        if (t == com.airbnb.lottie.n.f1360e) {
            a<PointF, PointF> aVar3 = this.f1434f;
            if (aVar3 == null) {
                this.f1434f = new p(cVar, new PointF());
                return true;
            }
            com.airbnb.lottie.z.c<PointF> cVar4 = aVar3.f1425e;
            aVar3.f1425e = cVar;
            return true;
        }
        if (t == com.airbnb.lottie.n.f1361f) {
            a<?, PointF> aVar4 = this.f1435g;
            if (aVar4 == null) {
                this.f1435g = new p(cVar, new PointF());
                return true;
            }
            com.airbnb.lottie.z.c<PointF> cVar5 = aVar4.f1425e;
            aVar4.f1425e = cVar;
            return true;
        }
        if (t == com.airbnb.lottie.n.f1362g) {
            a<?, PointF> aVar5 = this.f1435g;
            if (aVar5 instanceof m) {
                m mVar = (m) aVar5;
                com.airbnb.lottie.z.c<Float> cVar6 = mVar.m;
                mVar.m = cVar;
                return true;
            }
        }
        if (t == com.airbnb.lottie.n.h) {
            a<?, PointF> aVar6 = this.f1435g;
            if (aVar6 instanceof m) {
                m mVar2 = (m) aVar6;
                com.airbnb.lottie.z.c<Float> cVar7 = mVar2.n;
                mVar2.n = cVar;
                return true;
            }
        }
        if (t == com.airbnb.lottie.n.m) {
            a<com.airbnb.lottie.z.d, com.airbnb.lottie.z.d> aVar7 = this.h;
            if (aVar7 == null) {
                this.h = new p(cVar, new com.airbnb.lottie.z.d());
                return true;
            }
            com.airbnb.lottie.z.c<com.airbnb.lottie.z.d> cVar8 = aVar7.f1425e;
            aVar7.f1425e = cVar;
            return true;
        }
        if (t == com.airbnb.lottie.n.n) {
            a<Float, Float> aVar8 = this.i;
            if (aVar8 == null) {
                this.i = new p(cVar, Float.valueOf(0.0f));
                return true;
            }
            com.airbnb.lottie.z.c<Float> cVar9 = aVar8.f1425e;
            aVar8.f1425e = cVar;
            return true;
        }
        if (t == com.airbnb.lottie.n.f1358c) {
            a<Integer, Integer> aVar9 = this.j;
            if (aVar9 == null) {
                this.j = new p(cVar, 100);
                return true;
            }
            com.airbnb.lottie.z.c<Integer> cVar10 = aVar9.f1425e;
            aVar9.f1425e = cVar;
            return true;
        }
        if (t == com.airbnb.lottie.n.A && (aVar2 = this.m) != null) {
            if (aVar2 == null) {
                this.m = new p(cVar, 100);
                return true;
            }
            com.airbnb.lottie.z.c<Float> cVar11 = aVar2.f1425e;
            aVar2.f1425e = cVar;
            return true;
        }
        if (t == com.airbnb.lottie.n.B && (aVar = this.n) != null) {
            if (aVar == null) {
                this.n = new p(cVar, 100);
                return true;
            }
            com.airbnb.lottie.z.c<Float> cVar12 = aVar.f1425e;
            aVar.f1425e = cVar;
            return true;
        }
        if (t == com.airbnb.lottie.n.o && (cVar3 = this.k) != null) {
            if (cVar3 == null) {
                this.k = new c(Collections.singletonList(new com.airbnb.lottie.z.a(Float.valueOf(0.0f))));
            }
            c cVar13 = this.k;
            Object obj = cVar13.f1425e;
            cVar13.f1425e = cVar;
            return true;
        }
        if (t != com.airbnb.lottie.n.p || (cVar2 = this.l) == null) {
            return false;
        }
        if (cVar2 == null) {
            this.l = new c(Collections.singletonList(new com.airbnb.lottie.z.a(Float.valueOf(0.0f))));
        }
        c cVar14 = this.l;
        Object obj2 = cVar14.f1425e;
        cVar14.f1425e = cVar;
        return true;
    }

    @Nullable
    public a<?, Float> e() {
        return this.n;
    }

    public Matrix f() {
        this.a.reset();
        a<?, PointF> aVar = this.f1435g;
        if (aVar != null) {
            PointF g2 = aVar.g();
            float f2 = g2.x;
            if (f2 != 0.0f || g2.y != 0.0f) {
                this.a.preTranslate(f2, g2.y);
            }
        }
        a<Float, Float> aVar2 = this.i;
        if (aVar2 != null) {
            float floatValue = aVar2 instanceof p ? aVar2.g().floatValue() : ((c) aVar2).n();
            if (floatValue != 0.0f) {
                this.a.preRotate(floatValue);
            }
        }
        if (this.k != null) {
            float cos = this.l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r0.n()) + 90.0f));
            float sin = this.l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r4.n()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(this.k.n()));
            d();
            float[] fArr = this.f1433e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f3 = -sin;
            fArr[3] = f3;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.b.setValues(fArr);
            d();
            float[] fArr2 = this.f1433e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f1431c.setValues(fArr2);
            d();
            float[] fArr3 = this.f1433e;
            fArr3[0] = cos;
            fArr3[1] = f3;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f1432d.setValues(fArr3);
            this.f1431c.preConcat(this.b);
            this.f1432d.preConcat(this.f1431c);
            this.a.preConcat(this.f1432d);
        }
        a<com.airbnb.lottie.z.d, com.airbnb.lottie.z.d> aVar3 = this.h;
        if (aVar3 != null) {
            com.airbnb.lottie.z.d g3 = aVar3.g();
            if (g3.b() != 1.0f || g3.c() != 1.0f) {
                this.a.preScale(g3.b(), g3.c());
            }
        }
        a<PointF, PointF> aVar4 = this.f1434f;
        if (aVar4 != null) {
            PointF g4 = aVar4.g();
            float f4 = g4.x;
            if (f4 != 0.0f || g4.y != 0.0f) {
                this.a.preTranslate(-f4, -g4.y);
            }
        }
        return this.a;
    }

    public Matrix g(float f2) {
        a<?, PointF> aVar = this.f1435g;
        PointF g2 = aVar == null ? null : aVar.g();
        a<com.airbnb.lottie.z.d, com.airbnb.lottie.z.d> aVar2 = this.h;
        com.airbnb.lottie.z.d g3 = aVar2 == null ? null : aVar2.g();
        this.a.reset();
        if (g2 != null) {
            this.a.preTranslate(g2.x * f2, g2.y * f2);
        }
        if (g3 != null) {
            double d2 = f2;
            this.a.preScale((float) Math.pow(g3.b(), d2), (float) Math.pow(g3.c(), d2));
        }
        a<Float, Float> aVar3 = this.i;
        if (aVar3 != null) {
            float floatValue = aVar3.g().floatValue();
            a<PointF, PointF> aVar4 = this.f1434f;
            PointF g4 = aVar4 != null ? aVar4.g() : null;
            this.a.preRotate(floatValue * f2, g4 == null ? 0.0f : g4.x, g4 != null ? g4.y : 0.0f);
        }
        return this.a;
    }

    @Nullable
    public a<?, Integer> h() {
        return this.j;
    }

    @Nullable
    public a<?, Float> i() {
        return this.m;
    }

    public void j(float f2) {
        a<Integer, Integer> aVar = this.j;
        if (aVar != null) {
            aVar.l(f2);
        }
        a<?, Float> aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.l(f2);
        }
        a<?, Float> aVar3 = this.n;
        if (aVar3 != null) {
            aVar3.l(f2);
        }
        a<PointF, PointF> aVar4 = this.f1434f;
        if (aVar4 != null) {
            aVar4.l(f2);
        }
        a<?, PointF> aVar5 = this.f1435g;
        if (aVar5 != null) {
            aVar5.l(f2);
        }
        a<com.airbnb.lottie.z.d, com.airbnb.lottie.z.d> aVar6 = this.h;
        if (aVar6 != null) {
            aVar6.l(f2);
        }
        a<Float, Float> aVar7 = this.i;
        if (aVar7 != null) {
            aVar7.l(f2);
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.l(f2);
        }
        c cVar2 = this.l;
        if (cVar2 != null) {
            cVar2.l(f2);
        }
    }
}
