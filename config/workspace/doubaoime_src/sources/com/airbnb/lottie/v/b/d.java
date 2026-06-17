package com.airbnb.lottie.v.b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.v.c.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d implements e, m, a.b, com.airbnb.lottie.model.e {
    private Paint a;
    private RectF b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f1377c;

    /* renamed from: d, reason: collision with root package name */
    private final Path f1378d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f1379e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1380f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f1381g;
    private final List<c> h;
    private final com.airbnb.lottie.i i;

    @Nullable
    private List<m> j;

    @Nullable
    private com.airbnb.lottie.v.c.o k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(com.airbnb.lottie.i r8, com.airbnb.lottie.model.layer.b r9, com.airbnb.lottie.model.content.j r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.c()
            boolean r4 = r10.d()
            java.util.List r0 = r10.b()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = r1
        L17:
            int r6 = r0.size()
            if (r2 >= r6) goto L2f
            java.lang.Object r6 = r0.get(r2)
            com.airbnb.lottie.model.content.b r6 = (com.airbnb.lottie.model.content.b) r6
            com.airbnb.lottie.v.b.c r6 = r6.a(r8, r9)
            if (r6 == 0) goto L2c
            r5.add(r6)
        L2c:
            int r2 = r2 + 1
            goto L17
        L2f:
            java.util.List r10 = r10.b()
        L33:
            int r0 = r10.size()
            if (r1 >= r0) goto L4a
            java.lang.Object r0 = r10.get(r1)
            com.airbnb.lottie.model.content.b r0 = (com.airbnb.lottie.model.content.b) r0
            boolean r2 = r0 instanceof com.airbnb.lottie.model.i.l
            if (r2 == 0) goto L47
            com.airbnb.lottie.model.i.l r0 = (com.airbnb.lottie.model.i.l) r0
            r6 = r0
            goto L4c
        L47:
            int r1 = r1 + 1
            goto L33
        L4a:
            r10 = 0
            r6 = r10
        L4c:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.v.b.d.<init>(com.airbnb.lottie.i, com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.content.j):void");
    }

    @Override // com.airbnb.lottie.v.c.a.b
    public void a() {
        this.i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.v.b.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(this.h.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            c cVar = this.h.get(size);
            cVar.b(arrayList, this.h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void c(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        if (dVar.f(this.f1380f, i) || "__container".equals(this.f1380f)) {
            if (!"__container".equals(this.f1380f)) {
                dVar2 = dVar2.a(this.f1380f);
                if (dVar.c(this.f1380f, i)) {
                    list.add(dVar2.h(this));
                }
            }
            if (dVar.g(this.f1380f, i)) {
                int e2 = dVar.e(this.f1380f, i) + i;
                for (int i2 = 0; i2 < this.h.size(); i2++) {
                    c cVar = this.h.get(i2);
                    if (cVar instanceof com.airbnb.lottie.model.e) {
                        ((com.airbnb.lottie.model.e) cVar).c(dVar, e2, list, dVar2);
                    }
                }
            }
        }
    }

    @Override // com.airbnb.lottie.v.b.e
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.f1377c.set(matrix);
        com.airbnb.lottie.v.c.o oVar = this.k;
        if (oVar != null) {
            this.f1377c.preConcat(oVar.f());
        }
        this.f1379e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            c cVar = this.h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).d(this.f1379e, this.f1377c, z);
                rectF.union(this.f1379e);
            }
        }
    }

    List<m> e() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i = 0; i < this.h.size(); i++) {
                c cVar = this.h.get(i);
                if (cVar instanceof m) {
                    this.j.add((m) cVar);
                }
            }
        }
        return this.j;
    }

    @Override // com.airbnb.lottie.v.b.e
    public void f(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        if (this.f1381g) {
            return;
        }
        this.f1377c.set(matrix);
        com.airbnb.lottie.v.c.o oVar = this.k;
        if (oVar != null) {
            this.f1377c.preConcat(oVar.f());
            i = (int) (((((this.k.h() == null ? 100 : this.k.h().g().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z2 = false;
        if (this.i.s()) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= this.h.size()) {
                    z = false;
                    break;
                } else {
                    if ((this.h.get(i2) instanceof e) && (i3 = i3 + 1) >= 2) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z && i != 255) {
                z2 = true;
            }
        }
        if (z2) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(this.b, this.f1377c, true);
            this.a.setAlpha(i);
            RectF rectF = this.b;
            Paint paint = this.a;
            int i4 = com.airbnb.lottie.y.h.f1458g;
            canvas.saveLayer(rectF, paint);
            com.airbnb.lottie.d.a("Utils#saveLayer");
        }
        if (z2) {
            i = 255;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            c cVar = this.h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).f(canvas, this.f1377c, i);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void g(T t, @Nullable com.airbnb.lottie.z.c<T> cVar) {
        com.airbnb.lottie.v.c.o oVar = this.k;
        if (oVar != null) {
            oVar.c(t, cVar);
        }
    }

    @Override // com.airbnb.lottie.v.b.c
    public String getName() {
        return this.f1380f;
    }

    @Override // com.airbnb.lottie.v.b.m
    public Path getPath() {
        this.f1377c.reset();
        com.airbnb.lottie.v.c.o oVar = this.k;
        if (oVar != null) {
            this.f1377c.set(oVar.f());
        }
        this.f1378d.reset();
        if (this.f1381g) {
            return this.f1378d;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            c cVar = this.h.get(size);
            if (cVar instanceof m) {
                this.f1378d.addPath(((m) cVar).getPath(), this.f1377c);
            }
        }
        return this.f1378d;
    }

    Matrix h() {
        com.airbnb.lottie.v.c.o oVar = this.k;
        if (oVar != null) {
            return oVar.f();
        }
        this.f1377c.reset();
        return this.f1377c;
    }

    d(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar, String str, boolean z, List<c> list, @Nullable com.airbnb.lottie.model.i.l lVar) {
        this.a = new com.airbnb.lottie.v.a();
        this.b = new RectF();
        this.f1377c = new Matrix();
        this.f1378d = new Path();
        this.f1379e = new RectF();
        this.f1380f = str;
        this.i = iVar;
        this.f1381g = z;
        this.h = list;
        if (lVar != null) {
            com.airbnb.lottie.v.c.o oVar = new com.airbnb.lottie.v.c.o(lVar);
            this.k = oVar;
            oVar.a(bVar);
            this.k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((j) arrayList.get(size2)).e(list.listIterator(list.size()));
            }
        }
    }
}
