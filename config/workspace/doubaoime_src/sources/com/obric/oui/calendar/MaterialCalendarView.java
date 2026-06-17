package com.obric.oui.calendar;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.doubaoime.C0838R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.threeten.bp.DayOfWeek;

/* loaded from: classes2.dex */
public class MaterialCalendarView extends ViewGroup {
    public static final /* synthetic */ int D = 0;
    private DayOfWeek A;
    private boolean B;
    private e C;
    private final t a;
    private final TextView b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f7641c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageView f7642d;

    /* renamed from: e, reason: collision with root package name */
    private final com.obric.oui.calendar.c f7643e;

    /* renamed from: f, reason: collision with root package name */
    private com.obric.oui.calendar.d<?> f7644f;

    /* renamed from: g, reason: collision with root package name */
    private CalendarDay f7645g;
    private LinearLayout h;
    private CalendarMode i;
    private boolean j;
    private final View.OnClickListener k;
    private final ViewPager.OnPageChangeListener l;
    private CalendarDay m;
    private CalendarDay n;
    private q o;
    private p p;
    private r q;
    private s r;
    CharSequence s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private boolean z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == MaterialCalendarView.this.f7642d) {
                MaterialCalendarView.this.f7643e.setCurrentItem(MaterialCalendarView.this.f7643e.getCurrentItem() + 1, true);
            } else if (view == MaterialCalendarView.this.f7641c) {
                MaterialCalendarView.this.f7643e.setCurrentItem(MaterialCalendarView.this.f7643e.getCurrentItem() - 1, true);
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
            MaterialCalendarView.this.a.i(MaterialCalendarView.this.f7645g);
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            materialCalendarView.f7645g = materialCalendarView.f7644f.f(i);
            MaterialCalendarView.this.B();
            MaterialCalendarView materialCalendarView2 = MaterialCalendarView.this;
            materialCalendarView2.n(materialCalendarView2.f7645g);
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
        private final CalendarDay f7651c;

        /* renamed from: d, reason: collision with root package name */
        private final CalendarDay f7652d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f7653e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f7654f;

        e(f fVar, a aVar) {
            this.a = fVar.a;
            this.b = fVar.b;
            this.f7651c = fVar.f7657d;
            this.f7652d = fVar.f7658e;
            this.f7653e = fVar.f7656c;
            this.f7654f = fVar.f7659f;
        }
    }

    public MaterialCalendarView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        this.a.f(this.f7645g);
        ImageView imageView = this.f7641c;
        boolean z = this.f7643e.getCurrentItem() > 0;
        imageView.setEnabled(z);
        imageView.setAlpha(z ? 1.0f : 0.1f);
        ImageView imageView2 = this.f7642d;
        boolean j = j();
        imageView2.setEnabled(j);
        imageView2.setAlpha(j ? 1.0f : 0.1f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r1.j(r2) == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void d(com.obric.oui.calendar.MaterialCalendarView r5, com.obric.oui.calendar.MaterialCalendarView.e r6) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.calendar.MaterialCalendarView.d(com.obric.oui.calendar.MaterialCalendarView, com.obric.oui.calendar.MaterialCalendarView$e):void");
    }

    private static int k(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i : size : Math.min(i, size);
    }

    private int o(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    protected void A(CalendarDay calendarDay) {
        q qVar = this.o;
        if (qVar != null) {
            qVar.a(this, calendarDay, false);
        }
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
        return this.f7643e.getCurrentItem() < this.f7644f.getCount() - 1;
    }

    public void l() {
        List<CalendarDay> s = s();
        this.f7644f.a();
        Iterator<CalendarDay> it2 = s.iterator();
        while (it2.hasNext()) {
            m(it2.next(), false);
        }
    }

    protected void m(CalendarDay calendarDay, boolean z) {
        q qVar = this.o;
        if (qVar != null) {
            qVar.a(this, calendarDay, z);
        }
    }

    protected void n(CalendarDay calendarDay) {
        r rVar = this.q;
        if (rVar != null) {
            rVar.a(this, calendarDay);
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
        com.obric.oui.calendar.d<?> dVar;
        com.obric.oui.calendar.c cVar;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        CalendarMode calendarMode = this.i;
        int i4 = calendarMode.visibleWeeksCount;
        if (calendarMode.equals(CalendarMode.MONTHS) && this.j && (dVar = this.f7644f) != null && (cVar = this.f7643e) != null) {
            org.threeten.bp.e c2 = dVar.f(cVar.getCurrentItem()).c();
            i4 = c2.T(c2.C()).get(org.threeten.bp.temporal.k.f(this.A, 1).h());
        }
        if (this.B) {
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
        setMeasuredDimension(k(getPaddingRight() + getPaddingLeft() + i10, i), k(getPaddingBottom() + getPaddingTop() + ((Math.max(this.x, 0) + i3) * Math.max(0, i4 - 1)) + i3, i2));
        int childCount = getChildCount();
        int max = Math.max(this.w, 0);
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            childAt.measure(View.MeasureSpec.makeMeasureSpec((max * 6) + i10, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) ((d) childAt.getLayoutParams())).height * i3, BasicMeasure.EXACTLY));
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        e eVar = this.C;
        f fVar = MaterialCalendarView.this.new f(eVar, null);
        fVar.k(savedState.f7646c);
        fVar.j(savedState.f7647d);
        fVar.g(savedState.j);
        MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
        d(materialCalendarView, materialCalendarView.new e(fVar, null));
        setShowOtherDates(savedState.a);
        setAllowClickDaysOutsideCurrentMonth(savedState.b);
        l();
        Iterator<CalendarDay> it2 = savedState.f7648e.iterator();
        while (it2.hasNext()) {
            setDateSelected(it2.next(), true);
        }
        setTopbarVisible(savedState.f7649f);
        setSelectionMode(savedState.f7650g);
        setDynamicHeightEnabled(savedState.h);
        setCurrentDate(savedState.i);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.f7644f.i();
        savedState.b = this.z;
        savedState.f7646c = this.m;
        savedState.f7647d = this.n;
        savedState.f7648e = s();
        savedState.f7650g = this.y;
        savedState.f7649f = this.h.getVisibility() == 0;
        savedState.h = this.j;
        savedState.i = this.f7645g;
        savedState.j = this.C.f7653e;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f7643e.dispatchTouchEvent(motionEvent);
    }

    public d p() {
        return new d(1);
    }

    public DayOfWeek q() {
        return this.A;
    }

    @Nullable
    public CalendarDay r() {
        List<CalendarDay> h = this.f7644f.h();
        if (h.isEmpty()) {
            return null;
        }
        return h.get(h.size() - 1);
    }

    @NonNull
    public List<CalendarDay> s() {
        return this.f7644f.h();
    }

    public void setAllowClickDaysOutsideCurrentMonth(boolean z) {
        this.z = z;
    }

    public void setContentDescriptionArrowFuture(CharSequence charSequence) {
        this.f7642d.setContentDescription(charSequence);
    }

    public void setContentDescriptionArrowPast(CharSequence charSequence) {
        this.f7641c.setContentDescription(charSequence);
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
        this.f7644f.q(calendarDay, z);
    }

    public void setDateTextAppearance(int i) {
        this.f7644f.r(i);
    }

    public void setDayFormatter(com.obric.oui.calendar.w.e eVar) {
        com.obric.oui.calendar.d<?> dVar = this.f7644f;
        if (eVar == null) {
            eVar = com.obric.oui.calendar.w.e.a;
        }
        dVar.s(eVar);
    }

    public void setDayFormatterContentDescription(com.obric.oui.calendar.w.e eVar) {
        this.f7644f.t(eVar);
    }

    public void setDynamicHeightEnabled(boolean z) {
        this.j = z;
    }

    public void setHeaderTextAppearance(int i) {
        this.b.setTextAppearance(getContext(), i);
    }

    public void setLeftArrow(@DrawableRes int i) {
        this.f7641c.setImageResource(i);
    }

    public void setOnDateChangedListener(q qVar) {
        this.o = qVar;
    }

    public void setOnDateLongClickListener(p pVar) {
        this.p = pVar;
    }

    public void setOnMonthChangedListener(r rVar) {
        this.q = rVar;
    }

    public void setOnRangeSelectedListener(s sVar) {
        this.r = sVar;
    }

    public void setOnTitleClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public void setPagingEnabled(boolean z) {
        this.f7643e.a(z);
        B();
    }

    public void setRightArrow(@DrawableRes int i) {
        this.f7642d.setImageResource(i);
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
        this.f7644f.v(i);
        invalidate();
    }

    public void setSelectionMode(int i) {
        int i2 = this.y;
        this.y = i;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.y = 0;
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
        this.f7644f.w(this.y != 0);
    }

    public void setShowOtherDates(int i) {
        this.f7644f.x(i);
    }

    public void setTileHSpacing(int i) {
        this.w = i;
        requestLayout();
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

    public void setTileVSpacing(int i) {
        this.x = i;
        requestLayout();
    }

    public void setTileWidth(int i) {
        this.v = i;
        requestLayout();
    }

    public void setTileWidthDp(int i) {
        setTileWidth(o(i));
    }

    public void setTitleAnimationOrientation(int i) {
        this.a.h(i);
    }

    public void setTitleFormatter(@Nullable com.obric.oui.calendar.w.g gVar) {
        this.a.j(gVar);
        this.f7644f.z(gVar);
        B();
    }

    public void setTitleMonths(CharSequence[] charSequenceArr) {
        setTitleFormatter(new com.obric.oui.calendar.w.f(charSequenceArr));
    }

    public void setTopbarVisible(boolean z) {
        this.h.setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public void setWeekDayFormatter(com.obric.oui.calendar.w.h hVar) {
        com.obric.oui.calendar.d<?> dVar = this.f7644f;
        if (hVar == null) {
            hVar = com.obric.oui.calendar.w.h.a;
        }
        dVar.A(hVar);
    }

    public void setWeekDayLabels(CharSequence[] charSequenceArr) {
        setWeekDayFormatter(new com.obric.oui.calendar.w.a(charSequenceArr));
    }

    public void setWeekDayTextAppearance(int i) {
        this.f7644f.B(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int t() {
        return this.w;
    }

    public int u() {
        return this.x;
    }

    public int v() {
        return this.v;
    }

    public void w() {
        if (j()) {
            com.obric.oui.calendar.c cVar = this.f7643e;
            cVar.setCurrentItem(cVar.getCurrentItem() + 1, true);
        }
    }

    public void x() {
        if (this.f7643e.getCurrentItem() > 0) {
            com.obric.oui.calendar.c cVar = this.f7643e;
            cVar.setCurrentItem(cVar.getCurrentItem() - 1, true);
        }
    }

    protected void y(g gVar) {
        CalendarDay f2 = this.f7644f.f(this.f7643e.getCurrentItem());
        CalendarDay c2 = gVar.c();
        int f3 = f2.f();
        int f4 = c2.f();
        if (this.i == CalendarMode.MONTHS && this.z && f3 != f4) {
            if (f2.i(c2)) {
                x();
            } else if (f2.j(c2) && j()) {
                com.obric.oui.calendar.c cVar = this.f7643e;
                cVar.setCurrentItem(cVar.getCurrentItem() + 1, true);
            }
        }
        CalendarDay c3 = gVar.c();
        boolean z = !gVar.isChecked();
        int i = this.y;
        if (i == 2) {
            this.f7644f.q(c3, z);
            q qVar = this.o;
            if (qVar != null) {
                qVar.a(this, c3, z);
                return;
            }
            return;
        }
        if (i != 3) {
            this.f7644f.a();
            this.f7644f.q(c3, true);
            q qVar2 = this.o;
            if (qVar2 != null) {
                qVar2.a(this, c3, true);
                return;
            }
            return;
        }
        List<CalendarDay> h = this.f7644f.h();
        if (h.size() == 0) {
            this.f7644f.q(c3, z);
            q qVar3 = this.o;
            if (qVar3 != null) {
                qVar3.a(this, c3, z);
                return;
            }
            return;
        }
        if (h.size() != 1) {
            this.f7644f.a();
            this.f7644f.q(c3, z);
            q qVar4 = this.o;
            if (qVar4 != null) {
                qVar4.a(this, c3, z);
                return;
            }
            return;
        }
        CalendarDay calendarDay = h.get(0);
        if (calendarDay.equals(c3)) {
            this.f7644f.q(c3, z);
            q qVar5 = this.o;
            if (qVar5 != null) {
                qVar5.a(this, c3, z);
                return;
            }
            return;
        }
        if (calendarDay.i(c3)) {
            this.f7644f.p(c3, calendarDay);
            List<CalendarDay> h2 = this.f7644f.h();
            s sVar = this.r;
            if (sVar != null) {
                sVar.a(this, h2);
                return;
            }
            return;
        }
        this.f7644f.p(calendarDay, c3);
        List<CalendarDay> h3 = this.f7644f.h();
        s sVar2 = this.r;
        if (sVar2 != null) {
            sVar2.a(this, h3);
        }
    }

    protected void z(g gVar) {
        p pVar = this.p;
        if (pVar != null) {
            pVar.a(this, gVar.c());
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
        this.w = -10;
        this.x = -10;
        this.y = 1;
        this.z = true;
        setClipToPadding(false);
        setClipChildren(false);
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0838R.layout.calendar_view, (ViewGroup) null, false);
        this.h = (LinearLayout) inflate.findViewById(C0838R.id.header);
        ImageView imageView = (ImageView) inflate.findViewById(C0838R.id.previous);
        this.f7641c = imageView;
        TextView textView = (TextView) inflate.findViewById(C0838R.id.month_name);
        this.b = textView;
        ImageView imageView2 = (ImageView) inflate.findViewById(C0838R.id.next);
        this.f7642d = imageView2;
        com.obric.oui.calendar.c cVar = new com.obric.oui.calendar.c(getContext());
        this.f7643e = cVar;
        imageView.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        t tVar = new t(textView);
        this.a = tVar;
        cVar.setOnPageChangeListener(bVar);
        cVar.setPageTransformer(false, new c(this));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e.i.a.b.b.V, 0, 0);
        try {
            try {
                int integer = obtainStyledAttributes.getInteger(1, 0);
                int integer2 = obtainStyledAttributes.getInteger(3, -1);
                tVar.h(obtainStyledAttributes.getInteger(17, 0));
                if (integer2 < 1 || integer2 > 7) {
                    this.A = org.threeten.bp.temporal.k.e(Locale.getDefault()).c();
                } else {
                    this.A = DayOfWeek.of(integer2);
                }
                this.B = obtainStyledAttributes.getBoolean(11, true);
                f fVar = new f();
                fVar.i(this.A);
                fVar.h(CalendarMode.values()[integer]);
                fVar.l(this.B);
                MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
                d(materialCalendarView, materialCalendarView.new e(fVar, null));
                setSelectionMode(obtainStyledAttributes.getInteger(9, 1));
                int layoutDimension = obtainStyledAttributes.getLayoutDimension(14, -10);
                if (layoutDimension > -10) {
                    setTileSize(layoutDimension);
                }
                int layoutDimension2 = obtainStyledAttributes.getLayoutDimension(16, -10);
                if (layoutDimension2 > -10) {
                    setTileWidth(layoutDimension2);
                }
                int layoutDimension3 = obtainStyledAttributes.getLayoutDimension(13, -10);
                if (layoutDimension3 > -10) {
                    setTileHeight(layoutDimension3);
                }
                int layoutDimension4 = obtainStyledAttributes.getLayoutDimension(12, -10);
                if (layoutDimension2 > -10) {
                    setTileHSpacing(layoutDimension4);
                }
                int layoutDimension5 = obtainStyledAttributes.getLayoutDimension(15, -10);
                if (layoutDimension2 > -10) {
                    setTileVSpacing(layoutDimension5);
                }
                setLeftArrow(obtainStyledAttributes.getResourceId(5, C0838R.drawable.o_mcv_action_previous));
                setRightArrow(obtainStyledAttributes.getResourceId(7, C0838R.drawable.o_mcv_action_next));
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
                setSelectionColor(obtainStyledAttributes.getColor(8, typedValue.data));
                CharSequence[] textArray = obtainStyledAttributes.getTextArray(18);
                if (textArray != null) {
                    setWeekDayFormatter(new com.obric.oui.calendar.w.a(textArray));
                }
                CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(6);
                if (textArray2 != null) {
                    setTitleFormatter(new com.obric.oui.calendar.w.f(textArray2));
                }
                setHeaderTextAppearance(obtainStyledAttributes.getResourceId(4, C0838R.style.TextAppearance_MaterialCalendarWidget_Header));
                setWeekDayTextAppearance(obtainStyledAttributes.getResourceId(19, C0838R.style.TextAppearance_MaterialCalendarWidget_WeekDay));
                setDateTextAppearance(obtainStyledAttributes.getResourceId(2, C0838R.style.TextAppearance_MaterialCalendarWidget_Date));
                setShowOtherDates(obtainStyledAttributes.getInteger(10, 4));
                setAllowClickDaysOutsideCurrentMonth(obtainStyledAttributes.getBoolean(0, true));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            obtainStyledAttributes.recycle();
            addView(this.h);
            this.f7643e.setId(C0838R.id.mcv_pager);
            this.f7643e.setOffscreenPageLimit(1);
            addView(this.f7643e, new d(this.B ? this.i.visibleWeeksCount + 1 : this.i.visibleWeeksCount));
            CalendarDay m = CalendarDay.m();
            this.f7645g = m;
            setCurrentDate(m);
            if (isInEditMode()) {
                removeView(this.f7643e);
                l lVar = new l(this, this.f7645g, this.A, true);
                lVar.n(this.t);
                lVar.g(this.f7644f.d());
                lVar.q(this.f7644f.j());
                lVar.f7673d = this.f7644f.i();
                lVar.r();
                addView(lVar, new d(this.i.visibleWeeksCount + 1));
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
        this.f7643e.setCurrentItem(this.f7644f.e(calendarDay), z);
        B();
    }

    public class f {
        private CalendarMode a;
        private DayOfWeek b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f7656c;

        /* renamed from: d, reason: collision with root package name */
        private CalendarDay f7657d;

        /* renamed from: e, reason: collision with root package name */
        private CalendarDay f7658e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f7659f;

        public f() {
            this.f7656c = false;
            this.f7657d = null;
            this.f7658e = null;
            this.a = CalendarMode.MONTHS;
            this.b = org.threeten.bp.e.G().a(org.threeten.bp.temporal.k.e(Locale.getDefault()).b(), 1L).u();
        }

        public f g(boolean z) {
            this.f7656c = z;
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
            this.f7658e = calendarDay;
            return this;
        }

        public f k(@Nullable CalendarDay calendarDay) {
            this.f7657d = calendarDay;
            return this;
        }

        public f l(boolean z) {
            this.f7659f = z;
            return this;
        }

        f(e eVar, a aVar) {
            this.f7656c = false;
            this.f7657d = null;
            this.f7658e = null;
            this.a = eVar.a;
            this.b = eVar.b;
            this.f7657d = eVar.f7651c;
            this.f7658e = eVar.f7652d;
            this.f7656c = eVar.f7653e;
            this.f7659f = eVar.f7654f;
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int a;
        boolean b;

        /* renamed from: c, reason: collision with root package name */
        CalendarDay f7646c;

        /* renamed from: d, reason: collision with root package name */
        CalendarDay f7647d;

        /* renamed from: e, reason: collision with root package name */
        List<CalendarDay> f7648e;

        /* renamed from: f, reason: collision with root package name */
        boolean f7649f;

        /* renamed from: g, reason: collision with root package name */
        int f7650g;
        boolean h;
        CalendarDay i;
        boolean j;

        class a implements Parcelable.Creator<SavedState> {
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
            this.a = 4;
            this.b = true;
            this.f7646c = null;
            this.f7647d = null;
            this.f7648e = new ArrayList();
            this.f7649f = true;
            this.f7650g = 1;
            this.h = false;
            this.i = null;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.f7646c, 0);
            parcel.writeParcelable(this.f7647d, 0);
            parcel.writeTypedList(this.f7648e);
            parcel.writeInt(this.f7649f ? 1 : 0);
            parcel.writeInt(this.f7650g);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeParcelable(this.i, 0);
            parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel, a aVar) {
            super(parcel);
            this.a = 4;
            this.b = true;
            this.f7646c = null;
            this.f7647d = null;
            this.f7648e = new ArrayList();
            this.f7649f = true;
            this.f7650g = 1;
            this.h = false;
            this.i = null;
            this.a = parcel.readInt();
            this.b = parcel.readByte() != 0;
            ClassLoader classLoader = CalendarDay.class.getClassLoader();
            this.f7646c = (CalendarDay) parcel.readParcelable(classLoader);
            this.f7647d = (CalendarDay) parcel.readParcelable(classLoader);
            parcel.readTypedList(this.f7648e, CalendarDay.CREATOR);
            this.f7649f = parcel.readInt() == 1;
            this.f7650g = parcel.readInt();
            this.h = parcel.readInt() == 1;
            this.i = (CalendarDay) parcel.readParcelable(classLoader);
            this.j = parcel.readByte() != 0;
        }
    }
}
