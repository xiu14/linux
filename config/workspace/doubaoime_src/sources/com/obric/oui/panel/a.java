package com.obric.oui.panel;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.obric.oui.panel.c;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a {
    private static final Interpolator n = new InterpolatorC0360a();
    private final OverScroller a;
    private final c.AbstractC0361c b;

    /* renamed from: c, reason: collision with root package name */
    private final float f7896c;

    /* renamed from: d, reason: collision with root package name */
    private final float f7897d;

    /* renamed from: e, reason: collision with root package name */
    private final float f7898e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewGroup f7899f;

    /* renamed from: g, reason: collision with root package name */
    private int f7900g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private boolean l = false;
    private final Runnable m = new b();

    /* renamed from: com.obric.oui.panel.a$a, reason: collision with other inner class name */
    class InterpolatorC0360a implements Interpolator {
        InterpolatorC0360a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f7899f.removeCallbacks(a.this.m);
            a.this.l = false;
        }
    }

    public a(Context context, ViewGroup viewGroup, c.AbstractC0361c abstractC0361c) {
        this.a = new OverScroller(context, n);
        this.f7899f = viewGroup;
        this.b = abstractC0361c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7898e = viewConfiguration.getScaledTouchSlop();
        this.f7896c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f7897d = viewConfiguration.getScaledMinimumFlingVelocity();
    }

    private int d(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    private int e(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f7899f.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View g(@Nullable View view) {
        if (view == 0) {
            return null;
        }
        if (view.canScrollHorizontally(-this.k) || ((view instanceof com.obric.oui.panel.b) && ((com.obric.oui.panel.b) view).a(-this.k))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View g2 = g(viewGroup.getChildAt(i));
                if (g2 != null) {
                    return g2;
                }
            }
        }
        return null;
    }

    public boolean f(View view, boolean z) {
        if (this.l) {
            boolean computeScrollOffset = this.a.computeScrollOffset();
            int currX = this.a.getCurrX();
            int currY = this.a.getCurrY();
            int left = currX - view.getLeft();
            int top = currY - view.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(view, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(view, top);
            }
            if (left != 0 || top != 0) {
                this.b.e(view, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.a.getFinalX() && currY == this.a.getFinalY()) {
                this.a.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f7899f.post(this.m);
                } else {
                    this.l = false;
                }
            }
        }
        return this.l;
    }

    public boolean h() {
        return this.j;
    }

    public void i(MotionEvent motionEvent, View view, int i, VelocityTracker velocityTracker) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 2) {
            int x = (int) motionEvent.getX();
            int i2 = x - this.i;
            this.i = x;
            int left = view.getLeft();
            int height = (int) (i2 * (view.getHeight() / view.getWidth()) * 1.2f);
            int top = view.getTop() + height;
            int left2 = view.getLeft();
            int top2 = view.getTop();
            if (height != 0) {
                top = this.b.b(view, top, height);
                ViewCompat.offsetTopAndBottom(view, top - top2);
            }
            int i3 = top;
            if (height != 0) {
                this.b.e(view, left, i3, left - left2, i3 - top2);
            }
        }
        if (actionMasked == 1 && i == 1) {
            velocityTracker.computeCurrentVelocity(1000, this.f7896c);
            velocityTracker.computeCurrentVelocity(1000, this.f7896c);
            float xVelocity = velocityTracker.getXVelocity(0);
            float f2 = this.f7897d;
            float f3 = this.f7896c;
            float abs = Math.abs(xVelocity);
            if (abs < f2) {
                xVelocity = 0.0f;
            } else if (abs > f3) {
                xVelocity = xVelocity > 0.0f ? f3 : -f3;
            }
            this.b.f(view, 0.0f, xVelocity);
        }
        if (actionMasked == 3 && i == 1) {
            this.b.f(view, 0.0f, 0.0f);
        }
    }

    public boolean j(View view, int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = view.getLeft();
        int top = view.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.a.abortAnimation();
            return false;
        }
        int d2 = d(i3, (int) this.f7897d, (int) this.f7896c);
        int d3 = d(i4, (int) this.f7897d, (int) this.f7896c);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(d2);
        int abs4 = Math.abs(d3);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (d2 != 0) {
            f2 = abs3;
            f3 = i7;
        } else {
            f2 = abs;
            f3 = i8;
        }
        float f6 = f2 / f3;
        if (d3 != 0) {
            f4 = abs4;
            f5 = i7;
        } else {
            f4 = abs2;
            f5 = i8;
        }
        Objects.requireNonNull(this.b);
        float e2 = e(i6, d3, this.b.c(view)) * (f4 / f5);
        this.a.startScroll(left, top, i5, i6, (int) (e2 + (e(i5, d2, 0) * f6)));
        this.l = true;
        return true;
    }

    public boolean k(View view, MotionEvent motionEvent) {
        this.i = (int) motionEvent.getX();
        boolean z = false;
        this.j = false;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7900g = (int) motionEvent.getX();
            this.h = (int) motionEvent.getY();
        }
        int x = ((int) motionEvent.getX()) - this.f7900g;
        int y = ((int) motionEvent.getY()) - this.h;
        if (actionMasked == 2) {
            float f2 = x;
            if ((Math.abs(f2) > this.f7898e && Math.abs(f2) * 0.5f > Math.abs((float) y)) && g(view) == null) {
                z = true;
            }
        }
        if (z) {
            this.k = x > 0 ? 1 : -1;
            this.b.d(1);
            this.j = true;
        }
        return z;
    }
}
