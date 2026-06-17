package com.obric.oui.panel;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public class c {
    private static final Interpolator w = new a();
    private int a;
    private int b;

    /* renamed from: d, reason: collision with root package name */
    private float[] f7902d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f7903e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f7904f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f7905g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private OverScroller p;
    private final AbstractC0361c q;
    private View r;
    private boolean s;
    private final ViewGroup t;

    /* renamed from: c, reason: collision with root package name */
    private int f7901c = -1;
    private int u = 600;
    private final Runnable v = new b();

    class a implements Interpolator {
        a() {
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
            c.this.u(0);
        }
    }

    /* renamed from: com.obric.oui.panel.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0361c {
        public abstract int a(@NonNull View view, int i, int i2);

        public abstract int b(@NonNull View view, int i, int i2);

        public abstract int c(@NonNull View view);

        public abstract void d(int i);

        public abstract void e(@NonNull View view, int i, int i2, @Px int i3, @Px int i4);

        public abstract void f(@NonNull View view, float f2, float f3);

        public abstract boolean g(@NonNull View view, int i);
    }

    private c(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull AbstractC0361c abstractC0361c) {
        if (abstractC0361c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.t = viewGroup;
        this.q = abstractC0361c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.p = new OverScroller(context, w);
    }

    private boolean c(float f2, float f3, int i, int i2) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.h[i] & i2) != i2 || (0 & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            Objects.requireNonNull(this.q);
        }
        return (this.i[i] & i2) == 0 && abs > ((float) this.b);
    }

    private boolean d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        Objects.requireNonNull(this.q);
        return (this.q.c(view) > 0) && Math.abs(f3) > ((float) this.b);
    }

    private float e(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    private int f(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    private void g(int i) {
        float[] fArr = this.f7902d;
        if (fArr != null) {
            int i2 = this.k;
            int i3 = 1 << i;
            if ((i3 & i2) != 0) {
                fArr[i] = 0.0f;
                this.f7903e[i] = 0.0f;
                this.f7904f[i] = 0.0f;
                this.f7905g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k = (~i3) & i2;
            }
        }
    }

    private int h(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), this.u);
    }

    public static c j(@NonNull ViewGroup viewGroup, @NonNull AbstractC0361c abstractC0361c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0361c);
    }

    private void k(float f2, float f3) {
        this.s = true;
        this.q.f(this.r, f2, f3);
        this.s = false;
        if (this.a == 1) {
            u(0);
        }
    }

    private boolean m(int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.r.getLeft();
        int top = this.r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.p.abortAnimation();
            u(0);
            return false;
        }
        View view = this.r;
        int f6 = f(i3, (int) this.n, (int) this.m);
        int f7 = f(i4, (int) this.n, (int) this.m);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(f6);
        int abs4 = Math.abs(f7);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (f6 != 0) {
            f2 = abs3;
            f3 = i7;
        } else {
            f2 = abs;
            f3 = i8;
        }
        float f8 = f2 / f3;
        if (f7 != 0) {
            f4 = abs4;
            f5 = i7;
        } else {
            f4 = abs2;
            f5 = i8;
        }
        Objects.requireNonNull(this.q);
        float h = h(i6, f7, this.q.c(view)) * (f4 / f5);
        this.p.startScroll(left, top, i5, i6, (int) (h + (h(i5, f6, 0) * f8)));
        u(2);
        return true;
    }

    private boolean o(int i) {
        if ((this.k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void q() {
        this.l.computeCurrentVelocity(1000, this.m);
        k(e(this.l.getXVelocity(this.f7901c), this.n, this.m), e(this.l.getYVelocity(this.f7901c), this.n, this.m));
    }

    private void r(float f2, float f3, int i) {
        int i2 = c(f2, f3, i, 1) ? 1 : 0;
        if (c(f3, f2, i, 4)) {
            i2 |= 4;
        }
        if (c(f2, f3, i, 2)) {
            i2 |= 2;
        }
        if (c(f3, f2, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | i2;
            Objects.requireNonNull(this.q);
        }
    }

    private void s(float f2, float f3, int i) {
        float[] fArr = this.f7902d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f7903e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f7904f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f7905g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f7902d = fArr2;
            this.f7903e = fArr3;
            this.f7904f = fArr4;
            this.f7905g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f7902d;
        this.f7904f[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.f7903e;
        this.f7905g[i] = f3;
        fArr10[i] = f3;
        int[] iArr7 = this.h;
        int i3 = (int) f2;
        int i4 = (int) f3;
        int i5 = i3 < this.t.getLeft() + this.o ? 1 : 0;
        if (i4 < this.t.getTop() + this.o) {
            i5 |= 4;
        }
        if (i3 > this.t.getRight() - this.o) {
            i5 |= 2;
        }
        if (i4 > this.t.getBottom() - this.o) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.k |= 1 << i;
    }

    private void t(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (o(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f7904f[pointerId] = x;
                this.f7905g[pointerId] = y;
            }
        }
    }

    public void a() {
        this.f7901c = -1;
        float[] fArr = this.f7902d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f7903e, 0.0f);
            Arrays.fill(this.f7904f, 0.0f);
            Arrays.fill(this.f7905g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void b(@NonNull View view, int i) {
        if (view.getParent() != this.t) {
            StringBuilder M = e.a.a.a.a.M("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            M.append(this.t);
            M.append(")");
            throw new IllegalArgumentException(M.toString());
        }
        this.r = view;
        this.f7901c = i;
        Objects.requireNonNull(this.q);
        u(1);
    }

    public boolean i(boolean z) {
        if (this.a == 2) {
            boolean computeScrollOffset = this.p.computeScrollOffset();
            int currX = this.p.getCurrX();
            int currY = this.p.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.r, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.r, top);
            }
            if (left != 0 || top != 0) {
                this.q.e(this.r, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.p.getFinalX() && currY == this.p.getFinalY()) {
                this.p.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.t.post(this.v);
                } else {
                    u(0);
                }
            }
        }
        return this.a == 2;
    }

    @Nullable
    public View l(int i, int i2) {
        for (int childCount = this.t.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.t;
            Objects.requireNonNull(this.q);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    @Px
    public int n() {
        return this.b;
    }

    public void p(@NonNull MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View l = l((int) x, (int) y);
            s(x, y, pointerId);
            z(l, pointerId);
            if ((this.h[pointerId] & 0) != 0) {
                Objects.requireNonNull(this.q);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.a == 1) {
                q();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i2 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if (o(pointerId2)) {
                        float x2 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f2 = x2 - this.f7902d[pointerId2];
                        float f3 = y2 - this.f7903e[pointerId2];
                        r(f2, f3, pointerId2);
                        if (this.a != 1) {
                            View l2 = l((int) x2, (int) y2);
                            if (d(l2, f2, f3) && z(l2, pointerId2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i2++;
                }
                t(motionEvent);
                return;
            }
            if (o(this.f7901c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f7901c);
                float x3 = motionEvent.getX(findPointerIndex);
                float y3 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f7904f;
                int i3 = this.f7901c;
                int i4 = (int) (x3 - fArr[i3]);
                int i5 = (int) (y3 - this.f7905g[i3]);
                int left = this.r.getLeft() + i4;
                int top = this.r.getTop() + i5;
                int left2 = this.r.getLeft();
                int top2 = this.r.getTop();
                if (i4 != 0) {
                    left = this.q.a(this.r, left, i4);
                    ViewCompat.offsetLeftAndRight(this.r, left - left2);
                }
                int i6 = left;
                if (i5 != 0) {
                    top = this.q.b(this.r, top, i5);
                    ViewCompat.offsetTopAndBottom(this.r, top - top2);
                }
                int i7 = top;
                if (i4 != 0 || i5 != 0) {
                    this.q.e(this.r, i6, i7, i6 - left2, i7 - top2);
                }
                t(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.a == 1) {
                k(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.a == 1 && pointerId3 == this.f7901c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount2) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f7901c) {
                        View l3 = l((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view = this.r;
                        if (l3 == view && z(view, pointerId4)) {
                            i = this.f7901c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    q();
                }
            }
            g(pointerId3);
            return;
        }
        int pointerId5 = motionEvent.getPointerId(actionIndex);
        float x4 = motionEvent.getX(actionIndex);
        float y4 = motionEvent.getY(actionIndex);
        s(x4, y4, pointerId5);
        if (this.a == 0) {
            z(l((int) x4, (int) y4), pointerId5);
            if ((this.h[pointerId5] & 0) != 0) {
                Objects.requireNonNull(this.q);
                return;
            }
            return;
        }
        int i8 = (int) x4;
        int i9 = (int) y4;
        View view2 = this.r;
        if (view2 != null && i8 >= view2.getLeft() && i8 < view2.getRight() && i9 >= view2.getTop() && i9 < view2.getBottom()) {
            i2 = 1;
        }
        if (i2 != 0) {
            z(this.r, pointerId5);
        }
    }

    void u(int i) {
        this.t.removeCallbacks(this.v);
        if (this.a != i) {
            this.a = i;
            this.q.d(i);
            if (this.a == 0) {
                this.r = null;
            }
        }
    }

    public void v(int i) {
        this.u = i;
    }

    public boolean w(int i, int i2) {
        if (this.s) {
            return m(i, i2, (int) this.l.getXVelocity(this.f7901c), (int) this.l.getYVelocity(this.f7901c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public boolean x(@NonNull MotionEvent motionEvent) {
        View l;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y = motionEvent.getY(actionIndex);
                            s(x, y, pointerId);
                            int i = this.a;
                            if (i == 0) {
                                if ((this.h[pointerId] & 0) != 0) {
                                    Objects.requireNonNull(this.q);
                                }
                            } else if (i == 2 && (l = l((int) x, (int) y)) == this.r) {
                                z(l, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            g(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f7902d != null && this.f7903e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (o(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f2 = x2 - this.f7902d[pointerId2];
                            float f3 = y2 - this.f7903e[pointerId2];
                            View l2 = l((int) x2, (int) y2);
                            boolean z = l2 != null && d(l2, f2, f3);
                            if (z) {
                                int i3 = (int) f2;
                                this.q.a(l2, l2.getLeft() + i3, i3);
                                int top = l2.getTop();
                                int i4 = (int) f3;
                                int b2 = this.q.b(l2, top + i4, i4);
                                Objects.requireNonNull(this.q);
                                int c2 = this.q.c(l2);
                                if (c2 == 0) {
                                    break;
                                }
                                if (c2 > 0 && b2 == top) {
                                    break;
                                }
                            }
                            r(f2, f3, pointerId2);
                            if (this.a == 1) {
                                break;
                            }
                            if (z && z(l2, pointerId2)) {
                                break;
                            }
                        }
                    }
                    t(motionEvent);
                }
            }
            a();
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            s(x3, y3, pointerId3);
            View l3 = l((int) x3, (int) y3);
            if (l3 == this.r && this.a == 2) {
                z(l3, pointerId3);
            }
            if ((this.h[pointerId3] & 0) != 0) {
                Objects.requireNonNull(this.q);
            }
        }
        return this.a == 1;
    }

    public boolean y(@NonNull View view, int i, int i2) {
        this.r = view;
        this.f7901c = -1;
        boolean m = m(i, i2, 0, 0);
        if (!m && this.a == 0 && this.r != null) {
            this.r = null;
        }
        return m;
    }

    boolean z(View view, int i) {
        if (view == this.r && this.f7901c == i) {
            return true;
        }
        if (view == null || !this.q.g(view, i)) {
            return false;
        }
        this.f7901c = i;
        b(view, i);
        return true;
    }
}
