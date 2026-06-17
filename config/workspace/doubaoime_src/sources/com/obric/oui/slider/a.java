package com.obric.oui.slider;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a extends Drawable {
    private int a;

    public final void a(int i) {
        this.a = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        l.f(canvas, "canvas");
        Rect bounds = getBounds();
        l.e(bounds, "bounds");
        float f2 = bounds.left;
        float f3 = bounds.top;
        float f4 = bounds.bottom;
        int width = bounds.width();
        bounds.height();
        int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, 14);
        int i = this.a;
        int i2 = (width - (i * e0)) / (i + 1);
        if (i < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            float f5 = ((i2 + e0) * i3) + f2;
            RectF rectF = new RectF(f5, f3, i2 + f5, f4);
            Path path = new Path();
            float f6 = 16;
            path.addRoundRect(rectF, new float[]{e.a.a.a.a.e0("Resources.getSystem()", 1, f6), e.a.a.a.a.e0("Resources.getSystem()", 1, f6), e.a.a.a.a.e0("Resources.getSystem()", 1, f6), e.a.a.a.a.e0("Resources.getSystem()", 1, f6), e.a.a.a.a.e0("Resources.getSystem()", 1, f6), e.a.a.a.a.e0("Resources.getSystem()", 1, f6), e.a.a.a.a.e0("Resources.getSystem()", 1, f6), e.a.a.a.a.e0("Resources.getSystem()", 1, f6)}, Path.Direction.CW);
            canvas.drawPath(path, null);
            if (i3 == i) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
