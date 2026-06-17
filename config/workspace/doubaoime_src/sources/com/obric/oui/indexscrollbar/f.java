package com.obric.oui.indexscrollbar;

import android.view.View;
import android.widget.AdapterView;
import com.obric.oui.indexscrollbar.OIndexScrollbar;
import java.util.Locale;

/* loaded from: classes2.dex */
final class f implements AdapterView.OnItemLongClickListener {
    final /* synthetic */ OIndexScrollbar a;

    f(OIndexScrollbar oIndexScrollbar) {
        this.a = oIndexScrollbar;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean z;
        OIndexScrollbar.a aVar;
        z = this.a.g0;
        boolean z2 = false;
        if (!z) {
            return false;
        }
        aVar = this.a.f7805g;
        kotlin.s.c.l.c(aVar);
        String item = aVar.getItem(i);
        kotlin.s.c.l.f(item, "alphabet");
        if (kotlin.s.c.l.a(".>", item)) {
            return false;
        }
        Locale locale = Locale.getDefault();
        kotlin.s.c.l.e(locale, "Locale.getDefault()");
        String language = locale.getLanguage();
        kotlin.s.c.l.e(language, "Locale.getDefault().language");
        kotlin.s.c.l.f(language, "language");
        if (!e.a.a.a.a.T0(Locale.CHINESE, "Locale.CHINESE", language) && (e.a.a.a.a.T0(Locale.ENGLISH, "Locale.ENGLISH", language) || (!e.a.a.a.a.T0(Locale.KOREA, "Locale.KOREA", language) && (e.a.a.a.a.T0(Locale.JAPAN, "Locale.JAPAN", language) || kotlin.s.c.l.a("ru", language))))) {
            z2 = true;
        }
        if (z2) {
            OIndexScrollbar oIndexScrollbar = this.a;
            kotlin.s.c.l.e(view, "view");
            OIndexScrollbar.z(oIndexScrollbar, view, i);
        } else {
            OIndexScrollbar oIndexScrollbar2 = this.a;
            kotlin.s.c.l.e(view, "view");
            OIndexScrollbar.A(oIndexScrollbar2, view, i);
        }
        this.a.e0 = true;
        return true;
    }
}
