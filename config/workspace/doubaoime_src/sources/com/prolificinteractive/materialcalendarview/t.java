package com.prolificinteractive.materialcalendarview;

import android.R;
import android.animation.Animator;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
class t {
    private final TextView a;

    /* renamed from: c, reason: collision with root package name */
    private final int f8229c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8230d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8231e;

    @NonNull
    private com.prolificinteractive.materialcalendarview.w.g b = com.prolificinteractive.materialcalendarview.w.g.a;

    /* renamed from: f, reason: collision with root package name */
    private final Interpolator f8232f = new DecelerateInterpolator(2.0f);

    /* renamed from: g, reason: collision with root package name */
    private int f8233g = 0;
    private long h = 0;
    private CalendarDay i = null;

    class a extends com.prolificinteractive.materialcalendarview.a {
        final /* synthetic */ CharSequence a;
        final /* synthetic */ int b;

        a(CharSequence charSequence, int i) {
            this.a = charSequence;
            this.b = i;
        }

        @Override // com.prolificinteractive.materialcalendarview.a, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            t tVar = t.this;
            t.b(tVar, tVar.a, 0);
            t.this.a.setAlpha(1.0f);
        }

        @Override // com.prolificinteractive.materialcalendarview.a, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.a.setText(this.a);
            t tVar = t.this;
            t.b(tVar, tVar.a, this.b);
            ViewPropertyAnimator animate = t.this.a.animate();
            if (t.this.f8233g == 1) {
                animate.translationX(0.0f);
            } else {
                animate.translationY(0.0f);
            }
            animate.alpha(1.0f).setDuration(t.this.f8230d).setInterpolator(t.this.f8232f).setListener(new com.prolificinteractive.materialcalendarview.a()).start();
        }
    }

    public t(TextView textView) {
        this.a = textView;
        Resources resources = textView.getResources();
        this.f8229c = 400;
        this.f8230d = resources.getInteger(R.integer.config_shortAnimTime) / 2;
        this.f8231e = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
    }

    static void b(t tVar, TextView textView, int i) {
        if (tVar.f8233g == 1) {
            textView.setTranslationX(i);
        } else {
            textView.setTranslationY(i);
        }
    }

    private void g(long j, CalendarDay calendarDay, boolean z) {
        this.a.animate().cancel();
        TextView textView = this.a;
        if (this.f8233g == 1) {
            textView.setTranslationX(0);
        } else {
            textView.setTranslationY(0);
        }
        this.a.setAlpha(1.0f);
        this.h = j;
        CharSequence a2 = this.b.a(calendarDay);
        if (z) {
            int i = this.f8231e * (this.i.j(calendarDay) ? 1 : -1);
            ViewPropertyAnimator animate = this.a.animate();
            if (this.f8233g == 1) {
                animate.translationX(i * (-1));
            } else {
                animate.translationY(i * (-1));
            }
            animate.alpha(0.0f).setDuration(this.f8230d).setInterpolator(this.f8232f).setListener(new a(a2, i)).start();
        } else {
            this.a.setText(a2);
        }
        this.i = calendarDay;
    }

    public void f(CalendarDay calendarDay) {
        long currentTimeMillis = System.currentTimeMillis();
        if (calendarDay == null) {
            return;
        }
        if (TextUtils.isEmpty(this.a.getText()) || currentTimeMillis - this.h < this.f8229c) {
            g(currentTimeMillis, calendarDay, false);
        }
        if (calendarDay.equals(this.i)) {
            return;
        }
        if (calendarDay.f() == this.i.f() && calendarDay.g() == this.i.g()) {
            return;
        }
        g(currentTimeMillis, calendarDay, true);
    }

    public int h() {
        return this.f8233g;
    }

    public void i(int i) {
        this.f8233g = i;
    }

    public void j(CalendarDay calendarDay) {
        this.i = calendarDay;
    }

    public void k(@Nullable com.prolificinteractive.materialcalendarview.w.g gVar) {
        if (gVar == null) {
            gVar = com.prolificinteractive.materialcalendarview.w.g.a;
        }
        this.b = gVar;
    }
}
