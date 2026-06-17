package com.obric.oui.calendar;

import android.util.Log;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import java.util.Calendar;

/* loaded from: classes2.dex */
final class n implements r {
    final /* synthetic */ ODatePickerView a;
    final /* synthetic */ Calendar b;

    n(ODatePickerView oDatePickerView, Calendar calendar) {
        this.a = oDatePickerView;
        this.b = calendar;
    }

    @Override // com.obric.oui.calendar.r
    public final void a(MaterialCalendarView materialCalendarView, CalendarDay calendarDay) {
        String str;
        String k;
        TextView textView;
        MaterialCalendarView materialCalendarView2;
        str = this.a.a;
        String str2 = "setOnMonthChangedListener widget:" + materialCalendarView + ",date:" + calendarDay;
        kotlin.s.c.l.f(str, "tag");
        kotlin.s.c.l.f(str2, "msg");
        Log.i(str, str2);
        Calendar calendar = this.b;
        kotlin.s.c.l.e(calendarDay, "date");
        calendar.set(calendarDay.g(), calendarDay.f() - 1, 1);
        Calendar calendar2 = this.b;
        kotlin.s.c.l.e(calendar2, "calendar");
        long timeInMillis = calendar2.getTimeInMillis();
        ODatePickerView oDatePickerView = this.a;
        String string = oDatePickerView.getResources().getString(C0838R.string.date_picker_date_format);
        kotlin.s.c.l.e(string, "resources.getString(R.st….date_picker_date_format)");
        k = oDatePickerView.k(timeInMillis, string);
        textView = this.a.f7664f;
        textView.setText(k);
        materialCalendarView2 = this.a.f7661c;
        materialCalendarView2.setSelectedDate(CalendarDay.a(calendarDay.g(), calendarDay.f(), 1));
        kotlin.s.b.l<Long, kotlin.o> m = this.a.m();
        if (m != null) {
            m.invoke(Long.valueOf(timeInMillis));
        }
    }
}
