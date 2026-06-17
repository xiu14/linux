package com.obric.oui.calendar;

import android.view.View;

/* compiled from: java-style lambda group */
/* loaded from: classes2.dex */
public final class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendarView materialCalendarView;
        MaterialCalendarView materialCalendarView2;
        int i = this.a;
        if (i == 0) {
            materialCalendarView = ((ODatePickerView) this.b).f7661c;
            materialCalendarView.x();
        } else {
            if (i != 1) {
                throw null;
            }
            materialCalendarView2 = ((ODatePickerView) this.b).f7661c;
            materialCalendarView2.w();
        }
    }
}
