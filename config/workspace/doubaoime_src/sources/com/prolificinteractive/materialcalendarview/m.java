package com.prolificinteractive.materialcalendarview;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.Collection;
import org.threeten.bp.DayOfWeek;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
class m extends d {
    public m(@NonNull MaterialCalendarView materialCalendarView, CalendarDay calendarDay, DayOfWeek dayOfWeek, boolean z) {
        super(materialCalendarView, calendarDay, dayOfWeek, z);
    }

    @Override // com.prolificinteractive.materialcalendarview.d
    protected void b(Collection<f> collection, org.threeten.bp.e eVar) {
        for (int i = 0; i < 6; i++) {
            for (int i2 = 0; i2 < 7; i2++) {
                a(collection, eVar);
                eVar = eVar.L(1L);
            }
        }
    }

    @Override // com.prolificinteractive.materialcalendarview.d
    protected int d() {
        return this.i ? 7 : 6;
    }

    @Override // com.prolificinteractive.materialcalendarview.d
    protected boolean e(CalendarDay calendarDay) {
        return calendarDay.f() == c().f();
    }
}
