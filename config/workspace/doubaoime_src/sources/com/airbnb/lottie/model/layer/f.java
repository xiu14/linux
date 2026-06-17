package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.airbnb.lottie.i;
import com.airbnb.lottie.model.content.j;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class f extends b {
    private final com.airbnb.lottie.v.b.d z;

    f(i iVar, Layer layer) {
        super(iVar, layer);
        com.airbnb.lottie.v.b.d dVar = new com.airbnb.lottie.v.b.d(iVar, this, new j("__container", layer.l(), false));
        this.z = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.v.b.e
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        this.z.d(rectF, this.m, z);
    }

    @Override // com.airbnb.lottie.model.layer.b
    void l(@NonNull Canvas canvas, Matrix matrix, int i) {
        this.z.f(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.model.layer.b
    protected void p(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        this.z.c(dVar, i, list, dVar2);
    }
}
