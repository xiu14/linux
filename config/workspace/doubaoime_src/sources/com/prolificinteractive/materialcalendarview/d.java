package com.prolificinteractive.materialcalendarview;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.threeten.bp.DayOfWeek;

/* loaded from: classes2.dex */
abstract class d extends ViewGroup implements View.OnClickListener, View.OnLongClickListener {
    private final ArrayList<u> a;
    private final ArrayList<i> b;

    /* renamed from: c, reason: collision with root package name */
    private final DayOfWeek f8211c;

    /* renamed from: d, reason: collision with root package name */
    protected int f8212d;

    /* renamed from: e, reason: collision with root package name */
    private MaterialCalendarView f8213e;

    /* renamed from: f, reason: collision with root package name */
    private CalendarDay f8214f;

    /* renamed from: g, reason: collision with root package name */
    private CalendarDay f8215g;
    private CalendarDay h;
    protected boolean i;
    private final Collection<f> j;

    protected static class a extends ViewGroup.MarginLayoutParams {
        public a() {
            super(-2, -2);
        }
    }

    public d(@NonNull MaterialCalendarView materialCalendarView, CalendarDay calendarDay, DayOfWeek dayOfWeek, boolean z) {
        super(materialCalendarView.getContext());
        this.a = new ArrayList<>();
        this.b = new ArrayList<>();
        this.f8212d = 4;
        this.f8215g = null;
        this.h = null;
        this.j = new ArrayList();
        this.f8213e = materialCalendarView;
        this.f8214f = calendarDay;
        this.f8211c = dayOfWeek;
        this.i = z;
        setClipChildren(false);
        setClipToPadding(false);
        if (k.a()) {
            setRotationY(180.0f);
        }
        if (z) {
            org.threeten.bp.e f2 = f();
            for (int i = 0; i < 7; i++) {
                u uVar = new u(getContext(), f2.u());
                uVar.setImportantForAccessibility(2);
                this.a.add(uVar);
                addView(uVar);
                f2 = f2.L(1L);
            }
        }
        b(this.j, f());
    }

    protected void a(Collection<f> collection, org.threeten.bp.e eVar) {
        f fVar = new f(getContext(), CalendarDay.b(eVar));
        fVar.setOnClickListener(this);
        fVar.setOnLongClickListener(this);
        collection.add(fVar);
        addView(fVar, new a());
    }

    protected abstract void b(Collection<f> collection, org.threeten.bp.e eVar);

    protected CalendarDay c() {
        return this.f8214f;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    protected abstract int d();

    protected abstract boolean e(CalendarDay calendarDay);

    protected org.threeten.bp.e f() {
        boolean z = true;
        org.threeten.bp.e a2 = this.f8214f.c().a(org.threeten.bp.temporal.k.f(this.f8211c, 1).b(), 1L);
        int value = this.f8211c.getValue() - a2.u().getValue();
        if (!((this.f8212d & 1) != 0) ? value <= 0 : value < 0) {
            z = false;
        }
        if (z) {
            value -= 7;
        }
        return a2.L(value);
    }

    public void g(int i) {
        Iterator<f> it2 = this.j.iterator();
        while (it2.hasNext()) {
            it2.next().setTextAppearance(getContext(), i);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a();
    }

    public void h(com.prolificinteractive.materialcalendarview.w.e eVar) {
        Iterator<f> it2 = this.j.iterator();
        while (it2.hasNext()) {
            it2.next().f(eVar);
        }
    }

    public void i(com.prolificinteractive.materialcalendarview.w.e eVar) {
        Iterator<f> it2 = this.j.iterator();
        while (it2.hasNext()) {
            it2.next().g(eVar);
        }
    }

    void j(List<i> list) {
        this.b.clear();
        if (list != null) {
            this.b.addAll(list);
        }
        h hVar = new h();
        for (f fVar : this.j) {
            hVar.g();
            Iterator<i> it2 = this.b.iterator();
            while (it2.hasNext()) {
                i next = it2.next();
                if (next.a.b(fVar.c())) {
                    next.b.a(hVar);
                }
            }
            fVar.a(hVar);
        }
    }

    public void k(CalendarDay calendarDay) {
        this.h = calendarDay;
        r();
    }

    public void l(CalendarDay calendarDay) {
        this.f8215g = calendarDay;
        r();
    }

    public void m(Collection<CalendarDay> collection) {
        for (f fVar : this.j) {
            fVar.setChecked(collection != null && collection.contains(fVar.c()));
        }
        postInvalidate();
    }

    public void n(int i) {
        Iterator<f> it2 = this.j.iterator();
        while (it2.hasNext()) {
            it2.next().i(i);
        }
    }

    public void o(boolean z) {
        for (f fVar : this.j) {
            fVar.setOnClickListener(z ? this : null);
            fVar.setClickable(z);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view instanceof f) {
            this.f8213e.t((f) view);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(d.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(d.class.getName());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int childCount = getChildCount();
        int i5 = width;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (k.a()) {
                int i9 = i5 - measuredWidth;
                childAt.layout(i9, i7, i5, i7 + measuredHeight);
                i5 = i9;
            } else {
                int i10 = measuredWidth + i6;
                childAt.layout(i6, i7, i10, i7 + measuredHeight);
                i6 = i10;
            }
            if (i8 % 7 == 6) {
                i7 += measuredHeight;
                i5 = width;
                i6 = 0;
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (!(view instanceof f)) {
            return false;
        }
        this.f8213e.u((f) view);
        return true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) == 0 || mode == 0) {
            throw new IllegalStateException("CalendarPagerView should never be left to decide it's size");
        }
        int i3 = size / 7;
        int d2 = size2 / d();
        setMeasuredDimension(size, size2);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).measure(View.MeasureSpec.makeMeasureSpec(i3, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(d2, BasicMeasure.EXACTLY));
        }
    }

    public void p(com.prolificinteractive.materialcalendarview.w.h hVar) {
        Iterator<u> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(hVar);
        }
    }

    public void q(int i) {
        Iterator<u> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().setTextAppearance(getContext(), i);
        }
    }

    protected void r() {
        for (f fVar : this.j) {
            CalendarDay c2 = fVar.c();
            fVar.j(this.f8212d, c2.k(this.f8215g, this.h), e(c2));
        }
        postInvalidate();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a();
    }
}
