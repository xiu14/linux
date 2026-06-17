package com.obric.oui.dialog.alert.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import e.i.a.b.b;
import e.i.b.c.b.p;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class RadiusLayout extends FrameLayout {
    private boolean a;
    private Paint b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7715c;

    /* renamed from: d, reason: collision with root package name */
    private float[] f7716d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f7717e;

    /* renamed from: f, reason: collision with root package name */
    private final Path f7718f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7719g;

    public RadiusLayout(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Paint paint;
        l.f(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f7715c && this.a && (paint = this.b) != null) {
            this.f7717e.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f7718f.reset();
            p pVar = p.f10030e;
            Path path = this.f7718f;
            RectF rectF = this.f7717e;
            float[] fArr = this.f7716d;
            if (fArr == null) {
                l.l("radiusArray");
                throw null;
            }
            p.a(path, rectF, fArr, Path.Direction.CW);
            canvas.drawPath(this.f7718f, paint);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        l.f(canvas, "canvas");
        this.f7717e.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f7718f.reset();
        p pVar = p.f10030e;
        Path path = this.f7718f;
        RectF rectF = this.f7717e;
        float[] fArr = this.f7716d;
        if (fArr == null) {
            l.l("radiusArray");
            throw null;
        }
        p.a(path, rectF, fArr, Path.Direction.CW);
        canvas.clipPath(this.f7718f);
        super.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f7719g) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public final void setMeasureHeightUnspecified(boolean z) {
        this.f7719g = z;
    }

    public final void setRadius(float f2) {
        this.f7716d = new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
        invalidate();
    }

    public final void setStroke(int i, int i2, int i3, int i4) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        if (i3 != 0 && i4 != 0) {
            paint.setPathEffect(new DashPathEffect(new float[]{i3, i4}, 0.0f));
        }
        paint.setStrokeWidth(i2);
        this.b = paint;
        this.f7715c = ((i & ViewCompat.MEASURED_STATE_MASK) == 0 || i2 == 0) ? false : true;
        invalidate();
    }

    public RadiusLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadiusLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = true;
        this.f7717e = new RectF();
        this.f7718f = new Path();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.C, i, 0);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…sLayout, defStyleAttr, 0)");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(2, dimension);
        float dimension3 = obtainStyledAttributes.getDimension(4, dimension);
        float dimension4 = obtainStyledAttributes.getDimension(1, dimension);
        float dimension5 = obtainStyledAttributes.getDimension(3, dimension);
        int color = obtainStyledAttributes.getColor(5, ViewCompat.MEASURED_STATE_MASK);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(8, 0);
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(7, 0);
        int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
        setRadius(dimension2, dimension3, dimension4, dimension5);
        setStroke(color, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        obtainStyledAttributes.recycle();
    }

    public final void setRadius(float f2, float f3, float f4, float f5) {
        this.f7716d = new float[]{f2, f2, f3, f3, f5, f5, f4, f4};
        invalidate();
    }
}
