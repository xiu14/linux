package com.obric.oui.calendar.w;

import java.util.Locale;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.format.TextStyle;

/* loaded from: classes2.dex */
public final class b implements h {
    @Override // com.obric.oui.calendar.w.h
    public CharSequence a(DayOfWeek dayOfWeek) {
        return dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.getDefault());
    }
}
