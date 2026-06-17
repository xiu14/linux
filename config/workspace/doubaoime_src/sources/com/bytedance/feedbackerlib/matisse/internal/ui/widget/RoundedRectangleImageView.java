package com.bytedance.feedbackerlib.matisse.internal.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes.dex */
public class RoundedRectangleImageView extends AppCompatImageView {
    private float a;
    private Path b;

    /* renamed from: c, reason: collision with root package name */
    private RectF f4904c;

    public RoundedRectangleImageView(Context context) {
        super(context);
        g(context);
    }

    private void g(Context context) {
        this.a = context.getResources().getDisplayMetrics().density * 5.0f;
        this.b = new Path();
        this.f4904c = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.clipPath(this.b);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f4904c.set(1.0f, 1.0f, getMeasuredWidth(), getMeasuredHeight());
        Path path = this.b;
        RectF rectF = this.f4904c;
        float f2 = this.a;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
    }

    public RoundedRectangleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g(context);
    }

    public RoundedRectangleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g(context);
    }
}
