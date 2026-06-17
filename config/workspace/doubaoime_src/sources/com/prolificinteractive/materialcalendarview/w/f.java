package com.prolificinteractive.materialcalendarview.w;

import android.text.SpannableStringBuilder;
import com.prolificinteractive.materialcalendarview.CalendarDay;

/* loaded from: classes2.dex */
public class f implements g {
    private final CharSequence[] b;

    public f(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Label array cannot be null");
        }
        if (charSequenceArr.length < 12) {
            throw new IllegalArgumentException("Label array is too short");
        }
        this.b = charSequenceArr;
    }

    @Override // com.prolificinteractive.materialcalendarview.w.g
    public CharSequence a(CalendarDay calendarDay) {
        return new SpannableStringBuilder().append(this.b[calendarDay.f() - 1]).append((CharSequence) " ").append((CharSequence) String.valueOf(calendarDay.g()));
    }
}
