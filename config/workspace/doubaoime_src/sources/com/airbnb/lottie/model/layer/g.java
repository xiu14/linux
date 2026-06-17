package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.i;
import com.airbnb.lottie.n;
import com.airbnb.lottie.v.c.p;

/* loaded from: classes.dex */
public class g extends b {
    private final Paint A;
    private final float[] B;
    private final Path C;
    private final Layer D;

    @Nullable
    private com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> E;
    private final RectF z;

    g(i iVar, Layer layer) {
        super(iVar, layer);
        this.z = new RectF();
        com.airbnb.lottie.v.a aVar = new com.airbnb.lottie.v.a();
        this.A = aVar;
        this.B = new float[8];
        this.C = new Path();
        this.D = layer;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(layer.m());
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.v.b.e
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        this.z.set(0.0f, 0.0f, this.D.o(), this.D.n());
        this.m.mapRect(this.z);
        rectF.set(this.z);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void g(T t, @Nullable com.airbnb.lottie.z.c<T> cVar) {
        this.v.c(t, cVar);
        if (t == n.E) {
            if (cVar == null) {
                this.E = null;
            } else {
                this.E = new p(cVar, null);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void l(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.D.m());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((((alpha / 255.0f) * (this.v.h() == null ? 100 : this.v.h().g().intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        this.A.setAlpha(intValue);
        com.airbnb.lottie.v.c.a<ColorFilter, ColorFilter> aVar = this.E;
        if (aVar != null) {
            this.A.setColorFilter(aVar.g());
        }
        if (intValue > 0) {
            float[] fArr = this.B;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.D.o();
            float[] fArr2 = this.B;
            fArr2[3] = 0.0f;
            fArr2[4] = this.D.o();
            this.B[5] = this.D.n();
            float[] fArr3 = this.B;
            fArr3[6] = 0.0f;
            fArr3[7] = this.D.n();
            matrix.mapPoints(this.B);
            this.C.reset();
            Path path = this.C;
            float[] fArr4 = this.B;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.C;
            float[] fArr5 = this.B;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.C;
            float[] fArr6 = this.B;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.C;
            float[] fArr7 = this.B;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.C;
            float[] fArr8 = this.B;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.C.close();
            canvas.drawPath(this.C, this.A);
        }
    }
}
