package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Objects;

/* renamed from: com.facebook.drawee.drawable.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0714b extends Drawable implements Drawable.Callback, C, B {
    private C a;

    /* renamed from: c, reason: collision with root package name */
    private final Drawable[] f6354c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0716d[] f6355d;
    private final C0717e b = new C0717e();

    /* renamed from: e, reason: collision with root package name */
    private final Rect f6356e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    private boolean f6357f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6358g = false;
    private boolean h = false;

    public C0714b(Drawable[] drawableArr) {
        int i = 0;
        Objects.requireNonNull(drawableArr);
        this.f6354c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f6354c;
            if (i >= drawableArr2.length) {
                this.f6355d = new InterfaceC0716d[drawableArr2.length];
                return;
            } else {
                com.bytedance.feedbackerlib.a.I0(drawableArr2[i], this, this);
                i++;
            }
        }
    }

    public Drawable a(int i) {
        e.c.c.d.h.a(i >= 0);
        e.c.c.d.h.a(i < this.f6354c.length);
        return this.f6354c[i];
    }

    @Override // com.facebook.drawee.drawable.B
    public void b(C c2) {
        this.a = c2;
    }

    public InterfaceC0716d c(int i) {
        e.c.c.d.h.a(i >= 0);
        e.c.c.d.h.a(i < this.f6355d.length);
        InterfaceC0716d[] interfaceC0716dArr = this.f6355d;
        if (interfaceC0716dArr[i] == null) {
            interfaceC0716dArr[i] = new C0713a(this, i);
        }
        return interfaceC0716dArr[i];
    }

    @Override // com.facebook.drawee.drawable.C
    public void d(Matrix matrix) {
        C c2 = this.a;
        if (c2 != null) {
            c2.d(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6354c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.draw(canvas);
            }
            i++;
        }
    }

    public int e() {
        return this.f6354c.length;
    }

    public Drawable f(int i, Drawable drawable) {
        e.c.c.d.h.a(i >= 0);
        e.c.c.d.h.a(i < this.f6354c.length);
        Drawable drawable2 = this.f6354c[i];
        if (drawable != drawable2) {
            if (drawable != null && this.h) {
                drawable.mutate();
            }
            com.bytedance.feedbackerlib.a.I0(this.f6354c[i], null, null);
            com.bytedance.feedbackerlib.a.I0(drawable, null, null);
            C0717e c0717e = this.b;
            if (drawable != null && c0717e != null) {
                c0717e.a(drawable);
            }
            com.bytedance.feedbackerlib.a.l(drawable, this);
            com.bytedance.feedbackerlib.a.I0(drawable, this, this);
            this.f6358g = false;
            this.f6354c[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f6354c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f6354c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f6354c.length == 0) {
            return -2;
        }
        int i = -1;
        int i2 = 1;
        while (true) {
            Drawable[] drawableArr = this.f6354c;
            if (i2 >= drawableArr.length) {
                return i;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f6356e;
        while (true) {
            Drawable[] drawableArr = this.f6354c;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    @Override // com.facebook.drawee.drawable.C
    public void h(RectF rectF) {
        C c2 = this.a;
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
        if (!this.f6358g) {
            this.f6357f = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.f6354c;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f6357f;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f6357f = z2 | z;
                i++;
            }
            this.f6358g = true;
        }
        return this.f6357f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6354c;
            if (i >= drawableArr.length) {
                this.h = true;
                return this;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.mutate();
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6354c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f6354c;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f6354c;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.b(i);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f6354c;
            if (i2 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                drawable.setAlpha(i);
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.c(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6354c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.b.d(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6354c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setDither(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.b.e(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6354c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f2, float f3) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6354c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setHotspot(f2, f3);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6354c;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
