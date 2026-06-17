package it.sephiroth.android.library.imagezoom.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class a extends Drawable {
    protected Bitmap a;
    protected Paint b;

    /* renamed from: c, reason: collision with root package name */
    protected int f10097c;

    /* renamed from: d, reason: collision with root package name */
    protected int f10098d;

    public a(Bitmap bitmap) {
        this.a = bitmap;
        this.f10097c = bitmap.getWidth();
        this.f10098d = this.a.getHeight();
        Paint paint = new Paint();
        this.b = paint;
        paint.setDither(true);
        this.b.setFilterBitmap(true);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.a, 0.0f, 0.0f, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f10098d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f10097c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f10098d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f10097c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
