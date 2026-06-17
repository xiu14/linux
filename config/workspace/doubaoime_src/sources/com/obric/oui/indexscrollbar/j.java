package com.obric.oui.indexscrollbar;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;

/* loaded from: classes2.dex */
final class j implements View.OnTouchListener {
    final /* synthetic */ OIndexScrollbar a;
    final /* synthetic */ TextView b;

    j(OIndexScrollbar oIndexScrollbar, TextView textView) {
        this.a = oIndexScrollbar;
        this.b = textView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        TextView textView;
        TextView textView2;
        PopupWindow popupWindow2;
        kotlin.s.c.l.e(motionEvent, "motionEvent");
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
            this.a.K(null);
            return false;
        }
        popupWindow = this.a.U;
        if (popupWindow != null) {
            textView = this.a.V;
            if (textView != null) {
                CharSequence text = this.b.getText();
                textView2 = this.a.V;
                kotlin.s.c.l.c(textView2);
                if (!kotlin.s.c.l.a(text, textView2.getText())) {
                    popupWindow2 = this.a.U;
                    kotlin.s.c.l.c(popupWindow2);
                    popupWindow2.dismiss();
                }
            }
        }
        kotlin.s.c.l.e(view, "view");
        view.setTag(this.b.getText());
        this.a.K(view);
        return false;
    }
}
