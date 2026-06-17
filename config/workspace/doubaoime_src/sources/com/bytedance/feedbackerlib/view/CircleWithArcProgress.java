package com.bytedance.feedbackerlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.b;

/* loaded from: classes.dex */
public class CircleWithArcProgress extends View {
    private final Paint a;
    private final RectF b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f4993c;

    /* renamed from: d, reason: collision with root package name */
    private int f4994d;

    /* renamed from: e, reason: collision with root package name */
    private int f4995e;

    /* renamed from: f, reason: collision with root package name */
    private int f4996f;

    /* renamed from: g, reason: collision with root package name */
    private int f4997g;
    private int h;
    private float i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CircleWithArcProgress.this.f4994d < 355) {
                CircleWithArcProgress.this.f4994d += 5;
            } else {
                CircleWithArcProgress.this.f4994d = 0;
            }
            CircleWithArcProgress.this.invalidate();
            CircleWithArcProgress.this.postDelayed(this, 10L);
        }
    }

    public CircleWithArcProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint();
        this.b = new RectF();
        this.f4993c = new a();
        this.f4994d = 0;
        this.f4995e = 120;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.a, 0, 0);
        try {
            try {
                this.i = obtainStyledAttributes.getDimension(2, getContext().getResources().getDimensionPixelSize(C0838R.dimen.dp_11));
                this.f4996f = obtainStyledAttributes.getColor(1, Color.parseColor("#D3D3D3"));
                this.f4997g = obtainStyledAttributes.getColor(0, Color.parseColor("#929292"));
                this.h = getResources().getDimensionPixelSize(C0838R.dimen.dp_2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            obtainStyledAttributes.recycle();
            post(this.f4993c);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.setFlags(1);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeWidth(this.h);
        this.a.setColor(this.f4996f);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.i, this.a);
        this.a.setColor(this.f4997g);
        this.b.set((getWidth() / 2.0f) - this.i, (getHeight() / 2.0f) - this.i, (getWidth() / 2.0f) + this.i, (getHeight() / 2.0f) + this.i);
        canvas.drawArc(this.b, this.f4994d, this.f4995e, false, this.a);
    }
}
