package com.obric.oui.calendar;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
class k extends d<l> {

    public static class a implements f {
        private final CalendarDay a;
        private final int b;

        public a(@NonNull CalendarDay calendarDay, @NonNull CalendarDay calendarDay2) {
            this.a = CalendarDay.a(calendarDay.g(), calendarDay.f(), 1);
            this.b = a(calendarDay2) + 1;
        }

        @Override // com.obric.oui.calendar.f
        public int a(CalendarDay calendarDay) {
            org.threeten.bp.e T = this.a.c().T(1);
            org.threeten.bp.e T2 = calendarDay.c().T(1);
            org.threeten.bp.i iVar = org.threeten.bp.i.f10846d;
            return (int) T.Q(T2).b();
        }

        @Override // com.obric.oui.calendar.f
        public int getCount() {
            return this.b;
        }

        @Override // com.obric.oui.calendar.f
        public CalendarDay getItem(int i) {
            return CalendarDay.b(this.a.c().M(i));
        }
    }

    k(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    @Override // com.obric.oui.calendar.d
    protected f b(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new a(calendarDay, calendarDay2);
    }

    @Override // com.obric.oui.calendar.d
    protected l c(int i) {
        return new l(this.b, f(i), this.b.q(), this.s);
    }

    @Override // com.obric.oui.calendar.d
    protected int k(l lVar) {
        return g().a(lVar.c());
    }

    @Override // com.obric.oui.calendar.d
    protected boolean n(Object obj) {
        return obj instanceof l;
    }
}
