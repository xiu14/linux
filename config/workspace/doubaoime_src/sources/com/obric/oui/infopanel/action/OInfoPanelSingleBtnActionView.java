package com.obric.oui.infopanel.action;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OInfoPanelSingleBtnActionView extends LinearLayout implements a {

    public enum Style {
        PRIMARY,
        SECONDARY
    }

    @Override // com.obric.oui.infopanel.action.a
    public View a() {
        return this;
    }

    public final void setBtnOnClickListener(View.OnClickListener onClickListener) {
        l.f(onClickListener, "listener");
        throw null;
    }

    public final void setBtnText(CharSequence charSequence) {
        l.f(charSequence, "text");
        throw null;
    }
}
