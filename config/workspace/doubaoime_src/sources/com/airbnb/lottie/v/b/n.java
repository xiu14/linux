package com.airbnb.lottie.v.b;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.v.c.a;
import java.util.List;

/* loaded from: classes.dex */
public class n implements m, a.b, k {
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.i f1400c;

    /* renamed from: d, reason: collision with root package name */
    private final PolystarShape.Type f1401d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1402e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.v.c.a<?, Float> f1403f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.v.c.a<?, PointF> f1404g;
    private final com.airbnb.lottie.v.c.a<?, Float> h;

    @Nullable
    private final com.airbnb.lottie.v.c.a<?, Float> i;
    private final com.airbnb.lottie.v.c.a<?, Float> j;

    @Nullable
    private final com.airbnb.lottie.v.c.a<?, Float> k;
    private final com.airbnb.lottie.v.c.a<?, Float> l;
    private boolean n;
    private final Path a = new Path();
    private b m = new b();

    public n(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar, PolystarShape polystarShape) {
        this.f1400c = iVar;
        this.b = polystarShape.d();
        PolystarShape.Type j = polystarShape.j();
        this.f1401d = j;
        this.f1402e = polystarShape.k();
        com.airbnb.lottie.v.c.a<Float, Float> a = polystarShape.g().a();
        this.f1403f = a;
        com.airbnb.lottie.v.c.a<PointF, PointF> a2 = polystarShape.h().a();
        this.f1404g = a2;
        com.airbnb.lottie.v.c.a<Float, Float> a3 = polystarShape.i().a();
        this.h = a3;
        com.airbnb.lottie.v.c.a<Float, Float> a4 = polystarShape.e().a();
        this.j = a4;
        com.airbnb.lottie.v.c.a<Float, Float> a5 = polystarShape.f().a();
        this.l = a5;
        PolystarShape.Type type = PolystarShape.Type.STAR;
        if (j == type) {
            this.i = polystarShape.b().a();
            this.k = polystarShape.c().a();
        } else {
            this.i = null;
            this.k = null;
        }
        bVar.i(a);
        bVar.i(a2);
        bVar.i(a3);
        bVar.i(a4);
        bVar.i(a5);
        if (j == type) {
            bVar.i(this.i);
            bVar.i(this.k);
        }
        a.a(this);
        a2.a(this);
        a3.a(this);
        a4.a(this);
        a5.a(this);
        if (j == type) {
            this.i.a(this);
            this.k.a(this);
        }
    }

