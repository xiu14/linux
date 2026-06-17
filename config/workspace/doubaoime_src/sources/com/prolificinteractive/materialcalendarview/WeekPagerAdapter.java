package com.prolificinteractive.materialcalendarview;

import android.view.View;
import androidx.annotation.NonNull;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
public class WeekPagerAdapter extends c<v> {

    public static class a implements e {
        private final CalendarDay a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final DayOfWeek f8205c;

        public a(@NonNull CalendarDay calendarDay, @NonNull CalendarDay calendarDay2, DayOfWeek dayOfWeek) {
            this.f8205c = dayOfWeek;
            this.a = CalendarDay.b(calendarDay.c().a(org.threeten.bp.temporal.k.f(dayOfWeek, 1).b(), 1L));
            this.b = a(calendarDay2) + 1;
        }

        @Override // com.prolificinteractive.materialcalendarview.e
        public int a(CalendarDay calendarDay) {
            return (int) ChronoUnit.WEEKS.between(this.a.c(), calendarDay.c().a(org.threeten.bp.temporal.k.f(this.f8205c, 1).b(), 1L));
        }

        @Override // com.prolificinteractive.materialcalendarview.e
        public int getCount() {
            return this.b;
        }

        @Override // com.prolificinteractive.materialcalendarview.e
        public CalendarDay getItem(int i) {
            return CalendarDay.b(this.a.c().N(i));
        }
    }

    public WeekPagerAdapter(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    @Override // com.prolificinteractive.materialcalendarview.c
    protected e b(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new a(calendarDay, calendarDay2, this.b.q());
    }

    @Override // com.prolificinteractive.materialcalendarview.c
    protected v c(int i) {
        return new v(this.b, super.f(i), this.b.q(), this.s);
    }

    @Override // com.prolificinteractive.materialcalendarview.c, androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // com.prolificinteractive.materialcalendarview.c
    protected int k(v vVar) {
        return super.g().a(vVar.c());
    }

    @Override // com.prolificinteractive.materialcalendarview.c
    protected boolean n(Object obj) {
        return obj instanceof v;
    }

    @Override // com.prolificinteractive.materialcalendarview.c
    public void y(boolean z) {
        this.s = z;
    }
}
