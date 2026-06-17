package com.obric.oui.lisitem;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OListItemCheck extends OListItemGeneral {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OListItemCheck(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        setTrailingImageView(getResources().getDrawable(C0838R.drawable.o_ic_radio_tick_checked));
        o().setVisibility(8);
    }

    public final void setChecked(boolean z) {
        o().setVisibility(z ? 0 : 8);
    }

    public final void setCheckedIconLight(boolean z) {
    }

    public final void setTitle(String str) {
        l.f(str, "str");
        setTitleString(str);
    }
}
