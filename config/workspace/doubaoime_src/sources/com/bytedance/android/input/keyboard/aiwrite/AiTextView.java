package com.bytedance.android.input.keyboard.aiwrite;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.MaskFilter;
import android.graphics.Shader;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.bytedance.android.input.basic.IAppGlobals;

/* loaded from: classes.dex */
public final class AiTextView extends AppCompatTextView {
    private final String a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private int f2549c;

    /* renamed from: d, reason: collision with root package name */
    private ValueAnimator f2550d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f2551e;

    /* renamed from: f, reason: collision with root package name */
    private String f2552f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2553g;
    private boolean h;
    private boolean i;
    private int j;
    private kotlin.s.b.a<kotlin.o> k;

    public static final class a extends CharacterStyle implements UpdateAppearance {
        private final MaskFilter a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final LinearGradient f2554c;

        public a(MaskFilter maskFilter, int i, LinearGradient linearGradient) {
            this.a = maskFilter;
            this.b = i;
            this.f2554c = linearGradient;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            if (textPaint != null) {
                textPaint.setAlpha(this.b);
            }
            if (textPaint != null) {
                textPaint.setMaskFilter(this.a);
            }
            if (textPaint == null) {
                return;
            }
            textPaint.setShader(this.f2554c);
        }
    }

