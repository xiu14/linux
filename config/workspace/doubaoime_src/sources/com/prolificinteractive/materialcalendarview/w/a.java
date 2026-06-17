package com.prolificinteractive.materialcalendarview.w;

import org.threeten.bp.DayOfWeek;

/* loaded from: classes2.dex */
public class a implements h {
    private final CharSequence[] b;

    public a(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Cannot be null");
        }
        if (charSequenceArr.length != 7) {
            throw new IllegalArgumentException("Array must contain exactly 7 elements");
        }
        this.b = charSequenceArr;
    }

    @Override // com.prolificinteractive.materialcalendarview.w.h
    public CharSequence a(DayOfWeek dayOfWeek) {
        return this.b[dayOfWeek.getValue() - 1];
    }
}
