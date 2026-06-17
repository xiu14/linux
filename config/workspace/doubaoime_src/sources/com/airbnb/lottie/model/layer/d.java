package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.i;
import com.airbnb.lottie.n;
import com.airbnb.lottie.v.c.p;

/* loaded from: classes.dex */
public class d extends b {
    private final Rect A;
    private final Rect B;

    @Nullable
    private com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> C;

    @Nullable
    private com.airbnb.lottie.v.c.a<Bitmap, Bitmap> D;
    private final Paint z;

    d(i iVar, Layer layer) {
        super(iVar, layer);
        this.z = new com.airbnb.lottie.v.a(3);
        this.A = new Rect();
        this.B = new Rect();
    }

    @Nullable
    private Bitmap v() {
        Bitmap g2;
        com.airbnb.lottie.v.c.a<Bitmap, Bitmap> aVar = this.D;
        return (aVar == null || (g2 = aVar.g()) == null) ? this.n.l(this.o.k()) : g2;
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.v.b.e
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        if (v() != null) {
            rectF.set(0.0f, 0.0f, com.airbnb.lottie.y.h.c() * r3.getWidth(), com.airbnb.lottie.y.h.c() * r3.getHeight());
            this.m.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void g(T t, @Nullable com.airbnb.lottie.z.c<T> cVar) {
        this.v.c(t, cVar);
        if (t == n.E) {
            if (cVar == null) {
                this.C = null;
                return;
            } else {
                this.C = new p(cVar, null);
                return;
            }
        }
        if (t == n.H) {
            if (cVar == null) {
                this.D = null;
            } else {
                this.D = new p(cVar, null);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void l(@NonNull Canvas canvas, Matrix matrix, int i) {
        Bitmap v = v();
        if (v == null || v.isRecycled()) {
            return;
        }
        float c2 = com.airbnb.lottie.y.h.c();
        this.z.setAlpha(i);
        com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> aVar = this.C;
        if (aVar != null) {
            this.z.setColorFilter(aVar.g());
        }
        canvas.save();
        canvas.concat(matrix);
        this.A.set(0, 0, v.getWidth(), v.getHeight());
        this.B.set(0, 0, (int) (v.getWidth() * c2), (int) (v.getHeight() * c2));
        canvas.drawBitmap(v, this.A, this.B, this.z);
        canvas.restore();
    }
}
