package com.obric.oui.calendar;

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
    private final int f7685c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7686d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7687e;

    @NonNull
    private com.obric.oui.calendar.w.g b = com.obric.oui.calendar.w.g.a;

    /* renamed from: f, reason: collision with root package name */
    private final Interpolator f7688f = new DecelerateInterpolator(2.0f);

    /* renamed from: g, reason: collision with root package name */
    private int f7689g = 0;
    private long h = 0;
    private CalendarDay i = null;

    class a extends b {
        final /* synthetic */ CharSequence a;
        final /* synthetic */ int b;

        a(CharSequence charSequence, int i) {
            this.a = charSequence;
            this.b = i;
        }

        @Override // com.obric.oui.calendar.b, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            t tVar = t.this;
            t.b(tVar, tVar.a, 0);
            t.this.a.setAlpha(1.0f);
        }

        @Override // com.obric.oui.calendar.b, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.a.setText(this.a);
            t tVar = t.this;
            t.b(tVar, tVar.a, this.b);
            ViewPropertyAnimator animate = t.this.a.animate();
            if (t.this.f7689g == 1) {
                animate.translationX(0.0f);
            } else {
                animate.translationY(0.0f);
            }
            animate.alpha(1.0f).setDuration(t.this.f7686d).setInterpolator(t.this.f7688f).setListener(new b()).start();
        }
    }

    public t(TextView textView) {
        this.a = textView;
        Resources resources = textView.getResources();
        this.f7685c = 400;
        this.f7686d = resources.getInteger(R.integer.config_shortAnimTime) / 2;
        this.f7687e = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
    }

    static void b(t tVar, TextView textView, int i) {
        if (tVar.f7689g == 1) {
            textView.setTranslationX(i);
        } else {
            textView.setTranslationY(i);
        }
    }

    private void g(long j, CalendarDay calendarDay, boolean z) {
        this.a.animate().cancel();
        TextView textView = this.a;
        if (this.f7689g == 1) {
            textView.setTranslationX(0);
        } else {
            textView.setTranslationY(0);
        }
        this.a.setAlpha(1.0f);
        this.h = j;
        CharSequence a2 = this.b.a(calendarDay);
        if (z) {
            int i = this.f7687e * (this.i.j(calendarDay) ? 1 : -1);
            ViewPropertyAnimator animate = this.a.animate();
            if (this.f7689g == 1) {
                animate.translationX(i * (-1));
            } else {
                animate.translationY(i * (-1));
            }
            animate.alpha(0.0f).setDuration(this.f7686d).setInterpolator(this.f7688f).setListener(new a(a2, i)).start();
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
        if (TextUtils.isEmpty(this.a.getText()) || currentTimeMillis - this.h < this.f7685c) {
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

    public void h(int i) {
        this.f7689g = i;
    }

    public void i(CalendarDay calendarDay) {
        this.i = calendarDay;
    }

    public void j(@Nullable com.obric.oui.calendar.w.g gVar) {
        if (gVar == null) {
            gVar = com.obric.oui.calendar.w.g.a;
        }
        this.b = gVar;
    }
}
