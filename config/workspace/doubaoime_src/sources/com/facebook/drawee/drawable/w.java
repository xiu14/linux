package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes2.dex */
class w extends p {
    public static final q j = new w();

    private w() {
    }

    @Override // com.facebook.drawee.drawable.p
    public void b(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
        float min = Math.min(f4, f5);
        float width = (rect.width() - (i * min)) + rect.left;
        float height = (rect.height() - (i2 * min)) + rect.top;
        matrix.setScale(min, min);
        matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
    }

    public String toString() {
        return "fit_end";
    }
}
