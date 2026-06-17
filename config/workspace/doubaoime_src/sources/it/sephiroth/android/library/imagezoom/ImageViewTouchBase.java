package it.sephiroth.android.library.imagezoom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class ImageViewTouchBase extends ImageView {
    protected it.sephiroth.android.library.easing.a a;
    protected Matrix b;

    /* renamed from: c, reason: collision with root package name */
    protected Matrix f10079c;

    /* renamed from: d, reason: collision with root package name */
    protected Matrix f10080d;

    /* renamed from: e, reason: collision with root package name */
    protected Handler f10081e;

    /* renamed from: f, reason: collision with root package name */
    protected Runnable f10082f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f10083g;
    private float h;
    private float i;
    private boolean j;
    private boolean k;
    protected final Matrix l;
    protected final float[] m;
    private int n;
    private int o;
    private PointF p;
    protected DisplayType q;
    private boolean r;
    private boolean s;
    protected RectF t;
    protected RectF u;
    protected RectF v;
    private c w;
    private d x;

    public enum DisplayType {
        NONE,
        FIT_TO_SCREEN,
        FIT_IF_BIGGER
    }

    class a implements Runnable {
        final /* synthetic */ Drawable a;
        final /* synthetic */ Matrix b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f10084c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f10085d;

        a(Drawable drawable, Matrix matrix, float f2, float f3) {
            this.a = drawable;
            this.b = matrix;
            this.f10084c = f2;
            this.f10085d = f3;
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageViewTouchBase.this.setImageDrawable(this.a, this.b, this.f10084c, this.f10085d);
        }
    }

    class b implements Runnable {
        final /* synthetic */ float a;
        final /* synthetic */ long b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f10087c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f10088d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f10089e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f10090f;

        b(float f2, long j, float f3, float f4, float f5, float f6) {
            this.a = f2;
            this.b = j;
            this.f10087c = f3;
            this.f10088d = f4;
            this.f10089e = f5;
            this.f10090f = f6;
        }

        @Override // java.lang.Runnable
        public void run() {
            double d2;
            float min = Math.min(this.a, System.currentTimeMillis() - this.b);
            it.sephiroth.android.library.easing.a aVar = ImageViewTouchBase.this.a;
            double d3 = this.f10087c;
            double d4 = this.a;
            Objects.requireNonNull(aVar);
            double d5 = min / (d4 / 2.0d);
            double d6 = d3 / 2.0d;
            if (d5 < 1.0d) {
                d2 = (d6 * d5 * d5 * d5) + 0.0d;
            } else {
                double d7 = d5 - 2.0d;
                d2 = (((d7 * d7 * d7) + 2.0d) * d6) + 0.0d;
            }
            ImageViewTouchBase.this.s(this.f10088d + ((float) d2), this.f10089e, this.f10090f);
            if (min < this.a) {
                ImageViewTouchBase.this.f10081e.post(this);
                return;
            }
            ImageViewTouchBase imageViewTouchBase = ImageViewTouchBase.this;
            imageViewTouchBase.m(imageViewTouchBase.i());
            ImageViewTouchBase.this.b(true, true);
        }
    }

    public interface c {
        void a(Drawable drawable);
    }

    public interface d {
        void a(boolean z, int i, int i2, int i3, int i4);
    }

    public ImageViewTouchBase(Context context) {
        this(context, null);
    }

    protected void a(Drawable drawable, Matrix matrix, float f2, float f3) {
        if (drawable != null) {
            super.setImageDrawable(drawable);
        } else {
            this.b.reset();
            super.setImageDrawable(null);
        }
        if (f2 == -1.0f || f3 == -1.0f) {
            this.i = -1.0f;
            this.h = -1.0f;
            this.k = false;
            this.j = false;
        } else {
            float min = Math.min(f2, f3);
            float max = Math.max(min, f3);
            this.i = min;
            this.h = max;
            this.k = true;
            this.j = true;
            DisplayType displayType = this.q;
            if (displayType == DisplayType.FIT_TO_SCREEN || displayType == DisplayType.FIT_IF_BIGGER) {
                if (min >= 1.0f) {
                    this.k = false;
                    this.i = -1.0f;
                }
                if (max <= 1.0f) {
                    this.j = true;
                    this.h = -1.0f;
                }
            }
        }
        if (matrix != null) {
            this.f10080d = new Matrix(matrix);
        }
        this.s = true;
        requestLayout();
    }

    protected void b(boolean z, boolean z2) {
        if (getDrawable() == null) {
            return;
        }
        RectF d2 = d(this.f10079c, z, z2);
        float f2 = d2.left;
        if (f2 == 0.0f && d2.top == 0.0f) {
            return;
        }
        o(f2, d2.top);
    }

    protected RectF c(Matrix matrix) {
        if (getDrawable() == null) {
            return null;
        }
        this.l.set(this.b);
        this.l.postConcat(matrix);
        Matrix matrix2 = this.l;
        this.t.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrix2.mapRect(this.t);
        return this.t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r7 < r8) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected android.graphics.RectF d(android.graphics.Matrix r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.getDrawable()
            r1 = 0
            if (r0 != 0) goto Ld
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>(r1, r1, r1, r1)
            return r7
        Ld:
            android.graphics.RectF r0 = r6.u
            r0.set(r1, r1, r1, r1)
            android.graphics.RectF r7 = r6.c(r7)
            float r0 = r7.height()
            float r2 = r7.width()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r9 == 0) goto L41
            int r9 = r6.o
            float r4 = (float) r9
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 >= 0) goto L2f
            float r4 = r4 - r0
            float r4 = r4 / r3
            float r9 = r7.top
            float r4 = r4 - r9
            goto L42
        L2f:
            float r0 = r7.top
            int r5 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r5 <= 0) goto L37
            float r4 = -r0
            goto L42
        L37:
            float r0 = r7.bottom
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L41
            float r9 = (float) r9
            float r4 = r9 - r0
            goto L42
        L41:
            r4 = r1
        L42:
            if (r8 == 0) goto L60
            int r8 = r6.n
            float r8 = (float) r8
            int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r9 >= 0) goto L51
            float r8 = r8 - r2
            float r8 = r8 / r3
            float r7 = r7.left
        L4f:
            float r8 = r8 - r7
            goto L61
        L51:
            float r9 = r7.left
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L59
            float r8 = -r9
            goto L61
        L59:
            float r7 = r7.right
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 >= 0) goto L60
            goto L4f
        L60:
            r8 = r1
        L61:
            android.graphics.RectF r7 = r6.u
            r7.set(r8, r4, r1, r1)
            android.graphics.RectF r7 = r6.u
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.imagezoom.ImageViewTouchBase.d(android.graphics.Matrix, boolean, boolean):android.graphics.RectF");
    }

    protected float e(DisplayType displayType) {
        if (displayType == DisplayType.FIT_TO_SCREEN) {
            return 1.0f;
        }
        return displayType == DisplayType.FIT_IF_BIGGER ? Math.min(1.0f, 1.0f / j(this.b)) : 1.0f / j(this.b);
    }

    public Matrix f() {
        Matrix matrix = this.f10079c;
        this.l.set(this.b);
        this.l.postConcat(matrix);
        return this.l;
    }

    public float g() {
        if (this.h == -1.0f) {
            this.h = getDrawable() == null ? 1.0f : Math.max(r0.getIntrinsicWidth() / this.n, r0.getIntrinsicHeight() / this.o) * 8.0f;
        }
        return this.h;
    }

    @Override // android.view.View
    @SuppressLint({"Override"})
    public float getRotation() {
        return 0.0f;
    }

    public float h() {
        if (this.i == -1.0f) {
            this.i = getDrawable() != null ? Math.min(1.0f, 1.0f / j(this.b)) : 1.0f;
        }
        return this.i;
    }

    public float i() {
        return j(this.f10079c);
    }

    protected float j(Matrix matrix) {
        matrix.getValues(this.m);
        return this.m[0];
    }

    protected void k(Context context, AttributeSet attributeSet, int i) {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    protected void l() {
    }

    protected void m(float f2) {
    }

    protected void n(double d2, double d3) {
        RectF c2 = c(this.f10079c);
        this.v.set((float) d2, (float) d3, 0.0f, 0.0f);
        RectF rectF = this.v;
        if (c2 != null) {
            if (c2.top >= 0.0f && c2.bottom <= this.o) {
                rectF.top = 0.0f;
            }
            if (c2.left >= 0.0f && c2.right <= this.n) {
                rectF.left = 0.0f;
            }
            if (rectF.top + c2.top >= 0.0f && c2.bottom > this.o) {
                rectF.top = (int) (0.0f - r4);
            }
            if (rectF.top + c2.bottom <= this.o + 0 && c2.top < 0.0f) {
                rectF.top = (int) (r1 - r4);
            }
            if (rectF.left + c2.left >= 0.0f) {
                rectF.left = (int) (0.0f - r4);
            }
            if (rectF.left + c2.right <= this.n + 0) {
                rectF.left = (int) (r6 - r4);
            }
        }
        o(rectF.left, rectF.top);
        b(true, true);
    }

    protected void o(float f2, float f3) {
        if (f2 == 0.0f && f3 == 0.0f) {
            return;
        }
        this.f10079c.postTranslate(f2, f3);
        setImageMatrix(f());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.imagezoom.ImageViewTouchBase.onLayout(boolean, int, int, int, int):void");
    }

    public void p() {
        this.f10079c = new Matrix();
        float e2 = e(this.q);
        setImageMatrix(f());
        if (e2 != i()) {
            q(e2);
        }
        postInvalidate();
    }

    protected void q(float f2) {
        if (f2 > g()) {
            f2 = g();
        }
        if (f2 < h()) {
            f2 = h();
        }
        PointF pointF = this.p;
        s(f2, pointF.x, pointF.y);
    }

    public void r(float f2, float f3) {
        PointF pointF = this.p;
        t(f2, pointF.x, pointF.y, f3);
    }

    protected void s(float f2, float f3, float f4) {
        if (f2 > g()) {
            f2 = g();
        }
        float i = f2 / i();
        this.f10079c.postScale(i, i, f3, f4);
        setImageMatrix(f());
        i();
        l();
        b(true, true);
    }

    public void setDisplayType(DisplayType displayType) {
        if (displayType != this.q) {
            this.f10083g = false;
            this.q = displayType;
            this.r = true;
            requestLayout();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap, null, -1.0f, -1.0f);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setImageDrawable(drawable, null, -1.0f, -1.0f);
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        Matrix imageMatrix = getImageMatrix();
        if ((matrix != null || imageMatrix.isIdentity()) && (matrix == null || imageMatrix.equals(matrix))) {
        }
        super.setImageMatrix(matrix);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        setImageDrawable(getContext().getResources().getDrawable(i));
    }

    public void setOnDrawableChangedListener(c cVar) {
        this.w = cVar;
    }

    public void setOnLayoutChangeListener(d dVar) {
        this.x = dVar;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("ImageViewTouchBase", "Unsupported scaletype. Only MATRIX can be used");
        }
    }

    protected void t(float f2, float f3, float f4, float f5) {
        if (f2 > g()) {
            f2 = g();
        }
        long currentTimeMillis = System.currentTimeMillis();
        float i = i();
        Matrix matrix = new Matrix(this.f10079c);
        matrix.postScale(f2, f2, f3, f4);
        RectF d2 = d(matrix, true, true);
        this.f10081e.post(new b(f5, currentTimeMillis, f2 - i, i, (d2.left * f2) + f3, (d2.top * f2) + f4));
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setImageBitmap(Bitmap bitmap, Matrix matrix, float f2, float f3) {
        if (bitmap != null) {
            setImageDrawable(new it.sephiroth.android.library.imagezoom.b.a(bitmap), matrix, f2, f3);
        } else {
            setImageDrawable(null, matrix, f2, f3);
        }
    }

    public void setImageDrawable(Drawable drawable, Matrix matrix, float f2, float f3) {
        if (getWidth() <= 0) {
            this.f10082f = new a(drawable, matrix, f2, f3);
        } else {
            a(drawable, matrix, f2, f3);
        }
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new it.sephiroth.android.library.easing.a();
        this.b = new Matrix();
        this.f10079c = new Matrix();
        this.f10081e = new Handler();
        this.f10082f = null;
        this.f10083g = false;
        this.h = -1.0f;
        this.i = -1.0f;
        this.l = new Matrix();
        this.m = new float[9];
        this.n = -1;
        this.o = -1;
        this.p = new PointF();
        this.q = DisplayType.NONE;
        this.t = new RectF();
        this.u = new RectF();
        this.v = new RectF();
        k(context, attributeSet, i);
    }
}
