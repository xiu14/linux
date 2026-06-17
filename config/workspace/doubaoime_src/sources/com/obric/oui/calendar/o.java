package com.obric.oui.calendar;

import android.util.Log;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import java.util.Calendar;
import java.util.Objects;

/* loaded from: classes2.dex */
final class o implements q {
    final /* synthetic */ ODatePickerView a;
    final /* synthetic */ Calendar b;

    o(ODatePickerView oDatePickerView, Calendar calendar) {
        this.a = oDatePickerView;
        this.b = calendar;
    }

    @Override // com.obric.oui.calendar.q
    public final void a(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, boolean z) {
        String str;
        String k;
        TextView textView;
        kotlin.s.c.l.f(materialCalendarView, "widget");
        kotlin.s.c.l.f(calendarDay, "date");
        str = this.a.a;
        String str2 = "setOnDateChangedListener widget:" + materialCalendarView + ",date:" + calendarDay + ",selected:" + z;
        kotlin.s.c.l.f(str, "tag");
        kotlin.s.c.l.f(str2, "msg");
        Log.i(str, str2);
        this.b.set(calendarDay.g(), calendarDay.f() - 1, calendarDay.e());
        Calendar calendar = this.b;
        kotlin.s.c.l.e(calendar, "calendar");
        long timeInMillis = calendar.getTimeInMillis();
        ODatePickerView oDatePickerView = this.a;
        String string = oDatePickerView.getResources().getString(C0838R.string.date_picker_date_format);
        kotlin.s.c.l.e(string, "resources.getString(R.st….date_picker_date_format)");
        k = oDatePickerView.k(timeInMillis, string);
        textView = this.a.f7664f;
        textView.setText(k);
        ODatePickerView oDatePickerView2 = this.a;
        calendarDay.e();
        Objects.requireNonNull(oDatePickerView2);
        kotlin.s.b.l<Long, kotlin.o> l = this.a.l();
        if (l != null) {
            l.invoke(Long.valueOf(timeInMillis));
        }
    }
}
