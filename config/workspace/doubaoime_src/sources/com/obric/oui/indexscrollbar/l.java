package com.obric.oui.indexscrollbar;

import android.view.View;
import android.widget.AdapterView;
import com.obric.oui.indexscrollbar.OIndexScrollbar;
import java.util.Objects;

/* loaded from: classes2.dex */
final class l implements AdapterView.OnItemClickListener {
    final /* synthetic */ OIndexScrollbar a;

    l(OIndexScrollbar oIndexScrollbar) {
        this.a = oIndexScrollbar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        OIndexScrollbar.d dVar;
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        Objects.requireNonNull(itemAtPosition, "null cannot be cast to non-null type kotlin.String");
        dVar = this.a.u;
        kotlin.s.c.l.c(dVar);
        dVar.a((String) itemAtPosition);
        this.a.G();
    }
}