    @Override // com.airbnb.lottie.v.c.a.b
    public void a() {
        this.n = false;
        this.f1400c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.v.b.c
    public void b(List<c> list, List<c> list2) {
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.i() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.m.a(sVar);
                    sVar.c(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void c(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.y.g.g(dVar, i, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void g(T t, @Nullable com.airbnb.lottie.z.c<T> cVar) {
        com.airbnb.lottie.v.c.a<?, Float> aVar;
        com.airbnb.lottie.v.c.a<?, Float> aVar2;
        if (t == com.airbnb.lottie.n.u) {
            this.f1403f.m(cVar);
            return;
        }
        if (t == com.airbnb.lottie.n.v) {
            this.h.m(cVar);
            return;
        }
        if (t == com.airbnb.lottie.n.l) {
            this.f1404g.m(cVar);
            return;
        }
        if (t == com.airbnb.lottie.n.w && (aVar2 = this.i) != null) {
            aVar2.m(cVar);
            return;
        }
        if (t == com.airbnb.lottie.n.x) {
            this.j.m(cVar);
            return;
        }
        if (t == com.airbnb.lottie.n.y && (aVar = this.k) != null) {
            aVar.m(cVar);
        } else if (t == com.airbnb.lottie.n.z) {
            this.l.m(cVar);
        }
    }

    @Override // com.airbnb.lottie.v.b.c
    public String getName() {
        return this.b;
    }

    @Override // com.airbnb.lottie.v.b.m
    public Path getPath() {
        float f2;
        float f3;
        float sin;
        double d2;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        double d3;
        float f10;
        float f11;
        double d4;
        double d5;
        double d6;
        if (this.n) {
            return this.a;
        }
        this.a.reset();
        if (this.f1402e) {
            this.n = true;
            return this.a;
        }
        int ordinal = this.f1401d.ordinal();
        if (ordinal == 0) {
            float floatValue = this.f1403f.g().floatValue();
            double radians = Math.toRadians((this.h != null ? r2.g().floatValue() : 0.0d) - 90.0d);
            double d7 = floatValue;
            float f12 = (float) (6.283185307179586d / d7);
            float f13 = f12 / 2.0f;
            float f14 = floatValue - ((int) floatValue);
            if (f14 != 0.0f) {
                radians += (1.0f - f14) * f13;
            }
            float floatValue2 = this.j.g().floatValue();
            float floatValue3 = this.i.g().floatValue();
            com.airbnb.lottie.v.c.a<?, Float> aVar = this.k;
            float floatValue4 = aVar != null ? aVar.g().floatValue() / 100.0f : 0.0f;
            com.airbnb.lottie.v.c.a<?, Float> aVar2 = this.l;
            float floatValue5 = aVar2 != null ? aVar2.g().floatValue() / 100.0f : 0.0f;
            if (f14 != 0.0f) {
                f5 = e.a.a.a.a.a(floatValue2, floatValue3, f14, floatValue3);
                double d8 = f5;
                f2 = floatValue3;
                f3 = floatValue4;
                f4 = (float) (Math.cos(radians) * d8);
                sin = (float) (d8 * Math.sin(radians));
                this.a.moveTo(f4, sin);
                d2 = radians + ((f12 * f14) / 2.0f);
            } else {
                f2 = floatValue3;
                f3 = floatValue4;
                double d9 = floatValue2;
                float cos = (float) (Math.cos(radians) * d9);
                sin = (float) (Math.sin(radians) * d9);
                this.a.moveTo(cos, sin);
                d2 = radians + f13;
                f4 = cos;
                f5 = 0.0f;
            }
            double ceil = Math.ceil(d7) * 2.0d;
            int i = 0;
            boolean z = false;
            while (true) {
                double d10 = i;
                if (d10 >= ceil) {
                    break;
                }
                float f15 = z ? floatValue2 : f2;
                if (f5 == 0.0f || d10 != ceil - 2.0d) {
                    f6 = f12;
                    f7 = f13;
                } else {
                    f6 = f12;
                    f7 = (f12 * f14) / 2.0f;
                }
                if (f5 == 0.0f || d10 != ceil - 1.0d) {
                    f8 = f5;
                    f5 = f15;
                    f9 = f7;
                } else {
                    f9 = f7;
                    f8 = f5;
                }
                double d11 = f5;
                float cos2 = (float) (Math.cos(d2) * d11);
                float sin2 = (float) (d11 * Math.sin(d2));
                if (f3 == 0.0f && floatValue5 == 0.0f) {
                    this.a.lineTo(cos2, sin2);
                    f10 = sin2;
                    d3 = d2;
                    f11 = floatValue5;
                } else {
                    d3 = d2;
                    float f16 = sin;
                    double atan2 = (float) (Math.atan2(sin, f4) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f10 = sin2;
                    f11 = floatValue5;
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f17 = z ? f3 : f11;
                    float f18 = z ? f11 : f3;
                    float f19 = (z ? f2 : floatValue2) * f17 * 0.47829f;
                    float f20 = cos3 * f19;
                    float f21 = f19 * sin3;
                    float f22 = (z ? floatValue2 : f2) * f18 * 0.47829f;
                    float f23 = cos4 * f22;
                    float f24 = f22 * sin4;
                    if (f14 != 0.0f) {
                        if (i == 0) {
                            f20 *= f14;
                            f21 *= f14;
                        } else if (d10 == ceil - 1.0d) {
                            f23 *= f14;
                            f24 *= f14;
                        }
                    }
                    this.a.cubicTo(f4 - f20, f16 - f21, cos2 + f23, f10 + f24, cos2, f10);
                }
                d2 = d3 + f9;
                z = !z;
                i++;
                f4 = cos2;
                f5 = f8;
                f12 = f6;
                sin = f10;
                floatValue5 = f11;
            }
            PointF g2 = this.f1404g.g();
            this.a.offset(g2.x, g2.y);
            this.a.close();
        } else if (ordinal == 1) {
            int floor = (int) Math.floor(this.f1403f.g().floatValue());
            double radians2 = Math.toRadians((this.h != null ? r2.g().floatValue() : 0.0d) - 90.0d);
            double d12 = floor;
            float floatValue6 = this.l.g().floatValue() / 100.0f;
            float floatValue7 = this.j.g().floatValue();
            double d13 = floatValue7;
            float cos5 = (float) (Math.cos(radians2) * d13);
            float sin5 = (float) (Math.sin(radians2) * d13);
            this.a.moveTo(cos5, sin5);
            double d14 = (float) (6.283185307179586d / d12);
            double d15 = radians2 + d14;
            double ceil2 = Math.ceil(d12);
            int i2 = 0;
            while (i2 < ceil2) {
                float cos6 = (float) (Math.cos(d15) * d13);
                double d16 = ceil2;
                float sin6 = (float) (Math.sin(d15) * d13);
                if (floatValue6 != 0.0f) {
                    d5 = d13;
                    d4 = d15;
                    double atan23 = (float) (Math.atan2(sin5, cos5) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan23);
                    float sin7 = (float) Math.sin(atan23);
                    d6 = d14;
                    double atan24 = (float) (Math.atan2(sin6, cos6) - 1.5707963267948966d);
                    float f25 = floatValue7 * floatValue6 * 0.25f;
                    this.a.cubicTo(cos5 - (cos7 * f25), sin5 - (sin7 * f25), cos6 + (((float) Math.cos(atan24)) * f25), sin6 + (f25 * ((float) Math.sin(atan24))), cos6, sin6);
                } else {
                    d4 = d15;
                    d5 = d13;
                    d6 = d14;
                    this.a.lineTo(cos6, sin6);
                }
                d15 = d4 + d6;
                i2++;
                sin5 = sin6;
                cos5 = cos6;
                ceil2 = d16;
                d13 = d5;
                d14 = d6;
            }
            PointF g3 = this.f1404g.g();
            this.a.offset(g3.x, g3.y);
            this.a.close();
        }
        this.a.close();
        this.m.b(this.a);
        this.n = true;
        return this.a;
    }
}
