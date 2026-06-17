package com.obric.oui.titlebar.behavior;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.obric.oui.titlebar.OUnitedTitleBar;
import java.util.List;
import java.util.Objects;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class ScrollingViewBehavior extends HeaderScrollingViewBehavior {

    /* renamed from: g, reason: collision with root package name */
    public static final a f8148g = new a(null);

    public static final class a {
        public a(g gVar) {
        }
    }

    public ScrollingViewBehavior() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.obric.oui.titlebar.behavior.HeaderScrollingViewBehavior
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public OUnitedTitleBar findFirstDependency(List<? extends View> list) {
        l.f(list, "views");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = list.get(i);
            if (view instanceof OUnitedTitleBar) {
                return (OUnitedTitleBar) view;
            }
        }
        return null;
    }

    @Override // com.obric.oui.titlebar.behavior.HeaderScrollingViewBehavior
    protected float getOverlapRatioForOffset(View view) {
        l.f(view, "header");
        if (!(view instanceof OUnitedTitleBar)) {
            return 0.0f;
        }
        OUnitedTitleBar oUnitedTitleBar = (OUnitedTitleBar) view;
        int q = oUnitedTitleBar.q();
        ViewGroup.LayoutParams layoutParams = oUnitedTitleBar.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        int topBottomOffsetForScrollingSibling = behavior instanceof OUnitedTitleBar.Behavior ? ((OUnitedTitleBar.Behavior) behavior).getTopBottomOffsetForScrollingSibling() : 0;
        int i = q - 0;
        if (i != 0) {
            return (topBottomOffsetForScrollingSibling / i) + 1.0f;
        }
        return 0.0f;
    }

    @Override // com.obric.oui.titlebar.behavior.HeaderScrollingViewBehavior
    protected int getScrollRange(View view) {
        l.f(view, "v");
        return view instanceof OUnitedTitleBar ? ((OUnitedTitleBar) view).q() : view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        l.f(coordinatorLayout, "parent");
        l.f(view, "child");
        l.f(view2, "dependency");
        return view2 instanceof OUnitedTitleBar;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        l.f(coordinatorLayout, "parent");
        l.f(view, "child");
        l.f(view2, "dependency");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof BaseBehavior) {
            ViewCompat.offsetTopAndBottom(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).j) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view2));
        }
        boolean z = view2 instanceof OUnitedTitleBar;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        l.f(coordinatorLayout, "parent");
        l.f(view, "child");
        l.f(view2, "dependency");
        if (view2 instanceof OUnitedTitleBar) {
            AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD;
            l.e(accessibilityActionCompat, "AccessibilityNodeInfoCom…pat.ACTION_SCROLL_FORWARD");
            ViewCompat.removeAccessibilityAction(coordinatorLayout, accessibilityActionCompat.getId());
            AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD;
            l.e(accessibilityActionCompat2, "AccessibilityNodeInfoCom…at.ACTION_SCROLL_BACKWARD");
            ViewCompat.removeAccessibilityAction(coordinatorLayout, accessibilityActionCompat2.getId());
            ViewCompat.setAccessibilityDelegate(coordinatorLayout, null);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        l.f(coordinatorLayout, "parent");
        l.f(view, "child");
        l.f(rect, "rectangle");
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        l.e(dependencies, "parent.getDependencies(child)");
        OUnitedTitleBar findFirstDependency = findFirstDependency(dependencies);
        if (findFirstDependency != null) {
            Rect rect2 = new Rect(rect);
            rect2.offset(view.getLeft(), view.getTop());
            Rect rect3 = this.f8144c;
            rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
            if (!rect3.contains(rect2)) {
                findFirstDependency.setExpanded(false);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.W);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…llingViewBehavior_Layout)");
        setOverlayTop(obtainStyledAttributes.getDimensionPixelSize(0, 0));
        obtainStyledAttributes.recycle();
    }
}
