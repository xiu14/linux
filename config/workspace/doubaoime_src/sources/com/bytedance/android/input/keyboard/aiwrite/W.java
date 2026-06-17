package com.bytedance.android.input.keyboard.aiwrite;

import com.obric.oui.segmentedtab.OTabSegmentedLayout;
import com.obric.oui.text.OTextView;

/* loaded from: classes.dex */
final class W extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
    final /* synthetic */ MenuView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W(MenuView menuView) {
        super(1);
        this.a = menuView;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Boolean bool) {
        OTextView oTextView;
        OTabSegmentedLayout oTabSegmentedLayout;
        OTextView oTextView2;
        OTabSegmentedLayout oTabSegmentedLayout2;
        Boolean bool2 = bool;
        String str = this.a.a;
        StringBuilder M = e.a.a.a.a.M("initMenuTabButtons editable = ");
        M.append(this.a);
        com.bytedance.android.input.r.j.i(str, M.toString());
        kotlin.s.c.l.e(bool2, "it");
        if (bool2.booleanValue()) {
            oTextView2 = this.a.f2606e;
            if (oTextView2 != null) {
                oTextView2.setVisibility(8);
            }
            oTabSegmentedLayout2 = this.a.f2605d;
            if (oTabSegmentedLayout2 != null) {
                oTabSegmentedLayout2.setVisibility(0);
            }
        } else {
            oTextView = this.a.f2606e;
            if (oTextView != null) {
                oTextView.setVisibility(0);
            }
            oTabSegmentedLayout = this.a.f2605d;
            if (oTabSegmentedLayout != null) {
                oTabSegmentedLayout.setVisibility(8);
            }
        }
        MenuView.e(this.a);
        return kotlin.o.a;
    }
}
