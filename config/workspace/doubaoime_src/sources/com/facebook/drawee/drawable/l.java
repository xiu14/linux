package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class l extends Drawable implements j {

    /* renamed from: c, reason: collision with root package name */
    float[] f6374c;
    private int m;
    private final float[] a = new float[8];
    final float[] b = new float[8];

    /* renamed from: d, reason: collision with root package name */
    final Paint f6375d = new Paint(1);

    /* renamed from: e, reason: collision with root package name */
    private boolean f6376e = false;

    /* renamed from: f, reason: collision with root package name */
    private float f6377f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private float f6378g = 0.0f;
    private int h = 0;
    private boolean i = false;
    private boolean j = false;
    final Path k = new Path();
    final Path l = new Path();
    private final RectF n = new RectF();
    private int o = 255;

    public l(int i) {
        this.m = 0;
        if (this.m != i) {
            this.m = i;
            invalidateSelf();
        }
    }

    private void b() {
        float[] fArr;
        float[] fArr2;
        this.k.reset();
        this.l.reset();
        this.n.set(getBounds());
        RectF rectF = this.n;
        float f2 = this.f6377f;
        rectF.inset(f2 / 2.0f, f2 / 2.0f);
        int i = 0;
        if (this.f6376e) {
            this.l.addCircle(this.n.centerX(), this.n.centerY(), Math.min(this.n.width(), this.n.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.b;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.a[i2] + this.f6378g) - (this.f6377f / 2.0f);
                i2++;
            }
            this.l.addRoundRect(this.n, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.n;
        float f3 = this.f6377f;
        rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
        float f4 = this.f6378g + (this.i ? this.f6377f : 0.0f);
        this.n.inset(f4, f4);
        if (this.f6376e) {
            this.k.addCircle(this.n.centerX(), this.n.centerY(), Math.min(this.n.width(), this.n.height()) / 2.0f, Path.Direction.CW);
        } else if (this.i) {
            if (this.f6374c == null) {
                this.f6374c = new float[8];
            }
            while (true) {
                fArr2 = this.f6374c;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = this.a[i] - this.f6377f;
                i++;
            }
            this.k.addRoundRect(this.n, fArr2, Path.Direction.CW);
        } else {
            this.k.addRoundRect(this.n, this.a, Path.Direction.CW);
        }
        float f5 = -f4;
        this.n.inset(f5, f5);
    }

    @Override // com.facebook.drawee.drawable.j
    public void a(int i, float f2) {
        if (this.h != i) {
            this.h = i;
            invalidateSelf();
        }
        if (this.f6377f != f2) {
            this.f6377f = f2;
            b();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void c(boolean z) {
        this.f6376e = z;
        b();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f6375d.setColor(com.bytedance.feedbackerlib.a.n0(this.m, this.o));
        this.f6375d.setStyle(Paint.Style.FILL);
        this.f6375d.setFilterBitmap(this.j);
        canvas.drawPath(this.k, this.f6375d);
        if (this.f6377f != 0.0f) {
            this.f6375d.setColor(com.bytedance.feedbackerlib.a.n0(this.h, this.o));
            this.f6375d.setStyle(Paint.Style.STROKE);
            this.f6375d.setStrokeWidth(this.f6377f);
            canvas.drawPath(this.l, this.f6375d);
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void e(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void f(boolean z) {
        if (this.i != z) {
            this.i = z;
            b();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int n0 = com.bytedance.feedbackerlib.a.n0(this.m, this.o) >>> 24;
        if (n0 == 255) {
            return -1;
        }
        return n0 == 0 ? -2 : -3;
    }

    @Override // com.facebook.drawee.drawable.j
    public void i(float f2) {
        if (this.f6378g != f2) {
            this.f6378g = f2;
            b();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void j(float f2) {
        e.c.c.d.h.b(f2 >= 0.0f, "radius should be non negative");
        Arrays.fill(this.a, f2);
        b();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.j
    public void m(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.a, 0.0f);
        } else {
            e.c.c.d.h.b(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.a, 0, 8);
        }
        b();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.o) {
            this.o = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
