package com.bytedance.android.input.common.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.t;
import kotlin.s.c.l;
import kotlin.w.h;

/* loaded from: classes.dex */
public final class GradientProgressBar extends View {
    private final Paint a;
    private final Paint b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f2224c;

    /* renamed from: d, reason: collision with root package name */
    private int f2225d;

    /* renamed from: e, reason: collision with root package name */
    private int f2226e;

    /* renamed from: f, reason: collision with root package name */
    private int f2227f;

    /* renamed from: g, reason: collision with root package name */
    private int f2228g;
    private LinearGradient h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientProgressBar(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        float height = getHeight() / 2.0f;
        this.f2224c.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.f2224c, height, height, this.b);
        float width = (this.f2225d / 100.0f) * getWidth();
        if (width <= 0.0f) {
            return;
        }
        this.f2224c.set(0.0f, 0.0f, width, getHeight());
        LinearGradient linearGradient = this.h;
        if (linearGradient == null) {
            linearGradient = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, this.f2226e, this.f2227f, Shader.TileMode.CLAMP);
            this.h = linearGradient;
        }
        this.a.setShader(linearGradient);
        canvas.drawRoundRect(this.f2224c, height, height, this.a);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.h = null;
    }

    public final void setGradientColors(@ColorInt int i, @ColorInt int i2) {
        if (i == this.f2226e && i2 == this.f2227f) {
            return;
        }
        this.f2226e = i;
        this.f2227f = i2;
        this.h = null;
        invalidate();
    }

    public final void setProgress(int i) {
        int f2 = h.f(i, 0, 100);
        if (f2 == this.f2225d) {
            return;
        }
        this.f2225d = f2;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = new Paint(1);
        Paint paint = new Paint(1);
        this.b = paint;
        this.f2224c = new RectF();
        this.f2226e = ContextCompat.getColor(context, C0838R.color.message_center_progress_start);
        this.f2227f = ContextCompat.getColor(context, C0838R.color.message_center_progress_end);
        this.f2228g = 335544320;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.b);
            l.e(obtainStyledAttributes, "context.obtainStyledAttr…able.GradientProgressBar)");
            this.f2226e = obtainStyledAttributes.getColor(3, this.f2226e);
            this.f2227f = obtainStyledAttributes.getColor(2, this.f2227f);
            this.f2228g = obtainStyledAttributes.getColor(1, this.f2228g);
            this.f2225d = obtainStyledAttributes.getInt(0, this.f2225d);
            obtainStyledAttributes.recycle();
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f2228g);
    }
}
