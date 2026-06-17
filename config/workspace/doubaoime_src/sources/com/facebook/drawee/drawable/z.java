package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes2.dex */
class z extends p {
    public static final q j = new z();

    private z() {
    }

    @Override // com.facebook.drawee.drawable.p
    public void b(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
        float f6;
        float max;
        if (f5 > f4) {
            float f7 = i * f5;
            f6 = Math.max(Math.min((rect.width() * 0.5f) - (f2 * f7), 0.0f), rect.width() - f7) + rect.left;
            max = rect.top;
            f4 = f5;
        } else {
            f6 = rect.left;
            float f8 = i2 * f4;
            max = Math.max(Math.min((rect.height() * 0.5f) - (f3 * f8), 0.0f), rect.height() - f8) + rect.top;
        }
        matrix.setScale(f4, f4);
        matrix.postTranslate((int) (f6 + 0.5f), (int) (max + 0.5f));
    }

    public String toString() {
        return "focus_crop";
    }
}
