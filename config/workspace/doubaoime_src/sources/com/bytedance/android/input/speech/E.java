package com.bytedance.android.input.speech;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class E {
    private final I a;
    private final kotlin.s.b.l<String, kotlin.o> b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3071c;

    /* renamed from: d, reason: collision with root package name */
    private ValueAnimator f3072d;

    /* renamed from: e, reason: collision with root package name */
    private String f3073e;

    /* renamed from: f, reason: collision with root package name */
    private int f3074f;

    public static final class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            kotlin.s.c.l.f(animator, "p0");
            com.bytedance.android.input.r.j.i(E.this.f3071c, "animation cancle");
            E.this.g("");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            kotlin.s.c.l.f(animator, "p0");
            com.bytedance.android.input.r.j.i(E.this.f3071c, "animation end");
            E.this.d().invoke(E.this.c());
            E.this.g("");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            kotlin.s.c.l.f(animator, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            kotlin.s.c.l.f(animator, "p0");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E(I i, kotlin.s.b.l<? super String, kotlin.o> lVar) {
        kotlin.s.c.l.f(i, "processText");
        kotlin.s.c.l.f(lVar, "notifyEnd");
        this.a = i;
        this.b = lVar;
        this.f3071c = "Asr-AsrTextAnimation";
        this.f3073e = "";
    }

    public static void f(E e2, ValueAnimator valueAnimator) {
        kotlin.s.c.l.f(e2, "this$0");
        kotlin.s.c.l.f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        kotlin.s.c.l.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        int floatValue = ((int) (0 * ((Float) animatedValue).floatValue())) + 0;
        e2.f3074f = Color.argb(255, floatValue, floatValue, floatValue);
        e2.a.c();
    }

    public final int b() {
        return this.f3074f;
    }

    public final String c() {
        return this.f3073e;
    }

    public final kotlin.s.b.l<String, kotlin.o> d() {
        return this.b;
    }

    public final boolean e() {
        ValueAnimator valueAnimator = this.f3072d;
        if (valueAnimator != null) {
            kotlin.s.c.l.c(valueAnimator);
            if (valueAnimator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public final void g(String str) {
        kotlin.s.c.l.f(str, "<set-?>");
        this.f3073e = str;
    }

    public final void h(float f2, float f3, long j, boolean z) {
        ValueAnimator valueAnimator = this.f3072d;
        if (valueAnimator != null) {
            kotlin.s.c.l.c(valueAnimator);
            if (valueAnimator.isRunning()) {
                return;
            }
        }
        if (this.f3072d != null) {
            com.bytedance.android.input.r.j.i(this.f3071c, "animation start " + this);
            ValueAnimator valueAnimator2 = this.f3072d;
            kotlin.s.c.l.c(valueAnimator2);
            valueAnimator2.start();
            return;
        }
        com.bytedance.android.input.r.j.i(this.f3071c, "animation start " + this);
        ValueAnimator valueAnimator3 = new ValueAnimator();
        this.f3072d = valueAnimator3;
        kotlin.s.c.l.c(valueAnimator3);
        valueAnimator3.setInterpolator(new LinearInterpolator());
        ValueAnimator valueAnimator4 = this.f3072d;
        kotlin.s.c.l.c(valueAnimator4);
        valueAnimator4.setDuration(j);
        if (z) {
            ValueAnimator valueAnimator5 = this.f3072d;
            kotlin.s.c.l.c(valueAnimator5);
            valueAnimator5.setFloatValues(f2, f3, f2);
            ValueAnimator valueAnimator6 = this.f3072d;
            kotlin.s.c.l.c(valueAnimator6);
            valueAnimator6.setRepeatMode(1);
            ValueAnimator valueAnimator7 = this.f3072d;
            kotlin.s.c.l.c(valueAnimator7);
            valueAnimator7.setRepeatCount(-1);
        } else {
            ValueAnimator valueAnimator8 = this.f3072d;
            kotlin.s.c.l.c(valueAnimator8);
            valueAnimator8.setFloatValues(f2, f3);
            ValueAnimator valueAnimator9 = this.f3072d;
            kotlin.s.c.l.c(valueAnimator9);
            valueAnimator9.setRepeatCount(0);
        }
        ValueAnimator valueAnimator10 = this.f3072d;
        kotlin.s.c.l.c(valueAnimator10);
        valueAnimator10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.android.input.speech.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator11) {
                E.f(E.this, valueAnimator11);
            }
        });
        ValueAnimator valueAnimator11 = this.f3072d;
        kotlin.s.c.l.c(valueAnimator11);
        valueAnimator11.addListener(new a());
        ValueAnimator valueAnimator12 = this.f3072d;
        kotlin.s.c.l.c(valueAnimator12);
        valueAnimator12.start();
    }

    public final void i() {
        com.bytedance.android.input.r.j.i(this.f3071c, "animation stop " + this);
        ValueAnimator valueAnimator = this.f3072d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f3073e = "";
    }

    public final void j(String str) {
        kotlin.s.c.l.f(str, "text");
        this.f3073e = str;
    }
}
