package com.obric.oui.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import e.i.b.c.b.p;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class IndicatorDotView extends View implements a {
    private final RectF a;
    private final RectF b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f7819c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f7820d;

    /* renamed from: e, reason: collision with root package name */
    private int f7821e;

    /* renamed from: f, reason: collision with root package name */
    private int f7822f;

    /* renamed from: g, reason: collision with root package name */
    private float f7823g;
    private float h;

    public IndicatorDotView(Context context) {
        this(context, null, 0, 6);
    }

    public IndicatorDotView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public /* synthetic */ IndicatorDotView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        this.a.set(0.0f, 0.0f, getWidth(), getHeight());
        p pVar = p.f10030e;
        p.g(canvas, this.a, this.h, this.f7819c);
        float f2 = this.f7823g;
        if (f2 > 0) {
            float f3 = 2;
            float f4 = f2 / f3;
            this.b.set(f4, f4, getWidth() - (this.f7823g / f3), getHeight() - (this.f7823g / f3));
            p.g(canvas, this.b, this.h, this.f7820d);
        }
    }

    @Override // com.obric.oui.indicator.a
    public void setCornerRadius(float f2) {
        this.h = f2;
    }

    @Override // com.obric.oui.indicator.a
    public void setDotColor(int i) {
        if (this.f7821e != i) {
            this.f7821e = i;
        }
        this.f7819c.setColor(i);
    }

    @Override // com.obric.oui.indicator.a
    public void setHorizontalMargin(int i) {
        l.f(this, "$this$setHorizontalMargin");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.setMarginStart(i);
            layoutParams2.setMarginEnd(i);
            requestLayout();
        }
    }

    @Override // com.obric.oui.indicator.a
    public void setStrokeColor(int i) {
        if (this.f7822f != i) {
            this.f7822f = i;
        }
        this.f7820d.setColor(i);
    }

    @Override // com.obric.oui.indicator.a
    public void setStrokeWidth(float f2) {
        if (this.f7823g != f2) {
            this.f7823g = f2;
        }
        this.f7820d.setStrokeWidth(f2);
    }

    @Override // com.obric.oui.indicator.a
    public void setWidth(int i) {
        e.i.a.b.a.i(this, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorDotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = new RectF();
        this.b = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f7819c = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        this.f7820d = paint2;
        this.f7821e = -7829368;
    }
}
