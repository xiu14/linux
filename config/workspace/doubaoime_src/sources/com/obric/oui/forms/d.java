package com.obric.oui.forms;

import android.animation.ValueAnimator;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.Objects;
import kotlin.s.c.l;
import kotlin.w.h;

/* loaded from: classes2.dex */
final class d implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ OInputView a;
    final /* synthetic */ float b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f7786c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f7787d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f7788e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ TextView f7789f;

    d(OInputView oInputView, float f2, int i, int i2, float f3, TextView textView) {
        this.a = oInputView;
        this.b = f2;
        this.f7786c = i;
        this.f7787d = i2;
        this.f7788e = f3;
        this.f7789f = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        l.f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        float f2 = this.b;
        float a = e.a.a.a.a.a(0, f2, floatValue, f2);
        OInputView oInputView = this.a;
        int i = this.f7786c;
        int i2 = this.f7787d;
        int i3 = OInputView.h0;
        Objects.requireNonNull(oInputView);
        int blendARGB = ColorUtils.blendARGB(i, i2, h.e(floatValue, 0.0f, 1.0f));
        float f3 = this.f7788e;
        float a2 = e.a.a.a.a.a(1.0f, f3, floatValue, f3);
        this.f7789f.setTextColor(blendARGB);
        this.f7789f.setScaleX(a2);
        this.f7789f.setScaleY(a2);
        this.f7789f.setTranslationY(a);
        e.i.b.f.e.b.e("OInputView", "progress: " + floatValue + ", transY: " + a + ", scale: " + a2);
    }
}
