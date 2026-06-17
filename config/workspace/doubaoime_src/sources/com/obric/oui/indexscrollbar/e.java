package com.obric.oui.indexscrollbar;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.app.NotificationCompat;

/* loaded from: classes2.dex */
final class e implements View.OnTouchListener {
    final /* synthetic */ OIndexScrollbar a;

    e(OIndexScrollbar oIndexScrollbar) {
        this.a = oIndexScrollbar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2;
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        PopupWindow popupWindow3;
        i = this.a.q;
        i2 = this.a.p;
        if (i != i2) {
            return false;
        }
        kotlin.s.c.l.e(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (motionEvent.getAction() != 0) {
            return false;
        }
        popupWindow = this.a.B;
        if (popupWindow == null) {
            return false;
        }
        popupWindow2 = this.a.B;
        kotlin.s.c.l.c(popupWindow2);
        if (!popupWindow2.isShowing()) {
            return false;
        }
        popupWindow3 = this.a.B;
        kotlin.s.c.l.c(popupWindow3);
        popupWindow3.dismiss();
        return true;
    }
}
