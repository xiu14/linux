package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class h extends g {

    /* renamed from: d, reason: collision with root package name */
    private int f6367d;

    /* renamed from: e, reason: collision with root package name */
    private int f6368e;

    private void p() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f6367d = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f6368e = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
    }

    @Override // com.facebook.drawee.drawable.g, com.facebook.drawee.drawable.C
    public void d(Matrix matrix) {
        super.d(matrix);
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f6367d != getCurrent().getIntrinsicWidth() || this.f6368e != getCurrent().getIntrinsicHeight()) {
            p();
        }
        super.draw(canvas);
    }

    @Override // com.facebook.drawee.drawable.g
    public Drawable o(Drawable drawable) {
        Drawable o = super.o(drawable);
        p();
        return o;
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        p();
    }
}
