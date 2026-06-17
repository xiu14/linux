package com.obric.oui.titlebar.behavior;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.obric.oui.titlebar.OUnitedTitleBar;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes2.dex */
public class BaseBehavior<T extends OUnitedTitleBar> extends HeaderBehavior<T> {
    public int j;
    private int k;
    private ValueAnimator l;
    private SavedState m;

    @Nullable
    private WeakReference<View> n;
    private boolean o;

    public static class Behavior extends BaseBehavior<OUnitedTitleBar> {
        public Behavior() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.obric.oui.titlebar.behavior.BaseBehavior, com.obric.oui.titlebar.behavior.HeaderBehavior
        public /* bridge */ /* synthetic */ boolean canDragView(View view) {
            return canDragView((OUnitedTitleBar) view);
        }

        @Override // com.obric.oui.titlebar.behavior.BaseBehavior, com.obric.oui.titlebar.behavior.HeaderBehavior
        public int getMaxDragOffset(@NonNull View view) {
            OUnitedTitleBar oUnitedTitleBar = (OUnitedTitleBar) view;
            return oUnitedTitleBar.p() + (-oUnitedTitleBar.q());
        }

        @Override // com.obric.oui.titlebar.behavior.BaseBehavior, com.obric.oui.titlebar.behavior.HeaderBehavior
        public int getScrollRangeForDragFling(@NonNull View view) {
            return ((OUnitedTitleBar) view).q();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.obric.oui.titlebar.behavior.BaseBehavior, com.obric.oui.titlebar.behavior.HeaderBehavior
        public /* bridge */ /* synthetic */ void onFlingFinished(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            e(coordinatorLayout, (OUnitedTitleBar) view);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.obric.oui.titlebar.behavior.BaseBehavior, com.obric.oui.titlebar.behavior.c, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            f(coordinatorLayout, (OUnitedTitleBar) view, i);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.obric.oui.titlebar.behavior.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, int i4) {
            return onMeasureChild(coordinatorLayout, (OUnitedTitleBar) view, i, i2, i3, i4);
        }

        @Override // com.obric.oui.titlebar.behavior.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i, int i2, int[] iArr, int i3) {
            super.h(coordinatorLayout, (OUnitedTitleBar) view, view2, i2, iArr);
        }

        @Override // com.obric.oui.titlebar.behavior.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i, int i2, int i3, int i4, int i5) {
            super.i(coordinatorLayout, (OUnitedTitleBar) view, i4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.obric.oui.titlebar.behavior.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, Parcelable parcelable) {
            onRestoreInstanceState(coordinatorLayout, (OUnitedTitleBar) view, parcelable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.obric.oui.titlebar.behavior.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            return onSaveInstanceState(coordinatorLayout, (OUnitedTitleBar) view);
        }

        @Override // com.obric.oui.titlebar.behavior.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, View view3, int i, int i2) {
            return super.l(coordinatorLayout, (OUnitedTitleBar) view, view2, i, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.obric.oui.titlebar.behavior.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i) {
            m(coordinatorLayout, (OUnitedTitleBar) view, view2, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.obric.oui.titlebar.behavior.BaseBehavior, com.obric.oui.titlebar.behavior.HeaderBehavior
        public /* bridge */ /* synthetic */ int setHeaderTopBottomOffset(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            return setHeaderTopBottomOffset(coordinatorLayout, (OUnitedTitleBar) view, i, i2, i3);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a extends AccessibilityDelegateCompat {
        a() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setScrollable(BaseBehavior.this.o);
            accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
        }
    }

    public static abstract class b {
        public abstract void a(@NonNull OUnitedTitleBar oUnitedTitleBar, @NonNull View view, float f2);
    }

    public BaseBehavior() {
    }

    private void c(CoordinatorLayout coordinatorLayout, @NonNull T t, int i, float f2) {
        int abs = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
        float abs2 = Math.abs(f2);
        int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
        int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
        if (topBottomOffsetForScrollingSibling == i) {
            ValueAnimator valueAnimator = this.l;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.l.cancel();
            return;
        }
        ValueAnimator valueAnimator2 = this.l;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimator3 = new ValueAnimator();
            this.l = valueAnimator3;
            valueAnimator3.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
            this.l.addUpdateListener(new com.obric.oui.titlebar.behavior.a(this, coordinatorLayout, t));
        } else {
            valueAnimator2.cancel();
        }
        this.l.setDuration(Math.min(round, 600));
        this.l.setIntValues(topBottomOffsetForScrollingSibling, i);
        this.l.start();
    }

    private static boolean checkFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    private void o(CoordinatorLayout coordinatorLayout, @NonNull T t) {
        int paddingTop = t.getPaddingTop() + t.p();
        int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling() - paddingTop;
        int childCount = t.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                i = -1;
                break;
            }
            View childAt = t.getChildAt(i);
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            c cVar = (c) childAt.getLayoutParams();
            if (checkFlag(cVar.a, 32)) {
                top -= ((FrameLayout.LayoutParams) cVar).topMargin;
                bottom += ((FrameLayout.LayoutParams) cVar).bottomMargin;
            }
            int i2 = -topBottomOffsetForScrollingSibling;
            if (top <= i2 && bottom >= i2) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            View childAt2 = t.getChildAt(i);
            c cVar2 = (c) childAt2.getLayoutParams();
            int i3 = cVar2.a;
            if ((i3 & 17) == 17) {
                int i4 = -childAt2.getTop();
                int i5 = -childAt2.getBottom();
                if (i == 0 && ViewCompat.getFitsSystemWindows(t) && ViewCompat.getFitsSystemWindows(childAt2)) {
                    i4 -= t.p();
                }
                if (checkFlag(i3, 2)) {
                    i5 += ViewCompat.getMinimumHeight(childAt2);
                } else if (checkFlag(i3, 5)) {
                    int minimumHeight = ViewCompat.getMinimumHeight(childAt2) + i5;
                    if (topBottomOffsetForScrollingSibling < minimumHeight) {
                        i4 = minimumHeight;
                    } else {
                        i5 = minimumHeight;
                    }
                }
                if (checkFlag(i3, 32)) {
                    i4 += ((FrameLayout.LayoutParams) cVar2).topMargin;
                    i5 -= ((FrameLayout.LayoutParams) cVar2).bottomMargin;
                }
                if (topBottomOffsetForScrollingSibling < (i5 + i4) / 2) {
                    i4 = i5;
                }
                c(coordinatorLayout, t, MathUtils.clamp(i4 + paddingTop, -t.q(), 0), 0.0f);
            }
        }
    }

