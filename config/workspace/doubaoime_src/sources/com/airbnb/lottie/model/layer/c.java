package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.i;
import com.airbnb.lottie.n;
import com.airbnb.lottie.v.c.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c extends b {
    private final List<b> A;
    private final RectF B;
    private final RectF C;
    private Paint D;

    @Nullable
    private com.airbnb.lottie.v.c.a<Float, Float> z;

    public c(i iVar, Layer layer, List<Layer> list, com.airbnb.lottie.g gVar) {
        super(iVar, layer);
        int i;
        b bVar;
        b cVar;
        this.A = new ArrayList();
        this.B = new RectF();
        this.C = new RectF();
        this.D = new Paint();
        com.airbnb.lottie.model.i.b s = layer.s();
        if (s != null) {
            com.airbnb.lottie.v.c.a<Float, Float> a = s.a();
            this.z = a;
            i(a);
            this.z.a(this);
        } else {
            this.z = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(gVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            int ordinal = layer2.d().ordinal();
            if (ordinal == 0) {
                cVar = new c(iVar, layer2, gVar.o(layer2.k()), gVar);
            } else if (ordinal == 1) {
                cVar = new g(iVar, layer2);
            } else if (ordinal == 2) {
                cVar = new d(iVar, layer2);
            } else if (ordinal == 3) {
                cVar = new e(iVar, layer2);
            } else if (ordinal == 4) {
                cVar = new f(iVar, layer2);
            } else if (ordinal != 5) {
                StringBuilder M = e.a.a.a.a.M("Unknown layer type ");
                M.append(layer2.d());
                com.airbnb.lottie.y.d.c(M.toString());
                cVar = null;
            } else {
                cVar = new h(iVar, layer2);
            }
            if (cVar != null) {
                longSparseArray.put(cVar.o.b(), cVar);
                if (bVar2 != null) {
                    bVar2.q(cVar);
                    bVar2 = null;
                } else {
                    this.A.add(0, cVar);
                    int ordinal2 = layer2.f().ordinal();
                    if (ordinal2 == 1 || ordinal2 == 2) {
                        bVar2 = cVar;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            b bVar3 = (b) longSparseArray.get(longSparseArray.keyAt(i));
            if (bVar3 != null && (bVar = (b) longSparseArray.get(bVar3.o.h())) != null) {
                bVar3.s(bVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.v.b.e
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        for (int size = this.A.size() - 1; size >= 0; size--) {
            this.B.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.A.get(size).d(this.B, this.m, true);
            rectF.union(this.B);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void g(T t, @Nullable com.airbnb.lottie.z.c<T> cVar) {
        this.v.c(t, cVar);
        if (t == n.C) {
            if (cVar == null) {
                com.airbnb.lottie.v.c.a<Float, Float> aVar = this.z;
                if (aVar != null) {
                    aVar.m(null);
                    return;
                }
                return;
            }
            p pVar = new p(cVar, null);
            this.z = pVar;
            pVar.a(this);
            i(this.z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    void l(Canvas canvas, Matrix matrix, int i) {
        this.C.set(0.0f, 0.0f, this.o.j(), this.o.i());
        matrix.mapRect(this.C);
        boolean z = this.n.s() && this.A.size() > 1 && i != 255;
        if (z) {
            this.D.setAlpha(i);
            RectF rectF = this.C;
            Paint paint = this.D;
            int i2 = com.airbnb.lottie.y.h.f1458g;
            canvas.saveLayer(rectF, paint);
            com.airbnb.lottie.d.a("Utils#saveLayer");
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.A.size() - 1; size >= 0; size--) {
            if (!this.C.isEmpty() ? canvas.clipRect(this.C) : true) {
                this.A.get(size).f(canvas, matrix, i);
            }
        }
        canvas.restore();
        com.airbnb.lottie.d.a("CompositionLayer#draw");
    }

    @Override // com.airbnb.lottie.model.layer.b
    protected void p(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        for (int i2 = 0; i2 < this.A.size(); i2++) {
            this.A.get(i2).c(dVar, i, list, dVar2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void r(boolean z) {
        super.r(z);
        Iterator<b> it2 = this.A.iterator();
        while (it2.hasNext()) {
            it2.next().r(z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void t(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        super.t(f2);
        if (this.z != null) {
            f2 = ((this.o.a().i() * this.z.g().floatValue()) - this.o.a().p()) / (this.n.k().e() + 0.01f);
        }
        if (this.z == null) {
            f2 -= this.o.p();
        }
        if (this.o.t() != 0.0f && !"__container".equals(this.o.g())) {
            f2 /= this.o.t();
        }
        for (int size = this.A.size() - 1; size >= 0; size--) {
            this.A.get(size).t(f2);
        }
    }
}
