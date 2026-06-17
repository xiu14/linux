package com.airbnb.lottie.v.b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.v.c.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class p implements e, m, j, a.b, k {
    private final Matrix a = new Matrix();
    private final Path b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.i f1410c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f1411d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1412e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1413f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.v.c.a<Float, Float> f1414g;
    private final com.airbnb.lottie.v.c.a<Float, Float> h;
    private final com.airbnb.lottie.v.c.o i;
    private d j;

    public p(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.g gVar) {
        this.f1410c = iVar;
        this.f1411d = bVar;
        this.f1412e = gVar.c();
        this.f1413f = gVar.f();
        com.airbnb.lottie.v.c.a<Float, Float> a = gVar.b().a();
        this.f1414g = a;
        bVar.i(a);
        a.a(this);
        com.airbnb.lottie.v.c.a<Float, Float> a2 = gVar.d().a();
        this.h = a2;
        bVar.i(a2);
        a2.a(this);
        com.airbnb.lottie.model.i.l e2 = gVar.e();
        Objects.requireNonNull(e2);
        com.airbnb.lottie.v.c.o oVar = new com.airbnb.lottie.v.c.o(e2);
        this.i = oVar;
        oVar.a(bVar);
        oVar.b(this);
    }

    @Override // com.airbnb.lottie.v.c.a.b
    public void a() {
        this.f1410c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.v.b.c
    public void b(List<c> list, List<c> list2) {
        this.j.b(list, list2);
    }

    @Override // com.airbnb.lottie.model.e
    public void c(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.y.g.g(dVar, i, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.v.b.e
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.j.d(rectF, matrix, z);
    }

    @Override // com.airbnb.lottie.v.b.j
    public void e(ListIterator<c> listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new d(this.f1410c, this.f1411d, "Repeater", this.f1413f, arrayList, null);
    }

    @Override // com.airbnb.lottie.v.b.e
    public void f(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f1414g.g().floatValue();
        float floatValue2 = this.h.g().floatValue();
        float floatValue3 = this.i.i().g().floatValue() / 100.0f;
        float floatValue4 = this.i.e().g().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.a.set(matrix);
            float f2 = i2;
            this.a.preConcat(this.i.g(f2 + floatValue2));
            this.j.f(canvas, this.a, (int) (com.airbnb.lottie.y.g.f(floatValue3, floatValue4, f2 / floatValue) * i));
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void g(T t, @Nullable com.airbnb.lottie.z.c<T> cVar) {
        if (this.i.c(t, cVar)) {
            return;
        }
        if (t == com.airbnb.lottie.n.s) {
            this.f1414g.m(cVar);
        } else if (t == com.airbnb.lottie.n.t) {
            this.h.m(cVar);
        }
    }

    @Override // com.airbnb.lottie.v.b.c
    public String getName() {
        return this.f1412e;
    }

    @Override // com.airbnb.lottie.v.b.m
    public Path getPath() {
        Path path = this.j.getPath();
        this.b.reset();
        float floatValue = this.f1414g.g().floatValue();
        float floatValue2 = this.h.g().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.a.set(this.i.g(i + floatValue2));
            this.b.addPath(path, this.a);
        }
        return this.b;
    }
}
