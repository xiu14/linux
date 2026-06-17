package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.i;
import com.airbnb.lottie.model.i.l;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.v.c.a;
import com.airbnb.lottie.v.c.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class b implements com.airbnb.lottie.v.b.e, a.b, com.airbnb.lottie.model.e {
    private final Path a = new Path();
    private final Matrix b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    private final Paint f1352c = new com.airbnb.lottie.v.a(1);

    /* renamed from: d, reason: collision with root package name */
    private final Paint f1353d = new com.airbnb.lottie.v.a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: e, reason: collision with root package name */
    private final Paint f1354e = new com.airbnb.lottie.v.a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: f, reason: collision with root package name */
    private final Paint f1355f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f1356g;
    private final RectF h;
    private final RectF i;
    private final RectF j;
    private final RectF k;
    private final String l;
    final Matrix m;
    final i n;
    final Layer o;

    @Nullable
    private com.airbnb.lottie.v.c.g p;

    @Nullable
    private com.airbnb.lottie.v.c.c q;

    @Nullable
    private b r;

    @Nullable
    private b s;
    private List<b> t;
    private final List<com.airbnb.lottie.v.c.a<?, ?>> u;
    final o v;
    private boolean w;
    private boolean x;

    @Nullable
    private Paint y;

    b(i iVar, Layer layer) {
        com.airbnb.lottie.v.a aVar = new com.airbnb.lottie.v.a(1);
        this.f1355f = aVar;
        this.f1356g = new com.airbnb.lottie.v.a(PorterDuff.Mode.CLEAR);
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.m = new Matrix();
        this.u = new ArrayList();
        this.w = true;
        this.n = iVar;
        this.o = layer;
        this.l = e.a.a.a.a.J(new StringBuilder(), layer.g(), "#draw");
        if (layer.f() == Layer.MatteType.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        l u = layer.u();
        Objects.requireNonNull(u);
        o oVar = new o(u);
        this.v = oVar;
        oVar.b(this);
        if (layer.e() != null && !layer.e().isEmpty()) {
            com.airbnb.lottie.v.c.g gVar = new com.airbnb.lottie.v.c.g(layer.e());
            this.p = gVar;
            Iterator<com.airbnb.lottie.v.c.a<com.airbnb.lottie.model.content.h, Path>> it2 = gVar.a().iterator();
            while (it2.hasNext()) {
                it2.next().a(this);
            }
            for (com.airbnb.lottie.v.c.a<Integer, Integer> aVar2 : this.p.c()) {
                i(aVar2);
                aVar2.a(this);
            }
        }
        if (this.o.c().isEmpty()) {
            u(true);
            return;
        }
        com.airbnb.lottie.v.c.c cVar = new com.airbnb.lottie.v.c.c(this.o.c());
        this.q = cVar;
        cVar.k();
        this.q.a(new a(this));
        u(this.q.g().floatValue() == 1.0f);
        i(this.q);
    }

    static void h(b bVar, boolean z) {
        if (z != bVar.w) {
            bVar.w = z;
            bVar.n.invalidateSelf();
        }
    }

    private void j() {
        if (this.t != null) {
            return;
        }
        if (this.s == null) {
            this.t = Collections.emptyList();
            return;
        }
        this.t = new ArrayList();
        for (b bVar = this.s; bVar != null; bVar = bVar.s) {
            this.t.add(bVar);
        }
    }

    private void k(Canvas canvas) {
        RectF rectF = this.h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f1356g);
        com.airbnb.lottie.d.a("Layer#clearLayer");
    }

    private void u(boolean z) {
        if (z != this.w) {
            this.w = z;
            this.n.invalidateSelf();
        }
    }

    @Override // com.airbnb.lottie.v.c.a.b
    public void a() {
        this.n.invalidateSelf();
    }

    @Override // com.airbnb.lottie.v.b.c
    public void b(List<com.airbnb.lottie.v.b.c> list, List<com.airbnb.lottie.v.b.c> list2) {
    }

    @Override // com.airbnb.lottie.model.e
    public void c(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        b bVar = this.r;
        if (bVar != null) {
            com.airbnb.lottie.model.d a = dVar2.a(bVar.getName());
            if (dVar.c(this.r.getName(), i)) {
                list.add(a.h(this.r));
            }
            if (dVar.g(getName(), i)) {
                this.r.p(dVar, dVar.e(this.r.getName(), i) + i, list, a);
            }
        }
        if (dVar.f(getName(), i)) {
            if (!"__container".equals(getName())) {
                dVar2 = dVar2.a(getName());
                if (dVar.c(getName(), i)) {
                    list.add(dVar2.h(this));
                }
            }
            if (dVar.g(getName(), i)) {
                p(dVar, dVar.e(getName(), i) + i, list, dVar2);
            }
        }
    }

    @Override // com.airbnb.lottie.v.b.e
    @CallSuper
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
        j();
        this.m.set(matrix);
        if (z) {
            List<b> list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.m.preConcat(this.t.get(size).v.f());
                }
            } else {
                b bVar = this.s;
                if (bVar != null) {
                    this.m.preConcat(bVar.v.f());
                }
            }
        }
        this.m.preConcat(this.v.f());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x040a A[SYNTHETIC] */
    @Override // com.airbnb.lottie.v.b.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.b.f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // com.airbnb.lottie.model.e
    @CallSuper
    public <T> void g(T t, @Nullable com.airbnb.lottie.z.c<T> cVar) {
        this.v.c(t, cVar);
    }

    @Override // com.airbnb.lottie.v.b.c
    public String getName() {
        return this.o.g();
    }

    public void i(@Nullable com.airbnb.lottie.v.c.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.u.add(aVar);
    }

    abstract void l(Canvas canvas, Matrix matrix, int i);

    boolean m() {
        com.airbnb.lottie.v.c.g gVar = this.p;
        return (gVar == null || gVar.a().isEmpty()) ? false : true;
    }

    boolean n() {
        return this.r != null;
    }

    public void o(com.airbnb.lottie.v.c.a<?, ?> aVar) {
        this.u.remove(aVar);
    }

    void p(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
    }

    void q(@Nullable b bVar) {
        this.r = bVar;
    }

    void r(boolean z) {
        if (z && this.y == null) {
            this.y = new com.airbnb.lottie.v.a();
        }
        this.x = z;
    }

    void s(@Nullable b bVar) {
        this.s = bVar;
    }

    void t(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.v.j(f2);
        if (this.p != null) {
            for (int i = 0; i < this.p.a().size(); i++) {
                this.p.a().get(i).l(f2);
            }
        }
        com.airbnb.lottie.v.c.c cVar = this.q;
        if (cVar != null) {
            cVar.l(f2);
        }
        b bVar = this.r;
        if (bVar != null) {
            bVar.t(f2);
        }
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            this.u.get(i2).l(f2);
        }
    }
}
