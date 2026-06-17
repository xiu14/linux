package com.obric.oui.calendar;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.sheet.OSheetContentFrameLayout;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class ODatePickerView extends ConstraintLayout {
    private final String a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private MaterialCalendarView f7661c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f7662d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f7663e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f7664f;

    /* renamed from: g, reason: collision with root package name */
    private kotlin.s.b.l<? super Long, kotlin.o> f7665g;
    private kotlin.s.b.l<? super Long, kotlin.o> h;
    private DatePickerMode i;

    public enum DatePickerMode {
        BOARD_SHEET,
        NARROW_SHEET
    }

    public ODatePickerView(Context context) {
        this(context, null, 0, null, 14);
    }

    public ODatePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12);
    }

    public ODatePickerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ODatePickerView(android.content.Context r3, android.util.AttributeSet r4, int r5, com.obric.oui.calendar.ODatePickerView.DatePickerMode r6, int r7) {
        /*
            r2 = this;
            r6 = r7 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r4 = r0
        L6:
            r6 = r7 & 4
            r1 = 0
            if (r6 == 0) goto Lc
            r5 = r1
        Lc:
            r6 = r7 & 8
            if (r6 == 0) goto L12
            com.obric.oui.calendar.ODatePickerView$DatePickerMode r0 = com.obric.oui.calendar.ODatePickerView.DatePickerMode.BOARD_SHEET
        L12:
            java.lang.String r6 = "context"
            kotlin.s.c.l.f(r3, r6)
            java.lang.String r6 = "mDatePickerMode"
            kotlin.s.c.l.f(r0, r6)
            r2.<init>(r3, r4, r5)
            r2.i = r0
            java.lang.String r4 = "DatePickerView"
            r2.a = r4
            com.obric.oui.calendar.CalendarDay r4 = com.obric.oui.calendar.CalendarDay.m()
            java.lang.String r5 = "CalendarDay.today()"
            kotlin.s.c.l.e(r4, r5)
            r4.e()
            com.obric.oui.calendar.m r4 = com.obric.oui.calendar.m.a
            com.obric.oui.calendar.ODatePickerView$DatePickerMode r4 = r2.i
            com.obric.oui.calendar.ODatePickerView$DatePickerMode r5 = com.obric.oui.calendar.ODatePickerView.DatePickerMode.NARROW_SHEET
            if (r4 != r5) goto L40
            r4 = 2131558700(0x7f0d012c, float:1.8742723E38)
            android.view.ViewGroup.inflate(r3, r4, r2)
            goto L46
        L40:
            r4 = 2131558699(0x7f0d012b, float:1.8742721E38)
            android.view.ViewGroup.inflate(r3, r4, r2)
        L46:
            r3 = 2131362144(0x7f0a0160, float:1.834406E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "findViewById(R.id.calendarView)"
            kotlin.s.c.l.e(r3, r4)
            com.obric.oui.calendar.MaterialCalendarView r3 = (com.obric.oui.calendar.MaterialCalendarView) r3
            r2.f7661c = r3
            r3 = 2131363018(0x7f0a04ca, float:1.8345833E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "findViewById(R.id.previousBtn)"
            kotlin.s.c.l.e(r3, r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2.f7662d = r3
            r3 = 2131362914(0x7f0a0462, float:1.8345622E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "findViewById(R.id.nextBtn)"
            kotlin.s.c.l.e(r3, r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2.f7663e = r3
            r3 = 2131362297(0x7f0a01f9, float:1.834437E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "findViewById(R.id.currentDateTextView)"
            kotlin.s.c.l.e(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f7664f = r3
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            com.obric.oui.calendar.MaterialCalendarView r4 = r2.f7661c
            r4.setTopbarVisible(r1)
            android.widget.ImageView r4 = r2.f7662d
            com.obric.oui.calendar.a r5 = new com.obric.oui.calendar.a
            r5.<init>(r1, r2)
            r4.setOnClickListener(r5)
            android.widget.ImageView r4 = r2.f7663e
            com.obric.oui.calendar.a r5 = new com.obric.oui.calendar.a
            r6 = 1
            r5.<init>(r6, r2)
            r4.setOnClickListener(r5)
            com.obric.oui.calendar.MaterialCalendarView r4 = r2.f7661c
            com.obric.oui.calendar.n r5 = new com.obric.oui.calendar.n
            r5.<init>(r2, r3)
            r4.setOnMonthChangedListener(r5)
            com.obric.oui.calendar.MaterialCalendarView r4 = r2.f7661c
            com.obric.oui.calendar.o r5 = new com.obric.oui.calendar.o
            r5.<init>(r2, r3)
            r4.setOnDateChangedListener(r5)
            r2.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.calendar.ODatePickerView.<init>(android.content.Context, android.util.AttributeSet, int, com.obric.oui.calendar.ODatePickerView$DatePickerMode, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String k(long j, String str) {
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(ZoneId.systemDefault()));
        String format = simpleDateFormat.format(date);
        kotlin.s.c.l.e(format, "formattedData");
        String substring = format.substring(0, 4);
        kotlin.s.c.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = format.substring(5, 7);
        kotlin.s.c.l.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return e.a.a.a.a.u(substring, " 年 ", substring2, " 月");
    }

    private final void n() {
        Calendar calendar = Calendar.getInstance();
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("默认选中的时间:");
        M.append(this.b);
        M.append(" , mSelectTime:");
        M.append(this.b);
        String sb = M.toString();
        kotlin.s.c.l.f(str, "tag");
        kotlin.s.c.l.f(sb, "msg");
        Log.i(str, sb);
        kotlin.s.c.l.e(calendar, "calendar");
        calendar.setTimeInMillis(this.b);
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int i3 = calendar.get(5);
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        calendar.get(13);
        calendar.get(14);
        String str2 = this.a;
        StringBuilder O = e.a.a.a.a.O("转化时间year:", i, ",month:", i2, ",day:");
        e.a.a.a.a.F0(O, i3, ",hour:", i4, ",minute:");
        O.append(i5);
        O.append(", selectDate:");
        O.append(CalendarDay.a(i, i2, i3));
        String sb2 = O.toString();
        kotlin.s.c.l.f(str2, "tag");
        kotlin.s.c.l.f(sb2, "msg");
        Log.i(str2, sb2);
        long j = this.b;
        String string = getResources().getString(C0838R.string.date_picker_date_format);
        kotlin.s.c.l.e(string, "resources.getString(R.st….date_picker_date_format)");
        String k = k(j, string);
        this.f7661c.setCurrentDate(CalendarDay.a(i, i2, i3));
        this.f7661c.setSelectedDate(CalendarDay.a(i, i2, i3));
        this.f7664f.setText(k);
    }

    public final kotlin.s.b.l<Long, kotlin.o> l() {
        return this.h;
    }

    public final kotlin.s.b.l<Long, kotlin.o> m() {
        return this.f7665g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup instanceof OSheetContentFrameLayout) {
            OSheetContentFrameLayout oSheetContentFrameLayout = (OSheetContentFrameLayout) viewGroup;
            if (oSheetContentFrameLayout.getId() == C0838R.id.content_container) {
                int paddingLeft = oSheetContentFrameLayout.getPaddingLeft();
                int paddingTop = oSheetContentFrameLayout.getPaddingTop();
                int paddingRight = oSheetContentFrameLayout.getPaddingRight();
                int paddingBottom = oSheetContentFrameLayout.getPaddingBottom();
                int ordinal = this.i.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        return;
                    }
                    float f2 = 0;
                    if (paddingLeft == e.a.a.a.a.e0("Resources.getSystem()", 1, f2) && paddingTop == e.a.a.a.a.e0("Resources.getSystem()", 1, f2) && paddingRight == e.a.a.a.a.e0("Resources.getSystem()", 1, f2) && paddingBottom == e.a.a.a.a.e0("Resources.getSystem()", 1, f2)) {
                        return;
                    }
                    String str = this.a;
                    StringBuilder O = e.a.a.a.a.O("onAttachedToWindow, we are inside an narrow inset sheet, current parent padding: [", paddingLeft, ", ", paddingTop, ", ");
                    O.append(paddingRight);
                    O.append(", ");
                    O.append(paddingBottom);
                    O.append(']');
                    e.i.b.f.e.b.a(str, O.toString());
                    viewGroup.setPadding(0, 0, 0, 0);
                    return;
                }
                float f3 = 16;
                if (paddingLeft == e.a.a.a.a.e0("Resources.getSystem()", 1, f3) && paddingTop == e.a.a.a.a.e0("Resources.getSystem()", 1, 6) && paddingRight == e.a.a.a.a.e0("Resources.getSystem()", 1, f3) && paddingBottom == e.a.a.a.a.e0("Resources.getSystem()", 1, f3)) {
                    return;
                }
                String str2 = this.a;
                StringBuilder O2 = e.a.a.a.a.O("onAttachedToWindow, we are inside an broad inset sheet, current parent padding: [", paddingLeft, ", ", paddingTop, ", ");
                O2.append(paddingRight);
                O2.append(", ");
                O2.append(paddingBottom);
                O2.append(']');
                e.i.b.f.e.b.a(str2, O2.toString());
                Resources system = Resources.getSystem();
                kotlin.s.c.l.e(system, "Resources.getSystem()");
                int a = kotlin.t.a.a(TypedValue.applyDimension(1, f3, system.getDisplayMetrics()));
                int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, 6);
                int e02 = e.a.a.a.a.e0("Resources.getSystem()", 1, f3);
                Resources system2 = Resources.getSystem();
                kotlin.s.c.l.e(system2, "Resources.getSystem()");
                viewGroup.setPadding(a, e0, e02, kotlin.t.a.a(TypedValue.applyDimension(1, f3, system2.getDisplayMetrics())));
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setCurrentTimeMillis(long j) {
        this.b = j;
        n();
    }

    public final void setOnDateChangedListener(kotlin.s.b.l<? super Long, kotlin.o> lVar) {
        this.h = lVar;
    }

    public final void setOnMonthChangedListener(kotlin.s.b.l<? super Long, kotlin.o> lVar) {
        this.f7665g = lVar;
    }
}
