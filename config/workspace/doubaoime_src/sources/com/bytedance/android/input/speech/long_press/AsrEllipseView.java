package com.bytedance.android.input.speech.long_press;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.areacontrol.k;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class AsrEllipseView extends View {
    private final String a;
    private Paint b;

    /* renamed from: c, reason: collision with root package name */
    private float f3108c;

    /* renamed from: d, reason: collision with root package name */
    private float f3109d;

    /* renamed from: e, reason: collision with root package name */
    private float f3110e;

    /* renamed from: f, reason: collision with root package name */
    private float f3111f;

    /* renamed from: g, reason: collision with root package name */
    private float f3112g;
    private float h;
    private boolean i;
    private RectF j;
    private ValueAnimator k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsrEllipseView(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    private final void a() {
        k kVar = k.a;
        this.f3108c = k.L(5);
        this.f3109d = k.L(493);
        this.f3110e = k.L(260);
        this.f3111f = k.L(943);
        this.f3112g = k.L(330);
    }

    static final void b(AsrEllipseView asrEllipseView, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        l.f(asrEllipseView, "this$0");
        l.f(valueAnimator2, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        l.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        asrEllipseView.h = ((Float) animatedValue).floatValue() * asrEllipseView.f3108c;
        asrEllipseView.invalidate();
    }

    public final boolean c(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent == null) {
            return false;
        }
        boolean z2 = this.i;
        getLocationOnScreen(new int[2]);
        float rawX = motionEvent.getRawX() - r3[0];
        float rawY = motionEvent.getRawY() - r3[1];
        float centerX = this.j.centerX();
        float centerY = this.j.centerY();
        float width = this.j.width() / 2.0f;
        float height = this.j.height() / 2.0f;
        if (width > 0.0f && height > 0.0f) {
            float f2 = rawX - centerX;
            float f3 = rawY - centerY;
            if (((f3 * f3) / (height * height)) + ((f2 * f2) / (width * width)) <= 1.0f) {
                z = true;
            }
        }
        this.i = z;
        if (motionEvent.getAction() == 2 && z2 != this.i) {
            invalidate();
            e.a.a.a.a.N0(e.a.a.a.a.M("onTouchEventProcess, isTouchingStroke = "), this.i, this.a);
            if (this.i) {
                ValueAnimator valueAnimator = this.k;
                if (valueAnimator != null) {
                    valueAnimator.setFloatValues(1.0f, 0.0f);
                }
                ValueAnimator valueAnimator2 = this.k;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.k;
                if (valueAnimator3 != null) {
                    valueAnimator3.setFloatValues(0.0f, 1.0f);
                }
                ValueAnimator valueAnimator4 = this.k;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                }
            }
            InputView inputView = ImeService.x;
            if (inputView != null) {
                inputView.E(this.i);
            }
        }
        return this.i;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            k kVar = k.a;
            float f2 = k.R() ? this.f3111f : this.f3109d;
            float width = (getWidth() - f2) / 2;
            this.j.set(width, this.h, f2 + width, k.R() ? this.f3112g : this.f3110e);
            this.b.setColor(this.i ? getContext().getResources().getColor(C0838R.color.asr_long_press_button_press_bk_press) : getContext().getResources().getColor(C0838R.color.asr_long_press_button_bk_normal));
            canvas.drawOval(this.j, this.b);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        l.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            this.h = 0.0f;
        } else {
            a();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsrEllipseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrEllipseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = "Asr-EllipseView";
        this.b = new Paint();
        this.i = true;
        this.j = new RectF();
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.FILL);
        this.b.setColor(context.getResources().getColor(C0838R.color.asr_long_press_button_press_bk_press));
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.android.input.speech.long_press.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AsrEllipseView.b(AsrEllipseView.this, ofFloat, valueAnimator);
            }
        });
        this.k = ofFloat;
        a();
        setClickable(true);
    }
}