    public static final class b implements Animator.AnimatorListener {
        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            kotlin.s.c.l.f(animator, "animation");
            com.bytedance.android.input.r.j.i(AiTextView.this.a, "onAnimationCancel");
            AiTextView.this.h = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            kotlin.s.c.l.f(animator, "animation");
            com.bytedance.android.input.r.j.i(AiTextView.this.a, "onAnimationEnd");
            if (AiTextView.this.f2551e.length() > AiTextView.this.getText().length()) {
                AiTextView aiTextView = AiTextView.this;
                aiTextView.setText(aiTextView.f2551e);
                AiTextView.this.j();
            } else {
                if (AiTextView.this.b) {
                    return;
                }
                AiTextView.this.h = false;
                AiTextView.this.k();
                AiTextView.this.t();
                kotlin.s.b.a<kotlin.o> q = AiTextView.this.q();
                if (q != null) {
                    q.invoke();
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            kotlin.s.c.l.f(animator, "animation");
            com.bytedance.android.input.r.j.i(AiTextView.this.a, "onAnimationRepeat");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            kotlin.s.c.l.f(animator, "animation");
            int i = AiTextView.this.f2549c - 1;
            if (i < 0 || i >= AiTextView.this.getLayout().getLineCount()) {
                ValueAnimator valueAnimator = AiTextView.this.f2550d;
                if (valueAnimator != null) {
                    valueAnimator.end();
                }
                String str = AiTextView.this.a;
                StringBuilder M = e.a.a.a.a.M("onAnimationStart, stop, mAnimatorToShowLine = ");
                M.append(AiTextView.this.f2549c);
                com.bytedance.android.input.r.j.j(str, M.toString());
                return;
            }
            int lineStart = AiTextView.this.getLayout().getLineStart(i);
            int lineEnd = AiTextView.this.getLayout().getLineEnd(i);
            CharSequence text = AiTextView.this.getText();
            kotlin.s.c.l.e(text, "text");
            String obj = text.subSequence(lineStart, lineEnd).toString();
            String str2 = AiTextView.this.a;
            StringBuilder V = e.a.a.a.a.V("onAnimationStart, animatorText = ", obj, ", start = ", lineStart, ", end = ");
            V.append(lineEnd);
            com.bytedance.android.input.r.j.i(str2, V.toString());
            if ((obj.length() == 0) || kotlin.s.c.l.a(obj, " ") || kotlin.s.c.l.a(obj, "\n")) {
                ValueAnimator valueAnimator2 = AiTextView.this.f2550d;
                if (valueAnimator2 != null) {
                    valueAnimator2.end();
                }
                com.bytedance.android.input.r.j.i(AiTextView.this.a, "onAnimationStart, stop");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiTextView(Context context) {
        super(context);
        kotlin.s.c.l.f(context, "context");
        this.a = "AIWriting-AiTextView";
        this.f2551e = "";
        this.f2552f = "";
        this.h = true;
        this.j = IAppGlobals.a.b() ? -1 : ViewCompat.MEASURED_STATE_MASK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        if (this.f2553g) {
            return;
        }
        U u = U.a;
        Integer value = u.g().getValue();
        if (value != null && value.intValue() == 0) {
            return;
        }
        C0601v c0601v = C0601v.a;
        Integer value2 = u.g().getValue();
        kotlin.s.c.l.c(value2);
        if (c0601v.c(value2.intValue()) || !isShown() || getLayout() == null) {
            return;
        }
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("checkStartAnimator lineCount = ");
        M.append(getLineCount());
        M.append(", mAnimatorToShowLine = ");
        M.append(this.f2549c);
        M.append(", mStart = ");
        M.append(this.b);
        com.bytedance.android.input.r.j.i(str, M.toString());
        int lineCount = getLineCount() - 1;
        ValueAnimator valueAnimator = this.f2550d;
        if (valueAnimator != null) {
            kotlin.s.c.l.c(valueAnimator);
            if (valueAnimator.isRunning()) {
                return;
            }
        }
        int i = this.f2549c;
        if (lineCount > i || (lineCount == i && !this.b)) {
            this.f2549c = i + 1;
            ValueAnimator valueAnimator2 = this.f2550d;
            if (valueAnimator2 != null) {
                kotlin.s.c.l.c(valueAnimator2);
                valueAnimator2.start();
                return;
            }
            ValueAnimator valueAnimator3 = new ValueAnimator();
            this.f2550d = valueAnimator3;
            kotlin.s.c.l.c(valueAnimator3);
            valueAnimator3.setInterpolator(new LinearInterpolator());
            ValueAnimator valueAnimator4 = this.f2550d;
            kotlin.s.c.l.c(valueAnimator4);
            valueAnimator4.setDuration(600L);
            ValueAnimator valueAnimator5 = this.f2550d;
            kotlin.s.c.l.c(valueAnimator5);
            valueAnimator5.setFloatValues(0.0f, 1.0f);
            ValueAnimator valueAnimator6 = this.f2550d;
            kotlin.s.c.l.c(valueAnimator6);
            valueAnimator6.setRepeatCount(0);
            ValueAnimator valueAnimator7 = this.f2550d;
            kotlin.s.c.l.c(valueAnimator7);
            valueAnimator7.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.android.input.keyboard.aiwrite.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator8) {
                    AiTextView.r(AiTextView.this, valueAnimator8);
                }
            });
            ValueAnimator valueAnimator8 = this.f2550d;
            kotlin.s.c.l.c(valueAnimator8);
            valueAnimator8.addListener(new b());
            ValueAnimator valueAnimator9 = this.f2550d;
            kotlin.s.c.l.c(valueAnimator9);
            valueAnimator9.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        ScrollView o = o();
        if (o == null) {
            return;
        }
        int height = getHeight() - ((o.getHeight() - o.getPaddingBottom()) - o.getPaddingTop());
        e.a.a.a.a.k0("checkViewSize, y = ", height, this.a);
        if (height <= 0 || IAppGlobals.a.w() != 1) {
            return;
        }
        C0601v c0601v = C0601v.a;
        Integer value = U.a.g().getValue();
        kotlin.s.c.l.c(value);
        if (c0601v.d(value.intValue())) {
            return;
        }
        com.bytedance.android.input.r.j.i(this.a, "checkViewSize, set big");
        c0601v.y(c0601v.f());
    }

    private final ScrollView o() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ScrollView) {
                return (ScrollView) parent;
            }
        }
        return null;
    }

    private final int p(int i, int i2, int i3, float f2) {
        if (f2 < 0.5f) {
            return Color.argb(255, i, i2, i3);
        }
        int i4 = this.j;
        return Color.argb(255, (int) (((((i4 >> 16) & 255) - i) * 1.0f) + i), (int) (((((i4 >> 8) & 255) - i2) * 1.0f) + i2), (int) ((((i4 & 255) - i3) * 1.0f) + i3));
    }

    public static void r(AiTextView aiTextView, ValueAnimator valueAnimator) {
        kotlin.s.c.l.f(aiTextView, "this$0");
        kotlin.s.c.l.f(valueAnimator, "<anonymous parameter 0>");
        ValueAnimator valueAnimator2 = aiTextView.f2550d;
        kotlin.s.c.l.c(valueAnimator2);
        Object animatedValue = valueAnimator2.getAnimatedValue();
        kotlin.s.c.l.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        LinearGradient linearGradient = ((double) floatValue) >= 0.99d ? null : new LinearGradient(0.0f, 0.0f, aiTextView.getWidth(), 0.0f, new int[]{aiTextView.p(153, 102, 255, floatValue), aiTextView.p(255, 93, 139, floatValue), aiTextView.p(255, 178, 0, floatValue)}, (float[]) null, Shader.TileMode.REPEAT);
        int i = (int) (255 * floatValue);
        float f2 = 32;
        float f3 = f2 - (floatValue * f2);
        BlurMaskFilter blurMaskFilter = f3 > 0.0f ? new BlurMaskFilter(f3, BlurMaskFilter.Blur.NORMAL) : null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = aiTextView.f2549c - 1;
        e.a.a.a.a.j0("onAnimationUpdate, animatorLine = ", i2, aiTextView.a);
        if (i2 < 0 || i2 >= aiTextView.getLayout().getLineCount()) {
            String str = aiTextView.a;
            StringBuilder M = e.a.a.a.a.M("onAnimationUpdate, stop, mAnimatorToShowLine = ");
            e.a.a.a.a.F0(M, aiTextView.f2549c, ", animatorLine = ", i2, ", layout.lineCount = ");
            M.append(aiTextView.getLayout().getLineCount());
            com.bytedance.android.input.r.j.j(str, M.toString());
            ValueAnimator valueAnimator3 = aiTextView.f2550d;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                return;
            }
            return;
        }
        int lineStart = aiTextView.getLayout().getLineStart(i2);
        int lineEnd = aiTextView.getLayout().getLineEnd(i2);
        if (i2 > 0) {
            CharSequence text = aiTextView.getText();
            kotlin.s.c.l.e(text, "text");
            spannableStringBuilder.append((CharSequence) text.subSequence(0, lineStart).toString());
        }
        CharSequence text2 = aiTextView.getText();
        kotlin.s.c.l.e(text2, "text");
        String obj = text2.subSequence(lineStart, lineEnd).toString();
        SpannableString spannableString = new SpannableString(obj);
        spannableString.setSpan(new a(blurMaskFilter, i, linearGradient), 0, obj.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        aiTextView.setText(spannableStringBuilder);
    }

    public static void s(ScrollView scrollView, int i, AiTextView aiTextView) {
        kotlin.s.c.l.f(scrollView, "$parentView");
        kotlin.s.c.l.f(aiTextView, "this$0");
        scrollView.scrollTo(0, i);
        e.a.a.a.a.j0("onLayout scroll view to ", i, aiTextView.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        if (this.f2552f.length() > 0) {
            com.bytedance.android.input.r.j.i(this.a, "setFormatText *** mTextFormat ");
            setText(Html.fromHtml(this.f2552f));
            this.f2553g = true;
        }
    }

    public final void l() {
        com.bytedance.android.input.r.j.i(this.a, "-------------------- disableAnimation------");
        ValueAnimator valueAnimator = this.f2550d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.h = false;
        this.i = false;
    }

    public final void m() {
        com.bytedance.android.input.r.j.i(this.a, "-------------------- enableAnimation------");
        this.i = true;
    }

    public final void n() {
        if (this.b) {
            com.bytedance.android.input.r.j.i(this.a, "-------------------- end------");
            this.b = false;
            if (!this.i) {
                k();
                kotlin.s.b.a<kotlin.o> aVar = this.k;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            }
            setText(this.f2551e);
            j();
            ValueAnimator valueAnimator = this.f2550d;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            this.h = false;
            k();
            t();
            kotlin.s.b.a<kotlin.o> aVar2 = this.k;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int lineEnd;
        kotlin.s.c.l.f(canvas, "canvas");
        if (!this.h) {
            com.bytedance.android.input.r.j.i(this.a, "onDraw whole");
            super.onDraw(canvas);
            return;
        }
        if (this.f2549c <= 0) {
            String str = this.a;
            StringBuilder M = e.a.a.a.a.M("onDraw in mAnimatorIsRunning, but not draw, ");
            M.append(this.f2549c);
            com.bytedance.android.input.r.j.j(str, M.toString());
            return;
        }
        ValueAnimator valueAnimator = this.f2550d;
        if (((valueAnimator == null || valueAnimator.isRunning()) ? false : true) && (lineEnd = getLayout().getLineEnd(this.f2549c - 1)) != getText().length()) {
            CharSequence text = getText();
            kotlin.s.c.l.e(text, "text");
            setText(text.subSequence(0, lineEnd).toString());
            String str2 = this.a;
            StringBuilder N = e.a.a.a.a.N("onDraw text change = ", lineEnd, ", ");
            N.append(getText().length());
            N.append(' ');
            N.append((Object) getText());
            com.bytedance.android.input.r.j.i(str2, N.toString());
        }
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        final int height;
        super.onLayout(z, i, i2, i3, i4);
        if (this.i) {
            j();
            int lineBottom = getLayout().getLineBottom(getLineCount() - 1);
            String str = this.a;
            StringBuilder M = e.a.a.a.a.M("onLayout lineCount = ");
            M.append(getLineCount());
            M.append(", height = ");
            M.append(getHeight());
            M.append(", bottom = ");
            M.append(i4);
            M.append(", line = ");
            M.append(lineBottom);
            M.append(" text = ");
            M.append((Object) getText());
            com.bytedance.android.input.r.j.i(str, M.toString());
            final ScrollView o = o();
            if (o != null && (height = lineBottom - ((o.getHeight() - o.getPaddingBottom()) - o.getPaddingTop())) > 0) {
                ValueAnimator valueAnimator = this.f2550d;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    post(new Runnable() { // from class: com.bytedance.android.input.keyboard.aiwrite.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            AiTextView.s(o, height, this);
                        }
                    });
                }
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.android.input.r.j.i(this.a, "onSizeChanged = " + i2);
        if (!isShown() || this.h) {
            return;
        }
        U u = U.a;
        Integer value = u.g().getValue();
        if (value != null && value.intValue() == 0) {
            return;
        }
        C0601v c0601v = C0601v.a;
        Integer value2 = u.g().getValue();
        kotlin.s.c.l.c(value2);
        if (c0601v.c(value2.intValue())) {
            return;
        }
        k();
    }

    public final kotlin.s.b.a<kotlin.o> q() {
        return this.k;
    }

    public final void setFormatText(String str) {
        kotlin.s.b.a<kotlin.o> aVar;
        kotlin.s.c.l.f(str, "textFormat");
        e.a.a.a.a.r0("setFormatText cache = ", str, this.a);
        this.f2552f = str;
        if (this.h) {
            return;
        }
        t();
        if (this.b || (aVar = this.k) == null) {
            return;
        }
        aVar.invoke();
    }

    public final void setOnRenderComplete(kotlin.s.b.a<kotlin.o> aVar) {
        this.k = aVar;
    }

    public final void setShowText(CharSequence charSequence) {
        kotlin.s.b.a<kotlin.o> aVar;
        kotlin.s.c.l.f(charSequence, "textShow");
        this.f2551e = charSequence;
        com.bytedance.android.input.r.j.i(this.a, "setShowText cache = " + ((Object) charSequence));
        if (this.f2549c != 0) {
            ValueAnimator valueAnimator = this.f2550d;
            boolean z = false;
            if (valueAnimator != null && !valueAnimator.isRunning()) {
                z = true;
            }
            if (!z) {
                return;
            }
        }
        com.bytedance.android.input.r.j.i(this.a, "setShowText *** set = " + ((Object) charSequence) + ", " + this.f2549c);
        setText(charSequence);
        if (this.b || this.h || (aVar = this.k) == null) {
            return;
        }
        aVar.invoke();
    }

    public final void u() {
        if (this.b) {
            com.bytedance.android.input.r.j.i(this.a, "-------------------- start, but already start------");
            ValueAnimator valueAnimator = this.f2550d;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
        }
        com.bytedance.android.input.r.j.i(this.a, "-------------------- start------");
        this.f2549c = 0;
        this.b = true;
        this.f2551e = "";
        this.f2552f = "";
        this.h = true;
        this.f2553g = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(attributeSet, "attrs");
        this.a = "AIWriting-AiTextView";
        this.f2551e = "";
        this.f2552f = "";
        this.h = true;
        this.j = IAppGlobals.a.b() ? -1 : ViewCompat.MEASURED_STATE_MASK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(attributeSet, "attrs");
        this.a = "AIWriting-AiTextView";
        this.f2551e = "";
        this.f2552f = "";
        this.h = true;
        this.j = IAppGlobals.a.b() ? -1 : ViewCompat.MEASURED_STATE_MASK;
    }
}
