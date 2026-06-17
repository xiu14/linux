package com.obric.oui.calendar;

import android.view.View;
import androidx.annotation.NonNull;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes2.dex */
public class WeekPagerAdapter extends d<v> {

    public static class a implements f {
        private final CalendarDay a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final DayOfWeek f7666c;

        public a(@NonNull CalendarDay calendarDay, @NonNull CalendarDay calendarDay2, DayOfWeek dayOfWeek) {
            this.f7666c = dayOfWeek;
            this.a = CalendarDay.b(calendarDay.c().a(org.threeten.bp.temporal.k.f(dayOfWeek, 1).b(), 1L));
            this.b = a(calendarDay2) + 1;
        }

        @Override // com.obric.oui.calendar.f
        public int a(CalendarDay calendarDay) {
            return (int) ChronoUnit.WEEKS.between(this.a.c(), calendarDay.c().a(org.threeten.bp.temporal.k.f(this.f7666c, 1).b(), 1L));
        }

        @Override // com.obric.oui.calendar.f
        public int getCount() {
            return this.b;
        }

        @Override // com.obric.oui.calendar.f
        public CalendarDay getItem(int i) {
            return CalendarDay.b(this.a.c().N(i));
        }
    }

    public WeekPagerAdapter(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    @Override // com.obric.oui.calendar.d
    protected f b(CalendarDay calendarDay, CalendarDay calendarDay2) {
        return new a(calendarDay, calendarDay2, this.b.q());
    }

    @Override // com.obric.oui.calendar.d
    protected v c(int i) {
        return new v(this.b, super.f(i), this.b.q(), this.s);
    }

    @Override // com.obric.oui.calendar.d, androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // com.obric.oui.calendar.d
    protected int k(v vVar) {
        return super.g().a(vVar.c());
    }

    @Override // com.obric.oui.calendar.d
    protected boolean n(Object obj) {
        return obj instanceof v;
    }

    @Override // com.obric.oui.calendar.d
    public void y(boolean z) {
        this.s = z;
    }
}
