package com.obric.oui.indexscrollbar;

import android.view.View;
import android.widget.TextView;
import com.obric.oui.indexscrollbar.OIndexScrollbar;
import java.util.Objects;

/* loaded from: classes2.dex */
final class i implements View.OnClickListener {
    final /* synthetic */ OIndexScrollbar a;

    i(OIndexScrollbar oIndexScrollbar) {
        this.a = oIndexScrollbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OIndexScrollbar.d dVar;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.TextView");
        String obj = ((TextView) view).getText().toString();
        dVar = this.a.u;
        kotlin.s.c.l.c(dVar);
        dVar.a(obj);
        this.a.G();
    }
}
