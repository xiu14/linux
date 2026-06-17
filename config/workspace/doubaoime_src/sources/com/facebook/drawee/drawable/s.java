package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes2.dex */
class s extends p {
    public static final q j = new s();

    private s() {
    }

    @Override // com.facebook.drawee.drawable.p
    public void b(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
        float f6;
        float height;
        if (f5 > f4) {
            f6 = ((rect.width() - (i * f5)) * 0.5f) + rect.left;
            height = rect.top;
            f4 = f5;
        } else {
            f6 = rect.left;
            height = ((rect.height() - (i2 * f4)) * 0.5f) + rect.top;
        }
        matrix.setScale(f4, f4);
        matrix.postTranslate((int) (f6 + 0.5f), (int) (height + 0.5f));
    }

    public String toString() {
        return "center_crop";
    }
}
