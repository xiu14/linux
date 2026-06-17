package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes2.dex */
class t extends p {
    public static final q j = new t();

    private t() {
    }

    @Override // com.facebook.drawee.drawable.p
    public void b(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
        float min = Math.min(Math.min(f4, f5), 1.0f);
        float width = ((rect.width() - (i * min)) * 0.5f) + rect.left;
        float height = ((rect.height() - (i2 * min)) * 0.5f) + rect.top;
        matrix.setScale(min, min);
        matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
    }

    public String toString() {
        return "center_inside";
    }
}
