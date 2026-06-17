package com.obric.oui.avatar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public class OCircleImageView extends AppCompatImageView {
    private static final ImageView.ScaleType v = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config w = Bitmap.Config.ARGB_8888;
    private final RectF a;
    private final RectF b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f7616c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f7617d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f7618e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f7619f;

    /* renamed from: g, reason: collision with root package name */
    private int f7620g;
    private int h;
    private int i;
    private int j;
    private Bitmap k;
    private Canvas l;
    private float m;
    private float n;
    private ColorFilter o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;

    @RequiresApi(api = 21)
    private class b extends ViewOutlineProvider {
        b(a aVar) {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (OCircleImageView.this.t) {
                ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
                return;
            }
            Rect rect = new Rect();
            OCircleImageView.this.b.roundOut(rect);
            outline.setRoundRect(rect, rect.width() / 2.0f);
        }
    }

    public OCircleImageView(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.f7616c = new Matrix();
        this.f7617d = new Paint();
        this.f7618e = new Paint();
        this.f7619f = new Paint();
        this.f7620g = ViewCompat.MEASURED_STATE_MASK;
        this.h = 0;
        this.i = 0;
        this.j = 255;
        i();
    }

    private void i() {
        this.p = true;
        super.setScaleType(v);
        this.f7617d.setAntiAlias(true);
        this.f7617d.setDither(true);
        this.f7617d.setFilterBitmap(true);
        this.f7617d.setAlpha(this.j);
        this.f7617d.setColorFilter(this.o);
        this.f7618e.setStyle(Paint.Style.STROKE);
        this.f7618e.setAntiAlias(true);
        this.f7618e.setColor(this.f7620g);
        this.f7618e.setStrokeWidth(this.h);
        this.f7619f.setStyle(Paint.Style.FILL);
        this.f7619f.setAntiAlias(true);
        this.f7619f.setColor(this.i);
        setOutlineProvider(new b(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j() {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.getDrawable()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L49
        L9:
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 == 0) goto L14
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            goto L49
        L14:
            boolean r2 = r0 instanceof android.graphics.drawable.ColorDrawable     // Catch: java.lang.Exception -> L44
            if (r2 == 0) goto L20
            android.graphics.Bitmap$Config r2 = com.obric.oui.avatar.OCircleImageView.w     // Catch: java.lang.Exception -> L44
            r3 = 2
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r3, r3, r2)     // Catch: java.lang.Exception -> L44
            goto L2e
        L20:
            int r2 = r0.getIntrinsicWidth()     // Catch: java.lang.Exception -> L44
            int r3 = r0.getIntrinsicHeight()     // Catch: java.lang.Exception -> L44
            android.graphics.Bitmap$Config r4 = com.obric.oui.avatar.OCircleImageView.w     // Catch: java.lang.Exception -> L44
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)     // Catch: java.lang.Exception -> L44
        L2e:
            android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch: java.lang.Exception -> L44
            r3.<init>(r2)     // Catch: java.lang.Exception -> L44
            int r4 = r3.getWidth()     // Catch: java.lang.Exception -> L44
            int r5 = r3.getHeight()     // Catch: java.lang.Exception -> L44
            r6 = 0
            r0.setBounds(r6, r6, r4, r5)     // Catch: java.lang.Exception -> L44
            r0.draw(r3)     // Catch: java.lang.Exception -> L44
            r0 = r2
            goto L49
        L44:
            r0 = move-exception
            r0.printStackTrace()
            goto L7
        L49:
            r7.k = r0
            if (r0 == 0) goto L5d
            boolean r0 = r0.isMutable()
            if (r0 == 0) goto L5d
            android.graphics.Canvas r0 = new android.graphics.Canvas
            android.graphics.Bitmap r2 = r7.k
            r0.<init>(r2)
            r7.l = r0
            goto L5f
        L5d:
            r7.l = r1
        L5f:
            boolean r0 = r7.p
            if (r0 != 0) goto L64
            return
        L64:
            android.graphics.Bitmap r0 = r7.k
            if (r0 == 0) goto L6c
            r7.l()
            goto L71
        L6c:
            android.graphics.Paint r0 = r7.f7617d
            r0.setShader(r1)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.avatar.OCircleImageView.j():void");
    }

    private void k() {
        int i;
        RectF rectF = this.b;
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float paddingLeft = ((r1 - min) / 2.0f) + getPaddingLeft();
        float paddingTop = ((r2 - min) / 2.0f) + getPaddingTop();
        float f2 = min;
        rectF.set(new RectF(paddingLeft, paddingTop, paddingLeft + f2, f2 + paddingTop));
        this.n = Math.min((this.b.height() - this.h) / 2.0f, (this.b.width() - this.h) / 2.0f);
        RectF rectF2 = this.a;
        int width = getWidth() - (this.u * 2);
        int min2 = Math.min(getHeight() - (this.u * 2), width);
        float f3 = this.u;
        float f4 = ((width - min2) / 2.0f) + f3;
        float f5 = ((r2 - min2) / 2.0f) + f3;
        float f6 = min2;
        rectF2.set(new RectF(f4, f5, f4 + f6, f6 + f5));
        if (!this.s && (i = this.h) > 0) {
            this.a.inset(i - 1.0f, i - 1.0f);
        }
        this.m = Math.min(this.a.height() / 2.0f, this.a.width() / 2.0f);
        l();
    }

    private void l() {
        float width;
        float height;
        if (this.k == null) {
            return;
        }
        this.f7616c.set(null);
        int height2 = this.k.getHeight();
        float width2 = this.k.getWidth();
        float f2 = height2;
        float f3 = 0.0f;
        if (this.a.height() * width2 > this.a.width() * f2) {
            width = this.a.height() / f2;
            float width3 = (this.a.width() - (width2 * width)) * 0.5f;
            height = 0.0f;
            f3 = width3;
        } else {
            width = this.a.width() / width2;
            height = (this.a.height() - (f2 * width)) * 0.5f;
        }
        this.f7616c.setScale(width, width);
        Matrix matrix = this.f7616c;
        float f4 = (int) (f3 + 0.5f);
        RectF rectF = this.a;
        matrix.postTranslate(f4 + rectF.left, ((int) (height + 0.5f)) + rectF.top);
        this.q = true;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.o;
    }

    @Override // android.widget.ImageView
    public int getImageAlpha() {
        return this.j;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        this.r = true;
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"CanvasSize"})
    protected void onDraw(Canvas canvas) {
        if (this.t) {
            super.onDraw(canvas);
            return;
        }
        if (this.i != 0) {
            canvas.drawCircle(this.b.centerX(), this.b.centerY(), this.n, this.f7619f);
        }
        if (this.k != null) {
            if (this.r && this.l != null) {
                this.r = false;
                Drawable drawable = getDrawable();
                drawable.setBounds(0, 0, this.l.getWidth(), this.l.getHeight());
                drawable.draw(this.l);
            }
            if (this.q) {
                this.q = false;
                Bitmap bitmap = this.k;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(this.f7616c);
                this.f7617d.setShader(bitmapShader);
            }
            canvas.drawCircle(this.a.centerX(), this.a.centerY(), this.m, this.f7617d);
        }
        if (this.h > 0) {
            canvas.drawCircle(this.b.centerX(), this.b.centerY(), this.n, this.f7618e);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        k();
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.t) {
            return super.onTouchEvent(motionEvent);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (!this.b.isEmpty()) {
            if (Math.pow(y - this.b.centerY(), 2.0d) + Math.pow(x - this.b.centerX(), 2.0d) > Math.pow(this.n, 2.0d)) {
                z = false;
                return z && super.onTouchEvent(motionEvent);
            }
        }
        z = true;
        if (z) {
            return false;
        }
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(@ColorInt int i) {
        if (i == this.f7620g) {
            return;
        }
        this.f7620g = i;
        this.f7618e.setColor(i);
        invalidate();
    }

    public void setBorderGradientColor(@ColorInt int i, @ColorInt int i2) {
        RectF rectF = this.b;
        float f2 = rectF.left;
        float height = rectF.top + (rectF.height() / 2.0f);
        RectF rectF2 = this.b;
        this.f7618e.setShader(new LinearGradient(f2, height, rectF2.right, rectF2.top + (rectF2.height() / 2.0f), i, i2, Shader.TileMode.MIRROR));
        invalidate();
    }

    public void setBorderOverlay(boolean z) {
        if (z == this.s) {
            return;
        }
        this.s = z;
        k();
        invalidate();
    }

    public void setBorderWidth(int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        this.f7618e.setStrokeWidth(i);
        k();
        invalidate();
    }

    public void setCircleBackgroundColor(@ColorInt int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        this.f7619f.setColor(i);
        invalidate();
    }

    @Deprecated
    public void setCircleBackgroundColorResource(@ColorRes int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.o) {
            return;
        }
        this.o = colorFilter;
        if (this.p) {
            this.f7617d.setColorFilter(colorFilter);
            invalidate();
        }
    }

    public void setContentPadding(int i) {
        this.u = i;
        k();
        invalidate();
    }

    public void setDisableCircularTransformation(boolean z) {
        if (z == this.t) {
            return;
        }
        this.t = z;
        if (z) {
            this.k = null;
            this.l = null;
            this.f7617d.setShader(null);
        } else {
            j();
        }
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setImageAlpha(int i) {
        int i2 = i & 255;
        if (i2 == this.j) {
            return;
        }
        this.j = i2;
        if (this.p) {
            this.f7617d.setAlpha(i2);
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        j();
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        j();
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        super.setImageResource(i);
        j();
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        k();
        invalidate();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        k();
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != v) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public OCircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OCircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new RectF();
        this.b = new RectF();
        this.f7616c = new Matrix();
        this.f7617d = new Paint();
        this.f7618e = new Paint();
        this.f7619f = new Paint();
        this.f7620g = ViewCompat.MEASURED_STATE_MASK;
        this.h = 0;
        this.i = 0;
        this.j = 255;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.n, i, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f7620g = obtainStyledAttributes.getColor(0, ViewCompat.MEASURED_STATE_MASK);
        this.s = obtainStyledAttributes.getBoolean(1, false);
        this.i = obtainStyledAttributes.getColor(3, 0);
        obtainStyledAttributes.recycle();
        i();
    }
}