    private void p(CoordinatorLayout coordinatorLayout, @NonNull T t) {
        View view;
        boolean z;
        boolean z2;
        ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId());
        ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId());
        if (t.q() == 0) {
            return;
        }
        int childCount = coordinatorLayout.getChildCount();
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                view = null;
                break;
            }
            view = coordinatorLayout.getChildAt(i);
            if (((CoordinatorLayout.LayoutParams) view.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior) {
                break;
            } else {
                i++;
            }
        }
        if (view == null) {
            return;
        }
        int childCount2 = t.getChildCount();
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= childCount2) {
                z2 = false;
                break;
            } else {
                if (((c) t.getChildAt(i2).getLayoutParams()).a != 0) {
                    z2 = true;
                    break;
                }
                i2++;
            }
        }
        if (z2) {
            if (!ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, new a());
            }
            if (getTopBottomOffsetForScrollingSibling() != (-t.q())) {
                ViewCompat.replaceAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD, null, new com.obric.oui.titlebar.behavior.b(this, t, false));
                z3 = true;
            }
            if (getTopBottomOffsetForScrollingSibling() == 0 || view.canScrollVertically(-1)) {
                z = z3;
            } else {
                ViewCompat.replaceAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD, null, new com.obric.oui.titlebar.behavior.b(this, t, true));
            }
            this.o = z;
        }
    }

    private void q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i, int i2, boolean z) {
        View view;
        int abs = Math.abs(i);
        int childCount = t.getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                view = null;
                break;
            }
            view = t.getChildAt(i3);
            if (abs >= view.getTop() && abs <= view.getBottom()) {
                break;
            } else {
                i3++;
            }
        }
        if (view != null) {
            int i4 = ((c) view.getLayoutParams()).a;
            if ((i4 & 1) != 0) {
                ViewCompat.getMinimumHeight(view);
                if (i2 > 0 && (i4 & 12) != 0) {
                    view.getBottom();
                    t.p();
                } else if ((i4 & 2) != 0) {
                    view.getBottom();
                    t.p();
                }
            }
        }
        if (z) {
            if (t.getBackground() != null) {
                t.getBackground().jumpToCurrentState();
            }
            if (t.getForeground() != null) {
                t.getForeground().jumpToCurrentState();
            }
            if (t.getStateListAnimator() != null) {
                t.getStateListAnimator().jumpToCurrentState();
            }
        }
    }

    @Override // com.obric.oui.titlebar.behavior.HeaderBehavior
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean canDragView(T t) {
        WeakReference<View> weakReference = this.n;
        if (weakReference == null) {
            return true;
        }
        View view = weakReference.get();
        return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
    }

    public void e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t) {
        o(coordinatorLayout, t);
    }

    public boolean f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i) {
        super.onLayoutChild(coordinatorLayout, t, i);
        int m = t.m();
        SavedState savedState = this.m;
        if (savedState == null || (m & 8) != 0) {
            if (m != 0) {
                boolean z = (m & 4) != 0;
                if ((m & 1) != 0) {
                    int i2 = -t.q();
                    if (z) {
                        c(coordinatorLayout, t, i2, 0.0f);
                    } else {
                        setHeaderTopBottomOffset(coordinatorLayout, t, i2);
                    }
                } else if ((m & 16) != 0) {
                    if (z) {
                        c(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        setHeaderTopBottomOffset(coordinatorLayout, t, 0);
                    }
                }
            }
        } else if (savedState.a) {
            setHeaderTopBottomOffset(coordinatorLayout, t, -t.q());
        } else if (savedState.b) {
            setHeaderTopBottomOffset(coordinatorLayout, t, 0);
        } else {
            View childAt = t.getChildAt(savedState.f8134c);
            int i3 = -childAt.getBottom();
            setHeaderTopBottomOffset(coordinatorLayout, t, this.m.f8136e ? t.p() + ViewCompat.getMinimumHeight(childAt) + i3 : Math.round(childAt.getHeight() * this.m.f8135d) + i3);
        }
        t.s();
        this.m = null;
        setTopAndBottomOffset(MathUtils.clamp(getTopAndBottomOffset(), -t.q(), 0));
        q(coordinatorLayout, t, getTopAndBottomOffset(), 0, true);
        t.g(getTopAndBottomOffset());
        p(coordinatorLayout, t);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i, int i2, int i3, int i4) {
        if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) t.getLayoutParams())).height != -2) {
            return super.onMeasureChild(coordinatorLayout, t, i, i2, i3, i4);
        }
        coordinatorLayout.onMeasureChild(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
        return true;
    }

    @Override // com.obric.oui.titlebar.behavior.HeaderBehavior
    public int getMaxDragOffset(@NonNull View view) {
        OUnitedTitleBar oUnitedTitleBar = (OUnitedTitleBar) view;
        return oUnitedTitleBar.p() + (-oUnitedTitleBar.q());
    }

    @Override // com.obric.oui.titlebar.behavior.HeaderBehavior
    public int getScrollRangeForDragFling(@NonNull View view) {
        return ((OUnitedTitleBar) view).q();
    }

    @Override // com.obric.oui.titlebar.behavior.HeaderBehavior
    public int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset() + this.j;
    }

    public void h(CoordinatorLayout coordinatorLayout, @NonNull OUnitedTitleBar oUnitedTitleBar, View view, int i, int[] iArr) {
        int i2;
        int i3;
        if (i != 0) {
            if (i < 0) {
                i2 = -oUnitedTitleBar.q();
                i3 = i2 + 0;
            } else {
                i2 = -oUnitedTitleBar.q();
                i3 = 0;
            }
            int i4 = i2;
            int i5 = i3;
            if (i4 != i5) {
                iArr[1] = scroll(coordinatorLayout, oUnitedTitleBar, i, i4, i5);
            }
        }
        Objects.requireNonNull(oUnitedTitleBar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i(CoordinatorLayout coordinatorLayout, @NonNull OUnitedTitleBar oUnitedTitleBar, int i) {
        if (i < 0) {
            scroll(coordinatorLayout, oUnitedTitleBar, i, -oUnitedTitleBar.q(), 0);
        }
        if (i == 0) {
            p(coordinatorLayout, oUnitedTitleBar);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(coordinatorLayout, t, parcelable);
            this.m = null;
        } else {
            SavedState savedState = (SavedState) parcelable;
            SavedState savedState2 = this.m;
            this.m = savedState;
            super.onRestoreInstanceState(coordinatorLayout, t, savedState.getSuperState());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t) {
        SavedState savedState;
        Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t);
        int topAndBottomOffset = getTopAndBottomOffset();
        int childCount = t.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                savedState = null;
                break;
            }
            View childAt = t.getChildAt(i);
            int bottom = childAt.getBottom() + topAndBottomOffset;
            if (childAt.getTop() + topAndBottomOffset > 0 || bottom < 0) {
                i++;
            } else {
                savedState = new SavedState(onSaveInstanceState == null ? AbsSavedState.EMPTY_STATE : onSaveInstanceState);
                boolean z = topAndBottomOffset == 0;
                savedState.b = z;
                savedState.a = !z && (-topAndBottomOffset) >= t.q();
                savedState.f8134c = i;
                savedState.f8136e = bottom == t.p() + ViewCompat.getMinimumHeight(childAt);
                savedState.f8135d = bottom / childAt.getHeight();
            }
        }
        return savedState == null ? onSaveInstanceState : savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (((r4.q() != 0) && r3.getHeight() - r5.getHeight() <= r4.getHeight()) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull com.obric.oui.titlebar.OUnitedTitleBar r4, @androidx.annotation.NonNull android.view.View r5, int r6, int r7) {
        /*
            r2 = this;
            r6 = r6 & 2
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L29
            java.util.Objects.requireNonNull(r4)
            int r6 = r4.q()
            if (r6 == 0) goto L11
            r6 = r0
            goto L12
        L11:
            r6 = r1
        L12:
            if (r6 == 0) goto L25
            int r3 = r3.getHeight()
            int r5 = r5.getHeight()
            int r3 = r3 - r5
            int r4 = r4.getHeight()
            if (r3 > r4) goto L25
            r3 = r0
            goto L26
        L25:
            r3 = r1
        L26:
            if (r3 == 0) goto L29
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 == 0) goto L33
            android.animation.ValueAnimator r3 = r2.l
            if (r3 == 0) goto L33
            r3.cancel()
        L33:
            r3 = 0
            r2.n = r3
            r2.k = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.titlebar.behavior.BaseBehavior.l(androidx.coordinatorlayout.widget.CoordinatorLayout, com.obric.oui.titlebar.OUnitedTitleBar, android.view.View, int, int):boolean");
    }

    public void m(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i) {
        if (this.k == 0 || i == 1) {
            o(coordinatorLayout, t);
        }
        this.n = new WeakReference<>(view);
    }

    @Override // com.obric.oui.titlebar.behavior.HeaderBehavior
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int setHeaderTopBottomOffset(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i, int i2, int i3) {
        int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
        int i4 = 0;
        if (i2 == 0 || topBottomOffsetForScrollingSibling < i2 || topBottomOffsetForScrollingSibling > i3) {
            this.j = 0;
        } else {
            int clamp = MathUtils.clamp(i, i2, i3);
            if (topBottomOffsetForScrollingSibling != clamp) {
                Objects.requireNonNull(t);
                boolean topAndBottomOffset = setTopAndBottomOffset(clamp);
                int i5 = topBottomOffsetForScrollingSibling - clamp;
                this.j = clamp - clamp;
                if (topAndBottomOffset) {
                    while (i4 < t.getChildCount()) {
                        c cVar = (c) t.getChildAt(i4).getLayoutParams();
                        b a2 = cVar.a();
                        if (a2 != null && (cVar.a & 1) != 0) {
                            a2.a(t, t.getChildAt(i4), getTopAndBottomOffset());
                        }
                        i4++;
                    }
                }
                t.g(getTopAndBottomOffset());
                q(coordinatorLayout, t, clamp, clamp < topBottomOffsetForScrollingSibling ? -1 : 1, false);
                i4 = i5;
            }
        }
        p(coordinatorLayout, t);
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.obric.oui.titlebar.behavior.HeaderBehavior
    public void onFlingFinished(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        o(coordinatorLayout, (OUnitedTitleBar) view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.obric.oui.titlebar.behavior.c, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        f(coordinatorLayout, (OUnitedTitleBar) view, i);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i, int i2, int[] iArr, int i3) {
        h(coordinatorLayout, (OUnitedTitleBar) view, view2, i2, iArr);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i, int i2, int i3, int i4, int i5) {
        i(coordinatorLayout, (OUnitedTitleBar) view, i4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, View view3, int i, int i2) {
        return l(coordinatorLayout, (OUnitedTitleBar) view, view2, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i) {
        OUnitedTitleBar oUnitedTitleBar = (OUnitedTitleBar) view;
        if (this.k == 0 || i == 1) {
            o(coordinatorLayout, oUnitedTitleBar);
        }
        this.n = new WeakReference<>(view2);
    }

    public BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean a;
        boolean b;

        /* renamed from: c, reason: collision with root package name */
        int f8134c;

        /* renamed from: d, reason: collision with root package name */
        float f8135d;

        /* renamed from: e, reason: collision with root package name */
        boolean f8136e;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readByte() != 0;
            this.b = parcel.readByte() != 0;
            this.f8134c = parcel.readInt();
            this.f8135d = parcel.readFloat();
            this.f8136e = parcel.readByte() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f8134c);
            parcel.writeFloat(this.f8135d);
            parcel.writeByte(this.f8136e ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class c extends FrameLayout.LayoutParams {
        int a;
        private b b;

        /* renamed from: c, reason: collision with root package name */
        Interpolator f8137c;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            this.b = null;
            int i = R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f8137c = android.view.animation.AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        @Nullable
        public b a() {
            return this.b;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }
    }
}
