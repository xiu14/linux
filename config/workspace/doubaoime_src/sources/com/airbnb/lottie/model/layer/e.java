package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.i;

/* loaded from: classes.dex */
public class e extends b {
    e(i iVar, Layer layer) {
        super(iVar, layer);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.v.b.e
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.airbnb.lottie.model.layer.b
    void l(Canvas canvas, Matrix matrix, int i) {
    }
}
