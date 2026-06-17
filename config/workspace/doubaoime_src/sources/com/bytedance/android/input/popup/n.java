package com.bytedance.android.input.popup;

import android.animation.Animator;
import android.graphics.Paint;
import android.os.SystemClock;
import kotlin.s.c.v;

/* loaded from: classes.dex */
public final class n implements Animator.AnimatorListener {
    final /* synthetic */ v a;
    final /* synthetic */ HandwriteView b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f2912c;

    n(v vVar, HandwriteView handwriteView, int i) {
        this.a = vVar;
        this.b = handwriteView;
        this.f2912c = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        Paint paint;
        kotlin.s.c.l.f(animator, "animation");
        this.a.a = true;
        paint = this.b.b;
        paint.setAlpha(this.f2912c);
        this.b.h = null;
        this.b.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        Paint paint;
        kotlin.s.c.l.f(animator, "animation");
        paint = this.b.b;
        paint.setAlpha(this.f2912c);
        if (!this.a.a) {
            this.b.f();
        }
        this.b.h = null;
        this.b.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        kotlin.s.c.l.f(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        long j;
        kotlin.s.c.l.f(animator, "animation");
        this.a.a = false;
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder M = e.a.a.a.a.M("[hand_write] fade start, elapsed=");
        j = this.b.m;
        M.append(uptimeMillis - j);
        M.append("ms, duration=300ms");
        com.bytedance.android.input.r.j.i("HandwriteView", M.toString());
    }
}
