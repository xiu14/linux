package com.airbnb.lottie.v.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.v.c.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g implements e, a.b, k {
    private final Path a;
    private final Paint b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f1387c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1388d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1389e;

    /* renamed from: f, reason: collision with root package name */
    private final List<m> f1390f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.v.c.a<Integer, Integer> f1391g;
    private final com.airbnb.lottie.v.c.a<Integer, Integer> h;

    @Nullable
    private com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> i;
    private final com.airbnb.lottie.i j;

    public g(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.i iVar2) {
        Path path = new Path();
        this.a = path;
        this.b = new com.airbnb.lottie.v.a(1);
        this.f1390f = new ArrayList();
        this.f1387c = bVar;
        this.f1388d = iVar2.d();
        this.f1389e = iVar2.f();
        this.j = iVar;
        if (iVar2.b() == null || iVar2.e() == null) {
            this.f1391g = null;
            this.h = null;
            return;
        }
        path.setFillType(iVar2.c());
        com.airbnb.lottie.v.c.a<Integer, Integer> a = iVar2.b().a();
        this.f1391g = a;
        a.a(this);
        bVar.i(a);
        com.airbnb.lottie.v.c.a<Integer, Integer> a2 = iVar2.e().a();
        this.h = a2;
        a2.a(this);
        bVar.i(a2);
    }

    @Override // com.airbnb.lottie.v.c.a.b
    public void a() {
        this.j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.v.b.c
    public void b(List<c> list, List<c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            c cVar = list2.get(i);
            if (cVar instanceof m) {
                this.f1390f.add((m) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void c(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.y.g.g(dVar, i, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.v.b.e
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i = 0; i < this.f1390f.size(); i++) {
            this.a.addPath(this.f1390f.get(i).getPath(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.v.b.e
    public void f(Canvas canvas, Matrix matrix, int i) {
        if (this.f1389e) {
            return;
        }
        this.b.setColor(((com.airbnb.lottie.v.c.b) this.f1391g).n());
        this.b.setAlpha(com.airbnb.lottie.y.g.c((int) ((((i / 255.0f) * this.h.g().intValue()) / 100.0f) * 255.0f), 0, 255));
        com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> aVar = this.i;
        if (aVar != null) {
            this.b.setColorFilter(aVar.g());
        }
        this.a.reset();
        for (int i2 = 0; i2 < this.f1390f.size(); i2++) {
            this.a.addPath(this.f1390f.get(i2).getPath(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        com.airbnb.lottie.d.a("FillContent#draw");
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void g(T t, @Nullable com.airbnb.lottie.z.c<T> cVar) {
        if (t == com.airbnb.lottie.n.a) {
            this.f1391g.m(cVar);
            return;
        }
        if (t == com.airbnb.lottie.n.f1359d) {
            this.h.m(cVar);
            return;
        }
        if (t == com.airbnb.lottie.n.E) {
            com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> aVar = this.i;
            if (aVar != null) {
                this.f1387c.o(aVar);
            }
            if (cVar == null) {
                this.i = null;
                return;
            }
            com.airbnb.lottie.v.c.p pVar = new com.airbnb.lottie.v.c.p(cVar, null);
            this.i = pVar;
            pVar.a(this);
            this.f1387c.i(this.i);
        }
    }

    @Override // com.airbnb.lottie.v.b.c
    public String getName() {
        return this.f1388d;
    }
}
