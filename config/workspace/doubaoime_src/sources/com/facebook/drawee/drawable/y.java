package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes2.dex */
class y extends p {
    public static final q j = new y();

    private y() {
    }

    @Override // com.facebook.drawee.drawable.p
    public void b(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
        float f6 = rect.left;
        float f7 = rect.top;
        matrix.setScale(f4, f5);
        matrix.postTranslate((int) (f6 + 0.5f), (int) (f7 + 0.5f));
    }

    public String toString() {
        return "fit_xy";
    }
}
