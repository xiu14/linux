package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class k extends m {
    private final Paint D;
    private final Paint E;

    /* renamed from: J, reason: collision with root package name */
    private final Bitmap f6373J;
    private WeakReference<Bitmap> K;

    public k(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.D = paint2;
        Paint paint3 = new Paint(1);
        this.E = paint3;
        this.f6373J = bitmap;
        if ((this.a instanceof BitmapDrawable) && bitmap != null) {
            int density = bitmap.getDensity();
            int i = DisplayMetrics.DENSITY_DEVICE_STABLE;
            if (density == i) {
                ((BitmapDrawable) this.a).setTargetDensity(i);
            }
        }
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // com.facebook.drawee.drawable.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        e.c.h.m.b.b();
        if (!(super.g() && this.f6373J != null)) {
            super.draw(canvas);
            e.c.h.m.b.b();
            return;
        }
        k();
        h();
        WeakReference<Bitmap> weakReference = this.K;
        if (weakReference == null || weakReference.get() != this.f6373J) {
            this.K = new WeakReference<>(this.f6373J);
            this.D.setFilterBitmap(true);
            Paint paint = this.D;
            Bitmap bitmap = this.f6373J;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f6382f = true;
        }
        if (this.f6382f) {
            this.D.getShader().setLocalMatrix(this.x);
            this.f6382f = false;
        }
        this.D.setFilterBitmap(d());
        int save = canvas.save();
        canvas.concat(this.u);
        canvas.drawPath(this.f6381e, this.D);
        float f2 = this.f6380d;
        if (f2 > 0.0f) {
            this.E.setStrokeWidth(f2);
            this.E.setColor(com.bytedance.feedbackerlib.a.n0(this.f6383g, this.D.getAlpha()));
            canvas.drawPath(this.h, this.E);
        }
        canvas.restoreToCount(save);
        e.c.h.m.b.b();
    }

    @Override // com.facebook.drawee.drawable.m
    boolean g() {
        return super.g() && this.f6373J != null;
    }

    @Override // com.facebook.drawee.drawable.m, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Bitmap bitmap = this.f6373J;
        return bitmap != null ? bitmap.getHeight() : super.getIntrinsicHeight();
    }

    @Override // com.facebook.drawee.drawable.m, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Bitmap bitmap = this.f6373J;
        return bitmap != null ? bitmap.getWidth() : super.getIntrinsicWidth();
    }

    @Override // com.facebook.drawee.drawable.m, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
        if (i != this.D.getAlpha()) {
            this.D.setAlpha(i);
            this.a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.m, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.D.setColorFilter(colorFilter);
    }
}
