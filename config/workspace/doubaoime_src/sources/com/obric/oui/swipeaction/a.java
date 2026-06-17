package com.obric.oui.swipeaction;

import android.view.View;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
final class a implements Runnable {
    final /* synthetic */ OSwipeActionLayout a;

    a(OSwipeActionLayout oSwipeActionLayout) {
        this.a = oSwipeActionLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i;
        View view2;
        View view3;
        View view4;
        int i2;
        View view5;
        View view6;
        int y = this.a.y();
        if (y == 1) {
            view = this.a.z;
            l.c(view);
            i = this.a.v;
            view.setX(i);
            return;
        }
        if (y == 2) {
            view2 = this.a.C;
            l.c(view2);
            view3 = this.a.C;
            l.c(view3);
            view2.setX(-view3.getWidth());
            return;
        }
        if (y != 3) {
            return;
        }
        view4 = this.a.z;
        l.c(view4);
        i2 = this.a.v;
        view4.setX(i2);
        view5 = this.a.C;
        l.c(view5);
        view6 = this.a.C;
        l.c(view6);
        view5.setX(-view6.getWidth());
    }
}
