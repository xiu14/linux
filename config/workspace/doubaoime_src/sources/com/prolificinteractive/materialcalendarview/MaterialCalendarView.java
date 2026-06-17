package com.prolificinteractive.materialcalendarview;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.doubaoime.C0838R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.threeten.bp.DayOfWeek;

/* loaded from: classes2.dex */
public class MaterialCalendarView extends ViewGroup {
    public static final /* synthetic */ int B = 0;
    private e A;
    private final t a;
    private final TextView b;

    /* renamed from: c, reason: collision with root package name */
    private final j f8186c;

    /* renamed from: d, reason: collision with root package name */
    private final j f8187d;

    /* renamed from: e, reason: collision with root package name */
    private final com.prolificinteractive.materialcalendarview.b f8188e;

    /* renamed from: f, reason: collision with root package name */
    private com.prolificinteractive.materialcalendarview.c<?> f8189f;

    /* renamed from: g, reason: collision with root package name */
    private CalendarDay f8190g;
    private LinearLayout h;
    private CalendarMode i;
    private boolean j;
    private final View.OnClickListener k;
    private final ViewPager.OnPageChangeListener l;
    private CalendarDay m;
    private CalendarDay n;
    private o o;
    private n p;
    private p q;
    private q r;
    CharSequence s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private DayOfWeek y;
    private boolean z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == MaterialCalendarView.this.f8187d) {
                MaterialCalendarView.this.f8188e.setCurrentItem(MaterialCalendarView.this.f8188e.getCurrentItem() + 1, true);
            } else if (view == MaterialCalendarView.this.f8186c) {
                MaterialCalendarView.this.f8188e.setCurrentItem(MaterialCalendarView.this.f8188e.getCurrentItem() - 1, true);
            }
        }
    }

    class b implements ViewPager.OnPageChangeListener {
        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f2, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            MaterialCalendarView.this.a.j(MaterialCalendarView.this.f8190g);
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            materialCalendarView.f8190g = materialCalendarView.f8189f.f(i);
            MaterialCalendarView.this.w();
            MaterialCalendarView materialCalendarView2 = MaterialCalendarView.this;
            materialCalendarView2.n(materialCalendarView2.f8190g);
        }
    }

    class c implements ViewPager.PageTransformer {
        c(MaterialCalendarView materialCalendarView) {
        }

        @Override // androidx.viewpager.widget.ViewPager.PageTransformer, androidx.viewpager2.widget.ViewPager2.PageTransformer
        public void transformPage(View view, float f2) {
            view.setAlpha((float) Math.sqrt(1.0f - Math.abs(f2)));
        }
    }

    protected static class d extends ViewGroup.MarginLayoutParams {
        public d(int i) {
            super(-1, i);
        }
    }

    public class e {
        private final CalendarMode a;
        private final DayOfWeek b;

        /* renamed from: c, reason: collision with root package name */
        private final CalendarDay f8196c;

        /* renamed from: d, reason: collision with root package name */
        private final CalendarDay f8197d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f8198e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f8199f;

        e(MaterialCalendarView materialCalendarView, f fVar, a aVar) {
            this.a = fVar.a;
            this.b = fVar.b;
            this.f8196c = fVar.f8201d;
            this.f8197d = fVar.f8202e;
            this.f8198e = fVar.f8200c;
            this.f8199f = fVar.f8203f;
        }
    }

    public class f {

        /* renamed from: f, reason: collision with root package name */
        private boolean f8203f;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8200c = false;

        /* renamed from: d, reason: collision with root package name */
        private CalendarDay f8201d = null;

        /* renamed from: e, reason: collision with root package name */
        private CalendarDay f8202e = null;
        private CalendarMode a = CalendarMode.MONTHS;
        private DayOfWeek b = org.threeten.bp.e.G().a(org.threeten.bp.temporal.k.e(Locale.getDefault()).b(), 1).u();

        public f() {
        }

        public f g(boolean z) {
            this.f8200c = z;
            return this;
        }

        public f h(CalendarMode calendarMode) {
            this.a = calendarMode;
            return this;
        }

        public f i(DayOfWeek dayOfWeek) {
            this.b = dayOfWeek;
            return this;
        }

        public f j(@Nullable CalendarDay calendarDay) {
            this.f8202e = calendarDay;
            return this;
        }

        public f k(@Nullable CalendarDay calendarDay) {
            this.f8201d = calendarDay;
            return this;
        }

        public f l(boolean z) {
            this.f8203f = z;
            return this;
        }
    }

    public MaterialCalendarView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r1.j(r2) == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void d(com.prolificinteractive.materialcalendarview.MaterialCalendarView r5, com.prolificinteractive.materialcalendarview.MaterialCalendarView.e r6) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prolificinteractive.materialcalendarview.MaterialCalendarView.d(com.prolificinteractive.materialcalendarview.MaterialCalendarView, com.prolificinteractive.materialcalendarview.MaterialCalendarView$e):void");
    }

    private static int k(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i : size : Math.min(i, size);
    }

    private int o(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.a.f(this.f8190g);
        this.f8186c.setEnabled(this.f8188e.getCurrentItem() > 0);
        this.f8187d.setEnabled(j());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(1);
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return p();
    }

    public boolean j() {
        return this.f8188e.getCurrentItem() < this.f8189f.getCount() - 1;
    }

    public void l() {
        List<CalendarDay> s = s();
        this.f8189f.a();
        Iterator<CalendarDay> it2 = s.iterator();
        while (it2.hasNext()) {
            m(it2.next(), false);
        }
    }

    protected void m(CalendarDay calendarDay, boolean z) {
        o oVar = this.o;
        if (oVar != null) {
            oVar.a(this, calendarDay, z);
        }
    }

    protected void n(CalendarDay calendarDay) {
        p pVar = this.q;
        if (pVar != null) {
            pVar.a(this, calendarDay);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(MaterialCalendarView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(MaterialCalendarView.class.getName());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i3 - i) - paddingLeft) - getPaddingRight();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int i6 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                childAt.layout(i6, paddingTop, measuredWidth + i6, measuredHeight);
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        com.prolificinteractive.materialcalendarview.c<?> cVar;
        com.prolificinteractive.materialcalendarview.b bVar;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        CalendarMode calendarMode = this.i;
        int i4 = calendarMode.visibleWeeksCount;
        if (calendarMode.equals(CalendarMode.MONTHS) && this.j && (cVar = this.f8189f) != null && (bVar = this.f8188e) != null) {
            org.threeten.bp.e c2 = cVar.f(bVar.getCurrentItem()).c();
            i4 = c2.T(c2.C()).get(org.threeten.bp.temporal.k.f(this.y, 1).h());
        }
        if (this.z) {
            i4++;
        }
        if (this.h.getVisibility() == 0) {
            i4++;
        }
        int i5 = paddingLeft / 7;
        int i6 = paddingTop / i4;
        int i7 = this.v;
        int i8 = -1;
        if (i7 == -10 && this.u == -10) {
            if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
                if (mode2 == 1073741824) {
                    i5 = Math.min(i5, i6);
                }
            } else if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
                i5 = i6;
            } else {
                i5 = -1;
                i6 = -1;
            }
            i6 = -1;
            i8 = i5;
            i5 = -1;
        } else {
            if (i7 > 0) {
                i5 = i7;
            }
            int i9 = this.u;
            if (i9 > 0) {
                i6 = i9;
            }
        }
        if (i8 > 0) {
            i3 = i8;
        } else {
            if (i8 <= 0) {
                if (i5 <= 0) {
                    i5 = o(44);
                }
                i8 = i5;
                if (i6 <= 0) {
                    i3 = o(44);
                }
            } else {
                i8 = i5;
            }
            i3 = i6;
        }
        int i10 = i8 * 7;
        setMeasuredDimension(k(getPaddingRight() + getPaddingLeft() + i10, i), k(getPaddingBottom() + getPaddingTop() + (i4 * i3), i2));
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) ((d) childAt.getLayoutParams())).height * i3, BasicMeasure.EXACTLY));
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        f fVar = new f();
        fVar.i(savedState.i);
        fVar.h(savedState.p);
        fVar.k(savedState.f8194f);
        fVar.j(savedState.f8195g);
        fVar.g(savedState.r);
        fVar.l(savedState.s);
        MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
        d(materialCalendarView, new e(materialCalendarView, fVar, null));
        setSelectionColor(savedState.a);
        setDateTextAppearance(savedState.b);
        setWeekDayTextAppearance(savedState.f8191c);
        setShowOtherDates(savedState.f8192d);
        setAllowClickDaysOutsideCurrentMonth(savedState.f8193e);
        l();
        Iterator<CalendarDay> it2 = savedState.h.iterator();
        while (it2.hasNext()) {
            setDateSelected(it2.next(), true);
        }
        setTitleAnimationOrientation(savedState.j);
        setTileWidth(savedState.k);
        setTileHeight(savedState.l);
        setTopbarVisible(savedState.m);
        setSelectionMode(savedState.n);
        setDynamicHeightEnabled(savedState.o);
        setCurrentDate(savedState.q);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.t;
        savedState.b = this.f8189f.d();
        savedState.f8191c = this.f8189f.j();
        savedState.f8192d = this.f8189f.i();
        savedState.f8193e = this.x;
        savedState.f8194f = this.m;
        savedState.f8195g = this.n;
        savedState.h = s();
        savedState.i = this.y;
        savedState.j = this.a.h();
        savedState.n = this.w;
        savedState.k = this.v;
        savedState.l = this.u;
        savedState.m = this.h.getVisibility() == 0;
        savedState.p = this.i;
        savedState.o = this.j;
        savedState.q = this.f8190g;
        savedState.r = this.A.f8198e;
        savedState.s = this.z;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f8188e.dispatchTouchEvent(motionEvent);
    }

    public d p() {
        return new d(1);
    }

    public DayOfWeek q() {
        return this.y;
    }

    @Nullable
    public CalendarDay r() {
        List<CalendarDay> h = this.f8189f.h();
        if (h.isEmpty()) {
            return null;
        }
        return h.get(h.size() - 1);
    }

    @NonNull
    public List<CalendarDay> s() {
        return this.f8189f.h();
    }

    public void setAllowClickDaysOutsideCurrentMonth(boolean z) {
        this.x = z;
    }

    public void setArrowColor(int i) {
        if (i == 0) {
            return;
        }
        j jVar = this.f8186c;
        Objects.requireNonNull(jVar);
        jVar.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        j jVar2 = this.f8187d;
        Objects.requireNonNull(jVar2);
        jVar2.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        invalidate();
    }

    public void setContentDescriptionArrowFuture(CharSequence charSequence) {
        this.f8187d.setContentDescription(charSequence);
    }

    public void setContentDescriptionArrowPast(CharSequence charSequence) {
        this.f8186c.setContentDescription(charSequence);
    }

    public void setContentDescriptionCalendar(CharSequence charSequence) {
        this.s = charSequence;
    }

    public void setCurrentDate(@Nullable org.threeten.bp.e eVar) {
        setCurrentDate(CalendarDay.b(eVar));
    }

    public void setDateSelected(@Nullable CalendarDay calendarDay, boolean z) {
        if (calendarDay == null) {
            return;
        }
        this.f8189f.q(calendarDay, z);
    }

    public void setDateTextAppearance(int i) {
        this.f8189f.r(i);
    }

    public void setDayFormatter(com.prolificinteractive.materialcalendarview.w.e eVar) {
        com.prolificinteractive.materialcalendarview.c<?> cVar = this.f8189f;
        if (eVar == null) {
            eVar = com.prolificinteractive.materialcalendarview.w.e.a;
        }
        cVar.s(eVar);
    }

    public void setDayFormatterContentDescription(com.prolificinteractive.materialcalendarview.w.e eVar) {
        this.f8189f.t(eVar);
    }

    public void setDynamicHeightEnabled(boolean z) {
        this.j = z;
    }

    public void setHeaderTextAppearance(int i) {
        this.b.setTextAppearance(getContext(), i);
    }

    public void setLeftArrowMask(Drawable drawable) {
        this.f8186c.setImageDrawable(drawable);
    }

    public void setOnDateChangedListener(o oVar) {
        this.o = oVar;
    }

    public void setOnDateLongClickListener(n nVar) {
        this.p = nVar;
    }

    public void setOnMonthChangedListener(p pVar) {
        this.q = pVar;
    }

    public void setOnRangeSelectedListener(q qVar) {
        this.r = qVar;
    }

    public void setOnTitleClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public void setPagingEnabled(boolean z) {
        this.f8188e.a(z);
        w();
    }

    public void setRightArrowMask(Drawable drawable) {
        this.f8187d.setImageDrawable(drawable);
    }

    public void setSelectedDate(@Nullable org.threeten.bp.e eVar) {
        setSelectedDate(CalendarDay.b(eVar));
    }

    public void setSelectionColor(int i) {
        if (i == 0) {
            if (!isInEditMode()) {
                return;
            } else {
                i = -7829368;
            }
        }
        this.t = i;
        this.f8189f.v(i);
        invalidate();
    }

    public void setSelectionMode(int i) {
        int i2 = this.w;
        this.w = i;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.w = 0;
                    if (i2 != 0) {
                        l();
                    }
                } else {
                    l();
                }
            }
        } else if ((i2 == 2 || i2 == 3) && !s().isEmpty()) {
            setSelectedDate(r());
        }
        this.f8189f.w(this.w != 0);
    }

    public void setShowOtherDates(int i) {
        this.f8189f.x(i);
    }

    public void setTileHeight(int i) {
        this.u = i;
        requestLayout();
    }

    public void setTileHeightDp(int i) {
        setTileHeight(o(i));
    }

    public void setTileSize(int i) {
        this.v = i;
        this.u = i;
        requestLayout();
    }

    public void setTileSizeDp(int i) {
        setTileSize(o(i));
    }

    public void setTileWidth(int i) {
        this.v = i;
        requestLayout();
    }

    public void setTileWidthDp(int i) {
        setTileWidth(o(i));
    }

    public void setTitleAnimationOrientation(int i) {
        this.a.i(i);
    }

    public void setTitleFormatter(@Nullable com.prolificinteractive.materialcalendarview.w.g gVar) {
        this.a.k(gVar);
        this.f8189f.z(gVar);
        w();
    }

    public void setTitleMonths(CharSequence[] charSequenceArr) {
        setTitleFormatter(new com.prolificinteractive.materialcalendarview.w.f(charSequenceArr));
    }

    public void setTopbarVisible(boolean z) {
        this.h.setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public void setWeekDayFormatter(com.prolificinteractive.materialcalendarview.w.h hVar) {
        com.prolificinteractive.materialcalendarview.c<?> cVar = this.f8189f;
        if (hVar == null) {
            hVar = com.prolificinteractive.materialcalendarview.w.h.a;
        }
        cVar.A(hVar);
    }

    public void setWeekDayLabels(CharSequence[] charSequenceArr) {
        setWeekDayFormatter(new com.prolificinteractive.materialcalendarview.w.a(charSequenceArr));
    }

    public void setWeekDayTextAppearance(int i) {
        this.f8189f.B(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected void t(com.prolificinteractive.materialcalendarview.f fVar) {
        CalendarDay f2 = this.f8189f.f(this.f8188e.getCurrentItem());
        CalendarDay c2 = fVar.c();
        int f3 = f2.f();
        int f4 = c2.f();
        if (this.i == CalendarMode.MONTHS && this.x && f3 != f4) {
            if (f2.i(c2)) {
                if (this.f8188e.getCurrentItem() > 0) {
                    com.prolificinteractive.materialcalendarview.b bVar = this.f8188e;
                    bVar.setCurrentItem(bVar.getCurrentItem() - 1, true);
                }
            } else if (f2.j(c2) && j()) {
                com.prolificinteractive.materialcalendarview.b bVar2 = this.f8188e;
                bVar2.setCurrentItem(bVar2.getCurrentItem() + 1, true);
            }
        }
        CalendarDay c3 = fVar.c();
        boolean z = !fVar.isChecked();
        int i = this.w;
        if (i == 2) {
            this.f8189f.q(c3, z);
            o oVar = this.o;
            if (oVar != null) {
                oVar.a(this, c3, z);
                return;
            }
            return;
        }
        if (i != 3) {
            this.f8189f.a();
            this.f8189f.q(c3, true);
            o oVar2 = this.o;
            if (oVar2 != null) {
                oVar2.a(this, c3, true);
                return;
            }
            return;
        }
        List<CalendarDay> h = this.f8189f.h();
        if (h.size() == 0) {
            this.f8189f.q(c3, z);
            o oVar3 = this.o;
            if (oVar3 != null) {
                oVar3.a(this, c3, z);
                return;
            }
            return;
        }
        if (h.size() != 1) {
            this.f8189f.a();
            this.f8189f.q(c3, z);
            o oVar4 = this.o;
            if (oVar4 != null) {
                oVar4.a(this, c3, z);
                return;
            }
            return;
        }
        CalendarDay calendarDay = h.get(0);
        if (calendarDay.equals(c3)) {
            this.f8189f.q(c3, z);
            o oVar5 = this.o;
            if (oVar5 != null) {
                oVar5.a(this, c3, z);
                return;
            }
            return;
        }
        if (calendarDay.i(c3)) {
            this.f8189f.p(c3, calendarDay);
            List<CalendarDay> h2 = this.f8189f.h();
            q qVar = this.r;
            if (qVar != null) {
                qVar.a(this, h2);
                return;
            }
            return;
        }
        this.f8189f.p(calendarDay, c3);
        List<CalendarDay> h3 = this.f8189f.h();
        q qVar2 = this.r;
        if (qVar2 != null) {
            qVar2.a(this, h3);
        }
    }

    protected void u(com.prolificinteractive.materialcalendarview.f fVar) {
        n nVar = this.p;
        if (nVar != null) {
            nVar.a(this, fVar.c());
        }
    }

    protected void v(CalendarDay calendarDay) {
        o oVar = this.o;
        if (oVar != null) {
            oVar.a(this, calendarDay, false);
        }
    }

    public MaterialCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ArrayList();
        a aVar = new a();
        this.k = aVar;
        b bVar = new b();
        this.l = bVar;
        this.m = null;
        this.n = null;
        this.t = 0;
        this.u = -10;
        this.v = -10;
        this.w = 1;
        this.x = true;
        setClipToPadding(false);
        setClipChildren(false);
        j jVar = new j(getContext());
        this.f8186c = jVar;
        jVar.setContentDescription(getContext().getString(C0838R.string.previous));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.b = appCompatTextView;
        j jVar2 = new j(getContext());
        this.f8187d = jVar2;
        jVar2.setContentDescription(getContext().getString(C0838R.string.next));
        com.prolificinteractive.materialcalendarview.b bVar2 = new com.prolificinteractive.materialcalendarview.b(getContext());
        this.f8188e = bVar2;
        jVar.setOnClickListener(aVar);
        jVar2.setOnClickListener(aVar);
        t tVar = new t(appCompatTextView);
        this.a = tVar;
        bVar2.setOnPageChangeListener(bVar);
        bVar2.setPageTransformer(false, new c(this));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, s.a, 0, 0);
        try {
            try {
                int integer = obtainStyledAttributes.getInteger(2, 0);
                int integer2 = obtainStyledAttributes.getInteger(4, -1);
                tVar.i(obtainStyledAttributes.getInteger(16, 0));
                if (integer2 < 1 || integer2 > 7) {
                    this.y = org.threeten.bp.temporal.k.e(Locale.getDefault()).c();
                } else {
                    this.y = DayOfWeek.of(integer2);
                }
                this.z = obtainStyledAttributes.getBoolean(12, true);
                f fVar = new f();
                fVar.i(this.y);
                fVar.h(CalendarMode.values()[integer]);
                fVar.l(this.z);
                MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
                d(materialCalendarView, new e(materialCalendarView, fVar, null));
                setSelectionMode(obtainStyledAttributes.getInteger(10, 1));
                int layoutDimension = obtainStyledAttributes.getLayoutDimension(14, -10);
                if (layoutDimension > -10) {
                    setTileSize(layoutDimension);
                }
                int layoutDimension2 = obtainStyledAttributes.getLayoutDimension(15, -10);
                if (layoutDimension2 > -10) {
                    setTileWidth(layoutDimension2);
                }
                int layoutDimension3 = obtainStyledAttributes.getLayoutDimension(13, -10);
                if (layoutDimension3 > -10) {
                    setTileHeight(layoutDimension3);
                }
                setArrowColor(obtainStyledAttributes.getColor(1, ViewCompat.MEASURED_STATE_MASK));
                Drawable drawable = obtainStyledAttributes.getDrawable(6);
                setLeftArrowMask(drawable == null ? getResources().getDrawable(C0838R.drawable.mcv_action_previous) : drawable);
                Drawable drawable2 = obtainStyledAttributes.getDrawable(8);
                setRightArrowMask(drawable2 == null ? getResources().getDrawable(C0838R.drawable.mcv_action_next) : drawable2);
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
                setSelectionColor(obtainStyledAttributes.getColor(9, typedValue.data));
                CharSequence[] textArray = obtainStyledAttributes.getTextArray(17);
                if (textArray != null) {
                    setWeekDayFormatter(new com.prolificinteractive.materialcalendarview.w.a(textArray));
                }
                CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(7);
                if (textArray2 != null) {
                    setTitleFormatter(new com.prolificinteractive.materialcalendarview.w.f(textArray2));
                }
                setHeaderTextAppearance(obtainStyledAttributes.getResourceId(5, C0838R.style.TextAppearance_MaterialCalendarWidget_Header));
                setWeekDayTextAppearance(obtainStyledAttributes.getResourceId(18, C0838R.style.TextAppearance_MaterialCalendarWidget_WeekDay));
                setDateTextAppearance(obtainStyledAttributes.getResourceId(3, C0838R.style.TextAppearance_MaterialCalendarWidget_Date));
                setShowOtherDates(obtainStyledAttributes.getInteger(11, 4));
                setAllowClickDaysOutsideCurrentMonth(obtainStyledAttributes.getBoolean(0, true));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            obtainStyledAttributes.recycle();
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.h = linearLayout;
            linearLayout.setOrientation(0);
            this.h.setClipChildren(false);
            this.h.setClipToPadding(false);
            addView(this.h, new d(1));
            this.f8186c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.h.addView(this.f8186c, new LinearLayout.LayoutParams(0, -1, 1.0f));
            this.b.setGravity(17);
            this.h.addView(this.b, new LinearLayout.LayoutParams(0, -1, 5.0f));
            this.f8187d.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.h.addView(this.f8187d, new LinearLayout.LayoutParams(0, -1, 1.0f));
            this.f8188e.setId(C0838R.id.mcv_pager);
            this.f8188e.setOffscreenPageLimit(1);
            addView(this.f8188e, new d(this.z ? this.i.visibleWeeksCount + 1 : this.i.visibleWeeksCount));
            CalendarDay m = CalendarDay.m();
            this.f8190g = m;
            setCurrentDate(m);
            if (isInEditMode()) {
                removeView(this.f8188e);
                m mVar = new m(this, this.f8190g, this.y, true);
                mVar.n(this.t);
                mVar.g(this.f8189f.d());
                mVar.q(this.f8189f.j());
                mVar.f8212d = this.f8189f.i();
                mVar.r();
                addView(mVar, new d(this.i.visibleWeeksCount + 1));
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d(1);
    }

    public void setCurrentDate(@Nullable CalendarDay calendarDay) {
        setCurrentDate(calendarDay, true);
    }

    public void setSelectedDate(@Nullable CalendarDay calendarDay) {
        l();
        if (calendarDay != null) {
            setDateSelected(calendarDay, true);
        }
    }

    public void setTitleMonths(@ArrayRes int i) {
        setTitleMonths(getResources().getTextArray(i));
    }

    public void setWeekDayLabels(@ArrayRes int i) {
        setWeekDayLabels(getResources().getTextArray(i));
    }

    public void setCurrentDate(@Nullable CalendarDay calendarDay, boolean z) {
        if (calendarDay == null) {
            return;
        }
        this.f8188e.setCurrentItem(this.f8189f.e(calendarDay), z);
        w();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        int f8191c;

        /* renamed from: d, reason: collision with root package name */
        int f8192d;

        /* renamed from: e, reason: collision with root package name */
        boolean f8193e;

        /* renamed from: f, reason: collision with root package name */
        CalendarDay f8194f;

        /* renamed from: g, reason: collision with root package name */
        CalendarDay f8195g;
        List<CalendarDay> h;
        DayOfWeek i;
        int j;
        int k;
        int l;
        boolean m;
        int n;
        boolean o;
        CalendarMode p;
        CalendarDay q;
        boolean r;
        boolean s;

        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
            this.a = 0;
            this.b = 0;
            this.f8191c = 0;
            this.f8192d = 4;
            this.f8193e = true;
            this.f8194f = null;
            this.f8195g = null;
            this.h = new ArrayList();
            this.i = org.threeten.bp.temporal.k.e(Locale.getDefault()).c();
            this.j = 0;
            this.k = -1;
            this.l = -1;
            this.m = true;
            this.n = 1;
            this.o = false;
            this.p = CalendarMode.MONTHS;
            this.q = null;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.f8191c);
            parcel.writeInt(this.f8192d);
            parcel.writeByte(this.f8193e ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.f8194f, 0);
            parcel.writeParcelable(this.f8195g, 0);
            parcel.writeTypedList(this.h);
            parcel.writeInt(this.i.getValue());
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeInt(this.m ? 1 : 0);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o ? 1 : 0);
            parcel.writeInt(this.p == CalendarMode.WEEKS ? 1 : 0);
            parcel.writeParcelable(this.q, 0);
            parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel, a aVar) {
            super(parcel);
            this.a = 0;
            this.b = 0;
            this.f8191c = 0;
            this.f8192d = 4;
            this.f8193e = true;
            this.f8194f = null;
            this.f8195g = null;
            this.h = new ArrayList();
            this.i = org.threeten.bp.temporal.k.e(Locale.getDefault()).c();
            this.j = 0;
            this.k = -1;
            this.l = -1;
            this.m = true;
            this.n = 1;
            this.o = false;
            CalendarMode calendarMode = CalendarMode.MONTHS;
            this.p = calendarMode;
            this.q = null;
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.f8191c = parcel.readInt();
            this.f8192d = parcel.readInt();
            this.f8193e = parcel.readByte() != 0;
            ClassLoader classLoader = CalendarDay.class.getClassLoader();
            this.f8194f = (CalendarDay) parcel.readParcelable(classLoader);
            this.f8195g = (CalendarDay) parcel.readParcelable(classLoader);
            parcel.readTypedList(this.h, CalendarDay.CREATOR);
            this.i = DayOfWeek.of(parcel.readInt());
            this.j = parcel.readInt();
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readInt() == 1;
            this.n = parcel.readInt();
            this.o = parcel.readInt() == 1;
            this.p = parcel.readInt() == 1 ? CalendarMode.WEEKS : calendarMode;
            this.q = (CalendarDay) parcel.readParcelable(classLoader);
            this.r = parcel.readByte() != 0;
            this.s = parcel.readByte() != 0;
        }
    }
}
