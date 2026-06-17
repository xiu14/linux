package com.bytedance.android.input.common.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;
import kotlin.w.h;

/* loaded from: classes.dex */
public final class BlueSweepTextView extends AppCompatTextView {
    private LinearGradient a;
    private final Matrix b;

    /* renamed from: c, reason: collision with root package name */
    private ValueAnimator f2220c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2221d;

    /* renamed from: e, reason: collision with root package name */
    private float f2222e;

    /* renamed from: f, reason: collision with root package name */
    private float f2223f;

    public static final class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            l.f(animator, "animation");
            BlueSweepTextView.this.f2223f = 0.0f;
            BlueSweepTextView.this.postInvalidateOnAnimation();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.f(animator, "animation");
            BlueSweepTextView.this.f2223f = 0.0f;
            BlueSweepTextView.this.postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlueSweepTextView(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    public static void b(BlueSweepTextView blueSweepTextView, ValueAnimator valueAnimator) {
        l.f(blueSweepTextView, "this$0");
        l.f(valueAnimator, "va");
        Object animatedValue = valueAnimator.getAnimatedValue();
        l.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        blueSweepTextView.f2223f = ((Float) animatedValue).floatValue();
        blueSweepTextView.postInvalidateOnAnimation();
    }

    private final void c(int i) {
        ValueAnimator valueAnimator = this.f2220c;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        if (i < 1) {
            i = 1;
        }
        float f2 = i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(-f2, f2);
        ofFloat.setDuration(2000L);
        ofFloat.setRepeatCount(0);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.android.input.common.views.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BlueSweepTextView.b(BlueSweepTextView.this, valueAnimator2);
            }
        });
        ofFloat.addListener(new a());
        ofFloat.start();
        this.f2220c = ofFloat;
    }

    private final void d() {
        ValueAnimator valueAnimator = this.f2220c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f2220c = null;
        this.f2223f = 0.0f;
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() > 0) {
            c(getWidth());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        Shader shader = getPaint().getShader();
        getPaint().setShader(null);
        super.onDraw(canvas);
        if (this.a != null) {
            ValueAnimator valueAnimator = this.f2220c;
            if ((valueAnimator != null && valueAnimator.isRunning()) && this.f2222e > 0.0f) {
                float width = (getWidth() / 2.0f) + this.f2223f;
                float a2 = h.a(width - (this.f2222e / 2.0f), 0.0f);
                float c2 = h.c((this.f2222e / 2.0f) + width, getWidth());
                if (c2 > a2) {
                    int save = canvas.save();
                    canvas.clipRect(a2, 0.0f, c2, getHeight());
                    this.b.reset();
                    this.b.setTranslate(this.f2223f, 0.0f);
                    LinearGradient linearGradient = this.a;
                    if (linearGradient != null) {
                        linearGradient.setLocalMatrix(this.b);
                    }
                    getPaint().setShader(this.a);
                    super.onDraw(canvas);
                    canvas.restoreToCount(save);
                }
            }
        }
        getPaint().setShader(shader);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0) {
            return;
        }
        int currentTextColor = getCurrentTextColor();
        int blendARGB = ColorUtils.blendARGB(this.f2221d, -1, 0.2f);
        int blendARGB2 = ColorUtils.blendARGB(this.f2221d, -1, 0.6f);
        float textSize = getTextSize() * 8;
        float f2 = i;
        float f3 = (textSize / 2.0f) / f2;
        float a2 = h.a(0.5f - f3, 0.0f);
        float c2 = h.c(f3 + 0.5f, 1.0f);
        float e2 = h.e(f3 * 0.25f, 0.01f, 0.08f);
        this.a = new LinearGradient(0.0f, 0.0f, f2, 0.0f, new int[]{currentTextColor, currentTextColor, blendARGB, blendARGB2, blendARGB, currentTextColor, currentTextColor}, new float[]{0.0f, a2, 0.5f - e2, 0.5f, e2 + 0.5f, c2, 1.0f}, Shader.TileMode.CLAMP);
        this.f2222e = textSize;
        getPaint().setShader(this.a);
        d();
        c(i);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onVisibilityChanged(View view, int i) {
        l.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            c(getWidth());
        } else {
            d();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlueSweepTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlueSweepTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.b = new Matrix();
        this.f2221d = ContextCompat.getColor(context, C0838R.color.ime_color_4f84ff);
        setLayerType(2, null);
    }
}
