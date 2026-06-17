package com.airbnb.lottie.v.b;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.v.c.a;
import java.util.List;

/* loaded from: classes.dex */
public class f implements m, a.b, k {
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.i f1382c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.v.c.a<?, PointF> f1383d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.v.c.a<?, PointF> f1384e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.a f1385f;
    private boolean h;
    private final Path a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private b f1386g = new b();

    public f(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.a aVar) {
        this.b = aVar.b();
        this.f1382c = iVar;
        com.airbnb.lottie.v.c.a<PointF, PointF> a = aVar.d().a();
        this.f1383d = a;
        com.airbnb.lottie.v.c.a<PointF, PointF> a2 = aVar.c().a();
        this.f1384e = a2;
        this.f1385f = aVar;
        bVar.i(a);
        bVar.i(a2);
        a.a(this);
        a2.a(this);
    }

    @Override // com.airbnb.lottie.v.c.a.b
    public void a() {
        this.h = false;
        this.f1382c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.v.b.c
    public void b(List<c> list, List<c> list2) {
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.i() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f1386g.a(sVar);
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
        if (t == com.airbnb.lottie.n.i) {
            this.f1383d.m(cVar);
        } else if (t == com.airbnb.lottie.n.l) {
            this.f1384e.m(cVar);
        }
    }

    @Override // com.airbnb.lottie.v.b.c
    public String getName() {
        return this.b;
    }

    @Override // com.airbnb.lottie.v.b.m
    public Path getPath() {
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        if (this.f1385f.e()) {
            this.h = true;
            return this.a;
        }
        PointF g2 = this.f1383d.g();
        float f2 = g2.x / 2.0f;
        float f3 = g2.y / 2.0f;
        float f4 = f2 * 0.55228f;
        float f5 = 0.55228f * f3;
        this.a.reset();
        if (this.f1385f.f()) {
            float f6 = -f3;
            this.a.moveTo(0.0f, f6);
            float f7 = 0.0f - f4;
            float f8 = -f2;
            float f9 = 0.0f - f5;
            this.a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            float f10 = f5 + 0.0f;
            this.a.cubicTo(f8, f10, f7, f3, 0.0f, f3);
            float f11 = f4 + 0.0f;
            this.a.cubicTo(f11, f3, f2, f10, f2, 0.0f);
            this.a.cubicTo(f2, f9, f11, f6, 0.0f, f6);
        } else {
            float f12 = -f3;
            this.a.moveTo(0.0f, f12);
            float f13 = f4 + 0.0f;
            float f14 = 0.0f - f5;
            this.a.cubicTo(f13, f12, f2, f14, f2, 0.0f);
            float f15 = f5 + 0.0f;
            this.a.cubicTo(f2, f15, f13, f3, 0.0f, f3);
            float f16 = 0.0f - f4;
            float f17 = -f2;
            this.a.cubicTo(f16, f3, f17, f15, f17, 0.0f);
            this.a.cubicTo(f17, f14, f16, f12, 0.0f, f12);
        }
        PointF g3 = this.f1384e.g();
        this.a.offset(g3.x, g3.y);
        this.a.close();
        this.f1386g.b(this.a);
        this.h = true;
        return this.a;
    }
}
