package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class g extends Drawable implements Drawable.Callback, C, B, InterfaceC0716d {
    private Drawable a;
    private final C0717e b = new C0717e();

    /* renamed from: c, reason: collision with root package name */
    protected C f6366c;

    static {
        new Matrix();
    }

    public g(Drawable drawable) {
        this.a = drawable;
        com.bytedance.feedbackerlib.a.I0(drawable, this, this);
    }

    @Override // com.facebook.drawee.drawable.B
    public void b(C c2) {
        this.f6366c = c2;
    }

    @Override // com.facebook.drawee.drawable.C
    public void d(Matrix matrix) {
        C c2 = this.f6366c;
        if (c2 != null) {
            c2.d(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC0716d
    public Drawable g(Drawable drawable) {
        return o(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.a;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.a;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // com.facebook.drawee.drawable.C
    public void h(RectF rectF) {
        C c2 = this.f6366c;
        if (c2 != null) {
            c2.h(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC0716d
    public Drawable l() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    protected void n(Matrix matrix) {
        C c2 = this.f6366c;
        if (c2 != null) {
            c2.d(matrix);
        } else {
            matrix.reset();
        }
    }

    public Drawable o(Drawable drawable) {
        Drawable drawable2 = this.a;
        com.bytedance.feedbackerlib.a.I0(drawable2, null, null);
        com.bytedance.feedbackerlib.a.I0(drawable, null, null);
        C0717e c0717e = this.b;
        if (drawable != null && c0717e != null) {
            c0717e.a(drawable);
        }
        com.bytedance.feedbackerlib.a.l(drawable, this);
        com.bytedance.feedbackerlib.a.I0(drawable, this, this);
        this.a = drawable;
        invalidateSelf();
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        return drawable == null ? super.onLevelChange(i) : drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.b(i);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.c(colorFilter);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.b.d(z);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.b.e(z);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.a;
        return drawable == null ? visible : drawable.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
