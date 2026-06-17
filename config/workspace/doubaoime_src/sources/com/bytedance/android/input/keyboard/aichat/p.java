package com.bytedance.android.input.keyboard.aichat;

import android.widget.LinearLayout;
import com.bytedance.android.input.keyboard.aichat.AiChatMenuViewModel;
import com.obric.oui.text.OTextView;
import java.util.Map;

/* loaded from: classes.dex */
final class p extends kotlin.s.c.m implements kotlin.s.b.l<String, kotlin.o> {
    final /* synthetic */ AiChatMenuView a;
    final /* synthetic */ LinearLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(AiChatMenuView aiChatMenuView, LinearLayout linearLayout) {
        super(1);
        this.a = aiChatMenuView;
        this.b = linearLayout;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(String str) {
        Map map;
        Integer value;
        int i;
        OTextView oTextView;
        LinearLayout linearLayout;
        boolean z;
        LinearLayout linearLayout2;
        int i2;
        OTextView oTextView2;
        String str2 = str;
        e.a.a.a.a.r0("AiChatDetailViewModel textDetail observer, textReplyAll=", str2, this.a.a);
        if (com.obric.oui.common.util.b.e(this.a)) {
            map = this.a.b;
            AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_CHAT;
            LinearLayout linearLayout3 = (LinearLayout) map.get(0);
            if ((linearLayout3 != null && com.obric.oui.common.util.b.e(linearLayout3)) && (value = AiChatMenuViewModel.a.b().getValue()) != null && value.intValue() == 0) {
                int length = str2.length();
                i = this.a.f2534e;
                if (length != i) {
                    this.a.f2535f = false;
                    AichatDetailViewModel aichatDetailViewModel = AichatDetailViewModel.a;
                    if (kotlin.s.c.l.a(aichatDetailViewModel.i().getValue(), Boolean.TRUE)) {
                        com.bytedance.android.input.r.j.i(this.a.a, "change streamEnd from true to false");
                        aichatDetailViewModel.t(false);
                    }
                    oTextView = this.a.r;
                    if (oTextView == null) {
                        kotlin.s.c.l.l("mChatPageLoadMore");
                        throw null;
                    }
                    if (oTextView.getVisibility() == 0) {
                        oTextView2 = this.a.r;
                        if (oTextView2 == null) {
                            kotlin.s.c.l.l("mChatPageLoadMore");
                            throw null;
                        }
                        com.obric.oui.common.util.b.i(oTextView2, false);
                        com.bytedance.android.input.r.j.i(this.a.a, "hide load more");
                    }
                    kotlin.s.c.l.e(str2, "textReplyAll");
                    if ((str2.length() > 0) && this.b.getChildCount() == 1) {
                        com.bytedance.android.input.r.j.i(this.a.a, "textReplyAll=" + str2 + ", childCount=1, need addNewChatItem");
                        AiChatMenuView.a(this.a);
                        this.a.f2536g = false;
                        AiChatMenuView.o(this.a, str2);
                    } else {
                        linearLayout = this.a.q;
                        if (linearLayout == null) {
                            kotlin.s.c.l.l("mChatPage");
                            throw null;
                        }
                        if (linearLayout.getChildCount() >= 2) {
                            if (!(str2.length() == 0)) {
                                z = this.a.f2536g;
                                if (z) {
                                    com.bytedance.android.input.r.j.i(this.a.a, "textReplyAll=" + str2 + ", mNeedAddNewItem=true");
                                    this.a.f2536g = false;
                                    AiChatMenuView.a(this.a);
                                }
                                linearLayout2 = this.a.q;
                                if (linearLayout2 == null) {
                                    kotlin.s.c.l.l("mChatPage");
                                    throw null;
                                }
                                e.a.a.a.a.j0("itemCount = ", linearLayout2.getChildCount(), this.a.a);
                                String str3 = this.a.a;
                                StringBuilder M = e.a.a.a.a.M("mLastReplyLength = ");
                                i2 = this.a.f2534e;
                                M.append(i2);
                                M.append(", textReplyAll length = ");
                                M.append(str2.length());
                                com.bytedance.android.input.r.j.i(str3, M.toString());
                                AiChatMenuView.o(this.a, str2);
                            }
                        }
                    }
                }
            }
        }
        return kotlin.o.a;
    }
}
