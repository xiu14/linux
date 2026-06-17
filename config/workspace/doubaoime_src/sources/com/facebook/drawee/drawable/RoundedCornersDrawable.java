package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class RoundedCornersDrawable extends g implements j {

    /* renamed from: d, reason: collision with root package name */
    Type f6350d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f6351e;

    /* renamed from: f, reason: collision with root package name */
    private RectF f6352f;

    /* renamed from: g, reason: collision with root package name */
    private Matrix f6353g;
    private final float[] h;
    final float[] i;
    final Paint j;
    private boolean k;
    private float l;
    private int m;
    private int n;
    private float o;
    private boolean p;
    private boolean q;
    private final Path r;
    private final Path s;
    private final RectF t;

    public enum Type {
        OVERLAY_COLOR,
        CLIPPING
    }

    public RoundedCornersDrawable(Drawable drawable) {
        super(drawable);
        this.f6350d = Type.OVERLAY_COLOR;
        this.f6351e = new RectF();
        this.h = new float[8];
        this.i = new float[8];
        this.j = new Paint(1);
        this.k = false;
        this.l = 0.0f;
        this.m = 0;
        this.n = 0;
        this.o = 0.0f;
        this.p = false;
        this.q = false;
        this.r = new Path();
        this.s = new Path();
        this.t = new RectF();
    }

    private void q() {
        float[] fArr;
        this.r.reset();
        this.s.reset();
        this.t.set(getBounds());
        RectF rectF = this.t;
        float f2 = this.o;
        rectF.inset(f2, f2);
        if (this.f6350d == Type.OVERLAY_COLOR) {
            this.r.addRect(this.t, Path.Direction.CW);
        }
        if (this.k) {
            this.r.addCircle(this.t.centerX(), this.t.centerY(), Math.min(this.t.width(), this.t.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.r.addRoundRect(this.t, this.h, Path.Direction.CW);
        }
        RectF rectF2 = this.t;
        float f3 = this.o;
        rectF2.inset(-f3, -f3);
        RectF rectF3 = this.t;
        float f4 = this.l;
        rectF3.inset(f4 / 2.0f, f4 / 2.0f);
        if (this.k) {
            this.s.addCircle(this.t.centerX(), this.t.centerY(), Math.min(this.t.width(), this.t.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.i;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.h[i] + this.o) - (this.l / 2.0f);
                i++;
            }
            this.s.addRoundRect(this.t, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.t;
        float f5 = this.l;
        rectF4.inset((-f5) / 2.0f, (-f5) / 2.0f);
    }

    @Override // com.facebook.drawee.drawable.j
    public void a(int i, float f2) {
        this.m = i;
        this.l = f2;
        q();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.j
    public void c(boolean z) {
        this.k = z;
        q();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f6351e.set(getBounds());
        int ordinal = this.f6350d.ordinal();
        if (ordinal == 0) {
            if (this.p) {
                RectF rectF = this.f6352f;
                if (rectF == null) {
                    this.f6352f = new RectF(this.f6351e);
                    this.f6353g = new Matrix();
                } else {
                    rectF.set(this.f6351e);
                }
                RectF rectF2 = this.f6352f;
                float f2 = this.l;
                rectF2.inset(f2, f2);
                this.f6353g.setRectToRect(this.f6351e, this.f6352f, Matrix.ScaleToFit.FILL);
                int save = canvas.save();
                canvas.clipRect(this.f6351e);
                canvas.concat(this.f6353g);
                super.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                super.draw(canvas);
            }
            this.j.setStyle(Paint.Style.FILL);
            this.j.setColor(this.n);
            this.j.setStrokeWidth(0.0f);
            this.j.setFilterBitmap(this.q);
            this.r.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.r, this.j);
            if (this.k) {
                float width = ((this.f6351e.width() - this.f6351e.height()) + this.l) / 2.0f;
                float height = ((this.f6351e.height() - this.f6351e.width()) + this.l) / 2.0f;
                if (width > 0.0f) {
                    RectF rectF3 = this.f6351e;
                    float f3 = rectF3.left;
                    canvas.drawRect(f3, rectF3.top, f3 + width, rectF3.bottom, this.j);
                    RectF rectF4 = this.f6351e;
                    float f4 = rectF4.right;
                    canvas.drawRect(f4 - width, rectF4.top, f4, rectF4.bottom, this.j);
                }
                if (height > 0.0f) {
                    RectF rectF5 = this.f6351e;
                    float f5 = rectF5.left;
                    float f6 = rectF5.top;
                    canvas.drawRect(f5, f6, rectF5.right, f6 + height, this.j);
                    RectF rectF6 = this.f6351e;
                    float f7 = rectF6.left;
                    float f8 = rectF6.bottom;
                    canvas.drawRect(f7, f8 - height, rectF6.right, f8, this.j);
                }
            }
        } else if (ordinal == 1) {
            int save2 = canvas.save();
            canvas.clipPath(this.r);
            super.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (this.m != 0) {
            this.j.setStyle(Paint.Style.STROKE);
            this.j.setColor(this.m);
            this.j.setStrokeWidth(this.l);
            this.r.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.s, this.j);
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void e(boolean z) {
        if (this.q != z) {
            this.q = z;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void f(boolean z) {
        this.p = z;
        q();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.j
    public void i(float f2) {
        this.o = f2;
        q();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.j
    public void j(float f2) {
        Arrays.fill(this.h, f2);
        q();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.j
    public void m(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.h, 0.0f);
        } else {
            e.c.c.d.h.b(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.h, 0, 8);
        }
        q();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        q();
    }

    public void p(int i) {
        this.n = i;
        invalidateSelf();
    }
}
