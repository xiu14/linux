package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.i;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.i.k;
import com.airbnb.lottie.v.c.n;
import com.airbnb.lottie.v.c.p;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends com.airbnb.lottie.model.layer.b {
    private final RectF A;
    private final Matrix B;
    private final Paint C;
    private final Paint D;
    private final Map<com.airbnb.lottie.model.c, List<com.airbnb.lottie.v.b.d>> E;
    private final LongSparseArray<String> F;
    private final n G;
    private final i H;
    private final com.airbnb.lottie.g I;

    /* renamed from: J, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.v.c.a<Integer, Integer> f1357J;

    @Nullable
    private com.airbnb.lottie.v.c.a<Integer, Integer> K;

    @Nullable
    private com.airbnb.lottie.v.c.a<Integer, Integer> L;

    @Nullable
    private com.airbnb.lottie.v.c.a<Integer, Integer> M;

    @Nullable
    private com.airbnb.lottie.v.c.a<Float, Float> N;

    @Nullable
    private com.airbnb.lottie.v.c.a<Float, Float> O;

    @Nullable
    private com.airbnb.lottie.v.c.a<Float, Float> P;

    @Nullable
    private com.airbnb.lottie.v.c.a<Float, Float> Q;

    @Nullable
    private com.airbnb.lottie.v.c.a<Float, Float> R;

    @Nullable
    private com.airbnb.lottie.v.c.a<Typeface, Typeface> S;
    private final StringBuilder z;

    class a extends Paint {
        a(h hVar, int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    class b extends Paint {
        b(h hVar, int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    h(i iVar, Layer layer) {
        super(iVar, layer);
        com.airbnb.lottie.model.i.b bVar;
        com.airbnb.lottie.model.i.b bVar2;
        com.airbnb.lottie.model.i.a aVar;
        com.airbnb.lottie.model.i.a aVar2;
        this.z = new StringBuilder(2);
        this.A = new RectF();
        this.B = new Matrix();
        this.C = new a(this, 1);
        this.D = new b(this, 1);
        this.E = new HashMap();
        this.F = new LongSparseArray<>();
        this.H = iVar;
        this.I = layer.a();
        n d2 = layer.q().d();
        this.G = d2;
        d2.a(this);
        i(d2);
        k r = layer.r();
        if (r != null && (aVar2 = r.a) != null) {
            com.airbnb.lottie.v.c.a<Integer, Integer> a2 = aVar2.a();
            this.f1357J = a2;
            a2.a(this);
            i(this.f1357J);
        }
        if (r != null && (aVar = r.b) != null) {
            com.airbnb.lottie.v.c.a<Integer, Integer> a3 = aVar.a();
            this.L = a3;
            a3.a(this);
            i(this.L);
        }
        if (r != null && (bVar2 = r.f1340c) != null) {
            com.airbnb.lottie.v.c.a<Float, Float> a4 = bVar2.a();
            this.N = a4;
            a4.a(this);
            i(this.N);
        }
        if (r == null || (bVar = r.f1341d) == null) {
            return;
        }
        com.airbnb.lottie.v.c.a<Float, Float> a5 = bVar.a();
        this.P = a5;
        a5.a(this);
        i(this.P);
    }

    private void v(DocumentData.Justification justification, Canvas canvas, float f2) {
        int ordinal = justification.ordinal();
        if (ordinal == 1) {
            canvas.translate(-f2, 0.0f);
        } else {
            if (ordinal != 2) {
                return;
            }
            canvas.translate((-f2) / 2.0f, 0.0f);
        }
    }

    private void w(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void x(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private List<String> y(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.v.b.e
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.I.b().width(), this.I.b().height());
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void g(T t, @Nullable com.airbnb.lottie.z.c<T> cVar) {
        this.v.c(t, cVar);
        if (t == com.airbnb.lottie.n.a) {
            com.airbnb.lottie.v.c.a<Integer, Integer> aVar = this.K;
            if (aVar != null) {
                o(aVar);
            }
            if (cVar == null) {
                this.K = null;
                return;
            }
            p pVar = new p(cVar, null);
            this.K = pVar;
            pVar.a(this);
            i(this.K);
            return;
        }
        if (t == com.airbnb.lottie.n.b) {
            com.airbnb.lottie.v.c.a<Integer, Integer> aVar2 = this.M;
            if (aVar2 != null) {
                o(aVar2);
            }
            if (cVar == null) {
                this.M = null;
                return;
            }
            p pVar2 = new p(cVar, null);
            this.M = pVar2;
            pVar2.a(this);
            i(this.M);
            return;
        }
        if (t == com.airbnb.lottie.n.q) {
            com.airbnb.lottie.v.c.a<Float, Float> aVar3 = this.O;
            if (aVar3 != null) {
                o(aVar3);
            }
            if (cVar == null) {
                this.O = null;
                return;
            }
            p pVar3 = new p(cVar, null);
            this.O = pVar3;
            pVar3.a(this);
            i(this.O);
            return;
        }
        if (t == com.airbnb.lottie.n.r) {
            com.airbnb.lottie.v.c.a<Float, Float> aVar4 = this.Q;
            if (aVar4 != null) {
                o(aVar4);
            }
            if (cVar == null) {
                this.Q = null;
                return;
            }
            p pVar4 = new p(cVar, null);
            this.Q = pVar4;
            pVar4.a(this);
            i(this.Q);
            return;
        }
        if (t == com.airbnb.lottie.n.D) {
            com.airbnb.lottie.v.c.a<Float, Float> aVar5 = this.R;
            if (aVar5 != null) {
                o(aVar5);
            }
            if (cVar == null) {
                this.R = null;
                return;
            }
            p pVar5 = new p(cVar, null);
            this.R = pVar5;
            pVar5.a(this);
            i(this.R);
            return;
        }
        if (t == com.airbnb.lottie.n.G) {
            com.airbnb.lottie.v.c.a<Typeface, Typeface> aVar6 = this.S;
            if (aVar6 != null) {
                o(aVar6);
            }
            if (cVar == null) {
                this.S = null;
                return;
            }
            p pVar6 = new p(cVar, null);
            this.S = pVar6;
            pVar6.a(this);
            i(this.S);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x034d  */
    @Override // com.airbnb.lottie.model.layer.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void l(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.h.l(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
