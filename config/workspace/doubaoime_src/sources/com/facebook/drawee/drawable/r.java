package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes2.dex */
class r extends p {
    public static final q j = new r();

    private r() {
    }

    @Override // com.facebook.drawee.drawable.p
    public void b(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
        matrix.setTranslate((int) (((rect.width() - i) * 0.5f) + rect.left + 0.5f), (int) (((rect.height() - i2) * 0.5f) + rect.top + 0.5f));
    }

    public String toString() {
        return "center";
    }
}
