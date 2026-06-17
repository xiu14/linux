package com.obric.oui.panel;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.obric.oui.panel.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    int A;
    private int B;
    boolean C;
    private Map<View, Integer> D;
    boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private final c.AbstractC0361c I;

    /* renamed from: J, reason: collision with root package name */
    private final c.AbstractC0361c f7876J;
    protected boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private int f7877c;

    /* renamed from: d, reason: collision with root package name */
    private float f7878d;

    /* renamed from: e, reason: collision with root package name */
    private int f7879e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7880f;

    /* renamed from: g, reason: collision with root package name */
    private int f7881g;
    protected int h;
    protected int i;
    int j;
    protected int k;
    boolean l;
    private boolean m;
    private boolean n;
    int o;
    int p;
    com.obric.oui.panel.c q;
    com.obric.oui.panel.a r;
    private boolean s;
    private int t;
    private boolean u;
    protected int v;
    WeakReference<V> w;
    WeakReference<View> x;

    @NonNull
    private final ArrayList<d> y;
    private VelocityTracker z;

    class a implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ int b;

        a(View view, int i) {
            this.a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.j(this.a, this.b);
        }
    }

    class b extends c.AbstractC0361c {
        b() {
        }

        @Override // com.obric.oui.panel.c.AbstractC0361c
        public int a(@NonNull View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // com.obric.oui.panel.c.AbstractC0361c
        public int b(@NonNull View view, int i, int i2) {
            int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return MathUtils.clamp(i, expandedOffset, bottomSheetBehavior.l ? bottomSheetBehavior.v : bottomSheetBehavior.k);
        }

        @Override // com.obric.oui.panel.c.AbstractC0361c
        public int c(@NonNull View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.l ? bottomSheetBehavior.v : bottomSheetBehavior.k;
        }

        @Override // com.obric.oui.panel.c.AbstractC0361c
        public void d(int i) {
            if (i == 1 && BottomSheetBehavior.this.m) {
                BottomSheetBehavior.this.setStateInternal(1);
            }
        }

        @Override // com.obric.oui.panel.c.AbstractC0361c
        public void e(@NonNull View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.dispatchOnSlide(i2);
        }

        @Override // com.obric.oui.panel.c.AbstractC0361c
        public void f(@NonNull View view, float f2, float f3) {
            int[] b = BottomSheetBehavior.b(BottomSheetBehavior.this, view, f2, f3);
            int i = b[0];
            int i2 = b[1];
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            bottomSheetBehavior.p = i2;
            if (!bottomSheetBehavior.q.w(view.getLeft(), i)) {
                BottomSheetBehavior.this.setStateInternal(i2);
            } else {
                BottomSheetBehavior.this.setStateInternal(2);
                ViewCompat.postOnAnimation(view, new f(view, i2));
            }
        }

        @Override // com.obric.oui.panel.c.AbstractC0361c
        public boolean g(@NonNull View view, int i) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.o;
            if (i2 == 1 || bottomSheetBehavior.C) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.A == i && (view2 = bottomSheetBehavior.x.get()) != null && view2.canScrollVertically(-1)) {
                return false;
            }
            WeakReference<V> weakReference = BottomSheetBehavior.this.w;
            return weakReference != null && weakReference.get() == view;
        }
    }

    class c extends c.AbstractC0361c {
        c() {
        }

        @Override // com.obric.oui.panel.c.AbstractC0361c
        public int a(@NonNull View view, int i, int i2) {
            return BottomSheetBehavior.this.I.a(view, i, i2);
        }

        @Override // com.obric.oui.panel.c.AbstractC0361c
        public int b(@NonNull View view, int i, int i2) {
            return BottomSheetBehavior.this.I.b(view, i, i2);
        }

        @Override // com.obric.oui.panel.c.AbstractC0361c
        public int c(@NonNull View view) {
            return BottomSheetBehavior.this.I.c(view);
        }

        @Override // com.obric.oui.panel.c.AbstractC0361c
        public void d(int i) {
            BottomSheetBehavior.this.I.d(i);
        }

        @Override // com.obric.oui.panel.c.AbstractC0361c
        public void e(@NonNull View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.I.e(view, i, i2, i3, i4);
        }

        @Override // com.obric.oui.panel.c.AbstractC0361c
        public void f(@NonNull View view, float f2, float f3) {
            int[] b = BottomSheetBehavior.b(BottomSheetBehavior.this, view, f2, f3);
            int i = b[0];
            int i2 = b[1];
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            bottomSheetBehavior.p = i2;
            if (!bottomSheetBehavior.r.j(view, view.getLeft(), i, (int) f2, (int) f3)) {
                BottomSheetBehavior.this.setStateInternal(i2);
            } else {
                BottomSheetBehavior.this.setStateInternal(2);
                ViewCompat.postOnAnimation(view, new e(view, i2));
            }
        }

        @Override // com.obric.oui.panel.c.AbstractC0361c
        public boolean g(@NonNull View view, int i) {
            return BottomSheetBehavior.this.I.g(view, i);
        }
    }

    public static abstract class d {
        public abstract void a(@NonNull View view, float f2);

        public abstract void b(@NonNull View view, int i);
    }

    private class e implements Runnable {
        private final View a;
        private final int b;

        e(View view, int i) {
            this.a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.obric.oui.panel.a aVar = BottomSheetBehavior.this.r;
            if (aVar == null || !aVar.f(this.a, true)) {
                BottomSheetBehavior.this.setStateInternal(this.b);
            } else {
                ViewCompat.postOnAnimation(this.a, this);
            }
        }
    }

    private class f implements Runnable {
        private final View a;
        private final int b;

        f(View view, int i) {
            this.a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.obric.oui.panel.c cVar = BottomSheetBehavior.this.q;
            if (cVar == null || !cVar.i(true)) {
                BottomSheetBehavior.this.setStateInternal(this.b);
            } else {
                ViewCompat.postOnAnimation(this.a, this);
            }
        }
    }

    public BottomSheetBehavior() {
        this.a = true;
        this.b = false;
        this.f7877c = -1;
        this.m = true;
        this.n = false;
        this.o = 4;
        this.p = 4;
        this.y = new ArrayList<>();
        this.E = true;
        this.F = false;
        this.G = true;
        this.H = 600;
        this.I = new b();
        this.f7876J = new c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r8 > r7) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int[] b(com.obric.oui.panel.BottomSheetBehavior r7, android.view.View r8, float r9, float r10) {
        /*
            java.util.Objects.requireNonNull(r7)
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 6
            r3 = 0
            r4 = 4
            r5 = 3
            if (r1 >= 0) goto L2a
            float r1 = java.lang.Math.abs(r10)
            r6 = 1153138688(0x44bb8000, float:1500.0)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L2a
            boolean r9 = r7.a
            if (r9 == 0) goto L20
            int r7 = r7.i
            r4 = r5
            goto La9
        L20:
            int r8 = r8.getTop()
            int r7 = r7.j
            if (r8 <= r7) goto L8d
            goto La8
        L2a:
            boolean r1 = r7.l
            if (r1 == 0) goto L4c
            boolean r1 = r7.shouldHide(r8, r10)
            if (r1 == 0) goto L4c
            int r1 = r8.getTop()
            int r6 = r7.k
            if (r1 > r6) goto L48
            float r1 = java.lang.Math.abs(r9)
            float r6 = java.lang.Math.abs(r10)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto L4c
        L48:
            int r7 = r7.v
            r4 = 5
            goto La9
        L4c:
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L60
            float r9 = java.lang.Math.abs(r9)
            float r10 = java.lang.Math.abs(r10)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L5d
            goto L60
        L5d:
            int r7 = r7.k
            goto La9
        L60:
            int r8 = r8.getTop()
            boolean r9 = r7.a
            if (r9 == 0) goto L7f
            int r9 = r7.i
            int r9 = r8 - r9
            int r9 = java.lang.Math.abs(r9)
            int r10 = r7.k
            int r8 = r8 - r10
            int r8 = java.lang.Math.abs(r8)
            if (r9 >= r8) goto L7c
            int r7 = r7.i
            goto L8e
        L7c:
            int r7 = r7.k
            goto La7
        L7f:
            int r9 = r7.j
            if (r8 >= r9) goto L93
            int r9 = r7.k
            int r9 = r8 - r9
            int r9 = java.lang.Math.abs(r9)
            if (r8 >= r9) goto L90
        L8d:
            r7 = r3
        L8e:
            r2 = r5
            goto La8
        L90:
            int r7 = r7.j
            goto La8
        L93:
            int r9 = r8 - r9
            int r9 = java.lang.Math.abs(r9)
            int r10 = r7.k
            int r8 = r8 - r10
            int r8 = java.lang.Math.abs(r8)
            if (r9 >= r8) goto La5
            int r7 = r7.j
            goto La8
        La5:
            int r7 = r7.k
        La7:
            r2 = r4
        La8:
            r4 = r2
        La9:
            r8 = 2
            int[] r8 = new int[r8]
            r8[r3] = r7
            r7 = 1
            r8[r7] = r4
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.panel.BottomSheetBehavior.b(com.obric.oui.panel.BottomSheetBehavior, android.view.View, float, float):int[]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getExpandedOffset() {
        if (this.a) {
            return this.i;
        }
        return 0;
    }

    private void updateImportantForAccessibility(boolean z) {
        WeakReference<V> weakReference = this.w;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.D != null) {
                    return;
                } else {
                    this.D = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.w.get()) {
                    if (z) {
                        this.D.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        ViewCompat.setImportantForAccessibility(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.D;
                        if (map != null && map.containsKey(childAt)) {
                            ViewCompat.setImportantForAccessibility(childAt, this.D.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z) {
                return;
            }
            this.D = null;
        }
    }

    protected void calculateCollapsedOffset() {
        if (this.a) {
            this.k = Math.max(this.v - this.h, this.i);
        } else {
            this.k = this.v - this.h;
        }
    }

    void dispatchOnSlide(int i) {
        V v = this.w.get();
        if (v == null || this.y.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (i > this.k) {
            while (i2 < this.y.size()) {
                d dVar = this.y.get(i2);
                int i3 = this.k;
                dVar.a(v, (i3 - i) / (this.v - i3));
                i2++;
            }
            return;
        }
        while (i2 < this.y.size()) {
            d dVar2 = this.y.get(i2);
            int i4 = this.k;
            dVar2.a(v, (i4 - i) / (i4 - getExpandedOffset()));
            i2++;
        }
    }

    public void e(boolean z) {
        this.F = z;
    }

    public void f(boolean z) {
        this.G = z;
    }

    @Nullable
    @VisibleForTesting
    View findScrollingChild(@Nullable View view) {
        if (view == null) {
            return null;
        }
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                if (findScrollingChild != null) {
                    return findScrollingChild;
                }
            }
        }
        return null;
    }

    @Deprecated
    public void g(d dVar) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.y.clear();
        if (dVar != null) {
            this.y.add(dVar);
        }
    }

    public void h(boolean z) {
        this.b = z;
    }

    public void i(int i) {
        this.f7877c = i;
    }

    void j(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.k;
        } else if (i == 6) {
            int i4 = this.j;
            if (!this.a || i4 > (i3 = this.i)) {
                i2 = i4;
            } else {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = getExpandedOffset();
        } else {
            if (!this.l || i != 5) {
                throw new IllegalArgumentException(e.a.a.a.a.j("Illegal state argument: ", i));
            }
            i2 = this.v;
        }
        if (!this.q.y(view, view.getLeft(), i2)) {
            setStateInternal(i);
        } else {
            setStateInternal(2);
            ViewCompat.postOnAnimation(view, new f(view, i));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        com.obric.oui.panel.c cVar;
        com.obric.oui.panel.a aVar;
        if (!v.isShown() || !this.m) {
            this.s = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A = -1;
            VelocityTracker velocityTracker = this.z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.z = null;
            }
        }
        if (this.z == null) {
            this.z = VelocityTracker.obtain();
        }
        this.z.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.B = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.x;
            View view = weakReference != null ? weakReference.get() : null;
            if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.B)) {
                this.A = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.C = true;
            }
            this.s = this.A == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.B);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
            this.A = -1;
            if (this.s) {
                this.s = false;
                return false;
            }
        }
        if (this.F && !this.s && (aVar = this.r) != null && aVar.k(v, motionEvent)) {
            return true;
        }
        if (!this.s && (cVar = this.q) != null && cVar.x(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.x;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.s || this.o == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.q == null || Math.abs(((float) this.B) - motionEvent.getY()) <= ((float) this.q.n())) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r9, V r10, int r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.panel.BottomSheetBehavior.onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f2, float f3) {
        return view == this.x.get() && (this.o != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f2, f3));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (i3 != 1 && view == this.x.get()) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < getExpandedOffset()) {
                    iArr[1] = top - getExpandedOffset();
                    ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                    setStateInternal(3);
                } else {
                    if (!this.m) {
                        return;
                    }
                    iArr[1] = i2;
                    ViewCompat.offsetTopAndBottom(v, -i2);
                    setStateInternal(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.k;
                if (i4 > i5 && !this.l) {
                    iArr[1] = top - i5;
                    ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                    setStateInternal(4);
                } else {
                    if (!this.m) {
                        return;
                    }
                    iArr[1] = i2;
                    ViewCompat.offsetTopAndBottom(v, -i2);
                    setStateInternal(1);
                }
            }
            dispatchOnSlide(v.getTop());
            this.t = i2;
            this.u = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        int i = savedState.a;
        if (i == 1 || i == 2) {
            this.o = 4;
        } else {
            this.o = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), this.o);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.t = 0;
        this.u = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        int i2;
        float yVelocity;
        int i3 = 3;
        if (v.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        if (view == this.x.get() && this.u) {
            if (this.t > 0) {
                i2 = getExpandedOffset();
            } else {
                if (this.l) {
                    VelocityTracker velocityTracker = this.z;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.f7878d);
                        yVelocity = this.z.getYVelocity(this.A);
                    }
                    if (shouldHide(v, yVelocity)) {
                        i2 = this.v;
                        i3 = 5;
                    }
                }
                if (this.t == 0) {
                    int top = v.getTop();
                    if (!this.a) {
                        int i4 = this.j;
                        if (top < i4) {
                            if (top < Math.abs(top - this.k)) {
                                i2 = 0;
                            } else {
                                i2 = this.j;
                            }
                        } else if (Math.abs(top - i4) < Math.abs(top - this.k)) {
                            i2 = this.j;
                        } else {
                            i2 = this.k;
                        }
                        i3 = 6;
                    } else if (Math.abs(top - this.i) < Math.abs(top - this.k)) {
                        i2 = this.i;
                    } else {
                        i2 = this.k;
                    }
                } else {
                    i2 = this.k;
                }
                i3 = 4;
            }
            this.p = i3;
            if (this.q.y(v, v.getLeft(), i2)) {
                setStateInternal(2);
                ViewCompat.postOnAnimation(v, new f(v, i3));
            } else {
                setStateInternal(i3);
            }
            this.u = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        com.obric.oui.panel.a aVar;
        com.obric.oui.panel.a aVar2;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.o == 1 && actionMasked == 0) {
            return true;
        }
        if (actionMasked == 0) {
            this.A = -1;
            VelocityTracker velocityTracker = this.z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.z = null;
            }
        }
        if (this.z == null) {
            this.z = VelocityTracker.obtain();
        }
        this.z.addMovement(motionEvent);
        if (this.F && (aVar2 = this.r) != null && aVar2.h()) {
            this.r.i(motionEvent, v, this.o, this.z);
        } else {
            com.obric.oui.panel.c cVar = this.q;
            if (cVar != null) {
                cVar.p(motionEvent);
            }
        }
        if (this.F && (aVar = this.r) != null && aVar.h()) {
            z = this.s;
        } else {
            if (actionMasked == 2 && !this.s && Math.abs(this.B - motionEvent.getY()) > this.q.n()) {
                this.q.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            z = this.s;
        }
        return !z;
    }

    public void setDraggable(boolean z) {
        this.m = z;
    }

    public final void setPeekHeight(int i) {
        WeakReference<V> weakReference;
        V v;
        boolean z = true;
        if (i == -1) {
            if (!this.f7880f) {
                this.f7880f = true;
            }
            z = false;
        } else {
            if (this.f7880f || this.f7879e != i) {
                this.f7880f = false;
                this.f7879e = Math.max(0, i);
                this.k = this.v - i;
            }
            z = false;
        }
        if (!z || this.o != 4 || (weakReference = this.w) == null || (v = weakReference.get()) == null) {
            return;
        }
        v.requestLayout();
    }

    public final void setState(int i) {
        if (i == this.o) {
            return;
        }
        WeakReference<V> weakReference = this.w;
        if (weakReference == null) {
            if (i == 4 || i == 3 || i == 6 || (this.l && i == 5)) {
                this.o = i;
                return;
            }
            return;
        }
        V v = weakReference.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v)) {
            v.post(new a(v, i));
        } else {
            j(v, i);
        }
    }

    void setStateInternal(int i) {
        if (this.o == i) {
            return;
        }
        this.o = i;
        if (i == 6 || i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        V v = this.w.get();
        for (int i2 = 0; i2 < this.y.size(); i2++) {
            this.y.get(i2).b(v, i);
        }
    }

    boolean shouldHide(View view, float f2) {
        if (this.n) {
            return true;
        }
        if (f2 == 0.0f) {
            if (this.b) {
                return view.getTop() > (this.h / 2) + this.k;
            }
            return view.getTop() > ((this.v - getExpandedOffset()) / 2) + getExpandedOffset();
        }
        if (this.p != 4 || this.f7879e <= e.i.a.b.a.e(view.getContext()) / 2) {
            return Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.k)) / ((float) this.f7879e) > 0.5f;
        }
        return f2 > this.f7878d * 0.08f;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        final int a;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.a = i;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.a = true;
        this.b = false;
        this.f7877c = -1;
        this.m = true;
        this.n = false;
        this.o = 4;
        this.p = 4;
        this.y = new ArrayList<>();
        this.E = true;
        this.F = false;
        this.G = true;
        this.H = 600;
        this.I = new b();
        this.f7876J = new c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        int i2 = R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i2);
        if (peekValue != null && (i = peekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(i2, -1));
        }
        this.l = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.a != z) {
            this.a = z;
            if (this.w != null) {
                calculateCollapsedOffset();
            }
            setStateInternal((this.a && this.o == 6) ? 3 : this.o);
        }
        this.n = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        obtainStyledAttributes.recycle();
        this.f7878d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
