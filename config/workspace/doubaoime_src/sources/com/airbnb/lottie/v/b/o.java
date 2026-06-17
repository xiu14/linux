package com.airbnb.lottie.v.b;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.v.c.a;
import java.util.List;

/* loaded from: classes.dex */
public class o implements a.b, k, m {

    /* renamed from: c, reason: collision with root package name */
    private final String f1405c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1406d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.i f1407e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.v.c.a<?, PointF> f1408f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.v.c.a<?, PointF> f1409g;
    private final com.airbnb.lottie.v.c.a<?, Float> h;
    private boolean j;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private b i = new b();

    public o(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.f fVar) {
        this.f1405c = fVar.c();
        this.f1406d = fVar.f();
        this.f1407e = iVar;
        com.airbnb.lottie.v.c.a<PointF, PointF> a = fVar.d().a();
        this.f1408f = a;
        com.airbnb.lottie.v.c.a<PointF, PointF> a2 = fVar.e().a();
        this.f1409g = a2;
        com.airbnb.lottie.v.c.a<Float, Float> a3 = fVar.b().a();
        this.h = a3;
        bVar.i(a);
        bVar.i(a2);
        bVar.i(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    @Override // com.airbnb.lottie.v.c.a.b
    public void a() {
        this.j = false;
        this.f1407e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.v.b.c
    public void b(List<c> list, List<c> list2) {
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.i() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.i.a(sVar);
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
        if (t == com.airbnb.lottie.n.j) {
            this.f1409g.m(cVar);
        } else if (t == com.airbnb.lottie.n.l) {
            this.f1408f.m(cVar);
        } else if (t == com.airbnb.lottie.n.k) {
            this.h.m(cVar);
        }
    }

    @Override // com.airbnb.lottie.v.b.c
    public String getName() {
        return this.f1405c;
    }

    @Override // com.airbnb.lottie.v.b.m
    public Path getPath() {
        if (this.j) {
            return this.a;
        }
        this.a.reset();
        if (this.f1406d) {
            this.j = true;
            return this.a;
        }
        PointF g2 = this.f1409g.g();
        float f2 = g2.x / 2.0f;
        float f3 = g2.y / 2.0f;
        com.airbnb.lottie.v.c.a<?, Float> aVar = this.h;
        float n = aVar == null ? 0.0f : ((com.airbnb.lottie.v.c.c) aVar).n();
        float min = Math.min(f2, f3);
        if (n > min) {
            n = min;
        }
        PointF g3 = this.f1408f.g();
        this.a.moveTo(g3.x + f2, (g3.y - f3) + n);
        this.a.lineTo(g3.x + f2, (g3.y + f3) - n);
        if (n > 0.0f) {
            RectF rectF = this.b;
            float f4 = g3.x;
            float f5 = n * 2.0f;
            float f6 = g3.y;
            rectF.set((f4 + f2) - f5, (f6 + f3) - f5, f4 + f2, f6 + f3);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((g3.x - f2) + n, g3.y + f3);
        if (n > 0.0f) {
            RectF rectF2 = this.b;
            float f7 = g3.x;
            float f8 = g3.y;
            float f9 = n * 2.0f;
            rectF2.set(f7 - f2, (f8 + f3) - f9, (f7 - f2) + f9, f8 + f3);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(g3.x - f2, (g3.y - f3) + n);
        if (n > 0.0f) {
            RectF rectF3 = this.b;
            float f10 = g3.x;
            float f11 = g3.y;
            float f12 = n * 2.0f;
            rectF3.set(f10 - f2, f11 - f3, (f10 - f2) + f12, (f11 - f3) + f12);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((g3.x + f2) - n, g3.y - f3);
        if (n > 0.0f) {
            RectF rectF4 = this.b;
            float f13 = g3.x;
            float f14 = n * 2.0f;
            float f15 = g3.y;
            rectF4.set((f13 + f2) - f14, f15 - f3, f13 + f2, (f15 - f3) + f14);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.i.b(this.a);
        this.j = true;
        return this.a;
    }
}
