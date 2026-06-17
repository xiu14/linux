package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class m extends Drawable implements j, B {

    @Nullable
    private C C;
    protected final Drawable a;

    @Nullable
    float[] k;

    @Nullable
    RectF p;

    @Nullable
    Matrix v;

    @Nullable
    Matrix w;
    protected boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f6379c = false;

    /* renamed from: d, reason: collision with root package name */
    protected float f6380d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    protected final Path f6381e = new Path();

    /* renamed from: f, reason: collision with root package name */
    protected boolean f6382f = true;

    /* renamed from: g, reason: collision with root package name */
    protected int f6383g = 0;
    protected final Path h = new Path();
    private final float[] i = new float[8];
    final float[] j = new float[8];
    final RectF l = new RectF();
    final RectF m = new RectF();
    final RectF n = new RectF();
    final RectF o = new RectF();
    final Matrix q = new Matrix();
    final Matrix r = new Matrix();
    final Matrix s = new Matrix();
    final Matrix t = new Matrix();
    final Matrix u = new Matrix();
    final Matrix x = new Matrix();
    private float y = 0.0f;
    private boolean z = false;
    private boolean A = false;
    private boolean B = true;

    m(Drawable drawable) {
        this.a = drawable;
    }

    @Override // com.facebook.drawee.drawable.j
    public void a(int i, float f2) {
        if (this.f6383g == i && this.f6380d == f2) {
            return;
        }
        this.f6383g = i;
        this.f6380d = f2;
        this.B = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.B
    public void b(@Nullable C c2) {
        this.C = c2;
    }

    @Override // com.facebook.drawee.drawable.j
    public void c(boolean z) {
        this.b = z;
        this.B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.a.clearColorFilter();
    }

    public boolean d() {
        return this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        e.c.h.m.b.b();
        this.a.draw(canvas);
        e.c.h.m.b.b();
    }

    @Override // com.facebook.drawee.drawable.j
    public void e(boolean z) {
        if (this.A != z) {
            this.A = z;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void f(boolean z) {
        if (this.z != z) {
            this.z = z;
            this.B = true;
            invalidateSelf();
        }
    }

    boolean g() {
        return this.b || this.f6379c || this.f6380d > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 19)
    public int getAlpha() {
        return this.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    @RequiresApi(api = 21)
    public ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a.getOpacity();
    }

    protected void h() {
        float[] fArr;
        if (this.B) {
            this.h.reset();
            RectF rectF = this.l;
            float f2 = this.f6380d;
            rectF.inset(f2 / 2.0f, f2 / 2.0f);
            if (this.b) {
                this.h.addCircle(this.l.centerX(), this.l.centerY(), Math.min(this.l.width(), this.l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.j;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.i[i] + this.y) - (this.f6380d / 2.0f);
                    i++;
                }
                this.h.addRoundRect(this.l, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.l;
            float f3 = this.f6380d;
            rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
            this.f6381e.reset();
            float f4 = this.y + (this.z ? this.f6380d : 0.0f);
            this.l.inset(f4, f4);
            if (this.b) {
                this.f6381e.addCircle(this.l.centerX(), this.l.centerY(), Math.min(this.l.width(), this.l.height()) / 2.0f, Path.Direction.CW);
            } else if (this.z) {
                if (this.k == null) {
                    this.k = new float[8];
                }
                for (int i2 = 0; i2 < this.j.length; i2++) {
                    this.k[i2] = this.i[i2] - this.f6380d;
                }
                this.f6381e.addRoundRect(this.l, this.k, Path.Direction.CW);
            } else {
                this.f6381e.addRoundRect(this.l, this.i, Path.Direction.CW);
            }
            float f5 = -f4;
            this.l.inset(f5, f5);
            this.f6381e.setFillType(Path.FillType.WINDING);
            this.B = false;
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void i(float f2) {
        if (this.y != f2) {
            this.y = f2;
            this.B = true;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.j
    public void j(float f2) {
        e.c.c.d.h.f(f2 >= 0.0f);
        Arrays.fill(this.i, f2);
        this.f6379c = f2 != 0.0f;
        this.B = true;
        invalidateSelf();
    }

    protected void k() {
        Matrix matrix;
        C c2 = this.C;
        if (c2 != null) {
            c2.d(this.s);
            this.C.h(this.l);
        } else {
            this.s.reset();
            this.l.set(getBounds());
        }
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            this.n.set(0.0f, 0.0f, r0.getBitmap().getWidth(), r0.getBitmap().getHeight());
            this.o.set(((BitmapDrawable) drawable).getBounds());
        } else {
            this.n.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            this.o.set(this.a.getBounds());
        }
        this.q.setRectToRect(this.n, this.o, Matrix.ScaleToFit.FILL);
        if (this.z) {
            RectF rectF = this.p;
            if (rectF == null) {
                this.p = new RectF(this.l);
            } else {
                rectF.set(this.l);
            }
            RectF rectF2 = this.p;
            float f2 = this.f6380d;
            rectF2.inset(f2, f2);
            if (this.v == null) {
                this.v = new Matrix();
            }
            this.v.setRectToRect(this.l, this.p, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.v;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.s.equals(this.t) || !this.q.equals(this.r) || ((matrix = this.v) != null && !matrix.equals(this.w))) {
            this.f6382f = true;
            this.s.invert(this.u);
            this.x.set(this.s);
            if (this.z) {
                this.x.postConcat(this.v);
            }
            this.x.preConcat(this.q);
            this.t.set(this.s);
            this.r.set(this.q);
            if (this.z) {
                Matrix matrix3 = this.w;
                if (matrix3 == null) {
                    this.w = new Matrix(this.v);
                } else {
                    matrix3.set(this.v);
                }
            } else {
                Matrix matrix4 = this.w;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (this.l.equals(this.m)) {
            return;
        }
        this.B = true;
        this.m.set(this.l);
    }

    @Override // com.facebook.drawee.drawable.j
    public void m(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.i, 0.0f);
            this.f6379c = false;
        } else {
            e.c.c.d.h.b(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.i, 0, 8);
            this.f6379c = false;
            for (int i = 0; i < 8; i++) {
                this.f6379c |= fArr[i] > 0.0f;
            }
        }
        this.B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, @NonNull PorterDuff.Mode mode) {
        this.a.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
