package com.prolificinteractive.materialcalendarview.w;

import androidx.annotation.NonNull;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import java.util.Locale;
import org.threeten.bp.format.DateTimeFormatterBuilder;

/* loaded from: classes2.dex */
public class c implements e {
    private final org.threeten.bp.format.a b;

    public c() {
        Locale locale = Locale.getDefault();
        org.threeten.bp.format.a aVar = org.threeten.bp.format.a.h;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.j("d");
        this.b = dateTimeFormatterBuilder.x(locale);
    }

    @NonNull
    public String a(@NonNull CalendarDay calendarDay) {
        return this.b.a(calendarDay.c());
    }
}
