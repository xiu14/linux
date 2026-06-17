package com.obric.oui.titlebar.behavior;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class HeaderScrollingViewBehavior extends c<View> {

    /* renamed from: c, reason: collision with root package name */
    final Rect f8144c;

    /* renamed from: d, reason: collision with root package name */
    final Rect f8145d;

    /* renamed from: e, reason: collision with root package name */
    private int f8146e;

    /* renamed from: f, reason: collision with root package name */
    private int f8147f;

    public HeaderScrollingViewBehavior() {
        this.f8144c = new Rect();
        this.f8145d = new Rect();
        this.f8146e = 0;
    }

    @Nullable
    abstract View findFirstDependency(List<View> list);

    final int getOverlapPixelsForOffset(View view) {
        if (this.f8147f == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i = this.f8147f;
        return MathUtils.clamp((int) (overlapRatioForOffset * i), 0, i);
    }

    float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    int getScrollRange(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    final int getVerticalLayoutGap() {
        return this.f8146e;
    }

    @Override // com.obric.oui.titlebar.behavior.c
    protected void layoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        View findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
        if (findFirstDependency == null) {
            coordinatorLayout.onLayoutChild(view, i);
            this.f8146e = 0;
            return;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        Rect rect = this.f8144c;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, findFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((findFirstDependency.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
            rect.left = lastWindowInsets.getSystemWindowInsetLeft() + rect.left;
            rect.right -= lastWindowInsets.getSystemWindowInsetRight();
        }
        Rect rect2 = this.f8145d;
        int i2 = layoutParams.gravity;
        if (i2 == 0) {
            i2 = 8388659;
        }
        GravityCompat.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int overlapPixelsForOffset = getOverlapPixelsForOffset(findFirstDependency);
        view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
        this.f8146e = rect2.top - findFirstDependency.getBottom();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, int i4) {
        View findFirstDependency;
        WindowInsetsCompat lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (ViewCompat.getFitsSystemWindows(findFirstDependency) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.getSystemWindowInsetBottom() + lastWindowInsets.getSystemWindowInsetTop();
        }
        int scrollRange = size + getScrollRange(findFirstDependency);
        int measuredHeight = findFirstDependency.getMeasuredHeight();
        view.setTranslationY(0.0f);
        coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(scrollRange - measuredHeight, i5 == -1 ? BasicMeasure.EXACTLY : Integer.MIN_VALUE), i4);
        return true;
    }

    public final void setOverlayTop(int i) {
        this.f8147f = i;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8144c = new Rect();
        this.f8145d = new Rect();
        this.f8146e = 0;
    }
}
