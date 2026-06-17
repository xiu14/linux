package com.prolificinteractive.materialcalendarview.w;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import org.threeten.bp.format.DateTimeFormatterBuilder;

/* loaded from: classes2.dex */
public class d implements g {
    private final org.threeten.bp.format.a b;

    public d() {
        org.threeten.bp.format.a aVar = org.threeten.bp.format.a.h;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.j("LLLL yyyy");
        this.b = dateTimeFormatterBuilder.w();
    }

    @Override // com.prolificinteractive.materialcalendarview.w.g
    public CharSequence a(CalendarDay calendarDay) {
        return this.b.a(calendarDay.c());
    }
}
