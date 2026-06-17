package com.obric.oui.calendar;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.text.TextUtilsCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.threeten.bp.DayOfWeek;

/* loaded from: classes2.dex */
abstract class e extends ViewGroup implements View.OnClickListener, View.OnLongClickListener {
    private final ArrayList<u> a;
    private final ArrayList<j> b;

    /* renamed from: c, reason: collision with root package name */
    private final DayOfWeek f7672c;

    /* renamed from: d, reason: collision with root package name */
    protected int f7673d;

    /* renamed from: e, reason: collision with root package name */
    private MaterialCalendarView f7674e;

    /* renamed from: f, reason: collision with root package name */
    private CalendarDay f7675f;

    /* renamed from: g, reason: collision with root package name */
    private CalendarDay f7676g;
    private CalendarDay h;
    protected boolean i;
    private final Collection<g> j;

    protected static class a extends ViewGroup.MarginLayoutParams {
        public a() {
            super(-2, -2);
        }
    }

    public e(@NonNull MaterialCalendarView materialCalendarView, CalendarDay calendarDay, DayOfWeek dayOfWeek, boolean z) {
        super(materialCalendarView.getContext());
        this.a = new ArrayList<>();
        this.b = new ArrayList<>();
        this.f7673d = 4;
        this.f7676g = null;
        this.h = null;
        this.j = new ArrayList();
        this.f7674e = materialCalendarView;
        this.f7675f = calendarDay;
        this.f7672c = dayOfWeek;
        this.i = z;
        setClipChildren(false);
        setClipToPadding(false);
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

    protected void a(Collection<g> collection, org.threeten.bp.e eVar) {
        g gVar = new g(getContext(), CalendarDay.b(eVar));
        gVar.setOnClickListener(this);
        gVar.setOnLongClickListener(this);
        collection.add(gVar);
        addView(gVar, new a());
    }

    protected abstract void b(Collection<g> collection, org.threeten.bp.e eVar);

    protected CalendarDay c() {
        return this.f7675f;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    protected abstract int d();

    protected abstract boolean e(CalendarDay calendarDay);

    protected org.threeten.bp.e f() {
        boolean z = true;
        org.threeten.bp.e a2 = this.f7675f.c().a(org.threeten.bp.temporal.k.f(this.f7672c, 1).b(), 1L);
        int value = this.f7672c.getValue() - a2.u().getValue();
        if (!((this.f7673d & 1) != 0) ? value <= 0 : value < 0) {
            z = false;
        }
        if (z) {
            value -= 7;
        }
        return a2.L(value);
    }

    public void g(int i) {
        Iterator<g> it2 = this.j.iterator();
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

    public void h(com.obric.oui.calendar.w.e eVar) {
        Iterator<g> it2 = this.j.iterator();
        while (it2.hasNext()) {
            it2.next().f(eVar);
        }
    }

    public void i(com.obric.oui.calendar.w.e eVar) {
        Iterator<g> it2 = this.j.iterator();
        while (it2.hasNext()) {
            it2.next().g(eVar);
        }
    }

    void j(List<j> list) {
        this.b.clear();
        if (list != null) {
            this.b.addAll(list);
        }
        i iVar = new i();
        for (g gVar : this.j) {
            iVar.g();
            Iterator<j> it2 = this.b.iterator();
            while (it2.hasNext()) {
                j next = it2.next();
                if (next.a.a(gVar.c())) {
                    next.b.a(iVar);
                }
            }
            gVar.a(iVar);
        }
    }

    public void k(CalendarDay calendarDay) {
        this.h = calendarDay;
        r();
    }

    public void l(CalendarDay calendarDay) {
        this.f7676g = calendarDay;
        r();
    }

    public void m(Collection<CalendarDay> collection) {
        for (g gVar : this.j) {
            gVar.setChecked(collection != null && collection.contains(gVar.c()));
        }
        postInvalidate();
    }

    public void n(int i) {
        Iterator<g> it2 = this.j.iterator();
        while (it2.hasNext()) {
            it2.next().i(i);
        }
    }

    public void o(boolean z) {
        for (g gVar : this.j) {
            gVar.setOnClickListener(z ? this : null);
            gVar.setClickable(z);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view instanceof g) {
            this.f7674e.y((g) view);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(e.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(e.class.getName());
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
            int i9 = i8 % 7;
            if (i9 > 0) {
                i6 += this.f7674e.t();
                i5 += this.f7674e.t();
            }
            if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                int i10 = i5 - measuredWidth;
                childAt.layout(i10, i7, i5, i7 + measuredHeight);
                i5 = i10;
            } else {
                int i11 = measuredWidth + i6;
                childAt.layout(i6, i7, i11, i7 + measuredHeight);
                i6 = i11;
            }
            if (i9 == 6) {
                i7 = i7 + measuredHeight + this.f7674e.u();
                i5 = width;
                i6 = 0;
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (!(view instanceof g)) {
            return false;
        }
        this.f7674e.z((g) view);
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
        setMeasuredDimension(size, (this.f7674e.u() * Math.max(0, d() - 1)) + size2);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).measure(View.MeasureSpec.makeMeasureSpec(this.f7674e.v(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(d2, BasicMeasure.EXACTLY));
        }
    }

    public void p(com.obric.oui.calendar.w.h hVar) {
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
        for (g gVar : this.j) {
            CalendarDay c2 = gVar.c();
            gVar.j(this.f7673d, c2.k(this.f7676g, this.h), e(c2));
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
