package com.obric.oui.forms;

import android.animation.ValueAnimator;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.Objects;
import kotlin.s.c.l;
import kotlin.w.h;

/* loaded from: classes2.dex */
final class f implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ OInputView a;
    final /* synthetic */ float b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f7790c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f7791d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f7792e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ TextView f7793f;

    f(OInputView oInputView, float f2, int i, int i2, float f3, TextView textView) {
        this.a = oInputView;
        this.b = f2;
        this.f7790c = i;
        this.f7791d = i2;
        this.f7792e = f3;
        this.f7793f = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        l.f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        float f2 = 0;
        float a = e.a.a.a.a.a(this.b, f2, floatValue, f2);
        OInputView oInputView = this.a;
        int i = this.f7790c;
        int i2 = this.f7791d;
        int i3 = OInputView.h0;
        Objects.requireNonNull(oInputView);
        int blendARGB = ColorUtils.blendARGB(i, i2, h.e(floatValue, 0.0f, 1.0f));
        float a2 = e.a.a.a.a.a(this.f7792e, 1.0f, floatValue, 1.0f);
        this.f7793f.setTextColor(blendARGB);
        this.f7793f.setScaleX(a2);
        this.f7793f.setScaleY(a2);
        this.f7793f.setTranslationY(a);
        e.i.b.f.e.b.e("OInputView", "progress: " + floatValue + ", transY: " + a + ", scale: " + a2);
    }
}
