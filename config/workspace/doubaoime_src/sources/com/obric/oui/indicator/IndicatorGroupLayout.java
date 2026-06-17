package com.obric.oui.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import e.i.b.c.b.p;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class IndicatorGroupLayout extends LinearLayout {
    private final RectF a;
    private final Paint b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7824c;

    /* renamed from: d, reason: collision with root package name */
    private int f7825d;

    /* renamed from: e, reason: collision with root package name */
    private int f7826e;

    public IndicatorGroupLayout(Context context) {
        this(context, null, 0, 6);
    }

    public IndicatorGroupLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public /* synthetic */ IndicatorGroupLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        if (this.f7824c) {
            this.a.set(0.0f, 0.0f, getWidth(), getHeight());
            p pVar = p.f10030e;
            p.g(canvas, this.a, this.f7825d * 1.0f, this.b);
        }
        super.onDraw(canvas);
    }

    public final void setBgColor(int i) {
        if (this.f7826e != i) {
            this.f7826e = i;
        }
        this.b.setColor(i);
    }

    public final void setCornerRadius(int i) {
        this.f7825d = i;
    }

    public final void setDrawBackground(boolean z) {
        this.f7824c = z;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorGroupLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.b = paint;
        setBackgroundColor(0);
    }
}
