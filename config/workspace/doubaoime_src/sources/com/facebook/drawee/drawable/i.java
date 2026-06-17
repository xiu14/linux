package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class i extends g {

    /* renamed from: d, reason: collision with root package name */
    final Matrix f6369d;

    /* renamed from: e, reason: collision with root package name */
    private int f6370e;

    /* renamed from: f, reason: collision with root package name */
    private int f6371f;

    /* renamed from: g, reason: collision with root package name */
    private final Matrix f6372g;
    private final RectF h;

    public i(Drawable drawable, int i, int i2) {
        super(drawable);
        this.f6372g = new Matrix();
        this.h = new RectF();
        this.f6369d = new Matrix();
        this.f6370e = i - (i % 90);
        this.f6371f = (i2 < 0 || i2 > 8) ? 0 : i2;
    }

    @Override // com.facebook.drawee.drawable.g, com.facebook.drawee.drawable.C
    public void d(Matrix matrix) {
        n(matrix);
        if (this.f6369d.isIdentity()) {
            return;
        }
        matrix.preConcat(this.f6369d);
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        if (this.f6370e <= 0 && ((i = this.f6371f) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.concat(this.f6369d);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = this.f6371f;
        return (i == 5 || i == 7 || this.f6370e % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = this.f6371f;
        return (i == 5 || i == 7 || this.f6370e % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i;
        Drawable current = getCurrent();
        int i2 = this.f6370e;
        if (i2 <= 0 && ((i = this.f6371f) == 0 || i == 1)) {
            current.setBounds(rect);
            return;
        }
        int i3 = this.f6371f;
        if (i3 == 2) {
            this.f6369d.setScale(-1.0f, 1.0f);
        } else if (i3 == 7) {
            this.f6369d.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f6369d.postScale(-1.0f, 1.0f);
        } else if (i3 == 4) {
            this.f6369d.setScale(1.0f, -1.0f);
        } else if (i3 != 5) {
            this.f6369d.setRotate(i2, rect.centerX(), rect.centerY());
        } else {
            this.f6369d.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f6369d.postScale(1.0f, -1.0f);
        }
        this.f6372g.reset();
        this.f6369d.invert(this.f6372g);
        this.h.set(rect);
        this.f6372g.mapRect(this.h);
        RectF rectF = this.h;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
