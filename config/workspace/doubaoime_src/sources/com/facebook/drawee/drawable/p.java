package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public abstract class p implements q {
    public Matrix a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3) {
        b(matrix, rect, i, i2, f2, f3, rect.width() / i, rect.height() / i2);
        return matrix;
    }

    public abstract void b(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5);
}
