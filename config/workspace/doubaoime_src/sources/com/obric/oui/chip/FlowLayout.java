package com.obric.oui.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.android.doubaoime.C0838R;
import e.i.a.b.b;

/* loaded from: classes2.dex */
public class FlowLayout extends ViewGroup {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7696c;

    /* renamed from: d, reason: collision with root package name */
    private int f7697d;

    public FlowLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.f7697d = 0;
            return;
        }
        this.f7697d = 1;
        boolean z2 = ViewCompat.getLayoutDirection(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C0838R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = MarginLayoutParamsCompat.getMarginStart(marginLayoutParams);
                    i5 = MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i8 + i6;
                if (!this.f7696c && measuredWidth > i7) {
                    i9 = this.a + paddingTop;
                    this.f7697d++;
                    i8 = paddingRight;
                }
                childAt.setTag(C0838R.id.row_index_key, Integer.valueOf(this.f7697d - 1));
                int i11 = i8 + i6;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i6, measuredHeight);
                } else {
                    childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                }
                i8 += childAt.getMeasuredWidth() + i6 + i5 + this.b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i5 > paddingRight && !this.f7696c) {
                    paddingLeft = getPaddingLeft();
                    i7 = paddingTop + this.a;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i5;
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i5 + i4 + this.b + paddingLeft;
                if (i9 == getChildCount() - 1) {
                    i8 += i4;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i8;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i3 = BasicMeasure.EXACTLY;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i3 = BasicMeasure.EXACTLY;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i3) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setSingleLine(boolean z) {
        this.f7696c = z;
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7696c = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.m, 0, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
