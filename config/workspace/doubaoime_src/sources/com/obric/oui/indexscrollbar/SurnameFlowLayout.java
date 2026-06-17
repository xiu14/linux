package com.obric.oui.indexscrollbar;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class SurnameFlowLayout extends ViewGroup {
    private final List<List<View>> a;
    private final List<Integer> b;

    public SurnameFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        kotlin.s.c.l.f(layoutParams, "p");
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        List<View> list;
        int i6;
        SurnameFlowLayout surnameFlowLayout = this;
        surnameFlowLayout.a.clear();
        surnameFlowLayout.b.clear();
        int width = getWidth();
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = surnameFlowLayout.getChildAt(i9);
            kotlin.s.c.l.e(childAt, "child");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (marginLayoutParams.leftMargin + measuredWidth + marginLayoutParams.rightMargin + i8 > width) {
                surnameFlowLayout.b.add(Integer.valueOf(i7));
                surnameFlowLayout.a.add(arrayList);
                arrayList = new ArrayList();
                i8 = 0;
            }
            i8 += measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            i7 = (int) Math.max(i7, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            arrayList.add(childAt);
        }
        surnameFlowLayout.b.add(Integer.valueOf(i7));
        surnameFlowLayout.a.add(arrayList);
        int size = surnameFlowLayout.a.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            List<View> list2 = surnameFlowLayout.a.get(i10);
            int intValue = surnameFlowLayout.b.get(i10).intValue();
            int size2 = list2.size();
            int i12 = 0;
            int i13 = 0;
            while (i12 < size2) {
                View view = list2.get(i12);
                if (view.getVisibility() == 8) {
                    i5 = size;
                    list = list2;
                    i6 = size2;
                } else {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    int i14 = marginLayoutParams2.leftMargin + i13;
                    int i15 = marginLayoutParams2.topMargin + i11;
                    int measuredWidth2 = view.getMeasuredWidth() + i14;
                    int measuredHeight2 = view.getMeasuredHeight() + i15;
                    StringBuilder sb = new StringBuilder();
                    i5 = size;
                    sb.append(view.toString());
                    sb.append(" , l = ");
                    sb.append(i14);
                    sb.append(" , t = ");
                    list = list2;
                    i6 = size2;
                    e.a.a.a.a.F0(sb, i2, " , r =", measuredWidth2, " , b = ");
                    sb.append(measuredHeight2);
                    Log.e("FlowLayout", sb.toString());
                    view.layout(i14, i15, measuredWidth2, measuredHeight2);
                    i13 = view.getMeasuredWidth() + marginLayoutParams2.rightMargin + marginLayoutParams2.leftMargin + i13;
                }
                i12++;
                size = i5;
                list2 = list;
                size2 = i6;
            }
            i11 += intValue;
            i10++;
            surnameFlowLayout = this;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        StringBuilder sb = new StringBuilder();
        sb.append(size);
        sb.append(',');
        sb.append(size2);
        Log.e("FlowLayout", sb.toString());
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            measureChild(childAt, i, i2);
            kotlin.s.c.l.e(childAt, "child");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i8 = size2;
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            int i9 = i5 + measuredWidth;
            if (i9 > size) {
                i4 = (int) Math.max(i5, measuredWidth);
                i7 += i6;
                i6 = measuredHeight;
                i5 = measuredWidth;
            } else {
                i6 = (int) Math.max(i6, measuredHeight);
                i5 = i9;
            }
            if (i3 == childCount - 1) {
                i7 += i6;
                i4 = (int) Math.max(i4, i5);
            }
            i3++;
            size2 = i8;
        }
        int i10 = size2;
        if (mode != 1073741824) {
            size = i4;
        }
        setMeasuredDimension(size, mode2 == 1073741824 ? i10 : i7);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        kotlin.s.c.l.f(attributeSet, "attrs");
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }
}
