package com.obric.oui.actionbar;

import android.view.View;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
final class b implements View.OnClickListener {
    final /* synthetic */ OBottomActionBar a;
    final /* synthetic */ int b;

    b(OBottomActionBar oBottomActionBar, int i) {
        this.a = oBottomActionBar;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OBottomActionBar oBottomActionBar = this.a;
        l.e(view, "it");
        OBottomActionBar.a(oBottomActionBar, view, this.b);
    }
}
