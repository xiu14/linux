package com.obric.oui.indexscrollbar;

import android.view.View;
import android.widget.AdapterView;
import com.obric.oui.indexscrollbar.OIndexScrollbar;

/* loaded from: classes2.dex */
final class d implements AdapterView.OnItemClickListener {
    final /* synthetic */ OIndexScrollbar a;

    d(OIndexScrollbar oIndexScrollbar) {
        this.a = oIndexScrollbar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        OIndexScrollbar.a aVar;
        OIndexScrollbar.a aVar2;
        aVar = this.a.f7805g;
        kotlin.s.c.l.c(aVar);
        String item = aVar.getItem(i);
        kotlin.s.c.l.f(item, "alphabet");
        if (!kotlin.s.c.l.a(".>", item)) {
            OIndexScrollbar.b bVar = this.a.t;
            kotlin.s.c.l.c(bVar);
            aVar2 = this.a.f7805g;
            kotlin.s.c.l.c(aVar2);
            if (bVar.a(aVar2.getItem(i), this.a.E())) {
                this.a.invalidate();
            }
        }
        this.a.H();
    }
}
