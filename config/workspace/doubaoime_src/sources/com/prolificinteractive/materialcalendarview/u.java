package com.prolificinteractive.materialcalendarview;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import org.threeten.bp.DayOfWeek;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
class u extends AppCompatTextView {
    private com.prolificinteractive.materialcalendarview.w.h a;
    private DayOfWeek b;

    public u(Context context, DayOfWeek dayOfWeek) {
        super(context);
        this.a = com.prolificinteractive.materialcalendarview.w.h.a;
        setGravity(17);
        setTextAlignment(4);
        this.b = dayOfWeek;
        setText(this.a.a(dayOfWeek));
    }

    public void a(@Nullable com.prolificinteractive.materialcalendarview.w.h hVar) {
        if (hVar == null) {
            hVar = com.prolificinteractive.materialcalendarview.w.h.a;
        }
        this.a = hVar;
        DayOfWeek dayOfWeek = this.b;
        this.b = dayOfWeek;
        setText(hVar.a(dayOfWeek));
    }
}
