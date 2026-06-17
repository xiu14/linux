package com.bytedance.android.input.keyboard.aichat;

import android.widget.LinearLayout;
import com.bytedance.android.input.keyboard.aichat.AiChatMenuViewModel;
import com.bytedance.android.input.q.z;
import com.obric.oui.text.OTextView;

/* loaded from: classes.dex */
final class o extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
    final /* synthetic */ AiChatMenuView a;
    final /* synthetic */ LinearLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(AiChatMenuView aiChatMenuView, LinearLayout linearLayout) {
        super(1);
        this.a = aiChatMenuView;
        this.b = linearLayout;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Boolean bool) {
        OTextView oTextView;
        Boolean bool2 = bool;
        Integer value = AiChatMenuViewModel.a.b().getValue();
        AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_CHAT;
        if (value != null && value.intValue() == 0) {
            com.bytedance.android.input.r.j.i(this.a.a, "streamEnd = " + bool2);
            kotlin.s.c.l.e(bool2, "end");
            if (bool2.booleanValue() && this.b.getChildCount() > 2) {
                oTextView = this.a.r;
                if (oTextView == null) {
                    kotlin.s.c.l.l("mChatPageLoadMore");
                    throw null;
                }
                com.obric.oui.common.util.b.i(oTextView, true);
                AiChatMenuView.l(this.a);
                String str = this.a.a;
                StringBuilder M = e.a.a.a.a.M("show load more. childcnt: ");
                M.append(this.b.getChildCount());
                M.append(", isLastChatItemVisible: ");
                M.append(AiChatMenuView.l(this.a));
                com.bytedance.android.input.r.j.i(str, M.toString());
                if (this.b.getChildCount() <= 4 && AiChatMenuView.l(this.a)) {
                    com.bytedance.android.input.r.j.i(this.a.a, "setStreamEnd false, begin load more");
                    AichatDetailViewModel.a.t(false);
                    this.a.f2536g = true;
                    z.h();
                }
            }
        }
        return kotlin.o.a;
    }
}
