package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.flexbox.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class FlexboxLayout extends ViewGroup implements a {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f6727c;

    /* renamed from: d, reason: collision with root package name */
    private int f6728d;

    /* renamed from: e, reason: collision with root package name */
    private int f6729e;

    /* renamed from: f, reason: collision with root package name */
    private int f6730f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private Drawable f6731g;

    @Nullable
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int[] m;
    private SparseIntArray n;
    private c o;
    private List<b> p;
    private c.b q;

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    private boolean A(int i) {
        if (i < 0 || i >= this.p.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.p.size(); i2++) {
            if (this.p.get(i2).a() > 0) {
                return false;
            }
        }
        return r() ? (this.i & 4) != 0 : (this.j & 4) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void B(boolean r27, int r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.B(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void C(boolean r28, boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.C(boolean, boolean, int, int, int, int):void");
    }

    private void D(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int e2;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + l();
            e2 = e();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(e.a.a.a.a.j("Invalid flex direction: ", i));
            }
            paddingBottom = e();
            e2 = getPaddingRight() + getPaddingLeft() + l();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < e2) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = e2;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(e2, i2, i4);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(e.a.a.a.a.j("Unknown width mode is set: ", mode));
            }
            if (size < e2) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = paddingBottom;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(e.a.a.a.a.j("Unknown height mode is set: ", mode2));
            }
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    private void t(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.p.get(i);
            for (int i2 = 0; i2 < bVar.h; i2++) {
                int i3 = bVar.o + i2;
                View x = x(i3);
                if (x != null && x.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) x.getLayoutParams();
                    if (y(i3, i2)) {
                        w(canvas, z ? x.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (x.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.l, bVar.b, bVar.f6761g);
                    }
                    if (i2 == bVar.h - 1 && (this.j & 4) > 0) {
                        w(canvas, z ? (x.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.l : x.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, bVar.b, bVar.f6761g);
                    }
                }
            }
            if (z(i)) {
                v(canvas, paddingLeft, z2 ? bVar.f6758d : bVar.b - this.k, max);
            }
            if (A(i) && (this.i & 4) > 0) {
                v(canvas, paddingLeft, z2 ? bVar.b - this.k : bVar.f6758d, max);
            }
        }
    }

    private void u(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.p.get(i);
            for (int i2 = 0; i2 < bVar.h; i2++) {
                int i3 = bVar.o + i2;
                View x = x(i3);
                if (x != null && x.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) x.getLayoutParams();
                    if (y(i3, i2)) {
                        v(canvas, bVar.a, z2 ? x.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (x.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.k, bVar.f6761g);
                    }
                    if (i2 == bVar.h - 1 && (this.i & 4) > 0) {
                        v(canvas, bVar.a, z2 ? (x.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.k : x.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, bVar.f6761g);
                    }
                }
            }
            if (z(i)) {
                w(canvas, z ? bVar.f6757c : bVar.a - this.l, paddingTop, max);
            }
            if (A(i) && (this.j & 4) > 0) {
                w(canvas, z ? bVar.a - this.l : bVar.f6757c, paddingTop, max);
            }
        }
    }

    private void v(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f6731g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.k + i2);
        this.f6731g.draw(canvas);
    }

    private void w(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.l + i, i3 + i2);
        this.h.draw(canvas);
    }

    private boolean y(int i, int i2) {
        boolean z;
        int i3 = 1;
        while (true) {
            if (i3 > i2) {
                z = true;
                break;
            }
            View x = x(i - i3);
            if (x != null && x.getVisibility() != 8) {
                z = false;
                break;
            }
            i3++;
        }
        return z ? r() ? (this.j & 1) != 0 : (this.i & 1) != 0 : r() ? (this.j & 2) != 0 : (this.i & 2) != 0;
    }

    private boolean z(int i) {
        boolean z;
        if (i < 0 || i >= this.p.size()) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            }
            if (this.p.get(i2).a() > 0) {
                z = false;
                break;
            }
            i2++;
        }
        return z ? r() ? (this.i & 1) != 0 : (this.j & 1) != 0 : r() ? (this.i & 2) != 0 : (this.j & 2) != 0;
    }

    @Override // com.google.android.flexbox.a
    public int a() {
        return getChildCount();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.n == null) {
            this.n = new SparseIntArray(getChildCount());
        }
        this.m = this.o.h(view, i, layoutParams, this.n);
        super.addView(view, i, layoutParams);
    }

    @Override // com.google.android.flexbox.a
    public void b(View view, int i, int i2, b bVar) {
        if (y(i, i2)) {
            if (r()) {
                int i3 = bVar.f6759e;
                int i4 = this.l;
                bVar.f6759e = i3 + i4;
                bVar.f6760f += i4;
                return;
            }
            int i5 = bVar.f6759e;
            int i6 = this.k;
            bVar.f6759e = i5 + i6;
            bVar.f6760f += i6;
        }
    }

    @Override // com.google.android.flexbox.a
    public int c() {
        return this.a;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.a
    public int d() {
        return this.f6730f;
    }

    @Override // com.google.android.flexbox.a
    public int e() {
        Iterator<b> it2 = this.p.iterator();
        int i = Integer.MIN_VALUE;
        while (it2.hasNext()) {
            i = Math.max(i, it2.next().f6759e);
        }
        return i;
    }

    @Override // com.google.android.flexbox.a
    public int f() {
        return this.b;
    }

    @Override // com.google.android.flexbox.a
    public void g(b bVar) {
        if (r()) {
            if ((this.j & 4) > 0) {
                int i = bVar.f6759e;
                int i2 = this.l;
                bVar.f6759e = i + i2;
                bVar.f6760f += i2;
                return;
            }
            return;
        }
        if ((this.i & 4) > 0) {
            int i3 = bVar.f6759e;
            int i4 = this.k;
            bVar.f6759e = i3 + i4;
            bVar.f6760f += i4;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // com.google.android.flexbox.a
    public View h(int i) {
        return x(i);
    }

    @Override // com.google.android.flexbox.a
    public int i(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.a
    public int j() {
        return this.f6728d;
    }

    @Override // com.google.android.flexbox.a
    public void k(int i, View view) {
    }

    @Override // com.google.android.flexbox.a
    public int l() {
        int size = this.p.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.p.get(i2);
            if (z(i2)) {
                i += r() ? this.k : this.l;
            }
            if (A(i2)) {
                i += r() ? this.k : this.l;
            }
            i += bVar.f6761g;
        }
        return i;
    }

    @Override // com.google.android.flexbox.a
    public View m(int i) {
        return getChildAt(i);
    }

    @Override // com.google.android.flexbox.a
    public int n(View view, int i, int i2) {
        int i3;
        int i4;
        if (r()) {
            i3 = y(i, i2) ? 0 + this.l : 0;
            if ((this.j & 4) <= 0) {
                return i3;
            }
            i4 = this.l;
        } else {
            i3 = y(i, i2) ? 0 + this.k : 0;
            if ((this.i & 4) <= 0) {
                return i3;
            }
            i4 = this.k;
        }
        return i3 + i4;
    }

    @Override // com.google.android.flexbox.a
    public List<b> o() {
        return this.p;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.h == null && this.f6731g == null) {
            return;
        }
        if (this.i == 0 && this.j == 0) {
            return;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i = this.a;
        if (i == 0) {
            t(canvas, layoutDirection == 1, this.b == 2);
            return;
        }
        if (i == 1) {
            t(canvas, layoutDirection != 1, this.b == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.b == 2) {
                z = !z;
            }
            u(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.b == 2) {
            z2 = !z2;
        }
        u(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i5 = this.a;
        if (i5 == 0) {
            B(layoutDirection == 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 1) {
            B(layoutDirection != 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 2) {
            z2 = layoutDirection == 1;
            C(this.b == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            z2 = layoutDirection == 1;
            C(this.b == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            StringBuilder M = e.a.a.a.a.M("Invalid flex direction is set: ");
            M.append(this.a);
            throw new IllegalStateException(M.toString());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.n == null) {
            this.n = new SparseIntArray(getChildCount());
        }
        if (this.o.w(this.n)) {
            this.m = this.o.g(this.n);
        }
        int i3 = this.a;
        if (i3 != 0 && i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                StringBuilder M = e.a.a.a.a.M("Invalid value for the flex direction is set: ");
                M.append(this.a);
                throw new IllegalStateException(M.toString());
            }
            this.p.clear();
            this.q.a();
            this.o.b(this.q, i2, i, Integer.MAX_VALUE, 0, -1, null);
            this.p = this.q.a;
            this.o.j(i, i2, 0);
            this.o.i(i, i2, getPaddingRight() + getPaddingLeft());
            this.o.D(0);
            D(this.a, i, i2, this.q.b);
            return;
        }
        this.p.clear();
        this.q.a();
        this.o.b(this.q, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.p = this.q.a;
        this.o.j(i, i2, 0);
        if (this.f6728d == 3) {
            for (b bVar : this.p) {
                int i4 = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < bVar.h; i5++) {
                    View x = x(bVar.o + i5);
                    if (x != null && x.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) x.getLayoutParams();
                        i4 = this.b != 2 ? Math.max(i4, x.getMeasuredHeight() + Math.max(bVar.l - x.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(i4, x.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(x.getBaseline() + (bVar.l - x.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                bVar.f6761g = i4;
            }
        }
        this.o.i(i, i2, getPaddingBottom() + getPaddingTop());
        this.o.D(0);
        D(this.a, i, i2, this.q.b);
    }

    @Override // com.google.android.flexbox.a
    public int p(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.a
    public int q() {
        return this.f6729e;
    }

    @Override // com.google.android.flexbox.a
    public boolean r() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    @Override // com.google.android.flexbox.a
    public int s(View view) {
        return 0;
    }

    public void setAlignContent(int i) {
        if (this.f6729e != i) {
            this.f6729e = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f6728d != i) {
            this.f6728d = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@Nullable Drawable drawable) {
        if (drawable == this.f6731g) {
            return;
        }
        this.f6731g = drawable;
        if (drawable != null) {
            this.k = drawable.getIntrinsicHeight();
        } else {
            this.k = 0;
        }
        if (this.f6731g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        if (drawable == this.h) {
            return;
        }
        this.h = drawable;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
        } else {
            this.l = 0;
        }
        if (this.f6731g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<b> list) {
        this.p = list;
    }

    public void setFlexWrap(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f6727c != i) {
            this.f6727c = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f6730f != i) {
            this.f6730f = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.i) {
            this.i = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.j) {
            this.j = i;
            requestLayout();
        }
    }

    public View x(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.m;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6730f = -1;
        this.o = new c(this);
        this.p = new ArrayList();
        this.q = new c.b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a, i, 0);
        this.a = obtainStyledAttributes.getInt(5, 0);
        this.b = obtainStyledAttributes.getInt(6, 0);
        this.f6727c = obtainStyledAttributes.getInt(7, 0);
        this.f6728d = obtainStyledAttributes.getInt(1, 0);
        this.f6729e = obtainStyledAttributes.getInt(0, 0);
        this.f6730f = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(9, 0);
        if (i2 != 0) {
            this.j = i2;
            this.i = i2;
        }
        int i3 = obtainStyledAttributes.getInt(11, 0);
        if (i3 != 0) {
            this.j = i3;
        }
        int i4 = obtainStyledAttributes.getInt(10, 0);
        if (i4 != 0) {
            this.i = i4;
        }
        obtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        private int a;
        private float b;

        /* renamed from: c, reason: collision with root package name */
        private float f6732c;

        /* renamed from: d, reason: collision with root package name */
        private int f6733d;

        /* renamed from: e, reason: collision with root package name */
        private float f6734e;

        /* renamed from: f, reason: collision with root package name */
        private int f6735f;

        /* renamed from: g, reason: collision with root package name */
        private int f6736g;
        private int h;
        private int i;
        private boolean j;

        class a implements Parcelable.Creator<LayoutParams> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            this.b = 0.0f;
            this.f6732c = 1.0f;
            this.f6733d = -1;
            this.f6734e = -1.0f;
            this.f6735f = -1;
            this.f6736g = -1;
            this.h = ViewCompat.MEASURED_SIZE_MASK;
            this.i = ViewCompat.MEASURED_SIZE_MASK;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.b);
            this.a = obtainStyledAttributes.getInt(8, 1);
            this.b = obtainStyledAttributes.getFloat(2, 0.0f);
            this.f6732c = obtainStyledAttributes.getFloat(3, 1.0f);
            this.f6733d = obtainStyledAttributes.getInt(0, -1);
            this.f6734e = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f6735f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            this.f6736g = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            this.h = obtainStyledAttributes.getDimensionPixelSize(5, ViewCompat.MEASURED_SIZE_MASK);
            this.i = obtainStyledAttributes.getDimensionPixelSize(4, ViewCompat.MEASURED_SIZE_MASK);
            this.j = obtainStyledAttributes.getBoolean(9, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public void G(int i) {
            this.f6735f = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int H() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int I() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int M() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void Q(int i) {
            this.f6736g = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float S() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float U() {
            return this.f6734e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int Y() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int a0() {
            return this.f6736g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean c0() {
            return this.j;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int f0() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int l0() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int s() {
            return this.f6733d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float w() {
            return this.f6732c;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.f6732c);
            parcel.writeInt(this.f6733d);
            parcel.writeFloat(this.f6734e);
            parcel.writeInt(this.f6735f);
            parcel.writeInt(this.f6736g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public int z() {
            return this.f6735f;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.f6732c = 1.0f;
            this.f6733d = -1;
            this.f6734e = -1.0f;
            this.f6735f = -1;
            this.f6736g = -1;
            this.h = ViewCompat.MEASURED_SIZE_MASK;
            this.i = ViewCompat.MEASURED_SIZE_MASK;
            this.a = layoutParams.a;
            this.b = layoutParams.b;
            this.f6732c = layoutParams.f6732c;
            this.f6733d = layoutParams.f6733d;
            this.f6734e = layoutParams.f6734e;
            this.f6735f = layoutParams.f6735f;
            this.f6736g = layoutParams.f6736g;
            this.h = layoutParams.h;
            this.i = layoutParams.i;
            this.j = layoutParams.j;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.f6732c = 1.0f;
            this.f6733d = -1;
            this.f6734e = -1.0f;
            this.f6735f = -1;
            this.f6736g = -1;
            this.h = ViewCompat.MEASURED_SIZE_MASK;
            this.i = ViewCompat.MEASURED_SIZE_MASK;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.f6732c = 1.0f;
            this.f6733d = -1;
            this.f6734e = -1.0f;
            this.f6735f = -1;
            this.f6736g = -1;
            this.h = ViewCompat.MEASURED_SIZE_MASK;
            this.i = ViewCompat.MEASURED_SIZE_MASK;
        }

        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            this.a = 1;
            this.b = 0.0f;
            this.f6732c = 1.0f;
            this.f6733d = -1;
            this.f6734e = -1.0f;
            this.f6735f = -1;
            this.f6736g = -1;
            this.h = ViewCompat.MEASURED_SIZE_MASK;
            this.i = ViewCompat.MEASURED_SIZE_MASK;
            this.a = parcel.readInt();
            this.b = parcel.readFloat();
            this.f6732c = parcel.readFloat();
            this.f6733d = parcel.readInt();
            this.f6734e = parcel.readFloat();
            this.f6735f = parcel.readInt();
            this.f6736g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
