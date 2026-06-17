package com.prolificinteractive.materialcalendarview;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
class l extends c<m> {

    public static class a implements e {
        private final CalendarDay a;
        private final int b;

        public a(@NonNull CalendarDay calendarDay, @NonNull CalendarDay calendarDay2) {
            this.a = CalendarDay.a(calendarDay.g(), calendarDay.f(), 1);
            this.b = a(calendarDay2) + 1;
        }

        @Override // com.prolificinteractive.materialcalendarview.e
        public int a(CalendarDay calendarDay) {
            org.threeten.bp.e T = this.a.c().T(1);
            org.threeten.bp.e T2 = calendarDay.c().T(1);
            org.threeten.bp.i iVar = org.threeten.bp.i.f10846d;
            return (int) T.Q(T2).b();
        }

        @Override // com.prolificinteractive.materialcalendarview.e
        public int getCount() {
            return this.b;
        }

        @Override // com.prolificinteractive.materialcalendarview.e
        public CalendarDay getItem(int i) {
            return CalendarDay.b(this.a.c().M(i));
        }
    }

    l(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    @Override // com.prolificinteractive.materialcalendarview.c
    protected e b(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new a(calendarDay, calendarDay2);
    }

    @Override // com.prolificinteractive.materialcalendarview.c
    protected m c(int i) {
        return new m(this.b, f(i), this.b.q(), this.s);
    }

    @Override // com.prolificinteractive.materialcalendarview.c
    protected int k(m mVar) {
        return g().a(mVar.c());
    }

    @Override // com.prolificinteractive.materialcalendarview.c
    protected boolean n(Object obj) {
        return obj instanceof m;
    }
}
